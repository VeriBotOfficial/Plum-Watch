package com.huawei.hms.scankit.p;

import com.huawei.hms.scankit.aiscan.common.C2967a;

/* compiled from: Binarizer.java */
/* renamed from: com.huawei.hms.scankit.p.v, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public abstract class AbstractC3062v {

    /* renamed from: a, reason: collision with root package name */
    private final com.huawei.hms.scankit.aiscan.common.m f10695a;

    protected AbstractC3062v(com.huawei.hms.scankit.aiscan.common.m mVar) {
        this.f10695a = mVar;
    }

    public abstract AbstractC3062v a(com.huawei.hms.scankit.aiscan.common.m mVar);

    public abstract C3070x a(int i, C3070x c3070x) throws C2967a;

    public abstract C3074y a() throws C2967a;

    public final int b() {
        return this.f10695a.a();
    }

    public final com.huawei.hms.scankit.aiscan.common.m c() {
        return this.f10695a;
    }

    public final int d() {
        return this.f10695a.c();
    }
}
