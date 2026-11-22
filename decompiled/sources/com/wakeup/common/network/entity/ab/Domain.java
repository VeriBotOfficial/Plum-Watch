package com.wakeup.common.network.entity.ab;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* compiled from: ExperimentEntity.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0001\u0012\u0006\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\t\u0010\u001c\u001a\u00020\nHÆ\u0003JG\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\t\u001a\u00020\nHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lcom/wakeup/common/network/entity/ab/Domain;", "", "id", "", "name", "type", "flowConfig", "Lcom/wakeup/common/network/entity/ab/FlowConfig;", "layers", "experimentConfigs", "Lorg/json/JSONObject;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/wakeup/common/network/entity/ab/FlowConfig;Ljava/lang/Object;Lorg/json/JSONObject;)V", "getId", "()Ljava/lang/String;", "getName", "getType", "getFlowConfig", "()Lcom/wakeup/common/network/entity/ab/FlowConfig;", "getLayers", "()Ljava/lang/Object;", "getExperimentConfigs", "()Lorg/json/JSONObject;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class Domain {
    private final JSONObject experimentConfigs;
    private final FlowConfig flowConfig;
    private final String id;
    private final Object layers;
    private final String name;
    private final String type;

    public static /* synthetic */ Domain copy$default(Domain domain, String str, String str2, String str3, FlowConfig flowConfig, Object obj, JSONObject jSONObject, int i, Object obj2) {
        if ((i & 1) != 0) {
            str = domain.id;
        }
        if ((i & 2) != 0) {
            str2 = domain.name;
        }
        if ((i & 4) != 0) {
            str3 = domain.type;
        }
        if ((i & 8) != 0) {
            flowConfig = domain.flowConfig;
        }
        if ((i & 16) != 0) {
            obj = domain.layers;
        }
        if ((i & 32) != 0) {
            jSONObject = domain.experimentConfigs;
        }
        Object obj3 = obj;
        JSONObject jSONObject2 = jSONObject;
        return domain.copy(str, str2, str3, flowConfig, obj3, jSONObject2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final String getType() {
        return this.type;
    }

    /* renamed from: component4, reason: from getter */
    public final FlowConfig getFlowConfig() {
        return this.flowConfig;
    }

    /* renamed from: component5, reason: from getter */
    public final Object getLayers() {
        return this.layers;
    }

    /* renamed from: component6, reason: from getter */
    public final JSONObject getExperimentConfigs() {
        return this.experimentConfigs;
    }

    public final Domain copy(String id2, String name, String type, FlowConfig flowConfig, Object layers, JSONObject experimentConfigs) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(flowConfig, "flowConfig");
        Intrinsics.checkNotNullParameter(experimentConfigs, "experimentConfigs");
        return new Domain(id2, name, type, flowConfig, layers, experimentConfigs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Domain)) {
            return false;
        }
        Domain domain = (Domain) other;
        return Intrinsics.areEqual(this.id, domain.id) && Intrinsics.areEqual(this.name, domain.name) && Intrinsics.areEqual(this.type, domain.type) && Intrinsics.areEqual(this.flowConfig, domain.flowConfig) && Intrinsics.areEqual(this.layers, domain.layers) && Intrinsics.areEqual(this.experimentConfigs, domain.experimentConfigs);
    }

    public int hashCode() {
        int hashCode = ((((((this.id.hashCode() * 31) + this.name.hashCode()) * 31) + this.type.hashCode()) * 31) + this.flowConfig.hashCode()) * 31;
        Object obj = this.layers;
        return ((hashCode + (obj == null ? 0 : obj.hashCode())) * 31) + this.experimentConfigs.hashCode();
    }

    public String toString() {
        return "Domain(id=" + this.id + ", name=" + this.name + ", type=" + this.type + ", flowConfig=" + this.flowConfig + ", layers=" + this.layers + ", experimentConfigs=" + this.experimentConfigs + Separators.RPAREN;
    }

    public Domain(String id2, String name, String type, FlowConfig flowConfig, Object obj, JSONObject experimentConfigs) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(flowConfig, "flowConfig");
        Intrinsics.checkNotNullParameter(experimentConfigs, "experimentConfigs");
        this.id = id2;
        this.name = name;
        this.type = type;
        this.flowConfig = flowConfig;
        this.layers = obj;
        this.experimentConfigs = experimentConfigs;
    }

    public final String getId() {
        return this.id;
    }

    public final String getName() {
        return this.name;
    }

    public final String getType() {
        return this.type;
    }

    public final FlowConfig getFlowConfig() {
        return this.flowConfig;
    }

    public final Object getLayers() {
        return this.layers;
    }

    public final JSONObject getExperimentConfigs() {
        return this.experimentConfigs;
    }
}
