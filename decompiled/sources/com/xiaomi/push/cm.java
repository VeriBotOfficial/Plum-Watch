package com.xiaomi.push;

import android.content.Context;

/* loaded from: classes4.dex */
public class cm implements fg, fl {

    /* renamed from: a, reason: collision with root package name */
    private Context f14492a;

    @Override // com.xiaomi.push.fl
    /* renamed from: a, reason: collision with other method in class */
    public boolean mo11973a(fp fpVar) {
        return true;
    }

    public cm(Context context) {
        this.f14492a = context;
    }

    @Override // com.xiaomi.push.fg
    public void a(fp fpVar) {
        cu.b(this.f14492a);
    }

    @Override // com.xiaomi.push.fg
    public void a(es esVar) {
        if (esVar != null && esVar.a() == 0 && "PING".equals(esVar.m12123a())) {
            cu.d(this.f14492a);
        } else {
            cu.b(this.f14492a);
        }
    }
}
