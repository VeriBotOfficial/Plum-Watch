package com.yandex.mobile.ads.impl;

import androidx.media3.common.Player;
import java.util.Iterator;
import java.util.LinkedHashSet;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a70 {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashSet f14979a = new LinkedHashSet();
    private Player b;

    public final void a(rl1 listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f14979a.add(listener);
    }

    public final Player a() {
        return this.b;
    }

    public final boolean b() {
        return this.b != null;
    }

    public final void a(Player player) {
        this.b = player;
        Iterator it = this.f14979a.iterator();
        while (it.hasNext()) {
            ((wi1) it.next()).a(player);
        }
    }
}
