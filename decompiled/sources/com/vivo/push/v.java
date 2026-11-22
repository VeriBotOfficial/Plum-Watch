package com.vivo.push;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;

/* compiled from: PushCommand.java */
/* loaded from: classes2.dex */
public abstract class v {

    /* renamed from: a, reason: collision with root package name */
    private int f14167a;
    private String b;

    public static long c() {
        return 0L;
    }

    protected abstract void c(d dVar);

    protected abstract void d(d dVar);

    public boolean d() {
        return false;
    }

    public v(int i) {
        this.f14167a = -1;
        if (i < 0) {
            throw new IllegalArgumentException("PushCommand: the value of command must > 0.");
        }
        this.f14167a = i;
    }

    public final String a() {
        return this.b;
    }

    public final void a(String str) {
        this.b = str;
    }

    public final int b() {
        return this.f14167a;
    }

    public final void a(Intent intent) {
        d a2 = d.a(intent);
        if (a2 == null) {
            com.vivo.push.util.t.b("PushCommand", "bundleWapper is null");
            return;
        }
        a(a2);
        Bundle b = a2.b();
        if (b != null) {
            intent.putExtras(b);
        }
    }

    public final void a(d dVar) {
        String a2 = x.a(this.f14167a);
        if (a2 == null) {
            a2 = "";
        }
        dVar.a("method", a2);
        e(dVar);
    }

    public final void b(Intent intent) {
        d a2 = d.a(intent);
        if (a2 == null) {
            com.vivo.push.util.t.b("PushCommand", "bundleWapper is null");
            return;
        }
        a2.a("method", this.f14167a);
        e(a2);
        Bundle b = a2.b();
        if (b != null) {
            intent.putExtras(b);
        }
    }

    private void e(d dVar) {
        dVar.a(com.heytap.mcssdk.constant.b.y, this.f14167a);
        dVar.a("client_pkgname", this.b);
        c(dVar);
    }

    public final void b(d dVar) {
        String a2 = dVar.a();
        if (!TextUtils.isEmpty(a2)) {
            this.b = a2;
        } else {
            this.b = dVar.a("client_pkgname");
        }
        d(dVar);
    }

    public String toString() {
        return getClass().getSimpleName();
    }
}
