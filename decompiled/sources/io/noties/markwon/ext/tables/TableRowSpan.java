package io.noties.markwon.ext.tables;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import io.noties.markwon.core.spans.TextLayoutSpan;
import io.noties.markwon.image.AsyncDrawable;
import io.noties.markwon.image.AsyncDrawableSpan;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes6.dex */
public class TableRowSpan extends ReplacementSpan {
    public static final int ALIGN_CENTER = 1;
    public static final int ALIGN_LEFT = 0;
    public static final int ALIGN_RIGHT = 2;
    private final List<Cell> cells;
    private final boolean header;
    private int height;
    private Invalidator invalidator;
    private final List<Layout> layouts;
    private final boolean odd;
    private final TableTheme theme;
    private int width;
    private final Rect rect = new Rect();
    private final Paint paint = new Paint(1);
    private final TextPaint textPaint = new TextPaint();

    @Retention(RetentionPolicy.SOURCE)
    public @interface Alignment {
    }

    public interface Invalidator {
        void invalidate();
    }

    public static class Cell {
        final int alignment;
        final CharSequence text;

        public Cell(int i, CharSequence charSequence) {
            this.alignment = i;
            this.text = charSequence;
        }

        public int alignment() {
            return this.alignment;
        }

        public CharSequence text() {
            return this.text;
        }

        public String toString() {
            return "Cell{alignment=" + this.alignment + ", text=" + ((Object) this.text) + AbstractJsonLexerKt.END_OBJ;
        }
    }

    public TableRowSpan(TableTheme tableTheme, List<Cell> list, boolean z, boolean z2) {
        this.theme = tableTheme;
        this.cells = list;
        this.layouts = new ArrayList(list.size());
        this.header = z;
        this.odd = z2;
    }

    @Override // android.text.style.ReplacementSpan
    public int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
        if (this.layouts.size() > 0 && fontMetricsInt != null) {
            Iterator<Layout> it = this.layouts.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                int height = it.next().getHeight();
                if (height > i3) {
                    i3 = height;
                }
            }
            this.height = i3;
            fontMetricsInt.ascent = -(i3 + (this.theme.tableCellPadding() * 2));
            fontMetricsInt.descent = 0;
            fontMetricsInt.top = fontMetricsInt.ascent;
            fontMetricsInt.bottom = 0;
        }
        return this.width;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x016c A[Catch: all -> 0x017e, TRY_LEAVE, TryCatch #1 {all -> 0x017e, blocks: (B:37:0x0123, B:40:0x012a, B:41:0x013a, B:43:0x0145, B:44:0x015c, B:46:0x016c, B:50:0x0132), top: B:36:0x0123 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0170 A[SYNTHETIC] */
    @Override // android.text.style.ReplacementSpan
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void draw(android.graphics.Canvas r20, java.lang.CharSequence r21, int r22, int r23, float r24, int r25, int r26, int r27, android.graphics.Paint r28) {
        /*
            Method dump skipped, instructions count: 399
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.noties.markwon.ext.tables.TableRowSpan.draw(android.graphics.Canvas, java.lang.CharSequence, int, int, float, int, int, int, android.graphics.Paint):void");
    }

    private boolean recreateLayouts(int i) {
        return this.width != i;
    }

    private void makeNewLayouts() {
        this.textPaint.setFakeBoldText(this.header);
        int size = this.cells.size();
        int cellWidth = cellWidth(size) - (this.theme.tableCellPadding() * 2);
        this.layouts.clear();
        int size2 = this.cells.size();
        for (int i = 0; i < size2; i++) {
            makeLayout(i, cellWidth, this.cells.get(i));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void makeLayout(final int i, final int i2, final Cell cell) {
        Spannable spannableString;
        Runnable runnable = new Runnable() { // from class: io.noties.markwon.ext.tables.TableRowSpan.1
            @Override // java.lang.Runnable
            public void run() {
                Invalidator invalidator = TableRowSpan.this.invalidator;
                if (invalidator != null) {
                    TableRowSpan.this.layouts.remove(i);
                    TableRowSpan.this.makeLayout(i, i2, cell);
                    invalidator.invalidate();
                }
            }
        };
        if (cell.text instanceof Spannable) {
            spannableString = (Spannable) cell.text;
        } else {
            spannableString = new SpannableString(cell.text);
        }
        Spannable spannable = spannableString;
        StaticLayout staticLayout = new StaticLayout(spannable, this.textPaint, i2, alignment(cell.alignment), 1.0f, 0.0f, false);
        TextLayoutSpan.applyTo(spannable, staticLayout);
        scheduleAsyncDrawables(spannable, runnable);
        this.layouts.add(i, staticLayout);
    }

    private void scheduleAsyncDrawables(Spannable spannable, final Runnable runnable) {
        AsyncDrawableSpan[] asyncDrawableSpanArr = (AsyncDrawableSpan[]) spannable.getSpans(0, spannable.length(), AsyncDrawableSpan.class);
        if (asyncDrawableSpanArr == null || asyncDrawableSpanArr.length <= 0) {
            return;
        }
        for (AsyncDrawableSpan asyncDrawableSpan : asyncDrawableSpanArr) {
            AsyncDrawable drawable = asyncDrawableSpan.getDrawable();
            if (!drawable.isAttached()) {
                drawable.setCallback2(new CallbackAdapter() { // from class: io.noties.markwon.ext.tables.TableRowSpan.2
                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    {
                        super();
                    }

                    @Override // io.noties.markwon.ext.tables.TableRowSpan.CallbackAdapter, android.graphics.drawable.Drawable.Callback
                    public void invalidateDrawable(Drawable drawable2) {
                        runnable.run();
                    }
                });
            }
        }
    }

    public Layout findLayoutForHorizontalOffset(int i) {
        int size = this.layouts.size();
        int cellWidth = i / cellWidth(size);
        if (cellWidth >= size) {
            return null;
        }
        return this.layouts.get(cellWidth);
    }

    public int cellWidth() {
        return cellWidth(this.layouts.size());
    }

    protected int cellWidth(int i) {
        return (int) (((this.width * 1.0f) / i) + 0.5f);
    }

    private static Layout.Alignment alignment(int i) {
        if (i == 1) {
            return Layout.Alignment.ALIGN_CENTER;
        }
        if (i == 2) {
            return Layout.Alignment.ALIGN_OPPOSITE;
        }
        return Layout.Alignment.ALIGN_NORMAL;
    }

    public void invalidator(Invalidator invalidator) {
        this.invalidator = invalidator;
    }

    private static abstract class CallbackAdapter implements Drawable.Callback {
        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        }

        private CallbackAdapter() {
        }
    }
}
