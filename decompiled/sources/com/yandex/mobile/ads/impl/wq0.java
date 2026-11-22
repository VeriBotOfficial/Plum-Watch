package com.yandex.mobile.ads.impl;

import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class wq0 {
    public static final String a(String name, JSONObject jSONObject) {
        Object m14057constructorimpl;
        Intrinsics.checkNotNullParameter(jSONObject, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        try {
            Result.Companion companion = Result.INSTANCE;
            m14057constructorimpl = Result.m14057constructorimpl(jSONObject.getString(name));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m14057constructorimpl = Result.m14057constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m14063isFailureimpl(m14057constructorimpl)) {
            m14057constructorimpl = null;
        }
        return (String) m14057constructorimpl;
    }
}
