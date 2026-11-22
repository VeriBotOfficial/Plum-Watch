package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ay {

    /* renamed from: a, reason: collision with root package name */
    private final a f15049a;
    private final List<String> b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a b;
        public static final a c;
        public static final a d;
        private static final /* synthetic */ a[] e;

        static {
            a aVar = new a(0, "SUCCESS");
            b = aVar;
            a aVar2 = new a(1, "WARNING");
            c = aVar2;
            a aVar3 = new a(2, "ERROR");
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

    public ay(a status, List<String> list) {
        Intrinsics.checkNotNullParameter(status, "status");
        this.f15049a = status;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ay)) {
            return false;
        }
        ay ayVar = (ay) obj;
        return this.f15049a == ayVar.f15049a && Intrinsics.areEqual(this.b, ayVar.b);
    }

    public final int hashCode() {
        int hashCode = this.f15049a.hashCode() * 31;
        List<String> list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "DebugPanelSdkIntegrationStatusData(status=" + this.f15049a + ", messages=" + this.b + Separators.RPAREN;
    }

    public final a b() {
        return this.f15049a;
    }

    public final List<String> a() {
        return this.b;
    }
}
