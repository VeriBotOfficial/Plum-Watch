package com.anythink.basead.exoplayer.b;

import androidx.media3.extractor.OpusUtil;
import com.iflytek.cloud.ErrorCode;
import com.luck.picture.lib.config.Crop;
import com.wakeup.feature.device.white.record.PcmAudioUtil;
import io.agora.rtc2.internal.RtcEngineEvent;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.nio.ByteBuffer;
import org.apache.commons.net.telnet.TelnetCommand;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final int f2367a = 16;
    public static final int b = 10;
    private static final int c = 256;
    private static final int d = 1536;
    private static final int[] e = {1, 2, 3, 6};
    private static final int[] f = {OpusUtil.SAMPLE_RATE, 44100, PcmAudioUtil.PCM_BYTES_PER_SEC};
    private static final int[] g = {ErrorCode.ERROR_TTS_INVALID_PARA, 22050, 16000};
    private static final int[] h = {2, 1, 2, 3, 3, 4, 4, 5};
    private static final int[] i = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};
    private static final int[] j = {69, 87, 104, 121, 139, 174, 208, TelnetCommand.BREAK, 278, 348, 417, 487, 557, Crop.REQUEST_EDIT_CROP, 835, 975, RtcEngineEvent.EvtType.EVT_JOIN_PUBILSHER_RESPONSE, 1253, 1393};

    public static int a() {
        return d;
    }

    /* renamed from: com.anythink.basead.exoplayer.b.a$a, reason: collision with other inner class name */
    public static final class C0131a {

        /* renamed from: a, reason: collision with root package name */
        public static final int f2368a = -1;
        public static final int b = 0;
        public static final int c = 1;
        public static final int d = 2;
        public final String e;
        public final int f;
        public final int g;
        public final int h;
        public final int i;
        public final int j;

        @Retention(RetentionPolicy.SOURCE)
        /* renamed from: com.anythink.basead.exoplayer.b.a$a$a, reason: collision with other inner class name */
        public @interface InterfaceC0132a {
        }

        /* synthetic */ C0131a(String str, int i, int i2, int i3, int i4, int i5, byte b2) {
            this(str, i, i2, i3, i4, i5);
        }

        private C0131a(String str, int i, int i2, int i3, int i4, int i5) {
            this.e = str;
            this.f = i;
            this.h = i2;
            this.g = i3;
            this.i = i4;
            this.j = i5;
        }
    }

    public static com.anythink.basead.exoplayer.m a(com.anythink.basead.exoplayer.k.s sVar, String str, String str2, com.anythink.basead.exoplayer.d.e eVar) {
        int i2 = f[(sVar.d() & 192) >> 6];
        int d2 = sVar.d();
        int i3 = h[(d2 & 56) >> 3];
        if ((d2 & 4) != 0) {
            i3++;
        }
        return com.anythink.basead.exoplayer.m.a(str, "audio/ac3", null, -1, i3, i2, null, eVar, str2);
    }

    public static com.anythink.basead.exoplayer.m b(com.anythink.basead.exoplayer.k.s sVar, String str, String str2, com.anythink.basead.exoplayer.d.e eVar) {
        String str3;
        sVar.d(2);
        int i2 = f[(sVar.d() & 192) >> 6];
        int d2 = sVar.d();
        int i3 = h[(d2 & 14) >> 1];
        if ((d2 & 1) != 0) {
            i3++;
        }
        if (((sVar.d() & 30) >> 1) > 0 && (2 & sVar.d()) != 0) {
            i3 += 2;
        }
        int i4 = i3;
        if (sVar.a() > 0 && (sVar.d() & 1) != 0) {
            str3 = "audio/eac3-joc";
        } else {
            str3 = "audio/eac3";
        }
        return com.anythink.basead.exoplayer.m.a(str, str3, null, -1, i4, i2, null, eVar, str2);
    }

    private static C0131a a(com.anythink.basead.exoplayer.k.r rVar) {
        int a2;
        int i2;
        int i3;
        String str;
        int i4;
        int c2;
        int i5;
        int i6;
        int b2 = rVar.b();
        rVar.b(40);
        boolean z = rVar.c(5) == 16;
        rVar.a(b2);
        int i7 = -1;
        if (z) {
            rVar.b(16);
            int c3 = rVar.c(2);
            if (c3 == 0) {
                i7 = 0;
            } else if (c3 == 1) {
                i7 = 1;
            } else if (c3 == 2) {
                i7 = 2;
            }
            rVar.b(3);
            a2 = (rVar.c(11) + 1) * 2;
            int c4 = rVar.c(2);
            if (c4 == 3) {
                i5 = 6;
                i2 = g[rVar.c(2)];
                c2 = 3;
            } else {
                c2 = rVar.c(2);
                i5 = e[c2];
                i2 = f[c4];
            }
            i4 = i5 * 256;
            int c5 = rVar.c(3);
            boolean d2 = rVar.d();
            i3 = h[c5] + (d2 ? 1 : 0);
            rVar.b(10);
            if (rVar.d()) {
                rVar.b(8);
            }
            if (c5 == 0) {
                rVar.b(5);
                if (rVar.d()) {
                    rVar.b(8);
                }
            }
            if (i7 == 1 && rVar.d()) {
                rVar.b(16);
            }
            if (rVar.d()) {
                if (c5 > 2) {
                    rVar.b(2);
                }
                if ((c5 & 1) != 0 && c5 > 2) {
                    rVar.b(6);
                }
                if ((c5 & 4) != 0) {
                    rVar.b(6);
                }
                if (d2 && rVar.d()) {
                    rVar.b(5);
                }
                if (i7 == 0) {
                    if (rVar.d()) {
                        rVar.b(6);
                    }
                    if (c5 == 0 && rVar.d()) {
                        rVar.b(6);
                    }
                    if (rVar.d()) {
                        rVar.b(6);
                    }
                    int c6 = rVar.c(2);
                    if (c6 == 1) {
                        rVar.b(5);
                    } else if (c6 == 2) {
                        rVar.b(12);
                    } else if (c6 == 3) {
                        int c7 = rVar.c(5);
                        if (rVar.d()) {
                            rVar.b(5);
                            if (rVar.d()) {
                                rVar.b(4);
                            }
                            if (rVar.d()) {
                                rVar.b(4);
                            }
                            if (rVar.d()) {
                                rVar.b(4);
                            }
                            if (rVar.d()) {
                                rVar.b(4);
                            }
                            if (rVar.d()) {
                                rVar.b(4);
                            }
                            if (rVar.d()) {
                                rVar.b(4);
                            }
                            if (rVar.d()) {
                                rVar.b(4);
                            }
                            if (rVar.d()) {
                                if (rVar.d()) {
                                    rVar.b(4);
                                }
                                if (rVar.d()) {
                                    rVar.b(4);
                                }
                            }
                        }
                        if (rVar.d()) {
                            rVar.b(5);
                            if (rVar.d()) {
                                rVar.b(7);
                                if (rVar.d()) {
                                    rVar.b(8);
                                }
                            }
                        }
                        rVar.b((c7 + 2) * 8);
                        rVar.e();
                    }
                    if (c5 < 2) {
                        if (rVar.d()) {
                            rVar.b(14);
                        }
                        if (c5 == 0 && rVar.d()) {
                            rVar.b(14);
                        }
                    }
                    if (rVar.d()) {
                        if (c2 == 0) {
                            rVar.b(5);
                        } else {
                            for (int i8 = 0; i8 < i5; i8++) {
                                if (rVar.d()) {
                                    rVar.b(5);
                                }
                            }
                        }
                    }
                }
            }
            if (rVar.d()) {
                rVar.b(5);
                if (c5 == 2) {
                    rVar.b(4);
                }
                if (c5 >= 6) {
                    rVar.b(2);
                }
                if (rVar.d()) {
                    rVar.b(8);
                }
                if (c5 == 0 && rVar.d()) {
                    rVar.b(8);
                }
                i6 = 3;
                if (c4 < 3) {
                    rVar.c();
                }
            } else {
                i6 = 3;
            }
            if (i7 == 0 && c2 != i6) {
                rVar.c();
            }
            if (i7 == 2 && (c2 == i6 || rVar.d())) {
                rVar.b(6);
            }
            if (rVar.d() && rVar.c(6) == 1 && rVar.c(8) == 1) {
                str = "audio/eac3-joc";
            } else {
                str = "audio/eac3";
            }
        } else {
            rVar.b(32);
            int c8 = rVar.c(2);
            a2 = a(c8, rVar.c(6));
            rVar.b(8);
            int c9 = rVar.c(3);
            if ((c9 & 1) != 0 && c9 != 1) {
                rVar.b(2);
            }
            if ((c9 & 4) != 0) {
                rVar.b(2);
            }
            if (c9 == 2) {
                rVar.b(2);
            }
            i2 = f[c8];
            i3 = h[c9] + (rVar.d() ? 1 : 0);
            str = "audio/ac3";
            i4 = d;
        }
        return new C0131a(str, i7, i3, i2, a2, i4, (byte) 0);
    }

    private static int a(byte[] bArr) {
        if (bArr.length < 5) {
            return -1;
        }
        byte b2 = bArr[4];
        return a((b2 & 192) >> 6, b2 & 63);
    }

    public static int a(ByteBuffer byteBuffer) {
        return (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3 ? e[(byteBuffer.get(byteBuffer.position() + 4) & BuiltinOptions.SliceOptions) >> 4] : 6) * 256;
    }

    public static int b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit() - 10;
        for (int i2 = position; i2 <= limit; i2++) {
            if ((byteBuffer.getInt(i2 + 4) & (-16777217)) == -1167101192) {
                return i2 - position;
            }
        }
        return -1;
    }

    private static int b(byte[] bArr) {
        if (bArr[4] == -8 && bArr[5] == 114 && bArr[6] == 111) {
            byte b2 = bArr[7];
            if ((b2 & 254) == 186) {
                return 40 << ((bArr[(b2 & 255) == 187 ? '\t' : '\b'] >> 4) & 7);
            }
        }
        return 0;
    }

    public static int a(ByteBuffer byteBuffer, int i2) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i2) + ((byteBuffer.get((byteBuffer.position() + i2) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }

    private static int a(int i2, int i3) {
        int i4 = i3 / 2;
        if (i2 < 0) {
            return -1;
        }
        int[] iArr = f;
        if (i2 >= iArr.length || i3 < 0) {
            return -1;
        }
        int[] iArr2 = j;
        if (i4 >= iArr2.length) {
            return -1;
        }
        int i5 = iArr[i2];
        if (i5 == 44100) {
            return (iArr2[i4] + (i3 % 2)) * 2;
        }
        int i6 = i[i4];
        return i5 == 32000 ? i6 * 6 : i6 * 4;
    }

    private a() {
    }
}
