package com.wakeup.common.network.entity.friend;

import android.gov.nist.core.Separators;
import com.baidu.mapapi.http.HttpClient;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: FamilyMemberModel.kt */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\u0006\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001f\u001a\u00020\bHÆ\u0003J\t\u0010 \u001a\u00020\u0005HÆ\u0003J?\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\bHÖ\u0001J\t\u0010'\u001a\u00020\u0005HÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0011\"\u0004\b\u0015\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\t\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0011\"\u0004\b\u001b\u0010\u0013¨\u0006("}, d2 = {"Lcom/wakeup/common/network/entity/friend/FamilyMemberModel;", "Ljava/io/Serializable;", "userId", "", "nickname", "", "avatar", "status", "", "dataFunctionIds", "<init>", "(JLjava/lang/String;Ljava/lang/String;ILjava/lang/String;)V", "getUserId", "()J", "setUserId", "(J)V", "getNickname", "()Ljava/lang/String;", "setNickname", "(Ljava/lang/String;)V", "getAvatar", "setAvatar", "getStatus", "()I", "setStatus", "(I)V", "getDataFunctionIds", "setDataFunctionIds", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class FamilyMemberModel implements Serializable {
    private String avatar;
    private String dataFunctionIds;
    private String nickname;
    private int status;
    private long userId;

    public static /* synthetic */ FamilyMemberModel copy$default(FamilyMemberModel familyMemberModel, long j, String str, String str2, int i, String str3, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            j = familyMemberModel.userId;
        }
        long j2 = j;
        if ((i2 & 2) != 0) {
            str = familyMemberModel.nickname;
        }
        String str4 = str;
        if ((i2 & 4) != 0) {
            str2 = familyMemberModel.avatar;
        }
        String str5 = str2;
        if ((i2 & 8) != 0) {
            i = familyMemberModel.status;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            str3 = familyMemberModel.dataFunctionIds;
        }
        return familyMemberModel.copy(j2, str4, str5, i3, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final long getUserId() {
        return this.userId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getNickname() {
        return this.nickname;
    }

    /* renamed from: component3, reason: from getter */
    public final String getAvatar() {
        return this.avatar;
    }

    /* renamed from: component4, reason: from getter */
    public final int getStatus() {
        return this.status;
    }

    /* renamed from: component5, reason: from getter */
    public final String getDataFunctionIds() {
        return this.dataFunctionIds;
    }

    public final FamilyMemberModel copy(long userId, String nickname, String avatar, int status, String dataFunctionIds) {
        Intrinsics.checkNotNullParameter(dataFunctionIds, "dataFunctionIds");
        return new FamilyMemberModel(userId, nickname, avatar, status, dataFunctionIds);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FamilyMemberModel)) {
            return false;
        }
        FamilyMemberModel familyMemberModel = (FamilyMemberModel) other;
        return this.userId == familyMemberModel.userId && Intrinsics.areEqual(this.nickname, familyMemberModel.nickname) && Intrinsics.areEqual(this.avatar, familyMemberModel.avatar) && this.status == familyMemberModel.status && Intrinsics.areEqual(this.dataFunctionIds, familyMemberModel.dataFunctionIds);
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.userId) * 31;
        String str = this.nickname;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.avatar;
        return ((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.status)) * 31) + this.dataFunctionIds.hashCode();
    }

    public String toString() {
        return "FamilyMemberModel(userId=" + this.userId + ", nickname=" + this.nickname + ", avatar=" + this.avatar + ", status=" + this.status + ", dataFunctionIds=" + this.dataFunctionIds + Separators.RPAREN;
    }

    public FamilyMemberModel(long j, String str, String str2, int i, String dataFunctionIds) {
        Intrinsics.checkNotNullParameter(dataFunctionIds, "dataFunctionIds");
        this.userId = j;
        this.nickname = str;
        this.avatar = str2;
        this.status = i;
        this.dataFunctionIds = dataFunctionIds;
    }

    public final long getUserId() {
        return this.userId;
    }

    public final void setUserId(long j) {
        this.userId = j;
    }

    public /* synthetic */ FamilyMemberModel(long j, String str, String str2, int i, String str3, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? 0L : j, (i2 & 2) != 0 ? HttpClient.ENDFLAG : str, (i2 & 4) != 0 ? "" : str2, (i2 & 8) != 0 ? 0 : i, str3);
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final void setNickname(String str) {
        this.nickname = str;
    }

    public final String getAvatar() {
        return this.avatar;
    }

    public final void setAvatar(String str) {
        this.avatar = str;
    }

    public final int getStatus() {
        return this.status;
    }

    public final void setStatus(int i) {
        this.status = i;
    }

    public final String getDataFunctionIds() {
        return this.dataFunctionIds;
    }

    public final void setDataFunctionIds(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.dataFunctionIds = str;
    }
}
