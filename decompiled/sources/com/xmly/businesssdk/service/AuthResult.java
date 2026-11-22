package com.xmly.businesssdk.service;

import com.phancy.mini.api.device.AppAuthorizeSettingModule;
import com.xmly.businesssdk.config.c;
import com.xmly.businesssdk.db.entity.a;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AuthResult.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0007HÆ\u0003J'\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0007HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00032\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0007HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lcom/xmly/businesssdk/service/AuthResult;", "", "hasPermission", "", "albumId", "", "message", "", "(ZJLjava/lang/String;)V", "getAlbumId", "()J", "getHasPermission", "()Z", "getMessage", "()Ljava/lang/String;", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "Companion", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AuthResult {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final long albumId;
    private final boolean hasPermission;
    private final String message;

    /* compiled from: AuthResult.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0018\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bJ\u0018\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bJ\u0016\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b¨\u0006\u000b"}, d2 = {"Lcom/xmly/businesssdk/service/AuthResult$Companion;", "", "()V", AppAuthorizeSettingModule.AUTHORIZED, "Lcom/xmly/businesssdk/service/AuthResult;", "albumId", "", "message", "", "denied", "error", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public static /* synthetic */ AuthResult authorized$default(Companion companion, long j, String str, int i, Object obj) {
            if ((i & 2) != 0) {
                str = "有权限访问";
            }
            return companion.authorized(j, str);
        }

        public static /* synthetic */ AuthResult denied$default(Companion companion, long j, String str, int i, Object obj) {
            if ((i & 2) != 0) {
                str = "无权限访问";
            }
            return companion.denied(j, str);
        }

        public final AuthResult authorized(long albumId, String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new AuthResult(true, albumId, message);
        }

        public final AuthResult denied(long albumId, String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new AuthResult(false, albumId, message);
        }

        public final AuthResult error(long albumId, String message) {
            Intrinsics.checkNotNullParameter(message, "message");
            return new AuthResult(false, albumId, message);
        }
    }

    public AuthResult(boolean z, long j, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        this.hasPermission = z;
        this.albumId = j;
        this.message = message;
    }

    public static /* synthetic */ AuthResult copy$default(AuthResult authResult, boolean z, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            z = authResult.hasPermission;
        }
        if ((i & 2) != 0) {
            j = authResult.albumId;
        }
        if ((i & 4) != 0) {
            str = authResult.message;
        }
        return authResult.copy(z, j, str);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getHasPermission() {
        return this.hasPermission;
    }

    /* renamed from: component2, reason: from getter */
    public final long getAlbumId() {
        return this.albumId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getMessage() {
        return this.message;
    }

    public final AuthResult copy(boolean hasPermission, long albumId, String message) {
        Intrinsics.checkNotNullParameter(message, "message");
        return new AuthResult(hasPermission, albumId, message);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AuthResult)) {
            return false;
        }
        AuthResult authResult = (AuthResult) other;
        return this.hasPermission == authResult.hasPermission && this.albumId == authResult.albumId && Intrinsics.areEqual(this.message, authResult.message);
    }

    public final long getAlbumId() {
        return this.albumId;
    }

    public final boolean getHasPermission() {
        return this.hasPermission;
    }

    public final String getMessage() {
        return this.message;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    public int hashCode() {
        boolean z = this.hasPermission;
        ?? r0 = z;
        if (z) {
            r0 = 1;
        }
        return this.message.hashCode() + a.a(this.albumId, r0 * 31, 31);
    }

    public String toString() {
        return c.a(com.xmly.businesssdk.c.a("AuthResult(hasPermission=").append(this.hasPermission).append(", albumId=").append(this.albumId).append(", message="), this.message, ')');
    }
}
