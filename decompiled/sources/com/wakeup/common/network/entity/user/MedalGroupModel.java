package com.wakeup.common.network.entity.user;

import android.gov.nist.core.Separators;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MedalGroupModel.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0003J-\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007HÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u00122\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0013\"\u0004\b\u0014\u0010\u0015¨\u0006\u001f"}, d2 = {"Lcom/wakeup/common/network/entity/user/MedalGroupModel;", "Ljava/io/Serializable;", "typeTitle", "", "medalTypeId", "", "medalInfoVoList", "", "Lcom/wakeup/common/network/entity/user/MedalItemModel;", "<init>", "(Ljava/lang/String;ILjava/util/List;)V", "getTypeTitle", "()Ljava/lang/String;", "getMedalTypeId", "()I", "getMedalInfoVoList", "()Ljava/util/List;", "isExpand", "", "()Z", "setExpand", "(Z)V", "component1", "component2", "component3", "copy", "equals", "other", "", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class MedalGroupModel implements Serializable {
    private boolean isExpand;
    private final List<MedalItemModel> medalInfoVoList;
    private final int medalTypeId;
    private final String typeTitle;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MedalGroupModel copy$default(MedalGroupModel medalGroupModel, String str, int i, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = medalGroupModel.typeTitle;
        }
        if ((i2 & 2) != 0) {
            i = medalGroupModel.medalTypeId;
        }
        if ((i2 & 4) != 0) {
            list = medalGroupModel.medalInfoVoList;
        }
        return medalGroupModel.copy(str, i, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTypeTitle() {
        return this.typeTitle;
    }

    /* renamed from: component2, reason: from getter */
    public final int getMedalTypeId() {
        return this.medalTypeId;
    }

    public final List<MedalItemModel> component3() {
        return this.medalInfoVoList;
    }

    public final MedalGroupModel copy(String typeTitle, int medalTypeId, List<MedalItemModel> medalInfoVoList) {
        Intrinsics.checkNotNullParameter(typeTitle, "typeTitle");
        Intrinsics.checkNotNullParameter(medalInfoVoList, "medalInfoVoList");
        return new MedalGroupModel(typeTitle, medalTypeId, medalInfoVoList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MedalGroupModel)) {
            return false;
        }
        MedalGroupModel medalGroupModel = (MedalGroupModel) other;
        return Intrinsics.areEqual(this.typeTitle, medalGroupModel.typeTitle) && this.medalTypeId == medalGroupModel.medalTypeId && Intrinsics.areEqual(this.medalInfoVoList, medalGroupModel.medalInfoVoList);
    }

    public int hashCode() {
        return (((this.typeTitle.hashCode() * 31) + Integer.hashCode(this.medalTypeId)) * 31) + this.medalInfoVoList.hashCode();
    }

    public String toString() {
        return "MedalGroupModel(typeTitle=" + this.typeTitle + ", medalTypeId=" + this.medalTypeId + ", medalInfoVoList=" + this.medalInfoVoList + Separators.RPAREN;
    }

    public MedalGroupModel(String typeTitle, int i, List<MedalItemModel> medalInfoVoList) {
        Intrinsics.checkNotNullParameter(typeTitle, "typeTitle");
        Intrinsics.checkNotNullParameter(medalInfoVoList, "medalInfoVoList");
        this.typeTitle = typeTitle;
        this.medalTypeId = i;
        this.medalInfoVoList = medalInfoVoList;
    }

    public /* synthetic */ MedalGroupModel(String str, int i, ArrayList arrayList, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, i, (i2 & 4) != 0 ? new ArrayList() : arrayList);
    }

    public final String getTypeTitle() {
        return this.typeTitle;
    }

    public final int getMedalTypeId() {
        return this.medalTypeId;
    }

    public final List<MedalItemModel> getMedalInfoVoList() {
        return this.medalInfoVoList;
    }

    /* renamed from: isExpand, reason: from getter */
    public final boolean getIsExpand() {
        return this.isExpand;
    }

    public final void setExpand(boolean z) {
        this.isExpand = z;
    }
}
