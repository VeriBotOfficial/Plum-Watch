package com.bytedance.sdk.openadsdk.api.factory;

import android.util.Log;

/* loaded from: classes14.dex */
public class SDKTypeConfig {
    private static ISDKTypeFactory fxn;

    public static ISDKTypeFactory getSdkTypeFactory() {
        Log.i("SDKTypeConfig", "getSdkTypeFactory: ");
        return fxn;
    }

    public static void setSdkTypeFactory(ISDKTypeFactory iSDKTypeFactory) {
        Log.i("SDKTypeConfig", "setSdkTypeFactory: ");
        fxn = iSDKTypeFactory;
    }
}
