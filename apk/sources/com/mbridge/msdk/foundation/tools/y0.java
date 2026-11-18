package com.mbridge.msdk.foundation.tools;

import android.text.TextUtils;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: compiled from: StringUtils.java */
/* JADX INFO: loaded from: classes2.dex */
public class y0 {
    public static boolean a(String str) {
        return str == null || TextUtils.isEmpty(str.trim()) || AbstractJsonLexerKt.NULL.equals(str);
    }

    public static boolean b(String str) {
        return (str == null || TextUtils.isEmpty(str.trim()) || AbstractJsonLexerKt.NULL.equals(str)) ? false : true;
    }
}
