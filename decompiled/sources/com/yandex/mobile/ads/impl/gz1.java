package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.enums.EnumEntriesKt;

/* loaded from: classes5.dex */
public interface gz1 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a c;
        public static final a d;
        public static final a e;
        private static final /* synthetic */ a[] f;
        private final String b;

        static {
            a aVar = new a(0, "FIXED", "fixed");
            c = aVar;
            a aVar2 = new a(1, "FLEXIBLE", "flexible");
            d = aVar2;
            a aVar3 = new a(2, "SCREEN", "screen");
            a aVar4 = new a(3, "STICKY", "sticky");
            e = aVar4;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
            f = aVarArr;
            EnumEntriesKt.enumEntries(aVarArr);
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f.clone();
        }

        private a(int i, String str, String str2) {
            this.b = str2;
        }

        public final String a() {
            return this.b;
        }
    }

    int a(Context context);

    a a();

    int b(Context context);

    int c(Context context);

    int d(Context context);

    int getHeight();

    int getWidth();
}
