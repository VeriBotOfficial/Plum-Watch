package com.anythink.core.common.n.b;

import com.google.common.net.HttpHeaders;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes12.dex */
public final class m {

    /* renamed from: a, reason: collision with root package name */
    private static final Pattern f4192a = Pattern.compile("(\\d{2,4})[^\\d]*");
    private static final Pattern b = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");
    private static final Pattern c = Pattern.compile("(\\d{1,2})[^\\d]*");
    private static final Pattern d = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");
    private final String e;
    private final String f;
    private final long g;
    private final String h;
    private final String i;
    private final boolean j;
    private final boolean k;
    private final boolean l;
    private final boolean m;

    private m(String str, String str2, long j, String str3, String str4, boolean z, boolean z2, boolean z3, boolean z4) {
        this.e = str;
        this.f = str2;
        this.g = j;
        this.h = str3;
        this.i = str4;
        this.j = z;
        this.k = z2;
        this.m = z3;
        this.l = z4;
    }

    m(a aVar) {
        if (aVar.f4193a == null) {
            throw new NullPointerException("builder.name == null");
        }
        if (aVar.b == null) {
            throw new NullPointerException("builder.value == null");
        }
        if (aVar.d == null) {
            throw new NullPointerException("builder.domain == null");
        }
        this.e = aVar.f4193a;
        this.f = aVar.b;
        this.g = aVar.c;
        this.h = aVar.d;
        this.i = aVar.e;
        this.j = aVar.f;
        this.k = aVar.g;
        this.l = aVar.h;
        this.m = aVar.i;
    }

    public final String a() {
        return this.e;
    }

    public final String b() {
        return this.f;
    }

    private boolean c() {
        return this.l;
    }

    private long d() {
        return this.g;
    }

    private boolean e() {
        return this.m;
    }

    private String f() {
        return this.h;
    }

    private String g() {
        return this.i;
    }

    private boolean h() {
        return this.k;
    }

    private boolean i() {
        return this.j;
    }

    private boolean a(v vVar) {
        boolean a2;
        if (this.m) {
            a2 = vVar.m.equals(this.h);
        } else {
            a2 = a(vVar.m, this.h);
        }
        if (!a2) {
            return false;
        }
        String str = this.i;
        String h = vVar.h();
        if (h.equals(str) || (h.startsWith(str) && (str.endsWith("/") || h.charAt(str.length()) == '/'))) {
            return !this.j || vVar.c();
        }
        return false;
    }

    private static boolean a(String str, String str2) {
        if (str.equals(str2)) {
            return true;
        }
        return str.endsWith(str2) && str.charAt((str.length() - str2.length()) - 1) == '.' && !com.anythink.core.common.n.b.a.c.c(str);
    }

    private static boolean a(v vVar, String str) {
        String h = vVar.h();
        if (h.equals(str)) {
            return true;
        }
        if (h.startsWith(str)) {
            return str.endsWith("/") || h.charAt(str.length()) == '/';
        }
        return false;
    }

