package com.wakeup.module.ai.appllm.bean;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppLLMChatBean.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/wakeup/module/ai/appllm/bean/MusicData;", "", "name", "", "singer", "path", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getName", "()Ljava/lang/String;", "getSinger", "getPath", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "module-ai_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class MusicData {
    private final String name;
    private final String path;
    private final String singer;

    public static /* synthetic */ MusicData copy$default(MusicData musicData, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = musicData.name;
        }
        if ((i & 2) != 0) {
            str2 = musicData.singer;
        }
        if ((i & 4) != 0) {
            str3 = musicData.path;
        }
        return musicData.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSinger() {
        return this.singer;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPath() {
        return this.path;
    }

    public final MusicData copy(String name, String singer, String path) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(singer, "singer");
        Intrinsics.checkNotNullParameter(path, "path");
        return new MusicData(name, singer, path);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MusicData)) {
            return false;
        }
        MusicData musicData = (MusicData) other;
        return Intrinsics.areEqual(this.name, musicData.name) && Intrinsics.areEqual(this.singer, musicData.singer) && Intrinsics.areEqual(this.path, musicData.path);
    }

    public int hashCode() {
        return (((this.name.hashCode() * 31) + this.singer.hashCode()) * 31) + this.path.hashCode();
    }

    public String toString() {
        return "MusicData(name=" + this.name + ", singer=" + this.singer + ", path=" + this.path + Separators.RPAREN;
    }

    public MusicData(String name, String singer, String path) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(singer, "singer");
        Intrinsics.checkNotNullParameter(path, "path");
        this.name = name;
        this.singer = singer;
        this.path = path;
    }

    public final String getName() {
        return this.name;
    }

    public final String getSinger() {
        return this.singer;
    }

    public final String getPath() {
        return this.path;
    }
}
