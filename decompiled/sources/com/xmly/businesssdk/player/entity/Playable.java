package com.xmly.businesssdk.player.entity;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;

/* loaded from: classes3.dex */
public class Playable implements Parcelable, Serializable {
    public static final Parcelable.Creator<Playable> CREATOR = new Parcelable.Creator<Playable>() { // from class: com.xmly.businesssdk.player.entity.Playable.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Playable createFromParcel(Parcel parcel) {
            Playable playable = new Playable();
            playable.readFromParcel(parcel);
            return playable;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public Playable[] newArray(int i) {
            return new Playable[i];
        }
    };
    public static final String DTYPE_PREFIX = "__DTYPE__";
    public static final String INVALID_ALBUM_ID = "-1";
    public static final int TYPE_LOCAL = 8192;
    public static final int TYPE_NORMAL = 0;
    public static final int TYPE_PAY = 4096;
    public static final int TYPE_PAY_NOT = 4097;
    public static final int TYPE_PAY_TRY = 4098;
    public static final int TYPE_PAY_VIP = 4100;
    private String albumImgUrl;
    private String albumTitle;
    private String artist;
    private Bundle bundle;
    private int duration;

    /* renamed from: id, reason: collision with root package name */
    private String f14845id;
    private String imgUrl;
    private int orderNum;
    private int pay_type;
    private long playCount;
    private int size;
    private String title;
    private String url;
    private int type = 0;
    private String albumId = "-1";

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String getAlbumId() {
        return this.albumId;
    }

    public String getAlbumImgUrl() {
        return this.albumImgUrl;
    }

    public String getAlbumTitle() {
        return this.albumTitle;
    }

    public String getArtist() {
        return this.artist;
    }

    public int getDuration() {
        return this.duration;
    }

    public boolean getExtraBoolean(String str) {
        Bundle bundle = this.bundle;
        if (bundle == null) {
            return false;
        }
        return bundle.getBoolean(str, false);
    }

    @Deprecated
    public Bundle getExtraBundle() {
        if (this.bundle == null) {
            this.bundle = new Bundle();
        }
        return this.bundle;
    }

    public int getExtraInt(String str) {
        Bundle bundle = this.bundle;
        if (bundle == null) {
            return 0;
        }
        return bundle.getInt(str, 0);
    }

    public long getExtraLong(String str) {
        Bundle bundle = this.bundle;
        if (bundle == null) {
            return 0L;
        }
        return bundle.getLong(str, 0L);
    }

    public String getExtraString(String str) {
        Bundle bundle = this.bundle;
        if (bundle == null) {
            return null;
        }
        return bundle.getString(str);
    }

    public String getId() {
        return this.f14845id;
    }

    public String getImgUrl() {
        return this.imgUrl;
    }

    public int getOrderNum() {
        return this.orderNum;
    }

    public int getPayType() {
        return this.pay_type;
    }

    public long getPlayCount() {
        return this.playCount;
    }

    public int getSize() {
        return this.size;
    }

    public String getTitle() {
        return this.title;
    }

    public int getType() {
        return this.type;
    }

    public String getUrl() {
        return this.url;
    }

    public boolean invalidAlbum() {
        String str = this.albumId;
        return str == null || str.length() == 0 || this.albumId.equals("-1");
    }

    public void putExtraBoolean(String str, boolean z) {
        if (this.bundle == null) {
            this.bundle = new Bundle();
        }
        this.bundle.putBoolean(str, z);
        this.bundle.putString(DTYPE_PREFIX + str, "boolean");
    }

    public void putExtraInt(String str, int i) {
        if (this.bundle == null) {
            this.bundle = new Bundle();
        }
        this.bundle.putInt(str, i);
        this.bundle.putString(DTYPE_PREFIX + str, "int");
    }

    public void putExtraLong(String str, long j) {
        if (this.bundle == null) {
            this.bundle = new Bundle();
        }
        this.bundle.putLong(str, j);
        this.bundle.putString(DTYPE_PREFIX + str, "long");
    }

    public void putExtraString(String str, String str2) {
        if (this.bundle == null) {
            this.bundle = new Bundle();
        }
        this.bundle.putString(str, str2);
    }

    public void readFromParcel(Parcel parcel) {
        this.f14845id = parcel.readString();
        this.title = parcel.readString();
        this.artist = parcel.readString();
        this.url = parcel.readString();
        this.imgUrl = parcel.readString();
        this.duration = parcel.readInt();
        this.playCount = parcel.readLong();
        this.size = parcel.readInt();
        this.type = parcel.readInt();
        this.orderNum = parcel.readInt();
        this.albumId = parcel.readString();
        this.albumTitle = parcel.readString();
        this.albumImgUrl = parcel.readString();
        this.pay_type = parcel.readInt();
        this.bundle = parcel.readBundle();
    }

    public void setAlbumId(String str) {
        this.albumId = str;
    }

    public void setAlbumImgUrl(String str) {
        this.albumImgUrl = str;
    }

    public void setAlbumTitle(String str) {
        this.albumTitle = str;
    }

    public void setArtist(String str) {
        this.artist = str;
    }

    public void setDuration(int i) {
        this.duration = i;
    }

    public void setId(String str) {
        this.f14845id = str;
    }

    public void setImgUrl(String str) {
        this.imgUrl = str;
    }

    public void setOrderNum(int i) {
        this.orderNum = i;
    }

    public void setPayType(int i) {
        this.pay_type = i;
    }

    public void setPlayCount(long j) {
        this.playCount = j;
    }

    public void setSize(int i) {
        this.size = i;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setUrl(String str) {
        this.url = str;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.f14845id);
        parcel.writeString(this.title);
        parcel.writeString(this.artist);
        parcel.writeString(this.url);
        parcel.writeString(this.imgUrl);
        parcel.writeInt(this.duration);
        parcel.writeLong(this.playCount);
        parcel.writeInt(this.size);
        parcel.writeInt(this.type);
        parcel.writeInt(this.orderNum);
        parcel.writeString(this.albumId);
        parcel.writeString(this.albumTitle);
        parcel.writeString(this.albumImgUrl);
        parcel.writeInt(this.pay_type);
        parcel.writeBundle(this.bundle);
    }
}
