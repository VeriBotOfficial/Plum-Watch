package com.bytedance.sdk.openadsdk.core.theme;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.lang.ref.WeakReference;

/* JADX INFO: loaded from: classes11.dex */
public class ThemeStatusBroadcastReceiver extends BroadcastReceiver {
    private WeakReference<Object> fxn;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        intent.getIntExtra("theme_status_change", 0);
        WeakReference<Object> weakReference = this.fxn;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.fxn.get();
    }
}
