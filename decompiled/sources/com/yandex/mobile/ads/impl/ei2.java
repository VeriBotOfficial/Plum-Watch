package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.n92;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* loaded from: classes5.dex */
public final class ei2 {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<n92.a, String> f15388a = MapsKt.mapOf(TuplesKt.to(n92.a.d, "Screen is locked"), TuplesKt.to(n92.a.e, "Asset value %s doesn't match view value"), TuplesKt.to(n92.a.f, "No ad view"), TuplesKt.to(n92.a.g, "No valid ads in ad unit"), TuplesKt.to(n92.a.h, "No visible required assets"), TuplesKt.to(n92.a.i, "Ad view is not added to hierarchy"), TuplesKt.to(n92.a.j, "Ad is not visible for percent"), TuplesKt.to(n92.a.k, "Required asset %s is not visible in ad view"), TuplesKt.to(n92.a.l, "Required asset %s is not subview of ad view"), TuplesKt.to(n92.a.c, "Unknown error, that shouldn't happen"), TuplesKt.to(n92.a.m, "Ad view is hidden"), TuplesKt.to(n92.a.n, "View is too small"), TuplesKt.to(n92.a.o, "Visible area of an ad view is too small"));

    public static String a(n92 validationResult) {
        Intrinsics.checkNotNullParameter(validationResult, "validationResult");
        String a2 = validationResult.a();
        String str = f15388a.get(validationResult.b());
        if (str == null) {
            return "Visibility error";
        }
        StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
        return z0.a(new Object[]{a2}, 1, str, "format(...)");
    }
}
