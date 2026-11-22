package com.wakeup.commonui.view;

import android.content.Context;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.exifinterface.media.ExifInterface;
import com.google.android.gms.ads.RequestConfiguration;
import com.wakeup.commonui.R;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SideBar.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001:\u0001%B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u0007H\u0014J\u0010\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u001b\u001a\u00020\u001cH\u0015J\u0010\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0016J\u000e\u0010!\u001a\u00020\u00172\u0006\u0010\"\u001a\u00020\fJ\u0006\u0010#\u001a\u00020\fJ\u0010\u0010$\u001a\u00020\u00172\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fR\u001e\u0010\n\u001a\u0012\u0012\u0004\u0012\u00020\f0\u000bj\b\u0012\u0004\u0012\u00020\f`\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0012X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lcom/wakeup/commonui/view/SideBar;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "style", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "words", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "onTouchingLetterChangedListener", "Lcom/wakeup/commonui/view/SideBar$OnTouchingLetterChangedListener;", "touchIndex", "wordsPaint", "Landroid/graphics/Paint;", "bgPaint", "itemWidth", "itemHeight", "onMeasure", "", "widthMeasureSpec", "heightMeasureSpec", "onDraw", "canvas", "Landroid/graphics/Canvas;", "dispatchTouchEvent", "", "event", "Landroid/view/MotionEvent;", "setChoose", "word", "getChoose", "setOnTouchingLetterChangedListener", "OnTouchingLetterChangedListener", "commonui_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SideBar extends View {
    private final Paint bgPaint;
    private int itemHeight;
    private int itemWidth;
    private OnTouchingLetterChangedListener onTouchingLetterChangedListener;
    private int touchIndex;
    private ArrayList<String> words;
    private final Paint wordsPaint;

    /* compiled from: SideBar.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&¨\u0006\u0006"}, d2 = {"Lcom/wakeup/commonui/view/SideBar$OnTouchingLetterChangedListener;", "", "onTouchingLetterChanged", "", "s", "", "commonui_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface OnTouchingLetterChangedListener {
        void onTouchingLetterChanged(String s);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SideBar(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SideBar(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SideBar(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? -1 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SideBar(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        this.words = CollectionsKt.arrayListOf(ExifInterface.GPS_MEASUREMENT_IN_PROGRESS, "B", TokenNames.C, "D", "E", TokenNames.F, RequestConfiguration.MAX_AD_CONTENT_RATING_G, "H", TokenNames.I, "J", "K", TokenNames.L, "M", "N", "O", "P", "Q", TokenNames.R, "S", "T", TokenNames.U, "V", ExifInterface.LONGITUDE_WEST, TokenNames.X, "Y", "Z");
        Paint paint = new Paint();
        this.wordsPaint = paint;
        Paint paint2 = new Paint();
        this.bgPaint = paint2;
        paint.setTypeface(Typeface.DEFAULT_BOLD);
        paint.setAntiAlias(true);
        paint.setTextSize(30.0f);
        paint.setTextAlign(Paint.Align.CENTER);
        paint2.setTypeface(Typeface.DEFAULT_BOLD);
        paint2.setColor(ContextCompat.getColor(context, R.color.color_333333));
        paint2.setStyle(Paint.Style.FILL);
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        this.itemWidth = getMeasuredWidth();
        this.itemHeight = (getMeasuredHeight() - 10) / this.words.size();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        int size = this.words.size();
        for (int i = 0; i < size; i++) {
            if (this.touchIndex == i) {
                float f = this.itemWidth / 2;
                int i2 = this.itemHeight;
                canvas.drawCircle(f, (i2 / 2) + (i2 * i), 23.0f, this.bgPaint);
                this.wordsPaint.setColor(-1);
            } else {
                this.wordsPaint.setColor(-7829368);
            }
            Rect rect = new Rect();
            this.wordsPaint.getTextBounds(this.words.get(i), 0, 1, rect);
            rect.height();
            float f2 = this.itemWidth / 2;
            int i3 = this.itemHeight;
            canvas.drawText(this.words.get(i), f2, (i3 / 2) + (i3 * i) + 11, this.wordsPaint);
        }
    }

    @Override // android.view.View
    public boolean dispatchTouchEvent(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        float y = event.getY();
        int height = (int) ((y / getHeight()) * this.words.size());
        if (this.touchIndex == height || height < 0 || height >= this.words.size()) {
            return true;
        }
        OnTouchingLetterChangedListener onTouchingLetterChangedListener = this.onTouchingLetterChangedListener;
        if (onTouchingLetterChangedListener != null) {
            String str = this.words.get(height);
            Intrinsics.checkNotNullExpressionValue(str, "get(...)");
            onTouchingLetterChangedListener.onTouchingLetterChanged(str);
        }
        this.touchIndex = height;
        invalidate();
        return true;
    }

    public final void setChoose(String word) {
        Intrinsics.checkNotNullParameter(word, "word");
        Iterator<String> it = this.words.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (Intrinsics.areEqual(it.next(), word)) {
                break;
            } else {
                i++;
            }
        }
        if (i != this.touchIndex) {
            this.touchIndex = i;
            invalidate();
        }
    }

    public final String getChoose() {
        String str = this.words.get(this.touchIndex);
        Intrinsics.checkNotNullExpressionValue(str, "get(...)");
        return str;
    }

    public final void setOnTouchingLetterChangedListener(OnTouchingLetterChangedListener onTouchingLetterChangedListener) {
        this.onTouchingLetterChangedListener = onTouchingLetterChangedListener;
    }
}
