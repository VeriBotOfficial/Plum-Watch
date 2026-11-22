package com.xmly.businesssdk.network.bean.track;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.tencent.open.SocialConstants;
import com.xmly.businesssdk.c;
import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes2.dex */
public class Track implements Parcelable, Serializable {
    public static final Parcelable.Creator<Track> CREATOR = new Parcelable.Creator<Track>() { // from class: com.xmly.businesssdk.network.bean.track.Track.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Track createFromParcel(Parcel parcel) {
            return new Track(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Track[] newArray(int i) {
            return new Track[i];
        }
    };
    private static final long serialVersionUID = -4475777123600707295L;

    @SerializedName("album_id")
    private long albumId;

    @SerializedName("duration")
    private int duration;

    /* renamed from: id, reason: collision with root package name */
    @SerializedName("id")
    private Long f14844id;

    @SerializedName(SocialConstants.PARAM_IMG_URL)
    private String img;

    @SerializedName("is_authorized")
    private boolean isAuthorized;

    @SerializedName("main_source_id")
    private long mainSourceId;

    @SerializedName("pay_type")
    private int payType;

    @SerializedName("play_count")
    private long playCount;

    @SerializedName("play_size")
    private long playSize;

    @SerializedName("source_type")
    private int sourceType;

    @SerializedName("title")
    private String title;

    @SerializedName("track_id")
    private long trackId;

    public Track() {
    }

    public Track(Parcel parcel) {
        if (parcel.readByte() == 0) {
            this.f14844id = null;
        } else {
            this.f14844id = Long.valueOf(parcel.readLong());
        }
        this.trackId = parcel.readLong();
        this.albumId = parcel.readLong();
        this.sourceType = parcel.readInt();
        this.title = parcel.readString();
        this.img = parcel.readString();
        this.payType = parcel.readInt();
        this.duration = parcel.readInt();
        this.playCount = parcel.readLong();
        this.playSize = parcel.readLong();
        this.mainSourceId = parcel.readLong();
        this.isAuthorized = parcel.readByte() != 0;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        return obj instanceof Track ? this.trackId == ((Track) obj).trackId : super.equals(obj);
    }

    public long getAlbumId() {
        return this.albumId;
    }

    public long getDataId() {
        return this.trackId;
    }

    public int getDuration() {
        return this.duration;
    }

    public String getImg() {
        return this.img;
    }

    public long getMainSourceId() {
        return this.mainSourceId;
    }

    public int getPayType() {
        return this.payType;
    }

    public long getPlayCount() {
        return this.playCount;
    }

    public long getPlaySize() {
        return this.playSize;
    }

    public int getSourceType() {
        return this.sourceType;
    }

    public String getTitle() {
        return this.title;
    }

    public long getTrackId() {
        return this.trackId;
    }

    public String getTrackTitle() {
        return this.title;
    }

    public String getValidCover() {
        return !TextUtils.isEmpty(this.img) ? this.img : "";
    }

    public long getValidPlaySize() {
        return this.playSize;
    }

    public boolean isAuthorized() {
        return this.isAuthorized;
    }

    public void setAlbumId(long j) {
        this.albumId = j;
    }

    public void setAuthorized(boolean z) {
        this.isAuthorized = z;
    }

    public void setDuration(int i) {
        this.duration = i;
    }

    public void setId(Long l) {
        this.f14844id = l;
    }

    public void setImg(String str) {
        this.img = str;
    }

    public void setMainSourceId(long j) {
        this.mainSourceId = j;
    }

    public void setPayType(int i) {
        this.payType = i;
    }

    public void setPlayCount(long j) {
        this.playCount = j;
    }

    public void setPlaySize(long j) {
        this.playSize = j;
    }

    public void setSourceType(int i) {
        this.sourceType = i;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTrackId(long j) {
        this.trackId = j;
    }

    public String toString() {
        return c.a("Track{id=").append(this.f14844id).append(", trackId=").append(this.trackId).append(", title='").append(this.title).append('\'').append(", albumId=").append(this.albumId).append(", playSize=").append(this.playSize).append(", payType=").append(this.payType).append(", isAuthorized=").append(this.isAuthorized).append(AbstractJsonLexerKt.END_OBJ).toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        if (this.f14844id == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeLong(this.f14844id.longValue());
        }
        parcel.writeLong(this.trackId);
        parcel.writeLong(this.albumId);
        parcel.writeInt(this.sourceType);
        parcel.writeString(this.title);
        parcel.writeString(this.img);
        parcel.writeInt(this.payType);
        parcel.writeInt(this.duration);
        parcel.writeLong(this.playCount);
        parcel.writeLong(this.playSize);
        parcel.writeLong(this.mainSourceId);
        parcel.writeByte(this.isAuthorized ? (byte) 1 : (byte) 0);
    }
}
