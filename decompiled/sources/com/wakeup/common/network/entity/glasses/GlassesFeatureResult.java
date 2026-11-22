package com.wakeup.common.network.entity.glasses;

import android.gov.nist.core.Separators;
import com.wakeup.common.storage.model.FunctionComponentModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: GlassesFeatureResult.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B'\u0012\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J)\u0010\r\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\t¨\u0006\u0015"}, d2 = {"Lcom/wakeup/common/network/entity/glasses/GlassesFeatureResult;", "", "aiApplicationFunctionList", "", "Lcom/wakeup/common/storage/model/FunctionComponentModel;", "commonFunctionList", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getAiApplicationFunctionList", "()Ljava/util/List;", "getCommonFunctionList", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class GlassesFeatureResult {
    private final List<FunctionComponentModel> aiApplicationFunctionList;
    private final List<FunctionComponentModel> commonFunctionList;

    /* JADX WARN: Multi-variable type inference failed */
    public GlassesFeatureResult() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ GlassesFeatureResult copy$default(GlassesFeatureResult glassesFeatureResult, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = glassesFeatureResult.aiApplicationFunctionList;
        }
        if ((i & 2) != 0) {
            list2 = glassesFeatureResult.commonFunctionList;
        }
        return glassesFeatureResult.copy(list, list2);
    }

    public final List<FunctionComponentModel> component1() {
        return this.aiApplicationFunctionList;
    }

    public final List<FunctionComponentModel> component2() {
        return this.commonFunctionList;
    }

    public final GlassesFeatureResult copy(List<FunctionComponentModel> aiApplicationFunctionList, List<FunctionComponentModel> commonFunctionList) {
        Intrinsics.checkNotNullParameter(aiApplicationFunctionList, "aiApplicationFunctionList");
        Intrinsics.checkNotNullParameter(commonFunctionList, "commonFunctionList");
        return new GlassesFeatureResult(aiApplicationFunctionList, commonFunctionList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof GlassesFeatureResult)) {
            return false;
        }
        GlassesFeatureResult glassesFeatureResult = (GlassesFeatureResult) other;
        return Intrinsics.areEqual(this.aiApplicationFunctionList, glassesFeatureResult.aiApplicationFunctionList) && Intrinsics.areEqual(this.commonFunctionList, glassesFeatureResult.commonFunctionList);
    }

    public int hashCode() {
        return (this.aiApplicationFunctionList.hashCode() * 31) + this.commonFunctionList.hashCode();
    }

    public String toString() {
        return "GlassesFeatureResult(aiApplicationFunctionList=" + this.aiApplicationFunctionList + ", commonFunctionList=" + this.commonFunctionList + Separators.RPAREN;
    }

    public GlassesFeatureResult(List<FunctionComponentModel> aiApplicationFunctionList, List<FunctionComponentModel> commonFunctionList) {
        Intrinsics.checkNotNullParameter(aiApplicationFunctionList, "aiApplicationFunctionList");
        Intrinsics.checkNotNullParameter(commonFunctionList, "commonFunctionList");
        this.aiApplicationFunctionList = aiApplicationFunctionList;
        this.commonFunctionList = commonFunctionList;
    }

    public /* synthetic */ GlassesFeatureResult(List list, List list2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? CollectionsKt.emptyList() : list, (i & 2) != 0 ? CollectionsKt.emptyList() : list2);
    }

    public final List<FunctionComponentModel> getAiApplicationFunctionList() {
        return this.aiApplicationFunctionList;
    }

    public final List<FunctionComponentModel> getCommonFunctionList() {
        return this.commonFunctionList;
    }
}
