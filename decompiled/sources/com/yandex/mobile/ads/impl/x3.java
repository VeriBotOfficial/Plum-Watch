package com.yandex.mobile.ads.impl;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class x3 {
    public static final x3 b;
    public static final x3 c;
    public static final x3 d;
    public static final x3 e;
    public static final x3 f;
    public static final x3 g;
    public static final x3 h;
    public static final x3 i;
    public static final x3 j;
    public static final x3 k;
    public static final x3 l;
    public static final x3 m;
    public static final x3 n;
    public static final x3 o;
    public static final x3 p;

    /* renamed from: q, reason: collision with root package name */
    private static final /* synthetic */ x3[] f17306q;

    static {
        x3 x3Var = new x3(0, "REQUEST_SUCCEEDED_RESPONSE_NOT_FOUND");
        b = x3Var;
        x3 x3Var2 = new x3(1, "REQUEST_SUCCEEDED_RESPONSE_PARAMS_INVALID");
        c = x3Var2;
        x3 x3Var3 = new x3(2, "REQUEST_SUCCEEDED_RESPONSE_NO_CONTENT");
        d = x3Var3;
        x3 x3Var4 = new x3(3, "REQUEST_SUCCEEDED_RESPONSE_CODE_INVALID");
        e = x3Var4;
        x3 x3Var5 = new x3(4, "REQUEST_SUCCEEDED_SERVICE_UNAVAILABLE");
        f = x3Var5;
        x3 x3Var6 = new x3(5, "REQUEST_SUCCEEDED_NO_SUCH_AD_UNIT_ID_ERROR");
        g = x3Var6;
        x3 x3Var7 = new x3(6, "REQUEST_SUCCEEDED_INVALID_SDK_CONFIGURATION");
        h = x3Var7;
        x3 x3Var8 = new x3(7, "REQUEST_FAILED_INVALID_ANDROID_SDK_API");
        i = x3Var8;
        x3 x3Var9 = new x3(8, "REQUEST_FAILED_INVALID_REQUEST_URL");
        j = x3Var9;
        x3 x3Var10 = new x3(9, "REQUEST_FAILED_NO_CONNECTION");
        k = x3Var10;
        x3 x3Var11 = new x3(10, "REQUEST_FAILED_TIMEOUT");
        l = x3Var11;
        x3 x3Var12 = new x3(11, "REQUEST_FAILED_AUTH_FAILURE");
        m = x3Var12;
        x3 x3Var13 = new x3(12, "REQUEST_FAILED_CLIENT_ERROR");
        n = x3Var13;
        x3 x3Var14 = new x3(13, "REQUEST_FAILED_PARSE_ERROR");
        o = x3Var14;
        x3 x3Var15 = new x3(14, "REQUEST_FAILED_UNKNOWN");
        p = x3Var15;
        x3[] x3VarArr = {x3Var, x3Var2, x3Var3, x3Var4, x3Var5, x3Var6, x3Var7, x3Var8, x3Var9, x3Var10, x3Var11, x3Var12, x3Var13, x3Var14, x3Var15};
        f17306q = x3VarArr;
        EnumEntriesKt.enumEntries(x3VarArr);
    }

    public static x3 valueOf(String str) {
        return (x3) Enum.valueOf(x3.class, str);
    }

    public static x3[] values() {
        return (x3[]) f17306q.clone();
    }

    private x3(int i2, String str) {
    }
}
