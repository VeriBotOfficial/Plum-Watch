package com.yandex.mobile.ads.impl;

import androidx.media3.container.Mp4Box;
import androidx.media3.extractor.mp4.Sniffer;
import java.io.IOException;

/* loaded from: classes5.dex */
final class u02 {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f17009a = {1769172845, 1769172786, 1769172787, 1769172788, 1769172789, 1769172790, 1769172793, Mp4Box.TYPE_avc1, Mp4Box.TYPE_hvc1, Mp4Box.TYPE_hev1, Mp4Box.TYPE_av01, 1836069937, 1836069938, 862401121, 862401122, 862417462, 862417718, 862414134, 862414646, 1295275552, 1295270176, 1714714144, 1801741417, 1295275600, Sniffer.BRAND_QUICKTIME, 1297305174, 1684175153, 1769172332, 1885955686};

    public static boolean a(wz wzVar) throws IOException {
        return a(wzVar, true, false);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static boolean a(a80 a80Var, boolean z, boolean z2) throws IOException {
        boolean z3;
        boolean z4;
        int i;
        int i2;
        long b = a80Var.b();
        long j = -1;
        int i3 = (b > (-1L) ? 1 : (b == (-1L) ? 0 : -1));
        long j2 = 4096;
        if (i3 != 0 && b <= 4096) {
            j2 = b;
        }
        int i4 = (int) j2;
        ag1 ag1Var = new ag1(64);
        int i5 = 0;
        int i6 = 0;
        boolean z5 = false;
        while (i6 < i4) {
            ag1Var.c(8);
            if (!a80Var.b(ag1Var.c(), i5, 8, true)) {
                break;
            }
            long v = ag1Var.v();
            int h = ag1Var.h();
            if (v == 1) {
                a80Var.a(ag1Var.c(), 8, 8);
                ag1Var.d(16);
                z4 = i5;
                i = i6;
                i2 = 16;
                v = ag1Var.p();
            } else {
                if (v == 0) {
                    long b2 = a80Var.b();
                    if (b2 != j) {
                        v = (b2 - a80Var.d()) + 8;
                    }
                }
                z4 = i5;
                i = i6;
                i2 = 8;
            }
            long j3 = i2;
            if (v < j3) {
                return z4;
            }
            int i7 = i + i2;
            boolean z6 = z4;
            if (h == 1836019574) {
                i4 += (int) v;
                if (i3 != 0 && i4 > b) {
                    i4 = (int) b;
                }
                i6 = i7;
                i5 = z6 ? 1 : 0;
                j = -1;
            } else {
                if (h == 1836019558 || h == 1836475768) {
                    z3 = true;
                    break;
                }
                int i8 = i3;
                if ((i7 + v) - j3 >= i4) {
                    break;
                }
                int i9 = (int) (v - j3);
                i6 = i7 + i9;
                if (h == 1718909296) {
                    if (i9 < 8) {
                        return z6;
                    }
                    ag1Var.c(i9);
                    a80Var.a(ag1Var.c(), z6 ? 1 : 0, i9);
                    int i10 = i9 / 4;
                    for (int i11 = 0; i11 < i10; i11++) {
                        if (i11 == 1) {
                            ag1Var.f(4);
                        } else {
                            int h2 = ag1Var.h();
                            if ((h2 >>> 8) != 3368816 && (h2 != 1751476579 || !z2)) {
                                int[] iArr = f17009a;
                                for (int i12 = 0; i12 < 29; i12++) {
                                    if (iArr[i12] != h2) {
                                    }
                                }
                            }
                            z5 = true;
                            break;
                        }
                    }
                    if (!z5) {
                        return false;
                    }
                } else if (i9 != 0) {
                    a80Var.b(i9);
                }
                i3 = i8;
                j = -1;
                i5 = 0;
            }
        }
        z3 = false;
        return z5 && z == z3;
    }

    public static boolean a(a80 a80Var, boolean z) throws IOException {
        return a(a80Var, false, z);
    }
}
