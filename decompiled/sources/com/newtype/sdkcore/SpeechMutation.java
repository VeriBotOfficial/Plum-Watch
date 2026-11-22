package com.newtype.sdkcore;

import android.gov.nist.core.Separators;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SpeechControl.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lcom/newtype/sdkcore/SpeechMutation;", "", "state", "Lcom/newtype/sdkcore/SpeechState;", "transition", "Lcom/newtype/sdkcore/SpeechTransition;", "<init>", "(Lcom/newtype/sdkcore/SpeechState;Lcom/newtype/sdkcore/SpeechTransition;)V", "getState", "()Lcom/newtype/sdkcore/SpeechState;", "getTransition", "()Lcom/newtype/sdkcore/SpeechTransition;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "newtypesdkcore_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class SpeechMutation {
    private final SpeechState state;
    private final SpeechTransition transition;

    public static /* synthetic */ SpeechMutation copy$default(SpeechMutation speechMutation, SpeechState speechState, SpeechTransition speechTransition, int i, Object obj) {
        if ((i & 1) != 0) {
            speechState = speechMutation.state;
        }
        if ((i & 2) != 0) {
            speechTransition = speechMutation.transition;
        }
        return speechMutation.copy(speechState, speechTransition);
    }

    /* renamed from: component1, reason: from getter */
    public final SpeechState getState() {
        return this.state;
    }

    /* renamed from: component2, reason: from getter */
    public final SpeechTransition getTransition() {
        return this.transition;
    }

    public final SpeechMutation copy(SpeechState state, SpeechTransition transition) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(transition, "transition");
        return new SpeechMutation(state, transition);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SpeechMutation)) {
            return false;
        }
        SpeechMutation speechMutation = (SpeechMutation) other;
        return Intrinsics.areEqual(this.state, speechMutation.state) && this.transition == speechMutation.transition;
    }

    public int hashCode() {
        return (this.state.hashCode() * 31) + this.transition.hashCode();
    }

    public String toString() {
        return "SpeechMutation(state=" + this.state + ", transition=" + this.transition + Separators.RPAREN;
    }

    public SpeechMutation(SpeechState state, SpeechTransition transition) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(transition, "transition");
        this.state = state;
        this.transition = transition;
    }

    public final SpeechState getState() {
        return this.state;
    }

    public final SpeechTransition getTransition() {
        return this.transition;
    }
}
