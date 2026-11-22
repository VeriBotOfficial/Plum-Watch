package com.yandex.mobile.ads.impl;

import android.graphics.Point;
import android.media.MediaCodecInfo;
import android.util.Pair;
import androidx.media3.common.MimeTypes;
import com.yandex.mobile.ads.impl.sv0;

/* loaded from: classes5.dex */
public final class kv0 {
    private static final lv0 i = nm1.e();

    /* renamed from: a, reason: collision with root package name */
    public final String f16054a;
    public final String b;
    public final String c;
    public final MediaCodecInfo.CodecCapabilities d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    private final boolean h;

    kv0(String str, String str2, String str3, MediaCodecInfo.CodecCapabilities codecCapabilities, boolean z, boolean z2, boolean z3) {
        this.f16054a = (String) hg.a(str);
        this.b = str2;
        this.c = str3;
        this.d = codecCapabilities;
        this.g = z;
        this.e = z2;
        this.f = z3;
        this.h = w01.f(str2);
    }

    public final String toString() {
        return this.f16054a;
    }

    public final boolean b(jc0 jc0Var) {
        if (this.h) {
            return this.e;
        }
        Pair<Integer, Integer> b = sv0.b(jc0Var);
        return b != null && ((Integer) b.first).intValue() == 42;
    }

