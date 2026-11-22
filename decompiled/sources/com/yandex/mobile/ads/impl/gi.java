package com.yandex.mobile.ads.impl;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class gi implements ei {

    /* renamed from: a, reason: collision with root package name */
    private final di f15593a;
    private final hi b;
    private final Object c;
    private final ArrayList d;

    public gi(kx1 sensitiveModeChecker, di autograbCollectionEnabledValidator, hi autograbProvider) {
        Intrinsics.checkNotNullParameter(sensitiveModeChecker, "sensitiveModeChecker");
        Intrinsics.checkNotNullParameter(autograbCollectionEnabledValidator, "autograbCollectionEnabledValidator");
        Intrinsics.checkNotNullParameter(autograbProvider, "autograbProvider");
        this.f15593a = autograbCollectionEnabledValidator;
        this.b = autograbProvider;
        this.c = new Object();
        this.d = new ArrayList();
    }

    @Override // com.yandex.mobile.ads.impl.ei
    public final void a() {
        HashSet hashSet;
        synchronized (this.c) {
            hashSet = new HashSet(this.d);
            this.d.clear();
            Unit unit = Unit.INSTANCE;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            this.b.b((ii) it.next());
        }
    }

    @Override // com.yandex.mobile.ads.impl.ei
    public final void a(Context context, ii autograbRequestListener) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(autograbRequestListener, "autograbRequestListener");
        if (this.f15593a.a(context)) {
            synchronized (this.c) {
                this.d.add(autograbRequestListener);
                this.b.a(autograbRequestListener);
                Unit unit = Unit.INSTANCE;
            }
            return;
        }
        autograbRequestListener.a(null);
    }
}
