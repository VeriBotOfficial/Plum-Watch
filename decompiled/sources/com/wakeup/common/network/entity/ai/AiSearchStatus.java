package com.wakeup.common.network.entity.ai;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AiSearchBean.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/wakeup/common/network/entity/ai/AiSearchStatus;", "", "name", "", "status", "", "<init>", "(Ljava/lang/String;Z)V", "getName", "()Ljava/lang/String;", "getStatus", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AiSearchStatus {
    private final String name;
    private final boolean status;

    public static /* synthetic */ AiSearchStatus copy$default(AiSearchStatus aiSearchStatus, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aiSearchStatus.name;
        }
        if ((i & 2) != 0) {
            z = aiSearchStatus.status;
        }
        return aiSearchStatus.copy(str, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getStatus() {
        return this.status;
    }

    public final AiSearchStatus copy(String name, boolean status) {
        Intrinsics.checkNotNullParameter(name, "name");
        return new AiSearchStatus(name, status);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiSearchStatus)) {
            return false;
        }
        AiSearchStatus aiSearchStatus = (AiSearchStatus) other;
        return Intrinsics.areEqual(this.name, aiSearchStatus.name) && this.status == aiSearchStatus.status;
    }

    public int hashCode() {
        return (this.name.hashCode() * 31) + Boolean.hashCode(this.status);
    }

    public String toString() {
        return "AiSearchStatus(name=" + this.name + ", status=" + this.status + Separators.RPAREN;
    }

    public AiSearchStatus(String name, boolean z) {
        Intrinsics.checkNotNullParameter(name, "name");
        this.name = name;
        this.status = z;
    }

    public final String getName() {
        return this.name;
    }

    public final boolean getStatus() {
        return this.status;
    }
}
