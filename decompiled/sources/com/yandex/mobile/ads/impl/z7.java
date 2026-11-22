package com.yandex.mobile.ads.impl;

import android.util.Base64;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* loaded from: classes5.dex */
public final class z7 {
    public final String a() {
        byte[] decode = Base64.decode("ZGV2aWNlLWlk", 0);
        Intrinsics.checkNotNullExpressionValue(decode, "decode(...)");
        return new String(decode, Charsets.UTF_8);
    }

    public final String b() {
        byte[] decode = Base64.decode("ZGV2aWNlX3R5cGU=", 0);
        Intrinsics.checkNotNullExpressionValue(decode, "decode(...)");
        return new String(decode, Charsets.UTF_8);
    }

    public final String c() {
        byte[] decode = Base64.decode("aXNfcm9vdGVk", 0);
        Intrinsics.checkNotNullExpressionValue(decode, "decode(...)");
        return new String(decode, Charsets.UTF_8);
    }

    public final String d() {
        byte[] decode = Base64.decode("bWFudWZhY3R1cmVy", 0);
        Intrinsics.checkNotNullExpressionValue(decode, "decode(...)");
        return new String(decode, Charsets.UTF_8);
    }

    public final String e() {
        byte[] decode = Base64.decode("bW9kZWw=", 0);
        Intrinsics.checkNotNullExpressionValue(decode, "decode(...)");
        return new String(decode, Charsets.UTF_8);
    }

    public final String f() {
        byte[] decode = Base64.decode("b3NfbmFtZQ==", 0);
        Intrinsics.checkNotNullExpressionValue(decode, "decode(...)");
        return new String(decode, Charsets.UTF_8);
    }

    public final String g() {
        byte[] decode = Base64.decode("b3NfdmVyc2lvbg==", 0);
        Intrinsics.checkNotNullExpressionValue(decode, "decode(...)");
        return new String(decode, Charsets.UTF_8);
    }
}
