package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.enums.EnumEntriesKt;

/* loaded from: classes5.dex */
public interface p82 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a b;
        public static final a c;
        private static final /* synthetic */ a[] d;

        static {
            a aVar = new a(0, "AD");
            b = aVar;
            a aVar2 = new a(1, "PASSBACK");
            c = aVar2;
            a[] aVarArr = {aVar, aVar2};
            d = aVarArr;
            EnumEntriesKt.enumEntries(aVarArr);
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) d.clone();
        }

        private a(int i, String str) {
        }
    }

    a a();

    String a(Context context, o3 o3Var, kx1 kx1Var);

    String a(o3 o3Var);
}
