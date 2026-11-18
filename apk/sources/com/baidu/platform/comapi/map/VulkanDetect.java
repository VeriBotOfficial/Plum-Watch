package com.baidu.platform.comapi.map;

import android.view.Surface;

/* JADX INFO: loaded from: classes15.dex */
class VulkanDetect {
    VulkanDetect() {
    }

    public static native long getNativeWindow(Surface surface);

    public static native boolean isSupportedVulkan();

    public static native void releaseNativeWindow(long j);
}
