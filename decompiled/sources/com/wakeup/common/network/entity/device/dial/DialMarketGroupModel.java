package com.wakeup.common.network.entity.device.dial;

import android.gov.nist.core.Separators;
import com.facebook.hermes.intl.Constants;
import com.wakeup.common.network.entity.device.DialModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DialMarketGroupModel.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J7\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/wakeup/common/network/entity/device/dial/DialMarketGroupModel;", "", "id", "", "name", "", Constants.SORT, "dialList", "", "Lcom/wakeup/common/network/entity/device/DialModel;", "<init>", "(ILjava/lang/String;ILjava/util/List;)V", "getId", "()I", "getName", "()Ljava/lang/String;", "getSort", "getDialList", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class DialMarketGroupModel {
    private final List<DialModel> dialList;
    private final int id;
    private final String name;
    private final int sort;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ DialMarketGroupModel copy$default(DialMarketGroupModel dialMarketGroupModel, int i, String str, int i2, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = dialMarketGroupModel.id;
        }
        if ((i3 & 2) != 0) {
            str = dialMarketGroupModel.name;
        }
        if ((i3 & 4) != 0) {
            i2 = dialMarketGroupModel.sort;
        }
        if ((i3 & 8) != 0) {
            list = dialMarketGroupModel.dialList;
        }
        return dialMarketGroupModel.copy(i, str, i2, list);
    }

    /* renamed from: component1, reason: from getter */
    public final int getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getName() {
        return this.name;
    }

    /* renamed from: component3, reason: from getter */
    public final int getSort() {
        return this.sort;
    }

    public final List<DialModel> component4() {
        return this.dialList;
    }

    public final DialMarketGroupModel copy(int id2, String name, int sort, List<? extends DialModel> dialList) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(dialList, "dialList");
        return new DialMarketGroupModel(id2, name, sort, dialList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DialMarketGroupModel)) {
            return false;
        }
        DialMarketGroupModel dialMarketGroupModel = (DialMarketGroupModel) other;
        return this.id == dialMarketGroupModel.id && Intrinsics.areEqual(this.name, dialMarketGroupModel.name) && this.sort == dialMarketGroupModel.sort && Intrinsics.areEqual(this.dialList, dialMarketGroupModel.dialList);
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.id) * 31) + this.name.hashCode()) * 31) + Integer.hashCode(this.sort)) * 31) + this.dialList.hashCode();
    }

    public String toString() {
        return "DialMarketGroupModel(id=" + this.id + ", name=" + this.name + ", sort=" + this.sort + ", dialList=" + this.dialList + Separators.RPAREN;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public DialMarketGroupModel(int i, String name, int i2, List<? extends DialModel> dialList) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(dialList, "dialList");
        this.id = i;
        this.name = name;
        this.sort = i2;
        this.dialList = dialList;
    }

    public final int getId() {
        return this.id;
    }

    public /* synthetic */ DialMarketGroupModel(int i, String str, int i2, List list, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, (i3 & 2) != 0 ? "" : str, i2, (i3 & 8) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final String getName() {
        return this.name;
    }

    public final int getSort() {
        return this.sort;
    }

    public final List<DialModel> getDialList() {
        return this.dialList;
    }
}
