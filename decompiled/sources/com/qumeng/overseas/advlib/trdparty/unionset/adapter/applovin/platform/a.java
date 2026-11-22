package com.qumeng.overseas.advlib.trdparty.unionset.adapter.applovin.platform;

import com.applovin.sdk.AppLovinSdk;
import com.qumeng.overseas.advlib.__remote__.core.proto.utils.e;
import com.qumeng.overseas.advlib.core.AdRequestParam;
import com.qumeng.overseas.advlib.core.QMConfig;
import com.qumeng.overseas.advlib.trdparty.unionset.adapter.applovin.adapter.c;
import com.qumeng.overseas.advlib.trdparty.unionset.common.d;
import com.qumeng.overseas.advlib.trdparty.unionset.common.f;
import com.qumeng.overseas.advlib.trdparty.unionset.network.l;

/* loaded from: classes17.dex */
public class a extends f {
    private static int f = -1;

    public static boolean g() {
        if (f == -1) {
            f = f.b(AppLovinSdk.class.getName());
        }
        return f == 0;
    }

    @Override // com.qumeng.overseas.advlib.trdparty.unionset.common.f
    public String a() {
        return AppLovinSdk.getInstance(e.a()).getConfiguration().getCountryCode();
    }

    @Override // com.qumeng.overseas.advlib.trdparty.unionset.common.f
    protected d b(l lVar, long j) {
        return new c(lVar, j);
    }

    @Override // com.qumeng.overseas.advlib.trdparty.unionset.common.f
    protected void c(QMConfig qMConfig, f.a aVar) {
        if (a(qMConfig, aVar)) {
            return;
        }
        com.qumeng.overseas.advlib.trdparty.unionset.adapter.applovin.adapter.d.a(qMConfig.getContext(), qMConfig, aVar);
    }

    @Override // com.qumeng.overseas.advlib.trdparty.unionset.common.f
    public boolean f() {
        return g();
    }

    @Override // com.qumeng.overseas.advlib.trdparty.unionset.common.f
    protected com.qumeng.overseas.advlib.trdparty.unionset.common.c b(com.qumeng.overseas.advlib.trdparty.unionset.network.a aVar, AdRequestParam adRequestParam) {
        if (com.qumeng.overseas.advlib.trdparty.unionset.adapter.applovin.adapter.a.b(aVar.c())) {
            return new com.qumeng.overseas.advlib.trdparty.unionset.adapter.applovin.adapter.a(aVar, adRequestParam);
        }
        return null;
    }

    @Override // com.qumeng.overseas.advlib.trdparty.unionset.common.f
    public String b() {
        return com.qumeng.overseas.advlib.trdparty.unionset.network.c.w;
    }

    @Override // com.qumeng.overseas.advlib.trdparty.unionset.common.f
    public String c() {
        try {
            return AppLovinSdk.VERSION;
        } catch (Throwable unused) {
            return super.c();
        }
    }
}
