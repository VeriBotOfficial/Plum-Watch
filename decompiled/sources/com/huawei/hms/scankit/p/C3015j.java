package com.huawei.hms.scankit.p;

import android.graphics.Point;
import android.hardware.Camera;
import android.util.Log;
import java.util.List;
import kotlinx.coroutines.DebugKt;

/* compiled from: CameraConfigImpl.java */
/* renamed from: com.huawei.hms.scankit.p.j, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C3015j {

    /* renamed from: a, reason: collision with root package name */
    private C2983b f10655a;
    Point b;
    private Point c;

    final void a(Camera camera, C2983b c2983b) {
        if (camera == null || c2983b == null) {
            throw new IllegalArgumentException("initCameraParameters param is invalid");
        }
        Camera.Parameters parameters = camera.getParameters();
        this.f10655a = c2983b;
        this.b = a(parameters, c2983b.a(), false);
        Log.d("CameraManager", "initCameraParameters previewCameraSize: " + this.b.toString());
        if (c2983b.c() == 0) {
            this.c = a(parameters, c2983b.a(), true);
            Log.d("CameraManager", "initCameraParameters pictureCameraSize: " + this.c.toString());
        }
        Point point = this.b;
        Point point2 = this.c;
        if (this.f10655a != null) {
            Camera.Parameters parameters2 = camera.getParameters();
            parameters2.setPreviewSize(point.x, point.y);
            if (this.f10655a.c() == 0) {
                parameters2.setPictureSize(point2.x, point2.y);
            }
            C2983b c2983b2 = this.f10655a;
            if (c2983b2 != null) {
                String f = c2983b2.f();
                if (!f.equals(DebugKt.DEBUG_PROPERTY_VALUE_OFF) && !f.equals("torch")) {
                    f = DebugKt.DEBUG_PROPERTY_VALUE_OFF;
                }
                parameters2.setFlashMode(f);
            }
            a(parameters2);
            if (parameters2.isZoomSupported()) {
                parameters2.setZoom(1);
            } else {
                Log.w("CameraManager", "initCameraParameters::setDefaultZoom not support zoom");
            }
            if (this.f10655a.e()) {
                parameters2.setRecordingHint(true);
            }
            camera.setParameters(parameters2);
        }
    }

    private static Point a(Camera.Parameters parameters, Point point, boolean z) {
        List<Camera.Size> supportedPictureSizes;
        if (!z) {
            supportedPictureSizes = parameters.getSupportedPreviewSizes();
        } else {
            supportedPictureSizes = parameters.getSupportedPictureSizes();
        }
        if (supportedPictureSizes != null && !supportedPictureSizes.isEmpty()) {
            return a(supportedPictureSizes, point);
        }
        Log.e("CameraManager", "CameraConfigImpl::findCameraResolution camera not support");
        return new Point(0, 0);
    }

    private static Point a(List<Camera.Size> list, Point point) {
        double d = point.x / point.y;
        int i = 0;
        double d2 = Double.MAX_VALUE;
        int i2 = 0;
        for (Camera.Size size : list) {
            int i3 = size.width;
            int i4 = size.height;
            if (i3 == point.x && i4 == point.y) {
                return new Point(i3, i4);
            }
            if (i3 * i4 >= 153600.0d) {
                double d3 = (i3 / i4) - d;
                if (Math.abs(d3) < d2) {
                    d2 = Math.abs(d3);
                    i2 = i4;
                    i = i3;
                }
            }
        }
        return new Point(i, i2);
    }

    private static void a(Camera.Parameters parameters) {
        String str;
        int i = 0;
        String[] strArr = {"continuous-picture", "continuous-video", "auto"};
        List<String> supportedFocusModes = parameters.getSupportedFocusModes();
        if (supportedFocusModes == null) {
            Log.w("CameraManager", "setFocusMode failed, use default");
            return;
        }
        while (true) {
            if (i >= 3) {
                str = null;
                break;
            }
            str = strArr[i];
            if (supportedFocusModes.contains(str)) {
                break;
            } else {
                i++;
            }
        }
        if (str != null) {
            Log.i("CameraManager", "setFocusMode: ".concat(String.valueOf(str)));
            parameters.setFocusMode(str);
        }
    }
}
