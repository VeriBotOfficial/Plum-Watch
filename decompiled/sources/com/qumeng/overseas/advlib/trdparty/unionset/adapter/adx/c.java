package com.qumeng.overseas.advlib.trdparty.unionset.adapter.adx;

import com.qumeng.overseas.advlib.core.AdRequestParam;
import com.qumeng.overseas.advlib.core.QMConfig;
import com.qumeng.overseas.advlib.trdparty.unionset.common.f;
import com.qumeng.overseas.advlib.trdparty.unionset.network.l;

/* loaded from: classes17.dex */
public class c extends com.qumeng.overseas.advlib.trdparty.unionset.common.f {
    @Override // com.qumeng.overseas.advlib.trdparty.unionset.common.f
    public String a() {
        com.qumeng.overseas.advlib.__remote__.framework.config.a.k();
        return String.valueOf(com.qumeng.overseas.advlib.__remote__.framework.config.a.e());
    }

    @Override // com.qumeng.overseas.advlib.trdparty.unionset.common.f
    protected com.qumeng.overseas.advlib.trdparty.unionset.common.d b(l lVar, long j) {
        return new d(lVar, j);
    }

    @Override // com.qumeng.overseas.advlib.trdparty.unionset.common.f
    protected void c(QMConfig qMConfig, f.a aVar) {
        if (aVar != null) {
            aVar.onSdkInitCompleted();
        }
    }

    @Override // com.qumeng.overseas.advlib.trdparty.unionset.common.f
    public boolean e() {
        return false;
    }

    @Override // com.qumeng.overseas.advlib.trdparty.unionset.common.f
    public boolean f() {
        return true;
    }

    @Override // com.qumeng.overseas.advlib.trdparty.unionset.common.f
    protected com.qumeng.overseas.advlib.trdparty.unionset.common.c b(com.qumeng.overseas.advlib.trdparty.unionset.network.a aVar, AdRequestParam adRequestParam) {
        if (a.b(aVar.c())) {
            return new a(aVar, adRequestParam);
        }
        return null;
    }

    @Override // com.qumeng.overseas.advlib.trdparty.unionset.common.f
    public String c() {
        return "1.049";
    }

    @Override // com.qumeng.overseas.advlib.trdparty.unionset.common.f
    public String b() {
        return com.qumeng.overseas.advlib.trdparty.unionset.network.c.o;
    }
}
