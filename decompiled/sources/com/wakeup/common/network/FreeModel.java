package com.wakeup.common.network;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FreeModel.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u000e¨\u0006\u0018"}, d2 = {"Lcom/wakeup/common/network/FreeModel;", "", "functionId", "", "functionName", "", "isFree", "", "<init>", "(JLjava/lang/String;I)V", "getFunctionId", "()J", "getFunctionName", "()Ljava/lang/String;", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class FreeModel {
    private final long functionId;
    private final String functionName;
    private final int isFree;

    public static /* synthetic */ FreeModel copy$default(FreeModel freeModel, long j, String str, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = freeModel.functionId;
        }
        if ((i2 & 2) != 0) {
            str = freeModel.functionName;
        }
        if ((i2 & 4) != 0) {
            i = freeModel.isFree;
        }
        return freeModel.copy(j, str, i);
    }

    /* renamed from: component1, reason: from getter */
    public final long getFunctionId() {
        return this.functionId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFunctionName() {
        return this.functionName;
    }

    /* renamed from: component3, reason: from getter */
    public final int getIsFree() {
        return this.isFree;
    }

    public final FreeModel copy(long functionId, String functionName, int isFree) {
        Intrinsics.checkNotNullParameter(functionName, "functionName");
        return new FreeModel(functionId, functionName, isFree);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FreeModel)) {
            return false;
        }
        FreeModel freeModel = (FreeModel) other;
        return this.functionId == freeModel.functionId && Intrinsics.areEqual(this.functionName, freeModel.functionName) && this.isFree == freeModel.isFree;
    }

    public int hashCode() {
        return (((Long.hashCode(this.functionId) * 31) + this.functionName.hashCode()) * 31) + Integer.hashCode(this.isFree);
    }

    public String toString() {
        return "FreeModel(functionId=" + this.functionId + ", functionName=" + this.functionName + ", isFree=" + this.isFree + Separators.RPAREN;
    }

    public FreeModel(long j, String functionName, int i) {
        Intrinsics.checkNotNullParameter(functionName, "functionName");
        this.functionId = j;
        this.functionName = functionName;
        this.isFree = i;
    }

    public final long getFunctionId() {
        return this.functionId;
    }

    public final String getFunctionName() {
        return this.functionName;
    }

    public final int isFree() {
        return this.isFree;
    }
}
