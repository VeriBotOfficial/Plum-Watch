package com.wakeup.common.network.entity.ab;

import android.gov.nist.core.Separators;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ExperimentEntity.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0001HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0001HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/wakeup/common/network/entity/ab/Rule;", "", "attribute", "Lcom/wakeup/common/network/entity/ab/Attribute;", "operatorSymbol", "", "value", "<init>", "(Lcom/wakeup/common/network/entity/ab/Attribute;Ljava/lang/String;Ljava/lang/Object;)V", "getAttribute", "()Lcom/wakeup/common/network/entity/ab/Attribute;", "getOperatorSymbol", "()Ljava/lang/String;", "getValue", "()Ljava/lang/Object;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class Rule {
    private final Attribute attribute;

    @SerializedName("operator")
    private final String operatorSymbol;
    private final Object value;

    public static /* synthetic */ Rule copy$default(Rule rule, Attribute attribute, String str, Object obj, int i, Object obj2) {
        if ((i & 1) != 0) {
            attribute = rule.attribute;
        }
        if ((i & 2) != 0) {
            str = rule.operatorSymbol;
        }
        if ((i & 4) != 0) {
            obj = rule.value;
        }
        return rule.copy(attribute, str, obj);
    }

    /* renamed from: component1, reason: from getter */
    public final Attribute getAttribute() {
        return this.attribute;
    }

    /* renamed from: component2, reason: from getter */
    public final String getOperatorSymbol() {
        return this.operatorSymbol;
    }

    /* renamed from: component3, reason: from getter */
    public final Object getValue() {
        return this.value;
    }

    public final Rule copy(Attribute attribute, String operatorSymbol, Object value) {
        Intrinsics.checkNotNullParameter(attribute, "attribute");
        Intrinsics.checkNotNullParameter(operatorSymbol, "operatorSymbol");
        Intrinsics.checkNotNullParameter(value, "value");
        return new Rule(attribute, operatorSymbol, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Rule)) {
            return false;
        }
        Rule rule = (Rule) other;
        return Intrinsics.areEqual(this.attribute, rule.attribute) && Intrinsics.areEqual(this.operatorSymbol, rule.operatorSymbol) && Intrinsics.areEqual(this.value, rule.value);
    }

    public int hashCode() {
        return (((this.attribute.hashCode() * 31) + this.operatorSymbol.hashCode()) * 31) + this.value.hashCode();
    }

    public String toString() {
        return "Rule(attribute=" + this.attribute + ", operatorSymbol=" + this.operatorSymbol + ", value=" + this.value + Separators.RPAREN;
    }

    public Rule(Attribute attribute, String operatorSymbol, Object value) {
        Intrinsics.checkNotNullParameter(attribute, "attribute");
        Intrinsics.checkNotNullParameter(operatorSymbol, "operatorSymbol");
        Intrinsics.checkNotNullParameter(value, "value");
        this.attribute = attribute;
        this.operatorSymbol = operatorSymbol;
        this.value = value;
    }

    public final Attribute getAttribute() {
        return this.attribute;
    }

    public final String getOperatorSymbol() {
        return this.operatorSymbol;
    }

    public final Object getValue() {
        return this.value;
    }
}
