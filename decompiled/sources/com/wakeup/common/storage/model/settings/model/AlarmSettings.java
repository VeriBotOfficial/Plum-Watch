package com.wakeup.common.storage.model.settings.model;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AlarmSettings.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u00032\b\u0010\u001f\u001a\u0004\u0018\u00010 HÖ\u0003J\t\u0010!\u001a\u00020\u000bHÖ\u0001J\t\u0010\"\u001a\u00020\u0014HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0006\"\u0004\b\t\u0010\u0005R\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0010\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\r\"\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0013\u001a\u00020\u0014X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0006\"\u0004\b\u001b\u0010\u0005¨\u0006#"}, d2 = {"Lcom/wakeup/common/storage/model/settings/model/AlarmSettings;", "Ljava/io/Serializable;", "isAvailable", "", "<init>", "(Z)V", "()Z", "switch", "getSwitch", "setSwitch", "time", "", "getTime", "()I", "setTime", "(I)V", "repeat", "getRepeat", "setRepeat", "tipStr", "", "getTipStr", "()Ljava/lang/String;", "setTipStr", "(Ljava/lang/String;)V", "laterSwitch", "getLaterSwitch", "setLaterSwitch", "component1", "copy", "equals", "other", "", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AlarmSettings implements Serializable {
    private final boolean isAvailable;
    private boolean laterSwitch;
    private int time;
    private boolean switch = true;
    private int repeat = 128;
    private String tipStr = "";

    public static /* synthetic */ AlarmSettings copy$default(AlarmSettings alarmSettings, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            z = alarmSettings.isAvailable;
        }
        return alarmSettings.copy(z);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsAvailable() {
        return this.isAvailable;
    }

    public final AlarmSettings copy(boolean isAvailable) {
        return new AlarmSettings(isAvailable);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof AlarmSettings) && this.isAvailable == ((AlarmSettings) other).isAvailable;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isAvailable);
    }

    public String toString() {
        return "AlarmSettings(isAvailable=" + this.isAvailable + Separators.RPAREN;
    }

    public AlarmSettings(boolean z) {
        this.isAvailable = z;
    }

    public final boolean isAvailable() {
        return this.isAvailable;
    }

    public final boolean getSwitch() {
        return this.switch;
    }

    public final void setSwitch(boolean z) {
        this.switch = z;
    }

    public final int getTime() {
        return this.time;
    }

    public final void setTime(int i) {
        this.time = i;
    }

    public final int getRepeat() {
        return this.repeat;
    }

    public final void setRepeat(int i) {
        this.repeat = i;
    }

    public final String getTipStr() {
        return this.tipStr;
    }

    public final void setTipStr(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.tipStr = str;
    }

    public final boolean getLaterSwitch() {
        return this.laterSwitch;
    }

    public final void setLaterSwitch(boolean z) {
        this.laterSwitch = z;
    }
}
