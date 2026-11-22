package com.umeng.analytics.pro;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* compiled from: TBinaryProtocol.java */
/* loaded from: classes2.dex */
public class bl extends bs {

    /* renamed from: a, reason: collision with root package name */
    protected static final int f13810a = -65536;
    protected static final int b = -2147418112;
    private static final bx h = new bx();
    protected boolean c;
    protected boolean d;
    protected int e;
    protected boolean f;
    private byte[] i;
    private byte[] j;
    private byte[] k;
    private byte[] l;
    private byte[] m;
    private byte[] n;
    private byte[] o;
    private byte[] p;

    @Override // com.umeng.analytics.pro.bs
    public void a() {
    }

    @Override // com.umeng.analytics.pro.bs
    public void a(bx bxVar) {
    }

    @Override // com.umeng.analytics.pro.bs
    public void b() {
    }

    @Override // com.umeng.analytics.pro.bs
    public void c() {
    }

    @Override // com.umeng.analytics.pro.bs
    public void e() {
    }

    @Override // com.umeng.analytics.pro.bs
    public void f() {
    }

    @Override // com.umeng.analytics.pro.bs
    public void g() {
    }

    @Override // com.umeng.analytics.pro.bs
    public void i() {
    }

    @Override // com.umeng.analytics.pro.bs
    public void k() {
    }

    @Override // com.umeng.analytics.pro.bs
    public void m() {
    }

    @Override // com.umeng.analytics.pro.bs
    public void o() {
    }

    @Override // com.umeng.analytics.pro.bs
    public void q() {
    }

    @Override // com.umeng.analytics.pro.bs
    public void s() {
    }

    /* compiled from: TBinaryProtocol.java */
    public static class a implements bu {

        /* renamed from: a, reason: collision with root package name */
        protected boolean f13811a;
        protected boolean b;
        protected int c;

        public a() {
            this(false, true);
        }

        public a(boolean z, boolean z2) {
            this(z, z2, 0);
        }

        public a(boolean z, boolean z2, int i) {
            this.f13811a = z;
            this.b = z2;
            this.c = i;
        }

        @Override // com.umeng.analytics.pro.bu
        public bs a(cg cgVar) {
            bl blVar = new bl(cgVar, this.f13811a, this.b);
            int i = this.c;
            if (i != 0) {
                blVar.c(i);
            }
            return blVar;
        }
    }

    public bl(cg cgVar) {
        this(cgVar, false, true);
    }

    public bl(cg cgVar, boolean z, boolean z2) {
        super(cgVar);
        this.f = false;
        this.i = new byte[1];
        this.j = new byte[2];
        this.k = new byte[4];
        this.l = new byte[8];
        this.m = new byte[1];
        this.n = new byte[2];
        this.o = new byte[4];
        this.p = new byte[8];
        this.c = z;
        this.d = z2;
    }

    @Override // com.umeng.analytics.pro.bs
    public void a(bq bqVar) throws az {
        if (this.d) {
            a(b | bqVar.b);
            a(bqVar.f13819a);
            a(bqVar.c);
        } else {
            a(bqVar.f13819a);
            a(bqVar.b);
            a(bqVar.c);
        }
    }

    @Override // com.umeng.analytics.pro.bs
    public void a(bn bnVar) throws az {
        a(bnVar.b);
        a(bnVar.c);
    }

    @Override // com.umeng.analytics.pro.bs
    public void d() throws az {
        a((byte) 0);
    }

    @Override // com.umeng.analytics.pro.bs
    public void a(bp bpVar) throws az {
        a(bpVar.f13818a);
        a(bpVar.b);
        a(bpVar.c);
    }

    @Override // com.umeng.analytics.pro.bs
    public void a(bo boVar) throws az {
        a(boVar.f13817a);
        a(boVar.b);
    }

    @Override // com.umeng.analytics.pro.bs
    public void a(bw bwVar) throws az {
        a(bwVar.f13823a);
        a(bwVar.b);
    }

