package com.huawei.hms.activity;

import android.app.Activity;
import android.content.Intent;
import android.view.KeyEvent;

/* JADX INFO: loaded from: classes11.dex */
public interface IBridgeActivityDelegate {
    int getRequestCode();

    void onBridgeActivityCreate(Activity activity);

    void onBridgeActivityDestroy();

    boolean onBridgeActivityResult(int r1, int r2, Intent intent);

    void onBridgeConfigurationChanged();

    void onKeyUp(int r1, KeyEvent keyEvent);
}
