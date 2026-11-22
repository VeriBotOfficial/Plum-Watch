package com.yandex.mobile.ads.impl;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class xy {
    public static final a b;
    public static final xy c;
    public static final xy d;
    private static final /* synthetic */ xy[] e;
    private static final /* synthetic */ EnumEntries f;

    static {
        xy xyVar = new xy(0, "DEFAULT");
        c = xyVar;
        xy xyVar2 = new xy(1, "RESULT");
        d = xyVar2;
        xy[] xyVarArr = {xyVar, xyVar2};
        e = xyVarArr;
        f = EnumEntriesKt.enumEntries(xyVarArr);
        b = new a(0);
    }

    public static EnumEntries<xy> a() {
        return f;
    }

    public static xy valueOf(String str) {
        return (xy) Enum.valueOf(xy.class, str);
    }

    public static xy[] values() {
        return (xy[]) e.clone();
    }

    private xy(int i, String str) {
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(int i) {
            this();
        }
    }
}
