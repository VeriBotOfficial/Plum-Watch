package com.baidu.lbsapi.auth;

import com.baidu.lbsapi.auth.e;

/* loaded from: classes13.dex */
class n implements e.a {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f7499a;
    final /* synthetic */ String b;
    final /* synthetic */ LBSAuthManager c;

    n(LBSAuthManager lBSAuthManager, String str, String str2) {
        this.c = lBSAuthManager;
        this.f7499a = str;
        this.b = str2;
    }

    @Override // com.baidu.lbsapi.auth.e.a
    public void a(String str) {
        this.c.a(this.f7499a, str, this.b);
    }
}
