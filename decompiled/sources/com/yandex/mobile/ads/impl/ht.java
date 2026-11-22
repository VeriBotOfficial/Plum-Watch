package com.yandex.mobile.ads.impl;

import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ht {

    /* renamed from: a, reason: collision with root package name */
    private final a f15724a;
    private final long b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a b;
        public static final a c;
        public static final a d;
        private static final /* synthetic */ a[] e;

        static {
            a aVar = new a(0, "PERCENTS");
            b = aVar;
            a aVar2 = new a(1, "MILLISECONDS");
            c = aVar2;
            a aVar3 = new a(2, "POSITION");
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

    public ht(a positionType, long j) {
        Intrinsics.checkNotNullParameter(positionType, "positionType");
        this.f15724a = positionType;
        this.b = j;
    }

    public final a a() {
        return this.f15724a;
    }

    public final long b() {
        return this.b;
    }
}
