package com.anythink.core.common.n.b;

import android.gov.nist.core.Separators;
import com.autonavi.aps.amapapi.config.Const;
import java.net.MalformedURLException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes12.dex */
public final class v {

    /* renamed from: a, reason: collision with root package name */
    static final String f4203a = " \"':;<=>@[]^`{}|/\\?#";
    static final String b = " \"':;<=>@[]^`{}|/\\?#";
    static final String c = " \"<>^`{}|/\\?#";
    static final String d = "[]";
    static final String e = " \"'<>#";
    static final String f = " \"'<>#&=";
    static final String g = " !\"#$&'(),/:;<=>?@[]\\^`{|}~";
    static final String h = "\\^`{|}";
    static final String i = " \"':;<=>@[]^`{}|/\\?#&!$(),~";
    static final String j = "";
    static final String k = " \"#<>\\^`{|}";
    private static final char[] o = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    final String l;
    final String m;
    final int n;
    private final String p;

    /* renamed from: q, reason: collision with root package name */
    private final String f4204q;
    private final List<String> r;
    private final List<String> s;
    private final String t;
    private final String u;

    v(a aVar) {
        this.l = aVar.f4205a;
        this.p = a(aVar.b, false);
        this.f4204q = a(aVar.c, false);
        this.m = aVar.d;
        this.n = aVar.a();
        this.r = a(aVar.f, false);
        this.s = aVar.g != null ? a(aVar.g, true) : null;
        this.t = aVar.h != null ? a(aVar.h, false) : null;
        this.u = aVar.toString();
    }

    private URL m() {
        try {
            return new URL(this.u);
        } catch (MalformedURLException e2) {
            throw new RuntimeException(e2);
        }
    }

    public final String b() {
        return this.l;
    }

    public final boolean c() {
        return this.l.equals("https");
    }

    public final String d() {
        if (this.p.isEmpty()) {
            return "";
        }
        int length = this.l.length() + 3;
        String str = this.u;
        return this.u.substring(length, com.anythink.core.common.n.b.a.c.a(str, length, str.length(), ":@"));
    }

    private String n() {
        return this.p;
    }

    public final String e() {
        if (this.f4204q.isEmpty()) {
            return "";
        }
        return this.u.substring(this.u.indexOf(58, this.l.length() + 3) + 1, this.u.indexOf(64));
    }

    private String o() {
        return this.f4204q;
    }

    public final String f() {
        return this.m;
    }

    public final int g() {
        return this.n;
    }

    public static int a(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    private int p() {
        return this.r.size();
    }

    public final String h() {
        int indexOf = this.u.indexOf(47, this.l.length() + 3);
        String str = this.u;
        return this.u.substring(indexOf, com.anythink.core.common.n.b.a.c.a(str, indexOf, str.length(), "?#"));
    }

    static void a(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            sb.append('/');
            sb.append(list.get(i2));
        }
    }

    public final List<String> i() {
        int indexOf = this.u.indexOf(47, this.l.length() + 3);
        String str = this.u;
        int a2 = com.anythink.core.common.n.b.a.c.a(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < a2) {
            int i2 = indexOf + 1;
            int a3 = com.anythink.core.common.n.b.a.c.a(this.u, i2, a2, '/');
            arrayList.add(this.u.substring(i2, a3));
            indexOf = a3;
        }
        return arrayList;
    }

    private List<String> q() {
        return this.r;
    }

    public final String j() {
        if (this.s == null) {
            return null;
        }
        int indexOf = this.u.indexOf(63) + 1;
        String str = this.u;
        return this.u.substring(indexOf, com.anythink.core.common.n.b.a.c.a(str, indexOf, str.length(), '#'));
    }

