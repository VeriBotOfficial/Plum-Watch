package com.huawei.hms.scankit.p;

import android.hardware.Camera;
import java.util.HashSet;
import java.util.Set;

/* JADX INFO: renamed from: com.huawei.hms.scankit.p.l, reason: case insensitive filesystem */
/* JADX INFO: compiled from: CameraFocusManager.java */
/* JADX INFO: loaded from: classes11.dex */
public final class C3766l implements Camera.AutoFocusCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
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
