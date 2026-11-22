package com.wakeup.common.network.entity.oral;

import android.gov.nist.core.Separators;
import com.facebook.react.animated.InterpolationAnimatedNode;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: OralBean.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0011JB\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0019J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001d\u001a\u00020\u001eHÖ\u0001J\t\u0010\u001f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011¨\u0006 "}, d2 = {"Lcom/wakeup/common/network/entity/oral/UserTokenBean;", "", "url", "", "token", InterpolationAnimatedNode.EXTRAPOLATE_TYPE_IDENTITY, "roomName", "expiresIn", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)V", "getUrl", "()Ljava/lang/String;", "getToken", "getIdentity", "getRoomName", "getExpiresIn", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Long;)Lcom/wakeup/common/network/entity/oral/UserTokenBean;", "equals", "", "other", "hashCode", "", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class UserTokenBean {
    private final Long expiresIn;
    private final String identity;
    private final String roomName;
    private final String token;
    private final String url;

    public static /* synthetic */ UserTokenBean copy$default(UserTokenBean userTokenBean, String str, String str2, String str3, String str4, Long l, int i, Object obj) {
        if ((i & 1) != 0) {
            str = userTokenBean.url;
        }
        if ((i & 2) != 0) {
            str2 = userTokenBean.token;
        }
        if ((i & 4) != 0) {
            str3 = userTokenBean.identity;
        }
        if ((i & 8) != 0) {
            str4 = userTokenBean.roomName;
        }
        if ((i & 16) != 0) {
            l = userTokenBean.expiresIn;
        }
        Long l2 = l;
        String str5 = str3;
        return userTokenBean.copy(str, str2, str5, str4, l2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUrl() {
        return this.url;
    }

    /* renamed from: component2, reason: from getter */
    public final String getToken() {
        return this.token;
    }

    /* renamed from: component3, reason: from getter */
    public final String getIdentity() {
        return this.identity;
    }

    /* renamed from: component4, reason: from getter */
    public final String getRoomName() {
        return this.roomName;
    }

    /* renamed from: component5, reason: from getter */
    public final Long getExpiresIn() {
        return this.expiresIn;
    }

    public final UserTokenBean copy(String url, String token, String identity, String roomName, Long expiresIn) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(identity, "identity");
        Intrinsics.checkNotNullParameter(roomName, "roomName");
        return new UserTokenBean(url, token, identity, roomName, expiresIn);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserTokenBean)) {
            return false;
        }
        UserTokenBean userTokenBean = (UserTokenBean) other;
        return Intrinsics.areEqual(this.url, userTokenBean.url) && Intrinsics.areEqual(this.token, userTokenBean.token) && Intrinsics.areEqual(this.identity, userTokenBean.identity) && Intrinsics.areEqual(this.roomName, userTokenBean.roomName) && Intrinsics.areEqual(this.expiresIn, userTokenBean.expiresIn);
    }

    public int hashCode() {
        int hashCode = ((((((this.url.hashCode() * 31) + this.token.hashCode()) * 31) + this.identity.hashCode()) * 31) + this.roomName.hashCode()) * 31;
        Long l = this.expiresIn;
        return hashCode + (l == null ? 0 : l.hashCode());
    }

    public String toString() {
        return "UserTokenBean(url=" + this.url + ", token=" + this.token + ", identity=" + this.identity + ", roomName=" + this.roomName + ", expiresIn=" + this.expiresIn + Separators.RPAREN;
    }

    public UserTokenBean(String url, String token, String identity, String roomName, Long l) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(token, "token");
        Intrinsics.checkNotNullParameter(identity, "identity");
        Intrinsics.checkNotNullParameter(roomName, "roomName");
        this.url = url;
        this.token = token;
        this.identity = identity;
        this.roomName = roomName;
        this.expiresIn = l;
    }

    public /* synthetic */ UserTokenBean(String str, String str2, String str3, String str4, Long l, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, str3, str4, (i & 16) != 0 ? null : l);
    }

    public final String getUrl() {
        return this.url;
    }

    public final String getToken() {
        return this.token;
    }

    public final String getIdentity() {
        return this.identity;
    }

    public final String getRoomName() {
        return this.roomName;
    }

    public final Long getExpiresIn() {
        return this.expiresIn;
    }
}
