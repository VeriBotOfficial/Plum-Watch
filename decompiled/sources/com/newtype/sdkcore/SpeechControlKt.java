package com.newtype.sdkcore;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: SpeechControl.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a\b\u0010\u0000\u001a\u00020\u0001H\u0000\u001a\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¨\u0006\u0007"}, d2 = {"initialSpeechState", "Lcom/newtype/sdkcore/SpeechState;", "applySpeechEvent", "Lcom/newtype/sdkcore/SpeechMutation;", "state", "event", "Lcom/newtype/sdkcore/SpeechEvent;", "newtypesdkcore_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class SpeechControlKt {

    /* compiled from: SpeechControl.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[SpeechEvent.values().length];
            try {
                iArr[SpeechEvent.PTT_DOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SpeechEvent.PTT_UP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SpeechEvent.VAD_START.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[SpeechEvent.VAD_END.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final SpeechState initialSpeechState() {
        return new SpeechState(false, false, false);
    }

    public static final SpeechMutation applySpeechEvent(SpeechState state, SpeechEvent event) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(event, "event");
        int i = WhenMappings.$EnumSwitchMapping$0[event.ordinal()];
        if (i == 1) {
            SpeechState copy$default = SpeechState.copy$default(state, false, true, false, 5, null);
            if (state.getMicrophoneEnabled()) {
                return new SpeechMutation(copy$default, SpeechTransition.NONE);
            }
            return new SpeechMutation(SpeechState.copy$default(copy$default, true, false, false, 6, null), SpeechTransition.OPEN);
        }
        if (i == 2) {
            SpeechState copy$default2 = SpeechState.copy$default(state, false, false, false, 5, null);
            if (!state.getMicrophoneEnabled() || state.getVadSpeaking()) {
                return new SpeechMutation(copy$default2, SpeechTransition.NONE);
            }
            return new SpeechMutation(SpeechState.copy$default(copy$default2, false, false, false, 6, null), SpeechTransition.CLOSE);
        }
        if (i == 3) {
            SpeechState copy$default3 = SpeechState.copy$default(state, false, false, true, 3, null);
            if (state.getMicrophoneEnabled()) {
                return new SpeechMutation(copy$default3, SpeechTransition.NONE);
            }
            return new SpeechMutation(SpeechState.copy$default(copy$default3, true, false, false, 6, null), SpeechTransition.OPEN);
        }
        if (i != 4) {
            throw new NoWhenBranchMatchedException();
        }
        SpeechState copy$default4 = SpeechState.copy$default(state, false, false, false, 3, null);
        if (!state.getMicrophoneEnabled() || state.getPttHeld()) {
            return new SpeechMutation(copy$default4, SpeechTransition.NONE);
        }
        return new SpeechMutation(SpeechState.copy$default(copy$default4, false, false, false, 6, null), SpeechTransition.CLOSE);
    }
}
