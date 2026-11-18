package com.amap.api.services.route;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public class DistanceItem implements Parcelable {
    public static final Parcelable.Creator<DistanceItem> CREATOR = new a();
    public final int ERROR_CODE_NOT_IN_CHINA;
    public final int ERROR_CODE_NO_DRIVE;
    public final int ERROR_CODE_TOO_FAR;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f2156a;
    private int b;
    private float c;
    private float d;
    private String e;
    private int f;

    static class a implements Parcelable.Creator<DistanceItem> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public DistanceItem createFromParcel(Parcel parcel) {
            return new DistanceItem(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public DistanceItem[] newArray(int r1) {
            return new DistanceItem[r1];
        }
    }

    public DistanceItem() {
        this.ERROR_CODE_NO_DRIVE = 1;
        this.ERROR_CODE_TOO_FAR = 2;
        this.ERROR_CODE_NOT_IN_CHINA = 3;
        this.f2156a = 1;
        this.b = 1;
        this.c = 0.0f;
        this.d = 0.0f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getDestId() {
        return this.b;
    }

    public float getDistance() {
        return this.c;
    }

    public float getDuration() {
        return this.d;
    }

    public int getErrorCode() {
        return this.f;
    }

    public String getErrorInfo() {
        return this.e;
    }

    public int getOriginId() {
        return this.f2156a;
    }

    public void setDestId(int r1) {
        this.b = r1;
    }

    public void setDistance(float f) {
        this.c = f;
    }

    public void setDuration(float f) {
        this.d = f;
    }

    public void setErrorCode(int r1) {
        this.f = r1;
    }

    public void setErrorInfo(String str) {
        this.e = str;
    }

    public void setOriginId(int r1) {
        this.f2156a = r1;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int r2) {
        parcel.writeInt(this.f2156a);
        parcel.writeInt(this.b);
        parcel.writeFloat(this.c);
        parcel.writeFloat(this.d);
        parcel.writeString(this.e);
        parcel.writeInt(this.f);
    }

    protected DistanceItem(Parcel parcel) {
        this.ERROR_CODE_NO_DRIVE = 1;
        this.ERROR_CODE_TOO_FAR = 2;
        this.ERROR_CODE_NOT_IN_CHINA = 3;
        this.f2156a = 1;
        this.b = 1;
        this.c = 0.0f;
        this.d = 0.0f;
        this.f2156a = parcel.readInt();
        this.b = parcel.readInt();
        this.c = parcel.readFloat();
        this.d = parcel.readFloat();
        this.e = parcel.readString();
        this.f = parcel.readInt();
    }
}
