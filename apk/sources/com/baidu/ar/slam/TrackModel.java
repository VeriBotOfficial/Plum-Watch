package com.baidu.ar.slam;

import android.os.Parcel;
import android.os.Parcelable;

/* JADX INFO: loaded from: classes16.dex */
public class TrackModel implements Parcelable {
    public static final Parcelable.Creator<TrackModel> CREATOR = new a();

    /* JADX INFO: renamed from: id, reason: collision with root package name */
    public String f7197id;
    public float[] pose;

    public class a implements Parcelable.Creator {
        @Override // android.os.Parcelable.Creator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public TrackModel[] newArray(int r1) {
            return new TrackModel[r1];
        }

        @Override // android.os.Parcelable.Creator
        public Object createFromParcel(Parcel parcel) {
            TrackModel trackModel = new TrackModel();
            trackModel.setId(parcel.readString());
            trackModel.setPose(parcel.createFloatArray());
            return trackModel;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getId() {
        return this.f7197id;
    }

    public float[] getPose() {
        return this.pose;
    }

    public void setId(String str) {
        this.f7197id = str;
    }

    public void setPose(float[] fArr) {
        this.pose = fArr;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int r2) {
        parcel.writeString(this.f7197id);
        parcel.writeFloatArray(this.pose);
    }
}
