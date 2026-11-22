package com.wakeup.feature.health.dashboard;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: HdContent.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J+\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/wakeup/feature/health/dashboard/HdAction;", "", "prefix", "", "linkText", "linkType", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getPrefix", "()Ljava/lang/String;", "getLinkText", "getLinkType", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "feature-health_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class HdAction {
    public static final int $stable = 0;
    private final String linkText;
    private final String linkType;
    private final String prefix;

    public static /* synthetic */ HdAction copy$default(HdAction hdAction, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = hdAction.prefix;
        }
        if ((i & 2) != 0) {
            str2 = hdAction.linkText;
        }
        if ((i & 4) != 0) {
            str3 = hdAction.linkType;
        }
        return hdAction.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getPrefix() {
        return this.prefix;
    }

    /* renamed from: component2, reason: from getter */
    public final String getLinkText() {
        return this.linkText;
    }

    /* renamed from: component3, reason: from getter */
    public final String getLinkType() {
        return this.linkType;
    }

    public final HdAction copy(String prefix, String linkText, String linkType) {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        return new HdAction(prefix, linkText, linkType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HdAction)) {
            return false;
        }
        HdAction hdAction = (HdAction) other;
        return Intrinsics.areEqual(this.prefix, hdAction.prefix) && Intrinsics.areEqual(this.linkText, hdAction.linkText) && Intrinsics.areEqual(this.linkType, hdAction.linkType);
    }

    public int hashCode() {
        int hashCode = this.prefix.hashCode() * 31;
        String str = this.linkText;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.linkType;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "HdAction(prefix=" + this.prefix + ", linkText=" + this.linkText + ", linkType=" + this.linkType + Separators.RPAREN;
    }

    public HdAction(String prefix, String str, String str2) {
        Intrinsics.checkNotNullParameter(prefix, "prefix");
        this.prefix = prefix;
        this.linkText = str;
        this.linkType = str2;
    }

    public /* synthetic */ HdAction(String str, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3);
    }

    public final String getLinkText() {
        return this.linkText;
    }

    public final String getLinkType() {
        return this.linkType;
    }

    public final String getPrefix() {
        return this.prefix;
    }
}
