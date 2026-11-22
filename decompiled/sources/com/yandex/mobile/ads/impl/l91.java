package com.yandex.mobile.ads.impl;

import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class l91 {
    @JvmStatic
    public static final boolean a(JSONObject jsonNative, String... keys) {
        Intrinsics.checkNotNullParameter(jsonNative, "jsonNative");
        Intrinsics.checkNotNullParameter(keys, "keys");
        for (String str : keys) {
            if (!jsonNative.has(str)) {
                return false;
            }
        }
        return true;
    }
}
