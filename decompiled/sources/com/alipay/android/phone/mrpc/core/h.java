package com.alipay.android.phone.mrpc.core;

import android.content.Context;

/* loaded from: classes11.dex */
public class h extends x {

    /* renamed from: a, reason: collision with root package name */
    private Context f1279a;

    public h(Context context) {
        this.f1279a = context;
    }

    private g a(ab abVar) {
        return new i(this, abVar);
    }

    @Override // com.alipay.android.phone.mrpc.core.x
    public <T> T a(Class<T> cls, ab abVar) {
        return (T) new y(a(abVar)).a(cls);
    }
}
