package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import com.autonavi.aps.amapapi.config.Const;
import io.nats.client.support.ApiConstants;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import okio.Buffer;
import org.apache.commons.net.ftp.FTPReply;
import org.apache.commons.net.telnet.TelnetCommand;

/* loaded from: classes5.dex */
public final class gi0 {
    private static final char[] j = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a, reason: collision with root package name */
    private final String f15594a;
    private final String b;
    private final String c;
    private final String d;
    private final int e;
    private final List<String> f;
    private final String g;
    private final String h;
    private final boolean i;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private String f15595a;
        private String d;
        private final ArrayList f;
        private ArrayList g;
        private String h;
        private String b = "";
        private String c = "";
        private int e = -1;

        /* renamed from: com.yandex.mobile.ads.impl.gi0$a$a, reason: collision with other inner class name */
        public static final class C0969a {
            public static final int a(String str, int i, int i2) {
                try {
                    int parseInt = Integer.parseInt(b.a(str, i, i2, "", false, false, false, false, TelnetCommand.EL));
                    if (1 > parseInt || parseInt >= 65536) {
                        return -1;
                    }
                    return parseInt;
                } catch (NumberFormatException unused) {
                    return -1;
                }
            }

            public static final int b(String str, int i, int i2) {
                while (i < i2) {
                    char charAt = str.charAt(i);
                    if (charAt == '[') {
                        do {
                            i++;
                            if (i < i2) {
                            }
                        } while (str.charAt(i) != ']');
                    } else if (charAt == ':') {
                        return i;
                    }
                    i++;
                }
                return i2;
            }

            public static final int c(String str, int i, int i2) {
                if (i2 - i < 2) {
                    return -1;
                }
                char charAt = str.charAt(i);
                if ((Intrinsics.compare((int) charAt, 97) < 0 || Intrinsics.compare((int) charAt, 122) > 0) && (Intrinsics.compare((int) charAt, 65) < 0 || Intrinsics.compare((int) charAt, 90) > 0)) {
                    return -1;
                }
                while (true) {
                    i++;
                    if (i >= i2) {
                        return -1;
                    }
                    char charAt2 = str.charAt(i);
                    if ('a' > charAt2 || charAt2 >= '{') {
                        if ('A' > charAt2 || charAt2 >= '[') {
                            if ('0' > charAt2 || charAt2 >= ':') {
                                if (charAt2 != '+' && charAt2 != '-' && charAt2 != '.') {
                                    if (charAt2 == ':') {
                                        return i;
                                    }
                                    return -1;
                                }
                            }
                        }
                    }
                }
            }

            public static final int d(String str, int i, int i2) {
                int i3 = 0;
                while (i < i2) {
                    char charAt = str.charAt(i);
                    if (charAt != '\\' && charAt != '/') {
                        break;
                    }
                    i3++;
                    i++;
                }
                return i3;
            }

            private C0969a() {
            }

            public /* synthetic */ C0969a(int i) {
                this();
            }
        }

        public final a c() {
            Intrinsics.checkNotNullParameter("", "password");
            this.c = b.a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
            return this;
        }

        public final void e(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.c = str;
        }

        public final void f(String str) {
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.b = str;
        }

        public final ArrayList b() {
            return this.f;
        }

        public final a b(String host) {
            Intrinsics.checkNotNullParameter(host, "host");
            String a2 = jg0.a(b.a(host, 0, 0, false, 7));
            if (a2 != null) {
                this.d = a2;
                return this;
            }
            throw new IllegalArgumentException("unexpected host: " + host);
        }

