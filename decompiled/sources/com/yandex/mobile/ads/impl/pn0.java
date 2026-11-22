package com.yandex.mobile.ads.impl;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class pn0 {
    public static final a c;
    private static final pn0 d;
    private static final /* synthetic */ pn0[] e;
    private final String b;

    static {
        pn0 pn0Var = new pn0(0, "DESIGN_V1", "design_v1");
        pn0[] pn0VarArr = {pn0Var, new pn0(1, "DESIGN_V2", "instream_design_v2")};
        e = pn0VarArr;
        EnumEntriesKt.enumEntries(pn0VarArr);
        c = new a(0);
        d = pn0Var;
    }

    public static pn0 valueOf(String str) {
        return (pn0) Enum.valueOf(pn0.class, str);
    }

    public static pn0[] values() {
        return (pn0[]) e.clone();
    }

    private pn0(int i, String str, String str2) {
        this.b = str2;
    }

    public final String b() {
        return this.b;
    }

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(int i) {
            this();
        }
    }
}
