package com.baidu.ar;

import java.util.HashMap;

/* JADX INFO: loaded from: classes16.dex */
public class n4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public boolean f7095a;
    public byte[] b;
    public String c;
    public HashMap<String, Double> d;

    public n4() {
    }

    public n4(byte[] bArr, HashMap<String, Double> map, boolean z) {
        this.b = bArr;
        this.d = map;
        this.f7095a = z;
    }

    public void a(String str) {
        this.c = str;
    }

    public byte[] a() {
        return this.b;
    }

    public HashMap<String, Double> b() {
        return this.d;
    }

    public String c() {
        return this.c;
    }

    public boolean d() {
        return this.f7095a;
    }
}
