package com.applovin.impl;

import android.content.Context;

/* loaded from: classes12.dex */
public class m4 {

    /* renamed from: a, reason: collision with root package name */
    private final String f6340a;
    private final String b;
    private final boolean c;

    m4(String str, String str2, Context context) {
        this.f6340a = str.replace("android.permission.", "");
        this.b = str2;
        this.c = o0.a(str, context);
    }

    public String a() {
        return this.b;
    }

    public String b() {
        return this.f6340a;
    }

    public boolean c() {
        return this.c;
    }
}
