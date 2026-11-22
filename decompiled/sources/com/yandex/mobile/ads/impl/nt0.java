package com.yandex.mobile.ads.impl;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class nt0 {
    public static final nt0 c;
    public static final nt0 d;
    public static final nt0 e;
    public static final nt0 f;
    public static final nt0 g;
    public static final nt0 h;
    public static final nt0 i;
    private static final /* synthetic */ nt0[] j;
    private final String b;

    static {
        nt0 nt0Var = new nt0(0, "AUTOMATIC_SDK_INITIALIZATION", "com.yandex.mobile.ads.AUTOMATIC_SDK_INITIALIZATION");
        c = nt0Var;
        nt0 nt0Var2 = new nt0(1, "AGE_RESTRICTED_USER", "com.yandex.mobile.ads.AGE_RESTRICTED_USER");
        d = nt0Var2;
        nt0 nt0Var3 = new nt0(2, "ENABLE_LOGGING", "com.yandex.mobile.ads.ENABLE_LOGGING");
        e = nt0Var3;
        nt0 nt0Var4 = new nt0(3, "AD_HOST", "com.yandex.mobile.ads.AD_HOST");
        f = nt0Var4;
        nt0 nt0Var5 = new nt0(4, "FALLBACK_HOSTS", "com.yandex.mobile.ads.FALLBACK_HOSTS");
        g = nt0Var5;
        nt0 nt0Var6 = new nt0(5, "APPMETRICA_EASY_INTEGRATION_ENABLED", "com.yandex.mobile.ads.APPMETRICA_EASY_INTEGRATION_ENABLED");
        h = nt0Var6;
        nt0 nt0Var7 = new nt0(6, "SINGLE_ASSEMBLY_ENABLED", "com.yandex.mobile.ads.SINGLE_ASSEMBLY_ENABLED");
        i = nt0Var7;
        nt0[] nt0VarArr = {nt0Var, nt0Var2, nt0Var3, nt0Var4, nt0Var5, nt0Var6, nt0Var7};
        j = nt0VarArr;
        EnumEntriesKt.enumEntries(nt0VarArr);
    }

    public static nt0 valueOf(String str) {
        return (nt0) Enum.valueOf(nt0.class, str);
    }

    public static nt0[] values() {
        return (nt0[]) j.clone();
    }

    private nt0(int i2, String str, String str2) {
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }
}
