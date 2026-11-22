package com.otaliastudios.cameraview.metering;

import android.graphics.PointF;
import android.graphics.RectF;
import com.otaliastudios.cameraview.size.Size;

/* loaded from: classes17.dex */
class MeteringRegion implements Comparable<MeteringRegion> {
    static final int MAX_WEIGHT = 1000;
    final RectF mRegion;
    final int mWeight;

    MeteringRegion(RectF rectF, int i) {
        this.mRegion = rectF;
        this.mWeight = i;
    }

    MeteringRegion transform(MeteringTransform meteringTransform) {
        RectF rectF = new RectF(Float.MAX_VALUE, Float.MAX_VALUE, -3.4028235E38f, -3.4028235E38f);
        PointF pointF = new PointF();
        pointF.set(this.mRegion.left, this.mRegion.top);
        PointF transformMeteringPoint = meteringTransform.transformMeteringPoint(pointF);
        updateRect(rectF, transformMeteringPoint);
        transformMeteringPoint.set(this.mRegion.right, this.mRegion.top);
        PointF transformMeteringPoint2 = meteringTransform.transformMeteringPoint(transformMeteringPoint);
        updateRect(rectF, transformMeteringPoint2);
        transformMeteringPoint2.set(this.mRegion.right, this.mRegion.bottom);
        PointF transformMeteringPoint3 = meteringTransform.transformMeteringPoint(transformMeteringPoint2);
        updateRect(rectF, transformMeteringPoint3);
        transformMeteringPoint3.set(this.mRegion.left, this.mRegion.bottom);
        updateRect(rectF, meteringTransform.transformMeteringPoint(transformMeteringPoint3));
        return new MeteringRegion(rectF, this.mWeight);
    }

    private void updateRect(RectF rectF, PointF pointF) {
        rectF.left = Math.min(rectF.left, pointF.x);
        rectF.top = Math.min(rectF.top, pointF.y);
        rectF.right = Math.max(rectF.right, pointF.x);
        rectF.bottom = Math.max(rectF.bottom, pointF.y);
    }

    MeteringRegion clip(Size size) {
        return clip(new RectF(0.0f, 0.0f, size.getWidth(), size.getHeight()));
    }

    MeteringRegion clip(RectF rectF) {
        RectF rectF2 = new RectF();
        rectF2.set(Math.max(rectF.left, this.mRegion.left), Math.max(rectF.top, this.mRegion.top), Math.min(rectF.right, this.mRegion.right), Math.min(rectF.bottom, this.mRegion.bottom));
        return new MeteringRegion(rectF2, this.mWeight);
    }

    @Override // java.lang.Comparable
    public int compareTo(MeteringRegion meteringRegion) {
        return -Integer.valueOf(this.mWeight).compareTo(Integer.valueOf(meteringRegion.mWeight));
    }
}
