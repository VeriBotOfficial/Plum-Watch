package com.qumeng.overseas.advlib.trdparty.unionset.adapter.applovin.platform.factory;

import com.qumeng.overseas.advlib.__remote__.utils.n;
import com.qumeng.overseas.advlib.trdparty.unionset.common.e;
import com.qumeng.overseas.advlib.trdparty.unionset.common.f;

/* loaded from: classes17.dex */
public class a extends e {
    @Override // com.qumeng.overseas.advlib.trdparty.unionset.common.e
    protected f b() {
        if (!com.qumeng.overseas.advlib.trdparty.unionset.adapter.applovin.platform.a.g()) {
            return null;
        }
        n.a("支持ApplovinSdk", "支持ApplovinSdk--isSupportApplovin：" + com.qumeng.overseas.advlib.trdparty.unionset.adapter.applovin.platform.a.g(), new Object[0]);
        return new com.qumeng.overseas.advlib.trdparty.unionset.adapter.applovin.platform.a();
    }
}
