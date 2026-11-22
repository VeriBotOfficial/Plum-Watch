package com.baidu.ar.marker.model;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes12.dex */
public class LocationMarkerData implements Parcelable {
    public static final Parcelable.Creator<LocationMarkerData> CREATOR = new a();
    public float accuracy;
    public String buildingId;
    public float confidence;
    public String floorId;
    public int frameId;
    public double[] locationPoints;
    public String mapTag;
    public int position;
    public String session;
    public String timeStamp;

    public class a implements Parcelable.Creator<LocationMarkerData> {
        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public LocationMarkerData createFromParcel(Parcel parcel) {
            return new LocationMarkerData(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public LocationMarkerData[] newArray(int i) {
            return new LocationMarkerData[i];
        }
    }

    public LocationMarkerData(Parcel parcel) {
        this.mapTag = parcel.readString();
        this.buildingId = parcel.readString();
        this.floorId = parcel.readString();
        this.locationPoints = parcel.createDoubleArray();
        this.timeStamp = parcel.readString();
        this.accuracy = parcel.readFloat();
        this.confidence = parcel.readFloat();
        this.frameId = parcel.readInt();
        this.position = parcel.readInt();
        this.session = parcel.readString();
    }

    public LocationMarkerData(String str, String str2, String str3, String str4, double d, double d2, float f, float f2, int i, int i2, String str5) {
        this.mapTag = str2;
        this.buildingId = str3;
        this.floorId = str4;
        this.locationPoints = new double[]{d, d2};
        this.timeStamp = str;
        this.accuracy = f;
        this.confidence = f2;
        this.frameId = i;
        this.position = i2;
        this.session = str5;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.mapTag);
        parcel.writeString(this.buildingId);
        parcel.writeString(this.floorId);
        parcel.writeDoubleArray(this.locationPoints);
        parcel.writeString(this.timeStamp);
        parcel.writeFloat(this.accuracy);
        parcel.writeFloat(this.confidence);
        parcel.writeInt(this.frameId);
        parcel.writeInt(this.position);
        parcel.writeString(this.session);
    }
}
