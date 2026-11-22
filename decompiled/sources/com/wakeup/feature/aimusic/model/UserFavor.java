package com.wakeup.feature.aimusic.model;

import android.gov.nist.core.Separators;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserFavor.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0086\b\u0018\u00002\u00020\u0001B;\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\t\u0010\u0017\u001a\u00020\tHÆ\u0003J=\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\t2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0007HÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\b\u001a\u00020\t8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0012¨\u0006\u001d"}, d2 = {"Lcom/wakeup/feature/aimusic/model/UserFavor;", "", "favorId", "", "favorName", "coverPath", "songCount", "", "isDefault", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;IZ)V", "getFavorId", "()Ljava/lang/String;", "getFavorName", "getCoverPath", "getSongCount", "()I", "()Z", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "feature-aimusic_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class UserFavor {

    @SerializedName("cover_path")
    private final String coverPath;

    @SerializedName("favor_id")
    private final String favorId;

    @SerializedName("favor_name")
    private final String favorName;

    @SerializedName("is_default")
    private final boolean isDefault;

    @SerializedName("song_count")
    private final int songCount;

    public UserFavor() {
        this(null, null, null, 0, false, 31, null);
    }

    public static /* synthetic */ UserFavor copy$default(UserFavor userFavor, String str, String str2, String str3, int i, boolean z, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = userFavor.favorId;
        }
        if ((i2 & 2) != 0) {
            str2 = userFavor.favorName;
        }
        if ((i2 & 4) != 0) {
            str3 = userFavor.coverPath;
        }
        if ((i2 & 8) != 0) {
            i = userFavor.songCount;
        }
        if ((i2 & 16) != 0) {
            z = userFavor.isDefault;
        }
        boolean z2 = z;
        String str4 = str3;
        return userFavor.copy(str, str2, str4, i, z2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getFavorId() {
        return this.favorId;
    }

    /* renamed from: component2, reason: from getter */
    public final String getFavorName() {
        return this.favorName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getCoverPath() {
        return this.coverPath;
    }

    /* renamed from: component4, reason: from getter */
    public final int getSongCount() {
        return this.songCount;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getIsDefault() {
        return this.isDefault;
    }

    public final UserFavor copy(String favorId, String favorName, String coverPath, int songCount, boolean isDefault) {
        Intrinsics.checkNotNullParameter(favorId, "favorId");
        Intrinsics.checkNotNullParameter(favorName, "favorName");
        return new UserFavor(favorId, favorName, coverPath, songCount, isDefault);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserFavor)) {
            return false;
        }
        UserFavor userFavor = (UserFavor) other;
        return Intrinsics.areEqual(this.favorId, userFavor.favorId) && Intrinsics.areEqual(this.favorName, userFavor.favorName) && Intrinsics.areEqual(this.coverPath, userFavor.coverPath) && this.songCount == userFavor.songCount && this.isDefault == userFavor.isDefault;
    }

    public int hashCode() {
        int hashCode = ((this.favorId.hashCode() * 31) + this.favorName.hashCode()) * 31;
        String str = this.coverPath;
        return ((((hashCode + (str == null ? 0 : str.hashCode())) * 31) + Integer.hashCode(this.songCount)) * 31) + Boolean.hashCode(this.isDefault);
    }

    public String toString() {
        return "UserFavor(favorId=" + this.favorId + ", favorName=" + this.favorName + ", coverPath=" + this.coverPath + ", songCount=" + this.songCount + ", isDefault=" + this.isDefault + Separators.RPAREN;
    }

    public UserFavor(String favorId, String favorName, String str, int i, boolean z) {
        Intrinsics.checkNotNullParameter(favorId, "favorId");
        Intrinsics.checkNotNullParameter(favorName, "favorName");
        this.favorId = favorId;
        this.favorName = favorName;
        this.coverPath = str;
        this.songCount = i;
        this.isDefault = z;
    }

    public /* synthetic */ UserFavor(String str, String str2, String str3, int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this((i2 & 1) != 0 ? "" : str, (i2 & 2) != 0 ? "" : str2, (i2 & 4) != 0 ? null : str3, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? false : z);
    }

    public final String getFavorId() {
        return this.favorId;
    }

    public final String getFavorName() {
        return this.favorName;
    }

    public final String getCoverPath() {
        return this.coverPath;
    }

    public final int getSongCount() {
        return this.songCount;
    }

    public final boolean isDefault() {
        return this.isDefault;
    }
}
