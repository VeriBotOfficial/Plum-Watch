package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.pw1;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class rd2 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f16757a;

    public rd2(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Context applicationContext = context.getApplicationContext();
        Intrinsics.checkNotNullExpressionValue(applicationContext, "getApplicationContext(...)");
        this.f16757a = applicationContext;
    }

    public final Map a(LinkedHashMap rawEvents, zh2 zh2Var) {
        Intrinsics.checkNotNullParameter(rawEvents, "rawEvents");
        int i = pw1.l;
        ju1 a2 = pw1.a.a().a(this.f16757a);
        if (a2 != null && a2.j0()) {
            return rawEvents;
        }
        Map mutableMap = MapsKt.toMutableMap(rawEvents);
        List<String> a3 = zh2Var != null ? zh2Var.a() : null;
        List list = (List) mutableMap.get("impression");
        if (a3 != null) {
            mutableMap.put("impression", a3);
        } else {
            mutableMap.remove("impression");
        }
        if (list != null) {
            mutableMap.put("render_impression", list);
            return mutableMap;
        }
        mutableMap.remove("render_impression");
        return mutableMap;
    }
}
