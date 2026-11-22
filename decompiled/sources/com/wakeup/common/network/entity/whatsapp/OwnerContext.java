package com.wakeup.common.network.entity.whatsapp;

import android.gov.nist.core.Separators;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WhatsAppEntity.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u001f\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lcom/wakeup/common/network/entity/whatsapp/OwnerContext;", "", "userId", "", "appId", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getUserId", "()Ljava/lang/String;", "getAppId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class OwnerContext {

    @SerializedName("app_id")
    private final String appId;

    @SerializedName("user_id")
    private final String userId;

    public static /* synthetic */ OwnerContext copy$default(OwnerContext ownerContext, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ownerContext.userId;
        }
        if ((i & 2) != 0) {
            str2 = ownerContext.appId;
        }
        return ownerContext.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUserId() {
        return this.userId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getAppId() {
        return this.appId;
    }

    public final OwnerContext copy(String userId, String appId) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        return new OwnerContext(userId, appId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof OwnerContext)) {
            return false;
        }
        OwnerContext ownerContext = (OwnerContext) other;
        return Intrinsics.areEqual(this.userId, ownerContext.userId) && Intrinsics.areEqual(this.appId, ownerContext.appId);
    }

    public int hashCode() {
        int hashCode = this.userId.hashCode() * 31;
        String str = this.appId;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "OwnerContext(userId=" + this.userId + ", appId=" + this.appId + Separators.RPAREN;
    }

    public OwnerContext(String userId, String str) {
        Intrinsics.checkNotNullParameter(userId, "userId");
        this.userId = userId;
        this.appId = str;
    }

    public /* synthetic */ OwnerContext(String str, String str2, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, (i & 2) != 0 ? null : str2);
    }

    public final String getUserId() {
        return this.userId;
    }

    public final String getAppId() {
        return this.appId;
    }
}
