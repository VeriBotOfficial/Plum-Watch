package com.wakeup.common.network.entity.aipay;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AiPayBeans.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/wakeup/common/network/entity/aipay/AiEnergyPrivilege;", "", "ruleContentType", "", "ruleContentTypeName", "icon", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getRuleContentType", "()Ljava/lang/String;", "getRuleContentTypeName", "getIcon", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AiEnergyPrivilege {
    private final String icon;
    private final String ruleContentType;
    private final String ruleContentTypeName;

    public static /* synthetic */ AiEnergyPrivilege copy$default(AiEnergyPrivilege aiEnergyPrivilege, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aiEnergyPrivilege.ruleContentType;
        }
        if ((i & 2) != 0) {
            str2 = aiEnergyPrivilege.ruleContentTypeName;
        }
        if ((i & 4) != 0) {
            str3 = aiEnergyPrivilege.icon;
        }
        return aiEnergyPrivilege.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getRuleContentType() {
        return this.ruleContentType;
    }

    /* renamed from: component2, reason: from getter */
    public final String getRuleContentTypeName() {
        return this.ruleContentTypeName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    public final AiEnergyPrivilege copy(String ruleContentType, String ruleContentTypeName, String icon) {
        Intrinsics.checkNotNullParameter(ruleContentType, "ruleContentType");
        Intrinsics.checkNotNullParameter(ruleContentTypeName, "ruleContentTypeName");
        Intrinsics.checkNotNullParameter(icon, "icon");
        return new AiEnergyPrivilege(ruleContentType, ruleContentTypeName, icon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiEnergyPrivilege)) {
            return false;
        }
        AiEnergyPrivilege aiEnergyPrivilege = (AiEnergyPrivilege) other;
        return Intrinsics.areEqual(this.ruleContentType, aiEnergyPrivilege.ruleContentType) && Intrinsics.areEqual(this.ruleContentTypeName, aiEnergyPrivilege.ruleContentTypeName) && Intrinsics.areEqual(this.icon, aiEnergyPrivilege.icon);
    }

    public int hashCode() {
        return (((this.ruleContentType.hashCode() * 31) + this.ruleContentTypeName.hashCode()) * 31) + this.icon.hashCode();
    }

    public String toString() {
        return "AiEnergyPrivilege(ruleContentType=" + this.ruleContentType + ", ruleContentTypeName=" + this.ruleContentTypeName + ", icon=" + this.icon + Separators.RPAREN;
    }

    public AiEnergyPrivilege(String ruleContentType, String ruleContentTypeName, String icon) {
        Intrinsics.checkNotNullParameter(ruleContentType, "ruleContentType");
        Intrinsics.checkNotNullParameter(ruleContentTypeName, "ruleContentTypeName");
        Intrinsics.checkNotNullParameter(icon, "icon");
        this.ruleContentType = ruleContentType;
        this.ruleContentTypeName = ruleContentTypeName;
        this.icon = icon;
    }

    public final String getRuleContentType() {
        return this.ruleContentType;
    }

    public final String getRuleContentTypeName() {
        return this.ruleContentTypeName;
    }

    public final String getIcon() {
        return this.icon;
    }
}
