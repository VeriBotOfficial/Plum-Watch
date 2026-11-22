package com.iab.omid.library.applovin.utils;

import android.app.UiModeManager;
import android.content.Context;
import com.iab.omid.library.applovin.adsession.DeviceCategory;

/* loaded from: classes17.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static UiModeManager f10880a;

    public static DeviceCategory a() {
        UiModeManager uiModeManager = f10880a;
        if (uiModeManager == null) {
            return DeviceCategory.OTHER;
        }
        int currentModeType = uiModeManager.getCurrentModeType();
        return currentModeType != 1 ? currentModeType != 4 ? DeviceCategory.OTHER : DeviceCategory.CTV : DeviceCategory.MOBILE;
    }

    public static void a(Context context) {
        if (context != null) {
            f10880a = (UiModeManager) context.getSystemService("uimode");
        }
    }
}
