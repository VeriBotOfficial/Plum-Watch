package com.wakeup.common.network.entity.whatsapp;

import android.gov.nist.core.Separators;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WhatsAppEntity.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/wakeup/common/network/entity/whatsapp/TokenResponse;", "", "token", "", "expiresAt", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getToken", "()Ljava/lang/String;", "getExpiresAt", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TokenResponse {

    @SerializedName("expires_at")
    private final String expiresAt;

    @SerializedName("token")
    private final String token;

    public static /* synthetic */ TokenResponse copy$default(TokenResponse tokenResponse, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tokenResponse.token;
        }
        if ((i & 2) != 0) {
            str2 = tokenResponse.expiresAt;
        }
        return tokenResponse.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    /* renamed from: component2, reason: from getter */
    public final String getExpiresAt() {
        return this.expiresAt;
    }

    public final TokenResponse copy(String token, String expiresAt) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(expiresAt, "expiresAt");
        return new TokenResponse(token, expiresAt);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TokenResponse)) {
            return false;
        }
        TokenResponse tokenResponse = (TokenResponse) other;
        return Intrinsics.areEqual(this.token, tokenResponse.token) && Intrinsics.areEqual(this.expiresAt, tokenResponse.expiresAt);
    }

    public int hashCode() {
        return (this.token.hashCode() * 31) + this.expiresAt.hashCode();
    }

    public String toString() {
        return "TokenResponse(token=" + this.token + ", expiresAt=" + this.expiresAt + Separators.RPAREN;
    }

    public TokenResponse(String token, String expiresAt) {
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(expiresAt, "expiresAt");
        this.token = token;
        this.expiresAt = expiresAt;
    }

    public final String getToken() {
        return this.token;
    }

    public final String getExpiresAt() {
        return this.expiresAt;
    }
}
