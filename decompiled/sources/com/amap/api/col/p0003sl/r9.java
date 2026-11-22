package com.amap.api.col.p0003sl;

import android.text.TextUtils;
import java.util.Vector;

/* compiled from: LogMemCacher.java */
/* loaded from: classes11.dex */
public final class r9 {

    /* renamed from: a, reason: collision with root package name */
    private Vector<o9> f1858a;
    private int b;
    private int c;

    public r9() {
        this.c = 0;
        this.b = 10;
        this.f1858a = new Vector<>();
    }

    public final synchronized boolean a(String str) {
        if (str == null) {
            return false;
        }
        if (this.f1858a.size() >= this.b) {
            return true;
        }
        return this.c + str.getBytes().length > 10000;
    }

    public final synchronized void b() {
        this.f1858a.clear();
        this.c = 0;
    }

    public final Vector<o9> a() {
        return this.f1858a;
    }

    public final synchronized void a(o9 o9Var) {
        if (TextUtils.isEmpty(o9Var.b())) {
            return;
        }
        this.f1858a.add(o9Var);
        this.c += o9Var.b().getBytes().length;
    }

    public r9(byte b) {
        this.b = 100;
        this.c = 0;
        this.f1858a = new Vector<>();
    }
}
