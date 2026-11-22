package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* loaded from: classes5.dex */
public final class ug1 {

    /* renamed from: a, reason: collision with root package name */
    private static final List<String> f17049a = CollectionsKt.listOf((Object[]) new String[]{"android.permission.ACCESS_NETWORK_STATE", "android.permission.INTERNET"});

    public static void a(Context context) throws bp0 {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 4096);
            List mutableList = CollectionsKt.toMutableList((Collection) f17049a);
            String[] requestedPermissions = packageInfo.requestedPermissions;
            if (requestedPermissions != null) {
                Intrinsics.checkNotNullExpressionValue(requestedPermissions, "requestedPermissions");
                mutableList.removeAll(ArraysKt.toList(requestedPermissions));
                if (mutableList.size() <= 0) {
                    return;
                }
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                String format = String.format("Please, check %s permission in AndroidManifest file.", Arrays.copyOf(new Object[]{mutableList}, 1));
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                throw new bp0(format, format);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }
}
