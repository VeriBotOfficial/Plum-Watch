package io.livekit.android.room.participant;

import io.nats.client.support.ApiConstants;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import livekit.LivekitModels;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Participant.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lio/livekit/android/room/participant/ConnectionQuality;", "", "(Ljava/lang/String;I)V", "EXCELLENT", "GOOD", "POOR", "UNKNOWN", "LOST", "Companion", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ConnectionQuality {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ ConnectionQuality[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    public static final ConnectionQuality EXCELLENT = new ConnectionQuality("EXCELLENT", 0);
    public static final ConnectionQuality GOOD = new ConnectionQuality("GOOD", 1);
    public static final ConnectionQuality POOR = new ConnectionQuality("POOR", 2);
    public static final ConnectionQuality UNKNOWN = new ConnectionQuality("UNKNOWN", 3);
    public static final ConnectionQuality LOST = new ConnectionQuality("LOST", 4);

    private static final /* synthetic */ ConnectionQuality[] $values() {
        return new ConnectionQuality[]{EXCELLENT, GOOD, POOR, UNKNOWN, LOST};
    }

    public static EnumEntries<ConnectionQuality> getEntries() {
        return $ENTRIES;
    }

    public static ConnectionQuality valueOf(String str) {
        return (ConnectionQuality) Enum.valueOf(ConnectionQuality.class, str);
    }

    public static ConnectionQuality[] values() {
        return (ConnectionQuality[]) $VALUES.clone();
    }

    private ConnectionQuality(String str, int i) {
    }

    static {
        ConnectionQuality[] $values = $values();
        $VALUES = $values;
        $ENTRIES = EnumEntriesKt.enumEntries($values);
        INSTANCE = new Companion(null);
    }

    /* compiled from: Participant.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lio/livekit/android/room/participant/ConnectionQuality$Companion;", "", "()V", "fromProto", "Lio/livekit/android/room/participant/ConnectionQuality;", ApiConstants.PROTO, "Llivekit/LivekitModels$ConnectionQuality;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* compiled from: Participant.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[LivekitModels.ConnectionQuality.values().length];
                try {
                    iArr[LivekitModels.ConnectionQuality.EXCELLENT.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[LivekitModels.ConnectionQuality.GOOD.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[LivekitModels.ConnectionQuality.POOR.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                try {
                    iArr[LivekitModels.ConnectionQuality.UNRECOGNIZED.ordinal()] = 4;
                } catch (NoSuchFieldError unused4) {
                }
                try {
                    iArr[LivekitModels.ConnectionQuality.LOST.ordinal()] = 5;
                } catch (NoSuchFieldError unused5) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }

        public final ConnectionQuality fromProto(LivekitModels.ConnectionQuality proto) {
            Intrinsics.checkNotNullParameter(proto, "proto");
            int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
            if (i == 1) {
                return ConnectionQuality.EXCELLENT;
            }
            if (i == 2) {
                return ConnectionQuality.GOOD;
            }
            if (i == 3) {
                return ConnectionQuality.POOR;
            }
            if (i == 4) {
                return ConnectionQuality.UNKNOWN;
            }
            if (i == 5) {
                return ConnectionQuality.LOST;
            }
            throw new NoWhenBranchMatchedException();
        }
    }
}
