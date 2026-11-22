package com.wakeup.module.ai.bean;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: CacheDomain.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/wakeup/module/ai/bean/CacheDomain;", "", "model_type", "", "channel", "domain", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getModel_type", "()Ljava/lang/String;", "getChannel", "getDomain", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "module-ai_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CacheDomain {
    private final String channel;
    private final String domain;
    private final String model_type;

    public static /* synthetic */ CacheDomain copy$default(CacheDomain cacheDomain, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cacheDomain.model_type;
        }
        if ((i & 2) != 0) {
            str2 = cacheDomain.channel;
        }
        if ((i & 4) != 0) {
            str3 = cacheDomain.domain;
        }
        return cacheDomain.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getModel_type() {
        return this.model_type;
    }

    /* renamed from: component2, reason: from getter */
    public final String getChannel() {
        return this.channel;
    }

    /* renamed from: component3, reason: from getter */
    public final String getDomain() {
        return this.domain;
    }

    public final CacheDomain copy(String model_type, String channel, String domain) {
        Intrinsics.checkNotNullParameter(model_type, "model_type");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(domain, "domain");
        return new CacheDomain(model_type, channel, domain);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CacheDomain)) {
            return false;
        }
        CacheDomain cacheDomain = (CacheDomain) other;
        return Intrinsics.areEqual(this.model_type, cacheDomain.model_type) && Intrinsics.areEqual(this.channel, cacheDomain.channel) && Intrinsics.areEqual(this.domain, cacheDomain.domain);
    }

    public int hashCode() {
        return (((this.model_type.hashCode() * 31) + this.channel.hashCode()) * 31) + this.domain.hashCode();
    }

    public String toString() {
        return "CacheDomain(model_type=" + this.model_type + ", channel=" + this.channel + ", domain=" + this.domain + Separators.RPAREN;
    }

    public CacheDomain(String model_type, String channel, String domain) {
        Intrinsics.checkNotNullParameter(model_type, "model_type");
        Intrinsics.checkNotNullParameter(channel, "channel");
        Intrinsics.checkNotNullParameter(domain, "domain");
        this.model_type = model_type;
        this.channel = channel;
        this.domain = domain;
    }

    public final String getModel_type() {
        return this.model_type;
    }

    public final String getChannel() {
        return this.channel;
    }

    public final String getDomain() {
        return this.domain;
    }
}
