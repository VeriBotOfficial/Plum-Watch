package com.bytedance.sdk.component.adexpress.theme;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import java.lang.ref.WeakReference;

/* loaded from: classes13.dex */
public class ThemeStatusBroadcastReceiver extends BroadcastReceiver {
    private WeakReference<fxn> fxn;

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (intent == null) {
            return;
        }
        int intExtra = intent.getIntExtra("theme_status_change", 0);
        WeakReference<fxn> weakReference = this.fxn;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        this.fxn.get().onThemeChanged(intExtra);
    }

    public void fxn(fxn fxnVar) {
        this.fxn = new WeakReference<>(fxnVar);
    }
}
