package io.agora.utils2.internal;

import android.util.Log;
import io.agora.utils2.internal.CommonUtility;

/* loaded from: classes6.dex */
public class RtcSystemEventListener implements CommonUtility.SystemEventListener {
    private static final String TAG = "RtcSystemEventListener";
    private long mNativeHandle;

    public RtcSystemEventListener(long mNativeHandle) {
        this.mNativeHandle = mNativeHandle;
    }

    private native void nativeAudioRoutingPhoneChanged(boolean enableAudio, int event, int arg);

    private native void nativeNotifyAddressBound(String addr);

    private native void nativeNotifyForegroundChanged(boolean isForeground);

    private native void nativeNotifyGravityOriChange(int mOrientation);

    private native void nativeNotifyNetworkChange(CommonUtility.MediaNetworkInfo networkInfo);

    public long getNativeHandle() {
        return this.mNativeHandle;
    }

    @Override // io.agora.utils2.internal.CommonUtility.SystemEventListener
    public void onAddressBound(String addr) {
        nativeNotifyAddressBound(addr);
    }

    @Override // io.agora.utils2.internal.CommonUtility.SystemEventListener
    public void onAudioRoutingPhoneChanged(boolean enableAudio, int event, int arg) {
        nativeAudioRoutingPhoneChanged(enableAudio, event, arg);
    }

    @Override // io.agora.utils2.internal.CommonUtility.SystemEventListener
    public void onForegroundChanged(boolean isForeground) {
        nativeNotifyForegroundChanged(isForeground);
    }

    @Override // io.agora.utils2.internal.CommonUtility.SystemEventListener
    public void onGravityOriChange(int mOrientation) {
        nativeNotifyGravityOriChange(mOrientation);
    }

    @Override // io.agora.utils2.internal.CommonUtility.SystemEventListener
    public void onNetworkChange(CommonUtility.MediaNetworkInfo networkInfo) {
        nativeNotifyNetworkChange(networkInfo);
        Log.d(TAG, "onNetworkChange: ");
    }
}
