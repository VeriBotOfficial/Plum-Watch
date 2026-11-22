package com.bytedance.sdk.component.kg.fxn;

import com.alipay.sdk.m.p.a;
import com.autonavi.aps.amapapi.config.Const;
import java.net.MalformedURLException;
import java.net.URL;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes13.dex */
public final class sg {
    private static final char[] hm = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    private final String bh;
    final String fxn;
    final int gff;
    private final String hie;
    private final String jq;
    final String kg;
    private final String rb;

    /* renamed from: sg, reason: collision with root package name */
    private final List<String> f9377sg;
    private final List<String> tw;

    sg(fxn fxnVar) {
        this.fxn = fxnVar.fxn;
        this.rb = fxn(fxnVar.kg, false);
        this.bh = fxn(fxnVar.gff, false);
        this.kg = fxnVar.hm;
        this.gff = fxnVar.fxn();
        this.f9377sg = fxn(fxnVar.bh, false);
        this.tw = fxnVar.f9378sg != null ? fxn(fxnVar.f9378sg, true) : null;
        this.jq = fxnVar.tw != null ? fxn(fxnVar.tw, false) : null;
        this.hie = fxnVar.toString();
    }

    public URL fxn() {
        try {
            return new URL(this.hie);
        } catch (MalformedURLException e) {
            throw new RuntimeException(e);
        }
    }

    public String kg() {
        if (this.rb.isEmpty()) {
            return "";
        }
        int length = this.fxn.length() + 3;
        String str = this.hie;
        return this.hie.substring(length, com.bytedance.sdk.component.kg.fxn.kg.jq.fxn(str, length, str.length(), ":@"));
    }

    public String gff() {
        if (this.bh.isEmpty()) {
            return "";
        }
        return this.hie.substring(this.hie.indexOf(58, this.fxn.length() + 3) + 1, this.hie.indexOf(64));
    }

    public static int fxn(String str) {
        if (str.equals("http")) {
            return 80;
        }
        return str.equals("https") ? 443 : -1;
    }

