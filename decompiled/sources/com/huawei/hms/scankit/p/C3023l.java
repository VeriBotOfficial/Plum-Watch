package com.huawei.hms.scankit.p;

import android.hardware.Camera;
import java.util.HashSet;
import java.util.Set;

/* compiled from: CameraFocusManager.java */
/* renamed from: com.huawei.hms.scankit.p.l, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C3023l implements Camera.AutoFocusCallback {

    /* renamed from: a, reason: collision with root package name */
    private static final Set<String> f10663a;

    static {
        HashSet hashSet = new HashSet();
        f10663a = hashSet;
        hashSet.add("auto");
        hashSet.add("macro");
    }

    final synchronized void a() {
        throw null;
    }
}
