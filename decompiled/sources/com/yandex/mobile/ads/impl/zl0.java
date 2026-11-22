package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.ProgressBar;
import com.yandex.mobile.ads.impl.ln0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class zl0 {

    /* renamed from: a, reason: collision with root package name */
    private final co0 f17537a;

    public zl0(co0 instreamVastAdPlayer) {
        Intrinsics.checkNotNullParameter(instreamVastAdPlayer, "instreamVastAdPlayer");
        this.f17537a = instreamVastAdPlayer;
    }

    public final ln0 a(ob2 uiElements, ln0 initialControlsState) {
        Intrinsics.checkNotNullParameter(uiElements, "uiElements");
        Intrinsics.checkNotNullParameter(initialControlsState, "initialControlsState");
        boolean z = this.f17537a.getVolume() == 0.0f;
        View n = uiElements.n();
        Float f = null;
        Boolean valueOf = n != null ? Boolean.valueOf(n.isEnabled()) : null;
        ProgressBar j = uiElements.j();
        if (j != null) {
            int progress = j.getProgress();
            int max = j.getMax();
            if (max != 0) {
                f = Float.valueOf(progress / max);
            }
        }
        ln0.a aVar = new ln0.a();
        aVar.b(z);
        if (valueOf != null) {
            aVar.a(valueOf.booleanValue());
        }
        if (f != null) {
            aVar.b(f.floatValue());
        }
        aVar.a(initialControlsState.a());
        return new ln0(aVar);
    }
}
