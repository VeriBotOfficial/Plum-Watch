package io.livekit.android.token;

import kotlin.Deprecated;
import kotlin.DeprecationLevel;
import kotlin.Metadata;
import kotlin.ReplaceWith;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;
import kotlinx.serialization.internal.StringSerializer;

/* compiled from: TokenSource.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 %2\u00020\u0001:\u0002$%BA\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\u0002\u0010\u000bB-\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\fJ\t\u0010\u0012\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J5\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001b\u001a\u00020\u0005HÖ\u0001J&\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u00002\u0006\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"HÁ\u0001¢\u0006\u0002\b#R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006&"}, d2 = {"Lio/livekit/android/token/TokenSourceResponse;", "", "seen1", "", "serverUrl", "", "participantToken", "roomName", "participantName", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getParticipantName", "()Ljava/lang/String;", "getParticipantToken", "getRoomName", "getServerUrl", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$livekit_android_sdk_release", "$serializer", "Companion", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes6.dex */
public final /* data */ class TokenSourceResponse {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String participantName;
    private final String participantToken;
    private final String roomName;
    private final String serverUrl;

    public static /* synthetic */ TokenSourceResponse copy$default(TokenSourceResponse tokenSourceResponse, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tokenSourceResponse.serverUrl;
        }
        if ((i & 2) != 0) {
            str2 = tokenSourceResponse.participantToken;
        }
        if ((i & 4) != 0) {
            str3 = tokenSourceResponse.roomName;
        }
        if ((i & 8) != 0) {
            str4 = tokenSourceResponse.participantName;
        }
        return tokenSourceResponse.copy(str, str2, str3, str4);
    }

    /* renamed from: component1, reason: from getter */
    public final String getServerUrl() {
        return this.serverUrl;
    }

    /* renamed from: component2, reason: from getter */
    public final String getParticipantToken() {
        return this.participantToken;
    }

    /* renamed from: component3, reason: from getter */
    public final String getRoomName() {
        return this.roomName;
    }

    /* renamed from: component4, reason: from getter */
    public final String getParticipantName() {
        return this.participantName;
    }

    public final TokenSourceResponse copy(String serverUrl, String participantToken, String roomName, String participantName) {
        Intrinsics.checkNotNullParameter(serverUrl, "serverUrl");
        Intrinsics.checkNotNullParameter(participantToken, "participantToken");
        return new TokenSourceResponse(serverUrl, participantToken, roomName, participantName);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TokenSourceResponse)) {
            return false;
        }
        TokenSourceResponse tokenSourceResponse = (TokenSourceResponse) other;
        return Intrinsics.areEqual(this.serverUrl, tokenSourceResponse.serverUrl) && Intrinsics.areEqual(this.participantToken, tokenSourceResponse.participantToken) && Intrinsics.areEqual(this.roomName, tokenSourceResponse.roomName) && Intrinsics.areEqual(this.participantName, tokenSourceResponse.participantName);
    }

    public int hashCode() {
        int hashCode = ((this.serverUrl.hashCode() * 31) + this.participantToken.hashCode()) * 31;
        String str = this.roomName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.participantName;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "TokenSourceResponse(serverUrl=" + this.serverUrl + ", participantToken=" + this.participantToken + ", roomName=" + this.roomName + ", participantName=" + this.participantName + ')';
    }

    /* compiled from: TokenSource.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lio/livekit/android/token/TokenSourceResponse$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/livekit/android/token/TokenSourceResponse;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<TokenSourceResponse> serializer() {
            return TokenSourceResponse$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ TokenSourceResponse(int i, String str, String str2, String str3, String str4, SerializationConstructorMarker serializationConstructorMarker) {
        if (3 != (i & 3)) {
            PluginExceptionsKt.throwMissingFieldException(i, 3, TokenSourceResponse$$serializer.INSTANCE.getDescriptor());
        }
        this.serverUrl = str;
        this.participantToken = str2;
        if ((i & 4) == 0) {
            this.roomName = null;
        } else {
            this.roomName = str3;
        }
        if ((i & 8) == 0) {
            this.participantName = null;
        } else {
            this.participantName = str4;
        }
    }

    public TokenSourceResponse(String serverUrl, String participantToken, String str, String str2) {
        Intrinsics.checkNotNullParameter(serverUrl, "serverUrl");
        Intrinsics.checkNotNullParameter(participantToken, "participantToken");
        this.serverUrl = serverUrl;
        this.participantToken = participantToken;
        this.roomName = str;
        this.participantName = str2;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$livekit_android_sdk_release(TokenSourceResponse self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.serverUrl);
        output.encodeStringElement(serialDesc, 1, self.participantToken);
        if (output.shouldEncodeElementDefault(serialDesc, 2) || self.roomName != null) {
            output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.roomName);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 3) && self.participantName == null) {
            return;
        }
        output.encodeNullableSerializableElement(serialDesc, 3, StringSerializer.INSTANCE, self.participantName);
    }

    public /* synthetic */ TokenSourceResponse(String str, String str2, String str3, String str4, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i & 4) != 0 ? null : str3, (i & 8) != 0 ? null : str4);
    }

    public final String getServerUrl() {
        return this.serverUrl;
    }

    public final String getParticipantToken() {
        return this.participantToken;
    }

    public final String getRoomName() {
        return this.roomName;
    }

    public final String getParticipantName() {
        return this.participantName;
    }
}
