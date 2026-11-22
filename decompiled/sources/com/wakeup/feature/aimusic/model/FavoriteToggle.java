package com.wakeup.feature.aimusic.model;

import android.gov.nist.core.Separators;
import com.google.gson.annotations.SerializedName;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UserFavor.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/wakeup/feature/aimusic/model/FavoriteToggle;", "", "musicId", "", "favorited", "", "<init>", "(Ljava/lang/String;Z)V", "getMusicId", "()Ljava/lang/String;", "getFavorited", "()Z", "component1", "component2", "copy", "equals", "other", "hashCode", "", "toString", "feature-aimusic_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class FavoriteToggle {

    @SerializedName("favorited")
    private final boolean favorited;

    @SerializedName("music_id")
    private final String musicId;

    /* JADX WARN: Multi-variable type inference failed */
    public FavoriteToggle() {
        this(null, false, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ FavoriteToggle copy$default(FavoriteToggle favoriteToggle, String str, boolean z, int i, Object obj) {
        if ((i & 1) != 0) {
            str = favoriteToggle.musicId;
        }
        if ((i & 2) != 0) {
            z = favoriteToggle.favorited;
        }
        return favoriteToggle.copy(str, z);
    }

    /* renamed from: component1, reason: from getter */
    public final String getMusicId() {
        return this.musicId;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getFavorited() {
        return this.favorited;
    }

    public final FavoriteToggle copy(String musicId, boolean favorited) {
        Intrinsics.checkNotNullParameter(musicId, "musicId");
        return new FavoriteToggle(musicId, favorited);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FavoriteToggle)) {
            return false;
        }
        FavoriteToggle favoriteToggle = (FavoriteToggle) other;
        return Intrinsics.areEqual(this.musicId, favoriteToggle.musicId) && this.favorited == favoriteToggle.favorited;
    }

    public int hashCode() {
        return (this.musicId.hashCode() * 31) + Boolean.hashCode(this.favorited);
    }

    public String toString() {
        return "FavoriteToggle(musicId=" + this.musicId + ", favorited=" + this.favorited + Separators.RPAREN;
    }

    public FavoriteToggle(String musicId, boolean z) {
        Intrinsics.checkNotNullParameter(musicId, "musicId");
        this.musicId = musicId;
        this.favorited = z;
    }

    public /* synthetic */ FavoriteToggle(String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? false : z);
    }

    public final String getMusicId() {
        return this.musicId;
    }

    public final boolean getFavorited() {
        return this.favorited;
    }
}
