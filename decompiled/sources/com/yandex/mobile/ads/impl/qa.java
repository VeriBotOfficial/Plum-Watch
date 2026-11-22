package com.yandex.mobile.ads.impl;

import android.content.Context;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class qa {
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
    
        if (r1 == 0) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0050, code lost:
    
        if (r3 <= r1) goto L20;
     */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean a(android.content.Context r7, com.yandex.mobile.ads.impl.gz1 r8, com.yandex.mobile.ads.impl.gz1 r9) {
        /*
            java.lang.String r0 = "context"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            java.lang.String r1 = "sizeInfo"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r1)
            java.lang.String r2 = "containerSizeInfo"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r2)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r7, r0)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r8, r1)
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r9, r2)
            int r0 = r9.c(r7)
            int r1 = r9.a(r7)
            int r2 = r8.c(r7)
            int r3 = r8.a(r7)
            com.yandex.mobile.ads.impl.gz1$a r9 = r9.a()
            int r9 = r9.ordinal()
            r4 = 0
            r5 = 1
            if (r9 == 0) goto L4c
            if (r9 == r5) goto L43
            r6 = 2
            if (r9 == r6) goto L52
            r6 = 3
            if (r9 != r6) goto L3d
            goto L43
        L3d:
            kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
            r7.<init>()
            throw r7
        L43:
            if (r2 > r0) goto L54
            if (r0 <= 0) goto L54
            if (r3 <= r1) goto L52
            if (r1 != 0) goto L54
            goto L52
        L4c:
            if (r2 > r0) goto L54
            if (r0 <= 0) goto L54
            if (r3 > r1) goto L54
        L52:
            r9 = r5
            goto L55
        L54:
            r9 = r4
        L55:
            boolean r7 = b(r7, r8)
            if (r9 == 0) goto L5e
            if (r7 == 0) goto L5e
            return r5
        L5e:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.qa.a(android.content.Context, com.yandex.mobile.ads.impl.gz1, com.yandex.mobile.ads.impl.gz1):boolean");
    }

    @JvmStatic
    public static final boolean b(Context context, gz1 adSize) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        return adSize.c(context) <= wh2.c(context) && adSize.a(context) <= wh2.b(context);
    }

    @JvmStatic
    public static final boolean a(Context context, gz1 adSize) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(adSize, "adSize");
        return adSize.c(context) <= wh2.b(context) && adSize.a(context) <= wh2.c(context);
    }
}
