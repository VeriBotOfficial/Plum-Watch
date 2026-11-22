package com.wakeup.common.storage.model;

import android.gov.nist.core.Separators;
import kotlin.Metadata;

/* compiled from: DeviceScreen.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/wakeup/common/storage/model/DeviceScreen;", "", "width", "", "height", "screenType", "<init>", "(III)V", "getWidth", "()I", "getHeight", "getScreenType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DeviceScreen {
    private final int height;
    private final int screenType;
    private final int width;

    public static /* synthetic */ DeviceScreen copy$default(DeviceScreen deviceScreen, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 1) != 0) {
            i = deviceScreen.width;
        }
        if ((i4 & 2) != 0) {
            i2 = deviceScreen.height;
        }
        if ((i4 & 4) != 0) {
            i3 = deviceScreen.screenType;
        }
        return deviceScreen.copy(i, i2, i3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* renamed from: component2, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    /* renamed from: component3, reason: from getter */
    public final int getScreenType() {
        return this.screenType;
    }

    public final DeviceScreen copy(int width, int height, int screenType) {
        return new DeviceScreen(width, height, screenType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DeviceScreen)) {
            return false;
        }
        DeviceScreen deviceScreen = (DeviceScreen) other;
        return this.width == deviceScreen.width && this.height == deviceScreen.height && this.screenType == deviceScreen.screenType;
    }

    public int hashCode() {
        return (((Integer.hashCode(this.width) * 31) + Integer.hashCode(this.height)) * 31) + Integer.hashCode(this.screenType);
    }

    public String toString() {
        return "DeviceScreen(width=" + this.width + ", height=" + this.height + ", screenType=" + this.screenType + Separators.RPAREN;
    }

    public DeviceScreen(int i, int i2, int i3) {
        this.width = i;
        this.height = i2;
        this.screenType = i3;
    }

    public final int getWidth() {
        return this.width;
    }

    public final int getHeight() {
        return this.height;
    }

    public final int getScreenType() {
        return this.screenType;
    }
}
