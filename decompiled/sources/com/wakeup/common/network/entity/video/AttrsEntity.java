package com.wakeup.common.network.entity.video;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AttrsEntity.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0086\b\u0018\u00002\u00020\u0001BC\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u001c\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0003HÆ\u0003J\t\u0010 \u001a\u00020\bHÆ\u0003J\t\u0010!\u001a\u00020\bHÆ\u0003JE\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020\u0003HÖ\u0001J\t\u0010'\u001a\u00020\bHÖ\u0001R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0010\u0010\r\"\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0012\u0010\r\"\u0004\b\u0013\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\r\"\u0004\b\u0015\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R\u001a\u0010\t\u001a\u00020\bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0017\"\u0004\b\u001b\u0010\u0019¨\u0006("}, d2 = {"Lcom/wakeup/common/network/entity/video/AttrsEntity;", "", "coverWidth", "", "coverHeight", "videoWidth", "videoHeight", "coverFilepath", "", "videoFilepath", "<init>", "(IIIILjava/lang/String;Ljava/lang/String;)V", "getCoverWidth", "()I", "setCoverWidth", "(I)V", "getCoverHeight", "setCoverHeight", "getVideoWidth", "setVideoWidth", "getVideoHeight", "setVideoHeight", "getCoverFilepath", "()Ljava/lang/String;", "setCoverFilepath", "(Ljava/lang/String;)V", "getVideoFilepath", "setVideoFilepath", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "toString", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AttrsEntity {
    private String coverFilepath;
    private int coverHeight;
    private int coverWidth;
    private String videoFilepath;
    private int videoHeight;
    private int videoWidth;

    public AttrsEntity() {
        this(0, 0, 0, 0, null, null, 63, null);
    }

    public static /* synthetic */ AttrsEntity copy$default(AttrsEntity attrsEntity, int i, int i2, int i3, int i4, String str, String str2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = attrsEntity.coverWidth;
        }
        if ((i5 & 2) != 0) {
            i2 = attrsEntity.coverHeight;
        }
        if ((i5 & 4) != 0) {
            i3 = attrsEntity.videoWidth;
        }
        if ((i5 & 8) != 0) {
            i4 = attrsEntity.videoHeight;
        }
        if ((i5 & 16) != 0) {
            str = attrsEntity.coverFilepath;
        }
        if ((i5 & 32) != 0) {
            str2 = attrsEntity.videoFilepath;
        }
        String str3 = str;
        String str4 = str2;
        return attrsEntity.copy(i, i2, i3, i4, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final int getCoverWidth() {
        return this.coverWidth;
    }

    /* renamed from: component2, reason: from getter */
    public final int getCoverHeight() {
        return this.coverHeight;
    }

    /* renamed from: component3, reason: from getter */
    public final int getVideoWidth() {
        return this.videoWidth;
    }

    /* renamed from: component4, reason: from getter */
    public final int getVideoHeight() {
        return this.videoHeight;
    }

    /* renamed from: component5, reason: from getter */
    public final String getCoverFilepath() {
        return this.coverFilepath;
    }

    /* renamed from: component6, reason: from getter */
    public final String getVideoFilepath() {
        return this.videoFilepath;
    }

    public final AttrsEntity copy(int coverWidth, int coverHeight, int videoWidth, int videoHeight, String coverFilepath, String videoFilepath) {
        Intrinsics.checkNotNullParameter(coverFilepath, "coverFilepath");
        Intrinsics.checkNotNullParameter(videoFilepath, "videoFilepath");
        return new AttrsEntity(coverWidth, coverHeight, videoWidth, videoHeight, coverFilepath, videoFilepath);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AttrsEntity)) {
            return false;
        }
        AttrsEntity attrsEntity = (AttrsEntity) other;
        return this.coverWidth == attrsEntity.coverWidth && this.coverHeight == attrsEntity.coverHeight && this.videoWidth == attrsEntity.videoWidth && this.videoHeight == attrsEntity.videoHeight && Intrinsics.areEqual(this.coverFilepath, attrsEntity.coverFilepath) && Intrinsics.areEqual(this.videoFilepath, attrsEntity.videoFilepath);
    }

    public int hashCode() {
        return (((((((((Integer.hashCode(this.coverWidth) * 31) + Integer.hashCode(this.coverHeight)) * 31) + Integer.hashCode(this.videoWidth)) * 31) + Integer.hashCode(this.videoHeight)) * 31) + this.coverFilepath.hashCode()) * 31) + this.videoFilepath.hashCode();
    }

    public String toString() {
        return "AttrsEntity(coverWidth=" + this.coverWidth + ", coverHeight=" + this.coverHeight + ", videoWidth=" + this.videoWidth + ", videoHeight=" + this.videoHeight + ", coverFilepath=" + this.coverFilepath + ", videoFilepath=" + this.videoFilepath + Separators.RPAREN;
    }

    public AttrsEntity(int i, int i2, int i3, int i4, String coverFilepath, String videoFilepath) {
        Intrinsics.checkNotNullParameter(coverFilepath, "coverFilepath");
        Intrinsics.checkNotNullParameter(videoFilepath, "videoFilepath");
        this.coverWidth = i;
        this.coverHeight = i2;
        this.videoWidth = i3;
        this.videoHeight = i4;
        this.coverFilepath = coverFilepath;
        this.videoFilepath = videoFilepath;
    }

    public /* synthetic */ AttrsEntity(int i, int i2, int i3, int i4, String str, String str2, int i5, DefaultConstructorMarker defaultConstructorMarker) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4, (i5 & 16) != 0 ? "" : str, (i5 & 32) != 0 ? "" : str2);
    }

    public final int getCoverWidth() {
        return this.coverWidth;
    }

    public final void setCoverWidth(int i) {
        this.coverWidth = i;
    }

    public final int getCoverHeight() {
        return this.coverHeight;
    }

    public final void setCoverHeight(int i) {
        this.coverHeight = i;
    }

    public final int getVideoWidth() {
        return this.videoWidth;
    }

    public final void setVideoWidth(int i) {
        this.videoWidth = i;
    }

    public final int getVideoHeight() {
        return this.videoHeight;
    }

    public final void setVideoHeight(int i) {
        this.videoHeight = i;
    }

    public final String getCoverFilepath() {
        return this.coverFilepath;
    }

    public final void setCoverFilepath(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.coverFilepath = str;
    }

    public final String getVideoFilepath() {
        return this.videoFilepath;
    }

    public final void setVideoFilepath(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.videoFilepath = str;
    }
}
