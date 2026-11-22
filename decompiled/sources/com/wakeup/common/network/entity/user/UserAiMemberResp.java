package com.wakeup.common.network.entity.user;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserAiMemberResp.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BS\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0006\u0012\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0006HÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\t\u0010 \u001a\u00020\u0006HÆ\u0003J\u000f\u0010!\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0003JU\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00062\u000e\b\u0002\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0003HÖ\u0001J\t\u0010'\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\n\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0014R\u0017\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001a¨\u0006("}, d2 = {"Lcom/wakeup/common/network/entity/user/UserAiMemberResp;", "", "userId", "", "aiMemberStatus", "aiMemberType", "", "dueTime", "dueTimeStamp", "", "desc", "aiFuncList", "", "Lcom/wakeup/common/network/entity/user/AiFunction;", "<init>", "(IILjava/lang/String;Ljava/lang/String;JLjava/lang/String;Ljava/util/List;)V", "getUserId", "()I", "getAiMemberStatus", "getAiMemberType", "()Ljava/lang/String;", "getDueTime", "getDueTimeStamp", "()J", "getDesc", "getAiFuncList", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class UserAiMemberResp {
    private final List<AiFunction> aiFuncList;
    private final int aiMemberStatus;
    private final String aiMemberType;
    private final String desc;
    private final String dueTime;
    private final long dueTimeStamp;
    private final int userId;

    public UserAiMemberResp() {
        this(0, 0, null, null, 0L, null, null, 127, null);
    }

    public static /* synthetic */ UserAiMemberResp copy$default(UserAiMemberResp userAiMemberResp, int i, int i2, String str, String str2, long j, String str3, List list, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            i = userAiMemberResp.userId;
        }
        if ((i3 & 2) != 0) {
            i2 = userAiMemberResp.aiMemberStatus;
        }
        if ((i3 & 4) != 0) {
            str = userAiMemberResp.aiMemberType;
        }
        if ((i3 & 8) != 0) {
            str2 = userAiMemberResp.dueTime;
        }
        if ((i3 & 16) != 0) {
            j = userAiMemberResp.dueTimeStamp;
        }
        if ((i3 & 32) != 0) {
            str3 = userAiMemberResp.desc;
        }
        if ((i3 & 64) != 0) {
            list = userAiMemberResp.aiFuncList;
        }
        long j2 = j;
        String str4 = str;
        String str5 = str2;
        return userAiMemberResp.copy(i, i2, str4, str5, j2, str3, list);
    }

    /* renamed from: component1, reason: from getter */
    public final int getUserId() {
        return this.userId;
    }

    /* renamed from: component2, reason: from getter */
    public final int getAiMemberStatus() {
        return this.aiMemberStatus;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAiMemberType() {
        return this.aiMemberType;
    }

    /* renamed from: component4, reason: from getter */
    public final String getDueTime() {
        return this.dueTime;
    }

    /* renamed from: component5, reason: from getter */
    public final long getDueTimeStamp() {
        return this.dueTimeStamp;
    }

    /* renamed from: component6, reason: from getter */
    public final String getDesc() {
        return this.desc;
    }

    public final List<AiFunction> component7() {
        return this.aiFuncList;
    }

    public final UserAiMemberResp copy(int userId, int aiMemberStatus, String aiMemberType, String dueTime, long dueTimeStamp, String desc, List<AiFunction> aiFuncList) {
        Intrinsics.checkNotNullParameter(aiMemberType, "aiMemberType");
        Intrinsics.checkNotNullParameter(dueTime, "dueTime");
        Intrinsics.checkNotNullParameter(desc, "desc");
        Intrinsics.checkNotNullParameter(aiFuncList, "aiFuncList");
        return new UserAiMemberResp(userId, aiMemberStatus, aiMemberType, dueTime, dueTimeStamp, desc, aiFuncList);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserAiMemberResp)) {
            return false;
        }
        UserAiMemberResp userAiMemberResp = (UserAiMemberResp) other;
        return this.userId == userAiMemberResp.userId && this.aiMemberStatus == userAiMemberResp.aiMemberStatus && Intrinsics.areEqual(this.aiMemberType, userAiMemberResp.aiMemberType) && Intrinsics.areEqual(this.dueTime, userAiMemberResp.dueTime) && this.dueTimeStamp == userAiMemberResp.dueTimeStamp && Intrinsics.areEqual(this.desc, userAiMemberResp.desc) && Intrinsics.areEqual(this.aiFuncList, userAiMemberResp.aiFuncList);
    }

    public int hashCode() {
        return (((((((((((Integer.hashCode(this.userId) * 31) + Integer.hashCode(this.aiMemberStatus)) * 31) + this.aiMemberType.hashCode()) * 31) + this.dueTime.hashCode()) * 31) + Long.hashCode(this.dueTimeStamp)) * 31) + this.desc.hashCode()) * 31) + this.aiFuncList.hashCode();
    }

    public String toString() {
        return "UserAiMemberResp(userId=" + this.userId + ", aiMemberStatus=" + this.aiMemberStatus + ", aiMemberType=" + this.aiMemberType + ", dueTime=" + this.dueTime + ", dueTimeStamp=" + this.dueTimeStamp + ", desc=" + this.desc + ", aiFuncList=" + this.aiFuncList + Separators.RPAREN;
    }

    public UserAiMemberResp(int i, int i2, String aiMemberType, String dueTime, long j, String desc, List<AiFunction> aiFuncList) {
        Intrinsics.checkNotNullParameter(aiMemberType, "aiMemberType");
        Intrinsics.checkNotNullParameter(dueTime, "dueTime");
        Intrinsics.checkNotNullParameter(desc, "desc");
        Intrinsics.checkNotNullParameter(aiFuncList, "aiFuncList");
        this.userId = i;
        this.aiMemberStatus = i2;
        this.aiMemberType = aiMemberType;
        this.dueTime = dueTime;
        this.dueTimeStamp = j;
        this.desc = desc;
        this.aiFuncList = aiFuncList;
    }

    public /* synthetic */ UserAiMemberResp(int i, int i2, String str, String str2, long j, String str3, List list, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? 0 : i, (i3 & 2) != 0 ? 0 : i2, (i3 & 4) != 0 ? "" : str, (i3 & 8) != 0 ? "" : str2, (i3 & 16) != 0 ? 0L : j, (i3 & 32) != 0 ? "" : str3, (i3 & 64) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final int getUserId() {
        return this.userId;
    }

    public final int getAiMemberStatus() {
        return this.aiMemberStatus;
    }

    public final String getAiMemberType() {
        return this.aiMemberType;
    }

    public final String getDueTime() {
        return this.dueTime;
    }

    public final long getDueTimeStamp() {
        return this.dueTimeStamp;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final List<AiFunction> getAiFuncList() {
        return this.aiFuncList;
    }
}
