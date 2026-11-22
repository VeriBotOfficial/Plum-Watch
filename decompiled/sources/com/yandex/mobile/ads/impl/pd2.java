package com.yandex.mobile.ads.impl;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class pd2 {
    public static final pd2 b;
    public static final pd2 c;
    public static final pd2 d;
    public static final pd2 e;
    public static final pd2 f;
    public static final pd2 g;
    public static final pd2 h;
    public static final pd2 i;
    public static final pd2 j;
    public static final pd2 k;
    private static final /* synthetic */ pd2[] l;

    static {
        pd2 pd2Var = new pd2(0, "INITIAL");
        b = pd2Var;
        pd2 pd2Var2 = new pd2(1, "PREPARING");
        c = pd2Var2;
        pd2 pd2Var3 = new pd2(2, "PREPARED");
        d = pd2Var3;
        pd2 pd2Var4 = new pd2(3, "PLAYING");
        e = pd2Var4;
        pd2 pd2Var5 = new pd2(4, "STOPPED");
        f = pd2Var5;
        pd2 pd2Var6 = new pd2(5, "FINISHED");
        g = pd2Var6;
        pd2 pd2Var7 = new pd2(6, "PAUSED");
        h = pd2Var7;
        pd2 pd2Var8 = new pd2(7, "BUFFERING");
        i = pd2Var8;
        pd2 pd2Var9 = new pd2(8, "PLAYING_ERROR");
        j = pd2Var9;
        pd2 pd2Var10 = new pd2(9, "PREPARING_ERROR");
        k = pd2Var10;
        pd2[] pd2VarArr = {pd2Var, pd2Var2, pd2Var3, pd2Var4, pd2Var5, pd2Var6, pd2Var7, pd2Var8, pd2Var9, pd2Var10};
        l = pd2VarArr;
        EnumEntriesKt.enumEntries(pd2VarArr);
    }

    public static pd2 valueOf(String str) {
        return (pd2) Enum.valueOf(pd2.class, str);
    }

    public static pd2[] values() {
        return (pd2[]) l.clone();
    }

    private pd2(int i2, String str) {
    }
}
