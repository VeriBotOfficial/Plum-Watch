package com.yandex.mobile.ads.impl;

import androidx.media3.extractor.OpusUtil;
import com.iflytek.cloud.ErrorCode;
import com.wakeup.feature.device.white.record.PcmAudioUtil;

/* loaded from: classes5.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f15328a = {96000, 88200, 64000, OpusUtil.SAMPLE_RATE, 44100, PcmAudioUtil.PCM_BYTES_PER_SEC, ErrorCode.ERROR_TTS_INVALID_PARA, 22050, 16000, ErrorCode.MSP_ERROR_HTTP_BASE, 11025, 8000, 7350};
    private static final int[] b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    public static a a(zf1 zf1Var, boolean z) throws eg1 {
        int i;
        int i2;
        int b2 = zf1Var.b(5);
        if (b2 == 31) {
            b2 = zf1Var.b(6) + 32;
        }
        int b3 = zf1Var.b(4);
        if (b3 == 15) {
            i = zf1Var.b(24);
        } else {
            if (b3 >= 13) {
                throw eg1.a((String) null, (Exception) null);
            }
            i = f15328a[b3];
        }
        int b4 = zf1Var.b(4);
        String a2 = oe.a("mp4a.40.", b2);
        if (b2 == 5 || b2 == 29) {
            int b5 = zf1Var.b(4);
            if (b5 == 15) {
                i2 = zf1Var.b(24);
            } else {
                if (b5 >= 13) {
                    throw eg1.a((String) null, (Exception) null);
                }
                i2 = f15328a[b5];
            }
            i = i2;
            int b6 = zf1Var.b(5);
            if (b6 == 31) {
                b6 = zf1Var.b(6) + 32;
            }
            b2 = b6;
            if (b2 == 22) {
                b4 = zf1Var.b(4);
            }
        }
        if (z) {
            if (b2 != 6 && b2 != 7 && b2 != 17 && b2 != 1 && b2 != 2 && b2 != 3 && b2 != 4) {
                switch (b2) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw eg1.a("Unsupported audio object type: " + b2);
                }
            }
            if (zf1Var.f()) {
                et0.d("AacUtil", "Unexpected frameLengthFlag = 1");
            }
            if (zf1Var.f()) {
                zf1Var.d(14);
            }
            boolean f = zf1Var.f();
            if (b4 == 0) {
                throw new UnsupportedOperationException();
            }
            if (b2 == 6 || b2 == 20) {
                zf1Var.d(3);
            }
            if (f) {
                if (b2 == 22) {
                    zf1Var.d(16);
                }
                if (b2 == 17 || b2 == 19 || b2 == 20 || b2 == 23) {
                    zf1Var.d(3);
                }
                zf1Var.d(1);
            }
            switch (b2) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int b7 = zf1Var.b(2);
                    if (b7 == 2 || b7 == 3) {
                        throw eg1.a("Unsupported epConfig: " + b7);
                    }
            }
        }
        int i3 = b[b4];
        if (i3 != -1) {
            return new a(i, i3, a2);
        }
        throw eg1.a((String) null, (Exception) null);
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f15329a;
        public final int b;
        public final String c;

        private a(int i, int i2, String str) {
            this.f15329a = i;
            this.b = i2;
            this.c = str;
        }
    }
}
