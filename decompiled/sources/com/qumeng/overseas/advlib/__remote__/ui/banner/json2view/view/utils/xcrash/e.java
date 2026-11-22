package com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.utils.xcrash;

import android.os.Build;
import android.text.TextUtils;
import com.umeng.umcrash.custom_exception.UMCustomLogInfoBuilder;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.StringReader;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes17.dex */
public class e {
    public static final String A = "stack";
    public static final String B = "memory near";
    public static final String F = "network info";
    public static final String G = "memory info";
    public static final String H = "other threads";
    public static final String L = "foreground";
    public static final String m = "Model";
    public static final String p = "pid";

    /* renamed from: q, reason: collision with root package name */
    public static final String f13081q = "tid";
    public static final String r = "pname";
    public static final String s = "tname";
    public static final String t = "signal";
    public static final String u = "code";
    public static final String v = "fault addr";
    public static final String x = "registers";
    private static final Pattern N = Pattern.compile("^(.*):\\s'(.*?)'$");
    private static final Pattern O = Pattern.compile("^pid:\\s(.*),\\stid:\\s(.*),\\sname:\\s(.*)\\s+>>>\\s(.*)\\s<<<$");
    private static final Pattern P = Pattern.compile("^pid:\\s(.*)\\s+>>>\\s(.*)\\s<<<$");
    private static final Pattern Q = Pattern.compile("^signal\\s(.*),\\scode\\s(.*),\\sfault\\saddr\\s(.*)$");
    private static final Pattern R = Pattern.compile("^(\\d{20})_(.*)__(.*)$");

    /* renamed from: a, reason: collision with root package name */
    public static final String f13080a = "Crash type";
    public static final String b = "Start time";
    public static final String c = "Crash time";
    public static final String d = "App ID";
    public static final String e = "App version";
    public static final String f = "Rooted";
    public static final String g = "API level";
    public static final String h = "OS version";
    public static final String i = "Kernel version";
    public static final String j = "ABI list";
    public static final String k = "Manufacturer";
    public static final String l = "Brand";
    public static final String n = "Build fingerprint";
    public static final String o = "ABI";
    public static final String w = "Abort message";
    private static final Set<String> S = new HashSet(Arrays.asList(f13080a, b, c, d, e, f, g, h, i, j, k, l, "Model", n, o, w));
    public static final String y = "backtrace";
    public static final String z = "build id";
    public static final String C = "memory map";
    public static final String D = "logcat";
    public static final String E = "open files";
    public static final String I = "java stacktrace";
    public static final String J = "exception desc";
    public static final String K = "xcrash error";
    public static final String M = "xcrash error debug";
    private static final Set<String> T = new HashSet(Arrays.asList(y, z, "stack", C, D, E, I, J, K, M));
    private static final Set<String> U = new HashSet(Arrays.asList("foreground"));

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f13082a;

