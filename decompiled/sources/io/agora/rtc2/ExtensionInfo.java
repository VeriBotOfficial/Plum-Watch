package io.agora.rtc2;

import io.agora.rtc2.Constants;

/* loaded from: classes6.dex */
public class ExtensionInfo {
    public String channelId;
    public int localUid;
    public Constants.MediaSourceType mediaSourceType;
    public int remoteUid;

    public ExtensionInfo() {
        this.mediaSourceType = Constants.MediaSourceType.UNKNOWN_MEDIA_SOURCE;
        this.remoteUid = 0;
        this.channelId = null;
        this.localUid = 0;
    }

    public ExtensionInfo(Constants.MediaSourceType mediaSourceType, int remoteUid, String channelId, int localUid) {
        this.mediaSourceType = mediaSourceType;
        this.remoteUid = remoteUid;
        this.channelId = channelId;
        this.localUid = localUid;
    }
}
