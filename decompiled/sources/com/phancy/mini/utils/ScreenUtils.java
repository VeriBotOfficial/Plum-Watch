package com.phancy.mini.utils;

import android.content.Context;
import android.os.Build;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.phancy.mini.core.app.meta.MiniAppJson;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ScreenUtils.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\n\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u000e\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006J\u000e\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0010"}, d2 = {"Lcom/phancy/mini/utils/ScreenUtils;", "", "()V", "deviceOrientation", "", "context", "Landroid/content/Context;", "kernelTabBarHeight", "", "safeAreaHeight", "screenHeight", "screenWidth", "windowDisplay", "Landroid/view/Display;", "windowHeight", "windowWidth", "phancy-mini-sdk_overseasRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ScreenUtils {
    public static final ScreenUtils INSTANCE = new ScreenUtils();

    private ScreenUtils() {
    }

    public final int screenWidth(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getResources().getDisplayMetrics().widthPixels;
    }

    public final int screenHeight(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getResources().getDisplayMetrics().heightPixels + StatusBar.getStatusBarHeight(context);
    }

    public final int windowWidth(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        SystemService.INSTANCE.windowManager(context).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.widthPixels;
    }

    public final int windowHeight(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        SystemService.INSTANCE.windowManager(context).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels + StatusBar.getStatusBarHeight(context);
    }

    public final int safeAreaHeight(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        SystemService.INSTANCE.windowManager(context).getDefaultDisplay().getMetrics(displayMetrics);
        return displayMetrics.heightPixels;
    }

    public final int kernelTabBarHeight(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        DisplayMetrics displayMetrics = new DisplayMetrics();
        SystemService.INSTANCE.windowManager(context).getDefaultDisplay().getMetrics(displayMetrics);
        return (int) (OSExtKt.dip2px(49, context) / displayMetrics.density);
    }

    public final Display windowDisplay(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        if (Build.VERSION.SDK_INT >= 30) {
            return context.getDisplay();
        }
        Object systemService = context.getSystemService("window");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.view.WindowManager");
        return ((WindowManager) systemService).getDefaultDisplay();
    }

    public final String deviceOrientation(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        Display windowDisplay = windowDisplay(context);
        Integer valueOf = windowDisplay != null ? Integer.valueOf(windowDisplay.getRotation()) : null;
        if (valueOf != null && valueOf.intValue() == 1) {
            return MiniAppJson.LANDSCAPE;
        }
        if (valueOf != null && valueOf.intValue() == 3) {
            return MiniAppJson.LANDSCAPE;
        }
        return MiniAppJson.PORTRAIT;
    }
}
