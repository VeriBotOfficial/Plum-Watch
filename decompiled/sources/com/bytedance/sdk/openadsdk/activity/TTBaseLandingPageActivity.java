package com.bytedance.sdk.openadsdk.activity;

import android.os.SystemClock;

/* loaded from: classes14.dex */
public class TTBaseLandingPageActivity extends TTBaseActivity {
    private long fxn;
    private long kg;

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    protected void onResume() {
        super.onResume();
        if (com.bytedance.sdk.openadsdk.utils.rb.gff()) {
            this.kg = SystemClock.elapsedRealtime();
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    protected void onPause() {
        super.onPause();
        if (this.kg > 0) {
            this.fxn += SystemClock.elapsedRealtime() - this.kg;
            this.kg = 0L;
        }
    }

    @Override // com.bytedance.sdk.openadsdk.activity.TTBaseActivity, android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        long j = this.fxn;
        if (j > 0) {
            com.bytedance.sdk.openadsdk.utils.rb.fxn(j);
        }
    }
}
