package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.k01;

/* loaded from: classes5.dex */
public abstract class ti0 implements k01.b {
    public final String b;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public ti0(String str) {
        this.b = str;
    }

    public String toString() {
        return this.b;
    }
}