    @Override // com.umeng.analytics.pro.bs
    public void a(boolean z) throws az {
        a(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.umeng.analytics.pro.bs
    public void a(byte b2) throws az {
        this.i[0] = b2;
        this.g.b(this.i, 0, 1);
    }

    @Override // com.umeng.analytics.pro.bs
    public void a(short s) throws az {
        byte[] bArr = this.j;
        bArr[0] = (byte) ((s >> 8) & 255);
        bArr[1] = (byte) (s & 255);
        this.g.b(this.j, 0, 2);
    }

    @Override // com.umeng.analytics.pro.bs
    public void a(int i) throws az {
        byte[] bArr = this.k;
        bArr[0] = (byte) ((i >> 24) & 255);
        bArr[1] = (byte) ((i >> 16) & 255);
        bArr[2] = (byte) ((i >> 8) & 255);
        bArr[3] = (byte) (i & 255);
        this.g.b(this.k, 0, 4);
    }

    @Override // com.umeng.analytics.pro.bs
    public void a(long j) throws az {
        byte[] bArr = this.l;
        bArr[0] = (byte) ((j >> 56) & 255);
        bArr[1] = (byte) ((j >> 48) & 255);
        bArr[2] = (byte) ((j >> 40) & 255);
        bArr[3] = (byte) ((j >> 32) & 255);
        bArr[4] = (byte) ((j >> 24) & 255);
        bArr[5] = (byte) ((j >> 16) & 255);
        bArr[6] = (byte) ((j >> 8) & 255);
        bArr[7] = (byte) (j & 255);
        this.g.b(this.l, 0, 8);
    }

    @Override // com.umeng.analytics.pro.bs
    public void a(double d) throws az {
        a(Double.doubleToLongBits(d));
    }

    @Override // com.umeng.analytics.pro.bs
    public void a(String str) throws az {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            a(bytes.length);
            this.g.b(bytes, 0, bytes.length);
        } catch (UnsupportedEncodingException unused) {
            throw new az("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    @Override // com.umeng.analytics.pro.bs
    public void a(ByteBuffer byteBuffer) throws az {
        int limit = byteBuffer.limit() - byteBuffer.position();
        a(limit);
        this.g.b(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), limit);
    }

    @Override // com.umeng.analytics.pro.bs
    public bq h() throws az {
        int w = w();
        if (w < 0) {
            if (((-65536) & w) != b) {
                throw new bt(4, "Bad version in readMessageBegin");
            }
            return new bq(z(), (byte) (w & 255), w());
        }
        if (this.c) {
            throw new bt(4, "Missing version in readMessageBegin, old client?");
        }
        return new bq(b(w), u(), w());
    }

    @Override // com.umeng.analytics.pro.bs
    public bx j() {
        return h;
    }

    @Override // com.umeng.analytics.pro.bs
    public bn l() throws az {
        byte u = u();
        return new bn("", u, u == 0 ? (short) 0 : v());
    }

    @Override // com.umeng.analytics.pro.bs
    public bp n() throws az {
        return new bp(u(), u(), w());
    }

    @Override // com.umeng.analytics.pro.bs
    public bo p() throws az {
        return new bo(u(), w());
    }

    @Override // com.umeng.analytics.pro.bs
    public bw r() throws az {
        return new bw(u(), w());
    }

    @Override // com.umeng.analytics.pro.bs
    public boolean t() throws az {
        return u() == 1;
    }

    @Override // com.umeng.analytics.pro.bs
    public byte u() throws az {
        if (this.g.h() >= 1) {
            byte b2 = this.g.f()[this.g.g()];
            this.g.a(1);
            return b2;
        }
        a(this.m, 0, 1);
        return this.m[0];
    }

    @Override // com.umeng.analytics.pro.bs
    public short v() throws az {
        int i;
        byte[] bArr = this.n;
        if (this.g.h() >= 2) {
            bArr = this.g.f();
            i = this.g.g();
            this.g.a(2);
        } else {
            a(this.n, 0, 2);
            i = 0;
        }
        return (short) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    @Override // com.umeng.analytics.pro.bs
    public int w() throws az {
        int i;
        byte[] bArr = this.o;
        if (this.g.h() >= 4) {
            bArr = this.g.f();
            i = this.g.g();
            this.g.a(4);
        } else {
            a(this.o, 0, 4);
            i = 0;
        }
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    @Override // com.umeng.analytics.pro.bs
    public long x() throws az {
        int i;
        byte[] bArr = this.p;
        if (this.g.h() >= 8) {
            bArr = this.g.f();
            i = this.g.g();
            this.g.a(8);
        } else {
            a(this.p, 0, 8);
            i = 0;
        }
        return (bArr[i + 7] & 255) | ((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
    }

    @Override // com.umeng.analytics.pro.bs
    public double y() throws az {
        return Double.longBitsToDouble(x());
    }

    @Override // com.umeng.analytics.pro.bs
    public String z() throws az {
        int w = w();
        if (this.g.h() >= w) {
            try {
                String str = new String(this.g.f(), this.g.g(), w, "UTF-8");
                this.g.a(w);
                return str;
            } catch (UnsupportedEncodingException unused) {
                throw new az("JVM DOES NOT SUPPORT UTF-8");
            }
        }
        return b(w);
    }

    public String b(int i) throws az {
        try {
            d(i);
            byte[] bArr = new byte[i];
            this.g.d(bArr, 0, i);
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            throw new az("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    @Override // com.umeng.analytics.pro.bs
    public ByteBuffer A() throws az {
        int w = w();
        d(w);
        if (this.g.h() >= w) {
            ByteBuffer wrap = ByteBuffer.wrap(this.g.f(), this.g.g(), w);
            this.g.a(w);
            return wrap;
        }
        byte[] bArr = new byte[w];
        this.g.d(bArr, 0, w);
        return ByteBuffer.wrap(bArr);
    }

    private int a(byte[] bArr, int i, int i2) throws az {
        d(i2);
        return this.g.d(bArr, i, i2);
    }

    public void c(int i) {
        this.e = i;
        this.f = true;
    }

    protected void d(int i) throws az {
        if (i < 0) {
            throw new bt("Negative length: " + i);
        }
        if (this.f) {
            int i2 = this.e - i;
            this.e = i2;
            if (i2 < 0) {
                throw new bt("Message length exceeded: " + i);
            }
        }
    }
}
