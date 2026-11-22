package com.wakeup.module.glasses.bean;

import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import com.wakeup.common.utils.WifiInfo;
import kotlin.Metadata;

/* compiled from: GlassesSettings.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\u000f\"\u0004\b\u0013\u0010\u0011R\u001a\u0010\u0014\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0007\"\u0004\b\u0016\u0010\tR\u001a\u0010\u0017\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0007\"\u0004\b\u0019\u0010\tR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u001bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001a\u0010 \u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\u0007\"\u0004\b\"\u0010\tR\u001a\u0010#\u001a\u00020\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b$\u0010\u000f\"\u0004\b%\u0010\u0011¨\u0006&"}, d2 = {"Lcom/wakeup/module/glasses/bean/GlassesSettings;", "", "<init>", "()V", "videoMaxLen", "", "getVideoMaxLen", "()I", "setVideoMaxLen", "(I)V", "audioMaxLen", "getAudioMaxLen", "setAudioMaxLen", "isVoiceWakeup", "", "()Z", "setVoiceWakeup", "(Z)V", "isCustomTime", "setCustomTime", "customTimeStart", "getCustomTimeStart", "setCustomTimeStart", "customTimeEnd", "getCustomTimeEnd", "setCustomTimeEnd", "wifi", "Lcom/wakeup/common/utils/WifiInfo;", "getWifi", "()Lcom/wakeup/common/utils/WifiInfo;", "setWifi", "(Lcom/wakeup/common/utils/WifiInfo;)V", HiAnalyticsConstant.HaKey.BI_KEY_DIRECTION, "getDirection", "setDirection", "autoStore", "getAutoStore", "setAutoStore", "feature-glasses_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class GlassesSettings {
    private boolean autoStore;
    private int direction;
    private boolean isCustomTime;
    private WifiInfo wifi;
    private int videoMaxLen = 60;
    private int audioMaxLen = 60;
    private boolean isVoiceWakeup = true;
    private int customTimeStart = 540;
    private int customTimeEnd = 1320;

    public final int getVideoMaxLen() {
        return this.videoMaxLen;
    }

    public final void setVideoMaxLen(int i) {
        this.videoMaxLen = i;
    }

    public final int getAudioMaxLen() {
        return this.audioMaxLen;
    }

    public final void setAudioMaxLen(int i) {
        this.audioMaxLen = i;
    }

    /* renamed from: isVoiceWakeup, reason: from getter */
    public final boolean getIsVoiceWakeup() {
        return this.isVoiceWakeup;
    }

    public final void setVoiceWakeup(boolean z) {
        this.isVoiceWakeup = z;
    }

    /* renamed from: isCustomTime, reason: from getter */
    public final boolean getIsCustomTime() {
        return this.isCustomTime;
    }

    public final void setCustomTime(boolean z) {
        this.isCustomTime = z;
    }

    public final int getCustomTimeStart() {
        return this.customTimeStart;
    }

    public final void setCustomTimeStart(int i) {
        this.customTimeStart = i;
    }

    public final int getCustomTimeEnd() {
        return this.customTimeEnd;
    }

    public final void setCustomTimeEnd(int i) {
        this.customTimeEnd = i;
    }

    public final WifiInfo getWifi() {
        return this.wifi;
    }

    public final void setWifi(WifiInfo wifiInfo) {
        this.wifi = wifiInfo;
    }

    public final int getDirection() {
        return this.direction;
    }

    public final void setDirection(int i) {
        this.direction = i;
    }

    public final boolean getAutoStore() {
        return this.autoStore;
    }

    public final void setAutoStore(boolean z) {
        this.autoStore = z;
    }
}
