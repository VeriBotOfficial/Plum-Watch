package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class tp {

    /* renamed from: a, reason: collision with root package name */
    private final a f16991a;
    private final String b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a b;
        public static final a c;
        private static final /* synthetic */ a[] d;

        static {
            a aVar = new a(0, "TEXT");
            b = aVar;
            a aVar2 = new a(1, "IMAGE");
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

    public tp(a type, String str) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f16991a = type;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tp)) {
            return false;
        }
        tp tpVar = (tp) obj;
        return this.f16991a == tpVar.f16991a && Intrinsics.areEqual(this.b, tpVar.b);
    }

    public final int hashCode() {
        int hashCode = this.f16991a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "CloseButtonValue(type=" + this.f16991a + ", text=" + this.b + Separators.RPAREN;
    }

    public final a b() {
        return this.f16991a;
    }

    public final String a() {
        return this.b;
    }
}
