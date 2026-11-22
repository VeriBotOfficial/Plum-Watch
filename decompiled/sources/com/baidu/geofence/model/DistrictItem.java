package com.baidu.geofence.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes13.dex */
public class DistrictItem implements Parcelable {
    public static final Parcelable.Creator<DistrictItem> CREATOR = new Parcelable.Creator<DistrictItem>() { // from class: com.baidu.geofence.model.DistrictItem.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public DistrictItem createFromParcel(Parcel parcel) {
            return new DistrictItem(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public DistrictItem[] newArray(int i) {
            return new DistrictItem[0];
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private String f7485a;
    private String b;
    private String c;

    private DistrictItem(Parcel parcel) {
        this.f7485a = parcel.readString();
        this.b = parcel.readString();
        this.c = parcel.readString();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f7485a);
        parcel.writeString(this.b);
        parcel.writeString(this.c);
    }
}
