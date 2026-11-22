package com.yandex.mobile.ads.impl;

import com.wakeup.common.network.entity.device.dial.DialPromoBanner;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class vm0 {
    public static final vm0 b;
    public static final vm0 c;
    public static final vm0 d;
    public static final vm0 e;
    public static final vm0 f;
    public static final vm0 g;
    public static final vm0 h;
    private static final /* synthetic */ vm0[] i;

    static {
        vm0 vm0Var = new vm0(0, DialPromoBanner.NONE);
        b = vm0Var;
        vm0 vm0Var2 = new vm0(1, "PREPARED");
        c = vm0Var2;
        vm0 vm0Var3 = new vm0(2, "PLAYING");
        d = vm0Var3;
        vm0 vm0Var4 = new vm0(3, "PAUSED");
        e = vm0Var4;
        vm0 vm0Var5 = new vm0(4, "SKIPPED");
        f = vm0Var5;
        vm0 vm0Var6 = new vm0(5, "ERROR");
        g = vm0Var6;
        vm0 vm0Var7 = new vm0(6, "COMPLETED");
        h = vm0Var7;
        vm0[] vm0VarArr = {vm0Var, vm0Var2, vm0Var3, vm0Var4, vm0Var5, vm0Var6, vm0Var7};
        i = vm0VarArr;
        EnumEntriesKt.enumEntries(vm0VarArr);
    }

    public static vm0 valueOf(String str) {
        return (vm0) Enum.valueOf(vm0.class, str);
    }

    public static vm0[] values() {
        return (vm0[]) i.clone();
    }

    private vm0(int i2, String str) {
    }
}
