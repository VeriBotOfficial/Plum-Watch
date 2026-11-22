package com.wakeup.common.network.entity.music.library;

import com.wakeup.feature.health.bloodGlucose.diabetes.DiabetesRiskFormActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LocalMusicNewEntity.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0005¢\u0006\u0004\b\f\u0010\rR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000fR\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011R\u001a\u0010\u0018\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\u001e\u001a\u00020\u0019X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010\u001b\"\u0004\b \u0010\u001d¨\u0006!"}, d2 = {"Lcom/wakeup/common/network/entity/music/library/LocalMusicNewEntity;", "", "id", "", "name", "", "icon", "singer", "fileUrl", "fileSize", "duration", "playNumStr", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IILjava/lang/String;)V", "getId", "()I", "getName", "()Ljava/lang/String;", "getIcon", "getSinger", "getFileUrl", "getFileSize", "getDuration", "getPlayNumStr", DiabetesRiskFormActivity.MODE_UPLOAD, "", "getUpload", "()Z", "setUpload", "(Z)V", "playing", "getPlaying", "setPlaying", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class LocalMusicNewEntity {
    private final int duration;
    private final int fileSize;
    private final String fileUrl;
    private final String icon;
    private final int id;
    private final String name;
    private final String playNumStr;
    private boolean playing;
    private final String singer;
    private boolean upload;

    public LocalMusicNewEntity(int i, String name, String icon, String singer, String fileUrl, int i2, int i3, String playNumStr) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(singer, "singer");
        Intrinsics.checkNotNullParameter(fileUrl, "fileUrl");
        Intrinsics.checkNotNullParameter(playNumStr, "playNumStr");
        this.id = i;
        this.name = name;
        this.icon = icon;
        this.singer = singer;
        this.fileUrl = fileUrl;
        this.fileSize = i2;
        this.duration = i3;
        this.playNumStr = playNumStr;
    }

    public final int getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getSinger() {
        return this.singer;
    }

    public final String getFileUrl() {
        return this.fileUrl;
    }

    public final int getFileSize() {
        return this.fileSize;
    }

    public final int getDuration() {
        return this.duration;
    }

    public final String getPlayNumStr() {
        return this.playNumStr;
    }

    public final boolean getUpload() {
        return this.upload;
    }

    public final void setUpload(boolean z) {
        this.upload = z;
    }

    public final boolean getPlaying() {
        return this.playing;
    }

    public final void setPlaying(boolean z) {
        this.playing = z;
    }
}
