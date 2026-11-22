package com.huawei.hms.scankit.aiscan.common;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: ResultPoint.java */
/* loaded from: classes14.dex */
class y implements Parcelable.Creator<z> {
    y() {
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public z createFromParcel(Parcel parcel) {
        return new z(parcel);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // android.os.Parcelable.Creator
    public z[] newArray(int i) {
        return new z[i];
    }
}
