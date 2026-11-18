package com.huawei.hms.adapter.sysobs;

import android.content.Intent;

/* JADX INFO: loaded from: classes11.dex */
public interface SystemObserver {
    boolean onNoticeResult(int r1);

    boolean onSolutionResult(Intent intent, String str);

    boolean onUpdateResult(int r1);
}
