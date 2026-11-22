package com.phancy.mini.utils;

import android.app.Activity;
import android.content.Context;
import com.autonavi.aps.amapapi.config.Const;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import qiu.niorgai.StatusBarCompat;

/* compiled from: StatusBar.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0007J\u0010\u0010\f\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\r"}, d2 = {"Lcom/phancy/mini/utils/StatusBar;", "", "()V", "cancelLightStatusBar", "", Const.STR_PROCESS_TAG, "Landroid/app/Activity;", "changeToLightStatusBar", "getStatusBarHeight", "", "context", "Landroid/content/Context;", "translucentStatusBar", "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class StatusBar {
    public static final StatusBar INSTANCE = new StatusBar();

    private StatusBar() {
    }

    @JvmStatic
    public static final int getStatusBarHeight(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelOffset(identifier);
        }
        return 0;
    }

    @JvmStatic
    public static final void translucentStatusBar(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        StatusBarCompat.translucentStatusBar(activity, true);
    }

    @JvmStatic
    public static final void changeToLightStatusBar(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        StatusBarCompat.changeToLightStatusBar(activity);
    }

    @JvmStatic
    public static final void cancelLightStatusBar(Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        StatusBarCompat.cancelLightStatusBar(activity);
    }
}
