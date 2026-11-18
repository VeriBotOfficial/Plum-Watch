package com.huawei.hms.activity.internal;

import android.content.Intent;

/* JADX INFO: loaded from: classes11.dex */
public class BusResponseResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Intent f10228a;
    private int b;

    public int getCode() {
        return this.b;
    }

    public Intent getIntent() {
        return this.f10228a;
    }

    public void setCode(int r1) {
        this.b = r1;
    }

    public void setIntent(Intent intent) {
        this.f10228a = intent;
    }
}
