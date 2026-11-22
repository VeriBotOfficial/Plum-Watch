package com.wakeup.common.burypoint;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppEntityExtendInfo.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u001d\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\u0006\u0010\u0010\u001a\u00020\u0005¢\u0006\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0016R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0016R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0016R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0016R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0016R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0016R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0011\u0010\u000f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b \u0010\u0016R\u0011\u0010\u0010\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0016¨\u0006\""}, d2 = {"Lcom/wakeup/common/burypoint/H5ExtendInfo;", "", "bannerId", "", "bannerName", "", "bannerPosition", "bannerDevicesize", "bannerCountry", "bannerOs", "bannerDevice", "bannerLanguage", "bannerJumpType", "bannerJumpLink", "bannerExtend", "bannerWatchversion", "bannerSort", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBannerId", "()I", "getBannerName", "()Ljava/lang/String;", "getBannerPosition", "getBannerDevicesize", "getBannerCountry", "getBannerOs", "getBannerDevice", "getBannerLanguage", "getBannerJumpType", "getBannerJumpLink", "getBannerExtend", "getBannerWatchversion", "getBannerSort", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class H5ExtendInfo {
    private final String bannerCountry;
    private final String bannerDevice;
    private final String bannerDevicesize;
    private final String bannerExtend;
    private final int bannerId;
    private final String bannerJumpLink;
    private final String bannerJumpType;
    private final String bannerLanguage;
    private final String bannerName;
    private final String bannerOs;
    private final String bannerPosition;
    private final String bannerSort;
    private final String bannerWatchversion;

    public H5ExtendInfo(int i, String bannerName, String bannerPosition, String bannerDevicesize, String bannerCountry, String bannerOs, String bannerDevice, String bannerLanguage, String bannerJumpType, String bannerJumpLink, String bannerExtend, String bannerWatchversion, String bannerSort) {
        Intrinsics.checkNotNullParameter(bannerName, "bannerName");
        Intrinsics.checkNotNullParameter(bannerPosition, "bannerPosition");
        Intrinsics.checkNotNullParameter(bannerDevicesize, "bannerDevicesize");
        Intrinsics.checkNotNullParameter(bannerCountry, "bannerCountry");
        Intrinsics.checkNotNullParameter(bannerOs, "bannerOs");
        Intrinsics.checkNotNullParameter(bannerDevice, "bannerDevice");
        Intrinsics.checkNotNullParameter(bannerLanguage, "bannerLanguage");
        Intrinsics.checkNotNullParameter(bannerJumpType, "bannerJumpType");
        Intrinsics.checkNotNullParameter(bannerJumpLink, "bannerJumpLink");
        Intrinsics.checkNotNullParameter(bannerExtend, "bannerExtend");
        Intrinsics.checkNotNullParameter(bannerWatchversion, "bannerWatchversion");
        Intrinsics.checkNotNullParameter(bannerSort, "bannerSort");
        this.bannerId = i;
        this.bannerName = bannerName;
        this.bannerPosition = bannerPosition;
        this.bannerDevicesize = bannerDevicesize;
        this.bannerCountry = bannerCountry;
        this.bannerOs = bannerOs;
        this.bannerDevice = bannerDevice;
        this.bannerLanguage = bannerLanguage;
        this.bannerJumpType = bannerJumpType;
        this.bannerJumpLink = bannerJumpLink;
        this.bannerExtend = bannerExtend;
        this.bannerWatchversion = bannerWatchversion;
        this.bannerSort = bannerSort;
    }

    public final int getBannerId() {
        return this.bannerId;
    }

    public final String getBannerName() {
        return this.bannerName;
    }

    public final String getBannerPosition() {
        return this.bannerPosition;
    }

    public final String getBannerDevicesize() {
        return this.bannerDevicesize;
    }

    public final String getBannerCountry() {
        return this.bannerCountry;
    }

    public final String getBannerOs() {
        return this.bannerOs;
    }

    public final String getBannerDevice() {
        return this.bannerDevice;
    }

    public final String getBannerLanguage() {
        return this.bannerLanguage;
    }

    public final String getBannerJumpType() {
        return this.bannerJumpType;
    }

    public final String getBannerJumpLink() {
        return this.bannerJumpLink;
    }

    public final String getBannerExtend() {
        return this.bannerExtend;
    }

    public final String getBannerWatchversion() {
        return this.bannerWatchversion;
    }

    public final String getBannerSort() {
        return this.bannerSort;
    }
}
