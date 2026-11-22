package com.wakeup.common.network.entity.oral;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OralBean.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\rJ2\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0006HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lcom/wakeup/common/network/entity/oral/UserToken;", "", "token", "", "tokenType", "expiresIn", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "getToken", "()Ljava/lang/String;", "getTokenType", "getExpiresIn", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lcom/wakeup/common/network/entity/oral/UserToken;", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class UserToken {
    private final Integer expiresIn;
    private final String token;
    private final String tokenType;

    public UserToken() {
        this(null, null, null, 7, null);
    }

    public static /* synthetic */ UserToken copy$default(UserToken userToken, String str, String str2, Integer num, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userToken.token;
        }
        if ((i & 2) != 0) {
            str2 = userToken.tokenType;
        }
        if ((i & 4) != 0) {
            num = userToken.expiresIn;
        }
        return userToken.copy(str, str2, num);
    }

    /* renamed from: component1, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTokenType() {
        return this.tokenType;
    }

    /* renamed from: component3, reason: from getter */
    public final Integer getExpiresIn() {
        return this.expiresIn;
    }

    public final UserToken copy(String token, String tokenType, Integer expiresIn) {
        return new UserToken(token, tokenType, expiresIn);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserToken)) {
            return false;
        }
        UserToken userToken = (UserToken) other;
        return Intrinsics.areEqual(this.token, userToken.token) && Intrinsics.areEqual(this.tokenType, userToken.tokenType) && Intrinsics.areEqual(this.expiresIn, userToken.expiresIn);
    }

    public int hashCode() {
        String str = this.token;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.tokenType;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.expiresIn;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    public String toString() {
        return "UserToken(token=" + this.token + ", tokenType=" + this.tokenType + ", expiresIn=" + this.expiresIn + Separators.RPAREN;
    }

    public UserToken(String str, String str2, Integer num) {
        this.token = str;
        this.tokenType = str2;
        this.expiresIn = num;
    }

    public /* synthetic */ UserToken(String str, String str2, Integer num, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : num);
    }

    public final String getToken() {
        return this.token;
    }

    public final String getTokenType() {
        return this.tokenType;
    }

    public final Integer getExpiresIn() {
        return this.expiresIn;
    }
}
