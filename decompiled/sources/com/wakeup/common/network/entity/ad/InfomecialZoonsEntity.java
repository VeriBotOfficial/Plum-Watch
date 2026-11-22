package com.wakeup.common.network.entity.ad;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvertInfoEntity.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0007HÆ\u0003J1\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/wakeup/common/network/entity/ad/InfomecialZoonsEntity;", "", "infomecialZoonCode", "", "sdkCode", "clientType", "incentive", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V", "getInfomecialZoonCode", "()Ljava/lang/String;", "getSdkCode", "getClientType", "getIncentive", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class InfomecialZoonsEntity {
    private final String clientType;
    private final boolean incentive;
    private final String infomecialZoonCode;
    private final String sdkCode;

    public static /* synthetic */ InfomecialZoonsEntity copy$default(InfomecialZoonsEntity infomecialZoonsEntity, String str, String str2, String str3, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = infomecialZoonsEntity.infomecialZoonCode;
        }
        if ((i & 2) != 0) {
            str2 = infomecialZoonsEntity.sdkCode;
        }
        if ((i & 4) != 0) {
            str3 = infomecialZoonsEntity.clientType;
        }
        if ((i & 8) != 0) {
            z = infomecialZoonsEntity.incentive;
        }
        return infomecialZoonsEntity.copy(str, str2, str3, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getInfomecialZoonCode() {
        return this.infomecialZoonCode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSdkCode() {
        return this.sdkCode;
    }

    /* renamed from: component3, reason: from getter */
    public final String getClientType() {
        return this.clientType;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIncentive() {
        return this.incentive;
    }

    public final InfomecialZoonsEntity copy(String infomecialZoonCode, String sdkCode, String clientType, boolean incentive) {
        Intrinsics.checkNotNullParameter(infomecialZoonCode, "infomecialZoonCode");
        Intrinsics.checkNotNullParameter(sdkCode, "sdkCode");
        Intrinsics.checkNotNullParameter(clientType, "clientType");
        return new InfomecialZoonsEntity(infomecialZoonCode, sdkCode, clientType, incentive);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof InfomecialZoonsEntity)) {
            return false;
        }
        InfomecialZoonsEntity infomecialZoonsEntity = (InfomecialZoonsEntity) other;
        return Intrinsics.areEqual(this.infomecialZoonCode, infomecialZoonsEntity.infomecialZoonCode) && Intrinsics.areEqual(this.sdkCode, infomecialZoonsEntity.sdkCode) && Intrinsics.areEqual(this.clientType, infomecialZoonsEntity.clientType) && this.incentive == infomecialZoonsEntity.incentive;
    }

    public int hashCode() {
        return (((((this.infomecialZoonCode.hashCode() * 31) + this.sdkCode.hashCode()) * 31) + this.clientType.hashCode()) * 31) + Boolean.hashCode(this.incentive);
    }

    public String toString() {
        return "InfomecialZoonsEntity(infomecialZoonCode=" + this.infomecialZoonCode + ", sdkCode=" + this.sdkCode + ", clientType=" + this.clientType + ", incentive=" + this.incentive + Separators.RPAREN;
    }

    public InfomecialZoonsEntity(String infomecialZoonCode, String sdkCode, String clientType, boolean z) {
        Intrinsics.checkNotNullParameter(infomecialZoonCode, "infomecialZoonCode");
        Intrinsics.checkNotNullParameter(sdkCode, "sdkCode");
        Intrinsics.checkNotNullParameter(clientType, "clientType");
        this.infomecialZoonCode = infomecialZoonCode;
        this.sdkCode = sdkCode;
        this.clientType = clientType;
        this.incentive = z;
    }

    public final String getInfomecialZoonCode() {
        return this.infomecialZoonCode;
    }

    public final String getSdkCode() {
        return this.sdkCode;
    }

    public final String getClientType() {
        return this.clientType;
    }

    public final boolean getIncentive() {
        return this.incentive;
    }
}
