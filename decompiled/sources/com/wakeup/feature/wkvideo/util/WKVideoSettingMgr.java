package com.wakeup.feature.wkvideo.util;

import com.wakeup.common.storage.CacheManager;
import kotlin.Metadata;

/* compiled from: WKVideoSettingMgr.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0006\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\bJ\u0006\u0010\u0010\u001a\u00020\bJ\u0006\u0010\u000f\u001a\u00020\bJ\u000e\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\bJ\u0006\u0010\u0013\u001a\u00020\bR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u0014"}, d2 = {"Lcom/wakeup/feature/wkvideo/util/WKVideoSettingMgr;", "", "<init>", "()V", "MUTE_SETTINGS", "", "RECORDED_SETTINGS", "ignoreMute", "", "getIgnoreMute", "()Z", "setIgnoreMute", "(Z)V", "setMuteSettings", "", "isMute", "isRealMute", "setRecordedSettings", "isOpen", "isRecorded", "feature-wkvideo_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WKVideoSettingMgr {
    public static final WKVideoSettingMgr INSTANCE = new WKVideoSettingMgr();
    private static final String MUTE_SETTINGS = "WK_VIDEO_MUTE_SETTINGS";
    private static final String RECORDED_SETTINGS = "WK_VIDEO_RECORDED_SETTINGS";
    private static boolean ignoreMute;

    private WKVideoSettingMgr() {
    }

    public final boolean getIgnoreMute() {
        return ignoreMute;
    }

    public final void setIgnoreMute(boolean z) {
        ignoreMute = z;
    }

    public final void setMuteSettings(boolean isMute) {
        CacheManager.saveBoolean(MUTE_SETTINGS, isMute);
    }

    public final boolean isRealMute() {
        return CacheManager.getBoolean(MUTE_SETTINGS, false);
    }

    public final boolean isMute() {
        if (ignoreMute) {
            return false;
        }
        return CacheManager.getBoolean(MUTE_SETTINGS, false);
    }

    public final void setRecordedSettings(boolean isOpen) {
        CacheManager.saveBoolean(RECORDED_SETTINGS, isOpen);
    }

    public final boolean isRecorded() {
        return CacheManager.getBoolean(RECORDED_SETTINGS, false);
    }
}
