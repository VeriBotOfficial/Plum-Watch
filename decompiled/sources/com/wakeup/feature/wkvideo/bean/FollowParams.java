package com.wakeup.feature.wkvideo.bean;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WKVideoViewModelBean.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001b\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\u0003HÆ\u0003J]\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00032\b\b\u0002\u0010\u000b\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\"\u001a\u00020\t2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000fR\u001a\u0010\b\u001a\u00020\tX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000fR\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u000f¨\u0006'"}, d2 = {"Lcom/wakeup/feature/wkvideo/bean/FollowParams;", "", "uid", "", "pushId", "pushName", "pushAvatar", "categoryId", "isFollow", "", "biPosition", "biOriginPosition", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)V", "getUid", "()Ljava/lang/String;", "getPushId", "getPushName", "getPushAvatar", "getCategoryId", "()Z", "setFollow", "(Z)V", "getBiPosition", "getBiOriginPosition", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "other", "hashCode", "", "toString", "feature-wkvideo_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FollowParams {
    private final String biOriginPosition;
    private final String biPosition;
    private final String categoryId;
    private boolean isFollow;
    private final String pushAvatar;
    private final String pushId;
    private final String pushName;
    private final String uid;

    public static /* synthetic */ FollowParams copy$default(FollowParams followParams, String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, int i, Object obj) {
        if ((i & 1) != 0) {
            str = followParams.uid;
        }
        if ((i & 2) != 0) {
            str2 = followParams.pushId;
        }
        if ((i & 4) != 0) {
            str3 = followParams.pushName;
        }
        if ((i & 8) != 0) {
            str4 = followParams.pushAvatar;
        }
        if ((i & 16) != 0) {
            str5 = followParams.categoryId;
        }
        if ((i & 32) != 0) {
            z = followParams.isFollow;
        }
        if ((i & 64) != 0) {
            str6 = followParams.biPosition;
        }
        if ((i & 128) != 0) {
            str7 = followParams.biOriginPosition;
        }
        String str8 = str6;
        String str9 = str7;
        String str10 = str5;
        boolean z2 = z;
        return followParams.copy(str, str2, str3, str4, str10, z2, str8, str9);
    }

    /* renamed from: component1, reason: from getter */
    public final String getUid() {
        return this.uid;
    }

    /* renamed from: component2, reason: from getter */
    public final String getPushId() {
        return this.pushId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getPushName() {
        return this.pushName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getPushAvatar() {
        return this.pushAvatar;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCategoryId() {
        return this.categoryId;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsFollow() {
        return this.isFollow;
    }

    /* renamed from: component7, reason: from getter */
    public final String getBiPosition() {
        return this.biPosition;
    }

    /* renamed from: component8, reason: from getter */
    public final String getBiOriginPosition() {
        return this.biOriginPosition;
    }

    public final FollowParams copy(String uid, String pushId, String pushName, String pushAvatar, String categoryId, boolean isFollow, String biPosition, String biOriginPosition) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(pushId, "pushId");
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        Intrinsics.checkNotNullParameter(biPosition, "biPosition");
        Intrinsics.checkNotNullParameter(biOriginPosition, "biOriginPosition");
        return new FollowParams(uid, pushId, pushName, pushAvatar, categoryId, isFollow, biPosition, biOriginPosition);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FollowParams)) {
            return false;
        }
        FollowParams followParams = (FollowParams) other;
        return Intrinsics.areEqual(this.uid, followParams.uid) && Intrinsics.areEqual(this.pushId, followParams.pushId) && Intrinsics.areEqual(this.pushName, followParams.pushName) && Intrinsics.areEqual(this.pushAvatar, followParams.pushAvatar) && Intrinsics.areEqual(this.categoryId, followParams.categoryId) && this.isFollow == followParams.isFollow && Intrinsics.areEqual(this.biPosition, followParams.biPosition) && Intrinsics.areEqual(this.biOriginPosition, followParams.biOriginPosition);
    }

    public int hashCode() {
        int hashCode = ((this.uid.hashCode() * 31) + this.pushId.hashCode()) * 31;
        String str = this.pushName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.pushAvatar;
        return ((((((((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + this.categoryId.hashCode()) * 31) + Boolean.hashCode(this.isFollow)) * 31) + this.biPosition.hashCode()) * 31) + this.biOriginPosition.hashCode();
    }

    public String toString() {
        return "FollowParams(uid=" + this.uid + ", pushId=" + this.pushId + ", pushName=" + this.pushName + ", pushAvatar=" + this.pushAvatar + ", categoryId=" + this.categoryId + ", isFollow=" + this.isFollow + ", biPosition=" + this.biPosition + ", biOriginPosition=" + this.biOriginPosition + Separators.RPAREN;
    }

    public FollowParams(String uid, String pushId, String str, String str2, String categoryId, boolean z, String biPosition, String biOriginPosition) {
        Intrinsics.checkNotNullParameter(uid, "uid");
        Intrinsics.checkNotNullParameter(pushId, "pushId");
        Intrinsics.checkNotNullParameter(categoryId, "categoryId");
        Intrinsics.checkNotNullParameter(biPosition, "biPosition");
        Intrinsics.checkNotNullParameter(biOriginPosition, "biOriginPosition");
        this.uid = uid;
        this.pushId = pushId;
        this.pushName = str;
        this.pushAvatar = str2;
        this.categoryId = categoryId;
        this.isFollow = z;
        this.biPosition = biPosition;
        this.biOriginPosition = biOriginPosition;
    }

    public final String getUid() {
        return this.uid;
    }

    public final String getPushId() {
        return this.pushId;
    }

    public final String getPushName() {
        return this.pushName;
    }

    public final String getPushAvatar() {
        return this.pushAvatar;
    }

    public /* synthetic */ FollowParams(String str, String str2, String str3, String str4, String str5, boolean z, String str6, String str7, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, (i & 16) != 0 ? "" : str5, z, str6, str7);
    }

    public final String getCategoryId() {
        return this.categoryId;
    }

    public final boolean isFollow() {
        return this.isFollow;
    }

    public final void setFollow(boolean z) {
        this.isFollow = z;
    }

    public final String getBiPosition() {
        return this.biPosition;
    }

    public final String getBiOriginPosition() {
        return this.biOriginPosition;
    }
}