    private static m b(v vVar, String str) {
        return a(System.currentTimeMillis(), vVar, str);
    }

    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v13 */
    private static m a(long j, v vVar, String str) {
        v vVar2;
        long j2;
        String str2;
        int i;
        boolean z;
        int i2;
        int i3;
        int i4;
        int i5;
        String str3 = str;
        int length = str3.length();
        ?? r3 = 0;
        char c2 = ';';
        int a2 = com.anythink.core.common.n.b.a.c.a(str3, 0, length, ';');
        char c3 = com.alipay.sdk.m.p.a.h;
        int a3 = com.anythink.core.common.n.b.a.c.a(str3, 0, a2, com.alipay.sdk.m.p.a.h);
        String str4 = null;
        if (a3 == a2) {
            return null;
        }
        String c4 = com.anythink.core.common.n.b.a.c.c(str3, 0, a3);
        if (!c4.isEmpty()) {
            int i6 = -1;
            if (com.anythink.core.common.n.b.a.c.b(c4) == -1) {
                boolean z2 = true;
                String c5 = com.anythink.core.common.n.b.a.c.c(str3, a3 + 1, a2);
                if (com.anythink.core.common.n.b.a.c.b(c5) != -1) {
                    return null;
                }
                int i7 = a2 + 1;
                boolean z3 = false;
                boolean z4 = false;
                boolean z5 = false;
                String str5 = null;
                boolean z6 = true;
                long j3 = -1;
                long j4 = 253402300799999L;
                while (i7 < length) {
                    int a4 = com.anythink.core.common.n.b.a.c.a(str3, i7, length, c2);
                    int a5 = com.anythink.core.common.n.b.a.c.a(str3, i7, a4, c3);
                    String c6 = com.anythink.core.common.n.b.a.c.c(str3, i7, a5);
                    if (a5 < a4) {
                        str2 = com.anythink.core.common.n.b.a.c.c(str3, a5 + 1, a4);
                    } else {
                        str2 = "";
                    }
                    if (c6.equalsIgnoreCase("expires")) {
                        try {
                            int length2 = str2.length();
                            int a6 = a(str2, r3, length2, r3);
                            try {
                                Matcher matcher = d.matcher(str2);
                                int i8 = i6;
                                int i9 = i8;
                                int i10 = i9;
                                int i11 = i10;
                                int i12 = i11;
                                int i13 = i12;
                                while (a6 < length2) {
                                    int a7 = a(str2, a6 + 1, length2, z2);
                                    matcher.region(a6, a7);
                                    int i14 = i9;
                                    try {
                                        if (i14 != -1) {
                                            i2 = -1;
                                        } else if (matcher.usePattern(d).matches()) {
                                            i14 = Integer.parseInt(matcher.group(1));
                                            i12 = Integer.parseInt(matcher.group(2));
                                            i13 = Integer.parseInt(matcher.group(3));
                                            i5 = i10;
                                            i = length;
                                            i9 = i14;
                                            a6 = a(str2, a7 + 1, length2, false);
                                            length = i;
                                            z2 = true;
                                            i10 = i5;
                                        } else {
                                            i2 = -1;
                                        }
                                        if (i3 != i2) {
                                            int i15 = length;
                                            i4 = i2;
                                            i5 = i10;
                                            i = i15;
                                        } else if (matcher.usePattern(c).matches()) {
                                            i11 = Integer.parseInt(matcher.group(1));
                                            i5 = i10;
                                            i = length;
                                            i9 = i14;
                                            a6 = a(str2, a7 + 1, length2, false);
                                            length = i;
                                            z2 = true;
                                            i10 = i5;
                                        } else {
                                            i5 = i10;
                                            i = length;
                                            i4 = -1;
                                        }
                                        if (i5 == i4) {
                                            Pattern pattern = b;
                                            if (matcher.usePattern(pattern).matches()) {
                                                i5 = pattern.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
                                                i11 = i3;
                                                i9 = i14;
                                                a6 = a(str2, a7 + 1, length2, false);
                                                length = i;
                                                z2 = true;
                                                i10 = i5;
                                            } else {
                                                i4 = -1;
                                            }
                                        }
                                        i9 = i14;
                                        a6 = a(str2, a7 + 1, length2, false);
                                        length = i;
                                        z2 = true;
                                        i10 = i5;
                                    } catch (IllegalArgumentException unused) {
                                        c2 = ';';
                                        z = true;
                                        i7 = a4 + 1;
                                        str3 = str;
                                        z2 = z;
                                        length = i;
                                        r3 = 0;
                                        c3 = com.alipay.sdk.m.p.a.h;
                                        i6 = -1;
                                    }
                                    i3 = i11;
                                    if (i8 == i4 && matcher.usePattern(f4192a).matches()) {
                                        i8 = Integer.parseInt(matcher.group(1));
                                    }
                                    i11 = i3;
                                }
                                int i16 = i9;
                                int i17 = i10;
                                int i18 = i11;
                                i = length;
                                if (i8 >= 70 && i8 <= 99) {
                                    i8 += 1900;
                                }
                                if (i8 >= 0 && i8 <= 69) {
                                    i8 += 2000;
                                }
                                if (i8 < 1601) {
                                    throw new IllegalArgumentException();
                                }
                                if (i17 == -1) {
                                    throw new IllegalArgumentException();
                                }
                                if (i18 <= 0 || i18 > 31) {
                                    throw new IllegalArgumentException();
                                }
                                if (i16 < 0 || i16 > 23) {
                                    throw new IllegalArgumentException();
                                }
                                int i19 = i12;
                                c2 = ';';
                                if (i19 < 0 || i19 > 59) {
                                    throw new IllegalArgumentException();
                                }
                                int i20 = i13;
                                if (i20 < 0 || i20 > 59) {
                                    throw new IllegalArgumentException();
                                }
                                try {
                                    GregorianCalendar gregorianCalendar = new GregorianCalendar(com.anythink.core.common.n.b.a.c.f);
                                    gregorianCalendar.setLenient(false);
                                    gregorianCalendar.set(1, i8);
                                    gregorianCalendar.set(2, i17 - 1);
                                    gregorianCalendar.set(5, i18);
                                    gregorianCalendar.set(11, i16);
                                    gregorianCalendar.set(12, i19);
                                    gregorianCalendar.set(13, i20);
                                    gregorianCalendar.set(14, 0);
                                    j4 = gregorianCalendar.getTimeInMillis();
                                } catch (NumberFormatException | IllegalArgumentException unused2) {
                                    z = true;
                                    i7 = a4 + 1;
                                    str3 = str;
                                    z2 = z;
                                    length = i;
                                    r3 = 0;
                                    c3 = com.alipay.sdk.m.p.a.h;
                                    i6 = -1;
                                }
                            } catch (IllegalArgumentException unused3) {
                                i = length;
                            }
                        } catch (IllegalArgumentException unused4) {
                            i = length;
                        }
                    } else {
                        i = length;
                        if (c6.equalsIgnoreCase("max-age")) {
                            j3 = a(str2);
                        } else {
                            if (!c6.equalsIgnoreCase("domain")) {
                                z = true;
                                if (c6.equalsIgnoreCase("path")) {
                                    str5 = str2;
                                } else if (c6.equalsIgnoreCase("secure")) {
                                    z4 = true;
                                } else if (c6.equalsIgnoreCase("httponly")) {
                                    z5 = true;
                                }
                            } else {
                                if (str2.endsWith(".")) {
                                    throw new IllegalArgumentException();
                                }
                                if (str2.startsWith(".")) {
                                    z = true;
                                    try {
                                        str2 = str2.substring(1);
                                    } catch (IllegalArgumentException unused5) {
                                        continue;
                                    }
                                } else {
                                    z = true;
                                }
                                String a8 = com.anythink.core.common.n.b.a.c.a(str2);
                                if (a8 == null) {
                                    throw new IllegalArgumentException();
                                }
                                str4 = a8;
                                z6 = false;
                            }
                            i7 = a4 + 1;
                            str3 = str;
                            z2 = z;
                            length = i;
                            r3 = 0;
                            c3 = com.alipay.sdk.m.p.a.h;
                            i6 = -1;
                        }
                    }
                    z = true;
                    z3 = true;
                    i7 = a4 + 1;
                    str3 = str;
                    z2 = z;
                    length = i;
                    r3 = 0;
                    c3 = com.alipay.sdk.m.p.a.h;
                    i6 = -1;
                }
                if (j3 == Long.MIN_VALUE) {
                    j2 = Long.MIN_VALUE;
                    vVar2 = vVar;
                } else if (j3 != -1) {
                    long j5 = j + (j3 <= 9223372036854775L ? j3 * 1000 : Long.MAX_VALUE);
                    if (j5 < j || j5 > 253402300799999L) {
                        vVar2 = vVar;
                        j2 = 253402300799999L;
                    } else {
                        vVar2 = vVar;
                        j2 = j5;
                    }
                } else {
                    vVar2 = vVar;
                    j2 = j4;
                }
                String str6 = vVar2.m;
                if (str4 == null) {
                    str4 = str6;
                } else if (!a(str6, str4)) {
                    return null;
                }
                if (str6.length() != str4.length() && com.anythink.core.common.n.b.a.i.a.a().a(str4) == null) {
                    return null;
                }
                if (str5 == null || !str5.startsWith("/")) {
                    String h = vVar2.h();
                    int lastIndexOf = h.lastIndexOf(47);
                    if (lastIndexOf == 0) {
                        str5 = "/";
                    } else {
                        str5 = h.substring(0, lastIndexOf);
                    }
                }
                return new m(c4, c5, j2, str4, str5, z4, z5, z6, z3);
            }
        }
        return null;
    }

