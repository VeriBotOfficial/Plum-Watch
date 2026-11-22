package io.livekit.android.room;

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

/* compiled from: IceCandidateJSON.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0081\b\u0018\u0000 #2\u00020\u0001:\u0002\"#B5\b\u0011\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0002\u0010\nB\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u000bJ\t\u0010\u0011\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J&\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 HÁ\u0001¢\u0006\u0002\b!R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\r¨\u0006$"}, d2 = {"Lio/livekit/android/room/IceCandidateJSON;", "", "seen1", "", "candidate", "", "sdpMLineIndex", "sdpMid", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;ILjava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "(Ljava/lang/String;ILjava/lang/String;)V", "getCandidate", "()Ljava/lang/String;", "getSdpMLineIndex", "()I", "getSdpMid", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$livekit_android_sdk_release", "$serializer", "Companion", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@Serializable
/* loaded from: classes6.dex */
public final /* data */ class IceCandidateJSON {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String candidate;
    private final int sdpMLineIndex;
    private final String sdpMid;

    public static /* synthetic */ IceCandidateJSON copy$default(IceCandidateJSON iceCandidateJSON, String str, int i, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = iceCandidateJSON.candidate;
        }
        if ((i2 & 2) != 0) {
            i = iceCandidateJSON.sdpMLineIndex;
        }
        if ((i2 & 4) != 0) {
            str2 = iceCandidateJSON.sdpMid;
        }
        return iceCandidateJSON.copy(str, i, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getCandidate() {
        return this.candidate;
    }

    /* renamed from: component2, reason: from getter */
    public final int getSdpMLineIndex() {
        return this.sdpMLineIndex;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSdpMid() {
        return this.sdpMid;
    }

    public final IceCandidateJSON copy(String candidate, int sdpMLineIndex, String sdpMid) {
        Intrinsics.checkNotNullParameter(candidate, "candidate");
        return new IceCandidateJSON(candidate, sdpMLineIndex, sdpMid);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IceCandidateJSON)) {
            return false;
        }
        IceCandidateJSON iceCandidateJSON = (IceCandidateJSON) other;
        return Intrinsics.areEqual(this.candidate, iceCandidateJSON.candidate) && this.sdpMLineIndex == iceCandidateJSON.sdpMLineIndex && Intrinsics.areEqual(this.sdpMid, iceCandidateJSON.sdpMid);
    }

    public int hashCode() {
        int hashCode = ((this.candidate.hashCode() * 31) + Integer.hashCode(this.sdpMLineIndex)) * 31;
        String str = this.sdpMid;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public String toString() {
        return "IceCandidateJSON(candidate=" + this.candidate + ", sdpMLineIndex=" + this.sdpMLineIndex + ", sdpMid=" + this.sdpMid + ')';
    }

    /* compiled from: IceCandidateJSON.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, d2 = {"Lio/livekit/android/room/IceCandidateJSON$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lio/livekit/android/room/IceCandidateJSON;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final KSerializer<IceCandidateJSON> serializer() {
            return IceCandidateJSON$$serializer.INSTANCE;
        }
    }

    @Deprecated(level = DeprecationLevel.HIDDEN, message = "This synthesized declaration should not be used directly", replaceWith = @ReplaceWith(expression = "", imports = {}))
    public /* synthetic */ IceCandidateJSON(int i, String str, int i2, String str2, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, IceCandidateJSON$$serializer.INSTANCE.getDescriptor());
        }
        this.candidate = str;
        this.sdpMLineIndex = i2;
        this.sdpMid = str2;
    }

    public IceCandidateJSON(String candidate, int i, String str) {
        Intrinsics.checkNotNullParameter(candidate, "candidate");
        this.candidate = candidate;
        this.sdpMLineIndex = i;
        this.sdpMid = str;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$livekit_android_sdk_release(IceCandidateJSON self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.candidate);
        output.encodeIntElement(serialDesc, 1, self.sdpMLineIndex);
        output.encodeNullableSerializableElement(serialDesc, 2, StringSerializer.INSTANCE, self.sdpMid);
    }

    public final String getCandidate() {
        return this.candidate;
    }

    public final int getSdpMLineIndex() {
        return this.sdpMLineIndex;
    }

    public final String getSdpMid() {
        return this.sdpMid;
    }
}
