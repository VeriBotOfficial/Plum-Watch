package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.k01;

/* loaded from: classes5.dex */
public abstract class r12 implements k01.b {
    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final String toString() {
        return "SCTE-35 splice command: type=".concat(getClass().getSimpleName());
    }
}
