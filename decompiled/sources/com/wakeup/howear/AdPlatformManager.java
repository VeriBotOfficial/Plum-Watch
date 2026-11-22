package com.wakeup.howear;

import android.app.Activity;
import com.wakeup.common.base.BaseCallback;
import com.wakeup.common.log.LogUtils;

/* loaded from: classes3.dex */
public class AdPlatformManager {
    private static final String TAG = "AdPlatformManager";

    private AdPlatformManager() {
    }

    public static void fetchAdConfig(Activity activity, BaseCallback<Integer> baseCallback) {
        LogUtils.i(TAG, "fetchAdConfig start");
        baseCallback.callback(0, 0);
    }
}
