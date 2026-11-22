package com.wakeup.howear.view.user.bean;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FeedBackTypeModel.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J)\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\n\"\u0004\b\f\u0010\rR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011¨\u0006\u001b"}, d2 = {"Lcom/wakeup/howear/view/user/bean/FeedBackTypeModel;", "", "typeName", "", "tip", "problemTypeNum", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;I)V", "getTypeName", "()Ljava/lang/String;", "getTip", "setTip", "(Ljava/lang/String;)V", "getProblemTypeNum", "()I", "setProblemTypeNum", "(I)V", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FeedBackTypeModel {
    private int problemTypeNum;
    private String tip;
    private final String typeName;

    public static /* synthetic */ FeedBackTypeModel copy$default(FeedBackTypeModel feedBackTypeModel, String str, String str2, int i, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = feedBackTypeModel.typeName;
        }
        if ((i2 & 2) != 0) {
            str2 = feedBackTypeModel.tip;
        }
        if ((i2 & 4) != 0) {
            i = feedBackTypeModel.problemTypeNum;
        }
        return feedBackTypeModel.copy(str, str2, i);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTypeName() {
        return this.typeName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTip() {
        return this.tip;
    }

    /* renamed from: component3, reason: from getter */
    public final int getProblemTypeNum() {
        return this.problemTypeNum;
    }

    public final FeedBackTypeModel copy(String typeName, String tip, int problemTypeNum) {
        Intrinsics.checkNotNullParameter(typeName, "typeName");
        return new FeedBackTypeModel(typeName, tip, problemTypeNum);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FeedBackTypeModel)) {
            return false;
        }
        FeedBackTypeModel feedBackTypeModel = (FeedBackTypeModel) other;
        return Intrinsics.areEqual(this.typeName, feedBackTypeModel.typeName) && Intrinsics.areEqual(this.tip, feedBackTypeModel.tip) && this.problemTypeNum == feedBackTypeModel.problemTypeNum;
    }

    public int hashCode() {
        int hashCode = this.typeName.hashCode() * 31;
        String str = this.tip;
        return ((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.problemTypeNum);
    }

    public String toString() {
        return "FeedBackTypeModel(typeName=" + this.typeName + ", tip=" + this.tip + ", problemTypeNum=" + this.problemTypeNum + Separators.RPAREN;
    }

    public FeedBackTypeModel(String typeName, String str, int i) {
        Intrinsics.checkNotNullParameter(typeName, "typeName");
        this.typeName = typeName;
        this.tip = str;
        this.problemTypeNum = i;
    }

    public final String getTypeName() {
        return this.typeName;
    }

    public final String getTip() {
        return this.tip;
    }

    public final void setTip(String str) {
        this.tip = str;
    }

    public final int getProblemTypeNum() {
        return this.problemTypeNum;
    }

    public final void setProblemTypeNum(int i) {
        this.problemTypeNum = i;
    }
}
