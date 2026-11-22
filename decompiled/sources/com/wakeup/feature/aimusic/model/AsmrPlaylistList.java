package com.wakeup.feature.aimusic.model;

import android.gov.nist.core.Separators;
import com.google.gson.annotations.SerializedName;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AsmrPlaylistList.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u0002\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001c\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0015"}, d2 = {"Lcom/wakeup/feature/aimusic/model/AsmrPlaylistList;", "", "copy", "", "playlists", "", "Lcom/wakeup/feature/aimusic/model/AsmrPlaylist;", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "getCopy", "()Ljava/lang/String;", "getPlaylists", "()Ljava/util/List;", "component1", "component2", "equals", "", "other", "hashCode", "", "toString", "feature-aimusic_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class AsmrPlaylistList {

    @SerializedName("copy")
    private final String copy;

    @SerializedName("playlists")
    private final List<AsmrPlaylist> playlists;

    /* JADX WARN: Multi-variable type inference failed */
    public AsmrPlaylistList() {
        this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ AsmrPlaylistList copy$default(AsmrPlaylistList asmrPlaylistList, String str, List list, int i, Object obj) {
        if ((i & 1) != 0) {
            str = asmrPlaylistList.copy;
        }
        if ((i & 2) != 0) {
            list = asmrPlaylistList.playlists;
        }
        return asmrPlaylistList.copy(str, list);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCopy() {
        return this.copy;
    }

    public final List<AsmrPlaylist> component2() {
        return this.playlists;
    }

    public final AsmrPlaylistList copy(String copy, List<AsmrPlaylist> playlists) {
        Intrinsics.checkNotNullParameter(copy, "copy");
        Intrinsics.checkNotNullParameter(playlists, "playlists");
        return new AsmrPlaylistList(copy, playlists);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AsmrPlaylistList)) {
            return false;
        }
        AsmrPlaylistList asmrPlaylistList = (AsmrPlaylistList) other;
        return Intrinsics.areEqual(this.copy, asmrPlaylistList.copy) && Intrinsics.areEqual(this.playlists, asmrPlaylistList.playlists);
    }

    public int hashCode() {
        return (this.copy.hashCode() * 31) + this.playlists.hashCode();
    }

    public String toString() {
        return "AsmrPlaylistList(copy=" + this.copy + ", playlists=" + this.playlists + Separators.RPAREN;
    }

    public AsmrPlaylistList(String copy, List<AsmrPlaylist> playlists) {
        Intrinsics.checkNotNullParameter(copy, "copy");
        Intrinsics.checkNotNullParameter(playlists, "playlists");
        this.copy = copy;
        this.playlists = playlists;
    }

    public /* synthetic */ AsmrPlaylistList(String str, List list, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? CollectionsKt.emptyList() : list);
    }

    public final String getCopy() {
        return this.copy;
    }

    public final List<AsmrPlaylist> getPlaylists() {
        return this.playlists;
    }
}
