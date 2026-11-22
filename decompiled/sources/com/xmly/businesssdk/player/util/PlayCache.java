package com.xmly.businesssdk.player.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import com.xmly.businesssdk.player.entity.Playable;
import com.xmly.businesssdk.player.entity.PlaylistPage;
import com.xmly.businesssdk.utils.GsonHelper;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes3.dex */
public class PlayCache {
    private String albumTag;
    private final SharedPreferences mSharedPreferences;
    private ArrayList<Playable> playableList;
    private PlaylistPage playlistPage;
    private byte type = -1;

    public PlayCache(Context context) {
        this.mSharedPreferences = context.getSharedPreferences("FmxosMusicPlayerHistory.conf", 0);
        getPlayableList();
        getType();
    }

    private ArrayList<Playable> getArrayList(List<Playable> list) {
        if (list == null) {
            return null;
        }
        return list instanceof ArrayList ? (ArrayList) list : new ArrayList<>(list);
    }

    private void saveToCache() {
        this.mSharedPreferences.edit().putString("playlist", GsonHelper.toJson(this.playableList)).putString("playlistPage", GsonHelper.toJson(this.playlistPage)).putString("albumTag", this.albumTag).putInt("type", this.type).apply();
    }

    public void addPlaylist(boolean z, List<Playable> list) {
        if (z) {
            this.playableList.addAll(0, list);
        } else {
            this.playableList.addAll(list);
        }
        saveToCache();
    }

    public String getAlbumTag() {
        String str = this.albumTag;
        if (str != null) {
            return str;
        }
        String string = this.mSharedPreferences.getString("albumTag", null);
        this.albumTag = string;
        return string;
    }

    public ArrayList<Playable> getPlayableList() {
        if (this.playableList == null) {
            String string = this.mSharedPreferences.getString("playlist", null);
            if (TextUtils.isEmpty(string)) {
                return this.playableList;
            }
            this.playableList = getArrayList(GsonHelper.fromJsonArray(string, Playable.class));
        }
        return this.playableList;
    }

    public PlaylistPage getPlaylistPage() {
        if (this.playlistPage == null) {
            String string = this.mSharedPreferences.getString("playlistPage", null);
            if (TextUtils.isEmpty(string)) {
                return this.playlistPage;
            }
            this.playlistPage = (PlaylistPage) GsonHelper.fromJson(string, PlaylistPage.class);
        }
        return this.playlistPage;
    }

    public byte getType() {
        if (this.type == -1) {
            this.type = (byte) this.mSharedPreferences.getInt("type", -1);
        }
        return this.type;
    }

    public void setPlaylist(List<Playable> list, PlaylistPage playlistPage, String str, byte b) {
        this.playableList = getArrayList(list);
        this.playlistPage = playlistPage;
        this.albumTag = str;
        this.type = b;
        saveToCache();
    }

    public void setPlaylist(List<Playable> list) {
        this.playableList = getArrayList(list);
        saveToCache();
    }
}
