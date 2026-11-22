package com.xmly.businesssdk.network.bean.track;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes2.dex */
public class PlayBean implements Parcelable {
    public static final Parcelable.Creator<PlayBean> CREATOR = new Parcelable.Creator<PlayBean>() { // from class: com.xmly.businesssdk.network.bean.track.PlayBean.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PlayBean createFromParcel(Parcel parcel) {
            PlayBean playBean = new PlayBean();
            playBean.readFromParcel(parcel);
            return playBean;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PlayBean[] newArray(int i) {
            return new PlayBean[i];
        }
    };
    private int size;
    private String url;

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getSize() {
        return this.size;
    }

    public String getUrl() {
        return this.url;
    }

    public void readFromParcel(Parcel parcel) {
        this.size = parcel.readInt();
        this.url = parcel.readString();
    }

    public void setSize(int i) {
        this.size = i;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.size);
        parcel.writeString(this.url);
    }
}
