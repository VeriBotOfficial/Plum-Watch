package com.sifli.siflidfu;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes15.dex */
public class DFUImagePath implements Parcelable {
    public static final Parcelable.Creator<DFUImagePath> CREATOR = new Parcelable.Creator<DFUImagePath>() { // from class: com.sifli.siflidfu.DFUImagePath.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DFUImagePath createFromParcel(Parcel parcel) {
            return new DFUImagePath(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public DFUImagePath[] newArray(int i) {
            return new DFUImagePath[i];
        }
    };
    private String imagePath;
    private int imageType;
    private Uri imageUri;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public DFUImagePath(String str, Uri uri, int i) {
        this.imagePath = str;
        this.imageUri = uri;
        this.imageType = i;
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
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.imagePath);
        parcel.writeParcelable(this.imageUri, i);
        parcel.writeInt(this.imageType);
    }
}
