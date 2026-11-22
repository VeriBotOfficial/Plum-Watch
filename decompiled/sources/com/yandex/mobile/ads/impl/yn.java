package com.yandex.mobile.ads.impl;

import kotlin.enums.EnumEntriesKt;

/* loaded from: classes5.dex */
public abstract class yn implements Runnable {
    private a b = a.b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a b;
        public static final a c;
        private static final /* synthetic */ a[] d;

        static {
            a aVar = new a(0, "ACTIVE");
            b = aVar;
            a aVar2 = new a(1, "CANCELED");
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

    public final boolean b() {
        return this.b == a.b;
    }

    public final void a() {
        this.b = a.c;
    }
}
