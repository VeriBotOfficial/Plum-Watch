package com.huawei.hms.support.api.client;

import android.os.Bundle;

/* loaded from: classes14.dex */
public class BundleResult {

    /* renamed from: a, reason: collision with root package name */
    private int f10727a;
    private Bundle b;

    public BundleResult(int i, Bundle bundle) {
        this.f10727a = i;
        this.b = bundle;
    }

    public int getResultCode() {
        return this.f10727a;
    }

    public Bundle getRspBody() {
        return this.b;
    }

    public void setResultCode(int i) {
        this.f10727a = i;
    }

    public void setRspBody(Bundle bundle) {
        this.b = bundle;
    }
}
