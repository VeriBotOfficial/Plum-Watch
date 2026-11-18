package com.otaliastudios.cameraview.metering;

import android.graphics.PointF;
import android.graphics.RectF;

/* JADX INFO: loaded from: classes2.dex */
public interface MeteringTransform<T> {
    PointF transformMeteringPoint(PointF pointF);

    T transformMeteringRegion(RectF rectF, int r2);
}
