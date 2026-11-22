package com.wakeup.common.burypoint;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AppEntityExtendInfo.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0019\u0018\u00002\u00020\u0001B_\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\u0005\u0012\u0006\u0010\f\u001a\u00020\u0005\u0012\u0006\u0010\r\u001a\u00020\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0014R\u0011\u0010\b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0014R\u0011\u0010\t\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0011\u0010\n\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0014R\u0011\u0010\u000b\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0014R\u0011\u0010\f\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u0014R\u0011\u0010\r\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0011\u0010\u000e\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014¨\u0006\u001e"}, d2 = {"Lcom/wakeup/common/burypoint/H5PopExtendInfo;", "", "popID", "", "popName", "", "popPosition", "popCountry", "popOs", "popDevice", "popLanguage", "popJumpType", "popJumpLink", "popExtend", "popSort", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPopID", "()I", "getPopName", "()Ljava/lang/String;", "getPopPosition", "getPopCountry", "getPopOs", "getPopDevice", "getPopLanguage", "getPopJumpType", "getPopJumpLink", "getPopExtend", "getPopSort", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class H5PopExtendInfo {
    private final String popCountry;
    private final String popDevice;
    private final String popExtend;
    private final int popID;
    private final String popJumpLink;
    private final String popJumpType;
    private final String popLanguage;
    private final String popName;
    private final String popOs;
    private final String popPosition;
    private final String popSort;

    public H5PopExtendInfo(int i, String popName, String popPosition, String popCountry, String popOs, String popDevice, String popLanguage, String popJumpType, String popJumpLink, String popExtend, String popSort) {
        Intrinsics.checkNotNullParameter(popName, "popName");
        Intrinsics.checkNotNullParameter(popPosition, "popPosition");
        Intrinsics.checkNotNullParameter(popCountry, "popCountry");
        Intrinsics.checkNotNullParameter(popOs, "popOs");
        Intrinsics.checkNotNullParameter(popDevice, "popDevice");
        Intrinsics.checkNotNullParameter(popLanguage, "popLanguage");
        Intrinsics.checkNotNullParameter(popJumpType, "popJumpType");
        Intrinsics.checkNotNullParameter(popJumpLink, "popJumpLink");
        Intrinsics.checkNotNullParameter(popExtend, "popExtend");
        Intrinsics.checkNotNullParameter(popSort, "popSort");
        this.popID = i;
        this.popName = popName;
        this.popPosition = popPosition;
        this.popCountry = popCountry;
        this.popOs = popOs;
        this.popDevice = popDevice;
        this.popLanguage = popLanguage;
        this.popJumpType = popJumpType;
        this.popJumpLink = popJumpLink;
        this.popExtend = popExtend;
        this.popSort = popSort;
    }

    public final int getPopID() {
        return this.popID;
    }

    public final String getPopName() {
        return this.popName;
    }

    public final String getPopPosition() {
        return this.popPosition;
    }

    public final String getPopCountry() {
        return this.popCountry;
    }

    public final String getPopOs() {
        return this.popOs;
    }

    public final String getPopDevice() {
        return this.popDevice;
    }

    public final String getPopLanguage() {
        return this.popLanguage;
    }

    public final String getPopJumpType() {
        return this.popJumpType;
    }

    public final String getPopJumpLink() {
        return this.popJumpLink;
    }

    public final String getPopExtend() {
        return this.popExtend;
    }

    public final String getPopSort() {
        return this.popSort;
    }
}
