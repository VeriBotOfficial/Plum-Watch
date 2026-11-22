package com.wakeup.common.network.entity.domain;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DomainConfig.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003J7\u0010\u0019\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001f\u001a\u00020\u0004HÖ\u0001R(\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0007X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015¨\u0006 "}, d2 = {"Lcom/wakeup/common/network/entity/domain/DomainConfig;", "Ljava/io/Serializable;", "requestConfig", "", "", "Lcom/wakeup/common/network/entity/domain/DomainBean;", "maxConcurrencyAndroid", "", "androidBundleMonitor", "Lcom/wakeup/common/network/entity/domain/AndroidBundleMonitor;", "<init>", "(Ljava/util/Map;ILcom/wakeup/common/network/entity/domain/AndroidBundleMonitor;)V", "getRequestConfig", "()Ljava/util/Map;", "setRequestConfig", "(Ljava/util/Map;)V", "getMaxConcurrencyAndroid", "()I", "setMaxConcurrencyAndroid", "(I)V", "getAndroidBundleMonitor", "()Lcom/wakeup/common/network/entity/domain/AndroidBundleMonitor;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DomainConfig implements Serializable {
    private final AndroidBundleMonitor androidBundleMonitor;
    private int maxConcurrencyAndroid;
    private Map<String, DomainBean> requestConfig;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DomainConfig copy$default(DomainConfig domainConfig, Map map, int i, AndroidBundleMonitor androidBundleMonitor, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            map = domainConfig.requestConfig;
        }
        if ((i2 & 2) != 0) {
            i = domainConfig.maxConcurrencyAndroid;
        }
        if ((i2 & 4) != 0) {
            androidBundleMonitor = domainConfig.androidBundleMonitor;
        }
        return domainConfig.copy(map, i, androidBundleMonitor);
    }

    public final Map<String, DomainBean> component1() {
        return this.requestConfig;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMaxConcurrencyAndroid() {
        return this.maxConcurrencyAndroid;
    }

    /* renamed from: component3, reason: from getter */
    public final AndroidBundleMonitor getAndroidBundleMonitor() {
        return this.androidBundleMonitor;
    }

    public final DomainConfig copy(Map<String, DomainBean> requestConfig, int maxConcurrencyAndroid, AndroidBundleMonitor androidBundleMonitor) {
        return new DomainConfig(requestConfig, maxConcurrencyAndroid, androidBundleMonitor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DomainConfig)) {
            return false;
        }
        DomainConfig domainConfig = (DomainConfig) other;
        return Intrinsics.areEqual(this.requestConfig, domainConfig.requestConfig) && this.maxConcurrencyAndroid == domainConfig.maxConcurrencyAndroid && Intrinsics.areEqual(this.androidBundleMonitor, domainConfig.androidBundleMonitor);
    }

    public int hashCode() {
        Map<String, DomainBean> map = this.requestConfig;
        int hashCode = (((map == null ? 0 : map.hashCode()) * 31) + Integer.hashCode(this.maxConcurrencyAndroid)) * 31;
        AndroidBundleMonitor androidBundleMonitor = this.androidBundleMonitor;
        return hashCode + (androidBundleMonitor != null ? androidBundleMonitor.hashCode() : 0);
    }

    public String toString() {
        return "DomainConfig(requestConfig=" + this.requestConfig + ", maxConcurrencyAndroid=" + this.maxConcurrencyAndroid + ", androidBundleMonitor=" + this.androidBundleMonitor + Separators.RPAREN;
    }

    public DomainConfig(Map<String, DomainBean> map, int i, AndroidBundleMonitor androidBundleMonitor) {
        this.requestConfig = map;
        this.maxConcurrencyAndroid = i;
        this.androidBundleMonitor = androidBundleMonitor;
    }

    public /* synthetic */ DomainConfig(Map map, int i, AndroidBundleMonitor androidBundleMonitor, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, (i2 & 2) != 0 ? 0 : i, (i2 & 4) != 0 ? null : androidBundleMonitor);
    }

    public final Map<String, DomainBean> getRequestConfig() {
        return this.requestConfig;
    }

    public final void setRequestConfig(Map<String, DomainBean> map) {
        this.requestConfig = map;
    }

    public final int getMaxConcurrencyAndroid() {
        return this.maxConcurrencyAndroid;
    }

    public final void setMaxConcurrencyAndroid(int i) {
        this.maxConcurrencyAndroid = i;
    }

    public final AndroidBundleMonitor getAndroidBundleMonitor() {
        return this.androidBundleMonitor;
    }
}
