package com.baidu.ar;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes12.dex */
public class nd {

    /* renamed from: a, reason: collision with root package name */
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

    public void a(int i) {
        this.d = i;
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

    public void b(int i) {
        this.e = i;
    }

    public void b(String str) {
        this.c = str;
    }

    public int c() {
        return this.e;
    }

    public void c(int i) {
        this.b = i;
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
