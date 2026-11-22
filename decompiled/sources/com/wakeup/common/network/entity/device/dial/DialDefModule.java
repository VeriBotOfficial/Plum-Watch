package com.wakeup.common.network.entity.device.dial;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DialModel.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0003J/\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001a"}, d2 = {"Lcom/wakeup/common/network/entity/device/dial/DialDefModule;", "", "bigModule", "Lcom/wakeup/common/network/entity/device/dial/DialModule;", "equipmentId", "", "smallModule", "", "<init>", "(Lcom/wakeup/common/network/entity/device/dial/DialModule;ILjava/util/List;)V", "getBigModule", "()Lcom/wakeup/common/network/entity/device/dial/DialModule;", "getEquipmentId", "()I", "getSmallModule", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DialDefModule {
    private final DialModule bigModule;
    private final int equipmentId;
    private final List<DialModule> smallModule;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DialDefModule copy$default(DialDefModule dialDefModule, DialModule dialModule, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            dialModule = dialDefModule.bigModule;
        }
        if ((i2 & 2) != 0) {
            i = dialDefModule.equipmentId;
        }
        if ((i2 & 4) != 0) {
            list = dialDefModule.smallModule;
        }
        return dialDefModule.copy(dialModule, i, list);
    }

    /* renamed from: component1, reason: from getter */
    public final DialModule getBigModule() {
        return this.bigModule;
    }

    /* renamed from: component2, reason: from getter */
    public final int getEquipmentId() {
        return this.equipmentId;
    }

    public final List<DialModule> component3() {
        return this.smallModule;
    }

    public final DialDefModule copy(DialModule bigModule, int equipmentId, List<DialModule> smallModule) {
        Intrinsics.checkNotNullParameter(smallModule, "smallModule");
        return new DialDefModule(bigModule, equipmentId, smallModule);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DialDefModule)) {
            return false;
        }
        DialDefModule dialDefModule = (DialDefModule) other;
        return Intrinsics.areEqual(this.bigModule, dialDefModule.bigModule) && this.equipmentId == dialDefModule.equipmentId && Intrinsics.areEqual(this.smallModule, dialDefModule.smallModule);
    }

    public int hashCode() {
        DialModule dialModule = this.bigModule;
        return ((((dialModule == null ? 0 : dialModule.hashCode()) * 31) + Integer.hashCode(this.equipmentId)) * 31) + this.smallModule.hashCode();
    }

    public String toString() {
        return "DialDefModule(bigModule=" + this.bigModule + ", equipmentId=" + this.equipmentId + ", smallModule=" + this.smallModule + Separators.RPAREN;
    }

    public DialDefModule(DialModule dialModule, int i, List<DialModule> smallModule) {
        Intrinsics.checkNotNullParameter(smallModule, "smallModule");
        this.bigModule = dialModule;
        this.equipmentId = i;
        this.smallModule = smallModule;
    }

    public final DialModule getBigModule() {
        return this.bigModule;
    }

    public final int getEquipmentId() {
        return this.equipmentId;
    }

    public /* synthetic */ DialDefModule(DialModule dialModule, int i, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(dialModule, i, (i2 & 4) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final List<DialModule> getSmallModule() {
        return this.smallModule;
    }
}
