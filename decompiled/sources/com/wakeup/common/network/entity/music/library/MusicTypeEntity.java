package com.wakeup.common.network.entity.music.library;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MusicTypeEntity.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u000e"}, d2 = {"Lcom/wakeup/common/network/entity/music/library/MusicTypeEntity;", "", "musicType", "", "name", "", "icon", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "getMusicType", "()I", "getName", "()Ljava/lang/String;", "getIcon", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MusicTypeEntity {
    private final String icon;
    private final int musicType;
    private final String name;

    public MusicTypeEntity(int i, String name, String icon) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.musicType = i;
        this.name = name;
        this.icon = icon;
    }

    public final int getMusicType() {
        return this.musicType;
    }

    public final String getName() {
        return this.name;
    }

    public final String getIcon() {
        return this.icon;
    }
}
