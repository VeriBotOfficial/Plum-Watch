package com.hispark.clouddiag.manager;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeviceIdentityIndex.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0015"}, d2 = {"Lcom/hispark/clouddiag/manager/IdentityAlias;", "", "type", "Lcom/hispark/clouddiag/manager/IdentityAliasType;", "value", "", "<init>", "(Lcom/hispark/clouddiag/manager/IdentityAliasType;Ljava/lang/String;)V", "getType", "()Lcom/hispark/clouddiag/manager/IdentityAliasType;", "getValue", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final /* data */ class IdentityAlias {
    private final IdentityAliasType type;
    private final String value;

    public static /* synthetic */ IdentityAlias copy$default(IdentityAlias identityAlias, IdentityAliasType identityAliasType, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            identityAliasType = identityAlias.type;
        }
        if ((i & 2) != 0) {
            str = identityAlias.value;
        }
        return identityAlias.copy(identityAliasType, str);
    }

    /* renamed from: component1, reason: from getter */
    public final IdentityAliasType getType() {
        return this.type;
    }

    /* renamed from: component2, reason: from getter */
    public final String getValue() {
        return this.value;
    }

    public final IdentityAlias copy(IdentityAliasType type, String value) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        return new IdentityAlias(type, value);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IdentityAlias)) {
            return false;
        }
        IdentityAlias identityAlias = (IdentityAlias) other;
        return this.type == identityAlias.type && Intrinsics.areEqual(this.value, identityAlias.value);
    }

    public int hashCode() {
        return (this.type.hashCode() * 31) + this.value.hashCode();
    }

    public String toString() {
        return "IdentityAlias(type=" + this.type + ", value=" + this.value + ')';
    }

    public IdentityAlias(IdentityAliasType type, String value) {
        Intrinsics.checkNotNullParameter(type, "type");
        Intrinsics.checkNotNullParameter(value, "value");
        this.type = type;
        this.value = value;
    }

    public final IdentityAliasType getType() {
        return this.type;
    }

    public final String getValue() {
        return this.value;
    }
}
