package com.huawei.hms.support.api.client;

import android.os.Bundle;

/* JADX INFO: loaded from: classes11.dex */
public class BundleResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f10727a;
    private Bundle b;

    public BundleResult(int r1, Bundle bundle) {
        this.f10727a = r1;
        this.b = bundle;
    }

    public int getResultCode() {
        return this.f10727a;
    }

    public Bundle getRspBody() {
        return this.b;
    }

    public void setResultCode(int r1) {
        this.f10727a = r1;
    }

    public void setRspBody(Bundle bundle) {
        this.b = bundle;
    }
}
