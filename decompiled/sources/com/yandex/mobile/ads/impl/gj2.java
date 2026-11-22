package com.yandex.mobile.ads.impl;

import android.util.Base64;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes5.dex */
public final class gj2 {

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String[] f15600a;

        public a(String[] strArr) {
            this.f15600a = strArr;
        }
    }

    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final boolean f15601a;

        public b(boolean z) {
            this.f15601a = z;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final int f15602a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final byte[] g;

        public c(int i, int i2, int i3, int i4, int i5, int i6, byte[] bArr) {
            this.f15602a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
            this.g = bArr;
        }
    }

    public static a a(ag1 ag1Var, boolean z, boolean z2) throws eg1 {
        if (z) {
            a(3, ag1Var, false);
        }
        ag1Var.a((int) ag1Var.n(), lo.c);
        long n = ag1Var.n();
        String[] strArr = new String[(int) n];
        for (int i = 0; i < n; i++) {
            strArr[i] = ag1Var.a((int) ag1Var.n(), lo.c);
        }
        if (z2 && (ag1Var.t() & 1) == 0) {
            throw eg1.a("framing bit expected to be set", (Exception) null);
        }
        return new a(strArr);
    }

    public static c a(ag1 ag1Var) throws eg1 {
        a(1, ag1Var, false);
        int k = ag1Var.k();
        if (k >= 0) {
            int t = ag1Var.t();
            int k2 = ag1Var.k();
            if (k2 >= 0) {
                int k3 = ag1Var.k();
                int i = k3 <= 0 ? -1 : k3;
                int k4 = ag1Var.k();
                int i2 = k4 <= 0 ? -1 : k4;
                ag1Var.k();
                int t2 = ag1Var.t();
                int pow = (int) Math.pow(2.0d, t2 & 15);
                int pow2 = (int) Math.pow(2.0d, (t2 & 240) >> 4);
                ag1Var.t();
                return new c(t, k2, i, i2, pow, pow2, Arrays.copyOf(ag1Var.c(), ag1Var.e()));
            }
            throw new IllegalStateException(oe.a("Top bit not zero: ", k2));
        }
        throw new IllegalStateException(oe.a("Top bit not zero: ", k));
    }

    public static boolean a(int i, ag1 ag1Var, boolean z) throws eg1 {
        if (ag1Var.a() < 7) {
            if (z) {
                return false;
            }
            throw eg1.a("too short header: " + ag1Var.a(), (Exception) null);
        }
        if (ag1Var.t() != i) {
            if (z) {
                return false;
            }
            throw eg1.a("expected header type " + Integer.toHexString(i), (Exception) null);
        }
        if (ag1Var.t() == 118 && ag1Var.t() == 111 && ag1Var.t() == 114 && ag1Var.t() == 98 && ag1Var.t() == 105 && ag1Var.t() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw eg1.a("expected characters 'vorbis'", (Exception) null);
    }

    public static k01 a(List<String> list) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            String str = list.get(i);
            int i2 = f92.f15466a;
            String[] split = str.split("=", 2);
            if (split.length != 2) {
                et0.d("VorbisUtil", "Failed to parse Vorbis comment: ".concat(str));
            } else if (split[0].equals("METADATA_BLOCK_PICTURE")) {
                try {
                    ag1 ag1Var = new ag1(Base64.decode(split[1], 0));
                    int h = ag1Var.h();
                    String a2 = ag1Var.a(ag1Var.h(), lo.f16153a);
                    String a3 = ag1Var.a(ag1Var.h(), lo.c);
                    int h2 = ag1Var.h();
                    int h3 = ag1Var.h();
                    int h4 = ag1Var.h();
                    int h5 = ag1Var.h();
                    int h6 = ag1Var.h();
                    byte[] bArr = new byte[h6];
                    ag1Var.a(bArr, 0, h6);
                    arrayList.add(new jh1(h, a2, a3, h2, h3, h4, h5, bArr));
                } catch (RuntimeException e) {
                    et0.b("VorbisUtil", "Failed to parse vorbis picture", e);
                }
            } else {
                arrayList.add(new ej2(split[0], split[1]));
            }
        }
        if (arrayList.isEmpty()) {
            return null;
        }
        return new k01(arrayList);
    }
}
