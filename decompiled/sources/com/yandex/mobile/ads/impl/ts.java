package com.yandex.mobile.ads.impl;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class ts {
    public static final a c;
    public static final ts d;
    public static final ts e;
    public static final ts f;
    public static final ts g;
    public static final ts h;
    public static final ts i;
    public static final ts j;
    private static final /* synthetic */ ts[] k;
    private final String b;

    static {
        ts tsVar = new ts(0, "BANNER", "banner");
        d = tsVar;
        ts tsVar2 = new ts(1, "INTERSTITIAL", com.anythink.expressad.foundation.g.a.f.d);
        e = tsVar2;
        ts tsVar3 = new ts(2, "REWARDED", "rewarded");
        f = tsVar3;
        ts tsVar4 = new ts(3, "NATIVE", "native");
        g = tsVar4;
        ts tsVar5 = new ts(4, "INSTREAM", "instream");
        h = tsVar5;
        ts tsVar6 = new ts(5, "APPOPENAD", "appopenad");
        i = tsVar6;
        ts tsVar7 = new ts(6, "FEED", "feed");
        j = tsVar7;
        ts[] tsVarArr = {tsVar, tsVar2, tsVar3, tsVar4, tsVar5, tsVar6, tsVar7};
        k = tsVarArr;
        EnumEntriesKt.enumEntries(tsVarArr);
        c = new a(0);
    }

    public static ts valueOf(String str) {
        return (ts) Enum.valueOf(ts.class, str);
    }

    public static ts[] values() {
        return (ts[]) k.clone();
    }

    private ts(int i2, String str, String str2) {
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
