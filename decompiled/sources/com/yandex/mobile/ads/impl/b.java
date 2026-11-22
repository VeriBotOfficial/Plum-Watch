package com.yandex.mobile.ads.impl;

import android.net.Uri;
import java.util.List;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    private final w82 f15054a;

    public b(w82 urlUtils) {
        Intrinsics.checkNotNullParameter(urlUtils, "urlUtils");
        this.f15054a = urlUtils;
    }

    @Override // com.yandex.mobile.ads.impl.a
    public final boolean a(String str) {
        Object m14057constructorimpl;
        this.f15054a.getClass();
        try {
            Result.Companion companion = Result.INSTANCE;
            m14057constructorimpl = Result.m14057constructorimpl(Uri.parse(str).getPathSegments());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m14057constructorimpl = Result.m14057constructorimpl(ResultKt.createFailure(th));
        }
        String str2 = null;
        if (Result.m14063isFailureimpl(m14057constructorimpl)) {
            m14057constructorimpl = null;
        }
        List list = (List) m14057constructorimpl;
        if (list != null && !list.isEmpty()) {
            str2 = (String) list.get(0);
        }
        return Intrinsics.areEqual("appcry", str2);
    }
}
