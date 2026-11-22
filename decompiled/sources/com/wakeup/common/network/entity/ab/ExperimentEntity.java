package com.wakeup.common.network.entity.ab;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: ExperimentEntity.kt */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003\u0012\u0006\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0002\u0010\u0013JD\u0010\u0019\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001aJ\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\n\n\u0002\u0010\u0014\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, d2 = {"Lcom/wakeup/common/network/entity/ab/ExperimentEntity;", "", "domains", "", "Lcom/wakeup/common/network/entity/ab/Domain;", "experimentIds", "", "experimentConfigs", "Lorg/json/JSONObject;", "reqTime", "", "<init>", "(Ljava/util/List;Ljava/util/List;Lorg/json/JSONObject;Ljava/lang/Long;)V", "getDomains", "()Ljava/util/List;", "getExperimentIds", "getExperimentConfigs", "()Lorg/json/JSONObject;", "getReqTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "copy", "(Ljava/util/List;Ljava/util/List;Lorg/json/JSONObject;Ljava/lang/Long;)Lcom/wakeup/common/network/entity/ab/ExperimentEntity;", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ExperimentEntity {
    private final List<Domain> domains;
    private final JSONObject experimentConfigs;
    private final List<String> experimentIds;
    private final Long reqTime;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ExperimentEntity copy$default(ExperimentEntity experimentEntity, List list, List list2, JSONObject jSONObject, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            list = experimentEntity.domains;
        }
        if ((i & 2) != 0) {
            list2 = experimentEntity.experimentIds;
        }
        if ((i & 4) != 0) {
            jSONObject = experimentEntity.experimentConfigs;
        }
        if ((i & 8) != 0) {
            l = experimentEntity.reqTime;
        }
        return experimentEntity.copy(list, list2, jSONObject, l);
    }

    public final List<Domain> component1() {
        return this.domains;
    }

    public final List<String> component2() {
        return this.experimentIds;
    }

    /* renamed from: component3, reason: from getter */
    public final JSONObject getExperimentConfigs() {
        return this.experimentConfigs;
    }

    /* renamed from: component4, reason: from getter */
    public final Long getReqTime() {
        return this.reqTime;
    }

    public final ExperimentEntity copy(List<Domain> domains, List<String> experimentIds, JSONObject experimentConfigs, Long reqTime) {
        Intrinsics.checkNotNullParameter(domains, "domains");
        Intrinsics.checkNotNullParameter(experimentIds, "experimentIds");
        Intrinsics.checkNotNullParameter(experimentConfigs, "experimentConfigs");
        return new ExperimentEntity(domains, experimentIds, experimentConfigs, reqTime);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ExperimentEntity)) {
            return false;
        }
        ExperimentEntity experimentEntity = (ExperimentEntity) other;
        return Intrinsics.areEqual(this.domains, experimentEntity.domains) && Intrinsics.areEqual(this.experimentIds, experimentEntity.experimentIds) && Intrinsics.areEqual(this.experimentConfigs, experimentEntity.experimentConfigs) && Intrinsics.areEqual(this.reqTime, experimentEntity.reqTime);
    }

    public int hashCode() {
        int hashCode = ((((this.domains.hashCode() * 31) + this.experimentIds.hashCode()) * 31) + this.experimentConfigs.hashCode()) * 31;
        Long l = this.reqTime;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public String toString() {
        return "ExperimentEntity(domains=" + this.domains + ", experimentIds=" + this.experimentIds + ", experimentConfigs=" + this.experimentConfigs + ", reqTime=" + this.reqTime + Separators.RPAREN;
    }

    public ExperimentEntity(List<Domain> domains, List<String> experimentIds, JSONObject experimentConfigs, Long l) {
        Intrinsics.checkNotNullParameter(domains, "domains");
        Intrinsics.checkNotNullParameter(experimentIds, "experimentIds");
        Intrinsics.checkNotNullParameter(experimentConfigs, "experimentConfigs");
        this.domains = domains;
        this.experimentIds = experimentIds;
        this.experimentConfigs = experimentConfigs;
        this.reqTime = l;
    }

    public final List<Domain> getDomains() {
        return this.domains;
    }

    public final List<String> getExperimentIds() {
        return this.experimentIds;
    }

    public final JSONObject getExperimentConfigs() {
        return this.experimentConfigs;
    }

    public final Long getReqTime() {
        return this.reqTime;
    }
}
