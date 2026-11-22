package com.yandex.mobile.ads.impl;

import androidx.core.app.NotificationCompat;
import kotlin.enums.EnumEntriesKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes5.dex */
public final class gr1 {
    public static final gr1 c;
    public static final gr1 d;
    private static final /* synthetic */ gr1[] e;
    private final String b;

    static {
        gr1 gr1Var = new gr1(0, "CONTENT", "content");
        c = gr1Var;
        gr1 gr1Var2 = new gr1(1, "APP_INSTALL", "app");
        d = gr1Var2;
        gr1[] gr1VarArr = {gr1Var, gr1Var2, new gr1(2, "IMAGE", "image"), new gr1(3, "PROMO", NotificationCompat.CATEGORY_PROMO)};
        e = gr1VarArr;
        EnumEntriesKt.enumEntries(gr1VarArr);
    }

    public static gr1 valueOf(String str) {
        return (gr1) Enum.valueOf(gr1.class, str);
    }

    public static gr1[] values() {
        return (gr1[]) e.clone();
    }

    private gr1(int i, String str, String str2) {
        this.b = str2;
    }

    public final String a() {
        return this.b;
    }
}
