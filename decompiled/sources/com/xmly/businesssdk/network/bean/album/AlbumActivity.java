package com.xmly.businesssdk.network.bean.album;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.annotations.SerializedName;
import com.qumeng.overseas.advlib.__remote__.ui.front._imp_inciteadactivity;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class AlbumActivity implements Parcelable, Serializable {
    private static final int ACTIVITY_STATUS_PROCESSING = 1;
    private static final int ACTIVITY_TYPE_PLAY_FREE = 2;
    public static final Parcelable.Creator<AlbumActivity> CREATOR = new Parcelable.Creator<AlbumActivity>() { // from class: com.xmly.businesssdk.network.bean.album.AlbumActivity.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AlbumActivity createFromParcel(Parcel parcel) {
            return new AlbumActivity(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public AlbumActivity[] newArray(int i) {
            return new AlbumActivity[i];
        }
    };
    public static final int ERROR_CODE_ACTIVITY_TIME_EXPIRED = 10000;
    private static final long serialVersionUID = 8380032994118875235L;

    @SerializedName("activity_end")
    private long activityEnd;

    @SerializedName("activity_start")
    private long activityStart;

    @SerializedName("activity_status")
    private int activityStatus;

    @SerializedName(_imp_inciteadactivity.ACTIVITY_TYPE)
    private int activityType;

    public AlbumActivity() {
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getActivityEnd() {
        return this.activityEnd;
    }

    public long getActivityStart() {
        return this.activityStart;
    }

    public int getActivityStatus() {
        return this.activityStatus;
    }

    public int getActivityType() {
        return this.activityType;
    }

    public boolean isActivityEffective() {
        return this.activityStatus == 1 && this.activityType == 2;
    }

    public boolean isActivityTimeExpired() {
        long currentTimeMillis = System.currentTimeMillis();
        return currentTimeMillis < this.activityStart || currentTimeMillis > this.activityEnd;
    }

    public void readFromParcel(Parcel parcel) {
        this.activityType = parcel.readInt();
        this.activityStart = parcel.readLong();
        this.activityEnd = parcel.readLong();
        this.activityStatus = parcel.readInt();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.activityType);
        parcel.writeLong(this.activityStart);
        parcel.writeLong(this.activityEnd);
        parcel.writeInt(this.activityStatus);
    }

    public AlbumActivity(Parcel parcel) {
        this.activityType = parcel.readInt();
        this.activityStart = parcel.readLong();
        this.activityEnd = parcel.readLong();
        this.activityStatus = parcel.readInt();
    }
}
