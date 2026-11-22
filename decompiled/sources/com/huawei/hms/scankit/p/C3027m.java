package com.huawei.hms.scankit.p;

import android.graphics.Rect;
import android.hardware.Camera;
import android.util.Log;
import com.huawei.hms.scankit.p.C2999f;
import java.util.ArrayList;
import java.util.List;

/* compiled from: CameraMeteringManager.java */
/* renamed from: com.huawei.hms.scankit.p.m, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C3027m {

    /* renamed from: a, reason: collision with root package name */
    private Camera f10666a;

    public final synchronized void a(Camera camera) {
        this.f10666a = camera;
    }

    public final synchronized C2999f a() {
        int i;
        RuntimeException e;
        Rect rect;
        try {
            i = this.f10666a.getParameters().getMaxNumMeteringAreas();
        } catch (RuntimeException e2) {
            i = 0;
            e = e2;
        }
        try {
            rect = this.f10666a.getParameters().getMeteringAreas().get(0).rect;
        } catch (RuntimeException e3) {
            e = e3;
            Log.w("CameraManager", "CameraMeteringManager::getCameraMeteringData failed: " + e.getMessage());
            rect = null;
            return new C2999f(i, rect);
        }
        return new C2999f(i, rect);
    }

    public final synchronized void a(List<C2999f.a> list) {
        Camera camera = this.f10666a;
        if (camera == null) {
            return;
        }
        Camera.Parameters parameters = camera.getParameters();
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            arrayList.add(new Camera.Area(list.get(i).f10638a, list.get(i).b));
        }
        parameters.setMeteringAreas(arrayList);
        try {
            this.f10666a.setParameters(parameters);
        } catch (RuntimeException e) {
            Log.w("CameraManager", "CameraMeteringManager::setCameraMeteringArea failed: " + e.getMessage());
        }
    }
}
