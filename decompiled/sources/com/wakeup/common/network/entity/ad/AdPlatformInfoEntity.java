package com.wakeup.common.network.entity.ad;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvertInfoEntity.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0013\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u0014\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0010J8\u0010\u0015\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0016J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\bHÖ\u0001J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/wakeup/common/network/entity/ad/AdPlatformInfoEntity;", "", "takuOrZhenshuInfo", "Lcom/wakeup/common/network/entity/ad/TakuOrZhenshuInfoEntity;", "infomecialZoons", "", "Lcom/wakeup/common/network/entity/ad/InfomecialZoonsEntity;", "feedAdvertisingNum", "", "<init>", "(Lcom/wakeup/common/network/entity/ad/TakuOrZhenshuInfoEntity;Ljava/util/List;Ljava/lang/Integer;)V", "getTakuOrZhenshuInfo", "()Lcom/wakeup/common/network/entity/ad/TakuOrZhenshuInfoEntity;", "getInfomecialZoons", "()Ljava/util/List;", "getFeedAdvertisingNum", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Lcom/wakeup/common/network/entity/ad/TakuOrZhenshuInfoEntity;Ljava/util/List;Ljava/lang/Integer;)Lcom/wakeup/common/network/entity/ad/AdPlatformInfoEntity;", "equals", "", "other", "hashCode", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AdPlatformInfoEntity {
    private final Integer feedAdvertisingNum;
    private final List<InfomecialZoonsEntity> infomecialZoons;
    private final TakuOrZhenshuInfoEntity takuOrZhenshuInfo;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AdPlatformInfoEntity copy$default(AdPlatformInfoEntity adPlatformInfoEntity, TakuOrZhenshuInfoEntity takuOrZhenshuInfoEntity, List list, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            takuOrZhenshuInfoEntity = adPlatformInfoEntity.takuOrZhenshuInfo;
        }
        if ((i & 2) != 0) {
            list = adPlatformInfoEntity.infomecialZoons;
        }
        if ((i & 4) != 0) {
            num = adPlatformInfoEntity.feedAdvertisingNum;
        }
        return adPlatformInfoEntity.copy(takuOrZhenshuInfoEntity, list, num);
    }

    /* renamed from: component1, reason: from getter */
    public final TakuOrZhenshuInfoEntity getTakuOrZhenshuInfo() {
        return this.takuOrZhenshuInfo;
    }

    public final List<InfomecialZoonsEntity> component2() {
        return this.infomecialZoons;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getFeedAdvertisingNum() {
        return this.feedAdvertisingNum;
    }

    public final AdPlatformInfoEntity copy(TakuOrZhenshuInfoEntity takuOrZhenshuInfo, List<InfomecialZoonsEntity> infomecialZoons, Integer feedAdvertisingNum) {
        return new AdPlatformInfoEntity(takuOrZhenshuInfo, infomecialZoons, feedAdvertisingNum);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdPlatformInfoEntity)) {
            return false;
        }
        AdPlatformInfoEntity adPlatformInfoEntity = (AdPlatformInfoEntity) other;
        return Intrinsics.areEqual(this.takuOrZhenshuInfo, adPlatformInfoEntity.takuOrZhenshuInfo) && Intrinsics.areEqual(this.infomecialZoons, adPlatformInfoEntity.infomecialZoons) && Intrinsics.areEqual(this.feedAdvertisingNum, adPlatformInfoEntity.feedAdvertisingNum);
    }

    public int hashCode() {
        TakuOrZhenshuInfoEntity takuOrZhenshuInfoEntity = this.takuOrZhenshuInfo;
        int hashCode = (takuOrZhenshuInfoEntity == null ? 0 : takuOrZhenshuInfoEntity.hashCode()) * 31;
        List<InfomecialZoonsEntity> list = this.infomecialZoons;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Integer num = this.feedAdvertisingNum;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "AdPlatformInfoEntity(takuOrZhenshuInfo=" + this.takuOrZhenshuInfo + ", infomecialZoons=" + this.infomecialZoons + ", feedAdvertisingNum=" + this.feedAdvertisingNum + Separators.RPAREN;
    }

    public AdPlatformInfoEntity(TakuOrZhenshuInfoEntity takuOrZhenshuInfoEntity, List<InfomecialZoonsEntity> list, Integer num) {
        this.takuOrZhenshuInfo = takuOrZhenshuInfoEntity;
        this.infomecialZoons = list;
        this.feedAdvertisingNum = num;
    }

    public final TakuOrZhenshuInfoEntity getTakuOrZhenshuInfo() {
        return this.takuOrZhenshuInfo;
    }

    public /* synthetic */ AdPlatformInfoEntity(TakuOrZhenshuInfoEntity takuOrZhenshuInfoEntity, ArrayList arrayList, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(takuOrZhenshuInfoEntity, (i & 2) != 0 ? new ArrayList() : arrayList, (i & 4) != 0 ? 1 : num);
    }

    public final List<InfomecialZoonsEntity> getInfomecialZoons() {
        return this.infomecialZoons;
    }

    public final Integer getFeedAdvertisingNum() {
        return this.feedAdvertisingNum;
    }
}
