package com.yandex.mobile.ads.impl;

import androidx.media3.extractor.OpusUtil;
import com.baidu.ar.base.MsgField;
import com.baidu.platform.comapi.bmsdk.BmLocated;
import com.iflytek.cloud.ErrorCode;
import com.wakeup.feature.device.white.record.PcmAudioUtil;
import com.yandex.mobile.ads.impl.jc0;
import java.util.Arrays;

/* loaded from: classes5.dex */
public final class o40 {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f16406a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    private static final int[] b = {-1, 8000, 16000, PcmAudioUtil.PCM_BYTES_PER_SEC, -1, -1, 11025, 22050, 44100, -1, -1, ErrorCode.MSP_ERROR_HTTP_BASE, ErrorCode.ERROR_TTS_INVALID_PARA, OpusUtil.SAMPLE_RATE, -1, -1};
    private static final int[] c = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, MsgField.MSG_ON_DOWNLOAD_RES_SUCCESS, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, BmLocated.HALF_LEFT_BOTTOM, 7680};

    public static jc0 a(byte[] bArr, String str, String str2) {
        zf1 zf1Var;
        if (bArr[0] == Byte.MAX_VALUE) {
            zf1Var = new zf1(bArr.length, bArr);
        } else {
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            byte b2 = copyOf[0];
            if (b2 == -2 || b2 == -1) {
                for (int i = 0; i < copyOf.length - 1; i += 2) {
                    byte b3 = copyOf[i];
                    int i2 = i + 1;
                    copyOf[i] = copyOf[i2];
                    copyOf[i2] = b3;
                }
            }
            zf1Var = new zf1(copyOf.length, copyOf);
            if (copyOf[0] == 31) {
                zf1 zf1Var2 = new zf1(copyOf.length, copyOf);
                while (zf1Var2.b() >= 16) {
                    zf1Var2.d(2);
                    zf1Var.a(zf1Var2.b(14));
                }
            }
            zf1Var.a(copyOf.length, copyOf);
        }
        zf1Var.d(60);
        int i3 = f16406a[zf1Var.b(6)];
        int i4 = b[zf1Var.b(4)];
        int b4 = zf1Var.b(5);
        int i5 = b4 < 29 ? (c[b4] * 1000) / 2 : -1;
        zf1Var.d(10);
        return new jc0.a().b(str).e("audio/vnd.dts").b(i5).c(i3 + (zf1Var.b(2) > 0 ? 1 : 0)).l(i4).a((f40) null).d(str2).a();
    }
}