    private static long a(String str, int i) {
        int a2 = a(str, 0, i, false);
        Matcher matcher = d.matcher(str);
        int i2 = -1;
        int i3 = -1;
        int i4 = -1;
        int i5 = -1;
        int i6 = -1;
        int i7 = -1;
        while (a2 < i) {
            int a3 = a(str, a2 + 1, i, true);
            matcher.region(a2, a3);
            if (i3 == -1 && matcher.usePattern(d).matches()) {
                i3 = Integer.parseInt(matcher.group(1));
                i6 = Integer.parseInt(matcher.group(2));
                i7 = Integer.parseInt(matcher.group(3));
            } else if (i4 == -1 && matcher.usePattern(c).matches()) {
                i4 = Integer.parseInt(matcher.group(1));
            } else {
                if (i5 == -1) {
                    Pattern pattern = b;
                    if (matcher.usePattern(pattern).matches()) {
                        i5 = pattern.pattern().indexOf(matcher.group(1).toLowerCase(Locale.US)) / 4;
                    }
                }
                if (i2 == -1 && matcher.usePattern(f4192a).matches()) {
                    i2 = Integer.parseInt(matcher.group(1));
                }
            }
            a2 = a(str, a3 + 1, i, false);
        }
        if (i2 >= 70 && i2 <= 99) {
            i2 += 1900;
        }
        if (i2 >= 0 && i2 <= 69) {
            i2 += 2000;
        }
        if (i2 < 1601) {
            throw new IllegalArgumentException();
        }
        if (i5 == -1) {
            throw new IllegalArgumentException();
        }
        if (i4 <= 0 || i4 > 31) {
            throw new IllegalArgumentException();
        }
        if (i3 < 0 || i3 > 23) {
            throw new IllegalArgumentException();
        }
        if (i6 < 0 || i6 > 59) {
            throw new IllegalArgumentException();
        }
        if (i7 < 0 || i7 > 59) {
            throw new IllegalArgumentException();
        }
        GregorianCalendar gregorianCalendar = new GregorianCalendar(com.anythink.core.common.n.b.a.c.f);
        gregorianCalendar.setLenient(false);
        gregorianCalendar.set(1, i2);
        gregorianCalendar.set(2, i5 - 1);
        gregorianCalendar.set(5, i4);
        gregorianCalendar.set(11, i3);
        gregorianCalendar.set(12, i6);
        gregorianCalendar.set(13, i7);
        gregorianCalendar.set(14, 0);
        return gregorianCalendar.getTimeInMillis();
    }

