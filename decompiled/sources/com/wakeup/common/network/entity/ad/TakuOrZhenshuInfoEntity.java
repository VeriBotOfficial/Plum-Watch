package com.wakeup.common.network.entity.ad;

import android.gov.nist.core.Separators;
import com.heytap.mcssdk.constant.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvertInfoEntity.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u0011\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J/\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/wakeup/common/network/entity/ad/TakuOrZhenshuInfoEntity;", "", "appId", "", b.z, "adverInfoList", "", "Lcom/wakeup/common/network/entity/ad/AdvertInfoEntity;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getAppId", "()Ljava/lang/String;", "getAppKey", "getAdverInfoList", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TakuOrZhenshuInfoEntity {
    private final List<AdvertInfoEntity> adverInfoList;
    private final String appId;
    private final String appKey;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ TakuOrZhenshuInfoEntity copy$default(TakuOrZhenshuInfoEntity takuOrZhenshuInfoEntity, String str, String str2, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = takuOrZhenshuInfoEntity.appId;
        }
        if ((i & 2) != 0) {
            str2 = takuOrZhenshuInfoEntity.appKey;
        }
        if ((i & 4) != 0) {
            list = takuOrZhenshuInfoEntity.adverInfoList;
        }
        return takuOrZhenshuInfoEntity.copy(str, str2, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAppId() {
        return this.appId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAppKey() {
        return this.appKey;
    }

    public final List<AdvertInfoEntity> component3() {
        return this.adverInfoList;
    }

    public final TakuOrZhenshuInfoEntity copy(String appId, String appKey, List<AdvertInfoEntity> adverInfoList) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        return new TakuOrZhenshuInfoEntity(appId, appKey, adverInfoList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TakuOrZhenshuInfoEntity)) {
            return false;
        }
        TakuOrZhenshuInfoEntity takuOrZhenshuInfoEntity = (TakuOrZhenshuInfoEntity) other;
        return Intrinsics.areEqual(this.appId, takuOrZhenshuInfoEntity.appId) && Intrinsics.areEqual(this.appKey, takuOrZhenshuInfoEntity.appKey) && Intrinsics.areEqual(this.adverInfoList, takuOrZhenshuInfoEntity.adverInfoList);
    }

    public int hashCode() {
        int hashCode = ((this.appId.hashCode() * 31) + this.appKey.hashCode()) * 31;
        List<AdvertInfoEntity> list = this.adverInfoList;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public String toString() {
        return "TakuOrZhenshuInfoEntity(appId=" + this.appId + ", appKey=" + this.appKey + ", adverInfoList=" + this.adverInfoList + Separators.RPAREN;
    }

    public TakuOrZhenshuInfoEntity(String appId, String appKey, List<AdvertInfoEntity> list) {
        Intrinsics.checkNotNullParameter(appId, "appId");
        Intrinsics.checkNotNullParameter(appKey, "appKey");
        this.appId = appId;
        this.appKey = appKey;
        this.adverInfoList = list;
    }

    public final String getAppId() {
        return this.appId;
    }

    public final String getAppKey() {
        return this.appKey;
    }

    public final List<AdvertInfoEntity> getAdverInfoList() {
        return this.adverInfoList;
    }
}
