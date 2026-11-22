package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class vw {

    /* renamed from: a, reason: collision with root package name */
    private final String f17199a;
    private final String b;
    private final a c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a c;
        private static final /* synthetic */ a[] d;
        private final String b;

        static {
            a aVar = new a(0, "ERROR", "error");
            a aVar2 = new a(1, "MESSAGE", "message");
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

        private a(int i, String str, String str2) {
            this.b = str2;
        }

        public final String a() {
            return this.b;
        }
    }

    public vw(String str, String str2, a type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.f17199a = str;
        this.b = str2;
        this.c = type;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vw)) {
            return false;
        }
        vw vwVar = (vw) obj;
        return Intrinsics.areEqual(this.f17199a, vwVar.f17199a) && Intrinsics.areEqual(this.b, vwVar.b) && this.c == vwVar.c;
    }

    public final int hashCode() {
        String str = this.f17199a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return this.c.hashCode() + ((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "DebugPanelAlertData(title=" + this.f17199a + ", message=" + this.b + ", type=" + this.c + Separators.RPAREN;
    }
}