    static void b(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i2 = 0; i2 < size; i2 += 2) {
            String str = list.get(i2);
            String str2 = list.get(i2 + 1);
            if (i2 > 0) {
                sb.append(Typography.amp);
            }
            sb.append(str);
            if (str2 != null) {
                sb.append(com.alipay.sdk.m.p.a.h);
                sb.append(str2);
            }
        }
    }

    static List<String> b(String str) {
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        while (i2 <= str.length()) {
            int indexOf = str.indexOf(38, i2);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i2);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i2, indexOf));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i2, indexOf2));
                arrayList.add(str.substring(indexOf2 + 1, indexOf));
            }
            i2 = indexOf + 1;
        }
        return arrayList;
    }

    public final String k() {
        if (this.s == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        b(sb, this.s);
        return sb.toString();
    }

    private int r() {
        List<String> list = this.s;
        if (list != null) {
            return list.size() / 2;
        }
        return 0;
    }

    private String e(String str) {
        List<String> list = this.s;
        if (list == null) {
            return null;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2 += 2) {
            if (str.equals(this.s.get(i2))) {
                return this.s.get(i2 + 1);
            }
        }
        return null;
    }

    private Set<String> s() {
        if (this.s == null) {
            return Collections.emptySet();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int size = this.s.size();
        for (int i2 = 0; i2 < size; i2 += 2) {
            linkedHashSet.add(this.s.get(i2));
        }
        return Collections.unmodifiableSet(linkedHashSet);
    }

    private List<String> f(String str) {
        if (this.s == null) {
            return Collections.emptyList();
        }
        ArrayList arrayList = new ArrayList();
        int size = this.s.size();
        for (int i2 = 0; i2 < size; i2 += 2) {
            if (str.equals(this.s.get(i2))) {
                arrayList.add(this.s.get(i2 + 1));
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    private String a(int i2) {
        List<String> list = this.s;
        if (list == null) {
            throw new IndexOutOfBoundsException();
        }
        return list.get(i2 * 2);
    }

    private String b(int i2) {
        List<String> list = this.s;
        if (list == null) {
            throw new IndexOutOfBoundsException();
        }
        return list.get((i2 * 2) + 1);
    }

    private String t() {
        if (this.t == null) {
            return null;
        }
        return this.u.substring(this.u.indexOf(35) + 1);
    }

    private String u() {
        return this.t;
    }

    public final String l() {
        a g2 = g("/...");
        g2.b = a("", " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        g2.c = a("", " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
        return g2.b().toString();
    }

    public final v c(String str) {
        a g2 = g(str);
        if (g2 != null) {
            return g2.b();
        }
        return null;
    }

    private a v() {
        a aVar = new a();
        aVar.f4205a = this.l;
        aVar.b = d();
        aVar.c = e();
        aVar.d = this.m;
        aVar.e = this.n != a(this.l) ? this.n : -1;
        aVar.f.clear();
        aVar.f.addAll(i());
        aVar.b(j());
        aVar.h = this.t == null ? null : this.u.substring(this.u.indexOf(35) + 1);
        return aVar;
    }

    private a g(String str) {
        try {
            return new a().a(this, str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    private static v h(String str) {
        try {
            return d(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public static v d(String str) {
        return new a().a((v) null, str).b();
    }

    private static v a(URL url) {
        return h(url.toString());
    }

    private static v a(URI uri) {
        return h(uri.toString());
    }

    public final boolean equals(Object obj) {
        return (obj instanceof v) && ((v) obj).u.equals(this.u);
    }

    public final int hashCode() {
        return this.u.hashCode();
    }

    public final String toString() {
        return this.u;
    }

    private String w() {
        if (com.anythink.core.common.n.b.a.c.c(this.m)) {
            return null;
        }
        return com.anythink.core.common.n.b.a.i.a.a().a(this.m);
    }

    public static final class a {
        static final String i = "Invalid URL host";

        /* renamed from: a, reason: collision with root package name */
        String f4205a;
        String d;
        final List<String> f;
        List<String> g;
        String h;
        String b = "";
        String c = "";
        int e = -1;

        public a() {
            ArrayList arrayList = new ArrayList();
            this.f = arrayList;
            arrayList.add("");
        }

        private a c(String str) {
            if (str.equalsIgnoreCase("http")) {
                this.f4205a = "http";
                return this;
            }
            if (str.equalsIgnoreCase("https")) {
                this.f4205a = "https";
                return this;
            }
            throw new IllegalArgumentException("unexpected scheme: ".concat(String.valueOf(str)));
        }

        private a d(String str) {
            this.b = v.a(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        private a e(String str) {
            if (str == null) {
                throw new NullPointerException("encodedUsername == null");
            }
            this.b = v.a(str, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
            return this;
        }

        private a f(String str) {
            this.c = v.a(str, " \"':;<=>@[]^`{}|/\\?#", false, false, false, true);
            return this;
        }

        private a g(String str) {
            if (str == null) {
                throw new NullPointerException("encodedPassword == null");
            }
            this.c = v.a(str, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true);
            return this;
        }

        public final a a(String str) {
            if (str == null) {
                throw new NullPointerException("host == null");
            }
            String e = e(str, 0, str.length());
            if (e == null) {
                throw new IllegalArgumentException("unexpected host: ".concat(String.valueOf(str)));
            }
            this.d = e;
            return this;
        }

        private a a(int i2) {
            if (i2 <= 0 || i2 > 65535) {
                throw new IllegalArgumentException("unexpected port: ".concat(String.valueOf(i2)));
            }
            this.e = i2;
            return this;
        }

        final int a() {
            int i2 = this.e;
            return i2 != -1 ? i2 : v.a(this.f4205a);
        }

        private a h(String str) {
            if (str == null) {
                throw new NullPointerException("pathSegment == null");
            }
            a(str, 0, str.length(), false, false);
            return this;
        }

        private a i(String str) {
            if (str == null) {
                throw new NullPointerException("pathSegments == null");
            }
            return a(str, false);
        }

        private a j(String str) {
            if (str == null) {
                throw new NullPointerException("encodedPathSegment == null");
            }
            a(str, 0, str.length(), false, true);
            return this;
        }

        private a k(String str) {
            if (str == null) {
                throw new NullPointerException("encodedPathSegments == null");
            }
            return a(str, true);
        }

        private a a(String str, boolean z) {
            boolean z2;
            a aVar;
            String str2;
            boolean z3;
            int i2 = 0;
            while (true) {
                int a2 = com.anythink.core.common.n.b.a.c.a(str, i2, str.length(), "/\\");
                if (a2 < str.length()) {
                    z2 = true;
                    str2 = str;
                    z3 = z;
                    aVar = this;
                } else {
                    z2 = false;
                    aVar = this;
                    str2 = str;
                    z3 = z;
                }
                aVar.a(str2, i2, a2, z2, z3);
                i2 = a2 + 1;
                if (i2 > str2.length()) {
                    return aVar;
                }
                str = str2;
                z = z3;
            }
        }

        private a a(int i2, String str) {
            if (str == null) {
                throw new NullPointerException("pathSegment == null");
            }
            String a2 = v.a(str, 0, str.length(), " \"<>^`{}|/\\?#", false, false, false, true, null);
            if (s(a2) || t(a2)) {
                throw new IllegalArgumentException("unexpected path segment: ".concat(String.valueOf(str)));
            }
            this.f.set(i2, a2);
            return this;
        }

        private a b(int i2, String str) {
            if (str == null) {
                throw new NullPointerException("encodedPathSegment == null");
            }
            String a2 = v.a(str, 0, str.length(), " \"<>^`{}|/\\?#", true, false, false, true, null);
            this.f.set(i2, a2);
            if (s(a2) || t(a2)) {
                throw new IllegalArgumentException("unexpected path segment: ".concat(String.valueOf(str)));
            }
            return this;
        }

        private a b(int i2) {
            this.f.remove(i2);
            if (this.f.isEmpty()) {
                this.f.add("");
            }
            return this;
        }

        private a l(String str) {
            if (str == null) {
                throw new NullPointerException("encodedPath == null");
            }
            if (!str.startsWith("/")) {
                throw new IllegalArgumentException("unexpected encodedPath: ".concat(String.valueOf(str)));
            }
            a(str, 0, str.length());
            return this;
        }

        private a m(String str) {
            this.g = str != null ? v.b(v.a(str, " \"'<>#", false, false, true, true)) : null;
            return this;
        }

        public final a b(String str) {
            this.g = str != null ? v.b(v.a(str, " \"'<>#", true, false, true, true)) : null;
            return this;
        }

        private a a(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("name == null");
            }
            if (this.g == null) {
                this.g = new ArrayList();
            }
            this.g.add(v.a(str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true));
            this.g.add(str2 != null ? v.a(str2, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true) : null);
            return this;
        }

        private a b(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("encodedName == null");
            }
            if (this.g == null) {
                this.g = new ArrayList();
            }
            this.g.add(v.a(str, " \"'<>#&=", true, false, true, true));
            this.g.add(str2 != null ? v.a(str2, " \"'<>#&=", true, false, true, true) : null);
            return this;
        }

        private a n(String str) {
            if (str == null) {
                throw new NullPointerException("name == null");
            }
            if (this.g == null) {
                return this;
            }
            p(v.a(str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true));
            return this;
        }

        private a o(String str) {
            if (str == null) {
                throw new NullPointerException("encodedName == null");
            }
            if (this.g == null) {
                return this;
            }
            p(v.a(str, " \"'<>#&=", true, false, true, true));
            return this;
        }

        private void p(String str) {
            for (int size = this.g.size() - 2; size >= 0; size -= 2) {
                if (str.equals(this.g.get(size))) {
                    this.g.remove(size + 1);
                    this.g.remove(size);
                    if (this.g.isEmpty()) {
                        this.g = null;
                        return;
                    }
                }
            }
        }

        private a q(String str) {
            this.h = str != null ? v.a(str, "", false, false, false, false) : null;
            return this;
        }

        private a r(String str) {
            this.h = str != null ? v.a(str, "", true, false, false, false) : null;
            return this;
        }

        private a c() {
            int size = this.f.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.f.set(i2, v.a(this.f.get(i2), "[]", true, true, false, true));
            }
            List<String> list = this.g;
            if (list != null) {
                int size2 = list.size();
                for (int i3 = 0; i3 < size2; i3++) {
                    String str = this.g.get(i3);
                    if (str != null) {
                        this.g.set(i3, v.a(str, "\\^`{|}", true, true, true, true));
                    }
                }
            }
            String str2 = this.h;
            if (str2 != null) {
                this.h = v.a(str2, " \"#<>\\^`{|}", true, true, false, false);
            }
            return this;
        }

        public final v b() {
            if (this.f4205a == null) {
                throw new IllegalStateException("scheme == null");
            }
            if (this.d == null) {
                throw new IllegalStateException("host == null");
            }
            return new v(this);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            String str = this.f4205a;
            if (str != null) {
                sb.append(str);
                sb.append("://");
            } else {
                sb.append("//");
            }
            if (!this.b.isEmpty() || !this.c.isEmpty()) {
                sb.append(this.b);
                if (!this.c.isEmpty()) {
                    sb.append(AbstractJsonLexerKt.COLON);
                    sb.append(this.c);
                }
                sb.append('@');
            }
            String str2 = this.d;
            if (str2 != null) {
                if (str2.indexOf(58) != -1) {
                    sb.append(AbstractJsonLexerKt.BEGIN_LIST);
                    sb.append(this.d);
                    sb.append(AbstractJsonLexerKt.END_LIST);
                } else {
                    sb.append(this.d);
                }
            }
            if (this.e != -1 || this.f4205a != null) {
                int a2 = a();
                String str3 = this.f4205a;
                if (str3 == null || a2 != v.a(str3)) {
                    sb.append(AbstractJsonLexerKt.COLON);
                    sb.append(a2);
                }
            }
            v.a(sb, this.f);
            if (this.g != null) {
                sb.append('?');
                v.b(sb, this.g);
            }
            if (this.h != null) {
                sb.append('#');
                sb.append(this.h);
            }
            return sb.toString();
        }

        final a a(v vVar, String str) {
            int i2;
            int a2;
            String str2;
            int i3;
            String str3;
            char charAt;
            String str4 = str;
            int a3 = com.anythink.core.common.n.b.a.c.a(str4, 0, str4.length());
            int b = com.anythink.core.common.n.b.a.c.b(str4, a3, str4.length());
            int i4 = b - a3;
            char c = AbstractJsonLexerKt.COLON;
            if (i4 >= 2 && (((charAt = str4.charAt(a3)) >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z'))) {
                int i5 = a3 + 1;
                while (true) {
                    if (i5 >= b) {
                        break;
                    }
                    char charAt2 = str4.charAt(i5);
                    if ((charAt2 >= 'a' && charAt2 <= 'z') || ((charAt2 >= 'A' && charAt2 <= 'Z') || ((charAt2 >= '0' && charAt2 <= '9') || charAt2 == '+' || charAt2 == '-' || charAt2 == '.'))) {
                        i5++;
                    } else if (charAt2 == ':') {
                        i2 = i5;
                    }
                }
            }
            i2 = -1;
            if (i2 != -1) {
                if (str4.regionMatches(true, a3, Const.HTTPS_START, 0, 6)) {
                    this.f4205a = "https";
                    a3 += 6;
                    str4 = str;
                } else {
                    str4 = str;
                    if (str4.regionMatches(true, a3, Const.HTTP_START, 0, 5)) {
                        this.f4205a = "http";
                        a3 += 5;
                    } else {
                        throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but was '" + str4.substring(0, i2) + Separators.QUOTE);
                    }
                }
            } else if (vVar != null) {
                this.f4205a = vVar.l;
            } else {
                throw new IllegalArgumentException("Expected URL scheme 'http' or 'https' but no colon was found");
            }
            int c2 = c(str4, a3, b);
            if (c2 >= 2 || vVar == null || !vVar.l.equals(this.f4205a)) {
                int i6 = a3 + c2;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    a2 = com.anythink.core.common.n.b.a.c.a(str4, i6, b, "@/\\?#");
                    char charAt3 = a2 != b ? str4.charAt(a2) : (char) 65535;
                    if (charAt3 == 65535 || charAt3 == '#' || charAt3 == '/' || charAt3 == '\\' || charAt3 == '?') {
                        break;
                    }
                    if (charAt3 == '@') {
                        if (z) {
                            i3 = a2;
                            str3 = str;
                            this.c += "%40" + v.a(str3, i6, i3, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                        } else {
                            int a4 = com.anythink.core.common.n.b.a.c.a(str4, i6, a2, c);
                            String a5 = v.a(str, i6, a4, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            if (z2) {
                                a5 = this.b + "%40" + a5;
                            }
                            this.b = a5;
                            if (a4 != a2) {
                                int i7 = a4 + 1;
                                i3 = a2;
                                this.c = v.a(str, i7, i3, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                z = true;
                            } else {
                                i3 = a2;
                            }
                            str3 = str;
                            z2 = true;
                        }
                        i6 = i3 + 1;
                        str4 = str3;
                        c = AbstractJsonLexerKt.COLON;
                    }
                }
                str2 = str4;
                int i8 = i6;
                int d = d(str2, i8, a2);
                int i9 = d + 1;
                if (i9 < a2) {
                    this.d = e(str2, i8, d);
                    int f = f(str2, i9, a2);
                    this.e = f;
                    if (f == -1) {
                        throw new IllegalArgumentException("Invalid URL port: \"" + str2.substring(i9, a2) + '\"');
                    }
                } else {
                    this.d = e(str2, i8, d);
                    this.e = v.a(this.f4205a);
                }
                if (this.d == null) {
                    throw new IllegalArgumentException("Invalid URL host: \"" + str2.substring(i8, d) + '\"');
                }
                a3 = a2;
            } else {
                this.b = vVar.d();
                this.c = vVar.e();
                this.d = vVar.m;
                this.e = vVar.n;
                this.f.clear();
                this.f.addAll(vVar.i());
                if (a3 == b || str4.charAt(a3) == '#') {
                    b(vVar.j());
                }
                str2 = str4;
            }
            int a6 = com.anythink.core.common.n.b.a.c.a(str2, a3, b, "?#");
            a(str2, a3, a6);
            if (a6 < b && str2.charAt(a6) == '?') {
                int a7 = com.anythink.core.common.n.b.a.c.a(str2, a6, b, '#');
                this.g = v.b(v.a(str2, a6 + 1, a7, " \"'<>#", true, false, true, true, null));
                a6 = a7;
            }
            if (a6 < b && str2.charAt(a6) == '#') {
                this.h = v.a(str2, a6 + 1, b, "", true, false, false, false, null);
            }
            return this;
        }

        private void a(String str, int i2, int i3) {
            if (i2 == i3) {
                return;
            }
            char charAt = str.charAt(i2);
            if (charAt == '/' || charAt == '\\') {
                this.f.clear();
                this.f.add("");
                i2++;
            } else {
                List<String> list = this.f;
                list.set(list.size() - 1, "");
            }
            int i4 = i2;
            while (i4 < i3) {
                int a2 = com.anythink.core.common.n.b.a.c.a(str, i4, i3, "/\\");
                boolean z = a2 < i3;
                String str2 = str;
                a(str2, i4, a2, z, true);
                if (z) {
                    a2++;
                }
                i4 = a2;
                str = str2;
            }
        }

        private void a(String str, int i2, int i3, boolean z, boolean z2) {
            String a2 = v.a(str, i2, i3, " \"<>^`{}|/\\?#", z2, false, false, true, null);
            if (s(a2)) {
                return;
            }
            if (t(a2)) {
                d();
                return;
            }
            if (this.f.get(r11.size() - 1).isEmpty()) {
                this.f.set(r11.size() - 1, a2);
            } else {
                this.f.add(a2);
            }
            if (z) {
                this.f.add("");
            }
        }

        private static boolean s(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        private static boolean t(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        private void d() {
            if (this.f.remove(r0.size() - 1).isEmpty() && !this.f.isEmpty()) {
                this.f.set(r0.size() - 1, "");
            } else {
                this.f.add("");
            }
        }

        private static int b(String str, int i2, int i3) {
            if (i3 - i2 < 2) {
                return -1;
            }
            char charAt = str.charAt(i2);
            if ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')) {
                while (true) {
                    i2++;
                    if (i2 >= i3) {
                        break;
                    }
                    char charAt2 = str.charAt(i2);
                    if (charAt2 < 'a' || charAt2 > 'z') {
                        if (charAt2 < 'A' || charAt2 > 'Z') {
                            if (charAt2 < '0' || charAt2 > '9') {
                                if (charAt2 != '+' && charAt2 != '-' && charAt2 != '.') {
                                    if (charAt2 == ':') {
                                        return i2;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return -1;
        }

        private static int c(String str, int i2, int i3) {
            int i4 = 0;
            while (i2 < i3) {
                char charAt = str.charAt(i2);
                if (charAt != '\\' && charAt != '/') {
                    break;
                }
                i4++;
                i2++;
            }
            return i4;
        }

        private static int d(String str, int i2, int i3) {
            while (i2 < i3) {
                char charAt = str.charAt(i2);
                if (charAt == ':') {
                    return i2;
                }
                if (charAt == '[') {
                    do {
                        i2++;
                        if (i2 < i3) {
                        }
                    } while (str.charAt(i2) != ']');
                }
                i2++;
            }
            return i3;
        }

        private static String e(String str, int i2, int i3) {
            return com.anythink.core.common.n.b.a.c.a(v.a(str, i2, i3, false));
        }

        private static int f(String str, int i2, int i3) {
            int parseInt;
            try {
                parseInt = Integer.parseInt(v.a(str, i2, i3, "", false, false, false, true, null));
            } catch (NumberFormatException unused) {
            }
            if (parseInt <= 0 || parseInt > 65535) {
                return -1;
            }
            return parseInt;
        }

        private a c(String str, String str2) {
            String str3;
            if (str == null) {
                throw new NullPointerException("name == null");
            }
            if (this.g != null) {
                str3 = str;
                p(v.a(str, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true));
            } else {
                str3 = str;
            }
            if (str3 == null) {
                throw new NullPointerException("name == null");
            }
            if (this.g == null) {
                this.g = new ArrayList();
            }
            this.g.add(v.a(str3, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true));
            this.g.add(str2 != null ? v.a(str2, " !\"#$&'(),/:;<=>?@[]\\^`{|}~", false, false, true, true) : null);
            return this;
        }

        private a d(String str, String str2) {
            String str3;
            if (str == null) {
                throw new NullPointerException("encodedName == null");
            }
            if (this.g != null) {
                str3 = str;
                p(v.a(str, " \"'<>#&=", true, false, true, true));
            } else {
                str3 = str;
            }
            if (str3 == null) {
                throw new NullPointerException("encodedName == null");
            }
            if (this.g == null) {
                this.g = new ArrayList();
            }
            this.g.add(v.a(str3, " \"'<>#&=", true, false, true, true));
            this.g.add(str2 != null ? v.a(str2, " \"'<>#&=", true, false, true, true) : null);
            return this;
        }
    }

    static String a(String str, boolean z) {
        return a(str, 0, str.length(), z);
    }

    private static List<String> a(List<String> list, boolean z) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            String str = list.get(i2);
            arrayList.add(str != null ? a(str, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    static String a(String str, int i2, int i3, boolean z) {
        for (int i4 = i2; i4 < i3; i4++) {
            char charAt = str.charAt(i4);
            if (charAt == '%' || (charAt == '+' && z)) {
                com.anythink.core.common.n.c.c cVar = new com.anythink.core.common.n.c.c();
                cVar.b(str, i2, i4);
                a(cVar, str, i4, i3, z);
                return cVar.u();
            }
        }
        return str.substring(i2, i3);
    }

    private static void a(com.anythink.core.common.n.c.c cVar, String str, int i2, int i3, boolean z) {
        int i4;
        while (i2 < i3) {
            int codePointAt = str.codePointAt(i2);
            if (codePointAt == 37 && (i4 = i2 + 2) < i3) {
                int a2 = com.anythink.core.common.n.b.a.c.a(str.charAt(i2 + 1));
                int a3 = com.anythink.core.common.n.b.a.c.a(str.charAt(i4));
                if (a2 != -1 && a3 != -1) {
                    cVar.l((a2 << 4) + a3);
                    i2 = i4;
                }
                cVar.m(codePointAt);
            } else {
                if (codePointAt == 43 && z) {
                    cVar.l(32);
                }
                cVar.m(codePointAt);
            }
            i2 += Character.charCount(codePointAt);
        }
    }

    private static boolean a(String str, int i2, int i3) {
        int i4 = i2 + 2;
        return i4 < i3 && str.charAt(i2) == '%' && com.anythink.core.common.n.b.a.c.a(str.charAt(i2 + 1)) != -1 && com.anythink.core.common.n.b.a.c.a(str.charAt(i4)) != -1;
    }

    static String a(String str, int i2, int i3, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        int i4 = i2;
        while (i4 < i3) {
            int codePointAt = str.codePointAt(i4);
            if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || !z4) && str2.indexOf(codePointAt) == -1 && ((codePointAt != 37 || (z && (!z2 || a(str, i4, i3)))) && (codePointAt != 43 || !z3)))) {
                i4 += Character.charCount(codePointAt);
            } else {
                com.anythink.core.common.n.c.c cVar = new com.anythink.core.common.n.c.c();
                cVar.b(str, i2, i4);
                com.anythink.core.common.n.c.c cVar2 = null;
                while (i4 < i3) {
                    int codePointAt2 = str.codePointAt(i4);
                    if (!z || (codePointAt2 != 9 && codePointAt2 != 10 && codePointAt2 != 12 && codePointAt2 != 13)) {
                        if (codePointAt2 == 43 && z3) {
                            cVar.b(z ? "+" : "%2B");
                        } else if (codePointAt2 < 32 || codePointAt2 == 127 || ((codePointAt2 >= 128 && z4) || str2.indexOf(codePointAt2) != -1 || (codePointAt2 == 37 && (!z || (z2 && !a(str, i4, i3)))))) {
                            if (cVar2 == null) {
                                cVar2 = new com.anythink.core.common.n.c.c();
                            }
                            if (charset == null || charset.equals(StandardCharsets.UTF_8)) {
                                cVar2.m(codePointAt2);
                            } else {
                                cVar2.b(str, i4, Character.charCount(codePointAt2) + i4, charset);
                            }
                            while (!cVar2.g()) {
                                byte k2 = cVar2.k();
                                cVar.l(37);
                                char[] cArr = o;
                                cVar.l((int) cArr[((k2 & 255) >> 4) & 15]);
                                cVar.l((int) cArr[k2 & 15]);
                            }
                        } else {
                            cVar.m(codePointAt2);
                        }
                    }
                    i4 += Character.charCount(codePointAt2);
                }
                return cVar.u();
            }
        }
        return str.substring(i2, i3);
    }

    private static void a(com.anythink.core.common.n.c.c cVar, String str, int i2, int i3, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        com.anythink.core.common.n.c.c cVar2 = null;
        while (i2 < i3) {
            int codePointAt = str.codePointAt(i2);
            if (!z || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                if (codePointAt == 43 && z3) {
                    cVar.b(z ? "+" : "%2B");
                } else if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z4) || str2.indexOf(codePointAt) != -1 || (codePointAt == 37 && (!z || (z2 && !a(str, i2, i3)))))) {
                    if (cVar2 == null) {
                        cVar2 = new com.anythink.core.common.n.c.c();
                    }
                    if (charset == null || charset.equals(StandardCharsets.UTF_8)) {
                        cVar2.m(codePointAt);
                    } else {
                        cVar2.b(str, i2, Character.charCount(codePointAt) + i2, charset);
                    }
                    while (!cVar2.g()) {
                        byte k2 = cVar2.k();
                        cVar.l(37);
                        char[] cArr = o;
                        cVar.l((int) cArr[((k2 & 255) >> 4) & 15]);
                        cVar.l((int) cArr[k2 & 15]);
                    }
                } else {
                    cVar.m(codePointAt);
                }
            }
            i2 += Character.charCount(codePointAt);
        }
    }

    static String a(String str, String str2, boolean z, Charset charset) {
        return a(str, 0, str.length(), str2, z, false, true, true, charset);
    }

    static String a(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return a(str, 0, str.length(), str2, z, z2, z3, z4, null);
    }

    public final URI a() {
        a aVar = new a();
        aVar.f4205a = this.l;
        aVar.b = d();
        aVar.c = e();
        aVar.d = this.m;
        aVar.e = this.n != a(this.l) ? this.n : -1;
        aVar.f.clear();
        aVar.f.addAll(i());
        aVar.b(j());
        aVar.h = this.t == null ? null : this.u.substring(this.u.indexOf(35) + 1);
        int size = aVar.f.size();
        for (int i2 = 0; i2 < size; i2++) {
            aVar.f.set(i2, a(aVar.f.get(i2), "[]", true, true, false, true));
        }
        if (aVar.g != null) {
            int size2 = aVar.g.size();
            for (int i3 = 0; i3 < size2; i3++) {
                String str = aVar.g.get(i3);
                if (str != null) {
                    aVar.g.set(i3, a(str, "\\^`{|}", true, true, true, true));
                }
            }
        }
        if (aVar.h != null) {
            aVar.h = a(aVar.h, " \"#<>\\^`{|}", true, true, false, false);
        }
        String aVar2 = aVar.toString();
        try {
            return new URI(aVar2);
        } catch (URISyntaxException e2) {
            try {
                return URI.create(aVar2.replaceAll("[\\u0000-\\u001F\\u007F-\\u009F\\p{javaWhitespace}]", ""));
            } catch (Exception unused) {
                throw new RuntimeException(e2);
            }
        }
    }
}
