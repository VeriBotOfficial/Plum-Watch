package com.vivo.push.b;

import android.text.TextUtils;

/* compiled from: MsgArriveCommand.java */
/* loaded from: classes2.dex */
public final class h extends com.vivo.push.v {

    /* renamed from: a, reason: collision with root package name */
    private String f14046a;
    private String b;

    public h() {
        super(2013);
    }

    public h(String str) {
        this();
        this.f14046a = str;
    }

    public h(String str, String str2) {
        this(str);
        this.b = str2;
    }

    @Override // com.vivo.push.v
    protected final void c(com.vivo.push.d dVar) {
        dVar.a("MsgArriveCommand.MSG_TAG", this.f14046a);
        if (TextUtils.isEmpty(this.b)) {
            return;
        }
        dVar.a("MsgArriveCommand.NODE_INFO", this.b);
    }

    @Override // com.vivo.push.v
    protected final void d(com.vivo.push.d dVar) {
        this.f14046a = dVar.a("MsgArriveCommand.MSG_TAG");
        this.b = dVar.a("MsgArriveCommand.NODE_INFO");
    }
}
