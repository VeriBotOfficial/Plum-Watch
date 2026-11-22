package io.agora.utils2.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.lang.ref.WeakReference;

/* loaded from: classes6.dex */
public class ConnectionChangeBroadcastReceiver extends BroadcastReceiver {
    private static final String TAG = "ConnectionChangeBroadca";
    private WeakReference<CommonUtility> mCommonUtility;

    public ConnectionChangeBroadcastReceiver(CommonUtility cu) {
        this.mCommonUtility = new WeakReference<>(cu);
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        CommonUtility commonUtility = this.mCommonUtility.get();
        if (commonUtility == null) {
            Logging.w(TAG, "rtc engine is not ready");
        } else {
            commonUtility.onNetworkChange();
        }
    }
}
