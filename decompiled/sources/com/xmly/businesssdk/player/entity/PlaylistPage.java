package com.xmly.businesssdk.player.entity;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: classes3.dex */
public class PlaylistPage implements Parcelable {
    public static final Parcelable.Creator<PlaylistPage> CREATOR = new Parcelable.Creator<PlaylistPage>() { // from class: com.xmly.businesssdk.player.entity.PlaylistPage.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PlaylistPage createFromParcel(Parcel parcel) {
            PlaylistPage playlistPage = new PlaylistPage();
            playlistPage.readFromParcel(parcel);
            return playlistPage;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PlaylistPage[] newArray(int i) {
            return new PlaylistPage[i];
        }
    };
    public static final int PAGE_SIZE = 20;
    private int endPageIndex;
    private String extraText;
    private String pageId;
    private int pageSize;
    private int playlistType;
    private int startPageIndex;
    private int totalCount;
    private int totalPage;

    public PlaylistPage() {
        this.totalCount = 0;
        this.totalPage = 0;
        this.startPageIndex = 0;
        this.endPageIndex = 0;
        this.pageSize = 20;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getEndPageIndex() {
        return this.endPageIndex;
    }

    public String getExtraText() {
        return this.extraText;
    }

    public int getPageSize() {
        return this.pageSize;
    }

    public int getPlaylistType() {
        return this.playlistType;
    }

    public String getPlaylistValue() {
        return this.pageId;
    }

    public int getStartPageIndex() {
        return this.startPageIndex;
    }

    public int getTotalCount() {
        return this.totalCount;
    }

    public int getTotalPage() {
        return this.totalPage;
    }

    public void readFromParcel(Parcel parcel) {
        this.totalCount = parcel.readInt();
        this.totalPage = parcel.readInt();
        this.startPageIndex = parcel.readInt();
        this.endPageIndex = parcel.readInt();
        this.pageSize = parcel.readInt();
        this.playlistType = parcel.readInt();
        this.pageId = parcel.readString();
        this.extraText = parcel.readString();
    }

    public PlaylistPage setEndPageIndex(int i) {
        this.endPageIndex = i;
        return this;
    }

    public PlaylistPage setExtraText(String str) {
        this.extraText = str;
        return this;
    }

    public PlaylistPage setPageId(int i, String str) {
        this.playlistType = i;
        this.pageId = str;
        return this;
    }

    public PlaylistPage setPageSize(int i) {
        this.pageSize = i;
        return this;
    }

    public PlaylistPage setStartPageIndex(int i) {
        this.startPageIndex = i;
        return this;
    }

    public PlaylistPage setTotalCount(int i) {
        this.totalCount = i;
        return this;
    }

    public PlaylistPage setTotalPage(int i) {
        this.totalPage = i;
        return this;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.totalCount);
        parcel.writeInt(this.totalPage);
        parcel.writeInt(this.startPageIndex);
        parcel.writeInt(this.endPageIndex);
        parcel.writeInt(this.pageSize);
        parcel.writeInt(this.playlistType);
        parcel.writeString(this.pageId);
        parcel.writeString(this.extraText);
    }

    public PlaylistPage(int i, int i2) {
        this.pageSize = 20;
        this.totalCount = i;
        this.totalPage = i2;
        this.startPageIndex = 1;
        this.endPageIndex = 1;
    }
}
