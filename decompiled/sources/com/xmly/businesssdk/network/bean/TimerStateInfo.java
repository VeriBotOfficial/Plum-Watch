package com.xmly.businesssdk.network.bean;

import com.xmly.businesssdk.c;
import com.xmly.businesssdk.config.b;
import com.xmly.businesssdk.player.entity.PlayerSleepStyle;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TimerStateInfo.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0002\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J;\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\b2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001d"}, d2 = {"Lcom/xmly/businesssdk/network/bean/TimerStateInfo;", "", "sleepStyle", "Lcom/xmly/businesssdk/player/entity/PlayerSleepStyle;", "remainingSeconds", "", "remainingEpisodes", "playStopEpisodes", "", "isOpen", "(Lcom/xmly/businesssdk/player/entity/PlayerSleepStyle;IIZZ)V", "()Z", "getPlayStopEpisodes", "getRemainingEpisodes", "()I", "getRemainingSeconds", "getSleepStyle", "()Lcom/xmly/businesssdk/player/entity/PlayerSleepStyle;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TimerStateInfo {
    private final boolean isOpen;
    private final boolean playStopEpisodes;
    private final int remainingEpisodes;
    private final int remainingSeconds;
    private final PlayerSleepStyle sleepStyle;

    public TimerStateInfo(PlayerSleepStyle sleepStyle, int i, int i2, boolean z, boolean z2) {
        Intrinsics.checkNotNullParameter(sleepStyle, "sleepStyle");
        this.sleepStyle = sleepStyle;
        this.remainingSeconds = i;
        this.remainingEpisodes = i2;
        this.playStopEpisodes = z;
        this.isOpen = z2;
    }

    public static /* synthetic */ TimerStateInfo copy$default(TimerStateInfo timerStateInfo, PlayerSleepStyle playerSleepStyle, int i, int i2, boolean z, boolean z2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            playerSleepStyle = timerStateInfo.sleepStyle;
        }
        if ((i3 & 2) != 0) {
            i = timerStateInfo.remainingSeconds;
        }
        if ((i3 & 4) != 0) {
            i2 = timerStateInfo.remainingEpisodes;
        }
        if ((i3 & 8) != 0) {
            z = timerStateInfo.playStopEpisodes;
        }
        if ((i3 & 16) != 0) {
            z2 = timerStateInfo.isOpen;
        }
        boolean z3 = z2;
        int i4 = i2;
        return timerStateInfo.copy(playerSleepStyle, i, i4, z, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final PlayerSleepStyle getSleepStyle() {
        return this.sleepStyle;
    }

    /* renamed from: component2, reason: from getter */
    public final int getRemainingSeconds() {
        return this.remainingSeconds;
    }

    /* renamed from: component3, reason: from getter */
    public final int getRemainingEpisodes() {
        return this.remainingEpisodes;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getPlayStopEpisodes() {
        return this.playStopEpisodes;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsOpen() {
        return this.isOpen;
    }

    public final TimerStateInfo copy(PlayerSleepStyle sleepStyle, int remainingSeconds, int remainingEpisodes, boolean playStopEpisodes, boolean isOpen) {
        Intrinsics.checkNotNullParameter(sleepStyle, "sleepStyle");
        return new TimerStateInfo(sleepStyle, remainingSeconds, remainingEpisodes, playStopEpisodes, isOpen);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TimerStateInfo)) {
            return false;
        }
        TimerStateInfo timerStateInfo = (TimerStateInfo) other;
        return this.sleepStyle == timerStateInfo.sleepStyle && this.remainingSeconds == timerStateInfo.remainingSeconds && this.remainingEpisodes == timerStateInfo.remainingEpisodes && this.playStopEpisodes == timerStateInfo.playStopEpisodes && this.isOpen == timerStateInfo.isOpen;
    }

    public final boolean getPlayStopEpisodes() {
        return this.playStopEpisodes;
    }

    public final int getRemainingEpisodes() {
        return this.remainingEpisodes;
    }

    public final int getRemainingSeconds() {
        return this.remainingSeconds;
    }

    public final PlayerSleepStyle getSleepStyle() {
        return this.sleepStyle;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int a2 = b.a(this.remainingEpisodes, b.a(this.remainingSeconds, this.sleepStyle.hashCode() * 31, 31), 31);
        boolean z = this.playStopEpisodes;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (a2 + i) * 31;
        boolean z2 = this.isOpen;
        return i2 + (z2 ? 1 : z2 ? 1 : 0);
    }

    public final boolean isOpen() {
        return this.isOpen;
    }

    public String toString() {
        return c.a("TimerStateInfo(sleepStyle=").append(this.sleepStyle).append(", remainingSeconds=").append(this.remainingSeconds).append(", remainingEpisodes=").append(this.remainingEpisodes).append(", playStopEpisodes=").append(this.playStopEpisodes).append(", isOpen=").append(this.isOpen).append(')').toString();
    }
}
