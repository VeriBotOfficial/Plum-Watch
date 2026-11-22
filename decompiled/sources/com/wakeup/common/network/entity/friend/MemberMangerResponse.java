package com.wakeup.common.network.entity.friend;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MemberMangerResponse.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J)\u0010\u0010\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001R \u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\t\"\u0004\b\r\u0010\u000b¨\u0006\u0018"}, d2 = {"Lcom/wakeup/common/network/entity/friend/MemberMangerResponse;", "", "pendingMember", "", "Lcom/wakeup/common/network/entity/friend/FamilyMemberModel;", "completedMember", "<init>", "(Ljava/util/List;Ljava/util/List;)V", "getPendingMember", "()Ljava/util/List;", "setPendingMember", "(Ljava/util/List;)V", "getCompletedMember", "setCompletedMember", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class MemberMangerResponse {
    private List<FamilyMemberModel> completedMember;
    private List<FamilyMemberModel> pendingMember;

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MemberMangerResponse copy$default(MemberMangerResponse memberMangerResponse, List list, List list2, int i, Object obj) {
        if ((i & 1) != 0) {
            list = memberMangerResponse.pendingMember;
        }
        if ((i & 2) != 0) {
            list2 = memberMangerResponse.completedMember;
        }
        return memberMangerResponse.copy(list, list2);
    }

    public final List<FamilyMemberModel> component1() {
        return this.pendingMember;
    }

    public final List<FamilyMemberModel> component2() {
        return this.completedMember;
    }

    public final MemberMangerResponse copy(List<FamilyMemberModel> pendingMember, List<FamilyMemberModel> completedMember) {
        Intrinsics.checkNotNullParameter(pendingMember, "pendingMember");
        Intrinsics.checkNotNullParameter(completedMember, "completedMember");
        return new MemberMangerResponse(pendingMember, completedMember);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MemberMangerResponse)) {
            return false;
        }
        MemberMangerResponse memberMangerResponse = (MemberMangerResponse) other;
        return Intrinsics.areEqual(this.pendingMember, memberMangerResponse.pendingMember) && Intrinsics.areEqual(this.completedMember, memberMangerResponse.completedMember);
    }

    public int hashCode() {
        return (this.pendingMember.hashCode() * 31) + this.completedMember.hashCode();
    }

    public String toString() {
        return "MemberMangerResponse(pendingMember=" + this.pendingMember + ", completedMember=" + this.completedMember + Separators.RPAREN;
    }

    public MemberMangerResponse(List<FamilyMemberModel> pendingMember, List<FamilyMemberModel> completedMember) {
        Intrinsics.checkNotNullParameter(pendingMember, "pendingMember");
        Intrinsics.checkNotNullParameter(completedMember, "completedMember");
        this.pendingMember = pendingMember;
        this.completedMember = completedMember;
    }

    public final List<FamilyMemberModel> getPendingMember() {
        return this.pendingMember;
    }

    public final void setPendingMember(List<FamilyMemberModel> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.pendingMember = list;
    }

    public final List<FamilyMemberModel> getCompletedMember() {
        return this.completedMember;
    }

    public final void setCompletedMember(List<FamilyMemberModel> list) {
        Intrinsics.checkNotNullParameter(list, "<set-?>");
        this.completedMember = list;
    }
}
