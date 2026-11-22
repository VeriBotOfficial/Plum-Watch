package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ot1 {

    /* renamed from: a, reason: collision with root package name */
    private final ArrayList f16485a;

    public ot1(om0 instreamAdPlaylist) {
        Intrinsics.checkNotNullParameter(instreamAdPlaylist, "instreamAdPlaylist");
        this.f16485a = a(instreamAdPlaylist);
    }

    private static ArrayList a(om0 om0Var) {
        ArrayList arrayList = new ArrayList();
        gt c = om0Var.c();
        if (c != null) {
            arrayList.add(new ej1(c, 0L));
        }
        arrayList.addAll(om0Var.a());
        return arrayList;
    }

    public final ArrayList a() {
        return this.f16485a;
    }
}
