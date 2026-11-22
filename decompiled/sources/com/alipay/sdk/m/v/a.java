package com.alipay.sdk.m.v;

import android.text.TextUtils;

/* loaded from: classes11.dex */
public enum a {
    None("none"),
    WapPay("js://wappay"),
    Update("js://update"),
    OpenWeb("loc:openweb"),
    SetResult("loc:setResult"),
    Exit("loc:exit"),
    LocalWebPay("js://localWebPay");


    /* renamed from: a, reason: collision with root package name */
    public String f1467a;

    a(String str) {
        this.f1467a = str;
    }

    public static a a(String str) {
        if (TextUtils.isEmpty(str)) {
            return None;
        }
        a aVar = None;
        for (a aVar2 : values()) {
            if (str.startsWith(aVar2.f1467a)) {
                return aVar2;
            }
        }
        return aVar;
    }
}
