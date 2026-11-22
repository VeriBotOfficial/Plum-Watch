package com.wakeup.commonui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import com.wakeup.commonui.utils.UIHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TemperatureHomeView.kt */
@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\n\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0003\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ(\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u00072\u0006\u0010\u001f\u001a\u00020\u00072\u0006\u0010 \u001a\u00020\u0007H\u0014J\u0010\u0010!\u001a\u00020\u001c2\u0006\u0010\"\u001a\u00020#H\u0014J\u000e\u0010$\u001a\b\u0012\u0004\u0012\u00020\u000e0%H\u0002J\u000e\u0010&\u001a\u00020\u001c2\u0006\u0010'\u001a\u00020\u000eR\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010\u0010\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0015\u001a\u00020\u000e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0014\u001a\u0004\b\u0016\u0010\u0012R\u0014\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0019X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u000eX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lcom/wakeup/commonui/view/TemperatureHomeView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "style", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "paint", "Landroid/graphics/Paint;", "bgPaint", "viewWidth", "", "viewHeight", "paintWidth", "getPaintWidth", "()F", "paintWidth$delegate", "Lkotlin/Lazy;", "paintHeight", "getPaintHeight", "paintHeight$delegate", "array", "", "temperature", "onSizeChanged", "", "w", "h", "oldw", "oldh", "onDraw", "canvas", "Landroid/graphics/Canvas;", "getCurrArray", "", "setTemperature", "float", "commonui_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TemperatureHomeView extends View {
    private List<Float> array;
    private final Paint bgPaint;
    private final Paint paint;

    /* renamed from: paintHeight$delegate, reason: from kotlin metadata */
    private final Lazy paintHeight;

    /* renamed from: paintWidth$delegate, reason: from kotlin metadata */
    private final Lazy paintWidth;
    private float temperature;
    private float viewHeight;
    private float viewWidth;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TemperatureHomeView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TemperatureHomeView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ TemperatureHomeView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? -1 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TemperatureHomeView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint();
        this.paint = paint;
        Paint paint2 = new Paint();
        this.bgPaint = paint2;
        this.paintWidth = LazyKt.lazy(new Function0() { // from class: com.wakeup.commonui.view.TemperatureHomeView$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                float paintWidth_delegate$lambda$0;
                paintWidth_delegate$lambda$0 = TemperatureHomeView.paintWidth_delegate$lambda$0();
                return Float.valueOf(paintWidth_delegate$lambda$0);
            }
        });
        this.paintHeight = LazyKt.lazy(new Function0() { // from class: com.wakeup.commonui.view.TemperatureHomeView$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                float paintHeight_delegate$lambda$1;
                paintHeight_delegate$lambda$1 = TemperatureHomeView.paintHeight_delegate$lambda$1();
                return Float.valueOf(paintHeight_delegate$lambda$1);
            }
        });
        this.array = new ArrayList();
        this.temperature = 35.6f;
        paint2.setStrokeWidth(getPaintWidth());
        paint2.setColor(Color.parseColor("#E6E6E6"));
        paint2.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeWidth(getPaintWidth());
        paint.setColor(Color.parseColor("#78C890"));
        paint.setStrokeCap(Paint.Cap.ROUND);
    }

    private final float getPaintWidth() {
        return ((Number) this.paintWidth.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float paintWidth_delegate$lambda$0() {
        return UIHelper.dp2px(3.0f);
    }

    private final float getPaintHeight() {
        return ((Number) this.paintHeight.getValue()).floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float paintHeight_delegate$lambda$1() {
        return UIHelper.dp2px(2.0f);
    }

    @Override // android.view.View
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.viewWidth = getWidth();
        this.viewHeight = getHeight();
        float paintWidth = (this.viewWidth - (getPaintWidth() * 2)) / 4;
        for (int i = 0; i < 5; i++) {
            this.array.add(Float.valueOf((i * paintWidth) + getPaintWidth()));
        }
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        float paintWidth = this.viewHeight - getPaintWidth();
        float dp2px = paintWidth - UIHelper.dp2px(4.0f);
        float paintHeight = (dp2px - getPaintHeight()) - UIHelper.dp2px(4.0f);
        Iterator<Float> it = this.array.iterator();
        while (it.hasNext()) {
            float floatValue = it.next().floatValue();
            canvas.drawLine(floatValue, dp2px, floatValue, dp2px - getPaintHeight(), this.bgPaint);
            canvas.drawLine(floatValue, paintHeight, floatValue, paintHeight - getPaintHeight(), this.bgPaint);
            dp2px = dp2px;
        }
        float f = dp2px;
        canvas.drawLine(getPaintWidth(), paintWidth, this.viewWidth - getPaintWidth(), paintWidth, this.bgPaint);
        Iterator<Float> it2 = getCurrArray().iterator();
        while (it2.hasNext()) {
            float floatValue2 = it2.next().floatValue();
            canvas.drawLine(floatValue2, f, floatValue2, f - getPaintHeight(), this.paint);
            canvas.drawLine(floatValue2, paintHeight, floatValue2, paintHeight - getPaintHeight(), this.paint);
        }
        float paintWidth2 = (((this.temperature - 35.0f) / 4.0f) * this.viewWidth) + (getPaintWidth() / 2);
        if (this.temperature >= 39.0f) {
            paintWidth2 = this.viewWidth - getPaintWidth();
        }
        canvas.drawLine(getPaintWidth(), paintWidth, paintWidth2, paintWidth, this.paint);
    }

    private final List<Float> getCurrArray() {
        ArrayList arrayList = new ArrayList();
        float f = this.temperature;
        if (f == 39.0f) {
            arrayList.addAll(this.array);
            return arrayList;
        }
        if (f >= 38.0f) {
            arrayList.addAll(this.array.subList(0, r1.size() - 1));
            return arrayList;
        }
        if (f >= 37.0f) {
            arrayList.addAll(this.array.subList(0, r1.size() - 2));
            return arrayList;
        }
        if (f >= 36.0f) {
            arrayList.addAll(this.array.subList(0, r1.size() - 3));
            return arrayList;
        }
        arrayList.add(this.array.get(0));
        return arrayList;
    }

    public final void setTemperature(float r2) {
        this.temperature = r2;
        if (r2 < 35.0f) {
            this.temperature = 35.0f;
        }
        if (this.temperature > 39.0f) {
            this.temperature = 39.0f;
        }
    }
}
