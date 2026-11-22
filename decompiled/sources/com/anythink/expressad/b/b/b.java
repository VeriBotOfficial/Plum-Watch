package com.anythink.expressad.b.b;

import com.anythink.expressad.foundation.d.d;
import java.util.HashSet;

/* loaded from: classes12.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static int f4712a = 0;
    public static int b = 1;
    private String c;
    private int d;
    private HashSet<String> e = new HashSet<>();
    private long f = System.currentTimeMillis();
    private d g;
    private String h;
    private int i;
    private boolean j;
    private boolean k;
    private int l;

    public final boolean a() {
        return this.j;
    }

    public final void a(boolean z) {
        this.j = z;
    }

    public final boolean b() {
        return this.k;
    }

    public final void b(boolean z) {
        this.k = z;
    }

    public final int c() {
        return this.l;
    }

    public final void a(int i) {
        this.l = i;
    }

    public final int d() {
        return this.i;
    }

    public final void b(int i) {
        this.i = i;
    }

    public b(String str, String str2) {
        this.c = str;
        b(str2);
    }

    public final String e() {
        return this.h;
    }

    public final void a(String str) {
        this.h = str;
    }

    public final d f() {
        return this.g;
    }

    public final void a(d dVar) {
        this.g = dVar;
    }

    private String i() {
        return this.c;
    }

    public final int g() {
        return this.d;
    }

    private HashSet<String> j() {
        return this.e;
    }

    public final void b(String str) {
        this.d++;
        this.e.add(str);
    }

    public final long h() {
        return this.f;
    }
}
