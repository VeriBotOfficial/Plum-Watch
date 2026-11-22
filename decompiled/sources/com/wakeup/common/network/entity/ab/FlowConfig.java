package com.wakeup.common.network.entity.ab;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExperimentEntity.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0003J7\u0010\u0011\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lcom/wakeup/common/network/entity/ab/FlowConfig;", "", "blacklist", "Lcom/wakeup/common/network/entity/ab/Rule;", "whitelist", "", "normalTraffic", "<init>", "(Lcom/wakeup/common/network/entity/ab/Rule;Ljava/util/List;Ljava/util/List;)V", "getBlacklist", "()Lcom/wakeup/common/network/entity/ab/Rule;", "getWhitelist", "()Ljava/util/List;", "getNormalTraffic", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class FlowConfig {
    private final Rule blacklist;
    private final List<Rule> normalTraffic;
    private final List<Rule> whitelist;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ FlowConfig copy$default(FlowConfig flowConfig, Rule rule, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            rule = flowConfig.blacklist;
        }
        if ((i & 2) != 0) {
            list = flowConfig.whitelist;
        }
        if ((i & 4) != 0) {
            list2 = flowConfig.normalTraffic;
        }
        return flowConfig.copy(rule, list, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final Rule getBlacklist() {
        return this.blacklist;
    }

    public final List<Rule> component2() {
        return this.whitelist;
    }

    public final List<Rule> component3() {
        return this.normalTraffic;
    }

    public final FlowConfig copy(Rule blacklist, List<Rule> whitelist, List<Rule> normalTraffic) {
        Intrinsics.checkNotNullParameter(normalTraffic, "normalTraffic");
        return new FlowConfig(blacklist, whitelist, normalTraffic);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FlowConfig)) {
            return false;
        }
        FlowConfig flowConfig = (FlowConfig) other;
        return Intrinsics.areEqual(this.blacklist, flowConfig.blacklist) && Intrinsics.areEqual(this.whitelist, flowConfig.whitelist) && Intrinsics.areEqual(this.normalTraffic, flowConfig.normalTraffic);
    }

    public int hashCode() {
        Rule rule = this.blacklist;
        int hashCode = (rule == null ? 0 : rule.hashCode()) * 31;
        List<Rule> list = this.whitelist;
        return ((hashCode + (list != null ? list.hashCode() : 0)) * 31) + this.normalTraffic.hashCode();
    }

    public String toString() {
        return "FlowConfig(blacklist=" + this.blacklist + ", whitelist=" + this.whitelist + ", normalTraffic=" + this.normalTraffic + Separators.RPAREN;
    }

    public FlowConfig(Rule rule, List<Rule> list, List<Rule> normalTraffic) {
        Intrinsics.checkNotNullParameter(normalTraffic, "normalTraffic");
        this.blacklist = rule;
        this.whitelist = list;
        this.normalTraffic = normalTraffic;
    }

    public /* synthetic */ FlowConfig(Rule rule, List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : rule, (i & 2) != 0 ? null : list, list2);
    }

    public final Rule getBlacklist() {
        return this.blacklist;
    }

    public final List<Rule> getWhitelist() {
        return this.whitelist;
    }

    public final List<Rule> getNormalTraffic() {
        return this.normalTraffic;
    }
}
