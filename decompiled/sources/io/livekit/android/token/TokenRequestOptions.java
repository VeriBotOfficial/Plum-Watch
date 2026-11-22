package io.livekit.android.token;

import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: TokenSource.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001Be\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003Ji\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\n\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\rR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\r¨\u0006#"}, d2 = {"Lio/livekit/android/token/TokenRequestOptions;", "", "roomName", "", "participantName", "participantIdentity", "participantMetadata", "participantAttributes", "", "agentName", "agentMetadata", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "getAgentMetadata", "()Ljava/lang/String;", "getAgentName", "getParticipantAttributes", "()Ljava/util/Map;", "getParticipantIdentity", "getParticipantMetadata", "getParticipantName", "getRoomName", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final /* data */ class TokenRequestOptions {
    private final String agentMetadata;
    private final String agentName;
    private final Map<String, String> participantAttributes;
    private final String participantIdentity;
    private final String participantMetadata;
    private final String participantName;
    private final String roomName;

    public TokenRequestOptions() {
        this(null, null, null, null, null, null, null, 127, null);
    }

    public static /* synthetic */ TokenRequestOptions copy$default(TokenRequestOptions tokenRequestOptions, String str, String str2, String str3, String str4, Map map, String str5, String str6, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tokenRequestOptions.roomName;
        }
        if ((i & 2) != 0) {
            str2 = tokenRequestOptions.participantName;
        }
        if ((i & 4) != 0) {
            str3 = tokenRequestOptions.participantIdentity;
        }
        if ((i & 8) != 0) {
            str4 = tokenRequestOptions.participantMetadata;
        }
        if ((i & 16) != 0) {
            map = tokenRequestOptions.participantAttributes;
        }
        if ((i & 32) != 0) {
            str5 = tokenRequestOptions.agentName;
        }
        if ((i & 64) != 0) {
            str6 = tokenRequestOptions.agentMetadata;
        }
        String str7 = str5;
        String str8 = str6;
        Map map2 = map;
        String str9 = str3;
        return tokenRequestOptions.copy(str, str2, str9, str4, map2, str7, str8);
    }

    /* renamed from: component1, reason: from getter */
    public final String getRoomName() {
        return this.roomName;
    }

    /* renamed from: component2, reason: from getter */
    public final String getParticipantName() {
        return this.participantName;
    }

    /* renamed from: component3, reason: from getter */
    public final String getParticipantIdentity() {
        return this.participantIdentity;
    }

    /* renamed from: component4, reason: from getter */
    public final String getParticipantMetadata() {
        return this.participantMetadata;
    }

    public final Map<String, String> component5() {
        return this.participantAttributes;
    }

    /* renamed from: component6, reason: from getter */
    public final String getAgentName() {
        return this.agentName;
    }

    /* renamed from: component7, reason: from getter */
    public final String getAgentMetadata() {
        return this.agentMetadata;
    }

    public final TokenRequestOptions copy(String roomName, String participantName, String participantIdentity, String participantMetadata, Map<String, String> participantAttributes, String agentName, String agentMetadata) {
        return new TokenRequestOptions(roomName, participantName, participantIdentity, participantMetadata, participantAttributes, agentName, agentMetadata);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TokenRequestOptions)) {
            return false;
        }
        TokenRequestOptions tokenRequestOptions = (TokenRequestOptions) other;
        return Intrinsics.areEqual(this.roomName, tokenRequestOptions.roomName) && Intrinsics.areEqual(this.participantName, tokenRequestOptions.participantName) && Intrinsics.areEqual(this.participantIdentity, tokenRequestOptions.participantIdentity) && Intrinsics.areEqual(this.participantMetadata, tokenRequestOptions.participantMetadata) && Intrinsics.areEqual(this.participantAttributes, tokenRequestOptions.participantAttributes) && Intrinsics.areEqual(this.agentName, tokenRequestOptions.agentName) && Intrinsics.areEqual(this.agentMetadata, tokenRequestOptions.agentMetadata);
    }

    public int hashCode() {
        String str = this.roomName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.participantName;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.participantIdentity;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.participantMetadata;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Map<String, String> map = this.participantAttributes;
        int hashCode5 = (hashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        String str5 = this.agentName;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.agentMetadata;
        return hashCode6 + (str6 != null ? str6.hashCode() : 0);
    }

    public String toString() {
        return "TokenRequestOptions(roomName=" + this.roomName + ", participantName=" + this.participantName + ", participantIdentity=" + this.participantIdentity + ", participantMetadata=" + this.participantMetadata + ", participantAttributes=" + this.participantAttributes + ", agentName=" + this.agentName + ", agentMetadata=" + this.agentMetadata + ')';
    }

    public TokenRequestOptions(String str, String str2, String str3, String str4, Map<String, String> map, String str5, String str6) {
        this.roomName = str;
        this.participantName = str2;
        this.participantIdentity = str3;
        this.participantMetadata = str4;
        this.participantAttributes = map;
        this.agentName = str5;
        this.agentMetadata = str6;
    }

    public /* synthetic */ TokenRequestOptions(String str, String str2, String str3, String str4, Map map, String str5, String str6, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : str, (i & 2) != 0 ? null : str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4, (i & 16) != 0 ? null : map, (i & 32) != 0 ? null : str5, (i & 64) != 0 ? null : str6);
    }

    public final String getRoomName() {
        return this.roomName;
    }

    public final String getParticipantName() {
        return this.participantName;
    }

    public final String getParticipantIdentity() {
        return this.participantIdentity;
    }

    public final String getParticipantMetadata() {
        return this.participantMetadata;
    }

    public final Map<String, String> getParticipantAttributes() {
        return this.participantAttributes;
    }

    public final String getAgentName() {
        return this.agentName;
    }

    public final String getAgentMetadata() {
        return this.agentMetadata;
    }
}
