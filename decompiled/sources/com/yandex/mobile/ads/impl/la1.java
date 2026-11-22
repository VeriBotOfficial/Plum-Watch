package com.yandex.mobile.ads.impl;

import kotlin.enums.EnumEntriesKt;

/* loaded from: classes5.dex */
public interface la1 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a b;
        public static final a c;
        public static final a d;
        private static final /* synthetic */ a[] e;

        static {
            a aVar = new a(0, "FIXED");
            b = aVar;
            a aVar2 = new a(1, "FIXED_RATIO");
            c = aVar2;
            a aVar3 = new a(2, "PREFERRED_RATIO");
            d = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
            e = aVarArr;
            EnumEntriesKt.enumEntries(aVarArr);
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) e.clone();
        }

        private a(int i, String str) {
        }
    }

    public interface b {
        a getType();
    }

    b getSizeConstraintType();

    float getValue();
}
