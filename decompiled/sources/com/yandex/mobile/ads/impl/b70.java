package com.yandex.mobile.ads.impl;

import com.google.android.exoplayer2.Player;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class b70 {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashSet f15078a = new LinkedHashSet();
    private Player b;

    public final void a(sl1 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f15078a.add(listener);
    }

    public final Player a() {
        return this.b;
    }

    public final boolean b() {
        return this.b != null;
    }

    public final void a(Player player) {
        this.b = player;
        Iterator it = this.f15078a.iterator();
        while (it.hasNext()) {
            ((xi1) it.next()).a(player);
        }
    }
}
