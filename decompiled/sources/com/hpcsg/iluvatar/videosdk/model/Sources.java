package com.hpcsg.iluvatar.videosdk.model;

import java.util.ArrayList;
import java.util.List;

/* loaded from: classes12.dex */
public class Sources {
    private List<MediaItem> pictures = new ArrayList();
    private List<MediaItem> videos = new ArrayList();
    private List<MediaItem> musics = new ArrayList();

    public List<MediaItem> getPictures() {
        return this.pictures;
    }

    public void setPictures(List<MediaItem> list) {
        this.pictures = list;
    }

    public List<MediaItem> getVideos() {
        return this.videos;
    }

    public void setVideos(List<MediaItem> list) {
        this.videos = list;
    }

    public List<MediaItem> getMusics() {
        return this.musics;
    }

    public void setMusics(List<MediaItem> list) {
        this.musics = list;
    }

    public Sources addPicture(String str) {
        this.pictures.add(new MediaItem(str));
        return this;
    }

    public Sources addVideo(String str) {
        this.videos.add(new MediaItem(str));
        return this;
    }

    public Sources addMusic(String str) {
        this.musics.add(new MediaItem(str));
        return this;
    }
}
