package com.wakeup.common.network.entity.glasses;

import android.gov.nist.core.Separators;
import com.wakeup.common.storage.model.FunctionComponentModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GlassesResult.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0011\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\r\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0019\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/wakeup/common/network/entity/glasses/GlassesFunctionResult;", "", "selectedFunctionList", "", "Lcom/wakeup/common/storage/model/FunctionComponentModel;", "optionalFunctionList", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getSelectedFunctionList", "()Ljava/util/List;", "getOptionalFunctionList", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class GlassesFunctionResult {
    private final List<FunctionComponentModel> optionalFunctionList;
    private final List<FunctionComponentModel> selectedFunctionList;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GlassesFunctionResult copy$default(GlassesFunctionResult glassesFunctionResult, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = glassesFunctionResult.selectedFunctionList;
        }
        if ((i & 2) != 0) {
            list2 = glassesFunctionResult.optionalFunctionList;
        }
        return glassesFunctionResult.copy(list, list2);
    }

    public final List<FunctionComponentModel> component1() {
        return this.selectedFunctionList;
    }

    public final List<FunctionComponentModel> component2() {
        return this.optionalFunctionList;
    }

    public final GlassesFunctionResult copy(List<FunctionComponentModel> selectedFunctionList, List<FunctionComponentModel> optionalFunctionList) {
        return new GlassesFunctionResult(selectedFunctionList, optionalFunctionList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GlassesFunctionResult)) {
            return false;
        }
        GlassesFunctionResult glassesFunctionResult = (GlassesFunctionResult) other;
        return Intrinsics.areEqual(this.selectedFunctionList, glassesFunctionResult.selectedFunctionList) && Intrinsics.areEqual(this.optionalFunctionList, glassesFunctionResult.optionalFunctionList);
    }

    public int hashCode() {
        List<FunctionComponentModel> list = this.selectedFunctionList;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<FunctionComponentModel> list2 = this.optionalFunctionList;
        return hashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public String toString() {
        return "GlassesFunctionResult(selectedFunctionList=" + this.selectedFunctionList + ", optionalFunctionList=" + this.optionalFunctionList + Separators.RPAREN;
    }

    public GlassesFunctionResult(List<FunctionComponentModel> list, List<FunctionComponentModel> list2) {
        this.selectedFunctionList = list;
        this.optionalFunctionList = list2;
    }

    public final List<FunctionComponentModel> getSelectedFunctionList() {
        return this.selectedFunctionList;
    }

    public final List<FunctionComponentModel> getOptionalFunctionList() {
        return this.optionalFunctionList;
    }
}
