package com.xmly.businesssdk.player.core;

import android.os.Parcel;
import android.os.Parcelable;
import com.xmly.businesssdk.player.entity.Playable;
import com.xmly.businesssdk.player.entity.PlaybackMode;

/* loaded from: classes3.dex */
public class PlaybackInfo implements Parcelable {
    public static final Parcelable.Creator<PlaybackInfo> CREATOR = new Parcelable.Creator<PlaybackInfo>() { // from class: com.xmly.businesssdk.player.core.PlaybackInfo.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PlaybackInfo createFromParcel(Parcel parcel) {
            return new PlaybackInfo(parcel);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public PlaybackInfo[] newArray(int i) {
            return new PlaybackInfo[i];
        }
    };
    private int currentPosition;
    private int currentProgress;
    private Playable currentTrack;
    private int duration;
    private boolean isBuffering;
    private boolean isPlaying;
    private PlaybackMode playbackMode;
    private int playlistSize;
    private float speed;
    private float volume;

    public PlaybackInfo() {
        this.speed = 1.0f;
        this.volume = 1.0f;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int getCurrentPosition() {
        return this.currentPosition;
    }

    public int getCurrentProgress() {
        return this.currentProgress;
    }

    public Playable getCurrentTrack() {
        return this.currentTrack;
    }

    public int getDuration() {
        return this.duration;
    }

    public PlaybackMode getPlaybackMode() {
        return this.playbackMode;
    }

    public int getPlaylistSize() {
        return this.playlistSize;
    }

    public float getSpeed() {
        return this.speed;
    }

    public float getVolume() {
        return this.volume;
    }

    public boolean isBuffering() {
        return this.isBuffering;
    }

    public boolean isPlaying() {
        return this.isPlaying;
    }

    public void setBuffering(boolean z) {
        this.isBuffering = z;
    }

    public void setCurrentPosition(int i) {
        this.currentPosition = i;
    }

    public void setCurrentProgress(int i) {
        this.currentProgress = i;
    }

    public void setCurrentTrack(Playable playable) {
        this.currentTrack = playable;
    }

    public void setDuration(int i) {
        this.duration = i;
    }

    public void setPlaybackMode(PlaybackMode playbackMode) {
        this.playbackMode = playbackMode;
    }

    public void setPlaying(boolean z) {
        this.isPlaying = z;
    }

    public void setPlaylistSize(int i) {
        this.playlistSize = i;
    }

    public void setSpeed(float f) {
        this.speed = f;
    }

    public void setVolume(float f) {
        this.volume = f;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeByte(this.isPlaying ? (byte) 1 : (byte) 0);
        parcel.writeInt(this.currentProgress);
        parcel.writeInt(this.duration);
        parcel.writeFloat(this.speed);
        parcel.writeParcelable(this.playbackMode, i);
        parcel.writeInt(this.playlistSize);
        parcel.writeInt(this.currentPosition);
        parcel.writeParcelable(this.currentTrack, i);
        parcel.writeByte(this.isBuffering ? (byte) 1 : (byte) 0);
        parcel.writeFloat(this.volume);
    }

    public PlaybackInfo(Parcel parcel) {
        this.isPlaying = parcel.readByte() != 0;
        this.currentProgress = parcel.readInt();
        this.duration = parcel.readInt();
        this.speed = parcel.readFloat();
        this.playbackMode = (PlaybackMode) parcel.readParcelable(PlaybackMode.class.getClassLoader());
        this.playlistSize = parcel.readInt();
        this.currentPosition = parcel.readInt();
        this.currentTrack = (Playable) parcel.readParcelable(Playable.class.getClassLoader());
        this.isBuffering = parcel.readByte() != 0;
        this.volume = parcel.readFloat();
    }
}
