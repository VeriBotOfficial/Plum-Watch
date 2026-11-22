package com.bytedance.adsdk.ugeno.tw;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes13.dex */
public abstract class fxn implements Parcelable {
    private final Parcelable kg;
    public static final fxn fxn = new fxn() { // from class: com.bytedance.adsdk.ugeno.tw.fxn.1
    };
    public static final Parcelable.Creator<fxn> CREATOR = new Parcelable.ClassLoaderCreator<fxn>() { // from class: com.bytedance.adsdk.ugeno.tw.fxn.2
        @Override // android.os.Parcelable.Creator
        /* renamed from: fxn, reason: merged with bridge method [inline-methods] */
        public fxn createFromParcel(Parcel parcel) {
            return createFromParcel(parcel, null);
        }

        @Override // android.os.Parcelable.ClassLoaderCreator
        /* renamed from: fxn, reason: merged with bridge method [inline-methods] */
        public fxn createFromParcel(Parcel parcel, ClassLoader classLoader) {
            if (parcel.readParcelable(classLoader) != null) {
                throw new IllegalStateException("superState must be null");
            }
            return fxn.fxn;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: fxn, reason: merged with bridge method [inline-methods] */
        public fxn[] newArray(int i) {
            return new fxn[i];
        }
    };

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    private fxn() {
        this.kg = null;
    }

    protected fxn(Parcelable parcelable) {
        if (parcelable == null) {
            throw new IllegalArgumentException("superState must not be null");
        }
        this.kg = parcelable == fxn ? null : parcelable;
    }

    protected fxn(Parcel parcel, ClassLoader classLoader) {
        Parcelable readParcelable = parcel.readParcelable(classLoader);
        this.kg = readParcelable == null ? fxn : readParcelable;
    }

    public final Parcelable fxn() {
        return this.kg;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.kg, i);
    }
}
