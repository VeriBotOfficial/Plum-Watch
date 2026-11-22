package com.yandex.mobile.ads.impl;

import com.google.firebase.analytics.FirebaseAnalytics;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class ke {
    public static final ke c;
    public static final ke d;
    public static final ke e;
    public static final ke f;
    public static final ke g;
    public static final ke h;
    private static final /* synthetic */ ke[] i;
    private final String b;

    static {
        ke keVar = new ke(0, "AD_REQUEST", "ad_request");
        c = keVar;
        ke keVar2 = new ke(1, "AD_ATTEMPT", "ad_attempt");
        d = keVar2;
        ke keVar3 = new ke(2, "AD_FILLED_REQUEST", "ad_filled_request");
        e = keVar3;
        ke keVar4 = new ke(3, "AD_IMPRESSION", FirebaseAnalytics.Event.AD_IMPRESSION);
        f = keVar4;
        ke keVar5 = new ke(4, "AD_CLICK", "ad_click");
        g = keVar5;
        ke keVar6 = new ke(5, "AD_REWARD", "ad_reward");
        h = keVar6;
        ke[] keVarArr = {keVar, keVar2, keVar3, keVar4, keVar5, keVar6};
        i = keVarArr;
        EnumEntriesKt.enumEntries(keVarArr);
    }

    public static ke valueOf(String str) {
        return (ke) Enum.valueOf(ke.class, str);
    }

    public static ke[] values() {
        return (ke[]) i.clone();
    }

    private ke(int i2, String str, String str2) {
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }
}
