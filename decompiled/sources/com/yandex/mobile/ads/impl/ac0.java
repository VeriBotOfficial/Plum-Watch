package com.yandex.mobile.ads.impl;

import androidx.media3.extractor.DtsUtil;
import androidx.media3.extractor.OpusUtil;
import com.iflytek.cloud.ErrorCode;
import com.wakeup.feature.device.white.record.PcmAudioUtil;
import com.yandex.mobile.ads.impl.jc0;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public final class ac0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f14992a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final long j;
    public final a k;
    private final k01 l;

    private static int a(int i) {
        if (i == 8) {
            return 1;
        }
        if (i == 12) {
            return 2;
        }
        if (i == 16) {
            return 4;
        }
        if (i != 20) {
            return i != 24 ? -1 : 6;
        }
        return 5;
    }

    private static int b(int i) {
        switch (i) {
            case 8000:
                return 4;
            case 16000:
                return 5;
            case 22050:
                return 6;
            case ErrorCode.ERROR_TTS_INVALID_PARA /* 24000 */:
                return 7;
            case PcmAudioUtil.PCM_BYTES_PER_SEC /* 32000 */:
                return 8;
            case 44100:
                return 9;
            case OpusUtil.SAMPLE_RATE /* 48000 */:
                return 10;
            case 88200:
                return 1;
            case 96000:
                return 11;
            case 176400:
                return 2;
            case DtsUtil.DTS_MAX_RATE_BYTES_PER_SECOND /* 192000 */:
                return 3;
            default:
                return -1;
        }
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public final long[] f14993a;
        public final long[] b;

        public a(long[] jArr, long[] jArr2) {
            this.f14993a = jArr;
            this.b = jArr2;
        }
    }

    private ac0(int i, int i2, int i3, int i4, int i5, int i6, int i7, long j, a aVar, k01 k01Var) {
        this.f14992a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
        this.e = i5;
        this.f = b(i5);
        this.g = i6;
        this.h = i7;
        this.i = a(i7);
        this.j = j;
        this.k = aVar;
        this.l = k01Var;
    }

    public ac0(int i, byte[] bArr) {
        zf1 zf1Var = new zf1(bArr);
        zf1Var.c(i * 8);
        this.f14992a = zf1Var.b(16);
        this.b = zf1Var.b(16);
        this.c = zf1Var.b(24);
        this.d = zf1Var.b(24);
        int b = zf1Var.b(20);
        this.e = b;
        this.f = b(b);
        this.g = zf1Var.b(3) + 1;
        int b2 = zf1Var.b(5) + 1;
        this.h = b2;
        this.i = a(b2);
        this.j = zf1Var.g();
        this.k = null;
        this.l = null;
    }

    public final ac0 b(List<String> list) {
        k01 a2 = gj2.a(list);
        k01 k01Var = this.l;
        if (k01Var != null) {
            a2 = k01Var.a(a2);
        }
        return new ac0(this.f14992a, this.b, this.c, this.d, this.e, this.g, this.h, this.j, this.k, a2);
    }

    public final ac0 a(List<jh1> list) {
        k01 k01Var = new k01(list);
        k01 k01Var2 = this.l;
        if (k01Var2 != null) {
            k01Var = k01Var2.a(k01Var);
        }
        return new ac0(this.f14992a, this.b, this.c, this.d, this.e, this.g, this.h, this.j, this.k, k01Var);
    }

    public final long b() {
        long j = this.j;
        if (j == 0) {
            return -9223372036854775807L;
        }
        return (j * 1000000) / this.e;
    }

    public final long a() {
        long j;
        long j2;
        int i = this.d;
        if (i > 0) {
            j = (i + this.c) / 2;
            j2 = 1;
        } else {
            int i2 = this.f14992a;
            j = ((((i2 != this.b || i2 <= 0) ? 4096L : i2) * this.g) * this.h) / 8;
            j2 = 64;
        }
        return j + j2;
    }

    public final jc0 a(byte[] bArr, k01 k01Var) {
        bArr[4] = Byte.MIN_VALUE;
        int i = this.d;
        if (i <= 0) {
            i = -1;
        }
        k01 k01Var2 = this.l;
        if (k01Var2 != null) {
            k01Var = k01Var2.a(k01Var);
        }
        return new jc0.a().e("audio/flac").h(i).c(this.g).l(this.e).a(Collections.singletonList(bArr)).a(k01Var).a();
    }

    public final long a(long j) {
        long j2 = (j * this.e) / 1000000;
        long j3 = this.j - 1;
        int i = f92.f15466a;
        return Math.max(0L, Math.min(j2, j3));
    }

    public final ac0 a(a aVar) {
        return new ac0(this.f14992a, this.b, this.c, this.d, this.e, this.g, this.h, this.j, aVar, this.l);
    }
}
