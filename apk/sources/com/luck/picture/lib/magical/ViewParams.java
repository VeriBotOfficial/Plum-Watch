package com.luck.picture.lib.magical;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes2.dex */
public class ViewParams implements Parcelable {
    public static final Parcelable.Creator<ViewParams> CREATOR = new Parcelable.Creator<ViewParams>() { // from class: com.luck.picture.lib.magical.ViewParams.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ViewParams createFromParcel(Parcel parcel) {
            return new ViewParams(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public ViewParams[] newArray(int r1) {
            return new ViewParams[r1];
        }
    };
    public int height;
    public int left;

    /* JADX INFO: renamed from: top, reason: collision with root package name */
    public int f11247top;
    public int width;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getLeft() {
        return this.left;
    }

    public void setLeft(int r1) {
        this.left = r1;
    }

    public int getTop() {
        return this.f11247top;
    }

    public void setTop(int r1) {
        this.f11247top = r1;
    }

    public int getWidth() {
        return this.width;
    }

    public void setWidth(int r1) {
        this.width = r1;
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int r1) {
        this.height = r1;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int r2) {
        parcel.writeInt(this.left);
        parcel.writeInt(this.f11247top);
        parcel.writeInt(this.width);
        parcel.writeInt(this.height);
    }

    public ViewParams() {
    }

    protected ViewParams(Parcel parcel) {
        this.left = parcel.readInt();
        this.f11247top = parcel.readInt();
        this.width = parcel.readInt();
        this.height = parcel.readInt();
    }
}
