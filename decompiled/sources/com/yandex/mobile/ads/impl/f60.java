package com.yandex.mobile.ads.impl;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class f60 {
    public static final f60 b;
    public static final f60 c;
    private static final /* synthetic */ f60[] d;

    static {
        f60 f60Var = new f60(0, "FRAME");
        b = f60Var;
        f60 f60Var2 = new f60(1, "TRACE");
        c = f60Var2;
        f60[] f60VarArr = {f60Var, f60Var2};
        d = f60VarArr;
        EnumEntriesKt.enumEntries(f60VarArr);
    }

    public static f60 valueOf(String str) {
        return (f60) Enum.valueOf(f60.class, str);
    }

    public static f60[] values() {
        return (f60[]) d.clone();
    }

    private f60(int i, String str) {
    }
}
