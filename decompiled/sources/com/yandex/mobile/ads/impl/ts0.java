package com.yandex.mobile.ads.impl;

import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ts0 {
    public static String a(Locale locale) {
        Intrinsics.checkNotNullParameter(locale, "locale");
        String language = locale.getLanguage();
        String country = locale.getCountry();
        StringBuilder sb = new StringBuilder(language);
        String script = locale.getScript();
        if (script != null && script.length() != 0) {
            sb.append('-').append(script);
        }
        if (country != null && country.length() != 0) {
            sb.append('_').append(country);
        }
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }
}
