package com.wakeup.common.network.entity.baidu;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BaiduAiBean.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0018"}, d2 = {"Lcom/wakeup/common/network/entity/baidu/DcsRenderInfo;", "", "audioItemId", "", "audioAlbumId", "content", "Lcom/wakeup/common/network/entity/baidu/DcsRenderContent;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/wakeup/common/network/entity/baidu/DcsRenderContent;)V", "getAudioItemId", "()Ljava/lang/String;", "getAudioAlbumId", "getContent", "()Lcom/wakeup/common/network/entity/baidu/DcsRenderContent;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DcsRenderInfo {
    private final String audioAlbumId;
    private final String audioItemId;
    private final DcsRenderContent content;

    public static /* synthetic */ DcsRenderInfo copy$default(DcsRenderInfo dcsRenderInfo, String str, String str2, DcsRenderContent dcsRenderContent, int i, Object obj) {
        if ((i & 1) != 0) {
            str = dcsRenderInfo.audioItemId;
        }
        if ((i & 2) != 0) {
            str2 = dcsRenderInfo.audioAlbumId;
        }
        if ((i & 4) != 0) {
            dcsRenderContent = dcsRenderInfo.content;
        }
        return dcsRenderInfo.copy(str, str2, dcsRenderContent);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAudioItemId() {
        return this.audioItemId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAudioAlbumId() {
        return this.audioAlbumId;
    }

    /* renamed from: component3, reason: from getter */
    public final DcsRenderContent getContent() {
        return this.content;
    }

    public final DcsRenderInfo copy(String audioItemId, String audioAlbumId, DcsRenderContent content) {
        Intrinsics.checkNotNullParameter(audioItemId, "audioItemId");
        Intrinsics.checkNotNullParameter(audioAlbumId, "audioAlbumId");
        Intrinsics.checkNotNullParameter(content, "content");
        return new DcsRenderInfo(audioItemId, audioAlbumId, content);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DcsRenderInfo)) {
            return false;
        }
        DcsRenderInfo dcsRenderInfo = (DcsRenderInfo) other;
        return Intrinsics.areEqual(this.audioItemId, dcsRenderInfo.audioItemId) && Intrinsics.areEqual(this.audioAlbumId, dcsRenderInfo.audioAlbumId) && Intrinsics.areEqual(this.content, dcsRenderInfo.content);
    }

    public int hashCode() {
        return (((this.audioItemId.hashCode() * 31) + this.audioAlbumId.hashCode()) * 31) + this.content.hashCode();
    }

    public String toString() {
        return "DcsRenderInfo(audioItemId=" + this.audioItemId + ", audioAlbumId=" + this.audioAlbumId + ", content=" + this.content + Separators.RPAREN;
    }

    public DcsRenderInfo(String audioItemId, String audioAlbumId, DcsRenderContent content) {
        Intrinsics.checkNotNullParameter(audioItemId, "audioItemId");
        Intrinsics.checkNotNullParameter(audioAlbumId, "audioAlbumId");
        Intrinsics.checkNotNullParameter(content, "content");
        this.audioItemId = audioItemId;
        this.audioAlbumId = audioAlbumId;
        this.content = content;
    }

    public final String getAudioItemId() {
        return this.audioItemId;
    }

    public final String getAudioAlbumId() {
        return this.audioAlbumId;
    }

    public final DcsRenderContent getContent() {
        return this.content;
    }
}
