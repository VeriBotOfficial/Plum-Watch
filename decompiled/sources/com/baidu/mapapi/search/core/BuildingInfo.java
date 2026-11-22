package com.baidu.mapapi.search.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.baidu.mapapi.model.LatLng;

/* loaded from: classes13.dex */
public class BuildingInfo implements Parcelable {
    public static final Parcelable.Creator<BuildingInfo> CREATOR = new a();
    private int accuracy;
    private LatLng center;
    private String geom;
    private float height;
    private int label;
    private String structId;

    static class a implements Parcelable.Creator<BuildingInfo> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public BuildingInfo createFromParcel(Parcel parcel) {
            return new BuildingInfo(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public BuildingInfo[] newArray(int i) {
            return new BuildingInfo[i];
        }
    }

    public BuildingInfo() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getAccuracy() {
        return this.accuracy;
    }

    public LatLng getCenter() {
        return this.center;
    }

    public String getGeom() {
        return this.geom;
    }

    public float getHeight() {
        return this.height;
    }

    public int getLabel() {
        return this.label;
    }

    public String getStructID() {
        return this.structId;
    }

    public void setAccuracy(int i) {
        this.accuracy = i;
    }

    public void setCenter(LatLng latLng) {
        this.center = latLng;
    }

    public void setGeom(String str) {
        this.geom = str;
    }

    public void setHeight(float f) {
        this.height = f;
    }

    public void setLabel(int i) {
        this.label = i;
    }

    public void setStructID(String str) {
        this.structId = str;
    }

    public String toString() {
        StringBuffer stringBuffer = new StringBuffer("BuidingInfo: \n; height = ");
        stringBuffer.append(this.height);
        stringBuffer.append("; accuracy = ").append(this.accuracy);
        stringBuffer.append("; geom = ").append(this.geom);
        stringBuffer.append("; center = ").append(this.center);
        return stringBuffer.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.height);
        parcel.writeInt(this.accuracy);
        parcel.writeString(this.geom);
        parcel.writeValue(this.center);
    }

    protected BuildingInfo(Parcel parcel) {
        this.height = parcel.readFloat();
        this.accuracy = parcel.readInt();
        this.geom = parcel.readString();
        this.center = (LatLng) parcel.readValue(LatLng.class.getClassLoader());
    }
}
