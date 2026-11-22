package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.UserManager;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class by1 {
    public static SharedPreferences a(by1 by1Var, Context context, String prefName) {
        Object m14057constructorimpl;
        by1Var.getClass();
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(prefName, "prefName");
        try {
            Result.Companion companion = Result.INSTANCE;
            Object systemService = context.getSystemService("user");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.UserManager");
            m14057constructorimpl = Result.m14057constructorimpl(Boolean.valueOf(((UserManager) systemService).isUserUnlocked()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m14057constructorimpl = Result.m14057constructorimpl(ResultKt.createFailure(th));
        }
        Boolean bool = Boolean.TRUE;
        if (Result.m14063isFailureimpl(m14057constructorimpl)) {
            m14057constructorimpl = bool;
        }
        if (((Boolean) m14057constructorimpl).booleanValue()) {
            SharedPreferences sharedPreferences = context.getSharedPreferences(prefName, 0);
            Intrinsics.checkNotNull(sharedPreferences);
            return sharedPreferences;
        }
        SharedPreferences sharedPreferences2 = context.createDeviceProtectedStorageContext().getSharedPreferences(prefName, 0);
        Intrinsics.checkNotNull(sharedPreferences2);
        return sharedPreferences2;
    }
}
