package com.xmly.businesssdk.network.bean.album;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.google.gson.annotations.SerializedName;
import com.tencent.open.SocialConstants;
import com.xmly.businesssdk.network.bean.Announcer;
import java.io.Serializable;

/* loaded from: classes2.dex */
public class Album implements Parcelable, Serializable {
    public static final Parcelable.Creator<Album> CREATOR = new Parcelable.Creator<Album>() { // from class: com.xmly.businesssdk.network.bean.album.Album.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Album createFromParcel(Parcel parcel) {
            return new Album(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Album[] newArray(int i) {
            return new Album[i];
        }
    };
    private static final long serialVersionUID = -7113438676852091800L;

    @SerializedName("album_id")
    private long albumId;

    @SerializedName("announcer")
    private Announcer announcer;

    @SerializedName("composed_price_type")
    private int composedPriceType;

    /* renamed from: id, reason: collision with root package name */
    @SerializedName("id")
    private long f14840id;

    @SerializedName(SocialConstants.PARAM_IMG_URL)
    private String img;

    @SerializedName("intro")
    private String intro;

    @SerializedName("is_authorized")
    private boolean isAuthorized;

    @SerializedName("is_finished")
    private int isFinished;

    @SerializedName("is_subscribe")
    private boolean isSubscribe;

    @SerializedName("main_source_id")
    private long mainSourceId;

    @SerializedName("pay_info")
    private PayInfo payInfo;

    @SerializedName("pay_type")
    private Integer payType;

    @SerializedName("play_count")
    private long playCount;

    @SerializedName("quality_score")
    private String qualityScore;

    @SerializedName("source_type")
    private int sourceType;

    @SerializedName("subscribe_count")
    private long subscribeCount;

    @SerializedName("title")
    private String title;

    @SerializedName("track_count")
    private int trackCount;

    public Album() {
    }

    public Album(Parcel parcel) {
        this.f14840id = parcel.readLong();
        this.albumId = parcel.readLong();
        this.sourceType = parcel.readInt();
        this.title = parcel.readString();
        this.payType = (Integer) parcel.readValue(Integer.class.getClassLoader());
        this.composedPriceType = parcel.readInt();
        this.trackCount = parcel.readInt();
        this.playCount = parcel.readLong();
        this.subscribeCount = parcel.readLong();
        this.qualityScore = parcel.readString();
        this.mainSourceId = parcel.readLong();
        this.img = parcel.readString();
        this.isFinished = parcel.readInt();
        this.intro = parcel.readString();
        this.announcer = (Announcer) parcel.readParcelable(Announcer.class.getClassLoader());
        this.isSubscribe = parcel.readByte() != 0;
        this.isAuthorized = parcel.readByte() != 0;
        this.payInfo = (PayInfo) parcel.readParcelable(PayInfo.class.getClassLoader());
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long getAlbumId() {
        return this.albumId;
    }

    public String getAlbumIntro() {
        return this.intro;
    }

    public String getAlbumTitle() {
        return this.title;
    }

    public Announcer getAnnouncer() {
        return this.announcer;
    }

    public int getComposedPriceType() {
        return this.composedPriceType;
    }

    public String getImg() {
        return this.img;
    }

    public long getIncludeTrackCount() {
        return this.trackCount;
    }

    public String getIntro() {
        return this.intro;
    }

    public int getIsFinished() {
        return this.isFinished;
    }

    public long getMainSourceId() {
        return this.mainSourceId;
    }

    public PayInfo getPayInfo() {
        return this.payInfo;
    }

    public Integer getPayType() {
        return this.payType;
    }

    public long getPlayCount() {
        return this.playCount;
    }

    public String getQualityScore() {
        return this.qualityScore;
    }

    public int getSourceType() {
        return this.sourceType;
    }

    public long getSubscribeCount() {
        return this.subscribeCount;
    }

    public String getTitle() {
        return this.title;
    }

    public int getTrackCount() {
        return this.trackCount;
    }

    public String getValidCover() {
        return !TextUtils.isEmpty(this.img) ? this.img : "";
    }

    public boolean isAuthorized() {
        return this.isAuthorized;
    }

    public boolean isFreeAlbum() {
        Integer num = this.payType;
        return num != null && num.intValue() == 0;
    }

    public boolean isPaid() {
        Integer num = this.payType;
        if (num != null) {
            return num.intValue() == 4 || this.payType.intValue() == 2;
        }
        return false;
    }

    public boolean isSubscribe() {
        return this.isSubscribe;
    }

    public boolean isVipAlbum() {
        return isVipFree() || isVipExclusive();
    }

    public boolean isVipExclusive() {
        Integer num = this.payType;
        return num != null && num.intValue() == 1;
    }

    public boolean isVipFree() {
        Integer num = this.payType;
        return num != null && num.intValue() == 2;
    }

    public void setAlbumId(long j) {
        this.albumId = j;
    }

    public void setAlbumIntro(String str) {
        this.intro = str;
    }

    public void setAlbumTitle(String str) {
        this.title = str;
    }

    public void setAnnouncer(Announcer announcer) {
        this.announcer = announcer;
    }

    public void setAuthorized(boolean z) {
        this.isAuthorized = z;
    }

    public void setComposedPriceType(int i) {
        this.composedPriceType = i;
    }

    public void setId(long j) {
        this.f14840id = j;
    }

    public void setImg(String str) {
        this.img = str;
    }

    public void setIntro(String str) {
        this.intro = str;
    }

    public void setIsFinished(int i) {
        this.isFinished = i;
    }

    public void setMainSourceId(long j) {
        this.mainSourceId = j;
    }

    public void setPayInfo(PayInfo payInfo) {
        this.payInfo = payInfo;
    }

    public void setPayType(Integer num) {
        this.payType = num;
    }

    public void setPlayCount(long j) {
        this.playCount = j;
    }

    public void setQualityScore(String str) {
        this.qualityScore = str;
    }

    public void setSourceType(int i) {
        this.sourceType = i;
    }

    public void setSubscribe(boolean z) {
        this.isSubscribe = z;
    }

    public void setSubscribeCount(long j) {
        this.subscribeCount = j;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setTrackCount(int i) {
        this.trackCount = i;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeLong(this.f14840id);
        parcel.writeLong(this.albumId);
        parcel.writeInt(this.sourceType);
        parcel.writeString(this.title);
        parcel.writeValue(this.payType);
        parcel.writeInt(this.composedPriceType);
        parcel.writeInt(this.trackCount);
        parcel.writeLong(this.playCount);
        parcel.writeLong(this.subscribeCount);
        parcel.writeString(this.qualityScore);
        parcel.writeLong(this.mainSourceId);
        parcel.writeString(this.img);
        parcel.writeInt(this.isFinished);
        parcel.writeString(this.intro);
        parcel.writeParcelable(this.announcer, i);
        parcel.writeByte(this.isSubscribe ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.isAuthorized ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.payInfo, i);
    }
}
