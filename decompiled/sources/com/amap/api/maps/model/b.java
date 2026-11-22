package com.amap.api.maps.model;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: TileCreator.java */
/* loaded from: classes11.dex */
class b implements Parcelable.Creator<Tile> {
    b() {
    }

    @Override // android.os.Parcelable.Creator
    public Tile createFromParcel(Parcel parcel) {
        return new Tile(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.createByteArray(), parcel.readInt() == 1);
    }

    @Override // android.os.Parcelable.Creator
    public Tile[] newArray(int i) {
        return new Tile[i];
    }
}
