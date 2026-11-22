package com.qumeng.overseas.advlib.trdparty.unionset.adapter.topon.platform;

import com.qumeng.overseas.advlib.core.AdRequestParam;
import com.qumeng.overseas.advlib.core.QMConfig;
import com.qumeng.overseas.advlib.trdparty.unionset.adapter.topon.adapter.b;
import com.qumeng.overseas.advlib.trdparty.unionset.adapter.topon.adapter.e;
import com.qumeng.overseas.advlib.trdparty.unionset.common.c;
import com.qumeng.overseas.advlib.trdparty.unionset.common.d;
import com.qumeng.overseas.advlib.trdparty.unionset.common.f;
import com.qumeng.overseas.advlib.trdparty.unionset.network.l;
import com.secmtp.sdk.core.api.ATSDK;

/* loaded from: classes17.dex */
public class a extends f {
    private static int f = -1;

    public static boolean g() {
        if (f == -1) {
            f = f.b(ATSDK.class.getName());
        }
        return f == 0;
    }

    @Override // com.qumeng.overseas.advlib.trdparty.unionset.common.f
    protected d b(l lVar, long j) {
        return new com.qumeng.overseas.advlib.trdparty.unionset.adapter.topon.adapter.d(lVar, j);
    }

    @Override // com.qumeng.overseas.advlib.trdparty.unionset.common.f
    protected void c(QMConfig qMConfig, f.a aVar) {
        if (a(qMConfig, aVar)) {
            return;
        }
        e.a(qMConfig.getContext(), a(qMConfig, QMConfig.AppId_TopOn, ""), a(qMConfig, QMConfig.AppKEY_TopOn, ""), qMConfig.isMute(), aVar);
    }

    @Override // com.qumeng.overseas.advlib.trdparty.unionset.common.f
    public boolean e() {
        return true;
    }

    @Override // com.qumeng.overseas.advlib.trdparty.unionset.common.f
    public boolean f() {
        return g();
    }

    @Override // com.qumeng.overseas.advlib.trdparty.unionset.common.f
    protected c b(com.qumeng.overseas.advlib.trdparty.unionset.network.a aVar, AdRequestParam adRequestParam) {
        if (b.b(aVar.c())) {
            return new b(aVar, adRequestParam);
        }
        return null;
    }

    @Override // com.qumeng.overseas.advlib.trdparty.unionset.common.f
    public String b() {
        return com.qumeng.overseas.advlib.trdparty.unionset.network.c.x;
    }

    @Override // com.qumeng.overseas.advlib.trdparty.unionset.common.f
    public String c() {
        try {
            return ATSDK.getSDKVersionName();
        } catch (Throwable unused) {
            return super.c();
        }
    }
}
