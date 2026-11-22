package com.vivo.push.b;

import android.text.TextUtils;
import com.vivo.push.model.InsideNotificationItem;

/* compiled from: OnNotifyArrivedReceiveCommand.java */
/* loaded from: classes2.dex */
public final class q extends w {

    /* renamed from: a, reason: collision with root package name */
    protected InsideNotificationItem f14054a;
    private String b;

    public q() {
        super(4);
    }

    public final InsideNotificationItem e() {
        return this.f14054a;
    }

    @Override // com.vivo.push.b.w, com.vivo.push.b.t, com.vivo.push.v
    protected final void c(com.vivo.push.d dVar) {
        super.c(dVar);
        String b = com.vivo.push.util.u.b(this.f14054a);
        this.b = b;
        dVar.a("notification_v1", b);
    }

    @Override // com.vivo.push.b.w, com.vivo.push.b.t, com.vivo.push.v
    protected final void d(com.vivo.push.d dVar) {
        super.d(dVar);
        String a2 = dVar.a("notification_v1");
        this.b = a2;
        if (TextUtils.isEmpty(a2)) {
            return;
        }
        InsideNotificationItem a3 = com.vivo.push.util.u.a(this.b);
        this.f14054a = a3;
        if (a3 != null) {
            a3.setMsgId(h());
        }
    }

    public final String f() {
        if (!TextUtils.isEmpty(this.b)) {
            return this.b;
        }
        InsideNotificationItem insideNotificationItem = this.f14054a;
        if (insideNotificationItem == null) {
            return null;
        }
        return com.vivo.push.util.u.b(insideNotificationItem);
    }

    @Override // com.vivo.push.b.t, com.vivo.push.v
    public final String toString() {
        return "OnNotifyArrivedCommand";
    }

    public final boolean g() {
        InsideNotificationItem insideNotificationItem = this.f14054a;
        return insideNotificationItem != null && insideNotificationItem.isNoShowOnForeground();
    }
}
