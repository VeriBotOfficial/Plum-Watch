package com.yandex.mobile.ads.impl;

import kotlin.enums.EnumEntriesKt;

/* loaded from: classes5.dex */
public final class xa2 extends RuntimeException {
    private final wa2 b;
    private final a c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a c;
        public static final a d;
        private static final /* synthetic */ a[] e;
        private final int b;

        static {
            a aVar = new a(0, 1, "VERIFICATION_REJECTED");
            a aVar2 = new a(1, 2, "VERIFICATION_NOT_SUPPORTED");
            c = aVar2;
            a aVar3 = new a(2, 3, "ERROR_RESOURCE_LOAD");
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

        private a(int i, int i2, String str) {
            this.b = i2;
        }

        public final int a() {
            return this.b;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public xa2(com.yandex.mobile.ads.impl.wa2 r4, com.yandex.mobile.ads.impl.xa2.a r5) {
        /*
            r3 = this;
            java.lang.String r0 = "verification"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r4, r0)
            java.lang.String r0 = "reason"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r5, r0)
            java.lang.String r0 = r5.name()
            java.util.Locale r1 = java.util.Locale.US
            java.lang.String r2 = "US"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r1, r2)
            java.lang.String r0 = r0.toLowerCase(r1)
            java.lang.String r1 = "toLowerCase(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r1)
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Verification not executed with reason = "
            r1.<init>(r2)
            java.lang.StringBuilder r0 = r1.append(r0)
            java.lang.String r0 = r0.toString()
            r3.<init>(r0)
            r3.b = r4
            r3.c = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.xa2.<init>(com.yandex.mobile.ads.impl.wa2, com.yandex.mobile.ads.impl.xa2$a):void");
    }

    public final wa2 b() {
        return this.b;
    }

    public final a a() {
        return this.c;
    }
}
