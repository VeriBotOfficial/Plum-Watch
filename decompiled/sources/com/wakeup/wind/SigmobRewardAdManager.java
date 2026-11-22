package com.wakeup.wind;

import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.autonavi.aps.amapapi.config.Const;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SigmobRewardAdManager.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bJ\u001e\u0010\f\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b¨\u0006\r"}, d2 = {"Lcom/wakeup/wind/SigmobRewardAdManager;", "", "<init>", "()V", "showSplashAdForCodeStart", "", Const.STR_PROCESS_TAG, "Landroidx/appcompat/app/AppCompatActivity;", "adContainer", "Landroid/widget/FrameLayout;", "isFirst", "", "showSplashAdForRedStart", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SigmobRewardAdManager {
    public static final SigmobRewardAdManager INSTANCE = new SigmobRewardAdManager();

    public final void showSplashAdForCodeStart(AppCompatActivity activity, FrameLayout adContainer, boolean isFirst) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(adContainer, "adContainer");
    }

    public final void showSplashAdForRedStart(AppCompatActivity activity, FrameLayout adContainer, boolean isFirst) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(adContainer, "adContainer");
    }

    private SigmobRewardAdManager() {
    }
}
