package com.wakeup.howear.sharevm.adsource;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdSourceConfig.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\bHÆ\u0003J-\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lcom/wakeup/howear/sharevm/adsource/AdSourceConfig;", "", "type", "Lcom/wakeup/howear/sharevm/adsource/AdType;", "placementIds", "", "", "dataSource", "Lcom/wakeup/howear/sharevm/adsource/INativeAdDataSource;", "<init>", "(Lcom/wakeup/howear/sharevm/adsource/AdType;Ljava/util/List;Lcom/wakeup/howear/sharevm/adsource/INativeAdDataSource;)V", "getType", "()Lcom/wakeup/howear/sharevm/adsource/AdType;", "getPlacementIds", "()Ljava/util/List;", "getDataSource", "()Lcom/wakeup/howear/sharevm/adsource/INativeAdDataSource;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AdSourceConfig {
    private final INativeAdDataSource dataSource;
    private final List<String> placementIds;
    private final AdType type;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AdSourceConfig copy$default(AdSourceConfig adSourceConfig, AdType adType, List list, INativeAdDataSource iNativeAdDataSource, int i, Object obj) {
        if ((i & 1) != 0) {
            adType = adSourceConfig.type;
        }
        if ((i & 2) != 0) {
            list = adSourceConfig.placementIds;
        }
        if ((i & 4) != 0) {
            iNativeAdDataSource = adSourceConfig.dataSource;
        }
        return adSourceConfig.copy(adType, list, iNativeAdDataSource);
    }

    /* renamed from: component1, reason: from getter */
    public final AdType getType() {
        return this.type;
    }

    public final List<String> component2() {
        return this.placementIds;
    }

    /* renamed from: component3, reason: from getter */
    public final INativeAdDataSource getDataSource() {
        return this.dataSource;
    }

    public final AdSourceConfig copy(AdType type, List<String> placementIds, INativeAdDataSource dataSource) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(placementIds, "placementIds");
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        return new AdSourceConfig(type, placementIds, dataSource);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdSourceConfig)) {
            return false;
        }
        AdSourceConfig adSourceConfig = (AdSourceConfig) other;
        return this.type == adSourceConfig.type && Intrinsics.areEqual(this.placementIds, adSourceConfig.placementIds) && Intrinsics.areEqual(this.dataSource, adSourceConfig.dataSource);
    }

    public int hashCode() {
        return (((this.type.hashCode() * 31) + this.placementIds.hashCode()) * 31) + this.dataSource.hashCode();
    }

    public String toString() {
        return "AdSourceConfig(type=" + this.type + ", placementIds=" + this.placementIds + ", dataSource=" + this.dataSource + Separators.RPAREN;
    }

    public AdSourceConfig(AdType type, List<String> placementIds, INativeAdDataSource dataSource) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(placementIds, "placementIds");
        Intrinsics.checkNotNullParameter(dataSource, "dataSource");
        this.type = type;
        this.placementIds = placementIds;
        this.dataSource = dataSource;
    }

    public final AdType getType() {
        return this.type;
    }

    public /* synthetic */ AdSourceConfig(AdType adType, ArrayList arrayList, INativeAdDataSource iNativeAdDataSource, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(adType, (i & 2) != 0 ? new ArrayList() : arrayList, iNativeAdDataSource);
    }

    public final List<String> getPlacementIds() {
        return this.placementIds;
    }

    public final INativeAdDataSource getDataSource() {
        return this.dataSource;
    }
}
