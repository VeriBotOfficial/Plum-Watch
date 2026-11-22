package com.newtype.sdkcore;

import android.gov.nist.core.Separators;
import kotlin.Metadata;

/* compiled from: SpeechControl.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0016"}, d2 = {"Lcom/newtype/sdkcore/SpeechState;", "", "microphoneEnabled", "", "pttHeld", "vadSpeaking", "<init>", "(ZZZ)V", "getMicrophoneEnabled", "()Z", "getPttHeld", "getVadSpeaking", "component1", "component2", "component3", "copy", "equals", "other", "hashCode", "", "toString", "", "newtypesdkcore_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class SpeechState {
    private final boolean microphoneEnabled;
    private final boolean pttHeld;
    private final boolean vadSpeaking;

    public static /* synthetic */ SpeechState copy$default(SpeechState speechState, boolean z, boolean z2, boolean z3, int i, Object obj) {
        if ((i & 1) != 0) {
            z = speechState.microphoneEnabled;
        }
        if ((i & 2) != 0) {
            z2 = speechState.pttHeld;
        }
        if ((i & 4) != 0) {
            z3 = speechState.vadSpeaking;
        }
        return speechState.copy(z, z2, z3);
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getMicrophoneEnabled() {
        return this.microphoneEnabled;
    }

    /* renamed from: component2, reason: from getter */
    public final boolean getPttHeld() {
        return this.pttHeld;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getVadSpeaking() {
        return this.vadSpeaking;
    }

    public final SpeechState copy(boolean microphoneEnabled, boolean pttHeld, boolean vadSpeaking) {
        return new SpeechState(microphoneEnabled, pttHeld, vadSpeaking);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpeechState)) {
            return false;
        }
        SpeechState speechState = (SpeechState) other;
        return this.microphoneEnabled == speechState.microphoneEnabled && this.pttHeld == speechState.pttHeld && this.vadSpeaking == speechState.vadSpeaking;
    }

    public int hashCode() {
        return (((Boolean.hashCode(this.microphoneEnabled) * 31) + Boolean.hashCode(this.pttHeld)) * 31) + Boolean.hashCode(this.vadSpeaking);
    }

    public String toString() {
        return "SpeechState(microphoneEnabled=" + this.microphoneEnabled + ", pttHeld=" + this.pttHeld + ", vadSpeaking=" + this.vadSpeaking + Separators.RPAREN;
    }

    public SpeechState(boolean z, boolean z2, boolean z3) {
        this.microphoneEnabled = z;
        this.pttHeld = z2;
        this.vadSpeaking = z3;
    }

    public final boolean getMicrophoneEnabled() {
        return this.microphoneEnabled;
    }

    public final boolean getPttHeld() {
        return this.pttHeld;
    }

    public final boolean getVadSpeaking() {
        return this.vadSpeaking;
    }
}
