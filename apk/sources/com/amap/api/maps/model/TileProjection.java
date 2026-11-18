package com.amap.api.maps.model;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes7.dex */
public class TileProjection implements Parcelable {
    public static final TileProjection CREATOR = new TileProjection(0, 0, 0, 0, 0, 0);
    public final int maxX;
    public final int maxY;
    public final int minX;
    public final int minY;
    public final int offsetX;
    public final int offsetY;

    public TileProjection(int r1, int r2, int r3, int r4, int r5, int r6) {
        this.offsetX = r1;
        this.offsetY = r2;
        this.minX = r3;
        this.maxX = r4;
        this.minY = r5;
        this.maxY = r6;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int r2) {
        parcel.writeInt(this.offsetX);
        parcel.writeInt(this.offsetY);
        parcel.writeInt(this.minX);
        parcel.writeInt(this.maxX);
        parcel.writeInt(this.minY);
        parcel.writeInt(this.maxY);
    }
}
