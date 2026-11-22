package com.wakeup.common.network.entity.opts;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OptsJumpModel.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J'\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u001a\u0010\u000e\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000f\u0010\n\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\n\"\u0004\b\u0014\u0010\u0011¨\u0006\u001f"}, d2 = {"Lcom/wakeup/common/network/entity/opts/OptsJumpModel;", "Ljava/io/Serializable;", "jumpType", "", "jumpInfo", "", "extendInfo", "<init>", "(ILjava/lang/String;Ljava/lang/String;)V", "getJumpType", "()I", "getJumpInfo", "()Ljava/lang/String;", "getExtendInfo", "type", "getType", "setType", "(I)V", "adId", "getAdId", "setAdId", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class OptsJumpModel implements Serializable {
    private int adId;
    private final String extendInfo;
    private final String jumpInfo;
    private final int jumpType;
    private int type;

    public static /* synthetic */ OptsJumpModel copy$default(OptsJumpModel optsJumpModel, int i, String str, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = optsJumpModel.jumpType;
        }
        if ((i2 & 2) != 0) {
            str = optsJumpModel.jumpInfo;
        }
        if ((i2 & 4) != 0) {
            str2 = optsJumpModel.extendInfo;
        }
        return optsJumpModel.copy(i, str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getJumpType() {
        return this.jumpType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getJumpInfo() {
        return this.jumpInfo;
    }

    /* renamed from: component3, reason: from getter */
    public final String getExtendInfo() {
        return this.extendInfo;
    }

    public final OptsJumpModel copy(int jumpType, String jumpInfo, String extendInfo) {
        Intrinsics.checkNotNullParameter(jumpInfo, "jumpInfo");
        Intrinsics.checkNotNullParameter(extendInfo, "extendInfo");
        return new OptsJumpModel(jumpType, jumpInfo, extendInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OptsJumpModel)) {
            return false;
        }
        OptsJumpModel optsJumpModel = (OptsJumpModel) other;
        return this.jumpType == optsJumpModel.jumpType && Intrinsics.areEqual(this.jumpInfo, optsJumpModel.jumpInfo) && Intrinsics.areEqual(this.extendInfo, optsJumpModel.extendInfo);
    }

    public int hashCode() {
        return (((Integer.hashCode(this.jumpType) * 31) + this.jumpInfo.hashCode()) * 31) + this.extendInfo.hashCode();
    }

    public String toString() {
        return "OptsJumpModel(jumpType=" + this.jumpType + ", jumpInfo=" + this.jumpInfo + ", extendInfo=" + this.extendInfo + Separators.RPAREN;
    }

    public OptsJumpModel(int i, String jumpInfo, String extendInfo) {
        Intrinsics.checkNotNullParameter(jumpInfo, "jumpInfo");
        Intrinsics.checkNotNullParameter(extendInfo, "extendInfo");
        this.jumpType = i;
        this.jumpInfo = jumpInfo;
        this.extendInfo = extendInfo;
        this.type = -1;
        this.adId = -1;
    }

    public final int getJumpType() {
        return this.jumpType;
    }

    public final String getJumpInfo() {
        return this.jumpInfo;
    }

    public final String getExtendInfo() {
        return this.extendInfo;
    }

    public final int getType() {
        return this.type;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final int getAdId() {
        return this.adId;
    }

    public final void setAdId(int i) {
        this.adId = i;
    }
}
