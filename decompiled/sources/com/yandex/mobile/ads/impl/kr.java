package com.yandex.mobile.ads.impl;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class kr {
    public static final kr c;
    public static final kr d;
    private static final /* synthetic */ kr[] e;
    private final String b;

    static {
        kr krVar = new kr(0, "NETWORK", "network");
        c = krVar;
        kr krVar2 = new kr(1, "CACHE", com.anythink.expressad.foundation.g.g.a.b.O);
        d = krVar2;
        kr[] krVarArr = {krVar, krVar2};
        e = krVarArr;
        EnumEntriesKt.enumEntries(krVarArr);
    }

    public static kr valueOf(String str) {
        return (kr) Enum.valueOf(kr.class, str);
    }

    public static kr[] values() {
        return (kr[]) e.clone();
    }

    private kr(int i, String str, String str2) {
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }
}
