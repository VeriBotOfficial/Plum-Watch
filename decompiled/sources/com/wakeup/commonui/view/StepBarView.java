package com.wakeup.commonui.view;

import android.content.Context;
import android.gov.nist.javax.sip.parser.TokenNames;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import androidx.exifinterface.media.ExifInterface;
import com.wakeup.commonui.utils.DrawTextUtils;
import com.wakeup.commonui.utils.UIHelper;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: StepBarView.kt */
@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001+B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ(\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0007H\u0014J\u0010\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020#H\u0014J\u0010\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020'H\u0002J\u0014\u0010(\u001a\u00020\u001c2\f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00180*R\u000e\u0010\n\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0007X\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u001aX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006,"}, d2 = {"Lcom/wakeup/commonui/view/StepBarView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "style", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "mViewWidth", "mViewHeight", "barPaint", "Landroid/graphics/Paint;", "textPaint", "bgColor", "textColor", "barColor", "barWidth", "barHeight", "dp4", "barCount", "dataList", "", "Lcom/wakeup/commonui/view/StepBarView$Entity;", "spacing", "", "onSizeChanged", "", "w", "h", "oldw", "oldh", "onDraw", "canvas", "Landroid/graphics/Canvas;", "getWeekOfDate", "", "time", "", "setData", "list", "", "Entity", "commonui_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class StepBarView extends View {
    private int barColor;
    private final int barCount;
    private int barHeight;
    private final Paint barPaint;
    private int barWidth;
    private int bgColor;
    private final List<Entity> dataList;
    private int dp4;
    private int mViewHeight;
    private int mViewWidth;
    private float spacing;
    private int textColor;
    private final Paint textPaint;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StepBarView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public StepBarView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ StepBarView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? -1 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public StepBarView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint(1);
        this.barPaint = paint;
        Paint paint2 = new Paint(1);
        this.textPaint = paint2;
        this.bgColor = Color.parseColor("#EEEEEE");
        this.textColor = Color.parseColor("#333333");
        this.barColor = Color.parseColor("#4093FF");
        this.barWidth = UIHelper.dp2px(6.0f);
        this.barHeight = UIHelper.dp2px(30.0f);
        this.dp4 = UIHelper.dp2px(4.0f);
        this.barCount = 7;
        this.dataList = new ArrayList();
        paint.setStyle(Paint.Style.FILL);
        paint.setStrokeWidth(this.barWidth);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint2.setTextSize(UIHelper.dp2px(9.0f));
        paint2.setColor(this.textColor);
    }

    @Override // android.view.View
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.mViewWidth = w;
        this.mViewHeight = h;
        this.spacing = ((w - (this.barCount * r2)) / 6.0f) + this.barWidth;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        Iterator<T> it = this.dataList.iterator();
        if (!it.hasNext()) {
            throw new NoSuchElementException();
        }
        float value = ((Entity) it.next()).getValue();
        while (it.hasNext()) {
            value = Math.max(value, ((Entity) it.next()).getValue());
        }
        if (value <= 0.0f) {
            value = 100.0f;
        }
        float f = this.barWidth / 2.0f;
        float f2 = this.barHeight - f;
        int size = this.dataList.size();
        int i = 0;
        while (i < size) {
            float f3 = f + (this.spacing * i);
            this.barPaint.setColor(this.bgColor);
            Canvas canvas2 = canvas;
            canvas2.drawLine(f3, f, f3, f2, this.barPaint);
            Entity entity = this.dataList.get(i);
            if (entity.getValue() > 0.0f) {
                this.barPaint.setColor(this.barColor);
                float f4 = f2;
                canvas2.drawLine(f3, f + (f2 - ((entity.getValue() / value) * f2)), f3, f4, this.barPaint);
                f2 = f4;
            }
            String weekOfDate = getWeekOfDate(entity.getTime());
            canvas2.drawText(weekOfDate, f3 - (DrawTextUtils.getTextWidth(weekOfDate, this.textPaint) / 2), this.dp4 + f2 + DrawTextUtils.getTextHeight(this.textPaint), this.textPaint);
            i++;
            canvas = canvas2;
        }
    }

    private final String getWeekOfDate(long time) {
        String[] strArr = {"S", "M", "T", ExifInterface.LONGITUDE_WEST, "T", TokenNames.F, "S"};
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time * 1000);
        int i = calendar.get(7) - 1;
        return strArr[i >= 0 ? i : 0];
    }

    public final void setData(List<Entity> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.dataList.clear();
        this.dataList.addAll(list);
    }

    /* compiled from: StepBarView.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\t\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/wakeup/commonui/view/StepBarView$Entity;", "", "value", "", "time", "", "<init>", "(FJ)V", "getValue", "()F", "getTime", "()J", "commonui_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Entity {
        private final long time;
        private final float value;

        public Entity(float f, long j) {
            this.value = f;
            this.time = j;
        }

        public final long getTime() {
            return this.time;
        }

        public final float getValue() {
            return this.value;
        }
    }
}
