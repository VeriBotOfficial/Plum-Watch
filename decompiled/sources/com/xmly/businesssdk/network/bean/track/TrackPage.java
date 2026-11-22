package com.xmly.businesssdk.network.bean.track;

import com.autonavi.aps.amapapi.config.Const;
import com.google.gson.annotations.SerializedName;
import com.xmly.businesssdk.network.bean.album.Album;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public class TrackPage {

    @SerializedName("album")
    private Album album;

    @SerializedName(Const.SP_KEY_CALL_LOC_COUNT)
    private int count;

    @SerializedName("current_page")
    private int currentPage;

    @SerializedName("tracks")
    private List<Track> tracks;

    public Album getAlbum() {
        return this.album;
    }

    public long getAlbumId() {
        Album album = this.album;
        if (album != null) {
            return album.getAlbumId();
        }
        return 0L;
    }

    public String getAlbumIntro() {
        Album album = this.album;
        return album != null ? album.getIntro() : "";
    }

    public String getAlbumTitle() {
        Album album = this.album;
        return album != null ? album.getTitle() : "";
    }

    public int getCount() {
        return this.count;
    }

    public int getCurrentPage() {
        return this.currentPage;
    }

    public long getPlayCount() {
        Album album = this.album;
        if (album != null) {
            return album.getPlayCount();
        }
        return 0L;
    }

    public int getTotalCount() {
        return this.count;
    }

    public int getTotalPage() {
        int i = this.count;
        if (i <= 0) {
            return 0;
        }
        return (int) Math.ceil(i / (this.tracks != null ? r2.size() : 10));
    }

    public String getTrackIds() {
        List<Track> list = this.tracks;
        if (list == null || list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        Iterator<Track> it = this.tracks.iterator();
        while (it.hasNext()) {
            sb.append(it.next().getDataId()).append(",");
        }
        return sb.substring(0, sb.length() - 1);
    }

    public List<Track> getTracks() {
        return this.tracks;
    }

    public String getValidCover() {
        Album album = this.album;
        return album != null ? album.getValidCover() : "";
    }

    public void setAlbum(Album album) {
        this.album = album;
    }

    public void setCount(int i) {
        this.count = i;
    }

    public void setCurrentPage(int i) {
        this.currentPage = i;
    }

    public void setTracks(List<Track> list) {
        this.tracks = list;
    }
}
