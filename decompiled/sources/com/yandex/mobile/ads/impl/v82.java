package com.yandex.mobile.ads.impl;

import java.net.URI;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class v82 {

    /* renamed from: a, reason: collision with root package name */
    public static final v82 f17139a = new v82();

    public static String a(String url) {
        Object m14057constructorimpl;
        String str;
        Intrinsics.checkNotNullParameter(url, "url");
        try {
            Result.Companion companion = Result.INSTANCE;
            boolean contains$default = StringsKt.contains$default((CharSequence) url, (CharSequence) "://", false, 2, (Object) null);
            if (!contains$default) {
                url = b(url);
            }
            URI uri = new URI(url);
            if (contains$default) {
                str = uri.getScheme() + "://";
            } else {
                str = "";
            }
            m14057constructorimpl = Result.m14057constructorimpl(str + uri.getHost());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m14057constructorimpl = Result.m14057constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m14063isFailureimpl(m14057constructorimpl)) {
            m14057constructorimpl = "bad_url";
        }
        return (String) m14057constructorimpl;
    }

    private static String b(String str) {
        return "stub://" + str;
    }

    private v82() {
    }
}
