package com.yandex.mobile.ads.common;

import android.gov.nist.core.Separators;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u000f\u001a\u00020\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u000f\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0017\u0010\u000f\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u0007R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0016\u0010\r\u001a\u0004\b\u0017\u0010\u0007¨\u0006\u001b"}, d2 = {"Lcom/yandex/mobile/ads/common/AdInfo;", "", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "other", "", "equals", "(Ljava/lang/Object;)Z", "a", "Ljava/lang/String;", "getAdUnitId", HandleInvocationsFromAdViewer.KEY_AD_UNIT_ID, "Lcom/yandex/mobile/ads/common/AdSize;", "b", "Lcom/yandex/mobile/ads/common/AdSize;", "getAdSize", "()Lcom/yandex/mobile/ads/common/AdSize;", "adSize", "c", "getData", "data", "<init>", "(Ljava/lang/String;Lcom/yandex/mobile/ads/common/AdSize;Ljava/lang/String;)V", "mobileads_externalRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes5.dex */
public final class AdInfo {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String adUnitId;

    /* renamed from: b, reason: from kotlin metadata */
    private final AdSize adSize;

    /* renamed from: c, reason: from kotlin metadata */
    private final String data;

    public AdInfo(String adUnitId, AdSize adSize, String str) {
        Intrinsics.checkNotNullParameter(adUnitId, "adUnitId");
        this.adUnitId = adUnitId;
        this.adSize = adSize;
        this.data = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!Intrinsics.areEqual(AdInfo.class, other != null ? other.getClass() : null)) {
            return false;
        }
        Intrinsics.checkNotNull(other, "null cannot be cast to non-null type com.yandex.mobile.ads.common.AdInfo");
        AdInfo adInfo = (AdInfo) other;
        return Intrinsics.areEqual(this.adUnitId, adInfo.adUnitId) && Intrinsics.areEqual(this.adSize, adInfo.adSize) && Intrinsics.areEqual(this.data, adInfo.data);
    }

    public final AdSize getAdSize() {
        return this.adSize;
    }

    public final String getAdUnitId() {
        return this.adUnitId;
    }

    public final String getData() {
        return this.data;
    }

    public int hashCode() {
        int hashCode = this.adUnitId.hashCode() * 31;
        AdSize adSize = this.adSize;
        int hashCode2 = (hashCode + (adSize != null ? adSize.hashCode() : 0)) * 31;
        String str = this.data;
        return hashCode2 + (str != null ? str.hashCode() : 0);
    }

    public String toString() {
        String str = this.adUnitId;
        AdSize adSize = this.adSize;
        String adSize2 = adSize != null ? adSize.toString() : null;
        if (adSize2 == null) {
            adSize2 = "";
        }
        String str2 = this.data;
        return "AdSize (adUnitId: " + str + ", adSize: " + adSize2 + ", data: " + (str2 != null ? str2 : "") + Separators.RPAREN;
    }

    public /* synthetic */ AdInfo(String str, AdSize adSize, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, adSize, (i & 4) != 0 ? null : str2);
    }
}
