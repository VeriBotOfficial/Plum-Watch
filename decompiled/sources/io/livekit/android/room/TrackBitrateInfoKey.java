package io.livekit.android.room;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import livekit.org.webrtc.RtpTransceiver;

/* compiled from: PeerConnectionTransport.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lio/livekit/android/room/TrackBitrateInfoKey;", "", "()V", "Cid", "Transceiver", "Lio/livekit/android/room/TrackBitrateInfoKey$Cid;", "Lio/livekit/android/room/TrackBitrateInfoKey$Transceiver;", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public abstract class TrackBitrateInfoKey {
    public /* synthetic */ TrackBitrateInfoKey(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* compiled from: PeerConnectionTransport.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0010"}, d2 = {"Lio/livekit/android/room/TrackBitrateInfoKey$Cid;", "Lio/livekit/android/room/TrackBitrateInfoKey;", "value", "", "(Ljava/lang/String;)V", "getValue", "()Ljava/lang/String;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Cid extends TrackBitrateInfoKey {
        private final String value;

        public static /* synthetic */ Cid copy$default(Cid cid, String str, int i, Object obj) {
            if ((i & 1) != 0) {
                str = cid.value;
            }
            return cid.copy(str);
        }

        /* renamed from: component1, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        public final Cid copy(String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new Cid(value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Cid) && Intrinsics.areEqual(this.value, ((Cid) other).value);
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "Cid(value=" + this.value + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Cid(String value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }

        public final String getValue() {
            return this.value;
        }
    }

    private TrackBitrateInfoKey() {
    }

    /* compiled from: PeerConnectionTransport.kt */
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fHÖ\u0003J\t\u0010\r\u001a\u00020\u000eHÖ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lio/livekit/android/room/TrackBitrateInfoKey$Transceiver;", "Lio/livekit/android/room/TrackBitrateInfoKey;", "value", "Llivekit/org/webrtc/RtpTransceiver;", "(Llivekit/org/webrtc/RtpTransceiver;)V", "getValue", "()Llivekit/org/webrtc/RtpTransceiver;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Transceiver extends TrackBitrateInfoKey {
        private final RtpTransceiver value;

        public static /* synthetic */ Transceiver copy$default(Transceiver transceiver, RtpTransceiver rtpTransceiver, int i, Object obj) {
            if ((i & 1) != 0) {
                rtpTransceiver = transceiver.value;
            }
            return transceiver.copy(rtpTransceiver);
        }

        /* renamed from: component1, reason: from getter */
        public final RtpTransceiver getValue() {
            return this.value;
        }

        public final Transceiver copy(RtpTransceiver value) {
            Intrinsics.checkNotNullParameter(value, "value");
            return new Transceiver(value);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Transceiver) && Intrinsics.areEqual(this.value, ((Transceiver) other).value);
        }

        public int hashCode() {
            return this.value.hashCode();
        }

        public String toString() {
            return "Transceiver(value=" + this.value + ')';
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Transceiver(RtpTransceiver value) {
            super(null);
            Intrinsics.checkNotNullParameter(value, "value");
            this.value = value;
        }

        public final RtpTransceiver getValue() {
            return this.value;
        }
    }
}
