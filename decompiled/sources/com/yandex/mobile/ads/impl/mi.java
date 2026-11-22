package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.yandex.mobile.ads.impl.w82;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class mi {

    /* renamed from: a, reason: collision with root package name */
    private final kg0 f16244a;
    private final ig0 b;

    public final String a(Context context) {
        String str;
        Object obj;
        Intrinsics.checkNotNullParameter(context, "context");
        List<String> a2 = this.f16244a.a(context);
        if (a2.size() > 1) {
            Iterator it = CollectionsKt.dropLast(a2, 1).iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                w82.f17229a.getClass();
                String a3 = w82.a.a((String) obj);
                if (a3 != null && (!StringsKt.isBlank(a3))) {
                    ig0 ig0Var = this.b;
                    int i = ig0.c;
                    if (ig0Var.a(1000, a3)) {
                        break;
                    }
                }
            }
            str = (String) obj;
            if (str == null) {
                str = (String) CollectionsKt.last((List) a2);
            }
        } else {
            str = (String) CollectionsKt.firstOrNull((List) a2);
        }
        return str == null ? "mobile.yandexadexchange.net" : str;
    }

    public /* synthetic */ mi() {
        this(new kg0(), new ig0());
    }

    public mi(kg0 hostsProvider, ig0 hostReachabilityRepository) {
        Intrinsics.checkNotNullParameter(hostsProvider, "hostsProvider");
        Intrinsics.checkNotNullParameter(hostReachabilityRepository, "hostReachabilityRepository");
        this.f16244a = hostsProvider;
        this.b = hostReachabilityRepository;
    }
}