        public final a c(String scheme) {
            Intrinsics.checkNotNullParameter(scheme, "scheme");
            if (StringsKt.equals(scheme, "http", true)) {
                this.f15595a = "http";
                return this;
            }
            if (StringsKt.equals(scheme, "https", true)) {
                this.f15595a = "https";
                return this;
            }
            throw new IllegalArgumentException("unexpected scheme: " + scheme);
        }

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f = arrayList;
            arrayList.add("");
        }

        public final void h(String str) {
            this.f15595a = str;
        }

        public final a e() {
            Intrinsics.checkNotNullParameter("", "username");
            this.b = b.a("", 0, 0, " \"':;<=>@[]^`{}|/\\?#", false, false, false, false, 251);
            return this;
        }

        public final void g(String str) {
            this.d = str;
        }

        public final a d() {
            String str = this.d;
            this.d = str != null ? new Regex("[\"<>^`{|}]").replace(str, "") : null;
            int size = this.f.size();
            for (int i = 0; i < size; i++) {
                ArrayList arrayList = this.f;
                arrayList.set(i, b.a((String) arrayList.get(i), 0, 0, "[]", true, true, false, false, FTPReply.ENTERING_PASSIVE_MODE));
            }
            ArrayList arrayList2 = this.g;
            if (arrayList2 != null) {
                int size2 = arrayList2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    String str2 = (String) arrayList2.get(i2);
                    arrayList2.set(i2, str2 != null ? b.a(str2, 0, 0, "\\^`{|}", true, true, true, false, 195) : null);
                }
            }
            String str3 = this.h;
            this.h = str3 != null ? b.a(str3, 0, 0, " \"#<>\\^`{|}", true, true, false, true, 163) : null;
            return this;
        }

        public final gi0 a() {
            ArrayList arrayList;
            String str = this.f15595a;
            if (str != null) {
                String a2 = b.a(this.b, 0, 0, false, 7);
                String a3 = b.a(this.c, 0, 0, false, 7);
                String str2 = this.d;
                if (str2 != null) {
                    int i = this.e;
                    if (i == -1) {
                        String scheme = this.f15595a;
                        Intrinsics.checkNotNull(scheme);
                        Intrinsics.checkNotNullParameter(scheme, "scheme");
                        if (Intrinsics.areEqual(scheme, "http")) {
                            i = 80;
                        } else {
                            i = Intrinsics.areEqual(scheme, "https") ? 443 : -1;
                        }
                    }
                    ArrayList arrayList2 = this.f;
                    int i2 = i;
                    ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        arrayList3.add(b.a((String) it.next(), 0, 0, false, 7));
                    }
                    ArrayList<String> arrayList4 = this.g;
                    if (arrayList4 != null) {
                        ArrayList arrayList5 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList4, 10));
                        for (String str3 : arrayList4) {
                            arrayList5.add(str3 != null ? b.a(str3, 0, 0, true, 3) : null);
                        }
                        arrayList = arrayList5;
                    } else {
                        arrayList = null;
                    }
                    String str4 = this.h;
                    return new gi0(str, a2, a3, str2, i2, arrayList3, arrayList, str4 != null ? b.a(str4, 0, 0, false, 7) : null, toString());
                }
                throw new IllegalStateException("host == null");
            }
            throw new IllegalStateException("scheme == null");
        }

        /* JADX WARN: Code restructure failed: missing block: B:59:0x00b1, code lost:
        
            if (r1 != r5) goto L44;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.String toString() {
            /*
                Method dump skipped, instructions count: 335
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.gi0.a.toString():java.lang.String");
        }

        public final void b(int i) {
            this.e = i;
        }

        public final void d(String str) {
            this.h = str;
        }

        public final void a(String str) {
            String a2;
            this.g = (str == null || (a2 = b.a(str, 0, 0, " \"'<>#", true, false, true, false, 211)) == null) ? null : b.b(a2);
        }

        public final a a(gi0 gi0Var, String str) {
            int a2;
            int b;
            int a3;
            boolean z;
            boolean z2;
            char c;
            String input = str;
            Intrinsics.checkNotNullParameter(input, "input");
            a2 = g92.a(0, input.length(), input);
            b = g92.b(a2, input.length(), input);
            int c2 = C0969a.c(input, a2, b);
            boolean z3 = true;
            if (c2 != -1) {
                if (StringsKt.startsWith(input, Const.HTTPS_START, a2, true)) {
                    this.f15595a = "https";
                    a2 += 6;
                } else if (StringsKt.startsWith(input, Const.HTTP_START, a2, true)) {
                    this.f15595a = "http";
                    a2 += 5;
                } else {
                    String substring = input.substring(0, c2);
                    Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                    throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + substring + Separators.QUOTE);
                }
            } else if (gi0Var != null) {
                this.f15595a = gi0Var.k();
            } else {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            int d = C0969a.d(input, a2, b);
            char c3 = '?';
            char c4 = AbstractJsonLexerKt.STRING_ESC;
            char c5 = '/';
            char c6 = '#';
            if (d < 2 && gi0Var != null && Intrinsics.areEqual(gi0Var.k(), this.f15595a)) {
                this.b = gi0Var.f();
                this.c = gi0Var.b();
                this.d = gi0Var.g();
                this.e = gi0Var.i();
                this.f.clear();
                this.f.addAll(gi0Var.d());
                if (a2 == b || input.charAt(a2) == '#') {
                    a(gi0Var.e());
                }
                z = true;
            } else {
                int i = a2 + d;
                boolean z4 = false;
                boolean z5 = false;
                while (true) {
                    a3 = g92.a(i, b, input, "@/\\?#");
                    char charAt = a3 != b ? input.charAt(a3) : (char) 65535;
                    if (charAt == 65535 || charAt == c6 || charAt == c5 || charAt == c4 || charAt == c3) {
                        break;
                    }
                    if (charAt == '@') {
                        if (!z4) {
                            int a4 = g92.a(input, AbstractJsonLexerKt.COLON, i, a3);
                            z2 = z3;
                            String a5 = b.a(input, i, a4, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 240);
                            if (z5) {
                                a5 = this.b + "%40" + a5;
                            }
                            this.b = a5;
                            if (a4 != a3) {
                                a3 = a3;
                                this.c = b.a(str, a4 + 1, a3, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 240);
                                z4 = z2;
                            } else {
                                a3 = a3;
                            }
                            input = str;
                            z5 = z2;
                        } else {
                            z2 = z3;
                            input = str;
                            this.c += "%40" + b.a(input, i, a3, " \"':;<=>@[]^`{}|/\\?#", true, false, false, false, 240);
                        }
                        i = a3 + 1;
                        z3 = z2;
                        c4 = AbstractJsonLexerKt.STRING_ESC;
                        c5 = '/';
                        c6 = '#';
                        c3 = '?';
                    }
                }
                z = z3;
                int b2 = C0969a.b(input, i, a3);
                int i2 = b2 + 1;
                if (i2 < a3) {
                    this.d = jg0.a(b.a(input, i, b2, false, 4));
                    int a6 = C0969a.a(input, i2, a3);
                    this.e = a6;
                    if (a6 == -1) {
                        String substring2 = input.substring(i2, a3);
                        Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                        throw new IllegalArgumentException(("Invalid URL port: \"" + substring2 + "\"").toString());
                    }
                } else {
                    this.d = jg0.a(b.a(input, i, b2, false, 4));
                    String str2 = this.f15595a;
                    Intrinsics.checkNotNull(str2);
                    this.e = b.a(str2);
                }
                if (this.d == null) {
                    String substring3 = input.substring(i, b2);
                    Intrinsics.checkNotNullExpressionValue(substring3, "substring(...)");
                    throw new IllegalArgumentException(("Invalid URL host: \"" + substring3 + "\"").toString());
                }
                a2 = a3;
            }
            int a7 = g92.a(a2, b, input, "?#");
            if (a2 != a7) {
                char charAt2 = input.charAt(a2);
                if (charAt2 != '/' && charAt2 != '\\') {
                    this.f.set(r3.size() - 1, "");
                } else {
                    this.f.clear();
                    this.f.add("");
                    a2++;
                }
                while (a2 < a7) {
                    int a8 = g92.a(a2, a7, input, "/\\");
                    boolean z6 = a8 < a7 ? z : false;
                    String a9 = b.a(input, a2, a8, " \"<>^`{}|/\\?#", true, false, false, false, 240);
                    if (!Intrinsics.areEqual(a9, ".")) {
                        boolean z7 = z;
                        if (!StringsKt.equals(a9, "%2e", z7)) {
                            if (!Intrinsics.areEqual(a9, "..") && !StringsKt.equals(a9, "%2e.", z7) && !StringsKt.equals(a9, ".%2e", z7) && !StringsKt.equals(a9, "%2e%2e", z7)) {
                                ArrayList arrayList = this.f;
                                if (((CharSequence) arrayList.get(arrayList.size() - (z7 ? 1 : 0))).length() == 0) {
                                    ArrayList arrayList2 = this.f;
                                    arrayList2.set(arrayList2.size() - (z7 ? 1 : 0), a9);
                                } else {
                                    this.f.add(a9);
                                }
                                if (z6) {
                                    this.f.add("");
                                }
                            } else {
                                if (((String) this.f.remove(r2.size() - 1)).length() == 0 && !this.f.isEmpty()) {
                                    this.f.set(r2.size() - 1, "");
                                } else {
                                    this.f.add("");
                                }
                            }
                        }
                    }
                    a2 = z6 ? a8 + 1 : a8;
                    z = true;
                }
            }
            if (a7 >= b || input.charAt(a7) != '?') {
                c = '#';
            } else {
                c = '#';
                int a10 = g92.a(input, '#', a7, b);
                this.g = b.b(b.a(input, a7 + 1, a10, " \"'<>#", true, false, true, false, 208));
                a7 = a10;
            }
            if (a7 < b && input.charAt(a7) == c) {
                this.h = b.a(input, a7 + 1, b, "", true, false, false, true, 176);
            }
            return this;
        }

        public final a a(int i) {
            if (1 <= i && i < 65536) {
                this.e = i;
                return this;
            }
            throw new IllegalArgumentException(("unexpected port: " + i).toString());
        }
    }

    public static final class b {
        public static ArrayList b(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (i <= str.length()) {
                String str2 = str;
                int indexOf$default = StringsKt.indexOf$default((CharSequence) str2, Typography.amp, i, false, 4, (Object) null);
                if (indexOf$default == -1) {
                    indexOf$default = str2.length();
                }
                int indexOf$default2 = StringsKt.indexOf$default((CharSequence) str2, com.alipay.sdk.m.p.a.h, i, false, 4, (Object) null);
                if (indexOf$default2 == -1 || indexOf$default2 > indexOf$default) {
                    String substring = str2.substring(i, indexOf$default);
                    Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                    arrayList.add(substring);
                    arrayList.add(null);
                } else {
                    String substring2 = str2.substring(i, indexOf$default2);
                    Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
                    arrayList.add(substring2);
                    String substring3 = str2.substring(indexOf$default2 + 1, indexOf$default);
                    Intrinsics.checkNotNullExpressionValue(substring3, "substring(...)");
                    arrayList.add(substring3);
                }
                i = indexOf$default + 1;
                str = str2;
            }
            return arrayList;
        }

        /* JADX WARN: Code restructure failed: missing block: B:67:0x0105, code lost:
        
            if (com.yandex.mobile.ads.impl.g92.a(r17.charAt(r12)) != (-1)) goto L93;
         */
        /* JADX WARN: Removed duplicated region for block: B:70:0x0112  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0120 A[LOOP:2: B:72:0x011a->B:74:0x0120, LOOP_END] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public static java.lang.String a(java.lang.String r17, int r18, int r19, java.lang.String r20, boolean r21, boolean r22, boolean r23, boolean r24, int r25) {
            /*
                Method dump skipped, instructions count: 349
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.gi0.b.a(java.lang.String, int, int, java.lang.String, boolean, boolean, boolean, boolean, int):java.lang.String");
        }

        private b() {
        }

        public /* synthetic */ b(int i) {
            this();
        }

        @JvmStatic
        public static int a(String scheme) {
            Intrinsics.checkNotNullParameter(scheme, "scheme");
            if (Intrinsics.areEqual(scheme, "http")) {
                return 80;
            }
            return Intrinsics.areEqual(scheme, "https") ? 443 : -1;
        }

        public static String a(String str, int i, int i2, boolean z, int i3) {
            int i4;
            if ((i3 & 1) != 0) {
                i = 0;
            }
            if ((i3 & 2) != 0) {
                i2 = str.length();
            }
            if ((i3 & 4) != 0) {
                z = false;
            }
            Intrinsics.checkNotNullParameter(str, "<this>");
            int i5 = i;
            while (i5 < i2) {
                char charAt = str.charAt(i5);
                if (charAt == '%' || (charAt == '+' && z)) {
                    Buffer buffer = new Buffer();
                    buffer.writeUtf8(str, i, i5);
                    while (i5 < i2) {
                        int codePointAt = str.codePointAt(i5);
                        if (codePointAt == 37 && (i4 = i5 + 2) < i2) {
                            int a2 = g92.a(str.charAt(i5 + 1));
                            int a3 = g92.a(str.charAt(i4));
                            if (a2 != -1 && a3 != -1) {
                                buffer.writeByte((a2 << 4) + a3);
                                i5 = Character.charCount(codePointAt) + i4;
                            }
                            buffer.writeUtf8CodePoint(codePointAt);
                            i5 += Character.charCount(codePointAt);
                        } else {
                            if (codePointAt == 43 && z) {
                                buffer.writeByte(32);
                                i5++;
                            }
                            buffer.writeUtf8CodePoint(codePointAt);
                            i5 += Character.charCount(codePointAt);
                        }
                    }
                    return buffer.readUtf8();
                }
                i5++;
            }
            String substring = str.substring(i, i2);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            return substring;
        }
    }

    public gi0(String scheme, String username, String password, String host, int i, ArrayList pathSegments, ArrayList arrayList, String str, String url) {
        Intrinsics.checkNotNullParameter(scheme, "scheme");
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(host, "host");
        Intrinsics.checkNotNullParameter(pathSegments, "pathSegments");
        Intrinsics.checkNotNullParameter(url, "url");
        this.f15594a = scheme;
        this.b = username;
        this.c = password;
        this.d = host;
        this.e = i;
        this.f = arrayList;
        this.g = str;
        this.h = url;
        this.i = Intrinsics.areEqual(scheme, "https");
    }

    public final URL m() {
        try {
            return new URL(this.h);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public final ArrayList d() {
        int indexOf$default = StringsKt.indexOf$default((CharSequence) this.h, '/', this.f15594a.length() + 3, false, 4, (Object) null);
        String str = this.h;
        int a2 = g92.a(indexOf$default, str.length(), str, "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf$default < a2) {
            int i = indexOf$default + 1;
            int a3 = g92.a(this.h, '/', i, a2);
            String substring = this.h.substring(i, a3);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            arrayList.add(substring);
            indexOf$default = a3;
        }
        return arrayList;
    }

    public final String j() {
        a aVar;
        Intrinsics.checkNotNullParameter("/...", ApiConstants.LINK);
        try {
            aVar = new a().a(this, "/...");
        } catch (IllegalArgumentException unused) {
            aVar = null;
        }
        Intrinsics.checkNotNull(aVar);
        return aVar.e().c().a().h;
    }

    public final URI l() {
        String substring;
        a aVar = new a();
        aVar.h(this.f15594a);
        aVar.f(f());
        aVar.e(b());
        aVar.g(this.d);
        aVar.b(this.e != b.a(this.f15594a) ? this.e : -1);
        aVar.b().clear();
        aVar.b().addAll(d());
        aVar.a(e());
        if (this.g == null) {
            substring = null;
        } else {
            substring = this.h.substring(StringsKt.indexOf$default((CharSequence) this.h, '#', 0, false, 6, (Object) null) + 1);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        }
        aVar.d(substring);
        String aVar2 = aVar.d().toString();
        try {
            return new URI(aVar2);
        } catch (URISyntaxException e) {
            try {
                URI create = URI.create(new Regex("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]").replace(aVar2, ""));
                Intrinsics.checkNotNull(create);
                return create;
            } catch (Exception unused) {
                throw new RuntimeException(e);
            }
        }
    }

    public final String k() {
        return this.f15594a;
    }

    public final String g() {
        return this.d;
    }

    public final int i() {
        return this.e;
    }

    public final boolean h() {
        return this.i;
    }

    public final String f() {
        if (this.b.length() == 0) {
            return "";
        }
        int length = this.f15594a.length() + 3;
        String str = this.h;
        String substring = this.h.substring(length, g92.a(length, str.length(), str, ":@"));
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public final String b() {
        if (this.c.length() == 0) {
            return "";
        }
        String substring = this.h.substring(StringsKt.indexOf$default((CharSequence) this.h, AbstractJsonLexerKt.COLON, this.f15594a.length() + 3, false, 4, (Object) null) + 1, StringsKt.indexOf$default((CharSequence) this.h, '@', 0, false, 6, (Object) null));
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public final String c() {
        int indexOf$default = StringsKt.indexOf$default((CharSequence) this.h, '/', this.f15594a.length() + 3, false, 4, (Object) null);
        String str = this.h;
        String substring = this.h.substring(indexOf$default, g92.a(indexOf$default, str.length(), str, "?#"));
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public final String e() {
        if (this.f == null) {
            return null;
        }
        int indexOf$default = StringsKt.indexOf$default((CharSequence) this.h, '?', 0, false, 6, (Object) null) + 1;
        String str = this.h;
        String substring = this.h.substring(indexOf$default, g92.a(str, '#', indexOf$default, str.length()));
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        return substring;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof gi0) && Intrinsics.areEqual(((gi0) obj).h, this.h);
    }

    public final int hashCode() {
        return this.h.hashCode();
    }

    public final String toString() {
        return this.h;
    }
}