    private static int a(String str, int i, int i2, boolean z) {
        while (i < i2) {
            char charAt = str.charAt(i);
            if (((charAt < ' ' && charAt != '\t') || charAt >= 127 || (charAt >= '0' && charAt <= '9') || ((charAt >= 'a' && charAt <= 'z') || ((charAt >= 'A' && charAt <= 'Z') || charAt == ':'))) == (!z)) {
                return i;
            }
            i++;
        }
        return i2;
    }

    private static long a(String str) {
        try {
            long parseLong = Long.parseLong(str);
            if (parseLong <= 0) {
                return Long.MIN_VALUE;
            }
            return parseLong;
        } catch (NumberFormatException e) {
            if (str.matches("-?\\d+")) {
                return str.startsWith(Constants.ACCEPT_TIME_SEPARATOR_SERVER) ? Long.MIN_VALUE : Long.MAX_VALUE;
            }
            throw e;
        }
    }

    private static String b(String str) {
        if (str.endsWith(".")) {
            throw new IllegalArgumentException();
        }
        if (str.startsWith(".")) {
            str = str.substring(1);
        }
        String a2 = com.anythink.core.common.n.b.a.c.a(str);
        if (a2 != null) {
            return a2;
        }
        throw new IllegalArgumentException();
    }

    public static List<m> a(v vVar, u uVar) {
        List<String> b2 = uVar.b(HttpHeaders.SET_COOKIE);
        int size = b2.size();
        ArrayList arrayList = null;
        for (int i = 0; i < size; i++) {
            m a2 = a(System.currentTimeMillis(), vVar, b2.get(i));
            if (a2 != null) {
                if (arrayList == null) {
                    arrayList = new ArrayList();
                }
                arrayList.add(a2);
            }
        }
        if (arrayList != null) {
            return Collections.unmodifiableList(arrayList);
        }
        return Collections.emptyList();
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        String f4193a;
        String b;
        String d;
        boolean f;
        boolean g;
        boolean h;
        boolean i;
        long c = 253402300799999L;
        String e = "/";

        private a a(String str) {
            if (str == null) {
                throw new NullPointerException("name == null");
            }
            if (!str.trim().equals(str)) {
                throw new IllegalArgumentException("name is not trimmed");
            }
            this.f4193a = str;
            return this;
        }

        private a b(String str) {
            if (str == null) {
                throw new NullPointerException("value == null");
            }
            if (!str.trim().equals(str)) {
                throw new IllegalArgumentException("value is not trimmed");
            }
            this.b = str;
            return this;
        }

        private a a(long j) {
            if (j <= 0) {
                j = Long.MIN_VALUE;
            }
            if (j > 253402300799999L) {
                j = 253402300799999L;
            }
            this.c = j;
            this.h = true;
            return this;
        }

        private a c(String str) {
            return a(str, false);
        }

        private a d(String str) {
            return a(str, true);
        }

        private a a(String str, boolean z) {
            if (str == null) {
                throw new NullPointerException("domain == null");
            }
            String a2 = com.anythink.core.common.n.b.a.c.a(str);
            if (a2 == null) {
                throw new IllegalArgumentException("unexpected domain: ".concat(String.valueOf(str)));
            }
            this.d = a2;
            this.i = z;
            return this;
        }

        private a e(String str) {
            if (!str.startsWith("/")) {
                throw new IllegalArgumentException("path must start with '/'");
            }
            this.e = str;
            return this;
        }

        private a a() {
            this.f = true;
            return this;
        }

        private a b() {
            this.g = true;
            return this;
        }

        private m c() {
            return new m(this);
        }
    }

