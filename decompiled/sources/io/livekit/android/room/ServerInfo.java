package io.livekit.android.room;

import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import com.vdurmont.semver4j.Semver;
import io.nats.client.support.ApiConstants;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import livekit.LivekitModels;

/* compiled from: SignalClient.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u000bB\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lio/livekit/android/room/ServerInfo;", "", "edition", "Lio/livekit/android/room/ServerInfo$Edition;", "version", "Lcom/vdurmont/semver4j/Semver;", "(Lio/livekit/android/room/ServerInfo$Edition;Lcom/vdurmont/semver4j/Semver;)V", "getEdition", "()Lio/livekit/android/room/ServerInfo$Edition;", MobileAdsBridge.versionMethodName, "()Lcom/vdurmont/semver4j/Semver;", "Edition", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ServerInfo {
    private final Edition edition;
    private final Semver version;

    public ServerInfo(Edition edition, Semver semver) {
        Intrinsics.checkNotNullParameter(edition, "edition");
        this.edition = edition;
        this.version = semver;
    }

    public final Edition getEdition() {
        return this.edition;
    }

    public final Semver getVersion() {
        return this.version;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SignalClient.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u0000 \u00062\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0006B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0007"}, d2 = {"Lio/livekit/android/room/ServerInfo$Edition;", "", "(Ljava/lang/String;I)V", "STANDARD", "CLOUD", "UNKNOWN", "Companion", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Edition {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Edition[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final Edition STANDARD = new Edition("STANDARD", 0);
        public static final Edition CLOUD = new Edition("CLOUD", 1);
        public static final Edition UNKNOWN = new Edition("UNKNOWN", 2);

        private static final /* synthetic */ Edition[] $values() {
            return new Edition[]{STANDARD, CLOUD, UNKNOWN};
        }

        public static EnumEntries<Edition> getEntries() {
            return $ENTRIES;
        }

        public static Edition valueOf(String str) {
            return (Edition) Enum.valueOf(Edition.class, str);
        }

        public static Edition[] values() {
            return (Edition[]) $VALUES.clone();
        }

        private Edition(String str, int i) {
        }

        static {
            Edition[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
            INSTANCE = new Companion(null);
        }

        /* compiled from: SignalClient.kt */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006¨\u0006\u0007"}, d2 = {"Lio/livekit/android/room/ServerInfo$Edition$Companion;", "", "()V", "fromProto", "Lio/livekit/android/room/ServerInfo$Edition;", ApiConstants.PROTO, "Llivekit/LivekitModels$ServerInfo$Edition;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Companion {

            /* compiled from: SignalClient.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public /* synthetic */ class WhenMappings {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[LivekitModels.ServerInfo.Edition.values().length];
                    try {
                        iArr[LivekitModels.ServerInfo.Edition.Standard.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[LivekitModels.ServerInfo.Edition.Cloud.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[LivekitModels.ServerInfo.Edition.UNRECOGNIZED.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            private Companion() {
            }

            public final Edition fromProto(LivekitModels.ServerInfo.Edition proto) {
                Intrinsics.checkNotNullParameter(proto, "proto");
                int i = WhenMappings.$EnumSwitchMapping$0[proto.ordinal()];
                if (i == 1) {
                    return Edition.STANDARD;
                }
                if (i == 2) {
                    return Edition.CLOUD;
                }
                if (i == 3) {
                    return Edition.UNKNOWN;
                }
                throw new NoWhenBranchMatchedException();
            }
        }
    }
}
