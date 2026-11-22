package com.yandex.mobile.ads.impl;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class fg2 {
    public static final fg2 b;
    public static final fg2 c;
    public static final fg2 d;
    public static final fg2 e;
    public static final fg2 f;
    public static final fg2 g;
    public static final fg2 h;
    public static final fg2 i;
    private static final /* synthetic */ fg2[] j;

    static {
        fg2 fg2Var = new fg2(0, "INITIAL");
        b = fg2Var;
        fg2 fg2Var2 = new fg2(1, "PREPARING");
        c = fg2Var2;
        fg2 fg2Var3 = new fg2(2, "PREPARED");
        d = fg2Var3;
        fg2 fg2Var4 = new fg2(3, "PLAYING");
        e = fg2Var4;
        fg2 fg2Var5 = new fg2(4, "STOPPED");
        f = fg2Var5;
        fg2 fg2Var6 = new fg2(5, "FINISHED");
        g = fg2Var6;
        fg2 fg2Var7 = new fg2(6, "PAUSED");
        h = fg2Var7;
        fg2 fg2Var8 = new fg2(7, "ERROR");
        i = fg2Var8;
        fg2[] fg2VarArr = {fg2Var, fg2Var2, fg2Var3, fg2Var4, fg2Var5, fg2Var6, fg2Var7, fg2Var8};
        j = fg2VarArr;
        EnumEntriesKt.enumEntries(fg2VarArr);
    }

    public static fg2 valueOf(String str) {
        return (fg2) Enum.valueOf(fg2.class, str);
    }

    public static fg2[] values() {
        return (fg2[]) j.clone();
    }

    private fg2(int i2, String str) {
    }
}
