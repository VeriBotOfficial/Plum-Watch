package com.anythink.core.common.n.b;

import android.gov.nist.core.Separators;
import java.nio.charset.Charset;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: classes12.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    private static final String f4206a = "([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)";
    private static final String b = "\"([^\"]*)\"";
    private static final Pattern c = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    private static final Pattern d = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    private final String e;
    private final String f;
    private final String g;
    private final String h;

    private x(String str, String str2, String str3, String str4) {
        this.e = str;
        this.f = str2;
        this.g = str3;
        this.h = str4;
    }

    public static x a(String str) {
        Matcher matcher = c.matcher(str);
        if (!matcher.lookingAt()) {
            throw new IllegalArgumentException("No subtype found for: \"" + str + '\"');
        }
        String lowerCase = matcher.group(1).toLowerCase(Locale.US);
        String lowerCase2 = matcher.group(2).toLowerCase(Locale.US);
        Matcher matcher2 = d.matcher(str);
        String str2 = null;
        for (int end = matcher.end(); end < str.length(); end = matcher2.end()) {
            matcher2.region(end, str.length());
            if (!matcher2.lookingAt()) {
                throw new IllegalArgumentException("Parameter is not formatted correctly: \"" + str.substring(end) + "\" for: \"" + str + '\"');
            }
            String group = matcher2.group(1);
            if (group != null && group.equalsIgnoreCase("charset")) {
                String group2 = matcher2.group(2);
                if (group2 != null) {
                    if (group2.startsWith(Separators.QUOTE) && group2.endsWith(Separators.QUOTE) && group2.length() > 2) {
                        group2 = group2.substring(1, group2.length() - 1);
                    }
                } else {
                    group2 = matcher2.group(3);
                }
                if (str2 != null && !group2.equalsIgnoreCase(str2)) {
                    throw new IllegalArgumentException("Multiple charsets defined: \"" + str2 + "\" and: \"" + group2 + "\" for: \"" + str + '\"');
                }
                str2 = group2;
            }
        }
        return new x(str, lowerCase, lowerCase2, str2);
    }

    public static x b(String str) {
        try {
            return a(str);
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    public final String a() {
        return this.f;
    }

    private String b() {
        return this.g;
    }

    private Charset c() {
        return a((Charset) null);
    }

    public final Charset a(Charset charset) {
        try {
            String str = this.h;
            return str != null ? Charset.forName(str) : charset;
        } catch (IllegalArgumentException unused) {
            return charset;
        }
    }

    public final String toString() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof x) && ((x) obj).e.equals(this.e);
    }

    public final int hashCode() {
        return this.e.hashCode();
    }
}
