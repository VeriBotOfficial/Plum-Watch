package io.agora.meta;

import io.agora.rtc2.RtcEngine;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes6.dex */
public class MetaServiceConfig {
    public RtcEngine mRtcEngine = null;
    public String mAppId = "";
    public String mRtmToken = "";
    public String mRtcToken = "";
    public String mLocalDownloadPath = "";
    public String mUserId = "";
    public IMetaServiceEventHandler mEventHandler = null;

    public String getAppId() {
        return this.mAppId;
    }

    public IMetaServiceEventHandler getEventHandler() {
        return this.mEventHandler;
    }

    public String getLocalDownloadPath() {
        return this.mLocalDownloadPath;
    }

    public String getRtcToken() {
        return this.mRtcToken;
    }

    public String getRtmToken() {
        return this.mRtmToken;
    }

    public String getUserId() {
        return this.mUserId;
    }

    public String toString() {
        return "MetaServiceConfig{mRtcEngine=" + this.mRtcEngine + ", mAppId='" + this.mAppId + "', mRtmToken='" + this.mRtmToken + ", mRtcToken='" + this.mRtcToken + "', mLocalDownloadPath='" + this.mLocalDownloadPath + "', mUserId='" + this.mUserId + "', mEventHandler=" + this.mEventHandler + AbstractJsonLexerKt.END_OBJ;
    }
}
