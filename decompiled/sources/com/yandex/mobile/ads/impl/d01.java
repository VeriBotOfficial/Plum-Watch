package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import com.xiaomi.mipush.sdk.Constants;
import com.yandex.mobile.ads.impl.qz0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class d01 {

    /* renamed from: a, reason: collision with root package name */
    private final rz0 f15233a;

    public d01(rz0 mediationNetworkValidator) {
        Intrinsics.checkNotNullParameter(mediationNetworkValidator, "mediationNetworkValidator");
        this.f15233a = mediationNetworkValidator;
    }

    private static void a(ArrayList arrayList, String str) {
        int max = Math.max(4, 44 - str.length());
        int i = max / 2;
        String repeat = StringsKt.repeat(Constants.ACCEPT_TIME_SEPARATOR_SERVER, i);
        String repeat2 = StringsKt.repeat(Constants.ACCEPT_TIME_SEPARATOR_SERVER, (max % 2) + i);
        String repeat3 = StringsKt.repeat(" ", 1);
        arrayList.add(new a(repeat + repeat3 + str + repeat3 + repeat2, a.EnumC0966a.b));
    }

    private static void a(ArrayList arrayList, List list, String str, boolean z) {
        a.EnumC0966a enumC0966a;
        String str2;
        String str3;
        if (z) {
            enumC0966a = a.EnumC0966a.b;
            str2 = "ADAPTERS";
            str3 = "INTEGRATED SUCCESSFULLY";
        } else {
            enumC0966a = a.EnumC0966a.c;
            str2 = "MISSING ADAPTERS";
            str3 = "NOT INTEGRATED";
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList2.add(((qz0.c) it.next()).a());
        }
        arrayList.add(new a(CollectionsKt.joinToString$default(arrayList2, null, str2.concat(": "), null, 0, null, null, 61, null), enumC0966a));
        arrayList.add(new a(str + ": " + str3, enumC0966a));
    }

    private static void a(ArrayList arrayList, String str, String str2) {
        if (str != null && !StringsKt.isBlank(str)) {
            arrayList.add(new a("SDK Version: " + str, a.EnumC0966a.b));
        }
        if (str2 == null || StringsKt.isBlank(str2)) {
            return;
        }
        arrayList.add(new a("ADAPTERS Version: " + str2, a.EnumC0966a.b));
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f15234a;
        private final EnumC0966a b;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: com.yandex.mobile.ads.impl.d01$a$a, reason: collision with other inner class name */
        public static final class EnumC0966a {
            public static final EnumC0966a b;
            public static final EnumC0966a c;
            private static final /* synthetic */ EnumC0966a[] d;

            static {
                EnumC0966a enumC0966a = new EnumC0966a(0, "INFO");
                b = enumC0966a;
                EnumC0966a enumC0966a2 = new EnumC0966a(1, "ERROR");
                c = enumC0966a2;
                EnumC0966a[] enumC0966aArr = {enumC0966a, enumC0966a2};
                d = enumC0966aArr;
                EnumEntriesKt.enumEntries(enumC0966aArr);
            }

            public static EnumC0966a valueOf(String str) {
                return (EnumC0966a) Enum.valueOf(EnumC0966a.class, str);
            }

            public static EnumC0966a[] values() {
                return (EnumC0966a[]) d.clone();
            }

            private EnumC0966a(int i, String str) {
            }
        }

        public a(String message, EnumC0966a type) {
            Intrinsics.checkNotNullParameter(message, "message");
            Intrinsics.checkNotNullParameter(type, "type");
            this.f15234a = message;
            this.b = type;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f15234a, aVar.f15234a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f15234a.hashCode() * 31);
        }

        public final String toString() {
            return "MediationNetworkMessage(message=" + this.f15234a + ", type=" + this.b + Separators.RPAREN;
        }

        public final String a() {
            return this.f15234a;
        }

        public final EnumC0966a b() {
            return this.b;
        }
    }

    public final ArrayList a(ArrayList networks) {
        Intrinsics.checkNotNullParameter(networks, "networks");
        ArrayList arrayList = new ArrayList();
        Iterator it = networks.iterator();
        while (it.hasNext()) {
            qz0 qz0Var = (qz0) it.next();
            a(arrayList, qz0Var.d());
            String e = qz0Var.e();
            String b = ((qz0.c) CollectionsKt.first((List) qz0Var.b())).b();
            this.f15233a.getClass();
            boolean a2 = rz0.a(qz0Var);
            if (a2) {
                a(arrayList, e, b);
            }
            a(arrayList, qz0Var.b(), qz0Var.d(), a2);
        }
        return arrayList;
    }
}
