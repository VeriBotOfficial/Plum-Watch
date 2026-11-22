package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.ze2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class re2 {

    /* renamed from: a, reason: collision with root package name */
    private final Context f16759a;
    private final lg2 b;
    private final qg2 c;

    public re2(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.f16759a = context.getApplicationContext();
        this.b = new lg2();
        this.c = new qg2();
    }

    public final void a(List<String> rawUrls, Map<String, String> macros) {
        Intrinsics.checkNotNullParameter(rawUrls, "rawUrls");
        ArrayList trackingUrls = new ArrayList(CollectionsKt.collectionSizeOrDefault(rawUrls, 10));
        for (String url : rawUrls) {
            boolean z = macros != null;
            if (z) {
                this.b.getClass();
                Intrinsics.checkNotNullParameter(url, "url");
                Intrinsics.checkNotNullParameter(macros, "macros");
                String str = url;
                for (Map.Entry<String, String> entry : macros.entrySet()) {
                    str = StringsKt.replace$default(str, entry.getKey(), entry.getValue(), false, 4, (Object) null);
                }
                url = str;
            } else if (z) {
                throw new NoWhenBranchMatchedException();
            }
            trackingUrls.add(url);
        }
        this.c.getClass();
        Intrinsics.checkNotNullParameter(trackingUrls, "trackingUrls");
        ArrayList arrayList = new ArrayList();
        Iterator it = trackingUrls.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (!Intrinsics.areEqual((String) next, "about:blank")) {
                arrayList.add(next);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            String str2 = (String) it2.next();
            ze2.a aVar = ze2.c;
            Context applicationContext = this.f16759a;
            Intrinsics.checkNotNullExpressionValue(applicationContext, "applicationContext");
            aVar.a(applicationContext).a(str2);
        }
    }
}
