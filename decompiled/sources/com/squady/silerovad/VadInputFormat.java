package com.squady.silerovad;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: VadSession.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0003\u0004B\u0007\b\u0004¢\u0006\u0002\u0010\u0002\u0082\u0001\u0002\u0005\u0006¨\u0006\u0007"}, d2 = {"Lcom/squady/silerovad/VadInputFormat;", "", "()V", "Pcm16Mono16k", "RawOpus", "Lcom/squady/silerovad/VadInputFormat$Pcm16Mono16k;", "Lcom/squady/silerovad/VadInputFormat$RawOpus;", "silero-vad_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public abstract class VadInputFormat {
    public /* synthetic */ VadInputFormat(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private VadInputFormat() {
    }

    /* compiled from: VadSession.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/squady/silerovad/VadInputFormat$Pcm16Mono16k;", "Lcom/squady/silerovad/VadInputFormat;", "()V", "silero-vad_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Pcm16Mono16k extends VadInputFormat {
        public static final Pcm16Mono16k INSTANCE = new Pcm16Mono16k();

        private Pcm16Mono16k() {
            super(null);
        }
    }

    /* compiled from: VadSession.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\b\u0007\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÖ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0013"}, d2 = {"Lcom/squady/silerovad/VadInputFormat$RawOpus;", "Lcom/squady/silerovad/VadInputFormat;", "packetSizeBytes", "", "channelCount", "(II)V", "getChannelCount", "()I", "getPacketSizeBytes", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "toString", "", "silero-vad_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class RawOpus extends VadInputFormat {
        private final int channelCount;
        private final int packetSizeBytes;

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public RawOpus() {
            /*
                r3 = this;
                r0 = 3
                r1 = 0
                r2 = 0
                r3.<init>(r2, r2, r0, r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.squady.silerovad.VadInputFormat.RawOpus.<init>():void");
        }

        public RawOpus(int i) {
            this(i, 0, 2, null);
        }

        public static /* synthetic */ RawOpus copy$default(RawOpus rawOpus, int i, int i2, int i3, Object obj) {
            if ((i3 & 1) != 0) {
                i = rawOpus.packetSizeBytes;
            }
            if ((i3 & 2) != 0) {
                i2 = rawOpus.channelCount;
            }
            return rawOpus.copy(i, i2);
        }

        /* renamed from: component1, reason: from getter */
        public final int getPacketSizeBytes() {
            return this.packetSizeBytes;
        }

        /* renamed from: component2, reason: from getter */
        public final int getChannelCount() {
            return this.channelCount;
        }

        public final RawOpus copy(int packetSizeBytes, int channelCount) {
            return new RawOpus(packetSizeBytes, channelCount);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RawOpus)) {
                return false;
            }
            RawOpus rawOpus = (RawOpus) other;
            return this.packetSizeBytes == rawOpus.packetSizeBytes && this.channelCount == rawOpus.channelCount;
        }

        public int hashCode() {
            return (Integer.hashCode(this.packetSizeBytes) * 31) + Integer.hashCode(this.channelCount);
        }

        public String toString() {
            return "RawOpus(packetSizeBytes=" + this.packetSizeBytes + ", channelCount=" + this.channelCount + ')';
        }

        public /* synthetic */ RawOpus(int i, int i2, int i3, DefaultConstructorMarker defaultConstructorMarker) {
            this((i3 & 1) != 0 ? 80 : i, (i3 & 2) != 0 ? 1 : i2);
        }

        public final int getPacketSizeBytes() {
            return this.packetSizeBytes;
        }

        public final int getChannelCount() {
            return this.channelCount;
        }

        public RawOpus(int i, int i2) {
            super(null);
            this.packetSizeBytes = i;
            this.channelCount = i2;
            if (1 > i || i >= 65537) {
                throw new IllegalArgumentException("packetSizeBytes must be in 1..65536".toString());
            }
            if (1 > i2 || i2 >= 3) {
                throw new IllegalArgumentException("channelCount must be 1 or 2".toString());
            }
        }
    }
}
