package com.newtype.sdkcore;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.internal.PluginExceptionsKt;
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: NewTypeSessionClient.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0083\b\u0018\u0000 #2\u00020\u0001:\u0002\"#B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007B9\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0006\u0010\fJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J'\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\tHÖ\u0001J\t\u0010\u0019\u001a\u00020\u0003HÖ\u0001J%\u0010\u001a\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001e2\u0006\u0010\u001f\u001a\u00020 H\u0001¢\u0006\u0002\b!R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000e¨\u0006$"}, d2 = {"Lcom/newtype/sdkcore/TurnResultPayload;", "", "transcript", "", "ipa", "reply", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "seen0", "", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getTranscript", "()Ljava/lang/String;", "getIpa", "getReply", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$newtypesdkcore_release", "$serializer", "Companion", "newtypesdkcore_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
/* loaded from: classes17.dex */
final /* data */ class TurnResultPayload {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final String ipa;
    private final String reply;
    private final String transcript;

    public static /* synthetic */ TurnResultPayload copy$default(TurnResultPayload turnResultPayload, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = turnResultPayload.transcript;
        }
        if ((i & 2) != 0) {
            str2 = turnResultPayload.ipa;
        }
        if ((i & 4) != 0) {
            str3 = turnResultPayload.reply;
        }
        return turnResultPayload.copy(str, str2, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTranscript() {
        return this.transcript;
    }

    /* renamed from: component2, reason: from getter */
    public final String getIpa() {
        return this.ipa;
    }

    /* renamed from: component3, reason: from getter */
    public final String getReply() {
        return this.reply;
    }

    public final TurnResultPayload copy(String transcript, String ipa, String reply) {
        Intrinsics.checkNotNullParameter(transcript, "transcript");
        Intrinsics.checkNotNullParameter(ipa, "ipa");
        Intrinsics.checkNotNullParameter(reply, "reply");
        return new TurnResultPayload(transcript, ipa, reply);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TurnResultPayload)) {
            return false;
        }
        TurnResultPayload turnResultPayload = (TurnResultPayload) other;
        return Intrinsics.areEqual(this.transcript, turnResultPayload.transcript) && Intrinsics.areEqual(this.ipa, turnResultPayload.ipa) && Intrinsics.areEqual(this.reply, turnResultPayload.reply);
    }

    public int hashCode() {
        return (((this.transcript.hashCode() * 31) + this.ipa.hashCode()) * 31) + this.reply.hashCode();
    }

    public String toString() {
        return "TurnResultPayload(transcript=" + this.transcript + ", ipa=" + this.ipa + ", reply=" + this.reply + Separators.RPAREN;
    }

    /* compiled from: NewTypeSessionClient.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/newtype/sdkcore/TurnResultPayload$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/newtype/sdkcore/TurnResultPayload;", "newtypesdkcore_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<TurnResultPayload> serializer() {
            return TurnResultPayload$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ TurnResultPayload(int i, String str, String str2, String str3, SerializationConstructorMarker serializationConstructorMarker) {
        if (7 != (i & 7)) {
            PluginExceptionsKt.throwMissingFieldException(i, 7, TurnResultPayload$$serializer.INSTANCE.getDescriptor());
        }
        this.transcript = str;
        this.ipa = str2;
        this.reply = str3;
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$newtypesdkcore_release(TurnResultPayload self, CompositeEncoder output, SerialDescriptor serialDesc) {
        output.encodeStringElement(serialDesc, 0, self.transcript);
        output.encodeStringElement(serialDesc, 1, self.ipa);
        output.encodeStringElement(serialDesc, 2, self.reply);
    }

    public TurnResultPayload(String transcript, String ipa, String reply) {
        Intrinsics.checkNotNullParameter(transcript, "transcript");
        Intrinsics.checkNotNullParameter(ipa, "ipa");
        Intrinsics.checkNotNullParameter(reply, "reply");
        this.transcript = transcript;
        this.ipa = ipa;
        this.reply = reply;
    }

    public final String getTranscript() {
        return this.transcript;
    }

    public final String getIpa() {
        return this.ipa;
    }

    public final String getReply() {
        return this.reply;
    }
}
