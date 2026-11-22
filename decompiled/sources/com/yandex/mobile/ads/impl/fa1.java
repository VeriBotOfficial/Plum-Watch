package com.yandex.mobile.ads.impl;

import androidx.core.app.NotificationCompat;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class fa1 {
    public static final fa1 c;
    public static final fa1 d;
    private static final /* synthetic */ fa1[] e;
    private final String b;

    static {
        fa1 fa1Var = new fa1(0, "AD", "ad");
        c = fa1Var;
        fa1 fa1Var2 = new fa1(1, "PROMO", NotificationCompat.CATEGORY_PROMO);
        d = fa1Var2;
        fa1[] fa1VarArr = {fa1Var, fa1Var2};
        e = fa1VarArr;
        EnumEntriesKt.enumEntries(fa1VarArr);
    }

    public static fa1 valueOf(String str) {
        return (fa1) Enum.valueOf(fa1.class, str);
    }

    public static fa1[] values() {
        return (fa1[]) e.clone();
    }

    private fa1(int i, String str, String str2) {
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }
}