    public final Point a(int i2, int i3) {
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null || (videoCapabilities = codecCapabilities.getVideoCapabilities()) == null) {
            return null;
        }
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i4 = f92.f15466a;
        return new Point((((i2 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i3 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
    }

    public final ty a(jc0 jc0Var, jc0 jc0Var2) {
        jc0 jc0Var3;
        jc0 jc0Var4;
        int i2 = !f92.a(jc0Var.m, jc0Var2.m) ? 8 : 0;
        if (this.h) {
            if (jc0Var.u != jc0Var2.u) {
                i2 |= 1024;
            }
            if (!this.e && (jc0Var.r != jc0Var2.r || jc0Var.s != jc0Var2.s)) {
                i2 |= 512;
            }
            if (!f92.a(jc0Var.y, jc0Var2.y)) {
                i2 |= 2048;
            }
            String str = this.f16054a;
            String str2 = f92.d;
            lv0 lv0Var = i;
            if (str2.startsWith(lv0Var.i()) && lv0Var.g().equals(str) && !jc0Var.a(jc0Var2)) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new ty(this.f16054a, jc0Var, jc0Var2, jc0Var.a(jc0Var2) ? 3 : 2, 0);
            }
            jc0Var3 = jc0Var;
            jc0Var4 = jc0Var2;
        } else {
            jc0Var3 = jc0Var;
            jc0Var4 = jc0Var2;
            if (jc0Var3.z != jc0Var4.z) {
                i2 |= 4096;
            }
            if (jc0Var3.A != jc0Var4.A) {
                i2 |= 8192;
            }
            if (jc0Var3.B != jc0Var4.B) {
                i2 |= 16384;
            }
            if (i2 == 0 && "audio/mp4a-latm".equals(this.b)) {
                Pair<Integer, Integer> b = sv0.b(jc0Var3);
                Pair<Integer, Integer> b2 = sv0.b(jc0Var4);
                if (b != null && b2 != null) {
                    int intValue = ((Integer) b.first).intValue();
                    int intValue2 = ((Integer) b2.first).intValue();
                    if (intValue == 42 && intValue2 == 42) {
                        return new ty(this.f16054a, jc0Var3, jc0Var4, 3, 0);
                    }
                }
            }
            if (!jc0Var3.a(jc0Var4)) {
                i2 |= 32;
            }
            if ("audio/opus".equals(this.b)) {
                i2 |= 2;
            }
            if (i2 == 0) {
                return new ty(this.f16054a, jc0Var3, jc0Var4, 1, 0);
            }
        }
        return new ty(this.f16054a, jc0Var3, jc0Var4, 0, i2);
    }

    public final boolean a(jc0 jc0Var) throws sv0.b {
        int i2;
        Pair<Integer, Integer> b;
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        MediaCodecInfo.VideoCapabilities videoCapabilities;
        if (!this.b.equals(jc0Var.m) && !this.b.equals(sv0.a(jc0Var))) {
            return false;
        }
        int i3 = 16;
        if (jc0Var.j != null && (b = sv0.b(jc0Var)) != null) {
            int intValue = ((Integer) b.first).intValue();
            int intValue2 = ((Integer) b.second).intValue();
            int i4 = 8;
            if (MimeTypes.VIDEO_DOLBY_VISION.equals(jc0Var.m)) {
                if ("video/avc".equals(this.b)) {
                    intValue2 = 0;
                    intValue = 8;
                } else if ("video/hevc".equals(this.b)) {
                    intValue2 = 0;
                    intValue = 2;
                }
            }
            if (this.h || intValue == 42) {
                MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
                if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
                }
                if (f92.f15466a <= 23 && "video/x-vnd.on2.vp9".equals(this.b) && codecProfileLevelArr.length == 0) {
                    MediaCodecInfo.CodecCapabilities codecCapabilities2 = this.d;
                    int intValue3 = (codecCapabilities2 == null || (videoCapabilities = codecCapabilities2.getVideoCapabilities()) == null) ? 0 : videoCapabilities.getBitrateRange().getUpper().intValue();
                    if (intValue3 >= 180000000) {
                        i4 = 1024;
                    } else if (intValue3 >= 120000000) {
                        i4 = 512;
                    } else if (intValue3 >= 60000000) {
                        i4 = 256;
                    } else if (intValue3 >= 30000000) {
                        i4 = 128;
                    } else if (intValue3 >= 18000000) {
                        i4 = 64;
                    } else if (intValue3 >= 12000000) {
                        i4 = 32;
                    } else if (intValue3 >= 7200000) {
                        i4 = 16;
                    } else if (intValue3 < 3600000) {
                        i4 = intValue3 >= 1800000 ? 4 : intValue3 >= 800000 ? 2 : 1;
                    }
                    MediaCodecInfo.CodecProfileLevel codecProfileLevel = new MediaCodecInfo.CodecProfileLevel();
                    codecProfileLevel.profile = 1;
                    codecProfileLevel.level = i4;
                    codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[]{codecProfileLevel};
                }
                for (MediaCodecInfo.CodecProfileLevel codecProfileLevel2 : codecProfileLevelArr) {
                    if (codecProfileLevel2.profile == intValue && codecProfileLevel2.level >= intValue2) {
                        if ("video/hevc".equals(this.b) && 2 == intValue) {
                            lv0 lv0Var = i;
                            String j = lv0Var.j();
                            String str = f92.b;
                            if (!j.equals(str) && !lv0Var.a().equals(str)) {
                            }
                        }
                    }
                }
                a("codec.profileLevel, " + jc0Var.j + ", " + this.c);
                return false;
            }
        }
        if (this.h) {
            int i5 = jc0Var.r;
            if (i5 <= 0 || (i2 = jc0Var.s) <= 0) {
                return true;
            }
            if (f92.f15466a >= 21) {
                return a(i5, i2, jc0Var.t);
            }
            boolean z = i5 * i2 <= sv0.a();
            if (!z) {
                a("legacyFrameSize, " + jc0Var.r + "x" + jc0Var.s);
            }
            return z;
        }
        int i6 = f92.f15466a;
        if (i6 >= 21) {
            int i7 = jc0Var.A;
            if (i7 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities3 = this.d;
                if (codecCapabilities3 == null) {
                    a("sampleRate.caps");
                } else {
                    MediaCodecInfo.AudioCapabilities audioCapabilities = codecCapabilities3.getAudioCapabilities();
                    if (audioCapabilities == null) {
                        a("sampleRate.aCaps");
                    } else if (!audioCapabilities.isSampleRateSupported(i7)) {
                        a(oe.a("sampleRate.support, ", i7));
                    }
                }
                return false;
            }
            int i8 = jc0Var.z;
            if (i8 != -1) {
                MediaCodecInfo.CodecCapabilities codecCapabilities4 = this.d;
                if (codecCapabilities4 == null) {
                    a("channelCount.caps");
                } else {
                    MediaCodecInfo.AudioCapabilities audioCapabilities2 = codecCapabilities4.getAudioCapabilities();
                    if (audioCapabilities2 == null) {
                        a("channelCount.aCaps");
                    } else {
                        String str2 = this.f16054a;
                        String str3 = this.b;
                        int maxInputChannelCount = audioCapabilities2.getMaxInputChannelCount();
                        if (maxInputChannelCount <= 1 && ((i6 < 26 || maxInputChannelCount <= 0) && !"audio/mpeg".equals(str3) && !"audio/3gpp".equals(str3) && !"audio/amr-wb".equals(str3) && !"audio/mp4a-latm".equals(str3) && !"audio/vorbis".equals(str3) && !"audio/opus".equals(str3) && !"audio/raw".equals(str3) && !"audio/flac".equals(str3) && !"audio/g711-alaw".equals(str3) && !"audio/g711-mlaw".equals(str3) && !"audio/gsm".equals(str3))) {
                            if ("audio/ac3".equals(str3)) {
                                i3 = 6;
                            } else if (!"audio/eac3".equals(str3)) {
                                i3 = 30;
                            }
                            et0.d("MediaCodecInfo", "AssumedMaxChannelAdjustment: " + str2 + ", [" + maxInputChannelCount + " to " + i3 + "]");
                            maxInputChannelCount = i3;
                        }
                        if (maxInputChannelCount < i8) {
                            a(oe.a("channelCount.support, ", i8));
                        }
                    }
                }
                return false;
            }
        }
        return true;
    }

    public final boolean a(int i2, int i3, double d) {
        boolean isSizeSupported;
        boolean isSizeSupported2;
        MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
        if (codecCapabilities == null) {
            a("sizeAndRate.caps");
            return false;
        }
        MediaCodecInfo.VideoCapabilities videoCapabilities = codecCapabilities.getVideoCapabilities();
        if (videoCapabilities == null) {
            a("sizeAndRate.vCaps");
            return false;
        }
        int widthAlignment = videoCapabilities.getWidthAlignment();
        int heightAlignment = videoCapabilities.getHeightAlignment();
        int i4 = f92.f15466a;
        Point point = new Point((((i2 + widthAlignment) - 1) / widthAlignment) * widthAlignment, (((i3 + heightAlignment) - 1) / heightAlignment) * heightAlignment);
        int i5 = point.x;
        int i6 = point.y;
        if (d != -1.0d && d >= 1.0d) {
            isSizeSupported = videoCapabilities.areSizeAndRateSupported(i5, i6, Math.floor(d));
        } else {
            isSizeSupported = videoCapabilities.isSizeSupported(i5, i6);
        }
        if (!isSizeSupported) {
            if (i2 < i3) {
                String str = this.f16054a;
                lv0 lv0Var = i;
                if (!lv0Var.h().equals(str) || !lv0Var.b().equals(f92.b)) {
                    int widthAlignment2 = videoCapabilities.getWidthAlignment();
                    int heightAlignment2 = videoCapabilities.getHeightAlignment();
                    Point point2 = new Point((((i3 + widthAlignment2) - 1) / widthAlignment2) * widthAlignment2, (((i2 + heightAlignment2) - 1) / heightAlignment2) * heightAlignment2);
                    int i7 = point2.x;
                    int i8 = point2.y;
                    if (d != -1.0d && d >= 1.0d) {
                        isSizeSupported2 = videoCapabilities.areSizeAndRateSupported(i7, i8, Math.floor(d));
                    } else {
                        isSizeSupported2 = videoCapabilities.isSizeSupported(i7, i8);
                    }
                    if (isSizeSupported2) {
                        et0.a("MediaCodecInfo", "AssumedSupport [" + ("sizeAndRate.rotated, " + i2 + "x" + i3 + "x" + d) + "] [" + this.f16054a + ", " + this.b + "] [" + f92.e + "]");
                    }
                }
            }
            a("sizeAndRate.support, " + i2 + "x" + i3 + "x" + d);
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0033, code lost:
    
        if (r1.c().equals(r3) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0047, code lost:
    
        if (r1.f().equals(r4) == false) goto L19;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.yandex.mobile.ads.impl.kv0 a(java.lang.String r4, java.lang.String r5, java.lang.String r6, android.media.MediaCodecInfo.CodecCapabilities r7, boolean r8, boolean r9, boolean r10, boolean r11) {
        /*
            r9 = r8
            r8 = r7
            r7 = r6
            r6 = r5
            r5 = r4
            com.yandex.mobile.ads.impl.kv0 r4 = new com.yandex.mobile.ads.impl.kv0
            r10 = 1
            r0 = 0
            if (r8 == 0) goto L4c
            int r1 = com.yandex.mobile.ads.impl.f92.f15466a
            r2 = 19
            if (r1 < r2) goto L4c
            java.lang.String r2 = "adaptive-playback"
            boolean r2 = r8.isFeatureSupported(r2)
            if (r2 == 0) goto L4c
            r2 = 22
            if (r1 > r2) goto L4a
            com.yandex.mobile.ads.impl.lv0 r1 = com.yandex.mobile.ads.impl.kv0.i
            java.lang.String r2 = r1.d()
            java.lang.String r3 = com.yandex.mobile.ads.impl.f92.d
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L35
            java.lang.String r2 = r1.c()
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L4a
        L35:
            java.lang.String r2 = r1.e()
            boolean r2 = r2.equals(r5)
            if (r2 != 0) goto L4c
            java.lang.String r1 = r1.f()
            boolean r1 = r1.equals(r5)
            if (r1 == 0) goto L4a
            goto L4c
        L4a:
            r1 = r10
            goto L4e
        L4c:
            r1 = r10
            r10 = r0
        L4e:
            r2 = 21
            if (r8 == 0) goto L5b
            int r3 = com.yandex.mobile.ads.impl.f92.f15466a
            if (r3 < r2) goto L5b
            java.lang.String r3 = "tunneled-playback"
            r8.isFeatureSupported(r3)
        L5b:
            if (r11 != 0) goto L6e
            if (r8 == 0) goto L6c
            int r11 = com.yandex.mobile.ads.impl.f92.f15466a
            if (r11 < r2) goto L6c
            java.lang.String r11 = "secure-playback"
            boolean r11 = r8.isFeatureSupported(r11)
            if (r11 == 0) goto L6c
            goto L6e
        L6c:
            r11 = r0
            goto L6f
        L6e:
            r11 = r1
        L6f:
            r4.<init>(r5, r6, r7, r8, r9, r10, r11)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.kv0.a(java.lang.String, java.lang.String, java.lang.String, android.media.MediaCodecInfo$CodecCapabilities, boolean, boolean, boolean, boolean):com.yandex.mobile.ads.impl.kv0");
    }

    public final boolean a() {
        MediaCodecInfo.CodecProfileLevel[] codecProfileLevelArr;
        if (f92.f15466a >= 29 && "video/x-vnd.on2.vp9".equals(this.b)) {
            MediaCodecInfo.CodecCapabilities codecCapabilities = this.d;
            if (codecCapabilities == null || (codecProfileLevelArr = codecCapabilities.profileLevels) == null) {
                codecProfileLevelArr = new MediaCodecInfo.CodecProfileLevel[0];
            }
            for (MediaCodecInfo.CodecProfileLevel codecProfileLevel : codecProfileLevelArr) {
                if (codecProfileLevel.profile == 16384) {
                    return true;
                }
            }
        }
        return false;
    }

    private void a(String str) {
        et0.a("MediaCodecInfo", "NoSupport [" + str + "] [" + this.f16054a + ", " + this.b + "] [" + f92.e + "]");
    }
}
