package io.livekit.android.token;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TokenPayload.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001BG\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\tHÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\rJ\\\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u001dJ\u0013\u0010\u001e\u001a\u00020\u00052\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\f\u0010\rR\u0015\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u000f\u0010\rR\u0019\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0015\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u000e\u001a\u0004\b\u0015\u0010\r¨\u0006#"}, d2 = {"Lio/livekit/android/token/VideoGrants;", "", "room", "", "roomJoin", "", "canPublish", "canPublishData", "canPublishSources", "", "canSubscribe", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;)V", "getCanPublish", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getCanPublishData", "getCanPublishSources", "()Ljava/util/List;", "getCanSubscribe", "getRoom", "()Ljava/lang/String;", "getRoomJoin", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/Boolean;)Lio/livekit/android/token/VideoGrants;", "equals", "other", "hashCode", "", "toString", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class VideoGrants {
    private final Boolean canPublish;
    private final Boolean canPublishData;
    private final List<String> canPublishSources;
    private final Boolean canSubscribe;
    private final String room;
    private final Boolean roomJoin;

    public static /* synthetic */ VideoGrants copy$default(VideoGrants videoGrants, String str, Boolean bool, Boolean bool2, Boolean bool3, List list, Boolean bool4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = videoGrants.room;
        }
        if ((i & 2) != 0) {
            bool = videoGrants.roomJoin;
        }
        if ((i & 4) != 0) {
            bool2 = videoGrants.canPublish;
        }
        if ((i & 8) != 0) {
            bool3 = videoGrants.canPublishData;
        }
        if ((i & 16) != 0) {
            list = videoGrants.canPublishSources;
        }
        if ((i & 32) != 0) {
            bool4 = videoGrants.canSubscribe;
        }
        List list2 = list;
        Boolean bool5 = bool4;
        return videoGrants.copy(str, bool, bool2, bool3, list2, bool5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getRoom() {
        return this.room;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getRoomJoin() {
        return this.roomJoin;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getCanPublish() {
        return this.canPublish;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getCanPublishData() {
        return this.canPublishData;
    }

    public final List<String> component5() {
        return this.canPublishSources;
    }

    /* renamed from: component6, reason: from getter */
    public final Boolean getCanSubscribe() {
        return this.canSubscribe;
    }

    public final VideoGrants copy(String room, Boolean roomJoin, Boolean canPublish, Boolean canPublishData, List<String> canPublishSources, Boolean canSubscribe) {
        return new VideoGrants(room, roomJoin, canPublish, canPublishData, canPublishSources, canSubscribe);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof VideoGrants)) {
            return false;
        }
        VideoGrants videoGrants = (VideoGrants) other;
        return Intrinsics.areEqual(this.room, videoGrants.room) && Intrinsics.areEqual(this.roomJoin, videoGrants.roomJoin) && Intrinsics.areEqual(this.canPublish, videoGrants.canPublish) && Intrinsics.areEqual(this.canPublishData, videoGrants.canPublishData) && Intrinsics.areEqual(this.canPublishSources, videoGrants.canPublishSources) && Intrinsics.areEqual(this.canSubscribe, videoGrants.canSubscribe);
    }

    public int hashCode() {
        String str = this.room;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.roomJoin;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.canPublish;
        int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.canPublishData;
        int hashCode4 = (hashCode3 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        List<String> list = this.canPublishSources;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool4 = this.canSubscribe;
        return hashCode5 + (bool4 != null ? bool4.hashCode() : 0);
    }

    public String toString() {
        return "VideoGrants(room=" + this.room + ", roomJoin=" + this.roomJoin + ", canPublish=" + this.canPublish + ", canPublishData=" + this.canPublishData + ", canPublishSources=" + this.canPublishSources + ", canSubscribe=" + this.canSubscribe + ')';
    }

    public VideoGrants(String str, Boolean bool, Boolean bool2, Boolean bool3, List<String> list, Boolean bool4) {
        this.room = str;
        this.roomJoin = bool;
        this.canPublish = bool2;
        this.canPublishData = bool3;
        this.canPublishSources = list;
        this.canSubscribe = bool4;
    }

    public final String getRoom() {
        return this.room;
    }

    public final Boolean getRoomJoin() {
        return this.roomJoin;
    }

    public final Boolean getCanPublish() {
        return this.canPublish;
    }

    public final Boolean getCanPublishData() {
        return this.canPublishData;
    }

    public final List<String> getCanPublishSources() {
        return this.canPublishSources;
    }

    public final Boolean getCanSubscribe() {
        return this.canSubscribe;
    }
}
