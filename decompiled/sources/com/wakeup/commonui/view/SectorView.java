package com.wakeup.commonui.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.view.View;
import com.wakeup.commonui.utils.UIHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SectorView.kt */
@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0006\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\"B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ(\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00072\u0006\u0010\u001b\u001a\u00020\u0007H\u0014J\u0010\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u001d\u001a\u00020\u001eH\u0014J\u0014\u0010\u001f\u001a\u00020\u00172\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00150!R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\rX\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006#"}, d2 = {"Lcom/wakeup/commonui/view/SectorView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "style", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "paint", "Landroid/graphics/Paint;", "lineWidth", "", "mViewWidth", "mViewHeight", "startAngle", "totalAngle", "gapAngle", "datas", "", "Lcom/wakeup/commonui/view/SectorView$Bean;", "onSizeChanged", "", "w", "h", "oldw", "oldh", "onDraw", "canvas", "Landroid/graphics/Canvas;", "setData", "list", "", "Bean", "commonui_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SectorView extends View {
    private final List<Bean> datas;
    private final float gapAngle;
    private float lineWidth;
    private int mViewHeight;
    private int mViewWidth;
    private final Paint paint;
    private final float startAngle;
    private float totalAngle;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SectorView(Context context) {
        this(context, null, 0, 6, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public SectorView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    public /* synthetic */ SectorView(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? -1 : i);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SectorView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        Intrinsics.checkNotNullParameter(context, "context");
        Paint paint = new Paint(1);
        this.paint = paint;
        this.lineWidth = UIHelper.dp2px(15.0f);
        this.startAngle = 45.0f;
        this.totalAngle = 360.0f;
        this.gapAngle = 2.0f;
        this.datas = new ArrayList();
        paint.setColor(-16776961);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(this.lineWidth);
    }

    @Override // android.view.View
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        super.onSizeChanged(w, h, oldw, oldh);
        this.mViewWidth = w;
        this.mViewHeight = h;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.onDraw(canvas);
        if (this.datas.isEmpty()) {
            return;
        }
        float f = this.lineWidth;
        float f2 = 2;
        RectF rectF = new RectF(f / f2, f / f2, this.mViewWidth - (f / f2), this.mViewHeight - (f / f2));
        Iterator<T> it = this.datas.iterator();
        float f3 = 0.0f;
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            this.paint.setColor(((Bean) it.next()).getColor());
            float progress = (this.totalAngle / 100.0f) * r1.getProgress();
            Canvas canvas2 = canvas;
            canvas2.drawArc(rectF, this.startAngle + f3, progress, false, this.paint);
            f3 += progress;
            if (i != this.datas.size() - 1) {
                f3 += this.gapAngle;
            }
            canvas = canvas2;
            i = i2;
        }
    }

    public final void setData(List<Bean> list) {
        Intrinsics.checkNotNullParameter(list, "list");
        this.datas.clear();
        List<Bean> list2 = this.datas;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((Bean) obj).getProgress() > 0) {
                arrayList.add(obj);
            }
        }
        list2.addAll(arrayList);
        if (this.datas.size() > 1) {
            this.totalAngle = 360.0f - (this.datas.size() * this.gapAngle);
        } else {
            this.totalAngle = 360.0f;
        }
        invalidate();
    }

    /* compiled from: SectorView.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u000e"}, d2 = {"Lcom/wakeup/commonui/view/SectorView$Bean;", "", "progress", "", "type", "", "color", "<init>", "(ILjava/lang/String;I)V", "getProgress", "()I", "getType", "()Ljava/lang/String;", "getColor", "commonui_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Bean {
        private final int color;
        private final int progress;
        private final String type;

        public Bean(int i, String type, int i2) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.progress = i;
            this.type = type;
            this.color = i2;
        }

        public final int getColor() {
            return this.color;
        }

        public final int getProgress() {
            return this.progress;
        }

        public final String getType() {
            return this.type;
        }
    }
}
