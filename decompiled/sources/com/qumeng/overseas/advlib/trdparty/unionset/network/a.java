package com.qumeng.overseas.advlib.trdparty.unionset.network;

import com.qumeng.overseas.advlib.trdparty.unionset.common.h;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes17.dex */
public class a {
    public static final int C = 0;
    public static final int D = 1;
    public static final int E = 2;
    public static final int F = 3;

    /* renamed from: a, reason: collision with root package name */
    private String f13398a;
    private Object b;
    private Object c;
    private SlotIDItemConfigEntity d;
    private SlotIDConfigEntity e;
    private int f;
    private String g;
    private double h;
    private double i;
    private double j;
    private long l;
    private String m;
    private boolean n;
    private int o;
    private boolean p;

    /* renamed from: q, reason: collision with root package name */
    private String f13399q;
    private h.b r;
    private h.a s;
    private int t;
    private int u;
    private int v;
    private int w;
    private String x;
    private long y;
    private boolean z;
    private int k = 0;
    private AtomicInteger A = new AtomicInteger(0);
    private int B = 0;

    @Retention(RetentionPolicy.SOURCE)
    /* renamed from: com.qumeng.overseas.advlib.trdparty.unionset.network.a$a, reason: collision with other inner class name */
    public @interface InterfaceC0875a {
    }

    public int A() {
        return this.k;
    }

    public boolean B() {
        return this.n;
    }

    public boolean C() {
        return this.z;
    }

    public void D() {
        this.A.set(0);
    }

    public void E() {
        this.B = 0;
        this.z = true;
    }

    public void a(Object obj) {
        this.b = obj;
    }

    public void b(long j) {
        this.y = j;
    }

    public void c(boolean z) {
        this.z = z;
    }

    public void d(String str) {
        this.x = str;
    }

    public String e() {
        return this.f13398a;
    }

    public void f(int i) {
        this.k = i;
    }

    public void g(int i) {
        this.f = i;
    }

    public int h() {
        return this.u;
    }

    public int i() {
        return this.A.get();
    }

    public long j() {
        return this.y;
    }

    public double k() {
        return this.i;
    }

    public long l() {
        return this.l;
    }

    public int m() {
        return this.t;
    }

    public double n() {
        return this.h;
    }

    public int o() {
        return this.B;
    }

    public int p() {
        return this.o;
    }

    public SlotIDItemConfigEntity q() {
        return this.d;
    }

    public String r() {
        return this.x;
    }

    public double s() {
        return this.j;
    }

    public int t() {
        return this.f;
    }

    public int u() {
        return this.w;
    }

    public String v() {
        return this.m;
    }

    public SlotIDConfigEntity w() {
        return this.e;
    }

    public h.b x() {
        return this.r;
    }

    public void y() {
        this.A.incrementAndGet();
    }

    public boolean z() {
        return this.p;
    }

    public void a(SlotIDItemConfigEntity slotIDItemConfigEntity) {
        this.d = slotIDItemConfigEntity;
    }

    public void b(String str) {
        this.f13399q = str;
    }

    public void c(String str) {
        this.f13398a = str;
    }

    public void d(int i) {
        this.B = i;
    }

    public void e(String str) {
        this.m = str;
    }

    public h.a f() {
        return this.s;
    }

    public int g() {
        return this.v;
    }

    public void h(int i) {
        this.w = i;
    }

    public void a(SlotIDConfigEntity slotIDConfigEntity) {
        this.e = slotIDConfigEntity;
    }

    public Object b() {
        return this.c;
    }

    public Object c() {
        return this.b;
    }

    public String d() {
        return this.f13399q;
    }

    public void e(int i) {
        this.o = i;
    }

    public String a() {
        return this.g;
    }

    public void b(Object obj) {
        this.c = obj;
    }

    public void c(Object obj) {
        this.b = obj;
    }

    public void a(String str) {
        this.g = str;
    }

    public void b(double d) {
        this.h = d;
    }

    public void c(long j) {
        this.l = j;
    }

    public void a(double d) {
        this.i = d;
    }

    public void b(boolean z) {
        this.n = z;
    }

    public void c(double d) {
        this.j = d;
    }

    public void a(boolean z) {
        this.p = z;
    }

    public void b(int i) {
        this.u = i;
    }

    public void c(int i) {
        this.t = i;
    }

    public void a(h.b bVar) {
        this.r = bVar;
    }

    public void a(int i) {
        this.v = i;
    }

    public void a(h.a aVar) {
        this.s = aVar;
    }

    public boolean a(long j) {
        return System.currentTimeMillis() - this.y < j;
    }
}
