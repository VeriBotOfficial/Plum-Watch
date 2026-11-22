package com.xiaomi.push;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public class hx extends ib {

    /* renamed from: a, reason: collision with root package name */
    private static final ig f14668a = new ig();

    /* renamed from: a, reason: collision with other field name */
    protected int f908a;

    /* renamed from: a, reason: collision with other field name */
    protected boolean f909a;

    /* renamed from: a, reason: collision with other field name */
    private byte[] f910a;
    protected boolean b;

    /* renamed from: b, reason: collision with other field name */
    private byte[] f911b;
    protected boolean c;

    /* renamed from: c, reason: collision with other field name */
    private byte[] f912c;
    private byte[] d;
    private byte[] e;
    private byte[] f;
    private byte[] g;
    private byte[] h;

    @Override // com.xiaomi.push.ib
    /* renamed from: a, reason: collision with other method in class */
    public void mo12343a() {
    }

    @Override // com.xiaomi.push.ib
    public void a(ig igVar) {
    }

    @Override // com.xiaomi.push.ib
    public void b() {
    }

    @Override // com.xiaomi.push.ib
    public void d() {
    }

    @Override // com.xiaomi.push.ib
    public void e() {
    }

    @Override // com.xiaomi.push.ib
    public void f() {
    }

    @Override // com.xiaomi.push.ib
    public void g() {
    }

    @Override // com.xiaomi.push.ib
    public void h() {
    }

    @Override // com.xiaomi.push.ib
    public void i() {
    }

    @Override // com.xiaomi.push.ib
    public void j() {
    }

    public static class a implements id {

        /* renamed from: a, reason: collision with root package name */
        protected int f14669a;

        /* renamed from: a, reason: collision with other field name */
        protected boolean f913a;
        protected boolean b;

        public a() {
            this(false, true);
        }

        public a(boolean z, boolean z2) {
            this(z, z2, 0);
        }

        public a(boolean z, boolean z2, int i) {
            this.f913a = z;
            this.b = z2;
            this.f14669a = i;
        }

        @Override // com.xiaomi.push.id
        public ib a(il ilVar) {
            hx hxVar = new hx(ilVar, this.f913a, this.b);
            int i = this.f14669a;
            if (i != 0) {
                hxVar.b(i);
            }
            return hxVar;
        }
    }

    public hx(il ilVar, boolean z, boolean z2) {
        super(ilVar);
        this.c = false;
        this.f910a = new byte[1];
        this.f911b = new byte[2];
        this.f912c = new byte[4];
        this.d = new byte[8];
        this.e = new byte[1];
        this.f = new byte[2];
        this.g = new byte[4];
        this.h = new byte[8];
        this.f909a = z;
        this.b = z2;
    }

    @Override // com.xiaomi.push.ib
    public void a(hy hyVar) {
        a(hyVar.f14670a);
        a(hyVar.f915a);
    }

    @Override // com.xiaomi.push.ib
    public void c() {
        a((byte) 0);
    }

    @Override // com.xiaomi.push.ib
    public void a(ia iaVar) {
        a(iaVar.f14673a);
        a(iaVar.b);
        mo12344a(iaVar.f919a);
    }

    @Override // com.xiaomi.push.ib
    public void a(hz hzVar) {
        a(hzVar.f14671a);
        mo12344a(hzVar.f916a);
    }

    @Override // com.xiaomi.push.ib
    public void a(boolean z) {
        a(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.xiaomi.push.ib
    public void a(byte b) {
        this.f910a[0] = b;
        this.f14674a.mo12353a(this.f910a, 0, 1);
    }

    @Override // com.xiaomi.push.ib
    public void a(short s) {
        byte[] bArr = this.f911b;
        bArr[0] = (byte) ((s >> 8) & 255);
        bArr[1] = (byte) (s & 255);
        this.f14674a.mo12353a(this.f911b, 0, 2);
    }

    @Override // com.xiaomi.push.ib
    /* renamed from: a, reason: collision with other method in class */
    public void mo12344a(int i) {
        byte[] bArr = this.f912c;
        bArr[0] = (byte) ((i >> 24) & 255);
        bArr[1] = (byte) ((i >> 16) & 255);
        bArr[2] = (byte) ((i >> 8) & 255);
        bArr[3] = (byte) (i & 255);
        this.f14674a.mo12353a(this.f912c, 0, 4);
    }

    @Override // com.xiaomi.push.ib
    public void a(long j) {
        byte[] bArr = this.d;
        bArr[0] = (byte) ((j >> 56) & 255);
        bArr[1] = (byte) ((j >> 48) & 255);
        bArr[2] = (byte) ((j >> 40) & 255);
        bArr[3] = (byte) ((j >> 32) & 255);
        bArr[4] = (byte) ((j >> 24) & 255);
        bArr[5] = (byte) ((j >> 16) & 255);
        bArr[6] = (byte) ((j >> 8) & 255);
        bArr[7] = (byte) (j & 255);
        this.f14674a.mo12353a(this.d, 0, 8);
    }

    @Override // com.xiaomi.push.ib
    public void a(String str) {
        try {
            byte[] bytes = str.getBytes("UTF-8");
            mo12344a(bytes.length);
            this.f14674a.mo12353a(bytes, 0, bytes.length);
        } catch (UnsupportedEncodingException unused) {
            throw new hv("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    @Override // com.xiaomi.push.ib
    public void a(ByteBuffer byteBuffer) {
        int limit = (byteBuffer.limit() - byteBuffer.position()) - byteBuffer.arrayOffset();
        mo12344a(limit);
        this.f14674a.mo12353a(byteBuffer.array(), byteBuffer.position() + byteBuffer.arrayOffset(), limit);
    }

    @Override // com.xiaomi.push.ib
    /* renamed from: a, reason: collision with other method in class */
    public ig mo12339a() {
        return f14668a;
    }

    @Override // com.xiaomi.push.ib
    /* renamed from: a, reason: collision with other method in class */
    public hy mo12335a() {
        byte a2 = a();
        return new hy("", a2, a2 == 0 ? (short) 0 : mo12342a());
    }

    @Override // com.xiaomi.push.ib
    /* renamed from: a, reason: collision with other method in class */
    public ia mo12337a() {
        return new ia(a(), a(), mo12333a());
    }

    @Override // com.xiaomi.push.ib
    /* renamed from: a, reason: collision with other method in class */
    public hz mo12336a() {
        return new hz(a(), mo12333a());
    }

    @Override // com.xiaomi.push.ib
    /* renamed from: a, reason: collision with other method in class */
    public Cif mo12338a() {
        return new Cif(a(), mo12333a());
    }

    @Override // com.xiaomi.push.ib
    /* renamed from: a, reason: collision with other method in class */
    public boolean mo12345a() {
        return a() == 1;
    }

    @Override // com.xiaomi.push.ib
    public byte a() {
        if (this.f14674a.b() >= 1) {
            byte b = this.f14674a.a()[this.f14674a.a_()];
            this.f14674a.a(1);
            return b;
        }
        a(this.e, 0, 1);
        return this.e[0];
    }

    @Override // com.xiaomi.push.ib
    /* renamed from: a, reason: collision with other method in class */
    public short mo12342a() {
        int i;
        byte[] bArr = this.f;
        if (this.f14674a.b() >= 2) {
            bArr = this.f14674a.a();
            i = this.f14674a.a_();
            this.f14674a.a(2);
        } else {
            a(this.f, 0, 2);
            i = 0;
        }
        return (short) ((bArr[i + 1] & 255) | ((bArr[i] & 255) << 8));
    }

    @Override // com.xiaomi.push.ib
    /* renamed from: a, reason: collision with other method in class */
    public int mo12333a() {
        int i;
        byte[] bArr = this.g;
        if (this.f14674a.b() >= 4) {
            bArr = this.f14674a.a();
            i = this.f14674a.a_();
            this.f14674a.a(4);
        } else {
            a(this.g, 0, 4);
            i = 0;
        }
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    @Override // com.xiaomi.push.ib
    /* renamed from: a, reason: collision with other method in class */
    public long mo12334a() {
        int i;
        byte[] bArr = this.h;
        if (this.f14674a.b() >= 8) {
            bArr = this.f14674a.a();
            i = this.f14674a.a_();
            this.f14674a.a(8);
        } else {
            a(this.h, 0, 8);
            i = 0;
        }
        return (bArr[i + 7] & 255) | ((bArr[i] & 255) << 56) | ((bArr[i + 1] & 255) << 48) | ((bArr[i + 2] & 255) << 40) | ((bArr[i + 3] & 255) << 32) | ((bArr[i + 4] & 255) << 24) | ((bArr[i + 5] & 255) << 16) | ((bArr[i + 6] & 255) << 8);
    }

    @Override // com.xiaomi.push.ib
    /* renamed from: a, reason: collision with other method in class */
    public double mo12332a() {
        return Double.longBitsToDouble(mo12334a());
    }

    @Override // com.xiaomi.push.ib
    /* renamed from: a, reason: collision with other method in class */
    public String mo12340a() {
        int mo12333a = mo12333a();
        if (this.f14674a.b() >= mo12333a) {
            try {
                String str = new String(this.f14674a.a(), this.f14674a.a_(), mo12333a, "UTF-8");
                this.f14674a.a(mo12333a);
                return str;
            } catch (UnsupportedEncodingException unused) {
                throw new hv("JVM DOES NOT SUPPORT UTF-8");
            }
        }
        return a(mo12333a);
    }

    public String a(int i) {
        try {
            c(i);
            byte[] bArr = new byte[i];
            this.f14674a.b(bArr, 0, i);
            return new String(bArr, "UTF-8");
        } catch (UnsupportedEncodingException unused) {
            throw new hv("JVM DOES NOT SUPPORT UTF-8");
        }
    }

    @Override // com.xiaomi.push.ib
    /* renamed from: a, reason: collision with other method in class */
    public ByteBuffer mo12341a() {
        int mo12333a = mo12333a();
        c(mo12333a);
        if (this.f14674a.b() >= mo12333a) {
            ByteBuffer wrap = ByteBuffer.wrap(this.f14674a.a(), this.f14674a.a_(), mo12333a);
            this.f14674a.a(mo12333a);
            return wrap;
        }
        byte[] bArr = new byte[mo12333a];
        this.f14674a.b(bArr, 0, mo12333a);
        return ByteBuffer.wrap(bArr);
    }

    private int a(byte[] bArr, int i, int i2) {
        c(i2);
        return this.f14674a.b(bArr, i, i2);
    }

    public void b(int i) {
        this.f908a = i;
        this.c = true;
    }

    protected void c(int i) {
        if (i < 0) {
            throw new hv("Negative length: " + i);
        }
        if (this.c) {
            int i2 = this.f908a - i;
            this.f908a = i2;
            if (i2 < 0) {
                throw new hv("Message length exceeded: " + i);
            }
        }
    }
}
