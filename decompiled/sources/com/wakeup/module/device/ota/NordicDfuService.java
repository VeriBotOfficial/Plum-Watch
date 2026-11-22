package com.wakeup.module.device.ota;

import android.app.Activity;
import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.wakeup.common.log.LogUtils;
import no.nordicsemi.android.dfu.DfuBaseService;

/* loaded from: classes4.dex */
public class NordicDfuService extends DfuBaseService {
    @Override // no.nordicsemi.android.dfu.DfuBaseService
    protected boolean isDebug() {
        return true;
    }

    @Override // no.nordicsemi.android.dfu.DfuBaseService
    protected Class<? extends Activity> getNotificationTarget() {
        return NotificationActivity.class;
    }

    @Override // no.nordicsemi.android.dfu.DfuBaseService, android.app.IntentService
    protected void onHandleIntent(Intent intent) {
        try {
            super.onHandleIntent(intent);
        } catch (Exception e) {
            LogUtils.e("NordicOtaMgr", "onHandleIntent error: ", e);
            stop();
        }
    }

    private void stop() {
        Intent intent = new Intent(DfuBaseService.BROADCAST_ACTION);
        intent.putExtra(DfuBaseService.EXTRA_ACTION, 2);
        LocalBroadcastManager.getInstance(this).sendBroadcast(intent);
    }
}
