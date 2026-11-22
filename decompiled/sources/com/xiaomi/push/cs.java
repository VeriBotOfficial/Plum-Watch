package com.xiaomi.push;

import android.content.Context;

/* loaded from: classes4.dex */
public class cs implements fe {

    /* renamed from: a, reason: collision with root package name */
    private Context f14500a;

    @Override // com.xiaomi.push.fe
    public void a(fb fbVar) {
    }

    @Override // com.xiaomi.push.fe
    public void a(fb fbVar, Exception exc) {
    }

    public cs(Context context) {
        this.f14500a = context;
    }

    @Override // com.xiaomi.push.fe
    public void a(fb fbVar, int i, Exception exc) {
        co.a(this.f14500a, fbVar.mo12147a(), i);
    }

    @Override // com.xiaomi.push.fe
    public void b(fb fbVar) {
        co.m11974a(this.f14500a);
    }
}
