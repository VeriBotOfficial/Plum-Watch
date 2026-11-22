package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes5.dex */
final class h22 {

    /* renamed from: a, reason: collision with root package name */
    public final String f15646a;
    public final int b;
    public final Integer c;
    public final Integer d;
    public final float e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    public final int j;

    private h22(String str, int i, Integer num, Integer num2, float f, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        this.f15646a = str;
        this.b = i;
        this.c = num;
        this.d = num2;
        this.e = f;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = z4;
        this.j = i2;
    }

    /* JADX WARN: Failed to find 'out' block for switch in B:14:0x0068. Please report as an issue. */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0082 A[Catch: RuntimeException -> 0x0152, TryCatch #1 {RuntimeException -> 0x0152, blocks: (B:9:0x004b, B:11:0x005a, B:13:0x0060, B:16:0x007e, B:18:0x0082, B:19:0x008f, B:21:0x0093, B:22:0x00a0, B:24:0x00a4, B:26:0x00aa, B:27:0x00c9, B:29:0x00d0, B:32:0x00dd, B:34:0x00e1, B:74:0x00b0, B:15:0x006b), top: B:8:0x004b, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0093 A[Catch: RuntimeException -> 0x0152, TryCatch #1 {RuntimeException -> 0x0152, blocks: (B:9:0x004b, B:11:0x005a, B:13:0x0060, B:16:0x007e, B:18:0x0082, B:19:0x008f, B:21:0x0093, B:22:0x00a0, B:24:0x00a4, B:26:0x00aa, B:27:0x00c9, B:29:0x00d0, B:32:0x00dd, B:34:0x00e1, B:74:0x00b0, B:15:0x006b), top: B:8:0x004b, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a4 A[Catch: RuntimeException -> 0x0152, TRY_LEAVE, TryCatch #1 {RuntimeException -> 0x0152, blocks: (B:9:0x004b, B:11:0x005a, B:13:0x0060, B:16:0x007e, B:18:0x0082, B:19:0x008f, B:21:0x0093, B:22:0x00a0, B:24:0x00a4, B:26:0x00aa, B:27:0x00c9, B:29:0x00d0, B:32:0x00dd, B:34:0x00e1, B:74:0x00b0, B:15:0x006b), top: B:8:0x004b, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00d0 A[Catch: RuntimeException -> 0x0152, TryCatch #1 {RuntimeException -> 0x0152, blocks: (B:9:0x004b, B:11:0x005a, B:13:0x0060, B:16:0x007e, B:18:0x0082, B:19:0x008f, B:21:0x0093, B:22:0x00a0, B:24:0x00a4, B:26:0x00aa, B:27:0x00c9, B:29:0x00d0, B:32:0x00dd, B:34:0x00e1, B:74:0x00b0, B:15:0x006b), top: B:8:0x004b, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00e1 A[Catch: RuntimeException -> 0x0152, TRY_LEAVE, TryCatch #1 {RuntimeException -> 0x0152, blocks: (B:9:0x004b, B:11:0x005a, B:13:0x0060, B:16:0x007e, B:18:0x0082, B:19:0x008f, B:21:0x0093, B:22:0x00a0, B:24:0x00a4, B:26:0x00aa, B:27:0x00c9, B:29:0x00d0, B:32:0x00dd, B:34:0x00e1, B:74:0x00b0, B:15:0x006b), top: B:8:0x004b, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00f6 A[Catch: RuntimeException -> 0x0150, TryCatch #2 {RuntimeException -> 0x0150, blocks: (B:39:0x00f2, B:41:0x00f6, B:44:0x0107, B:46:0x010b, B:49:0x011c, B:51:0x0120, B:53:0x0126, B:59:0x014b, B:57:0x0137), top: B:38:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x010b A[Catch: RuntimeException -> 0x0150, TryCatch #2 {RuntimeException -> 0x0150, blocks: (B:39:0x00f2, B:41:0x00f6, B:44:0x0107, B:46:0x010b, B:49:0x011c, B:51:0x0120, B:53:0x0126, B:59:0x014b, B:57:0x0137), top: B:38:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0120 A[Catch: RuntimeException -> 0x0150, TRY_LEAVE, TryCatch #2 {RuntimeException -> 0x0150, blocks: (B:39:0x00f2, B:41:0x00f6, B:44:0x0107, B:46:0x010b, B:49:0x011c, B:51:0x0120, B:53:0x0126, B:59:0x014b, B:57:0x0137), top: B:38:0x00f2 }] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x008e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.yandex.mobile.ads.impl.h22 a(java.lang.String r20, com.yandex.mobile.ads.impl.h22.a r21) {
        /*
            Method dump skipped, instructions count: 392
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.h22.a(java.lang.String, com.yandex.mobile.ads.impl.h22$a):com.yandex.mobile.ads.impl.h22");
    }

    public static Integer b(String str) {
        long parseLong;
        try {
            if (str.startsWith("&H")) {
                parseLong = Long.parseLong(str.substring(2), 16);
            } else {
                parseLong = Long.parseLong(str);
            }
            if (parseLong <= BodyPartID.bodyIdMax) {
                return Integer.valueOf(Color.argb(hq0.a(((parseLong >> 24) & 255) ^ 255), hq0.a(parseLong & 255), hq0.a((parseLong >> 8) & 255), hq0.a((parseLong >> 16) & 255)));
            }
            throw new IllegalArgumentException();
        } catch (IllegalArgumentException e) {
            et0.b("SsaStyle", "Failed to parse color expression: '" + str + Separators.QUOTE, e);
            return null;
        }
    }

    static final class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f15647a;
        public final int b;
        public final int c;
        public final int d;
        public final int e;
        public final int f;
        public final int g;
        public final int h;
        public final int i;
        public final int j;
        public final int k;

        private a(int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
            this.f15647a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
            this.e = i5;
            this.f = i6;
            this.g = i7;
            this.h = i8;
            this.i = i9;
            this.j = i10;
            this.k = i11;
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        public static a a(String str) {
            char c;
            String[] split = TextUtils.split(str.substring(7), ",");
            int i = -1;
            int i2 = -1;
            int i3 = -1;
            int i4 = -1;
            int i5 = -1;
            int i6 = -1;
            int i7 = -1;
            int i8 = -1;
            int i9 = -1;
            int i10 = -1;
            for (int i11 = 0; i11 < split.length; i11++) {
                String b = fg.b(split[i11].trim());
                b.getClass();
                b.hashCode();
                switch (b.hashCode()) {
                    case -1178781136:
                        if (b.equals("italic")) {
                            c = 0;
                            break;
                        }
                        c = 65535;
                        break;
                    case -1026963764:
                        if (b.equals("underline")) {
                            c = 1;
                            break;
                        }
                        c = 65535;
                        break;
                    case -192095652:
                        if (b.equals("strikeout")) {
                            c = 2;
                            break;
                        }
                        c = 65535;
                        break;
                    case -70925746:
                        if (b.equals("primarycolour")) {
                            c = 3;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3029637:
                        if (b.equals("bold")) {
                            c = 4;
                            break;
                        }
                        c = 65535;
                        break;
                    case 3373707:
                        if (b.equals("name")) {
                            c = 5;
                            break;
                        }
                        c = 65535;
                        break;
                    case 366554320:
                        if (b.equals("fontsize")) {
                            c = 6;
                            break;
                        }
                        c = 65535;
                        break;
                    case 767321349:
                        if (b.equals("borderstyle")) {
                            c = 7;
                            break;
                        }
                        c = 65535;
                        break;
                    case 1767875043:
                        if (b.equals("alignment")) {
                            c = '\b';
                            break;
                        }
                        c = 65535;
                        break;
                    case 1988365454:
                        if (b.equals("outlinecolour")) {
                            c = '\t';
                            break;
                        }
                        c = 65535;
                        break;
                    default:
                        c = 65535;
                        break;
                }
                switch (c) {
                    case 0:
                        i7 = i11;
                        break;
                    case 1:
                        i8 = i11;
                        break;
                    case 2:
                        i9 = i11;
                        break;
                    case 3:
                        i3 = i11;
                        break;
                    case 4:
                        i6 = i11;
                        break;
                    case 5:
                        i = i11;
                        break;
                    case 6:
                        i5 = i11;
                        break;
                    case 7:
                        i10 = i11;
                        break;
                    case '\b':
                        i2 = i11;
                        break;
                    case '\t':
                        i4 = i11;
                        break;
                }
            }
            if (i != -1) {
                return new a(i, i2, i3, i4, i5, i6, i7, i8, i9, i10, split.length);
            }
            return null;
        }
    }

    static final class b {
        private static final Pattern c = Pattern.compile("\\{([^}]*)\\}");
        private static final Pattern d;
        private static final Pattern e;
        private static final Pattern f;

        /* renamed from: a, reason: collision with root package name */
        public final int f15648a;
        public final PointF b;

        static {
            int i = f92.f15466a;
            Locale locale = Locale.US;
            d = Pattern.compile(String.format(locale, "\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
            e = Pattern.compile(String.format(locale, "\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));
            f = Pattern.compile("\\\\an(\\d+)");
        }

        private static PointF b(String str) {
            String group;
            String group2;
            Matcher matcher = d.matcher(str);
            Matcher matcher2 = e.matcher(str);
            boolean find = matcher.find();
            boolean find2 = matcher2.find();
            if (find) {
                if (find2) {
                    et0.c("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + Separators.QUOTE);
                }
                group = matcher.group(1);
                group2 = matcher.group(2);
            } else {
                if (!find2) {
                    return null;
                }
                group = matcher2.group(1);
                group2 = matcher2.group(2);
            }
            group.getClass();
            float parseFloat = Float.parseFloat(group.trim());
            group2.getClass();
            return new PointF(parseFloat, Float.parseFloat(group2.trim()));
        }

        public static String c(String str) {
            return c.matcher(str).replaceAll("");
        }

        private b(int i, PointF pointF) {
            this.f15648a = i;
            this.b = pointF;
        }

        public static b a(String str) {
            int i;
            Matcher matcher = c.matcher(str);
            PointF pointF = null;
            int i2 = -1;
            while (matcher.find()) {
                String group = matcher.group(1);
                group.getClass();
                try {
                    PointF b = b(group);
                    if (b != null) {
                        pointF = b;
                    }
                } catch (RuntimeException unused) {
                }
                try {
                    Matcher matcher2 = f.matcher(group);
                    if (matcher2.find()) {
                        String group2 = matcher2.group(1);
                        group2.getClass();
                        try {
                            i = Integer.parseInt(group2.trim());
                        } catch (NumberFormatException unused2) {
                        }
                        switch (i) {
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                            case 6:
                            case 7:
                            case 8:
                            case 9:
                                break;
                            default:
                                et0.d("SsaStyle", "Ignoring unknown alignment: " + group2);
                                break;
                        }
                    }
                    i = -1;
                    if (i != -1) {
                        i2 = i;
                    } else {
                        continue;
                    }
                } catch (RuntimeException unused3) {
                }
            }
            return new b(i2, pointF);
        }
    }

    private static boolean a(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e) {
            et0.b("SsaStyle", "Failed to parse boolean value: '" + str + Separators.QUOTE, e);
            return false;
        }
    }
}
