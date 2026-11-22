package com.wakeup.common.network.entity.ad;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvertInfoEntity.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J9\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\nR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\n¨\u0006\u0019"}, d2 = {"Lcom/wakeup/common/network/entity/ad/AdvertInfoEntity;", "", "advertisingSpaceCode", "", "advertisingSpaceName", "appConventionCode", "appConventionName", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAdvertisingSpaceCode", "()Ljava/lang/String;", "getAdvertisingSpaceName", "getAppConventionCode", "getAppConventionName", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AdvertInfoEntity {
    private final String advertisingSpaceCode;
    private final String advertisingSpaceName;
    private final String appConventionCode;
    private final String appConventionName;

    public static /* synthetic */ AdvertInfoEntity copy$default(AdvertInfoEntity advertInfoEntity, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = advertInfoEntity.advertisingSpaceCode;
        }
        if ((i & 2) != 0) {
            str2 = advertInfoEntity.advertisingSpaceName;
        }
        if ((i & 4) != 0) {
            str3 = advertInfoEntity.appConventionCode;
        }
        if ((i & 8) != 0) {
            str4 = advertInfoEntity.appConventionName;
        }
        return advertInfoEntity.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAdvertisingSpaceCode() {
        return this.advertisingSpaceCode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAdvertisingSpaceName() {
        return this.advertisingSpaceName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAppConventionCode() {
        return this.appConventionCode;
    }

    /* renamed from: component4, reason: from getter */
    public final String getAppConventionName() {
        return this.appConventionName;
    }

    public final AdvertInfoEntity copy(String advertisingSpaceCode, String advertisingSpaceName, String appConventionCode, String appConventionName) {
        return new AdvertInfoEntity(advertisingSpaceCode, advertisingSpaceName, appConventionCode, appConventionName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdvertInfoEntity)) {
            return false;
        }
        AdvertInfoEntity advertInfoEntity = (AdvertInfoEntity) other;
        return Intrinsics.areEqual(this.advertisingSpaceCode, advertInfoEntity.advertisingSpaceCode) && Intrinsics.areEqual(this.advertisingSpaceName, advertInfoEntity.advertisingSpaceName) && Intrinsics.areEqual(this.appConventionCode, advertInfoEntity.appConventionCode) && Intrinsics.areEqual(this.appConventionName, advertInfoEntity.appConventionName);
    }

    public int hashCode() {
        String str = this.advertisingSpaceCode;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.advertisingSpaceName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.appConventionCode;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.appConventionName;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public String toString() {
        return "AdvertInfoEntity(advertisingSpaceCode=" + this.advertisingSpaceCode + ", advertisingSpaceName=" + this.advertisingSpaceName + ", appConventionCode=" + this.appConventionCode + ", appConventionName=" + this.appConventionName + Separators.RPAREN;
    }

    public AdvertInfoEntity(String str, String str2, String str3, String str4) {
        this.advertisingSpaceCode = str;
        this.advertisingSpaceName = str2;
        this.appConventionCode = str3;
        this.appConventionName = str4;
    }

    public final String getAdvertisingSpaceCode() {
        return this.advertisingSpaceCode;
    }

    public final String getAdvertisingSpaceName() {
        return this.advertisingSpaceName;
    }

    public final String getAppConventionCode() {
        return this.appConventionCode;
    }

    public final String getAppConventionName() {
        return this.appConventionName;
    }
}
