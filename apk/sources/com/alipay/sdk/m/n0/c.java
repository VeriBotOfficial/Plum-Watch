package com.alipay.sdk.m.n0;

import android.text.TextUtils;

/* JADX INFO: loaded from: classes7.dex */
public class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public String f1421a;
    public Boolean b;

    public void a(boolean z) {
        this.b = Boolean.valueOf(z);
    }

    public boolean a() {
        return this.b != null;
    }

    public boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return TextUtils.equals(this.f1421a, str);
    }

    public void b(String str) {
        this.f1421a = str;
    }

    public boolean b() {
        Boolean bool = this.b;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }
}
