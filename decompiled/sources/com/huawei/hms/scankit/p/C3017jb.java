package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.p.C3013ib;
import java.util.TimerTask;

/* compiled from: HaLog60001.java */
/* renamed from: com.huawei.hms.scankit.p.jb, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
class C3017jb extends TimerTask {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C3013ib.b f10657a;

    C3017jb(C3013ib.b bVar) {
        this.f10657a = bVar;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public void run() {
        String str;
        try {
            this.f10657a.c = true;
            this.f10657a.a();
        } catch (Exception unused) {
            str = this.f10657a.f10651a;
            com.huawei.hms.scankit.util.a.b(str, "onLog Exception");
        }
    }
}
