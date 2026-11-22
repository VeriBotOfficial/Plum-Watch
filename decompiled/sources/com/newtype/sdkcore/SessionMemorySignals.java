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
import kotlinx.serialization.internal.SerializationConstructorMarker;

/* compiled from: NewTypeModels.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u0000 $2\u00020\u0001:\u0002#$B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bB5\b\u0010\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u0007\u0010\fJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0005HÆ\u0003J'\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001J%\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00002\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!H\u0001¢\u0006\u0002\b\"R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006%"}, d2 = {"Lcom/newtype/sdkcore/SessionMemorySignals;", "", "lastChildTurn", "", "totalTurns", "", "childTurnCount", "<init>", "(Ljava/lang/String;II)V", "seen0", "serializationConstructorMarker", "Lkotlinx/serialization/internal/SerializationConstructorMarker;", "(ILjava/lang/String;IILkotlinx/serialization/internal/SerializationConstructorMarker;)V", "getLastChildTurn", "()Ljava/lang/String;", "getTotalTurns", "()I", "getChildTurnCount", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "write$Self", "", "self", "output", "Lkotlinx/serialization/encoding/CompositeEncoder;", "serialDesc", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "write$Self$newtypesdkcore_release", "$serializer", "Companion", "newtypesdkcore_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
@Serializable
/* loaded from: classes17.dex */
public final /* data */ class SessionMemorySignals {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private final int childTurnCount;
    private final String lastChildTurn;
    private final int totalTurns;

    public SessionMemorySignals() {
        this((String) null, 0, 0, 7, (DefaultConstructorMarker) null);
    }

    public static /* synthetic */ SessionMemorySignals copy$default(SessionMemorySignals sessionMemorySignals, String str, int i, int i2, int i3, Object obj) {
        if ((i3 & 1) != 0) {
            str = sessionMemorySignals.lastChildTurn;
        }
        if ((i3 & 2) != 0) {
            i = sessionMemorySignals.totalTurns;
        }
        if ((i3 & 4) != 0) {
            i2 = sessionMemorySignals.childTurnCount;
        }
        return sessionMemorySignals.copy(str, i, i2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLastChildTurn() {
        return this.lastChildTurn;
    }

    /* renamed from: component2, reason: from getter */
    public final int getTotalTurns() {
        return this.totalTurns;
    }

    /* renamed from: component3, reason: from getter */
    public final int getChildTurnCount() {
        return this.childTurnCount;
    }

    public final SessionMemorySignals copy(String lastChildTurn, int totalTurns, int childTurnCount) {
        Intrinsics.checkNotNullParameter(lastChildTurn, "lastChildTurn");
        return new SessionMemorySignals(lastChildTurn, totalTurns, childTurnCount);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SessionMemorySignals)) {
            return false;
        }
        SessionMemorySignals sessionMemorySignals = (SessionMemorySignals) other;
        return Intrinsics.areEqual(this.lastChildTurn, sessionMemorySignals.lastChildTurn) && this.totalTurns == sessionMemorySignals.totalTurns && this.childTurnCount == sessionMemorySignals.childTurnCount;
    }

    public int hashCode() {
        return (((this.lastChildTurn.hashCode() * 31) + Integer.hashCode(this.totalTurns)) * 31) + Integer.hashCode(this.childTurnCount);
    }

    public String toString() {
        return "SessionMemorySignals(lastChildTurn=" + this.lastChildTurn + ", totalTurns=" + this.totalTurns + ", childTurnCount=" + this.childTurnCount + Separators.RPAREN;
    }

    /* compiled from: NewTypeModels.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¨\u0006\u0007"}, d2 = {"Lcom/newtype/sdkcore/SessionMemorySignals$Companion;", "", "<init>", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lcom/newtype/sdkcore/SessionMemorySignals;", "newtypesdkcore_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<SessionMemorySignals> serializer() {
            return SessionMemorySignals$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ SessionMemorySignals(int i, String str, int i2, int i3, SerializationConstructorMarker serializationConstructorMarker) {
        this.lastChildTurn = (i & 1) == 0 ? "" : str;
        if ((i & 2) == 0) {
            this.totalTurns = 0;
        } else {
            this.totalTurns = i2;
        }
        if ((i & 4) == 0) {
            this.childTurnCount = 0;
        } else {
            this.childTurnCount = i3;
        }
    }

    @JvmStatic
    public static final /* synthetic */ void write$Self$newtypesdkcore_release(SessionMemorySignals self, CompositeEncoder output, SerialDescriptor serialDesc) {
        if (output.shouldEncodeElementDefault(serialDesc, 0) || !Intrinsics.areEqual(self.lastChildTurn, "")) {
            output.encodeStringElement(serialDesc, 0, self.lastChildTurn);
        }
        if (output.shouldEncodeElementDefault(serialDesc, 1) || self.totalTurns != 0) {
            output.encodeIntElement(serialDesc, 1, self.totalTurns);
        }
        if (!output.shouldEncodeElementDefault(serialDesc, 2) && self.childTurnCount == 0) {
            return;
        }
        output.encodeIntElement(serialDesc, 2, self.childTurnCount);
    }

    public SessionMemorySignals(String lastChildTurn, int i, int i2) {
        Intrinsics.checkNotNullParameter(lastChildTurn, "lastChildTurn");
        this.lastChildTurn = lastChildTurn;
        this.totalTurns = i;
        this.childTurnCount = i2;
    }

    public /* synthetic */ SessionMemorySignals(String str, int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this((i3 & 1) != 0 ? "" : str, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2);
    }

    public final String getLastChildTurn() {
        return this.lastChildTurn;
    }

    public final int getTotalTurns() {
        return this.totalTurns;
    }

    public final int getChildTurnCount() {
        return this.childTurnCount;
    }
}
