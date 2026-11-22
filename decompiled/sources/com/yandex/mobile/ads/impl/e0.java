package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class e0 {

    /* renamed from: a, reason: collision with root package name */
    private final jp1 f15330a;
    private final zv0 b;
    private final d0 c;

    public final qa1 a(Context context, xe2 videoOptions, aw0 customControls, int i) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(videoOptions, "videoOptions");
        Intrinsics.checkNotNullParameter(customControls, "customControls");
        qa1 actionViewsContainer = new qa1(context, this.f15330a.a(context), this.b.a(context, i, customControls));
        this.c.getClass();
        Intrinsics.checkNotNullParameter(actionViewsContainer, "actionViewsContainer");
        Intrinsics.checkNotNullParameter(videoOptions, "videoOptions");
        aw0 a2 = actionViewsContainer.a();
        actionViewsContainer.b().setVisibility(8);
        CheckBox muteControl = a2 != null ? a2.getMuteControl() : null;
        if (muteControl != null) {
            muteControl.setVisibility(8);
        }
        ProgressBar videoProgress = a2 != null ? a2.getVideoProgress() : null;
        if (videoProgress != null) {
            videoProgress.setVisibility(8);
        }
        TextView countDownProgress = a2 != null ? a2.getCountDownProgress() : null;
        if (countDownProgress != null) {
            countDownProgress.setVisibility(8);
        }
        CheckBox muteControl2 = a2 != null ? a2.getMuteControl() : null;
        if (muteControl2 == null) {
            return actionViewsContainer;
        }
        muteControl2.setChecked(videoOptions.e());
        return actionViewsContainer;
    }

    public /* synthetic */ e0() {
        this(new jp1(), new zv0(), new d0());
    }

    public e0(jp1 replayActionViewCreator, zv0 controlsContainerCreator, d0 mediaControlsContainerConfigurator) {
        Intrinsics.checkNotNullParameter(replayActionViewCreator, "replayActionViewCreator");
        Intrinsics.checkNotNullParameter(controlsContainerCreator, "controlsContainerCreator");
        Intrinsics.checkNotNullParameter(mediaControlsContainerConfigurator, "mediaControlsContainerConfigurator");
        this.f15330a = replayActionViewCreator;
        this.b = controlsContainerCreator;
        this.c = mediaControlsContainerConfigurator;
    }
}
