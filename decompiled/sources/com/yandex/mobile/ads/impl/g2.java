package com.yandex.mobile.ads.impl;

import android.javax.sip.ListeningPoint;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class g2 {
    public static final g2 b;
    public static final g2 c;
    private static final /* synthetic */ g2[] d;

    static {
        g2 g2Var = new g2(0, ListeningPoint.TCP);
        b = g2Var;
        g2 g2Var2 = new g2(1, "HTTP");
        c = g2Var2;
        g2[] g2VarArr = {g2Var, g2Var2};
        d = g2VarArr;
        EnumEntriesKt.enumEntries(g2VarArr);
    }

    public static g2 valueOf(String str) {
        return (g2) Enum.valueOf(g2.class, str);
    }

    public static g2[] values() {
        return (g2[]) d.clone();
    }

    private g2(int i, String str) {
    }
}
