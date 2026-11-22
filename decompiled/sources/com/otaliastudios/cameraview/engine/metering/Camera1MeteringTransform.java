package com.otaliastudios.cameraview.engine.metering;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.Camera;
import com.otaliastudios.cameraview.CameraLogger;
import com.otaliastudios.cameraview.engine.offset.Angles;
import com.otaliastudios.cameraview.engine.offset.Axis;
import com.otaliastudios.cameraview.engine.offset.Reference;
import com.otaliastudios.cameraview.metering.MeteringTransform;
import com.otaliastudios.cameraview.size.Size;

/* loaded from: classes17.dex */
public class Camera1MeteringTransform implements MeteringTransform<Camera.Area> {
    private final int displayToSensor;
    private final Size previewSize;
    protected static final String TAG = "Camera1MeteringTransform";
    protected static final CameraLogger LOG = CameraLogger.create(TAG);

    public Camera1MeteringTransform(Angles angles, Size size) {
        this.displayToSensor = -angles.offset(Reference.SENSOR, Reference.VIEW, Axis.ABSOLUTE);
        this.previewSize = size;
    }

    @Override // com.otaliastudios.cameraview.metering.MeteringTransform
    public PointF transformMeteringPoint(PointF pointF) {
        PointF pointF2 = new PointF();
        pointF2.x = ((pointF.x / this.previewSize.getWidth()) * 2000.0f) - 1000.0f;
        pointF2.y = ((pointF.y / this.previewSize.getHeight()) * 2000.0f) - 1000.0f;
        PointF pointF3 = new PointF();
        double d = (this.displayToSensor * 3.141592653589793d) / 180.0d;
        pointF3.x = (float) ((pointF2.x * Math.cos(d)) - (pointF2.y * Math.sin(d)));
        pointF3.y = (float) ((pointF2.x * Math.sin(d)) + (pointF2.y * Math.cos(d)));
        LOG.i("scaled:", pointF2, "rotated:", pointF3);
        return pointF3;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.otaliastudios.cameraview.metering.MeteringTransform
    public Camera.Area transformMeteringRegion(RectF rectF, int i) {
        Rect rect = new Rect();
        rectF.round(rect);
        return new Camera.Area(rect, i);
    }
}
