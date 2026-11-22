package com.yandex.mobile.ads.impl;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes5.dex */
public final class u12 extends r12 {
    public static final Parcelable.Creator<u12> CREATOR = new a();

    final class a implements Parcelable.Creator<u12> {
        @Override // android.os.Parcelable.Creator
        public final u12 createFromParcel(Parcel parcel) {
            return new u12();
        }

        @Override // android.os.Parcelable.Creator
        public final u12[] newArray(int i) {
            return new u12[i];
        }

        a() {
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
    }
}
