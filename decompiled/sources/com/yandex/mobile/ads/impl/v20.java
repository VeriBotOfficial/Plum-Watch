package com.yandex.mobile.ads.impl;

import android.net.Uri;
import android.view.View;
import java.util.Map;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class v20 {

    /* renamed from: a, reason: collision with root package name */
    private final uo f17109a;
    private vo b;

    public v20(uo mainClickConnector) {
        Intrinsics.checkNotNullParameter(mainClickConnector, "mainClickConnector");
        this.f17109a = mainClickConnector;
    }

    public final void a(Uri uri, View clickView) {
        Integer num;
        Map emptyMap;
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(clickView, "clickView");
        String queryParameter = uri.getQueryParameter("assetName");
        if (queryParameter != null) {
            String queryParameter2 = uri.getQueryParameter("position");
            if (queryParameter2 != null) {
                Intrinsics.checkNotNull(queryParameter2);
                num = StringsKt.toIntOrNull(queryParameter2);
            } else {
                num = null;
            }
            if (num == null) {
                this.f17109a.a(clickView, queryParameter);
                return;
            }
            vo voVar = this.b;
            if (voVar == null || (emptyMap = voVar.a()) == null) {
                emptyMap = MapsKt.emptyMap();
            }
            uo uoVar = (uo) emptyMap.get(num);
            if (uoVar != null) {
                uoVar.a(clickView, queryParameter);
            }
        }
    }

    public final void a(vo voVar) {
        this.b = voVar;
    }
}
