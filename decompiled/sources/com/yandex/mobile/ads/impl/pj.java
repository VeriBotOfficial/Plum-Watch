package com.yandex.mobile.ads.impl;

import com.baidu.platform.comapi.map.MapBundleKey;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class pj {
    public static final a c;
    public static final pj d;
    private static final /* synthetic */ pj[] e;
    private final String b;

    static {
        pj pjVar = new pj(0, "CONSTANT", "constant");
        pj pjVar2 = new pj(1, "RATIO", MapBundleKey.OfflineMapKey.OFFLINE_RATION);
        pj pjVar3 = new pj(2, "SCREEN_BASED", "screen_based");
        pj pjVar4 = new pj(3, "SCREEN_ORIENTATION_BASED", "screen_orientation_based");
        d = pjVar4;
        pj[] pjVarArr = {pjVar, pjVar2, pjVar3, pjVar4, new pj(4, "MEDIATION", "mediation")};
        e = pjVarArr;
        EnumEntriesKt.enumEntries(pjVarArr);
        c = new a(0);
    }

    public static pj valueOf(String str) {
        return (pj) Enum.valueOf(pj.class, str);
    }

    public static pj[] values() {
        return (pj[]) e.clone();
    }

    private pj(int i, String str, String str2) {
        this.b = str2;
    }

    public final String a() {
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
