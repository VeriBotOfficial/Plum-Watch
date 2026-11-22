package com.vivo.push.b;

import android.text.TextUtils;
import com.vivo.push.model.UnvarnishedMessage;

/* compiled from: OnMessageReceiveCommand.java */
/* loaded from: classes2.dex */
public final class o extends w {

    /* renamed from: a, reason: collision with root package name */
    protected UnvarnishedMessage f14052a;

    public o() {
        super(3);
    }

    @Override // com.vivo.push.b.w, com.vivo.push.b.t, com.vivo.push.v
    protected final void c(com.vivo.push.d dVar) {
        super.c(dVar);
        dVar.a("msg_v1", this.f14052a.unpackToJson());
    }

    @Override // com.vivo.push.b.w, com.vivo.push.b.t, com.vivo.push.v
    protected final void d(com.vivo.push.d dVar) {
        super.d(dVar);
        String a2 = dVar.a("msg_v1");
        if (TextUtils.isEmpty(a2)) {
            return;
        }
        UnvarnishedMessage unvarnishedMessage = new UnvarnishedMessage(a2);
        this.f14052a = unvarnishedMessage;
        unvarnishedMessage.setMsgId(h());
        this.f14052a.setTransmissionMessageEventType(dVar.b("transmission_message_event_type", 0));
    }

    public final String e() {
        UnvarnishedMessage unvarnishedMessage = this.f14052a;
        if (unvarnishedMessage == null) {
            return null;
        }
        return unvarnishedMessage.unpackToJson();
    }

    public final UnvarnishedMessage f() {
        return this.f14052a;
    }

    @Override // com.vivo.push.b.t, com.vivo.push.v
    public final String toString() {
        return "OnMessageCommand";
    }
}
