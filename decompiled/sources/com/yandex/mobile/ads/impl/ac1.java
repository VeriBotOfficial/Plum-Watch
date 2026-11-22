package com.yandex.mobile.ads.impl;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ac1 {

    /* renamed from: a, reason: collision with root package name */
    private final xe2 f14994a;
    private final wa1 b;
    private final double c;

    public /* synthetic */ ac1(sa1 sa1Var, xe2 xe2Var) {
        this(sa1Var, xe2Var, new wa1(sa1Var));
    }

    public ac1(sa1 nativeVideoAdPlayer, xe2 videoOptions, wa1 playerVolumeManager) {
        double d;
        Intrinsics.checkNotNullParameter(nativeVideoAdPlayer, "nativeVideoAdPlayer");
        Intrinsics.checkNotNullParameter(videoOptions, "videoOptions");
        Intrinsics.checkNotNullParameter(playerVolumeManager, "playerVolumeManager");
        this.f14994a = videoOptions;
        this.b = playerVolumeManager;
        Double a2 = videoOptions.a();
        if (a2 != null) {
            a2 = (a2.doubleValue() > 0.0d ? 1 : (a2.doubleValue() == 0.0d ? 0 : -1)) == 0 ? null : a2;
            if (a2 != null) {
                d = a2.doubleValue();
                this.c = d;
            }
        }
        d = 1.0d;
        this.c = d;
    }

    public final void a(aw0 aw0Var) {
        if (aw0Var != null) {
            final CheckBox muteControl = aw0Var.getMuteControl();
            if (muteControl != null) {
                muteControl.setOnClickListener(new View.OnClickListener() { // from class: com.yandex.mobile.ads.impl.ac1$$ExternalSyntheticLambda0
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view) {
                        ac1.a(ac1.this, muteControl, view);
                    }
                });
                muteControl.setVisibility(this.f14994a.d() ? 0 : 8);
            }
            ProgressBar videoProgress = aw0Var.getVideoProgress();
            if (videoProgress != null) {
                videoProgress.setVisibility(this.f14994a.b() ? 8 : 0);
            }
            TextView countDownProgress = aw0Var.getCountDownProgress();
            if (countDownProgress != null) {
                countDownProgress.setText("");
                countDownProgress.setVisibility(0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(ac1 this$0, CheckBox checkBox, View view) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        this$0.b.a(Double.valueOf(!checkBox.isChecked() ? this$0.c : 0.0d));
    }
}
