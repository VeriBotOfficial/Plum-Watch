package com.anythink.basead.exoplayer.b;

import androidx.media3.extractor.OpusUtil;
import com.baidu.ar.base.MsgField;
import com.baidu.platform.comapi.bmsdk.BmLocated;
import com.iflytek.cloud.ErrorCode;
import com.liulishuo.filedownloader.model.FileDownloadStatus;
import com.wakeup.feature.device.white.record.PcmAudioUtil;
import java.nio.ByteBuffer;
import java.util.Arrays;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: classes11.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private static final int f2396a = 2147385345;
    private static final int b = 536864768;
    private static final int c = -25230976;
    private static final int d = -14745368;
    private static final byte e = Byte.MAX_VALUE;
    private static final byte f = 31;
    private static final byte g = -2;
    private static final byte h = -1;
    private static final int[] i = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};
    private static final int[] j = {-1, 8000, 16000, PcmAudioUtil.PCM_BYTES_PER_SEC, -1, -1, 11025, 22050, 44100, -1, -1, ErrorCode.MSP_ERROR_HTTP_BASE, ErrorCode.ERROR_TTS_INVALID_PARA, OpusUtil.SAMPLE_RATE, -1, -1};
    private static final int[] k = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, MsgField.MSG_ON_DOWNLOAD_RES_SUCCESS, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, BmLocated.HALF_LEFT_BOTTOM, 7680};

    private static boolean a(int i2) {
        return i2 == f2396a || i2 == c || i2 == b || i2 == d;
    }

    private static int a(byte[] bArr) {
        int i2;
        byte b2;
        int i3;
        byte b3;
        byte b4 = bArr[0];
        if (b4 != -2) {
            if (b4 == -1) {
                i2 = (bArr[4] & 7) << 4;
                b3 = bArr[7];
            } else if (b4 == 31) {
                i2 = (bArr[5] & 7) << 4;
                b3 = bArr[6];
            } else {
                i2 = (bArr[4] & 1) << 6;
                b2 = bArr[5];
            }
            i3 = b3 & BuiltinOptions.LogicalOrOptions;
            return (((i3 >> 2) | i2) + 1) * 32;
        }
        i2 = (bArr[5] & 1) << 6;
        b2 = bArr[4];
        i3 = b2 & FileDownloadStatus.warn;
        return (((i3 >> 2) | i2) + 1) * 32;
    }

    public static int a(ByteBuffer byteBuffer) {
        int i2;
        byte b2;
        int i3;
        byte b3;
        int position = byteBuffer.position();
        byte b4 = byteBuffer.get(position);
        if (b4 != -2) {
            if (b4 == -1) {
                i2 = (byteBuffer.get(position + 4) & 7) << 4;
                b3 = byteBuffer.get(position + 7);
            } else if (b4 == 31) {
                i2 = (byteBuffer.get(position + 5) & 7) << 4;
                b3 = byteBuffer.get(position + 6);
            } else {
                i2 = (byteBuffer.get(position + 4) & 1) << 6;
                b2 = byteBuffer.get(position + 5);
            }
            i3 = b3 & BuiltinOptions.LogicalOrOptions;
            return (((i3 >> 2) | i2) + 1) * 32;
        }
        i2 = (byteBuffer.get(position + 5) & 1) << 6;
        b2 = byteBuffer.get(position + 4);
        i3 = b2 & FileDownloadStatus.warn;
        return (((i3 >> 2) | i2) + 1) * 32;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static int b(byte[] r7) {
        /*
            r0 = 0
            r1 = r7[r0]
            r2 = -2
            r3 = 6
            r4 = 7
            r5 = 1
            r6 = 4
            if (r1 == r2) goto L4a
            r2 = -1
            if (r1 == r2) goto L32
            r2 = 31
            if (r1 == r2) goto L21
            r1 = 5
            r1 = r7[r1]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r4]
            goto L58
        L21:
            r0 = r7[r3]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 8
            r7 = r7[r1]
            goto L42
        L32:
            r0 = r7[r4]
            r0 = r0 & 3
            int r0 = r0 << 12
            r1 = r7[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 9
            r7 = r7[r1]
        L42:
            r7 = r7 & 60
            int r7 = r7 >> 2
            r7 = r7 | r0
            int r7 = r7 + r5
            r0 = r5
            goto L5d
        L4a:
            r1 = r7[r6]
            r1 = r1 & 3
            int r1 = r1 << 12
            r2 = r7[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            r7 = r7[r3]
        L58:
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r6
            r7 = r7 | r1
            int r7 = r7 + r5
        L5d:
            if (r0 == 0) goto L63
            int r7 = r7 * 16
            int r7 = r7 / 14
        L63:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.exoplayer.b.m.b(byte[]):int");
    }

    private static com.anythink.basead.exoplayer.k.r c(byte[] bArr) {
        if (bArr[0] == Byte.MAX_VALUE) {
            return new com.anythink.basead.exoplayer.k.r(bArr);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        byte b2 = copyOf[0];
        if (b2 == -2 || b2 == -1) {
            for (int i2 = 0; i2 < copyOf.length - 1; i2 += 2) {
                byte b3 = copyOf[i2];
                int i3 = i2 + 1;
                copyOf[i2] = copyOf[i3];
                copyOf[i3] = b3;
            }
        }
        com.anythink.basead.exoplayer.k.r rVar = new com.anythink.basead.exoplayer.k.r(copyOf);
        if (copyOf[0] == 31) {
            com.anythink.basead.exoplayer.k.r rVar2 = new com.anythink.basead.exoplayer.k.r(copyOf);
            while (rVar2.a() >= 16) {
                rVar2.b(2);
                rVar.d(rVar2.c(14));
            }
        }
        rVar.a(copyOf, copyOf.length);
        return rVar;
    }

    private static boolean d(byte[] bArr) {
        byte b2 = bArr[0];
        return b2 == -2 || b2 == -1;
    }

    private m() {
    }

    private static com.anythink.basead.exoplayer.m a(byte[] bArr, String str, String str2, com.anythink.basead.exoplayer.d.e eVar) {
        com.anythink.basead.exoplayer.k.r rVar;
        if (bArr[0] == Byte.MAX_VALUE) {
            rVar = new com.anythink.basead.exoplayer.k.r(bArr);
        } else {
            byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
            byte b2 = copyOf[0];
            if (b2 == -2 || b2 == -1) {
                for (int i2 = 0; i2 < copyOf.length - 1; i2 += 2) {
                    byte b3 = copyOf[i2];
                    int i3 = i2 + 1;
                    copyOf[i2] = copyOf[i3];
                    copyOf[i3] = b3;
                }
            }
            rVar = new com.anythink.basead.exoplayer.k.r(copyOf);
            if (copyOf[0] == 31) {
                com.anythink.basead.exoplayer.k.r rVar2 = new com.anythink.basead.exoplayer.k.r(copyOf);
                while (rVar2.a() >= 16) {
                    rVar2.b(2);
                    rVar.d(rVar2.c(14));
                }
            }
            rVar.a(copyOf, copyOf.length);
        }
        rVar.b(60);
        int i4 = i[rVar.c(6)];
        int i5 = j[rVar.c(4)];
        int c2 = rVar.c(5);
        int[] iArr = k;
        int i6 = c2 < iArr.length ? (iArr[c2] * 1000) / 2 : -1;
        rVar.b(10);
        return com.anythink.basead.exoplayer.m.a(str, "audio/vnd.dts", null, i6, i4 + (rVar.c(2) > 0 ? 1 : 0), i5, null, eVar, str2);
    }
}
