package com.baidu.lbsapi.auth;

import com.baidu.lbsapi.auth.g;

/* loaded from: classes13.dex */
class o implements g.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f7500a;
    final /* synthetic */ String b;
    final /* synthetic */ LBSAuthManager c;

    o(LBSAuthManager lBSAuthManager, String str, String str2) {
        this.c = lBSAuthManager;
        this.f7500a = str;
        this.b = str2;
    }

    @Override // com.baidu.lbsapi.auth.g.a
    public void a(String str) {
        this.c.a(this.f7500a, str, this.b);
    }
}
