package com.wakeup.common.storage.model;

import kotlin.Metadata;

/* compiled from: DeviceLocal.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u001f\u001a\u00020\u0005J\u0006\u0010 \u001a\u00020!J\u0006\u0010\"\u001a\u00020!J\u0006\u0010#\u001a\u00020!J\u0006\u0010$\u001a\u00020!J\u0006\u0010%\u001a\u00020!J\u0006\u0010&\u001a\u00020\u0005J\u0006\u0010'\u001a\u00020\u0005R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001a\u0010\u0013\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u0017X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001c\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\t¨\u0006("}, d2 = {"Lcom/wakeup/common/storage/model/DeviceLocal;", "", "<init>", "()V", "byte6", "", "getByte6", "()I", "setByte6", "(I)V", "byte7", "getByte7", "setByte7", "byte8", "getByte8", "setByte8", "byte9", "getByte9", "setByte9", "byte10", "getByte10", "setByte10", "deviceScreen", "Lcom/wakeup/common/storage/model/DeviceScreen;", "getDeviceScreen", "()Lcom/wakeup/common/storage/model/DeviceScreen;", "setDeviceScreen", "(Lcom/wakeup/common/storage/model/DeviceScreen;)V", "rotate", "getRotate", "setRotate", "getPlatform", "supportDouble", "", "supportNewAliCode", "supportPressure", "supportFileTrans", "supportSwitchReceive", "getDeviceType", "getOtaType", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DeviceLocal {
    private int byte10;
    private int byte6;
    private int byte7;
    private int byte8;
    private int byte9;
    private DeviceScreen deviceScreen;
    private int rotate = 1;

    public final int getByte6() {
        return this.byte6;
    }

    public final void setByte6(int i) {
        this.byte6 = i;
    }

    public final int getByte7() {
        return this.byte7;
    }

    public final void setByte7(int i) {
        this.byte7 = i;
    }

    public final int getByte8() {
        return this.byte8;
    }

    public final void setByte8(int i) {
        this.byte8 = i;
    }

    public final int getByte9() {
        return this.byte9;
    }

    public final void setByte9(int i) {
        this.byte9 = i;
    }

    public final int getByte10() {
        return this.byte10;
    }

    public final void setByte10(int i) {
        this.byte10 = i;
    }

    public final DeviceScreen getDeviceScreen() {
        return this.deviceScreen;
    }

    public final void setDeviceScreen(DeviceScreen deviceScreen) {
        this.deviceScreen = deviceScreen;
    }

    public final int getRotate() {
        return this.rotate;
    }

    public final void setRotate(int i) {
        this.rotate = i;
    }

    public final int getPlatform() {
        return this.byte6;
    }

    public final boolean supportDouble() {
        return (this.byte8 & 1) != 0;
    }

    public final boolean supportNewAliCode() {
        return (this.byte8 & 4) != 0;
    }

    public final boolean supportPressure() {
        return (this.byte8 & 16) != 0;
    }

    public final boolean supportFileTrans() {
        return (this.byte8 & 32) != 0;
    }

    public final boolean supportSwitchReceive() {
        return (this.byte8 & 128) != 0;
    }

    public final int getDeviceType() {
        return this.byte9;
    }

    public final int getOtaType() {
        return this.byte10;
    }
}
