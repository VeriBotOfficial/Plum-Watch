package com.yandex.mobile.ads.impl;

import com.wakeup.common.network.entity.device.dial.DialPromoBanner;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class wm0 {
    public static final wm0 b;
    public static final wm0 c;
    public static final wm0 d;
    public static final wm0 e;
    public static final wm0 f;
    public static final wm0 g;
    public static final wm0 h;
    private static final /* synthetic */ wm0[] i;

    static {
        wm0 wm0Var = new wm0(0, DialPromoBanner.NONE);
        b = wm0Var;
        wm0 wm0Var2 = new wm0(1, "PREPARED");
        c = wm0Var2;
        wm0 wm0Var3 = new wm0(2, "PLAYING");
        d = wm0Var3;
        wm0 wm0Var4 = new wm0(3, "PAUSED");
        e = wm0Var4;
        wm0 wm0Var5 = new wm0(4, "SKIPPED");
        f = wm0Var5;
        wm0 wm0Var6 = new wm0(5, "ERROR");
        g = wm0Var6;
        wm0 wm0Var7 = new wm0(6, "COMPLETED");
        h = wm0Var7;
        wm0[] wm0VarArr = {wm0Var, wm0Var2, wm0Var3, wm0Var4, wm0Var5, wm0Var6, wm0Var7};
        i = wm0VarArr;
        EnumEntriesKt.enumEntries(wm0VarArr);
    }

    public static wm0 valueOf(String str) {
        return (wm0) Enum.valueOf(wm0.class, str);
    }

    public static wm0[] values() {
        return (wm0[]) i.clone();
    }

    private wm0(int i2, String str) {
    }
}
