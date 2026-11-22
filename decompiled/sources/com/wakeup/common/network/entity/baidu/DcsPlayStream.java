package com.wakeup.common.network.entity.baidu;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaiduAiBean.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/wakeup/common/network/entity/baidu/DcsPlayStream;", "", "audioAlbumId", "", "streamFormat", "url", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAudioAlbumId", "()Ljava/lang/String;", "getStreamFormat", "getUrl", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DcsPlayStream {
    private final String audioAlbumId;
    private final String streamFormat;
    private final String url;

    public static /* synthetic */ DcsPlayStream copy$default(DcsPlayStream dcsPlayStream, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dcsPlayStream.audioAlbumId;
        }
        if ((i & 2) != 0) {
            str2 = dcsPlayStream.streamFormat;
        }
        if ((i & 4) != 0) {
            str3 = dcsPlayStream.url;
        }
        return dcsPlayStream.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAudioAlbumId() {
        return this.audioAlbumId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getStreamFormat() {
        return this.streamFormat;
    }

    /* renamed from: component3, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    public final DcsPlayStream copy(String audioAlbumId, String streamFormat, String url) {
        Intrinsics.checkNotNullParameter(audioAlbumId, "audioAlbumId");
        Intrinsics.checkNotNullParameter(streamFormat, "streamFormat");
        Intrinsics.checkNotNullParameter(url, "url");
        return new DcsPlayStream(audioAlbumId, streamFormat, url);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DcsPlayStream)) {
            return false;
        }
        DcsPlayStream dcsPlayStream = (DcsPlayStream) other;
        return Intrinsics.areEqual(this.audioAlbumId, dcsPlayStream.audioAlbumId) && Intrinsics.areEqual(this.streamFormat, dcsPlayStream.streamFormat) && Intrinsics.areEqual(this.url, dcsPlayStream.url);
    }

    public int hashCode() {
        return (((this.audioAlbumId.hashCode() * 31) + this.streamFormat.hashCode()) * 31) + this.url.hashCode();
    }

    public String toString() {
        return "DcsPlayStream(audioAlbumId=" + this.audioAlbumId + ", streamFormat=" + this.streamFormat + ", url=" + this.url + Separators.RPAREN;
    }

    public DcsPlayStream(String audioAlbumId, String streamFormat, String url) {
        Intrinsics.checkNotNullParameter(audioAlbumId, "audioAlbumId");
        Intrinsics.checkNotNullParameter(streamFormat, "streamFormat");
        Intrinsics.checkNotNullParameter(url, "url");
        this.audioAlbumId = audioAlbumId;
        this.streamFormat = streamFormat;
        this.url = url;
    }

    public final String getAudioAlbumId() {
        return this.audioAlbumId;
    }

    public final String getStreamFormat() {
        return this.streamFormat;
    }

    public final String getUrl() {
        return this.url;
    }
}
