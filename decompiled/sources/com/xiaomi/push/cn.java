package com.xiaomi.push;

import android.content.Context;

/* loaded from: classes4.dex */
public class cn implements fg, fl {

    /* renamed from: a, reason: collision with root package name */
    private Context f14493a;

    @Override // com.xiaomi.push.fl
    /* renamed from: a */
    public boolean mo11973a(fp fpVar) {
        return true;
    }

    public cn(Context context) {
        this.f14493a = context;
    }

    @Override // com.xiaomi.push.fg
    public void a(fp fpVar) {
        cu.a(this.f14493a);
    }

    @Override // com.xiaomi.push.fg
    public void a(es esVar) {
        if (esVar != null && esVar.a() == 0 && "PING".equals(esVar.m12123a())) {
            cu.c(this.f14493a);
        } else {
            cu.a(this.f14493a);
        }
    }
}