        static {
            int[] iArr = new int[b.values().length];
            f13082a = iArr;
            try {
                iArr[b.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13082a[b.HEAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f13082a[b.SECTION.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    private enum b {
        UNKNOWN,
        HEAD,
        SECTION
    }

    private e() {
    }

    public static Map<String, String> a(File file) throws IOException {
        return a(file.getAbsolutePath(), (String) null);
    }

    public static Map<String, String> a(String str) throws IOException {
        return a(str, (String) null);
    }

    public static Map<String, String> a(String str, String str2) throws IOException {
        HashMap hashMap = new HashMap();
        if (str != null) {
            BufferedReader bufferedReader = new BufferedReader(new FileReader(str));
            a((Map<String, String>) hashMap, bufferedReader, true);
            bufferedReader.close();
        }
        if (str2 != null) {
            BufferedReader bufferedReader2 = new BufferedReader(new StringReader(str2));
            a((Map<String, String>) hashMap, bufferedReader2, false);
            bufferedReader2.close();
        }
        a(hashMap, str);
        if (TextUtils.isEmpty((String) hashMap.get(e))) {
            String b2 = g.b();
            if (TextUtils.isEmpty(b2)) {
                b2 = "unknown";
            }
            hashMap.put(e, b2);
        }
        a(hashMap);
        return hashMap;
    }

    private static void a(Map<String, String> map, String str) {
        if (str == null) {
            return;
        }
        if (TextUtils.isEmpty(map.get(c))) {
            map.put(c, new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US).format(new Date(new File(str).lastModified())));
        }
        String str2 = map.get(b);
        String str3 = map.get(e);
        String str4 = map.get(r);
        String str5 = map.get(f13080a);
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4) || TextUtils.isEmpty(str5)) {
            String substring = str.substring(str.lastIndexOf(47) + 1);
            if (!substring.isEmpty() && substring.startsWith("tombstone_")) {
                String substring2 = substring.substring(10);
                if (substring2.endsWith(".java.xcrash")) {
                    if (TextUtils.isEmpty(str5)) {
                        map.put(f13080a, "java");
                    }
                    String substring3 = substring2.substring(0, substring2.length() - 12);
                    if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || TextUtils.isEmpty(str4)) {
                        Matcher matcher = R.matcher(substring3);
                        if (matcher.find() && matcher.groupCount() == 3) {
                            if (TextUtils.isEmpty(str2)) {
                                map.put(b, new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US).format(new Date(Long.parseLong(matcher.group(1), 10) / 1000)));
                            }
                            if (TextUtils.isEmpty(str3)) {
                                map.put(e, matcher.group(2));
                            }
                            if (TextUtils.isEmpty(str4)) {
                                map.put(r, matcher.group(3));
                            }
                        }
                    }
                }
            }
        }
    }

    private static void a(Map<String, String> map) {
        if (TextUtils.isEmpty(map.get(d))) {
            map.put(d, g.a());
        }
        if (TextUtils.isEmpty(map.get(g))) {
            map.put(g, String.valueOf(Build.VERSION.SDK_INT));
        }
        if (TextUtils.isEmpty(map.get(h))) {
            map.put(h, Build.VERSION.RELEASE);
        }
        if (TextUtils.isEmpty(map.get(n))) {
            map.put("Model", Build.FINGERPRINT);
        }
        if (TextUtils.isEmpty(map.get(k))) {
            map.put(k, Build.MANUFACTURER);
        }
        if (TextUtils.isEmpty(map.get(l))) {
            map.put(l, Build.BRAND);
        }
    }

    private static String a(BufferedReader bufferedReader) throws IOException {
        try {
            bufferedReader.mark(2);
            for (int i2 = 0; i2 < 2; i2++) {
                try {
                    int read = bufferedReader.read();
                    if (read == -1) {
                        bufferedReader.reset();
                        return null;
                    }
                    if (read > 0) {
                        bufferedReader.reset();
                        return bufferedReader.readLine();
                    }
                } catch (Exception unused) {
                    bufferedReader.reset();
                    return bufferedReader.readLine();
                }
            }
            bufferedReader.reset();
            return null;
        } catch (Exception unused2) {
            return bufferedReader.readLine();
        }
    }

