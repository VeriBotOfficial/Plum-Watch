package com.huawei.hms.scankit.p;

import android.hardware.Camera;
import android.util.Log;

/* compiled from: CameraZoomManager.java */
/* renamed from: com.huawei.hms.scankit.p.n, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C3031n {

    /* renamed from: a, reason: collision with root package name */
    private Camera f10670a;

    public final synchronized void a(Camera camera) {
        this.f10670a = camera;
    }

    public final synchronized boolean b() {
        Camera camera = this.f10670a;
        if (camera == null) {
            return false;
        }
        return camera.getParameters().isZoomSupported();
    }

    public final synchronized C3003g a() {
        return new C3003g(this.f10670a.getParameters().getMaxZoom(), this.f10670a.getParameters().getZoom(), this.f10670a.getParameters().getZoomRatios());
    }

    public final synchronized void a(int i) {
        Camera camera = this.f10670a;
        if (camera == null) {
            return;
        }
        Camera.Parameters parameters = camera.getParameters();
        parameters.setZoom(i);
        try {
            this.f10670a.setParameters(parameters);
        } catch (RuntimeException e) {
            Log.e("CameraManager", "CameraZoomManager::setCameraZoomIndex failed: " + e.getMessage());
        }
    }
}
