package com.huawei.hms.scankit;

import com.huawei.hms.scankit.p.C2995e;

/* compiled from: PreviewCallback.java */
/* loaded from: classes14.dex */
public class B implements C2995e.d {

    /* renamed from: a, reason: collision with root package name */
    private m f10495a;

    public B(m mVar) {
        this.f10495a = mVar;
    }

    @Override // com.huawei.hms.scankit.p.C2995e.d
    public void a(byte[] bArr) {
        com.huawei.hms.scankit.util.a.a("scan-time", "request frame time:" + System.currentTimeMillis());
        this.f10495a.a().obtainMessage(R.id.scankit_decode, bArr).sendToTarget();
    }
}
