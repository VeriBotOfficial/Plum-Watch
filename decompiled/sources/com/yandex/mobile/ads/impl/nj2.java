package com.yandex.mobile.ads.impl;

import android.util.Pair;
import androidx.media3.extractor.WavUtil;
import java.io.IOException;

/* loaded from: classes5.dex */
final class nj2 {

    /* JADX INFO: Access modifiers changed from: private */
    static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f16350a;
        public final long b;

        public static a a(wz wzVar, ag1 ag1Var) throws IOException {
            wzVar.b(ag1Var.c(), 0, 8, false);
            ag1Var.e(0);
            return new a(ag1Var.h(), ag1Var.n());
        }

        private a(int i, long j) {
            this.f16350a = i;
            this.b = j;
        }
    }

    public static mj2 b(wz wzVar) throws IOException {
        byte[] bArr;
        ag1 ag1Var = new ag1(16);
        a a2 = a(WavUtil.FMT_FOURCC, wzVar, ag1Var);
        if (a2.b < 16) {
            throw new IllegalStateException();
        }
        wzVar.b(ag1Var.c(), 0, 16, false);
        ag1Var.e(0);
        int o = ag1Var.o();
        int o2 = ag1Var.o();
        int k = ag1Var.k();
        if (k < 0) {
            throw new IllegalStateException(oe.a("Top bit not zero: ", k));
        }
        int k2 = ag1Var.k();
        if (k2 < 0) {
            throw new IllegalStateException(oe.a("Top bit not zero: ", k2));
        }
        int o3 = ag1Var.o();
        int o4 = ag1Var.o();
        int i = ((int) a2.b) - 16;
        if (i > 0) {
            bArr = new byte[i];
            wzVar.b(bArr, 0, i, false);
        } else {
            bArr = f92.f;
        }
        wzVar.a((int) (wzVar.d() - wzVar.a()));
        return new mj2(o, o2, k, o3, o4, bArr);
    }

    public static boolean a(wz wzVar) throws IOException {
        ag1 ag1Var = new ag1(8);
        int i = a.a(wzVar, ag1Var).f16350a;
        if (i != 1380533830 && i != 1380333108) {
            return false;
        }
        wzVar.b(ag1Var.c(), 0, 4, false);
        ag1Var.e(0);
        int h = ag1Var.h();
        if (h == 1463899717) {
            return true;
        }
        et0.b("WavHeaderReader", "Unsupported form type: " + h);
        return false;
    }

    public static Pair c(wz wzVar) throws IOException {
        wzVar.c();
        a a2 = a(1684108385, wzVar, new ag1(8));
        wzVar.a(8);
        return Pair.create(Long.valueOf(wzVar.a()), Long.valueOf(a2.b));
    }

    private static a a(int i, wz wzVar, ag1 ag1Var) throws IOException {
        a a2 = a.a(wzVar, ag1Var);
        while (a2.f16350a != i) {
            et0.d("WavHeaderReader", "Ignoring unknown WAV chunk: " + a2.f16350a);
            long j = a2.b + 8;
            if (j <= 2147483647L) {
                wzVar.a((int) j);
                a2 = a.a(wzVar, ag1Var);
            } else {
                throw eg1.a("Chunk is too large (~2GB+) to skip; id: " + a2.f16350a);
            }
        }
        return a2;
    }
}
