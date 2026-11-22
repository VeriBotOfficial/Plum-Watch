package com.yandex.mobile.ads.impl;

import android.content.Context;
import com.monetization.ads.nativeads.video.view.CorePlaybackControlsContainer;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class zv0 {

    /* renamed from: a, reason: collision with root package name */
    private final yv0 f17562a;
    private final gt1<CorePlaybackControlsContainer> b;

    public final aw0 a(Context context, int i, aw0 controls) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(controls, "customControls");
        this.f17562a.getClass();
        Intrinsics.checkNotNullParameter(controls, "controls");
        if (controls.getMuteControl() != null || controls.getVideoProgress() != null || controls.getCountDownProgress() != null) {
            return new nv(controls.getMuteControl(), controls.getVideoProgress(), controls.getCountDownProgress());
        }
        this.b.getClass();
        return (aw0) gt1.a(context, CorePlaybackControlsContainer.class, i, null);
    }

    public /* synthetic */ zv0() {
        this(new yv0(), new gt1());
    }

    public zv0(yv0 controlsAvailabilityChecker, gt1<CorePlaybackControlsContainer> safeLayoutInflater) {
        Intrinsics.checkNotNullParameter(controlsAvailabilityChecker, "controlsAvailabilityChecker");
        Intrinsics.checkNotNullParameter(safeLayoutInflater, "safeLayoutInflater");
        this.f17562a = controlsAvailabilityChecker;
        this.b = safeLayoutInflater;
    }
}
