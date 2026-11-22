package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.os.Bundle;
import com.yandex.mobile.ads.impl.km;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class mw0 implements km {
    public static final mw0 H = new mw0(new a());
    public static final km.a<mw0> I = new km.a() { // from class: com.yandex.mobile.ads.impl.mw0$$ExternalSyntheticLambda0
        @Override // com.yandex.mobile.ads.impl.km.a
        public final km fromBundle(Bundle bundle) {
            mw0 a2;
            a2 = mw0.a(bundle);
            return a2;
        }
    };
    public final CharSequence A;
    public final Integer B;
    public final Integer C;
    public final CharSequence D;
    public final CharSequence E;
    public final CharSequence F;
    public final Bundle G;
    public final CharSequence b;
    public final CharSequence c;
    public final CharSequence d;
    public final CharSequence e;
    public final CharSequence f;
    public final CharSequence g;
    public final CharSequence h;
    public final kn1 i;
    public final kn1 j;
    public final byte[] k;
    public final Integer l;
    public final Uri m;
    public final Integer n;
    public final Integer o;
    public final Integer p;

    /* renamed from: q, reason: collision with root package name */
    public final Boolean f16282q;

    @Deprecated
    public final Integer r;
    public final Integer s;
    public final Integer t;
    public final Integer u;
    public final Integer v;
    public final Integer w;
    public final Integer x;
    public final CharSequence y;
    public final CharSequence z;

    public static final class a {
        private Integer A;
        private CharSequence B;
        private CharSequence C;
        private CharSequence D;
        private Bundle E;

        /* renamed from: a, reason: collision with root package name */
        private CharSequence f16283a;
        private CharSequence b;
        private CharSequence c;
        private CharSequence d;
        private CharSequence e;
        private CharSequence f;
        private CharSequence g;
        private kn1 h;
        private kn1 i;
        private byte[] j;
        private Integer k;
        private Uri l;
        private Integer m;
        private Integer n;
        private Integer o;
        private Boolean p;

        /* renamed from: q, reason: collision with root package name */
        private Integer f16284q;
        private Integer r;
        private Integer s;
        private Integer t;
        private Integer u;
        private Integer v;
        private CharSequence w;
        private CharSequence x;
        private CharSequence y;
        private Integer z;

        public final void a(int i, byte[] bArr) {
            if (this.j == null || f92.a((Object) Integer.valueOf(i), (Object) 3) || !f92.a((Object) this.k, (Object) 3)) {
                this.j = (byte[]) bArr.clone();
                this.k = Integer.valueOf(i);
            }
        }

        public final void b(String str) {
            this.c = str;
        }

        public final void c(String str) {
            this.b = str;
        }

        public final void d(String str) {
            this.x = str;
        }

        public final void e(String str) {
            this.y = str;
        }

        public final void f(String str) {
            this.g = str;
        }

        public final void g(String str) {
            this.B = str;
        }

        public final void h(String str) {
            this.D = str;
        }

        public final void i(String str) {
            this.f16283a = str;
        }

        public final void j(String str) {
            this.w = str;
        }

        public final void c(Integer num) {
            this.f16284q = num;
        }

        public final void d(Integer num) {
            this.v = num;
        }

        public final void e(Integer num) {
            this.u = num;
        }

        public final void f(Integer num) {
            this.t = num;
        }

        public final void g(Integer num) {
            this.n = num;
        }

        public a() {
        }

        private a(mw0 mw0Var) {
            this.f16283a = mw0Var.b;
            this.b = mw0Var.c;
            this.c = mw0Var.d;
            this.d = mw0Var.e;
            this.e = mw0Var.f;
            this.f = mw0Var.g;
            this.g = mw0Var.h;
            this.h = mw0Var.i;
            this.i = mw0Var.j;
            this.j = mw0Var.k;
            this.k = mw0Var.l;
            this.l = mw0Var.m;
            this.m = mw0Var.n;
            this.n = mw0Var.o;
            this.o = mw0Var.p;
            this.p = mw0Var.f16282q;
            this.f16284q = mw0Var.s;
            this.r = mw0Var.t;
            this.s = mw0Var.u;
            this.t = mw0Var.v;
            this.u = mw0Var.w;
            this.v = mw0Var.x;
            this.w = mw0Var.y;
            this.x = mw0Var.z;
            this.y = mw0Var.A;
            this.z = mw0Var.B;
            this.A = mw0Var.C;
            this.B = mw0Var.D;
            this.C = mw0Var.E;
            this.D = mw0Var.F;
            this.E = mw0Var.G;
        }

        public final a h(Integer num) {
            this.m = num;
            return this;
        }

        public final a b(Integer num) {
            this.r = num;
            return this;
        }

        public final a a(mw0 mw0Var) {
            if (mw0Var != null) {
                CharSequence charSequence = mw0Var.b;
                if (charSequence != null) {
                    this.f16283a = charSequence;
                }
                CharSequence charSequence2 = mw0Var.c;
                if (charSequence2 != null) {
                    this.b = charSequence2;
                }
                CharSequence charSequence3 = mw0Var.d;
                if (charSequence3 != null) {
                    this.c = charSequence3;
                }
                CharSequence charSequence4 = mw0Var.e;
                if (charSequence4 != null) {
                    this.d = charSequence4;
                }
                CharSequence charSequence5 = mw0Var.f;
                if (charSequence5 != null) {
                    this.e = charSequence5;
                }
                CharSequence charSequence6 = mw0Var.g;
                if (charSequence6 != null) {
                    this.f = charSequence6;
                }
                CharSequence charSequence7 = mw0Var.h;
                if (charSequence7 != null) {
                    this.g = charSequence7;
                }
                kn1 kn1Var = mw0Var.i;
                if (kn1Var != null) {
                    this.h = kn1Var;
                }
                kn1 kn1Var2 = mw0Var.j;
                if (kn1Var2 != null) {
                    this.i = kn1Var2;
                }
                byte[] bArr = mw0Var.k;
                if (bArr != null) {
                    Integer num = mw0Var.l;
                    this.j = (byte[]) bArr.clone();
                    this.k = num;
                }
                Uri uri = mw0Var.m;
                if (uri != null) {
                    this.l = uri;
                }
                Integer num2 = mw0Var.n;
                if (num2 != null) {
                    this.m = num2;
                }
                Integer num3 = mw0Var.o;
                if (num3 != null) {
                    this.n = num3;
                }
                Integer num4 = mw0Var.p;
                if (num4 != null) {
                    this.o = num4;
                }
                Boolean bool = mw0Var.f16282q;
                if (bool != null) {
                    this.p = bool;
                }
                Integer num5 = mw0Var.r;
                if (num5 != null) {
                    this.f16284q = num5;
                }
                Integer num6 = mw0Var.s;
                if (num6 != null) {
                    this.f16284q = num6;
                }
                Integer num7 = mw0Var.t;
                if (num7 != null) {
                    this.r = num7;
                }
                Integer num8 = mw0Var.u;
                if (num8 != null) {
                    this.s = num8;
                }
                Integer num9 = mw0Var.v;
                if (num9 != null) {
                    this.t = num9;
                }
                Integer num10 = mw0Var.w;
                if (num10 != null) {
                    this.u = num10;
                }
                Integer num11 = mw0Var.x;
                if (num11 != null) {
                    this.v = num11;
                }
                CharSequence charSequence8 = mw0Var.y;
                if (charSequence8 != null) {
                    this.w = charSequence8;
                }
                CharSequence charSequence9 = mw0Var.z;
                if (charSequence9 != null) {
                    this.x = charSequence9;
                }
                CharSequence charSequence10 = mw0Var.A;
                if (charSequence10 != null) {
                    this.y = charSequence10;
                }
                Integer num12 = mw0Var.B;
                if (num12 != null) {
                    this.z = num12;
                }
                Integer num13 = mw0Var.C;
                if (num13 != null) {
                    this.A = num13;
                }
                CharSequence charSequence11 = mw0Var.D;
                if (charSequence11 != null) {
                    this.B = charSequence11;
                }
                CharSequence charSequence12 = mw0Var.E;
                if (charSequence12 != null) {
                    this.C = charSequence12;
                }
                CharSequence charSequence13 = mw0Var.F;
                if (charSequence13 != null) {
                    this.D = charSequence13;
                }
                Bundle bundle = mw0Var.G;
                if (bundle != null) {
                    this.E = bundle;
                }
            }
            return this;
        }

        public final void a(String str) {
            this.d = str;
        }

        public final void a(Integer num) {
            this.s = num;
        }

        public final mw0 a() {
            return new mw0(this);
        }
    }

    public final a a() {
        return new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static mw0 a(Bundle bundle) {
        Bundle bundle2;
        Bundle bundle3;
        a aVar = new a();
        aVar.f16283a = bundle.getCharSequence(Integer.toString(0, 36));
        aVar.b = bundle.getCharSequence(Integer.toString(1, 36));
        aVar.c = bundle.getCharSequence(Integer.toString(2, 36));
        aVar.d = bundle.getCharSequence(Integer.toString(3, 36));
        aVar.e = bundle.getCharSequence(Integer.toString(4, 36));
        aVar.f = bundle.getCharSequence(Integer.toString(5, 36));
        aVar.g = bundle.getCharSequence(Integer.toString(6, 36));
        byte[] byteArray = bundle.getByteArray(Integer.toString(10, 36));
        Integer valueOf = bundle.containsKey(Integer.toString(29, 36)) ? Integer.valueOf(bundle.getInt(Integer.toString(29, 36))) : null;
        aVar.j = byteArray != null ? (byte[]) byteArray.clone() : null;
        aVar.k = valueOf;
        aVar.l = (Uri) bundle.getParcelable(Integer.toString(11, 36));
        aVar.w = bundle.getCharSequence(Integer.toString(22, 36));
        aVar.x = bundle.getCharSequence(Integer.toString(23, 36));
        aVar.y = bundle.getCharSequence(Integer.toString(24, 36));
        aVar.B = bundle.getCharSequence(Integer.toString(27, 36));
        aVar.C = bundle.getCharSequence(Integer.toString(28, 36));
        aVar.D = bundle.getCharSequence(Integer.toString(30, 36));
        aVar.E = bundle.getBundle(Integer.toString(1000, 36));
        if (bundle.containsKey(Integer.toString(8, 36)) && (bundle3 = bundle.getBundle(Integer.toString(8, 36))) != null) {
            aVar.h = kn1.b.fromBundle(bundle3);
        }
        if (bundle.containsKey(Integer.toString(9, 36)) && (bundle2 = bundle.getBundle(Integer.toString(9, 36))) != null) {
            aVar.i = kn1.b.fromBundle(bundle2);
        }
        if (bundle.containsKey(Integer.toString(12, 36))) {
            aVar.m = Integer.valueOf(bundle.getInt(Integer.toString(12, 36)));
        }
        if (bundle.containsKey(Integer.toString(13, 36))) {
            aVar.n = Integer.valueOf(bundle.getInt(Integer.toString(13, 36)));
        }
        if (bundle.containsKey(Integer.toString(14, 36))) {
            aVar.o = Integer.valueOf(bundle.getInt(Integer.toString(14, 36)));
        }
        if (bundle.containsKey(Integer.toString(15, 36))) {
            aVar.p = Boolean.valueOf(bundle.getBoolean(Integer.toString(15, 36)));
        }
        if (bundle.containsKey(Integer.toString(16, 36))) {
            aVar.f16284q = Integer.valueOf(bundle.getInt(Integer.toString(16, 36)));
        }
        if (bundle.containsKey(Integer.toString(17, 36))) {
            aVar.r = Integer.valueOf(bundle.getInt(Integer.toString(17, 36)));
        }
        if (bundle.containsKey(Integer.toString(18, 36))) {
            aVar.s = Integer.valueOf(bundle.getInt(Integer.toString(18, 36)));
        }
        if (bundle.containsKey(Integer.toString(19, 36))) {
            aVar.t = Integer.valueOf(bundle.getInt(Integer.toString(19, 36)));
        }
        if (bundle.containsKey(Integer.toString(20, 36))) {
            aVar.u = Integer.valueOf(bundle.getInt(Integer.toString(20, 36)));
        }
        if (bundle.containsKey(Integer.toString(21, 36))) {
            aVar.v = Integer.valueOf(bundle.getInt(Integer.toString(21, 36)));
        }
        if (bundle.containsKey(Integer.toString(25, 36))) {
            aVar.z = Integer.valueOf(bundle.getInt(Integer.toString(25, 36)));
        }
        if (bundle.containsKey(Integer.toString(26, 36))) {
            aVar.A = Integer.valueOf(bundle.getInt(Integer.toString(26, 36)));
        }
        return new mw0(aVar);
    }

    private mw0(a aVar) {
        this.b = aVar.f16283a;
        this.c = aVar.b;
        this.d = aVar.c;
        this.e = aVar.d;
        this.f = aVar.e;
        this.g = aVar.f;
        this.h = aVar.g;
        this.i = aVar.h;
        this.j = aVar.i;
        this.k = aVar.j;
        this.l = aVar.k;
        this.m = aVar.l;
        this.n = aVar.m;
        this.o = aVar.n;
        this.p = aVar.o;
        this.f16282q = aVar.p;
        Integer num = aVar.f16284q;
        this.r = num;
        this.s = num;
        this.t = aVar.r;
        this.u = aVar.s;
        this.v = aVar.t;
        this.w = aVar.u;
        this.x = aVar.v;
        this.y = aVar.w;
        this.z = aVar.x;
        this.A = aVar.y;
        this.B = aVar.z;
        this.C = aVar.A;
        this.D = aVar.B;
        this.E = aVar.C;
        this.F = aVar.D;
        this.G = aVar.E;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && mw0.class == obj.getClass()) {
            mw0 mw0Var = (mw0) obj;
            if (f92.a(this.b, mw0Var.b) && f92.a(this.c, mw0Var.c) && f92.a(this.d, mw0Var.d) && f92.a(this.e, mw0Var.e) && f92.a(this.f, mw0Var.f) && f92.a(this.g, mw0Var.g) && f92.a(this.h, mw0Var.h) && f92.a(this.i, mw0Var.i) && f92.a(this.j, mw0Var.j) && Arrays.equals(this.k, mw0Var.k) && f92.a(this.l, mw0Var.l) && f92.a(this.m, mw0Var.m) && f92.a(this.n, mw0Var.n) && f92.a(this.o, mw0Var.o) && f92.a(this.p, mw0Var.p) && f92.a(this.f16282q, mw0Var.f16282q) && f92.a(this.s, mw0Var.s) && f92.a(this.t, mw0Var.t) && f92.a(this.u, mw0Var.u) && f92.a(this.v, mw0Var.v) && f92.a(this.w, mw0Var.w) && f92.a(this.x, mw0Var.x) && f92.a(this.y, mw0Var.y) && f92.a(this.z, mw0Var.z) && f92.a(this.A, mw0Var.A) && f92.a(this.B, mw0Var.B) && f92.a(this.C, mw0Var.C) && f92.a(this.D, mw0Var.D) && f92.a(this.E, mw0Var.E) && f92.a(this.F, mw0Var.F)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, Integer.valueOf(Arrays.hashCode(this.k)), this.l, this.m, this.n, this.o, this.p, this.f16282q, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F});
    }
}
