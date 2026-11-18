package com.amap.api.services.poisearch;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public class IndoorDataV2 implements Parcelable {
    public static final Parcelable.Creator<IndoorDataV2> CREATOR = new a();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f2136a;
    private String b;
    private int c;
    private String d;

    static class a implements Parcelable.Creator<IndoorDataV2> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        public IndoorDataV2 createFromParcel(Parcel parcel) {
            return new IndoorDataV2(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public IndoorDataV2[] newArray(int r1) {
            return new IndoorDataV2[r1];
        }
    }

    public IndoorDataV2(boolean z, String str, int r3, String str2) {
        this.f2136a = z;
        this.b = str;
        this.c = r3;
        this.d = str2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getFloor() {
        return this.c;
    }

    public String getFloorName() {
        return this.d;
    }

    public String getPoiId() {
        return this.b;
    }

    public boolean isIndoorMap() {
        return this.f2136a;
    }

    public void setFloor(int r1) {
        this.c = r1;
    }

    public void setFloorName(String str) {
        this.d = str;
    }

    public void setIndoorMap(boolean z) {
        this.f2136a = z;
    }

    public void setPoiId(String str) {
        this.b = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int r4) {
        parcel.writeBooleanArray(new boolean[]{this.f2136a});
        parcel.writeString(this.b);
        parcel.writeInt(this.c);
        parcel.writeString(this.d);
    }

    protected IndoorDataV2(Parcel parcel) {
        boolean[] zArr = new boolean[1];
        parcel.readBooleanArray(zArr);
        this.f2136a = zArr[0];
        this.b = parcel.readString();
        this.c = parcel.readInt();
        this.d = parcel.readString();
    }
}
