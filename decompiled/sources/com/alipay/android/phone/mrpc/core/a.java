package com.alipay.android.phone.mrpc.core;

import java.lang.reflect.Method;

/* loaded from: classes11.dex */
public abstract class a implements w {

    /* renamed from: a, reason: collision with root package name */
    public Method f1267a;
    public byte[] b;
    public String c;
    public int d;
    public String e;
    public boolean f;

    public a(Method method, int i, String str, byte[] bArr, String str2, boolean z) {
        this.f1267a = method;
        this.d = i;
        this.c = str;
        this.b = bArr;
        this.e = str2;
        this.f = z;
    }
}
