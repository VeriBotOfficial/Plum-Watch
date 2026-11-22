package com.wakeup.wind;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.appcompat.app.AppCompatActivity;
import com.autonavi.aps.amapapi.config.Const;
import com.wakeup.common.base.BaseCallback;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WindMillAdManager.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001c\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\rJ\u001e\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000eJ\u001e\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u000eJ\u0006\u0010\u0016\u001a\u00020\u000eR\u0014\u0010\u0004\u001a\u00020\u0005X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0017"}, d2 = {"Lcom/wakeup/wind/WindMillAdManager;", "", "<init>", "()V", "WIND_SDK_APP_ID", "", "getWIND_SDK_APP_ID", "()Ljava/lang/String;", "initWindMillAd", "", "context", "Landroid/content/Context;", "callback", "Lcom/wakeup/common/base/BaseCallback;", "", "showSplashAdForCodeStart", Const.STR_PROCESS_TAG, "Landroidx/appcompat/app/AppCompatActivity;", "adContainer", "Landroid/widget/FrameLayout;", "isFirst", "showSplashAdForRedStart", "isInited", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class WindMillAdManager {
    public static final WindMillAdManager INSTANCE = new WindMillAdManager();
    private static final String WIND_SDK_APP_ID = "";

    public final void initWindMillAd(Context context, BaseCallback<Boolean> callback) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(callback, "callback");
    }

    public final boolean isInited() {
        return false;
    }

    public final void showSplashAdForCodeStart(AppCompatActivity activity, FrameLayout adContainer, boolean isFirst) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(adContainer, "adContainer");
    }

    public final void showSplashAdForRedStart(AppCompatActivity activity, FrameLayout adContainer, boolean isFirst) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(adContainer, "adContainer");
    }

    private WindMillAdManager() {
    }

    public final String getWIND_SDK_APP_ID() {
        return WIND_SDK_APP_ID;
    }
}