    private String j() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.e);
        sb.append(com.alipay.sdk.m.p.a.h);
        sb.append(this.f);
        if (this.l) {
            if (this.g == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=").append(com.anythink.core.common.n.b.a.c.d.a(new Date(this.g)));
            }
        }
        if (!this.m) {
            sb.append("; domain=");
            sb.append(this.h);
        }
        sb.append("; path=").append(this.i);
        if (this.j) {
            sb.append("; secure");
        }
        if (this.k) {
            sb.append("; httponly");
        }
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return mVar.e.equals(this.e) && mVar.f.equals(this.f) && mVar.h.equals(this.h) && mVar.i.equals(this.i) && mVar.g == this.g && mVar.j == this.j && mVar.k == this.k && mVar.l == this.l && mVar.m == this.m;
    }

    public final int hashCode() {
        int hashCode = (((((((this.e.hashCode() + 527) * 31) + this.f.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31;
        long j = this.g;
        return ((((((((hashCode + ((int) (j ^ (j >>> 32)))) * 31) + (!this.j ? 1 : 0)) * 31) + (!this.k ? 1 : 0)) * 31) + (!this.l ? 1 : 0)) * 31) + (!this.m ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.e);
        sb.append(com.alipay.sdk.m.p.a.h);
        sb.append(this.f);
        if (this.l) {
            if (this.g == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=").append(com.anythink.core.common.n.b.a.c.d.a(new Date(this.g)));
            }
        }
        if (!this.m) {
            sb.append("; domain=");
            sb.append(this.h);
        }
        sb.append("; path=").append(this.i);
        if (this.j) {
            sb.append("; secure");
        }
        if (this.k) {
            sb.append("; httponly");
        }
        return sb.toString();
    }
}
