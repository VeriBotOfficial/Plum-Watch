package com.yandex.mobile.ads.impl;

import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class yo {
    public static final a c;
    public static final yo d;
    private static final /* synthetic */ yo[] e;
    private final String b;

    static {
        yo yoVar = new yo(0, "BROWSER", "browser");
        yo yoVar2 = new yo(1, "WEBVIEW", "webview");
        d = yoVar2;
        yo[] yoVarArr = {yoVar, yoVar2};
        e = yoVarArr;
        EnumEntriesKt.enumEntries(yoVarArr);
        c = new a(0);
    }

    public static yo valueOf(String str) {
        return (yo) Enum.valueOf(yo.class, str);
    }

    public static yo[] values() {
        return (yo[]) e.clone();
    }

    private yo(int i, String str, String str2) {
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
