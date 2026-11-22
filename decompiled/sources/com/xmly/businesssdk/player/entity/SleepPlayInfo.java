package com.xmly.businesssdk.player.entity;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public class SleepPlayInfo implements Parcelable {
    public static final Parcelable.Creator<SleepPlayInfo> CREATOR = new Parcelable.Creator<SleepPlayInfo>() { // from class: com.xmly.businesssdk.player.entity.SleepPlayInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SleepPlayInfo createFromParcel(Parcel parcel) {
            return new SleepPlayInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SleepPlayInfo[] newArray(int i) {
            return new SleepPlayInfo[i];
        }
    };
    private String coverUrl;
    private String playUrl;
    private String title;

    public SleepPlayInfo(String str, String str2, String str3) {
        this.title = str;
        this.playUrl = str2;
        this.coverUrl = str3;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getCoverUrl() {
        return this.coverUrl;
    }

    public String getPlayUrl() {
        return this.playUrl;
    }

    public String getTitle() {
        return this.title;
    }

    public void setCoverUrl(String str) {
        this.coverUrl = str;
    }

    public void setPlayUrl(String str) {
        this.playUrl = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.title);
        parcel.writeString(this.playUrl);
        parcel.writeString(this.coverUrl);
    }

    public SleepPlayInfo(Parcel parcel) {
        this.title = parcel.readString();
        this.playUrl = parcel.readString();
        this.coverUrl = parcel.readString();
    }
}
