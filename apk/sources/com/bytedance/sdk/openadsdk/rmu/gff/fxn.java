package com.bytedance.sdk.openadsdk.rmu.gff;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes11.dex */
public class fxn {
    private final SharedPreferences fxn;

    public fxn(Context context) {
        this.fxn = context.getSharedPreferences("pag_monitor_record", 0);
    }

    public long fxn() {
        return this.fxn.getLong("last_upload_time", 0L);
    }

    public void fxn(long j) {
        SharedPreferences.Editor editorEdit = this.fxn.edit();
        editorEdit.putLong("last_upload_time", j);
        editorEdit.apply();
    }
}