    static void fxn(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            sb.append('/');
            sb.append(list.get(i));
        }
    }

    public List<String> hm() {
        int indexOf = this.hie.indexOf(47, this.fxn.length() + 3);
        String str = this.hie;
        int fxn2 = com.bytedance.sdk.component.kg.fxn.kg.jq.fxn(str, indexOf, str.length(), "?#");
        ArrayList arrayList = new ArrayList();
        while (indexOf < fxn2) {
            int i = indexOf + 1;
            int fxn3 = com.bytedance.sdk.component.kg.fxn.kg.jq.fxn(this.hie, i, fxn2, '/');
            arrayList.add(this.hie.substring(i, fxn3));
            indexOf = fxn3;
        }
        return arrayList;
    }

    public String rb() {
        if (this.tw == null) {
            return null;
        }
        int indexOf = this.hie.indexOf(63) + 1;
        String str = this.hie;
        return this.hie.substring(indexOf, com.bytedance.sdk.component.kg.fxn.kg.jq.fxn(str, indexOf, str.length(), '#'));
    }

    static void kg(StringBuilder sb, List<String> list) {
        int size = list.size();
        for (int i = 0; i < size; i += 2) {
            String str = list.get(i);
            String str2 = list.get(i + 1);
            if (i > 0) {
                sb.append(Typography.amp);
            }
            sb.append(str);
            if (str2 != null) {
                sb.append(a.h);
                sb.append(str2);
            }
        }
    }

    static List<String> kg(String str) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i <= str.length()) {
            int indexOf = str.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = str.length();
            }
            int indexOf2 = str.indexOf(61, i);
            if (indexOf2 == -1 || indexOf2 > indexOf) {
                arrayList.add(str.substring(i, indexOf));
                arrayList.add(null);
            } else {
                arrayList.add(str.substring(i, indexOf2));
                arrayList.add(str.substring(indexOf2 + 1, indexOf));
            }
            i = indexOf + 1;
        }
        return arrayList;
    }

    public static sg gff(String str) {
        fxn fxnVar = new fxn();
        if (fxnVar.fxn((sg) null, str) == fxn.EnumC0481fxn.SUCCESS) {
            return fxnVar.kg();
        }
        return null;
    }

    public boolean equals(Object obj) {
        return (obj instanceof sg) && ((sg) obj).hie.equals(this.hie);
    }

    public int hashCode() {
        return this.hie.hashCode();
    }

    public String toString() {
        return this.hie;
    }

    public static final class fxn {
        final List<String> bh;
        String fxn;
        String hm;

        /* renamed from: sg, reason: collision with root package name */
        List<String> f9378sg;
        String tw;
        String kg = "";
        String gff = "";
        int rb = -1;

        /* renamed from: com.bytedance.sdk.component.kg.fxn.sg$fxn$fxn, reason: collision with other inner class name */
        enum EnumC0481fxn {
            SUCCESS,
            MISSING_SCHEME,
            UNSUPPORTED_SCHEME,
            INVALID_PORT,
            INVALID_HOST
        }

        public fxn() {
            ArrayList arrayList = new ArrayList();
            this.bh = arrayList;
            arrayList.add("");
        }

        public fxn fxn(String str) {
            if (str == null) {
                throw new NullPointerException("scheme == null");
            }
            if (str.equalsIgnoreCase("http")) {
                this.fxn = "http";
                return this;
            }
            if (str.equalsIgnoreCase("https")) {
                this.fxn = "https";
                return this;
            }
            throw new IllegalArgumentException("unexpected scheme: ".concat(String.valueOf(str)));
        }

        public fxn kg(String str) {
            if (str == null) {
                throw new NullPointerException("host == null");
            }
            String rb = rb(str, 0, str.length());
            if (rb == null) {
                throw new IllegalArgumentException("unexpected host: ".concat(String.valueOf(str)));
            }
            this.hm = rb;
            return this;
        }

        int fxn() {
            int i = this.rb;
            return i != -1 ? i : sg.fxn(this.fxn);
        }

        public fxn gff(String str) {
            if (str == null) {
                throw new NullPointerException("encodedPathSegments == null");
            }
            return fxn(str, true);
        }

        private fxn fxn(String str, boolean z) {
            boolean z2;
            fxn fxnVar;
            String str2;
            boolean z3;
            int i = 0;
            while (true) {
                int fxn = com.bytedance.sdk.component.kg.fxn.kg.jq.fxn(str, i, str.length(), "/\\");
                if (fxn < str.length()) {
                    z2 = true;
                    str2 = str;
                    z3 = z;
                    fxnVar = this;
                } else {
                    z2 = false;
                    fxnVar = this;
                    str2 = str;
                    z3 = z;
                }
                fxnVar.fxn(str2, i, fxn, z2, z3);
                i = fxn + 1;
                if (i > str2.length()) {
                    return fxnVar;
                }
                str = str2;
                z = z3;
            }
        }

        public fxn hm(String str) {
            this.f9378sg = str != null ? sg.kg(sg.fxn(str, " \"'<>#", true, false, true, true)) : null;
            return this;
        }

        public fxn fxn(String str, String str2) {
            if (str == null) {
                throw new NullPointerException("encodedName == null");
            }
            if (this.f9378sg == null) {
                this.f9378sg = new ArrayList();
            }
            this.f9378sg.add(sg.fxn(str, " \"'<>#&=", true, false, true, true));
            this.f9378sg.add(str2 != null ? sg.fxn(str2, " \"'<>#&=", true, false, true, true) : null);
            return this;
        }

        public sg kg() {
            if (this.fxn == null) {
                throw new IllegalStateException("scheme == null");
            }
            if (this.hm == null) {
                throw new IllegalStateException("host == null");
            }
            return new sg(this);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.fxn);
            sb.append("://");
            if (!this.kg.isEmpty() || !this.gff.isEmpty()) {
                sb.append(this.kg);
                if (!this.gff.isEmpty()) {
                    sb.append(AbstractJsonLexerKt.COLON);
                    sb.append(this.gff);
                }
                sb.append('@');
            }
            if (this.hm.indexOf(58) != -1) {
                sb.append(AbstractJsonLexerKt.BEGIN_LIST);
                sb.append(this.hm);
                sb.append(AbstractJsonLexerKt.END_LIST);
            } else {
                sb.append(this.hm);
            }
            int fxn = fxn();
            if (fxn != sg.fxn(this.fxn)) {
                sb.append(AbstractJsonLexerKt.COLON);
                sb.append(fxn);
            }
            sg.fxn(sb, this.bh);
            if (this.f9378sg != null) {
                sb.append('?');
                sg.kg(sb, this.f9378sg);
            }
            if (this.tw != null) {
                sb.append('#');
                sb.append(this.tw);
            }
            return sb.toString();
        }

        EnumC0481fxn fxn(sg sgVar, String str) {
            int fxn;
            String str2;
            int i;
            String str3;
            String str4 = str;
            int fxn2 = com.bytedance.sdk.component.kg.fxn.kg.jq.fxn(str4, 0, str4.length());
            int kg = com.bytedance.sdk.component.kg.fxn.kg.jq.kg(str4, fxn2, str4.length());
            if (kg(str4, fxn2, kg) != -1) {
                if (str4.regionMatches(true, fxn2, Const.HTTPS_START, 0, 6)) {
                    this.fxn = "https";
                    fxn2 += 6;
                    str4 = str;
                } else {
                    str4 = str;
                    if (str4.regionMatches(true, fxn2, Const.HTTP_START, 0, 5)) {
                        this.fxn = "http";
                        fxn2 += 5;
                    } else {
                        return EnumC0481fxn.UNSUPPORTED_SCHEME;
                    }
                }
            } else if (sgVar != null) {
                this.fxn = sgVar.fxn;
            } else {
                return EnumC0481fxn.MISSING_SCHEME;
            }
            int gff = gff(str4, fxn2, kg);
            char c = '#';
            if (gff >= 2 || sgVar == null || !sgVar.fxn.equals(this.fxn)) {
                int i2 = fxn2 + gff;
                boolean z = false;
                boolean z2 = false;
                while (true) {
                    fxn = com.bytedance.sdk.component.kg.fxn.kg.jq.fxn(str4, i2, kg, "@/\\?#");
                    char charAt = fxn != kg ? str4.charAt(fxn) : (char) 65535;
                    if (charAt == 65535 || charAt == c || charAt == '/' || charAt == '\\' || charAt == '?') {
                        break;
                    }
                    if (charAt == '@') {
                        if (z) {
                            i = fxn;
                            str3 = str;
                            this.gff += "%40" + sg.fxn(str3, i2, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                        } else {
                            int fxn3 = com.bytedance.sdk.component.kg.fxn.kg.jq.fxn(str4, i2, fxn, AbstractJsonLexerKt.COLON);
                            String fxn4 = sg.fxn(str, i2, fxn3, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                            if (z2) {
                                fxn4 = this.kg + "%40" + fxn4;
                            }
                            this.kg = fxn4;
                            if (fxn3 != fxn) {
                                i = fxn;
                                this.gff = sg.fxn(str, fxn3 + 1, i, " \"':;<=>@[]^`{}|/\\?#", true, false, false, true, null);
                                z = true;
                            } else {
                                i = fxn;
                            }
                            str3 = str;
                            z2 = true;
                        }
                        i2 = i + 1;
                        str4 = str3;
                        c = '#';
                    }
                }
                str2 = str4;
                int i3 = i2;
                int hm = hm(str2, i3, fxn);
                int i4 = hm + 1;
                if (i4 < fxn) {
                    this.hm = rb(str2, i3, hm);
                    int bh = bh(str2, i4, fxn);
                    this.rb = bh;
                    if (bh == -1) {
                        return EnumC0481fxn.INVALID_PORT;
                    }
                } else {
                    this.hm = rb(str2, i3, hm);
                    this.rb = sg.fxn(this.fxn);
                }
                if (this.hm == null) {
                    return EnumC0481fxn.INVALID_HOST;
                }
                fxn2 = fxn;
            } else {
                this.kg = sgVar.kg();
                this.gff = sgVar.gff();
                this.hm = sgVar.kg;
                this.rb = sgVar.gff;
                this.bh.clear();
                this.bh.addAll(sgVar.hm());
                if (fxn2 == kg || str4.charAt(fxn2) == '#') {
                    hm(sgVar.rb());
                }
                str2 = str4;
            }
            int fxn5 = com.bytedance.sdk.component.kg.fxn.kg.jq.fxn(str2, fxn2, kg, "?#");
            fxn(str2, fxn2, fxn5);
            if (fxn5 < kg && str2.charAt(fxn5) == '?') {
                int fxn6 = com.bytedance.sdk.component.kg.fxn.kg.jq.fxn(str2, fxn5, kg, '#');
                this.f9378sg = sg.kg(sg.fxn(str2, fxn5 + 1, fxn6, " \"'<>#", true, false, true, true, null));
                fxn5 = fxn6;
            }
            if (fxn5 < kg && str2.charAt(fxn5) == '#') {
                this.tw = sg.fxn(str2, fxn5 + 1, kg, "", true, false, false, false, null);
            }
            return EnumC0481fxn.SUCCESS;
        }

        private void fxn(String str, int i, int i2) {
            if (i == i2) {
                return;
            }
            char charAt = str.charAt(i);
            if (charAt == '/' || charAt == '\\') {
                this.bh.clear();
                this.bh.add("");
                i++;
            } else {
                List<String> list = this.bh;
                list.set(list.size() - 1, "");
            }
            int i3 = i;
            while (i3 < i2) {
                int fxn = com.bytedance.sdk.component.kg.fxn.kg.jq.fxn(str, i3, i2, "/\\");
                boolean z = fxn < i2;
                String str2 = str;
                fxn(str2, i3, fxn, z, true);
                if (z) {
                    fxn++;
                }
                i3 = fxn;
                str = str2;
            }
        }

        private void fxn(String str, int i, int i2, boolean z, boolean z2) {
            String fxn = sg.fxn(str, i, i2, " \"<>^`{}|/\\?#", z2, false, false, true, null);
            if (rb(fxn)) {
                return;
            }
            if (bh(fxn)) {
                gff();
                return;
            }
            if (this.bh.get(r11.size() - 1).isEmpty()) {
                this.bh.set(r11.size() - 1, fxn);
            } else {
                this.bh.add(fxn);
            }
            if (z) {
                this.bh.add("");
            }
        }

        private boolean rb(String str) {
            return str.equals(".") || str.equalsIgnoreCase("%2e");
        }

        private boolean bh(String str) {
            return str.equals("..") || str.equalsIgnoreCase("%2e.") || str.equalsIgnoreCase(".%2e") || str.equalsIgnoreCase("%2e%2e");
        }

        private void gff() {
            if (this.bh.remove(r0.size() - 1).isEmpty() && !this.bh.isEmpty()) {
                this.bh.set(r0.size() - 1, "");
            } else {
                this.bh.add("");
            }
        }

        private static int kg(String str, int i, int i2) {
            if (i2 - i < 2) {
                return -1;
            }
            char charAt = str.charAt(i);
            if ((charAt >= 'a' && charAt <= 'z') || (charAt >= 'A' && charAt <= 'Z')) {
                while (true) {
                    i++;
                    if (i >= i2) {
                        break;
                    }
                    char charAt2 = str.charAt(i);
                    if (charAt2 < 'a' || charAt2 > 'z') {
                        if (charAt2 < 'A' || charAt2 > 'Z') {
                            if (charAt2 < '0' || charAt2 > '9') {
                                if (charAt2 != '+' && charAt2 != '-' && charAt2 != '.') {
                                    if (charAt2 == ':') {
                                        return i;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return -1;
        }

        private static int gff(String str, int i, int i2) {
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

        private static int hm(String str, int i, int i2) {
            while (i < i2) {
                char charAt = str.charAt(i);
                if (charAt == ':') {
                    return i;
                }
                if (charAt == '[') {
                    do {
                        i++;
                        if (i < i2) {
                        }
                    } while (str.charAt(i) != ']');
                }
                i++;
            }
            return i2;
        }

        private static String rb(String str, int i, int i2) {
            return com.bytedance.sdk.component.kg.fxn.kg.jq.fxn(sg.fxn(str, i, i2, false));
        }

        private static int bh(String str, int i, int i2) {
            int parseInt;
            try {
                parseInt = Integer.parseInt(sg.fxn(str, i, i2, "", false, false, false, true, null));
            } catch (NumberFormatException unused) {
            }
            if (parseInt <= 0 || parseInt > 65535) {
                return -1;
            }
            return parseInt;
        }
    }

    static String fxn(String str, boolean z) {
        return fxn(str, 0, str.length(), z);
    }

    private List<String> fxn(List<String> list, boolean z) {
        int size = list.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            String str = list.get(i);
            arrayList.add(str != null ? fxn(str, z) : null);
        }
        return Collections.unmodifiableList(arrayList);
    }

    static String fxn(String str, int i, int i2, boolean z) {
        for (int i3 = i; i3 < i2; i3++) {
            char charAt = str.charAt(i3);
            if (charAt == '%' || (charAt == '+' && z)) {
                com.bytedance.sdk.component.kg.fxn.kg.fxn fxnVar = new com.bytedance.sdk.component.kg.fxn.kg.fxn();
                fxnVar.fxn(str, i, i3);
                fxn(fxnVar, str, i3, i2, z);
                return fxnVar.gff();
            }
        }
        return str.substring(i, i2);
    }

    static void fxn(com.bytedance.sdk.component.kg.fxn.kg.fxn fxnVar, String str, int i, int i2, boolean z) {
        int i3;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt == 37 && (i3 = i + 2) < i2) {
                int fxn2 = com.bytedance.sdk.component.kg.fxn.kg.jq.fxn(str.charAt(i + 1));
                int fxn3 = com.bytedance.sdk.component.kg.fxn.kg.jq.fxn(str.charAt(i3));
                if (fxn2 != -1 && fxn3 != -1) {
                    fxnVar.kg((fxn2 << 4) + fxn3);
                    i = i3;
                }
                fxnVar.fxn(codePointAt);
            } else {
                if (codePointAt == 43 && z) {
                    fxnVar.kg(32);
                }
                fxnVar.fxn(codePointAt);
            }
            i += Character.charCount(codePointAt);
        }
    }

    static boolean fxn(String str, int i, int i2) {
        int i3 = i + 2;
        return i3 < i2 && str.charAt(i) == '%' && com.bytedance.sdk.component.kg.fxn.kg.jq.fxn(str.charAt(i + 1)) != -1 && com.bytedance.sdk.component.kg.fxn.kg.jq.fxn(str.charAt(i3)) != -1;
    }

    static String fxn(String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        int i3 = i;
        while (i3 < i2) {
            int codePointAt = str.codePointAt(i3);
            if (codePointAt >= 32 && codePointAt != 127 && ((codePointAt < 128 || !z4) && str2.indexOf(codePointAt) == -1 && ((codePointAt != 37 || (z && (!z2 || fxn(str, i3, i2)))) && (codePointAt != 43 || !z3)))) {
                i3 += Character.charCount(codePointAt);
            } else {
                com.bytedance.sdk.component.kg.fxn.kg.fxn fxnVar = new com.bytedance.sdk.component.kg.fxn.kg.fxn();
                fxnVar.fxn(str, i, i3);
                fxn(fxnVar, str, i3, i2, str2, z, z2, z3, z4, charset);
                return fxnVar.gff();
            }
        }
        return str.substring(i, i2);
    }

    static void fxn(com.bytedance.sdk.component.kg.fxn.kg.fxn fxnVar, String str, int i, int i2, String str2, boolean z, boolean z2, boolean z3, boolean z4, Charset charset) {
        com.bytedance.sdk.component.kg.fxn.kg.fxn fxnVar2 = null;
        while (i < i2) {
            int codePointAt = str.codePointAt(i);
            if (!z || (codePointAt != 9 && codePointAt != 10 && codePointAt != 12 && codePointAt != 13)) {
                if (codePointAt == 43 && z3) {
                    fxnVar.fxn(z ? "+" : "%2B");
                } else if (codePointAt < 32 || codePointAt == 127 || ((codePointAt >= 128 && z4) || str2.indexOf(codePointAt) != -1 || (codePointAt == 37 && (!z || (z2 && !fxn(str, i, i2)))))) {
                    if (fxnVar2 == null) {
                        fxnVar2 = new com.bytedance.sdk.component.kg.fxn.kg.fxn();
                    }
                    if (charset == null || charset.equals(com.bytedance.sdk.component.kg.fxn.kg.jq.fxn)) {
                        fxnVar2.fxn(codePointAt);
                    } else {
                        fxnVar2.fxn(str, i, Character.charCount(codePointAt) + i, charset);
                    }
                    while (!fxnVar2.fxn()) {
                        byte kg = fxnVar2.kg();
                        fxnVar.kg(37);
                        char[] cArr = hm;
                        fxnVar.kg((int) cArr[((kg & 255) >> 4) & 15]);
                        fxnVar.kg((int) cArr[kg & 15]);
                    }
                } else {
                    fxnVar.fxn(codePointAt);
                }
            }
            i += Character.charCount(codePointAt);
        }
    }

    static String fxn(String str, String str2, boolean z, boolean z2, boolean z3, boolean z4) {
        return fxn(str, 0, str.length(), str2, z, z2, z3, z4, null);
    }
}