    private static void a(Map<String, String> map, BufferedReader bufferedReader, boolean z2) throws IOException {
        String str;
        int i2;
        int i3;
        StringBuilder sb = new StringBuilder();
        b bVar = b.UNKNOWN;
        String a2 = z2 ? a(bufferedReader) : bufferedReader.readLine();
        int i4 = 1;
        String str2 = null;
        if (a2 == null) {
            i2 = 1;
            str = "";
        } else {
            str = "";
            i2 = 0;
        }
        boolean z3 = false;
        boolean z4 = false;
        while (i2 == 0) {
            String a3 = z2 ? a(bufferedReader) : bufferedReader.readLine();
            int i5 = a3 == null ? i4 : 0;
            int i6 = a.f13082a[bVar.ordinal()];
            if (i6 != i4) {
                int i7 = i4;
                if (i6 != 2) {
                    if (i6 == 3) {
                        if (!a2.equals(str) && i5 == 0) {
                            if (z3) {
                                if (str2.equals(I) && a2.startsWith(" ")) {
                                    a2 = a2.trim();
                                } else if (a2.startsWith("    ")) {
                                    a2 = a2.substring(4);
                                }
                            }
                            sb.append(a2).append('\n');
                        } else {
                            if (U.contains(str2) && sb.length() > 0 && sb.charAt(sb.length() - 1) == '\n') {
                                sb.deleteCharAt(sb.length() - 1);
                            }
                            a(map, str2, sb.toString(), z4);
                            sb.setLength(0);
                            bVar = b.UNKNOWN;
                        }
                    }
                    i3 = i7;
                    i4 = i3;
                    a2 = a3;
                    i2 = i5;
                } else {
                    if (a2.startsWith("pid: ")) {
                        Matcher matcher = O.matcher(a2);
                        if (matcher.find() && matcher.groupCount() == 4) {
                            a(map, "pid", matcher.group(i7));
                            a(map, "tid", matcher.group(2));
                            a(map, s, matcher.group(3));
                            a(map, r, matcher.group(4));
                        } else {
                            Matcher matcher2 = P.matcher(a2);
                            if (matcher2.find() && matcher2.groupCount() == 2) {
                                a(map, "pid", matcher2.group(1));
                                a(map, r, matcher2.group(2));
                            }
                        }
                    } else if (a2.startsWith("signal ")) {
                        Matcher matcher3 = Q.matcher(a2);
                        if (matcher3.find() && matcher3.groupCount() == 3) {
                            a(map, t, matcher3.group(1));
                            a(map, "code", matcher3.group(2));
                            a(map, v, matcher3.group(3));
                        }
                    } else {
                        Matcher matcher4 = N.matcher(a2);
                        if (matcher4.find() && matcher4.groupCount() == 2 && S.contains(matcher4.group(1))) {
                            a(map, matcher4.group(1), matcher4.group(2));
                        }
                    }
                    if (a3 != null && (a3.startsWith("    r0 ") || a3.startsWith("    x0 ") || a3.startsWith("    eax ") || a3.startsWith("    rax "))) {
                        bVar = b.SECTION;
                        str2 = x;
                        str = "";
                        z3 = true;
                        z4 = false;
                    }
                    if (a3 == null || a3.isEmpty()) {
                        bVar = b.UNKNOWN;
                    }
                    i3 = 1;
                    i4 = i3;
                    a2 = a3;
                    i2 = i5;
                }
            } else if (a2.equals("*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***")) {
                bVar = b.HEAD;
                i3 = 1;
                i4 = i3;
                a2 = a3;
                i2 = i5;
            } else {
                if (a2.equals(UMCustomLogInfoBuilder.LOG_SECTION_SEP)) {
                    bVar = b.SECTION;
                    sb.append(a2).append('\n');
                    str = "+++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++ +++";
                    str2 = H;
                    i3 = 1;
                    z3 = false;
                    z4 = false;
                } else {
                    i3 = 1;
                    if (a2.length() > 1 && a2.endsWith(":")) {
                        bVar = b.SECTION;
                        String substring = a2.substring(0, a2.length() - 1);
                        if (T.contains(substring)) {
                            z3 = substring.equals(y) || substring.equals(z) || substring.equals("stack") || substring.equals(C) || substring.equals(E) || substring.equals(I) || substring.equals(M);
                            z4 = substring.equals(K);
                            str2 = substring;
                            str = "";
                        } else {
                            if (substring.equals(G)) {
                                str2 = substring;
                            } else if (substring.startsWith("memory near ")) {
                                sb.append(a2).append('\n');
                                str2 = B;
                            } else {
                                str2 = substring;
                                str = "";
                                z3 = false;
                                z4 = false;
                            }
                            str = "";
                            z4 = true;
                            z3 = false;
                        }
                        i4 = i3;
                        a2 = a3;
                        i2 = i5;
                    }
                }
                i4 = i3;
                a2 = a3;
                i2 = i5;
            }
        }
    }

    private static void a(Map<String, String> map, String str, String str2) {
        a(map, str, str2, false);
    }

    private static void a(Map<String, String> map, String str, String str2, boolean z2) {
        if (str == null || str.isEmpty() || str2 == null) {
            return;
        }
        String str3 = map.get(str);
        if (z2) {
            if (str3 != null) {
                str2 = str3 + str2;
            }
            map.put(str, str2);
        } else if (str3 == null || (str3.isEmpty() && !str2.isEmpty())) {
            map.put(str, str2);
        }
    }
}
