package com.xmly.businesssdk.network.bean;

import com.google.gson.annotations.SerializedName;
import com.tencent.connect.common.Constants;
import com.xmly.businesssdk.c;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: User.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\r\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, d2 = {"Lcom/xmly/businesssdk/network/bean/Token;", "", "accessToken", "", "expiresIn", "", "(Ljava/lang/String;J)V", "getAccessToken", "()Ljava/lang/String;", "getExpiresIn", "()J", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class Token {

    @SerializedName("access_token")
    private final String accessToken;

    @SerializedName(Constants.PARAM_EXPIRES_IN)
    private final long expiresIn;

    public Token() {
        this(null, 0L, 3, null);
    }

    public Token(String str, long j) {
        this.accessToken = str;
        this.expiresIn = j;
    }

    public static /* synthetic */ Token copy$default(Token token, String str, long j, int i, Object obj) {
        if ((i & 1) != 0) {
            str = token.accessToken;
        }
        if ((i & 2) != 0) {
            j = token.expiresIn;
        }
        return token.copy(str, j);
    }

    /* renamed from: component1, reason: from getter */
    public final String getAccessToken() {
        return this.accessToken;
    }

    /* renamed from: component2, reason: from getter */
    public final long getExpiresIn() {
        return this.expiresIn;
    }

    public final Token copy(String accessToken, long expiresIn) {
        return new Token(accessToken, expiresIn);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Token)) {
            return false;
        }
        Token token = (Token) other;
        return Intrinsics.areEqual(this.accessToken, token.accessToken) && this.expiresIn == token.expiresIn;
    }

    public final String getAccessToken() {
        return this.accessToken;
    }

    public final long getExpiresIn() {
        return this.expiresIn;
    }

    public int hashCode() {
        String str = this.accessToken;
        return Long.hashCode(this.expiresIn) + ((str == null ? 0 : str.hashCode()) * 31);
    }

    public String toString() {
        return c.a("Token(accessToken=").append(this.accessToken).append(", expiresIn=").append(this.expiresIn).append(')').toString();
    }

    public /* synthetic */ Token(String str, long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? 0L : j);
    }
}
