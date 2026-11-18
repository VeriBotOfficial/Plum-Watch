package com.anythink.expressad.foundation.h;

import android.text.TextUtils;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes16.dex */
public final class y {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f4943a = "StringUtils";

    public static boolean a(String str) {
        return str == null || TextUtils.isEmpty(str.trim()) || AbstractJsonLexerKt.NULL.equals(str);
    }

    public static boolean b(String str) {
        return (str == null || TextUtils.isEmpty(str.trim()) || AbstractJsonLexerKt.NULL.equals(str)) ? false : true;
    }
}
