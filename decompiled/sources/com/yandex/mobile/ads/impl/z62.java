package com.yandex.mobile.ads.impl;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class z62 {
    public static final z62 b;
    public static final z62 c;
    public static final z62 d;
    public static final z62 e;
    public static final z62 f;
    public static final z62 g;
    public static final z62 h;
    public static final z62 i;
    public static final z62 j;
    private static final /* synthetic */ z62[] k;

    static {
        z62 z62Var = new z62(0, "ADTUNE_CLICK");
        b = z62Var;
        z62 z62Var2 = new z62(1, "ADTUNE_ITEM_CLICK");
        c = z62Var2;
        z62 z62Var3 = new z62(2, "CLICK");
        d = z62Var3;
        z62 z62Var4 = new z62(3, "FALSE_CLICK");
        e = z62Var4;
        z62 z62Var5 = new z62(4, "MEDIATION_IMPRESSION");
        f = z62Var5;
        z62 z62Var6 = new z62(5, "MEDIATION_RESPONSE");
        g = z62Var6;
        z62 z62Var7 = new z62(6, "MRC_IMPRESSION");
        h = z62Var7;
        z62 z62Var8 = new z62(7, "RENDER");
        i = z62Var8;
        z62 z62Var9 = new z62(8, "SERVER_SIDE_REWARD");
        j = z62Var9;
        z62[] z62VarArr = {z62Var, z62Var2, z62Var3, z62Var4, z62Var5, z62Var6, z62Var7, z62Var8, z62Var9, new z62(9, "UNKNOWN")};
        k = z62VarArr;
        EnumEntriesKt.enumEntries(z62VarArr);
    }

    public static z62 valueOf(String str) {
        return (z62) Enum.valueOf(z62.class, str);
    }

    public static z62[] values() {
        return (z62[]) k.clone();
    }

    private z62(int i2, String str) {
    }
}
