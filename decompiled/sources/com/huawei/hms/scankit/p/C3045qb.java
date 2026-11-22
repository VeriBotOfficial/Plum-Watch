package com.huawei.hms.scankit.p;

/* compiled from: HiAnalyticsLogExecutor.java */
/* renamed from: com.huawei.hms.scankit.p.qb, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
class C3045qb extends Thread {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C3048rb f10680a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C3045qb(C3048rb c3048rb, String str) {
        super(str);
        this.f10680a = c3048rb;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        this.f10680a.d();
    }
}
