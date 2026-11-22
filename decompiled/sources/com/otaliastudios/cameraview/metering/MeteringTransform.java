package com.otaliastudios.cameraview.metering;

import android.graphics.PointF;
import android.graphics.RectF;

/* loaded from: classes17.dex */
public interface MeteringTransform<T> {
    PointF transformMeteringPoint(PointF pointF);

    T transformMeteringRegion(RectF rectF, int i);
}
