package io.livekit.android.events;

import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import livekit.LivekitModels;

/* compiled from: RoomEvent.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\f\u0010\u0000\u001a\u00020\u0001*\u0004\u0018\u00010\u0002¨\u0006\u0003"}, d2 = {"convert", "Lio/livekit/android/events/DisconnectReason;", "Llivekit/LivekitModels$DisconnectReason;", "livekit-android-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RoomEventKt {

    /* compiled from: RoomEvent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LivekitModels.DisconnectReason.values().length];
            try {
                iArr[LivekitModels.DisconnectReason.CLIENT_INITIATED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LivekitModels.DisconnectReason.DUPLICATE_IDENTITY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[LivekitModels.DisconnectReason.SERVER_SHUTDOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[LivekitModels.DisconnectReason.PARTICIPANT_REMOVED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[LivekitModels.DisconnectReason.ROOM_DELETED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[LivekitModels.DisconnectReason.STATE_MISMATCH.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[LivekitModels.DisconnectReason.JOIN_FAILURE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[LivekitModels.DisconnectReason.MIGRATION.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[LivekitModels.DisconnectReason.SIGNAL_CLOSE.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[LivekitModels.DisconnectReason.ROOM_CLOSED.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[LivekitModels.DisconnectReason.USER_UNAVAILABLE.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[LivekitModels.DisconnectReason.USER_REJECTED.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[LivekitModels.DisconnectReason.SIP_TRUNK_FAILURE.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[LivekitModels.DisconnectReason.CONNECTION_TIMEOUT.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[LivekitModels.DisconnectReason.MEDIA_FAILURE.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[LivekitModels.DisconnectReason.UNKNOWN_REASON.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                iArr[LivekitModels.DisconnectReason.UNRECOGNIZED.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final DisconnectReason convert(LivekitModels.DisconnectReason disconnectReason) {
        switch (disconnectReason == null ? -1 : WhenMappings.$EnumSwitchMapping$0[disconnectReason.ordinal()]) {
            case -1:
            case 16:
            case 17:
                return DisconnectReason.UNKNOWN_REASON;
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                return DisconnectReason.CLIENT_INITIATED;
            case 2:
                return DisconnectReason.DUPLICATE_IDENTITY;
            case 3:
                return DisconnectReason.SERVER_SHUTDOWN;
            case 4:
                return DisconnectReason.PARTICIPANT_REMOVED;
            case 5:
                return DisconnectReason.ROOM_DELETED;
            case 6:
                return DisconnectReason.STATE_MISMATCH;
            case 7:
                return DisconnectReason.JOIN_FAILURE;
            case 8:
                return DisconnectReason.MIGRATION;
            case 9:
                return DisconnectReason.SIGNAL_CLOSE;
            case 10:
                return DisconnectReason.ROOM_CLOSED;
            case 11:
                return DisconnectReason.USER_UNAVAILABLE;
            case 12:
                return DisconnectReason.USER_REJECTED;
            case 13:
                return DisconnectReason.SIP_TRUNK_FAILURE;
            case 14:
                return DisconnectReason.CONNECTION_TIMEOUT;
            case 15:
                return DisconnectReason.MEDIA_FAILURE;
        }
    }
}
