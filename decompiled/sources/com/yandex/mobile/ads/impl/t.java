package com.yandex.mobile.ads.impl;

import androidx.media3.extractor.OpusUtil;
import com.iflytek.cloud.ErrorCode;
import com.luck.picture.lib.config.Crop;
import com.wakeup.feature.device.white.record.PcmAudioUtil;
import com.yandex.mobile.ads.impl.jc0;
import io.agora.rtc2.internal.RtcEngineEvent;
import java.nio.ByteBuffer;
import org.apache.commons.net.telnet.TelnetCommand;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: classes5.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    private static final int[] f16914a = {1, 2, 3, 6};
    private static final int[] b = {OpusUtil.SAMPLE_RATE, 44100, PcmAudioUtil.PCM_BYTES_PER_SEC};
    private static final int[] c = {ErrorCode.ERROR_TTS_INVALID_PARA, 22050, 16000};
    private static final int[] d = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    private static final int[] f = {69, 87, 104, 121, 139, 174, 208, TelnetCommand.BREAK, 278, 348, 417, 487, 557, Crop.REQUEST_EDIT_CROP, 835, 975, RtcEngineEvent.EvtType.EVT_JOIN_PUBILSHER_RESPONSE, 1253, 1393};

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f16915a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;

        private a(String str, int i, int i2, int i3, int i4) {
            this.f16915a = str;
            this.c = i;
            this.b = i2;
            this.d = i3;
            this.e = i4;
        }
    }

    public static jc0 b(ag1 ag1Var, String str, String str2, f40 f40Var) {
        String str3;
        ag1Var.f(2);
        int i = b[(ag1Var.t() & 192) >> 6];
        int t = ag1Var.t();
        int i2 = d[(t & 14) >> 1];
        if ((t & 1) != 0) {
            i2++;
        }
        if (((ag1Var.t() & 30) >> 1) > 0 && (2 & ag1Var.t()) != 0) {
            i2 += 2;
        }
        if (ag1Var.a() > 0 && (ag1Var.t() & 1) != 0) {
            str3 = "audio/eac3-joc";
        } else {
            str3 = "audio/eac3";
        }
        return new jc0.a().b(str).e(str3).c(i2).l(i).a(f40Var).d(str2).a();
    }

    private static int a(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0) {
            return -1;
        }
        int[] iArr = b;
        if (i >= 3 || i2 < 0) {
            return -1;
        }
        int[] iArr2 = f;
        if (i3 >= 19) {
            return -1;
        }
        int i4 = iArr[i];
        if (i4 == 44100) {
            return ((i2 % 2) + iArr2[i3]) * 2;
        }
        int i5 = e[i3];
        return i4 == 32000 ? i5 * 6 : i5 * 4;
    }

    public static jc0 a(ag1 ag1Var, String str, String str2, f40 f40Var) {
        int i = b[(ag1Var.t() & 192) >> 6];
        int t = ag1Var.t();
        int i2 = d[(t & 56) >> 3];
        if ((t & 4) != 0) {
            i2++;
        }
        return new jc0.a().b(str).e("audio/ac3").c(i2).l(i).a(f40Var).d(str2).a();
    }

    public static int a(ByteBuffer byteBuffer) {
        if (((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10) {
            return f16914a[((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? (byteBuffer.get(byteBuffer.position() + 4) & BuiltinOptions.SliceOptions) >> 4 : 3] * 256;
        }
        return 1536;
    }

    public static a a(zf1 zf1Var) {
        int a2;
        int i;
        int i2;
        int i3;
        String str;
        int b2;
        int i4;
        int i5;
        String str2;
        int i6;
        int i7;
        int e2 = zf1Var.e();
        zf1Var.d(40);
        boolean z = zf1Var.b(5) > 10;
        zf1Var.c(e2);
        if (z) {
            zf1Var.d(16);
            int b3 = zf1Var.b(2);
            if (b3 == 0) {
                r1 = 0;
            } else if (b3 == 1) {
                r1 = 1;
            } else if (b3 == 2) {
                r1 = 2;
            }
            zf1Var.d(3);
            a2 = (zf1Var.b(11) + 1) * 2;
            int b4 = zf1Var.b(2);
            if (b4 == 3) {
                i3 = c[zf1Var.b(2)];
                i4 = 6;
                b2 = 3;
            } else {
                b2 = zf1Var.b(2);
                i4 = f16914a[b2];
                i3 = b[b4];
            }
            i2 = i4 * 256;
            int b5 = zf1Var.b(3);
            boolean f2 = zf1Var.f();
            i = d[b5] + (f2 ? 1 : 0);
            zf1Var.d(10);
            if (zf1Var.f()) {
                zf1Var.d(8);
            }
            if (b5 == 0) {
                zf1Var.d(5);
                if (zf1Var.f()) {
                    zf1Var.d(8);
                }
            }
            if (r1 == 1 && zf1Var.f()) {
                zf1Var.d(16);
            }
            if (zf1Var.f()) {
                if (b5 > 2) {
                    zf1Var.d(2);
                }
                if ((b5 & 1) == 0 || b5 <= 2) {
                    i6 = 6;
                } else {
                    i6 = 6;
                    zf1Var.d(6);
                }
                if ((b5 & 4) != 0) {
                    zf1Var.d(i6);
                }
                if (f2 && zf1Var.f()) {
                    zf1Var.d(5);
                }
                if (r1 == 0) {
                    if (zf1Var.f()) {
                        i7 = 6;
                        zf1Var.d(6);
                    } else {
                        i7 = 6;
                    }
                    if (b5 == 0 && zf1Var.f()) {
                        zf1Var.d(i7);
                    }
                    if (zf1Var.f()) {
                        zf1Var.d(i7);
                    }
                    int b6 = zf1Var.b(2);
                    if (b6 == 1) {
                        zf1Var.d(5);
                    } else if (b6 == 2) {
                        zf1Var.d(12);
                    } else if (b6 == 3) {
                        int b7 = zf1Var.b(5);
                        if (zf1Var.f()) {
                            zf1Var.d(5);
                            if (zf1Var.f()) {
                                zf1Var.d(4);
                            }
                            if (zf1Var.f()) {
                                zf1Var.d(4);
                            }
                            if (zf1Var.f()) {
                                zf1Var.d(4);
                            }
                            if (zf1Var.f()) {
                                zf1Var.d(4);
                            }
                            if (zf1Var.f()) {
                                zf1Var.d(4);
                            }
                            if (zf1Var.f()) {
                                zf1Var.d(4);
                            }
                            if (zf1Var.f()) {
                                zf1Var.d(4);
                            }
                            if (zf1Var.f()) {
                                if (zf1Var.f()) {
                                    zf1Var.d(4);
                                }
                                if (zf1Var.f()) {
                                    zf1Var.d(4);
                                }
                            }
                        }
                        if (zf1Var.f()) {
                            zf1Var.d(5);
                            if (zf1Var.f()) {
                                zf1Var.d(7);
                                if (zf1Var.f()) {
                                    zf1Var.d(8);
                                }
                            }
                        }
                        zf1Var.d((b7 + 2) * 8);
                        zf1Var.c();
                    }
                    if (b5 < 2) {
                        if (zf1Var.f()) {
                            zf1Var.d(14);
                        }
                        if (b5 == 0 && zf1Var.f()) {
                            zf1Var.d(14);
                        }
                    }
                    if (zf1Var.f()) {
                        if (b2 == 0) {
                            zf1Var.d(5);
                        } else {
                            for (int i8 = 0; i8 < i4; i8++) {
                                if (zf1Var.f()) {
                                    zf1Var.d(5);
                                }
                            }
                        }
                    }
                }
            }
            if (zf1Var.f()) {
                zf1Var.d(5);
                if (b5 == 2) {
                    zf1Var.d(4);
                }
                if (b5 >= 6) {
                    zf1Var.d(2);
                }
                if (zf1Var.f()) {
                    zf1Var.d(8);
                }
                if (b5 == 0 && zf1Var.f()) {
                    zf1Var.d(8);
                }
                if (b4 < 3) {
                    zf1Var.h();
                }
            }
            if (r1 == 0 && b2 != 3) {
                zf1Var.h();
            }
            if (r1 == 2 && (b2 == 3 || zf1Var.f())) {
                i5 = 6;
                zf1Var.d(6);
            } else {
                i5 = 6;
            }
            if (zf1Var.f() && zf1Var.b(i5) == 1 && zf1Var.b(8) == 1) {
                str2 = "audio/eac3-joc";
            } else {
                str2 = "audio/eac3";
            }
            str = str2;
        } else {
            zf1Var.d(32);
            int b8 = zf1Var.b(2);
            String str3 = b8 == 3 ? null : "audio/ac3";
            a2 = a(b8, zf1Var.b(6));
            zf1Var.d(8);
            int b9 = zf1Var.b(3);
            if ((b9 & 1) != 0 && b9 != 1) {
                zf1Var.d(2);
            }
            if ((b9 & 4) != 0) {
                zf1Var.d(2);
            }
            if (b9 == 2) {
                zf1Var.d(2);
            }
            r1 = b8 < 3 ? b[b8] : -1;
            i = d[b9] + (zf1Var.f() ? 1 : 0);
            i2 = 1536;
            i3 = r1;
            str = str3;
        }
        return new a(str, i, i3, a2, i2);
    }

    public static int a(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (((bArr[5] & 248) >> 3) > 10) {
            return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
        }
        byte b2 = bArr[4];
        return a((b2 & 192) >> 6, b2 & 63);
    }
}
