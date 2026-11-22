package com.wakeup.common.network.entity.baidu;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaiduAiBean.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003JE\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u00032\b\b\u0002\u0010\t\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\r¨\u0006!"}, d2 = {"Lcom/wakeup/common/network/entity/baidu/AudioModel;", "", "url", "", "name", "duration", "", "artist", "album", "coverImage", "<init>", "(Ljava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getUrl", "()Ljava/lang/String;", "getName", "getDuration", "()J", "getArtist", "getAlbum", "getCoverImage", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AudioModel {
    private final String album;
    private final String artist;
    private final String coverImage;
    private final long duration;
    private final String name;
    private final String url;

    public static /* synthetic */ AudioModel copy$default(AudioModel audioModel, String str, String str2, long j, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = audioModel.url;
        }
        if ((i & 2) != 0) {
            str2 = audioModel.name;
        }
        if ((i & 4) != 0) {
            j = audioModel.duration;
        }
        if ((i & 8) != 0) {
            str3 = audioModel.artist;
        }
        if ((i & 16) != 0) {
            str4 = audioModel.album;
        }
        if ((i & 32) != 0) {
            str5 = audioModel.coverImage;
        }
        String str6 = str5;
        String str7 = str3;
        long j2 = j;
        return audioModel.copy(str, str2, j2, str7, str4, str6);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final long getDuration() {
        return this.duration;
    }

    /* renamed from: component4, reason: from getter */
    public final String getArtist() {
        return this.artist;
    }

    /* renamed from: component5, reason: from getter */
    public final String getAlbum() {
        return this.album;
    }

    /* renamed from: component6, reason: from getter */
    public final String getCoverImage() {
        return this.coverImage;
    }

    public final AudioModel copy(String url, String name, long duration, String artist, String album, String coverImage) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(artist, "artist");
        Intrinsics.checkNotNullParameter(album, "album");
        Intrinsics.checkNotNullParameter(coverImage, "coverImage");
        return new AudioModel(url, name, duration, artist, album, coverImage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AudioModel)) {
            return false;
        }
        AudioModel audioModel = (AudioModel) other;
        return Intrinsics.areEqual(this.url, audioModel.url) && Intrinsics.areEqual(this.name, audioModel.name) && this.duration == audioModel.duration && Intrinsics.areEqual(this.artist, audioModel.artist) && Intrinsics.areEqual(this.album, audioModel.album) && Intrinsics.areEqual(this.coverImage, audioModel.coverImage);
    }

    public int hashCode() {
        return (((((((((this.url.hashCode() * 31) + this.name.hashCode()) * 31) + Long.hashCode(this.duration)) * 31) + this.artist.hashCode()) * 31) + this.album.hashCode()) * 31) + this.coverImage.hashCode();
    }

    public String toString() {
        return "AudioModel(url=" + this.url + ", name=" + this.name + ", duration=" + this.duration + ", artist=" + this.artist + ", album=" + this.album + ", coverImage=" + this.coverImage + Separators.RPAREN;
    }

    public AudioModel(String url, String name, long j, String artist, String album, String coverImage) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(artist, "artist");
        Intrinsics.checkNotNullParameter(album, "album");
        Intrinsics.checkNotNullParameter(coverImage, "coverImage");
        this.url = url;
        this.name = name;
        this.duration = j;
        this.artist = artist;
        this.album = album;
        this.coverImage = coverImage;
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getName() {
        return this.name;
    }

    public final long getDuration() {
        return this.duration;
    }

    public final String getArtist() {
        return this.artist;
    }

    public final String getAlbum() {
        return this.album;
    }

    public final String getCoverImage() {
        return this.coverImage;
    }
}
