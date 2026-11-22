package com.xmly.businesssdk.network.bean.track;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class PlayInfo implements Parcelable, Serializable {
    public static final Parcelable.Creator<PlayInfo> CREATOR = new Parcelable.Creator<PlayInfo>() { // from class: com.xmly.businesssdk.network.bean.track.PlayInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PlayInfo createFromParcel(Parcel parcel) {
            PlayInfo playInfo = new PlayInfo();
            playInfo.readFromParcel(parcel);
            return playInfo;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PlayInfo[] newArray(int i) {
            return new PlayInfo[i];
        }
    };
    private static final long serialVersionUID = 8360297862053963364L;
    private PlayBean download_url;
    private PlayBean play_24_m4a;
    private PlayBean play_32;
    private PlayBean play_64;
    private PlayBean play_64_m4a;
    private PlayBean play_amr;

    private boolean isEmptyUrl(PlayBean playBean) {
        return playBean == null || playBean.getUrl() == null || playBean.getUrl().isEmpty();
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getValidPlayUrl() {
        return !isEmptyUrl(this.play_64) ? this.play_64.getUrl() : !isEmptyUrl(this.play_32) ? this.play_32.getUrl() : !isEmptyUrl(this.play_64_m4a) ? this.play_64_m4a.getUrl() : !isEmptyUrl(this.play_24_m4a) ? this.play_24_m4a.getUrl() : !isEmptyUrl(this.download_url) ? this.download_url.getUrl() : "";
    }

    public void readFromParcel(Parcel parcel) {
        this.play_64_m4a = (PlayBean) parcel.readParcelable(PlayBean.class.getClassLoader());
        this.download_url = (PlayBean) parcel.readParcelable(PlayBean.class.getClassLoader());
        this.play_24_m4a = (PlayBean) parcel.readParcelable(PlayBean.class.getClassLoader());
        this.play_amr = (PlayBean) parcel.readParcelable(PlayBean.class.getClassLoader());
        this.play_64 = (PlayBean) parcel.readParcelable(PlayBean.class.getClassLoader());
        this.play_32 = (PlayBean) parcel.readParcelable(PlayBean.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeParcelable(this.play_64_m4a, i);
        parcel.writeParcelable(this.download_url, i);
        parcel.writeParcelable(this.play_24_m4a, i);
        parcel.writeParcelable(this.play_amr, i);
        parcel.writeParcelable(this.play_64, i);
        parcel.writeParcelable(this.play_32, i);
    }
}
