package com.yandex.mobile.ads.impl;

import com.wakeup.common.network.entity.device.dial.DialPromoBanner;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class sw {
    public static final sw c;
    public static final sw d;
    public static final sw e;
    private static final /* synthetic */ sw[] f;
    private final String b;

    static {
        sw swVar = new sw(0, "BIDDING", "Bidding");
        c = swVar;
        sw swVar2 = new sw(1, "WATERFALL", "Waterfall");
        d = swVar2;
        sw swVar3 = new sw(2, DialPromoBanner.NONE, "None");
        e = swVar3;
        sw[] swVarArr = {swVar, swVar2, swVar3};
        f = swVarArr;
        EnumEntriesKt.enumEntries(swVarArr);
    }

    public static sw valueOf(String str) {
        return (sw) Enum.valueOf(sw.class, str);
    }

    public static sw[] values() {
        return (sw[]) f.clone();
    }

    private sw(int i, String str, String str2) {
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }
}
