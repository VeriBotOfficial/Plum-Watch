package com.yandex.mobile.ads.impl;

import android.app.LocaleManager;
import android.content.Context;
import android.os.Build;
import android.os.LocaleList;
import java.util.List;
import java.util.Locale;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class vs0 {

    /* renamed from: a, reason: collision with root package name */
    private final ts0 f17191a = new ts0();

    public final String a(Context context) {
        Object m14057constructorimpl;
        String c;
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Result.Companion companion = Result.INSTANCE;
            if (Build.VERSION.SDK_INT >= 33) {
                Object systemService = context.getSystemService("locale");
                Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.app.LocaleManager");
                LocaleList applicationLocales = ((LocaleManager) systemService).getApplicationLocales();
                Intrinsics.checkNotNullExpressionValue(applicationLocales, "getApplicationLocales(...)");
                if (applicationLocales.isEmpty()) {
                    Intrinsics.checkNotNullParameter(context, "context");
                    Locale locale = context.getResources().getConfiguration().locale;
                    ts0 ts0Var = this.f17191a;
                    Intrinsics.checkNotNull(locale);
                    ts0Var.getClass();
                    c = ts0.a(locale);
                } else {
                    ts0 ts0Var2 = this.f17191a;
                    Locale locale2 = applicationLocales.get(0);
                    Intrinsics.checkNotNullExpressionValue(locale2, "get(...)");
                    ts0Var2.getClass();
                    c = ts0.a(locale2);
                }
            } else {
                c = c(context);
            }
            m14057constructorimpl = Result.m14057constructorimpl(c);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m14057constructorimpl = Result.m14057constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m14063isFailureimpl(m14057constructorimpl)) {
            m14057constructorimpl = null;
        }
        return (String) m14057constructorimpl;
    }

    public final List<String> b(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            Result.Companion companion = Result.INSTANCE;
            LocaleList locales = context.getResources().getConfiguration().getLocales();
            Intrinsics.checkNotNullExpressionValue(locales, "getLocales(...)");
            List createListBuilder = CollectionsKt.createListBuilder();
            int size = locales.size();
            for (int i = 0; i < size; i++) {
                ts0 ts0Var = this.f17191a;
                Locale locale = locales.get(i);
                Intrinsics.checkNotNullExpressionValue(locale, "get(...)");
                ts0Var.getClass();
                createListBuilder.add(ts0.a(locale));
            }
            return CollectionsKt.build(createListBuilder);
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            Object m14057constructorimpl = Result.m14057constructorimpl(ResultKt.createFailure(th));
            if (Result.m14063isFailureimpl(m14057constructorimpl)) {
                m14057constructorimpl = null;
            }
            return (List) m14057constructorimpl;
        }
    }

    public final String c(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Locale locale = context.getResources().getConfiguration().locale;
        ts0 ts0Var = this.f17191a;
        Intrinsics.checkNotNull(locale);
        ts0Var.getClass();
        return ts0.a(locale);
    }
}
