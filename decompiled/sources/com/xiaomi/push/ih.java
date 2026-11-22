package com.xiaomi.push;

import com.xiaomi.push.hx;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public class ih extends hx {
    private static int b = 10000;
    private static int c = 10000;
    private static int d = 10000;
    private static int e = 10485760;
    private static int f = 104857600;

    public ih(il ilVar, boolean z, boolean z2) {
        super(ilVar, z, z2);
    }

    public static class a extends hx.a {
        public a() {
            super(false, true);
        }

        public a(boolean z, boolean z2, int i) {
            super(z, z2, i);
        }

        @Override // com.xiaomi.push.hx.a, com.xiaomi.push.id
        public ib a(il ilVar) {
            ih ihVar = new ih(ilVar, this.f913a, this.b);
            if (this.f14669a != 0) {
                ihVar.b(this.f14669a);
            }
            return ihVar;
        }
    }

    @Override // com.xiaomi.push.hx, com.xiaomi.push.ib
    /* renamed from: a */
    public ia mo12337a() {
        byte a2 = mo12336a();
        byte a3 = mo12336a();
        int a4 = mo12336a();
        if (a4 > b) {
            throw new ic(3, "Thrift map size " + a4 + " out of range!");
        }
        return new ia(a2, a3, a4);
    }

    @Override // com.xiaomi.push.hx, com.xiaomi.push.ib
    /* renamed from: a */
    public hz mo12336a() {
        byte a2 = mo12336a();
        int a3 = mo12336a();
        if (a3 > c) {
            throw new ic(3, "Thrift list size " + a3 + " out of range!");
        }
        return new hz(a2, a3);
    }

    @Override // com.xiaomi.push.hx, com.xiaomi.push.ib
    /* renamed from: a */
    public Cif mo12338a() {
        byte a2 = mo12336a();
        int a3 = mo12336a();
        if (a3 > d) {
            throw new ic(3, "Thrift set size " + a3 + " out of range!");
        }
        return new Cif(a2, a3);
    }

    @Override // com.xiaomi.push.hx, com.xiaomi.push.ib
    /* renamed from: a */
    public String mo12340a() {
        int a2 = mo12336a();
        if (a2 > e) {
            throw new ic(3, "Thrift string size " + a2 + " out of range!");
        }
        if (this.f14674a.b() >= a2) {
            try {
                String str = new String(this.f14674a.a(), this.f14674a.a_(), a2, "UTF-8");
                this.f14674a.a(a2);
                return str;
            } catch (UnsupportedEncodingException unused) {
                throw new hv("JVM DOES NOT SUPPORT UTF-8");
            }
        }
        return a(a2);
    }

    @Override // com.xiaomi.push.hx, com.xiaomi.push.ib
    /* renamed from: a */
    public ByteBuffer mo12341a() {
        int a2 = mo12336a();
        if (a2 > f) {
            throw new ic(3, "Thrift binary size " + a2 + " out of range!");
        }
        c(a2);
        if (this.f14674a.b() >= a2) {
            ByteBuffer wrap = ByteBuffer.wrap(this.f14674a.a(), this.f14674a.a_(), a2);
            this.f14674a.a(a2);
            return wrap;
        }
        byte[] bArr = new byte[a2];
        this.f14674a.b(bArr, 0, a2);
        return ByteBuffer.wrap(bArr);
    }
}
