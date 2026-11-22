package com.wakeup.common.network.entity.user;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AiFunction.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B5\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J\u000f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\bHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lcom/wakeup/common/network/entity/user/AiFunction;", "", "aiFuncCode", "", "aiFuncDesc", "", "aiMemberType", "childFuncList", "", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getAiFuncCode", "()I", "getAiFuncDesc", "()Ljava/lang/String;", "getAiMemberType", "getChildFuncList", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AiFunction {
    private final int aiFuncCode;
    private final String aiFuncDesc;
    private final String aiMemberType;
    private final List<String> childFuncList;

    public AiFunction() {
        this(0, null, null, null, 15, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AiFunction copy$default(AiFunction aiFunction, int i, String str, String str2, List list, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = aiFunction.aiFuncCode;
        }
        if ((i2 & 2) != 0) {
            str = aiFunction.aiFuncDesc;
        }
        if ((i2 & 4) != 0) {
            str2 = aiFunction.aiMemberType;
        }
        if ((i2 & 8) != 0) {
            list = aiFunction.childFuncList;
        }
        return aiFunction.copy(i, str, str2, list);
    }

    /* renamed from: component1, reason: from getter */
    public final int getAiFuncCode() {
        return this.aiFuncCode;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAiFuncDesc() {
        return this.aiFuncDesc;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAiMemberType() {
        return this.aiMemberType;
    }

    public final List<String> component4() {
        return this.childFuncList;
    }

    public final AiFunction copy(int aiFuncCode, String aiFuncDesc, String aiMemberType, List<String> childFuncList) {
        Intrinsics.checkNotNullParameter(aiFuncDesc, "aiFuncDesc");
        Intrinsics.checkNotNullParameter(aiMemberType, "aiMemberType");
        Intrinsics.checkNotNullParameter(childFuncList, "childFuncList");
        return new AiFunction(aiFuncCode, aiFuncDesc, aiMemberType, childFuncList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AiFunction)) {
            return false;
        }
        AiFunction aiFunction = (AiFunction) other;
        return this.aiFuncCode == aiFunction.aiFuncCode && Intrinsics.areEqual(this.aiFuncDesc, aiFunction.aiFuncDesc) && Intrinsics.areEqual(this.aiMemberType, aiFunction.aiMemberType) && Intrinsics.areEqual(this.childFuncList, aiFunction.childFuncList);
    }

    public int hashCode() {
        return (((((Integer.hashCode(this.aiFuncCode) * 31) + this.aiFuncDesc.hashCode()) * 31) + this.aiMemberType.hashCode()) * 31) + this.childFuncList.hashCode();
    }

    public String toString() {
        return "AiFunction(aiFuncCode=" + this.aiFuncCode + ", aiFuncDesc=" + this.aiFuncDesc + ", aiMemberType=" + this.aiMemberType + ", childFuncList=" + this.childFuncList + Separators.RPAREN;
    }

    public AiFunction(int i, String aiFuncDesc, String aiMemberType, List<String> childFuncList) {
        Intrinsics.checkNotNullParameter(aiFuncDesc, "aiFuncDesc");
        Intrinsics.checkNotNullParameter(aiMemberType, "aiMemberType");
        Intrinsics.checkNotNullParameter(childFuncList, "childFuncList");
        this.aiFuncCode = i;
        this.aiFuncDesc = aiFuncDesc;
        this.aiMemberType = aiMemberType;
        this.childFuncList = childFuncList;
    }

    public /* synthetic */ AiFunction(int i, String str, String str2, List list, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0 : i, (i2 & 2) != 0 ? "" : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final int getAiFuncCode() {
        return this.aiFuncCode;
    }

    public final String getAiFuncDesc() {
        return this.aiFuncDesc;
    }

    public final String getAiMemberType() {
        return this.aiMemberType;
    }

    public final List<String> getChildFuncList() {
        return this.childFuncList;
    }
}
