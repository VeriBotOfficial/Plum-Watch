package com.wakeup.common.burypoint;

import com.unity3d.services.core.device.reader.JsonStorageKeyNames;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppEntityExtendInfo.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\"\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0007\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u0013\"\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u001b\"\u0004\b\u001c\u0010\u001dR\u001a\u0010\b\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001e\u0010\u001b\"\u0004\b\u001f\u0010\u001dR\u001a\u0010\t\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0013\"\u0004\b!\u0010\u0015R\u001a\u0010\n\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010\u0013\"\u0004\b#\u0010\u0015R\u001a\u0010\u000b\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u0013\"\u0004\b%\u0010\u0015R\u001a\u0010\f\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u001b\"\u0004\b'\u0010\u001dR\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u0017\"\u0004\b(\u0010\u0019¨\u0006)"}, d2 = {"Lcom/wakeup/common/burypoint/VideoFirstFrameExtendInfo;", "Lcom/wakeup/common/burypoint/BaseExtendInfo;", "firstFrameDuration", "", "abEnabled", "", "videoId", "", "playerLibVersion", "preCacheSize", "playerPoolSize", "bufferDuration", "networkType", "isColdStart", "launchId", JsonStorageKeyNames.SESSION_ID_KEY, "<init>", "(IZLjava/lang/String;Ljava/lang/String;IIILjava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "getFirstFrameDuration", "()I", "setFirstFrameDuration", "(I)V", "getAbEnabled", "()Z", "setAbEnabled", "(Z)V", "getVideoId", "()Ljava/lang/String;", "setVideoId", "(Ljava/lang/String;)V", "getPlayerLibVersion", "setPlayerLibVersion", "getPreCacheSize", "setPreCacheSize", "getPlayerPoolSize", "setPlayerPoolSize", "getBufferDuration", "setBufferDuration", "getNetworkType", "setNetworkType", "setColdStart", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class VideoFirstFrameExtendInfo extends BaseExtendInfo {
    private boolean abEnabled;
    private int bufferDuration;
    private int firstFrameDuration;
    private boolean isColdStart;
    private String networkType;
    private String playerLibVersion;
    private int playerPoolSize;
    private int preCacheSize;
    private String videoId;

    public final int getFirstFrameDuration() {
        return this.firstFrameDuration;
    }

    public final void setFirstFrameDuration(int i) {
        this.firstFrameDuration = i;
    }

    public final boolean getAbEnabled() {
        return this.abEnabled;
    }

    public final void setAbEnabled(boolean z) {
        this.abEnabled = z;
    }

    public final String getVideoId() {
        return this.videoId;
    }

    public final void setVideoId(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.videoId = str;
    }

    public final String getPlayerLibVersion() {
        return this.playerLibVersion;
    }

    public final void setPlayerLibVersion(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.playerLibVersion = str;
    }

    public final int getPreCacheSize() {
        return this.preCacheSize;
    }

    public final void setPreCacheSize(int i) {
        this.preCacheSize = i;
    }

    public final int getPlayerPoolSize() {
        return this.playerPoolSize;
    }

    public final void setPlayerPoolSize(int i) {
        this.playerPoolSize = i;
    }

    public final int getBufferDuration() {
        return this.bufferDuration;
    }

    public final void setBufferDuration(int i) {
        this.bufferDuration = i;
    }

    public final String getNetworkType() {
        return this.networkType;
    }

    public final void setNetworkType(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.networkType = str;
    }

    /* renamed from: isColdStart, reason: from getter */
    public final boolean getIsColdStart() {
        return this.isColdStart;
    }

    public final void setColdStart(boolean z) {
        this.isColdStart = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VideoFirstFrameExtendInfo(int i, boolean z, String videoId, String playerLibVersion, int i2, int i3, int i4, String networkType, boolean z2, String launchId, String sessionId) {
        super(launchId, sessionId);
        Intrinsics.checkNotNullParameter(videoId, "videoId");
        Intrinsics.checkNotNullParameter(playerLibVersion, "playerLibVersion");
        Intrinsics.checkNotNullParameter(networkType, "networkType");
        Intrinsics.checkNotNullParameter(launchId, "launchId");
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        this.firstFrameDuration = i;
        this.abEnabled = z;
        this.videoId = videoId;
        this.playerLibVersion = playerLibVersion;
        this.preCacheSize = i2;
        this.playerPoolSize = i3;
        this.bufferDuration = i4;
        this.networkType = networkType;
        this.isColdStart = z2;
    }
}
