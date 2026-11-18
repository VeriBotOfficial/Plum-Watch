package com.sifli.siflidfu;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes12.dex */
public class DFUImagePath implements Parcelable {
    public static final Parcelable.Creator<DFUImagePath> CREATOR = new Parcelable.Creator<DFUImagePath>() { // from class: com.sifli.siflidfu.DFUImagePath.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DFUImagePath createFromParcel(Parcel parcel) {
            return new DFUImagePath(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DFUImagePath[] newArray(int r1) {
            return new DFUImagePath[r1];
        }
    };
    private String imagePath;
    private int imageType;
    private Uri imageUri;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public DFUImagePath(String str, Uri uri, int r3) {
        this.imagePath = str;
        this.imageUri = uri;
        this.imageType = r3;
    }

    protected DFUImagePath(Parcel parcel) {
        this.imagePath = parcel.readString();
        this.imageUri = (Uri) parcel.readParcelable(Uri.class.getClassLoader());
        this.imageType = parcel.readInt();
    }

    public Uri getImageUri() {
        return this.imageUri;
    }

    public String getImagePath() {
        return this.imagePath;
    }

    public int getImageType() {
        return this.imageType;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int r3) {
        parcel.writeString(this.imagePath);
        parcel.writeParcelable(this.imageUri, r3);
        parcel.writeInt(this.imageType);
    }
}
