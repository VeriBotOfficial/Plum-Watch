package com.baidu.ar;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes16.dex */
public class nd {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f7097a;
    public int b;
    public String c;
    public int e;
    public String f;
    public int d = 1000;
    public boolean g = true;

    public int a() {
        return this.d;
    }

    public void a(int r1) {
        this.d = r1;
    }

    public void a(String str) {
        this.f7097a = str;
    }

    public void a(boolean z) {
        this.g = z;
    }

    public String b() {
        return this.f7097a;
    }

    public void b(int r1) {
        this.e = r1;
    }

    public void b(String str) {
        this.c = str;
    }

    public int c() {
        return this.e;
    }

    public void c(int r1) {
        this.b = r1;
    }

    public void c(String str) {
        this.f = str;
    }

    public int d() {
        return this.b;
    }

    public String e() {
        return this.c;
    }

    public boolean f() {
        return this.g;
    }

    public String toString() {
        return "SlamModel{id='" + this.f7097a + "', placeType=" + this.b + ", position='" + this.c + "', distance=" + this.d + ", pitchAngle=" + this.e + ", rotation='" + this.f + "', mImmediatelyPlaceModel=" + this.g + AbstractJsonLexerKt.END_OBJ;
    }
}
