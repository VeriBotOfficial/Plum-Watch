package com.alipay.android.phone.mrpc.core;

import android.content.Context;

/* loaded from: classes11.dex */
class i implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ ab f1280a;
    public final /* synthetic */ h b;

    public i(h hVar, ab abVar) {
        this.b = hVar;
        this.f1280a = abVar;
    }

    @Override // com.alipay.android.phone.mrpc.core.g
    public String a() {
        return this.f1280a.a();
    }

    @Override // com.alipay.android.phone.mrpc.core.g
    public ad b() {
        return l.a(e());
    }

    @Override // com.alipay.android.phone.mrpc.core.g
    public ab c() {
        return this.f1280a;
    }

    @Override // com.alipay.android.phone.mrpc.core.g
    public boolean d() {
        return this.f1280a.c();
    }

    public Context e() {
        Context context;
        context = this.b.f1279a;
        return context.getApplicationContext();
    }
}
