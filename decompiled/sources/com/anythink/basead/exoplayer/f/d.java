package com.anythink.basead.exoplayer.f;

import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.util.SparseIntArray;
import com.anythink.basead.exoplayer.k.af;
import com.baidu.ar.t0;
import com.baidu.platform.comapi.bmsdk.BmLocated;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes11.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private static final String f2485a = "MediaCodecUtil";
    private static final String c = "OMX.MTK.AUDIO.DECODER.RAW";
    private static final SparseIntArray g;
    private static final SparseIntArray h;
    private static final String i = "avc1";
    private static final String j = "avc2";
    private static final Map<String, Integer> k;
    private static final String l = "hev1";
    private static final String m = "hvc1";
    private static final String b = "OMX.google.raw.decoder";
    private static final com.anythink.basead.exoplayer.f.a d = com.anythink.basead.exoplayer.f.a.a(b);
    private static final Pattern e = Pattern.compile("^\\D?(\\d+)$");
    private static final HashMap<a, List<com.anythink.basead.exoplayer.f.a>> f = new HashMap<>();
    private static int n = -1;

    private interface c {
        int a();

        MediaCodecInfo a(int i);

        boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities);

        boolean b();
    }

    private static int a(int i2) {
        if (i2 == 1 || i2 == 2) {
            return 25344;
        }
        switch (i2) {
            case 8:
            case 16:
            case 32:
                return 101376;
            case 64:
                return 202752;
            case 128:
            case 256:
                return 414720;
            case 512:
                return 921600;
            case 1024:
                return 1310720;
            case 2048:
            case 4096:
                return 2097152;
            case 8192:
                return 2228224;
            case 16384:
                return 5652480;
            case 32768:
            case 65536:
                return BmLocated.ALIGN_RIGHT_TOP;
            default:
                return -1;
        }
    }

    public static class b extends Exception {
        /* synthetic */ b(Throwable th, byte b) {
            this(th);
        }

        private b(Throwable th) {
            super("Failed to query underlying media codecs", th);
        }
    }

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        g = sparseIntArray;
        sparseIntArray.put(66, 1);
        sparseIntArray.put(77, 2);
        sparseIntArray.put(88, 4);
        sparseIntArray.put(100, 8);
        SparseIntArray sparseIntArray2 = new SparseIntArray();
        h = sparseIntArray2;
        sparseIntArray2.put(10, 1);
        sparseIntArray2.put(11, 4);
        sparseIntArray2.put(12, 8);
        sparseIntArray2.put(13, 16);
        sparseIntArray2.put(20, 32);
        sparseIntArray2.put(21, 64);
        sparseIntArray2.put(22, 128);
        sparseIntArray2.put(30, 256);
        sparseIntArray2.put(31, 512);
        sparseIntArray2.put(32, 1024);
        sparseIntArray2.put(40, 2048);
        sparseIntArray2.put(41, 4096);
        sparseIntArray2.put(42, 8192);
        sparseIntArray2.put(50, 16384);
        sparseIntArray2.put(51, 32768);
        sparseIntArray2.put(52, 65536);
        HashMap hashMap = new HashMap();
        k = hashMap;
        hashMap.put("L30", 1);
        hashMap.put("L60", 4);
        hashMap.put("L63", 16);
        hashMap.put("L90", 64);
        hashMap.put("L93", 256);
        hashMap.put("L120", 1024);
        hashMap.put("L123", 4096);
        hashMap.put("L150", 16384);
        hashMap.put("L153", 65536);
        hashMap.put("L156", 262144);
        hashMap.put("L180", 1048576);
        hashMap.put("L183", 4194304);
        hashMap.put("L186", 16777216);
        hashMap.put("H30", 2);
        hashMap.put("H60", 8);
        hashMap.put("H63", 32);
        hashMap.put("H90", 128);
        hashMap.put("H93", 512);
        hashMap.put("H120", 2048);
        hashMap.put("H123", 8192);
        hashMap.put("H150", 32768);
        hashMap.put("H153", 131072);
        hashMap.put("H156", 524288);
        hashMap.put("H180", 2097152);
        hashMap.put("H183", 8388608);
        hashMap.put("H186", 33554432);
    }

    private d() {
    }

    private static void b(String str, boolean z) {
        try {
            c(str, z);
        } catch (b e2) {
            Log.e(f2485a, "Codec warming failed", e2);
        }
    }

    public static com.anythink.basead.exoplayer.f.a a() {
        return d;
    }

    public static com.anythink.basead.exoplayer.f.a a(String str, boolean z) {
        List<com.anythink.basead.exoplayer.f.a> c2 = c(str, z);
        if (c2.isEmpty()) {
            return null;
        }
        return c2.get(0);
    }

    private static synchronized List<com.anythink.basead.exoplayer.f.a> c(String str, boolean z) {
        synchronized (d.class) {
            a aVar = new a(str, z);
            HashMap<a, List<com.anythink.basead.exoplayer.f.a>> hashMap = f;
            List<com.anythink.basead.exoplayer.f.a> list = hashMap.get(aVar);
            if (list != null) {
                return list;
            }
            byte b2 = 0;
            c eVar = af.f2668a >= 21 ? new e(z) : new C0140d(b2);
            ArrayList<com.anythink.basead.exoplayer.f.a> a2 = a(aVar, eVar, str);
            if (z && a2.isEmpty() && 21 <= af.f2668a && af.f2668a <= 23) {
                eVar = new C0140d(b2);
                a2 = a(aVar, eVar, str);
                if (!a2.isEmpty()) {
                    Log.w(f2485a, "MediaCodecList API didn't list secure decoder for: " + str + ". Assuming: " + a2.get(0).c);
                }
            }
            if ("audio/eac3-joc".equals(str)) {
                a2.addAll(a(new a("audio/eac3", aVar.b), eVar, str));
            }
            a(a2);
            List<com.anythink.basead.exoplayer.f.a> unmodifiableList = Collections.unmodifiableList(a2);
            hashMap.put(aVar, unmodifiableList);
            return unmodifiableList;
        }
    }

    public static int b() {
        if (n == -1) {
            int i2 = 0;
            com.anythink.basead.exoplayer.f.a a2 = a("video/avc", false);
            if (a2 != null) {
                MediaCodecInfo.CodecProfileLevel[] a3 = a2.a();
                int length = a3.length;
                int i3 = 0;
                while (i2 < length) {
                    int i4 = a3[i2].level;
                    int i5 = 25344;
                    if (i4 != 1 && i4 != 2) {
                        i5 = BmLocated.ALIGN_RIGHT_TOP;
                        switch (i4) {
                            case 8:
                            case 16:
                            case 32:
                                i5 = 101376;
                                break;
                            case 64:
                                i5 = 202752;
                                break;
                            case 128:
                            case 256:
                                i5 = 414720;
                                break;
                            case 512:
                                i5 = 921600;
                                break;
                            case 1024:
                                i5 = 1310720;
                                break;
                            case 2048:
                            case 4096:
                                i5 = 2097152;
                                break;
                            case 8192:
                                i5 = 2228224;
                                break;
                            case 16384:
                                i5 = 5652480;
                                break;
                            case 32768:
                            case 65536:
                                break;
                            default:
                                i5 = -1;
                                break;
                        }
                    }
                    i3 = Math.max(i5, i3);
                    i2++;
                }
                i2 = Math.max(i3, af.f2668a >= 21 ? 345600 : 172800);
            }
            n = i2;
        }
        return n;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0044, code lost:
    
        if (r3.equals(com.anythink.basead.exoplayer.f.d.i) == false) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.util.Pair<java.lang.Integer, java.lang.Integer> a(java.lang.String r9) {
        /*
            r0 = 0
            if (r9 != 0) goto L4
            return r0
        L4:
            java.lang.String r1 = "\\."
            java.lang.String[] r1 = r9.split(r1)
            r2 = 0
            r3 = r1[r2]
            r3.hashCode()
            int r4 = r3.hashCode()
            r5 = 3
            r6 = 2
            r7 = 1
            r8 = -1
            switch(r4) {
                case 3006243: goto L3e;
                case 3006244: goto L33;
                case 3199032: goto L28;
                case 3214780: goto L1d;
                default: goto L1b;
            }
        L1b:
            r2 = r8
            goto L47
        L1d:
            java.lang.String r2 = "hvc1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L26
            goto L1b
        L26:
            r2 = r5
            goto L47
        L28:
            java.lang.String r2 = "hev1"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L31
            goto L1b
        L31:
            r2 = r6
            goto L47
        L33:
            java.lang.String r2 = "avc2"
            boolean r2 = r3.equals(r2)
            if (r2 != 0) goto L3c
            goto L1b
        L3c:
            r2 = r7
            goto L47
        L3e:
            java.lang.String r4 = "avc1"
            boolean r3 = r3.equals(r4)
            if (r3 != 0) goto L47
            goto L1b
        L47:
            switch(r2) {
                case 0: goto Lca;
                case 1: goto Lca;
                case 2: goto L4b;
                case 3: goto L4b;
                default: goto L4a;
            }
        L4a:
            return r0
        L4b:
            int r2 = r1.length
            r3 = 4
            java.lang.String r4 = "Ignoring malformed HEVC codec string: "
            java.lang.String r8 = "MediaCodecUtil"
            if (r2 >= r3) goto L5f
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r9 = r4.concat(r9)
            android.util.Log.w(r8, r9)
            return r0
        L5f:
            java.util.regex.Pattern r2 = com.anythink.basead.exoplayer.f.d.e
            r3 = r1[r7]
            java.util.regex.Matcher r2 = r2.matcher(r3)
            boolean r3 = r2.matches()
            if (r3 != 0) goto L79
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r9 = r4.concat(r9)
            android.util.Log.w(r8, r9)
            return r0
        L79:
            java.lang.String r9 = r2.group(r7)
            java.lang.String r3 = "1"
            boolean r3 = r3.equals(r9)
            if (r3 == 0) goto L87
            r6 = r7
            goto L8f
        L87:
            java.lang.String r3 = "2"
            boolean r3 = r3.equals(r9)
            if (r3 == 0) goto Lbc
        L8f:
            java.util.Map<java.lang.String, java.lang.Integer> r9 = com.anythink.basead.exoplayer.f.d.k
            r1 = r1[r5]
            java.lang.Object r9 = r9.get(r1)
            java.lang.Integer r9 = (java.lang.Integer) r9
            if (r9 != 0) goto Lb2
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r1 = "Unknown HEVC level string: "
            r9.<init>(r1)
            java.lang.String r1 = r2.group(r7)
            java.lang.StringBuilder r9 = r9.append(r1)
            java.lang.String r9 = r9.toString()
            android.util.Log.w(r8, r9)
            return r0
        Lb2:
            android.util.Pair r0 = new android.util.Pair
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)
            r0.<init>(r1, r9)
            return r0
        Lbc:
            java.lang.String r1 = "Unknown HEVC profile string: "
            java.lang.String r9 = java.lang.String.valueOf(r9)
            java.lang.String r9 = r1.concat(r9)
            android.util.Log.w(r8, r9)
            return r0
        Lca:
            android.util.Pair r9 = b(r9, r1)
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.exoplayer.f.d.a(java.lang.String):android.util.Pair");
    }

    /* JADX WARN: Removed duplicated region for block: B:159:0x0298 A[Catch: Exception -> 0x0293, TryCatch #3 {Exception -> 0x0293, blocks: (B:193:0x026d, B:195:0x0277, B:197:0x0281, B:199:0x0289, B:159:0x0298, B:163:0x02a6, B:166:0x02a1, B:171:0x02b3), top: B:192:0x026d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.util.ArrayList<com.anythink.basead.exoplayer.f.a> a(com.anythink.basead.exoplayer.f.d.a r19, com.anythink.basead.exoplayer.f.d.c r20, java.lang.String r21) {
        /*
            Method dump skipped, instructions count: 847
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.exoplayer.f.d.a(com.anythink.basead.exoplayer.f.d$a, com.anythink.basead.exoplayer.f.d$c, java.lang.String):java.util.ArrayList");
    }

    private static boolean a(MediaCodecInfo mediaCodecInfo, String str, boolean z, String str2) {
        if (mediaCodecInfo.isEncoder() || (!z && str.endsWith(".secure"))) {
            return false;
        }
        if (af.f2668a < 21 && ("CIPAACDecoder".equals(str) || "CIPMP3Decoder".equals(str) || "CIPVorbisDecoder".equals(str) || "CIPAMRNBDecoder".equals(str) || "AACDecoder".equals(str) || "MP3Decoder".equals(str))) {
            return false;
        }
        if (af.f2668a < 18 && "OMX.SEC.MP3.Decoder".equals(str)) {
            return false;
        }
        if (af.f2668a < 18 && "OMX.MTK.AUDIO.DECODER.AAC".equals(str) && ("a70".equals(af.b) || ("Xiaomi".equals(af.c) && af.b.startsWith("HM")))) {
            return false;
        }
        if (af.f2668a == 16 && "OMX.qcom.audio.decoder.mp3".equals(str) && ("dlxu".equals(af.b) || "protou".equals(af.b) || "ville".equals(af.b) || "villeplus".equals(af.b) || "villec2".equals(af.b) || af.b.startsWith("gee") || "C6602".equals(af.b) || "C6603".equals(af.b) || "C6606".equals(af.b) || "C6616".equals(af.b) || "L36h".equals(af.b) || "SO-02E".equals(af.b))) {
            return false;
        }
        if (af.f2668a == 16 && "OMX.qcom.audio.decoder.aac".equals(str) && ("C1504".equals(af.b) || "C1505".equals(af.b) || "C1604".equals(af.b) || "C1605".equals(af.b))) {
            return false;
        }
        if (af.f2668a < 24 && (("OMX.SEC.aac.dec".equals(str) || "OMX.Exynos.AAC.Decoder".equals(str)) && "samsung".equals(af.c) && (af.b.startsWith("zeroflte") || af.b.startsWith("zerolte") || af.b.startsWith("zenlte") || "SC-05G".equals(af.b) || "marinelteatt".equals(af.b) || "404SC".equals(af.b) || "SC-04G".equals(af.b) || "SCV31".equals(af.b)))) {
            return false;
        }
        if (af.f2668a <= 19 && "OMX.SEC.vp8.dec".equals(str) && "samsung".equals(af.c) && (af.b.startsWith(com.anythink.expressad.foundation.g.a.S) || af.b.startsWith("serrano") || af.b.startsWith("jflte") || af.b.startsWith("santos") || af.b.startsWith(t0.k))) {
            return false;
        }
        if (af.f2668a <= 19 && af.b.startsWith("jflte") && "OMX.qcom.video.decoder.vp8".equals(str)) {
            return false;
        }
        return ("audio/eac3-joc".equals(str2) && "OMX.MTK.AUDIO.DECODER.DSPAC3".equals(str)) ? false : true;
    }

    private static void a(List<com.anythink.basead.exoplayer.f.a> list) {
        if (af.f2668a < 26) {
            if (list.size() <= 1 || !c.equals(list.get(0).c)) {
                return;
            }
            for (int i2 = 1; i2 < list.size(); i2++) {
                com.anythink.basead.exoplayer.f.a aVar = list.get(i2);
                if (b.equals(aVar.c)) {
                    list.remove(i2);
                    list.add(0, aVar);
                    return;
                }
            }
        }
    }

    private static boolean b(String str) {
        if (af.f2668a > 22) {
            return false;
        }
        if ("ODROID-XU3".equals(af.d) || "Nexus 10".equals(af.d)) {
            return "OMX.Exynos.AVC.Decoder".equals(str) || "OMX.Exynos.AVC.Decoder.secure".equals(str);
        }
        return false;
    }

    private static Pair<Integer, Integer> a(String str, String[] strArr) {
        int i2;
        if (strArr.length < 4) {
            Log.w(f2485a, "Ignoring malformed HEVC codec string: ".concat(String.valueOf(str)));
            return null;
        }
        Matcher matcher = e.matcher(strArr[1]);
        if (!matcher.matches()) {
            Log.w(f2485a, "Ignoring malformed HEVC codec string: ".concat(String.valueOf(str)));
            return null;
        }
        String group = matcher.group(1);
        if ("1".equals(group)) {
            i2 = 1;
        } else {
            if (!"2".equals(group)) {
                Log.w(f2485a, "Unknown HEVC profile string: ".concat(String.valueOf(group)));
                return null;
            }
            i2 = 2;
        }
        Integer num = k.get(strArr[3]);
        if (num == null) {
            Log.w(f2485a, "Unknown HEVC level string: " + matcher.group(1));
            return null;
        }
        return new Pair<>(Integer.valueOf(i2), num);
    }

    private static Pair<Integer, Integer> b(String str, String[] strArr) {
        Integer valueOf;
        Integer num;
        if (strArr.length < 2) {
            Log.w(f2485a, "Ignoring malformed AVC codec string: ".concat(String.valueOf(str)));
            return null;
        }
        try {
            if (strArr[1].length() == 6) {
                num = Integer.valueOf(Integer.parseInt(strArr[1].substring(0, 2), 16));
                valueOf = Integer.valueOf(Integer.parseInt(strArr[1].substring(4), 16));
            } else if (strArr.length >= 3) {
                Integer valueOf2 = Integer.valueOf(Integer.parseInt(strArr[1]));
                valueOf = Integer.valueOf(Integer.parseInt(strArr[2]));
                num = valueOf2;
            } else {
                Log.w(f2485a, "Ignoring malformed AVC codec string: ".concat(String.valueOf(str)));
                return null;
            }
            int i2 = g.get(num.intValue(), -1);
            if (i2 == -1) {
                Log.w(f2485a, "Unknown AVC profile: ".concat(String.valueOf(num)));
                return null;
            }
            int i3 = h.get(valueOf.intValue(), -1);
            if (i3 == -1) {
                Log.w(f2485a, "Unknown AVC level: ".concat(String.valueOf(valueOf)));
                return null;
            }
            return new Pair<>(Integer.valueOf(i2), Integer.valueOf(i3));
        } catch (NumberFormatException unused) {
            Log.w(f2485a, "Ignoring malformed AVC codec string: ".concat(String.valueOf(str)));
            return null;
        }
    }

    private static final class e implements c {

        /* renamed from: a, reason: collision with root package name */
        private final int f2487a;
        private MediaCodecInfo[] b;

        @Override // com.anythink.basead.exoplayer.f.d.c
        public final boolean b() {
            return true;
        }

        public e(boolean z) {
            this.f2487a = z ? 1 : 0;
        }

        @Override // com.anythink.basead.exoplayer.f.d.c
        public final int a() {
            c();
            return this.b.length;
        }

        @Override // com.anythink.basead.exoplayer.f.d.c
        public final MediaCodecInfo a(int i) {
            c();
            return this.b[i];
        }

        @Override // com.anythink.basead.exoplayer.f.d.c
        public final boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return codecCapabilities.isFeatureSupported("secure-playback");
        }

        private void c() {
            if (this.b == null) {
                this.b = new MediaCodecList(this.f2487a).getCodecInfos();
            }
        }
    }

    /* renamed from: com.anythink.basead.exoplayer.f.d$d, reason: collision with other inner class name */
    private static final class C0140d implements c {
        @Override // com.anythink.basead.exoplayer.f.d.c
        public final boolean b() {
            return false;
        }

        private C0140d() {
        }

        /* synthetic */ C0140d(byte b) {
            this();
        }

        @Override // com.anythink.basead.exoplayer.f.d.c
        public final int a() {
            return MediaCodecList.getCodecCount();
        }

        @Override // com.anythink.basead.exoplayer.f.d.c
        public final MediaCodecInfo a(int i) {
            return MediaCodecList.getCodecInfoAt(i);
        }

        @Override // com.anythink.basead.exoplayer.f.d.c
        public final boolean a(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
            return "video/avc".equals(str);
        }
    }

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final String f2486a;
        public final boolean b;

        public a(String str, boolean z) {
            this.f2486a = str;
            this.b = z;
        }

        public final int hashCode() {
            String str = this.f2486a;
            return (((str == null ? 0 : str.hashCode()) + 31) * 31) + (this.b ? 1231 : 1237);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj != null && obj.getClass() == a.class) {
                a aVar = (a) obj;
                if (TextUtils.equals(this.f2486a, aVar.f2486a) && this.b == aVar.b) {
                    return true;
                }
            }
            return false;
        }
    }
}
