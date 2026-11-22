package com.otaliastudios.cameraview.engine.metering;

import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.hardware.camera2.CameraCharacteristics;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.params.MeteringRectangle;
import com.otaliastudios.cameraview.CameraLogger;
import com.otaliastudios.cameraview.engine.offset.Angles;
import com.otaliastudios.cameraview.engine.offset.Axis;
import com.otaliastudios.cameraview.engine.offset.Reference;
import com.otaliastudios.cameraview.metering.MeteringTransform;
import com.otaliastudios.cameraview.size.AspectRatio;
import com.otaliastudios.cameraview.size.Size;

/* loaded from: classes17.dex */
public class Camera2MeteringTransform implements MeteringTransform<MeteringRectangle> {
    private final Angles angles;
    private final CaptureRequest.Builder builder;
    private final CameraCharacteristics characteristics;
    private final boolean previewIsCropping;
    private final Size previewSize;
    private final Size previewStreamSize;
    protected static final String TAG = "Camera2MeteringTransform";
    protected static final CameraLogger LOG = CameraLogger.create(TAG);

    public Camera2MeteringTransform(Angles angles, Size size, Size size2, boolean z, CameraCharacteristics cameraCharacteristics, CaptureRequest.Builder builder) {
        this.angles = angles;
        this.previewSize = size;
        this.previewStreamSize = size2;
        this.previewIsCropping = z;
        this.characteristics = cameraCharacteristics;
        this.builder = builder;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // com.otaliastudios.cameraview.metering.MeteringTransform
    public MeteringRectangle transformMeteringRegion(RectF rectF, int i) {
        Rect rect = new Rect();
        rectF.round(rect);
        return new MeteringRectangle(rect, i);
    }

    @Override // com.otaliastudios.cameraview.metering.MeteringTransform
    public PointF transformMeteringPoint(PointF pointF) {
        PointF pointF2 = new PointF(pointF.x, pointF.y);
        Size applyActiveArrayCoordinates = applyActiveArrayCoordinates(applyCropRegionCoordinates(applyPreviewToSensorRotation(applyPreviewScale(applyPreviewCropping(this.previewSize, pointF2), pointF2), pointF2), pointF2), pointF2);
        CameraLogger cameraLogger = LOG;
        cameraLogger.i("input:", pointF, "output (before clipping):", pointF2);
        if (pointF2.x < 0.0f) {
            pointF2.x = 0.0f;
        }
        if (pointF2.y < 0.0f) {
            pointF2.y = 0.0f;
        }
        if (pointF2.x > applyActiveArrayCoordinates.getWidth()) {
            pointF2.x = applyActiveArrayCoordinates.getWidth();
        }
        if (pointF2.y > applyActiveArrayCoordinates.getHeight()) {
            pointF2.y = applyActiveArrayCoordinates.getHeight();
        }
        cameraLogger.i("input:", pointF, "output (after clipping):", pointF2);
        return pointF2;
    }

    private Size applyPreviewCropping(Size size, PointF pointF) {
        Size size2 = this.previewStreamSize;
        int width = size.getWidth();
        int height = size.getHeight();
        AspectRatio of = AspectRatio.of(size2);
        AspectRatio of2 = AspectRatio.of(size);
        if (this.previewIsCropping) {
            if (of.toFloat() > of2.toFloat()) {
                float f = of.toFloat() / of2.toFloat();
                pointF.x += (size.getWidth() * (f - 1.0f)) / 2.0f;
                width = Math.round(size.getWidth() * f);
            } else {
                float f2 = of2.toFloat() / of.toFloat();
                pointF.y += (size.getHeight() * (f2 - 1.0f)) / 2.0f;
                height = Math.round(size.getHeight() * f2);
            }
        }
        return new Size(width, height);
    }

    private Size applyPreviewScale(Size size, PointF pointF) {
        Size size2 = this.previewStreamSize;
        pointF.x *= size2.getWidth() / size.getWidth();
        pointF.y *= size2.getHeight() / size.getHeight();
        return size2;
    }

    private Size applyPreviewToSensorRotation(Size size, PointF pointF) {
        int offset = this.angles.offset(Reference.SENSOR, Reference.VIEW, Axis.ABSOLUTE);
        boolean z = offset % 180 != 0;
        float f = pointF.x;
        float f2 = pointF.y;
        if (offset == 0) {
            pointF.x = f;
            pointF.y = f2;
        } else if (offset == 90) {
            pointF.x = f2;
            pointF.y = size.getWidth() - f;
        } else if (offset == 180) {
            pointF.x = size.getWidth() - f;
            pointF.y = size.getHeight() - f2;
        } else if (offset == 270) {
            pointF.x = size.getHeight() - f2;
            pointF.y = f;
        } else {
            throw new IllegalStateException("Unexpected angle " + offset);
        }
        return z ? size.flip() : size;
    }

    private Size applyCropRegionCoordinates(Size size, PointF pointF) {
        Rect rect = (Rect) this.builder.get(CaptureRequest.SCALER_CROP_REGION);
        int width = rect == null ? size.getWidth() : rect.width();
        int height = rect == null ? size.getHeight() : rect.height();
        pointF.x += (width - size.getWidth()) / 2.0f;
        pointF.y += (height - size.getHeight()) / 2.0f;
        return new Size(width, height);
    }

    private Size applyActiveArrayCoordinates(Size size, PointF pointF) {
        Rect rect = (Rect) this.builder.get(CaptureRequest.SCALER_CROP_REGION);
        pointF.x += rect == null ? 0.0f : rect.left;
        pointF.y += rect != null ? rect.top : 0.0f;
        Rect rect2 = (Rect) this.characteristics.get(CameraCharacteristics.SENSOR_INFO_ACTIVE_ARRAY_SIZE);
        if (rect2 == null) {
            rect2 = new Rect(0, 0, size.getWidth(), size.getHeight());
        }
        return new Size(rect2.width(), rect2.height());
    }
}
