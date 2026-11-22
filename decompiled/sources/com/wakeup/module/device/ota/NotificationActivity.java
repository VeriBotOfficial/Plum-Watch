package com.wakeup.module.device.ota;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

/* loaded from: classes4.dex */
public class NotificationActivity extends Activity {
    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (isTaskRoot()) {
            new Intent().addFlags(268435456);
        }
        finish();
    }
}
