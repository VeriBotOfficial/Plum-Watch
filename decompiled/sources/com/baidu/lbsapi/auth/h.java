package com.baidu.lbsapi.auth;

import java.util.List;

/* loaded from: classes13.dex */
class h implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ String f7493a;
    final /* synthetic */ int b;
    final /* synthetic */ String c;
    final /* synthetic */ String d;
    final /* synthetic */ g e;

    h(g gVar, String str, int i, String str2, String str3) {
        this.e = gVar;
        this.f7493a = str;
        this.b = i;
        this.c = str2;
        this.d = str3;
    }

    @Override // java.lang.Runnable
    public void run() {
        List list;
        g gVar = this.e;
        list = gVar.b;
        gVar.a(list, this.f7493a, this.b, this.c, this.d);
    }
}
