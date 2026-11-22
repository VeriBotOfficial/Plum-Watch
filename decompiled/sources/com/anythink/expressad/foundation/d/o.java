package com.anythink.expressad.foundation.d;

import java.io.Serializable;

/* loaded from: classes12.dex */
public final class o implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    private String f4800a;
    private String b;
    private int c;

    private o(String str, String str2, int i) {
        this.b = str;
        this.f4800a = str2;
        this.c = i;
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
