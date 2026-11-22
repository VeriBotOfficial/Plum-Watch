package com.iab.omid.library.toponad.utils;

import android.app.UiModeManager;
import android.content.Context;
import com.iab.omid.library.toponad.adsession.DeviceCategory;

/* loaded from: classes17.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private static UiModeManager f11022a;

    public static DeviceCategory a() {
        UiModeManager uiModeManager = f11022a;
        if (uiModeManager == null) {
            return DeviceCategory.OTHER;
        }
        int currentModeType = uiModeManager.getCurrentModeType();
        return currentModeType != 1 ? currentModeType != 4 ? DeviceCategory.OTHER : DeviceCategory.CTV : DeviceCategory.MOBILE;
    }

    public static void a(Context context) {
        if (context != null) {
            f11022a = (UiModeManager) context.getSystemService("uimode");
        }
    }
}
