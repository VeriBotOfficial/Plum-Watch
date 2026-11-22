package com.wakeup.common.network.entity.domain;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DomainConfig.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/wakeup/common/network/entity/domain/DomainBean;", "Ljava/io/Serializable;", "url", "", "timeOut", "", "<init>", "(Ljava/lang/String;F)V", "getUrl", "()Ljava/lang/String;", "setUrl", "(Ljava/lang/String;)V", "getTimeOut", "()F", "setTimeOut", "(F)V", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DomainBean implements Serializable {
    private float timeOut;
    private String url;

    /* JADX WARN: Multi-variable type inference failed */
    public DomainBean() {
        this(null, 0.0f, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ DomainBean copy$default(DomainBean domainBean, String str, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            str = domainBean.url;
        }
        if ((i & 2) != 0) {
            f = domainBean.timeOut;
        }
        return domainBean.copy(str, f);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component2, reason: from getter */
    public final float getTimeOut() {
        return this.timeOut;
    }

    public final DomainBean copy(String url, float timeOut) {
        Intrinsics.checkNotNullParameter(url, "url");
        return new DomainBean(url, timeOut);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DomainBean)) {
            return false;
        }
        DomainBean domainBean = (DomainBean) other;
        return Intrinsics.areEqual(this.url, domainBean.url) && Float.compare(this.timeOut, domainBean.timeOut) == 0;
    }

    public int hashCode() {
        return (this.url.hashCode() * 31) + Float.hashCode(this.timeOut);
    }

    public String toString() {
        return "DomainBean(url=" + this.url + ", timeOut=" + this.timeOut + Separators.RPAREN;
    }

    public DomainBean(String url, float f) {
        Intrinsics.checkNotNullParameter(url, "url");
        this.url = url;
        this.timeOut = f;
    }

    public /* synthetic */ DomainBean(String str, float f, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? 0.0f : f);
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setUrl(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.url = str;
    }

    public final float getTimeOut() {
        return this.timeOut;
    }

    public final void setTimeOut(float f) {
        this.timeOut = f;
    }
}
