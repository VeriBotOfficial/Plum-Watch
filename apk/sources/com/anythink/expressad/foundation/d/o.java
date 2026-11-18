package com.anythink.expressad.foundation.d;

import java.io.Serializable;

/* JADX INFO: loaded from: classes16.dex */
public final class o implements Serializable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f4800a;
    private String b;
    private int c;

    private o(String str, String str2, int r3) {
        this.b = str;
        this.f4800a = str2;
        this.c = r3;
    }

    private String a() {
        return this.f4800a;
    }

    private void a(String str) {
        this.f4800a = str;
    }

    private String b() {
        return this.b;
    }

    private void b(String str) {
        this.b = str;
    }
}
