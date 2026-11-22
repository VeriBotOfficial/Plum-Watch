package com.xiaomi.mipush.sdk;

import android.text.TextUtils;

/* loaded from: classes4.dex */
class n {

    /* renamed from: a, reason: collision with root package name */
    int f14398a = 0;

    /* renamed from: a, reason: collision with other field name */
    String f144a = "";

    public boolean equals(Object obj) {
        if (obj == null || !(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return !TextUtils.isEmpty(nVar.f144a) && nVar.f144a.equals(this.f144a);
    }
}
