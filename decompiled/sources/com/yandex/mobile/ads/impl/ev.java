package com.yandex.mobile.ads.impl;

import java.nio.charset.Charset;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import okio.ByteString;

/* loaded from: classes5.dex */
public final class ev {
    @JvmStatic
    public static final String a(String username, String password, Charset charset) {
        Intrinsics.checkNotNullParameter(username, "username");
        Intrinsics.checkNotNullParameter(password, "password");
        Intrinsics.checkNotNullParameter(charset, "charset");
        return "Basic " + ByteString.INSTANCE.encodeString(username + ":" + password, charset).base64();
    }
}
