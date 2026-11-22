package com.huawei.hms.scankit.p;

import android.hardware.Camera;
import android.util.Log;

/* compiled from: CameraExposureManager.java */
/* renamed from: com.huawei.hms.scankit.p.k, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C3019k {

    /* renamed from: a, reason: collision with root package name */
    private Camera f10659a;

    public final synchronized void a(Camera camera) {
        this.f10659a = camera;
    }

    public final synchronized C2987c a() {
        return new C2987c(this.f10659a.getParameters().getMaxExposureCompensation(), this.f10659a.getParameters().getMinExposureCompensation(), this.f10659a.getParameters().getExposureCompensation(), this.f10659a.getParameters().getExposureCompensationStep());
    }

    public final synchronized void a(int i) {
        Camera camera = this.f10659a;
        if (camera == null) {
            return;
        }
        try {
            Camera.Parameters parameters = camera.getParameters();
            parameters.setExposureCompensation(i);
            this.f10659a.setParameters(parameters);
        } catch (RuntimeException unused) {
            Log.w("CameraManager", "CameraExposureManager::setCompensation failed");
        }
    }
}
