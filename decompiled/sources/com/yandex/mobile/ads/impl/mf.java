package com.yandex.mobile.ads.impl;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class mf {
    public static final mf b;
    public static final mf c;
    public static final mf d;
    private static final /* synthetic */ mf[] e;

    static {
        mf mfVar = new mf(0, "UNKNOWN");
        b = mfVar;
        mf mfVar2 = new mf(1, "NETWORK");
        c = mfVar2;
        mf mfVar3 = new mf(2, "INVALID_RESPONSE");
        d = mfVar3;
        mf[] mfVarArr = {mfVar, mfVar2, mfVar3};
        e = mfVarArr;
        EnumEntriesKt.enumEntries(mfVarArr);
    }

    public static mf valueOf(String str) {
        return (mf) Enum.valueOf(mf.class, str);
    }

    public static mf[] values() {
        return (mf[]) e.clone();
    }

    private mf(int i, String str) {
    }
}
