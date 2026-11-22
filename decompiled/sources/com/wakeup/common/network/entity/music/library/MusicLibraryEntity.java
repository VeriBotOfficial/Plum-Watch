package com.wakeup.common.network.entity.music.library;

import io.nats.client.support.ApiConstants;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.xmind.core.internal.dom.DOMConstants;

/* compiled from: MusicLibraryEntity.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\u0007\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0007¢\u0006\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0011\u0010\t\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0015R\u0011\u0010\n\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0015R\u0011\u0010\u000b\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0015R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011R\u0011\u0010\r\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0015R\u001a\u0010\u001c\u001a\u00020\u001dX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!¨\u0006\""}, d2 = {"Lcom/wakeup/common/network/entity/music/library/MusicLibraryEntity;", "", "musicClassify", "", "musicType", "id", "name", "", DOMConstants.ATTR_AUTHOR, ApiConstants.LINK, "introduce", "icon", "duration", "playNumStr", "<init>", "(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getMusicClassify", "()I", "getMusicType", "getId", "getName", "()Ljava/lang/String;", "getAuthor", "getLink", "getIntroduce", "getIcon", "getDuration", "getPlayNumStr", "playing", "", "getPlaying", "()Z", "setPlaying", "(Z)V", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MusicLibraryEntity {
    private final String author;
    private final int duration;
    private final String icon;
    private final int id;
    private final String introduce;
    private final String link;
    private final int musicClassify;
    private final int musicType;
    private final String name;
    private final String playNumStr;
    private boolean playing;

    public MusicLibraryEntity(int i, int i2, int i3, String name, String author, String link, String introduce, String icon, int i4, String playNumStr) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(author, "author");
        Intrinsics.checkNotNullParameter(link, "link");
        Intrinsics.checkNotNullParameter(introduce, "introduce");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(playNumStr, "playNumStr");
        this.musicClassify = i;
        this.musicType = i2;
        this.id = i3;
        this.name = name;
        this.author = author;
        this.link = link;
        this.introduce = introduce;
        this.icon = icon;
        this.duration = i4;
        this.playNumStr = playNumStr;
    }

    public final int getMusicClassify() {
        return this.musicClassify;
    }

    public final int getMusicType() {
        return this.musicType;
    }

    public final int getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getAuthor() {
        return this.author;
    }

    public final String getLink() {
        return this.link;
    }

    public final String getIntroduce() {
        return this.introduce;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final String getPlayNumStr() {
        return this.playNumStr;
    }

    public final boolean getPlaying() {
        return this.playing;
    }

    public final void setPlaying(boolean z) {
        this.playing = z;
    }
}
