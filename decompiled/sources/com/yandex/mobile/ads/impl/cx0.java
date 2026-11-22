package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class cx0 {
    private static final Pattern b = Pattern.compile("([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)/([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)");
    private static final Pattern c = Pattern.compile(";\\s*(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)=(?:([a-zA-Z0-9-!#$%&'*+.^_`{|}~]+)|\"([^\"]*)\"))?");
    public static final /* synthetic */ int d = 0;

    /* renamed from: a, reason: collision with root package name */
    private final String f15229a;

    public static final class a {
        @JvmStatic
        public static cx0 a(String str) {
            Intrinsics.checkNotNullParameter(str, "<this>");
            Matcher matcher = cx0.b.matcher(str);
            if (!matcher.lookingAt()) {
                throw new IllegalArgumentException(("No subtype found for: \"" + str + "\"").toString());
            }
            String group = matcher.group(1);
            Intrinsics.checkNotNullExpressionValue(group, "group(...)");
            Locale US = Locale.US;
            Intrinsics.checkNotNullExpressionValue(US, "US");
            Intrinsics.checkNotNullExpressionValue(group.toLowerCase(US), "toLowerCase(...)");
            String group2 = matcher.group(2);
            Intrinsics.checkNotNullExpressionValue(group2, "group(...)");
            Intrinsics.checkNotNullExpressionValue(US, "US");
            Intrinsics.checkNotNullExpressionValue(group2.toLowerCase(US), "toLowerCase(...)");
            ArrayList arrayList = new ArrayList();
            Matcher matcher2 = cx0.c.matcher(str);
            int end = matcher.end();
            while (end < str.length()) {
                matcher2.region(end, str.length());
                if (!matcher2.lookingAt()) {
                    String substring = str.substring(end);
                    Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                    throw new IllegalArgumentException(("Parameter is not formatted correctly: \"" + substring + "\" for: \"" + str + "\"").toString());
                }
                String group3 = matcher2.group(1);
                if (group3 == null) {
                    end = matcher2.end();
                } else {
                    String group4 = matcher2.group(2);
                    if (group4 == null) {
                        group4 = matcher2.group(3);
                    } else if (StringsKt.startsWith$default(group4, Separators.QUOTE, false, 2, (Object) null) && StringsKt.endsWith$default(group4, Separators.QUOTE, false, 2, (Object) null) && group4.length() > 2) {
                        group4 = group4.substring(1, group4.length() - 1);
                        Intrinsics.checkNotNullExpressionValue(group4, "substring(...)");
                    }
                    arrayList.add(group3);
                    arrayList.add(group4);
                    end = matcher2.end();
                }
            }
            return new cx0(str, (String[]) arrayList.toArray(new String[0]));
        }
    }

    private cx0(String str) {
        this.f15229a = str;
    }

    public /* synthetic */ cx0(String str, String[] strArr) {
        this(str);
    }

    public final String toString() {
        return this.f15229a;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof cx0) && Intrinsics.areEqual(((cx0) obj).f15229a, this.f15229a);
    }

    public final int hashCode() {
        return this.f15229a.hashCode();
    }
}
