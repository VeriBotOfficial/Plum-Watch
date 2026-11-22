package com.bytedance.sdk.openadsdk.rmu.gff;

import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes14.dex */
public class fxn {
    private final SharedPreferences fxn;

    public fxn(Context context) {
        this.fxn = context.getSharedPreferences("pag_monitor_record", 0);
    }

    public long fxn() {
        return this.fxn.getLong("last_upload_time", 0L);
    }

    public void fxn(long j) {
        SharedPreferences.Editor edit = this.fxn.edit();
        edit.putLong("last_upload_time", j);
        edit.apply();
    }
}
