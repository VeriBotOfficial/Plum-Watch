package com.hispark.clouddiag.protocol;

import android.gov.nist.javax.sdp.fields.SDPKeywords;
import android.javax.sip.header.SubscriptionStateHeader;
import com.liulishuo.filedownloader.model.ConnectionModel;
import com.phancy.mini.core.app.storage.MiniSetting;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridge;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: MuxFrameProtocol.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u0001:\u0003*+,B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J4\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u0005J4\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u000f2\b\b\u0002\u0010\u0013\u001a\u00020\u00052\b\b\u0002\u0010\u0014\u001a\u00020\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u0005J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\u00182\u0006\u0010\u0019\u001a\u00020\u000fJ\u0014\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u001b2\u0006\u0010\u0019\u001a\u00020\u000fJ\u000e\u0010\u001c\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u000fJ\u000e\u0010\u001e\u001a\u00020\u00052\u0006\u0010\u001f\u001a\u00020\u0018J\u000e\u0010 \u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u000fJ\u000e\u0010!\u001a\u00020\u001d2\u0006\u0010\u0019\u001a\u00020\u000fJ\u001f\u0010\"\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u0005H\u0002¢\u0006\u0002\u0010$J \u0010%\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u00052\u0006\u0010\"\u001a\u00020\u0005H\u0002J\u0018\u0010\u0015\u001a\u00020\u00052\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010#\u001a\u00020\u0005H\u0002J\u0010\u0010&\u001a\u00020\u00052\u0006\u0010\u0016\u001a\u00020\u0005H\u0002J\r\u0010'\u001a\u00020(H\u0000¢\u0006\u0002\b)R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lcom/hispark/clouddiag/protocol/MuxFrameProtocol;", "", "<init>", "()V", "HEADER_SIZE", "", "MAGIC", "VERSION", "MAX_PAYLOAD_LENGTH", "MAX_VPORT_INDEX", "CRC_FLAG", "indexLock", "nextIndexes", "", "encode", "", "port", "Lcom/hispark/clouddiag/protocol/MuxFrameProtocol$Port;", "payload", "flags", "version", "vportIndex", "portId", "decodeOrNull", "Lcom/hispark/clouddiag/protocol/MuxFrameProtocol$Frame;", "data", "decodeAll", "", "isCompleteFrameSequence", "", "encodedSize", "frame", "isLikelyFrameStart", "hasValidFramePrefix", "payloadLength", "offset", "([BI)Ljava/lang/Integer;", "decodeAt", "nextVportIndex", "resetIndexesForTest", "", "resetIndexesForTest$cloud_sdk_release", "Port", "Frame", "StreamDecoder", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class MuxFrameProtocol {
    private static final int CRC_FLAG = 4;
    public static final int HEADER_SIZE = 6;
    public static final int MAGIC = 5;
    public static final int MAX_PAYLOAD_LENGTH = 65535;
    public static final int MAX_VPORT_INDEX = 65535;
    public static final int VERSION = 1;
    public static final MuxFrameProtocol INSTANCE = new MuxFrameProtocol();
    private static final Object indexLock = new Object();
    private static final int[] nextIndexes = new int[64];

    private MuxFrameProtocol() {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MuxFrameProtocol.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"Lcom/hispark/clouddiag/protocol/MuxFrameProtocol$Port;", "", "id", "", "<init>", "(Ljava/lang/String;II)V", "getId", "()I", "HSO_LOG", "AT", "WEARABLE_LOG", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Port {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Port[] $VALUES;
        private final int id;
        public static final Port HSO_LOG = new Port("HSO_LOG", 0, 1);
        public static final Port AT = new Port("AT", 1, 2);
        public static final Port WEARABLE_LOG = new Port("WEARABLE_LOG", 2, 3);

        private static final /* synthetic */ Port[] $values() {
            return new Port[]{HSO_LOG, AT, WEARABLE_LOG};
        }

        public static EnumEntries<Port> getEntries() {
            return $ENTRIES;
        }

        private Port(String str, int i, int i2) {
            this.id = i2;
        }

        public final int getId() {
            return this.id;
        }

        static {
            Port[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        public static Port valueOf(String str) {
            return (Port) Enum.valueOf(Port.class, str);
        }

        public static Port[] values() {
            return (Port[]) $VALUES.clone();
        }
    }

    /* compiled from: MuxFrameProtocol.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\t\n\u0002\u0010\u000e\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\b\b\u0002\u0010\b\u001a\u00020\u0003¢\u0006\u0004\b\t\u0010\nJ\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u0096\u0002J\b\u0010\u0015\u001a\u00020\u0003H\u0016J\t\u0010\u0016\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J;\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0003HÆ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\f¨\u0006\u001e"}, d2 = {"Lcom/hispark/clouddiag/protocol/MuxFrameProtocol$Frame;", "", "portId", "", "vportIndex", "payload", "", "flags", "version", "<init>", "(II[BII)V", "getPortId", "()I", "getVportIndex", "getPayload", "()[B", "getFlags", MobileAdsBridge.versionMethodName, "equals", "", "other", "hashCode", "component1", "component2", "component3", "component4", "component5", "copy", "toString", "", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Frame {
        private final int flags;
        private final byte[] payload;
        private final int portId;
        private final int version;
        private final int vportIndex;

        public static /* synthetic */ Frame copy$default(Frame frame, int i, int i2, byte[] bArr, int i3, int i4, int i5, Object obj) {
            if ((i5 & 1) != 0) {
                i = frame.portId;
            }
            if ((i5 & 2) != 0) {
                i2 = frame.vportIndex;
            }
            if ((i5 & 4) != 0) {
                bArr = frame.payload;
            }
            if ((i5 & 8) != 0) {
                i3 = frame.flags;
            }
            if ((i5 & 16) != 0) {
                i4 = frame.version;
            }
            int i6 = i4;
            byte[] bArr2 = bArr;
            return frame.copy(i, i2, bArr2, i3, i6);
        }

        /* renamed from: component1, reason: from getter */
        public final int getPortId() {
            return this.portId;
        }

        /* renamed from: component2, reason: from getter */
        public final int getVportIndex() {
            return this.vportIndex;
        }

        /* renamed from: component3, reason: from getter */
        public final byte[] getPayload() {
            return this.payload;
        }

        /* renamed from: component4, reason: from getter */
        public final int getFlags() {
            return this.flags;
        }

        /* renamed from: component5, reason: from getter */
        public final int getVersion() {
            return this.version;
        }

        public final Frame copy(int portId, int vportIndex, byte[] payload, int flags, int version) {
            Intrinsics.checkNotNullParameter(payload, "payload");
            return new Frame(portId, vportIndex, payload, flags, version);
        }

        public String toString() {
            return "Frame(portId=" + this.portId + ", vportIndex=" + this.vportIndex + ", payload=" + Arrays.toString(this.payload) + ", flags=" + this.flags + ", version=" + this.version + ')';
        }

        public Frame(int i, int i2, byte[] payload, int i3, int i4) {
            Intrinsics.checkNotNullParameter(payload, "payload");
            this.portId = i;
            this.vportIndex = i2;
            this.payload = payload;
            this.flags = i3;
            this.version = i4;
        }

        public /* synthetic */ Frame(int i, int i2, byte[] bArr, int i3, int i4, int i5, DefaultConstructorMarker defaultConstructorMarker) {
            this(i, i2, bArr, i3, (i5 & 16) != 0 ? 1 : i4);
        }

        public final int getPortId() {
            return this.portId;
        }

        public final int getVportIndex() {
            return this.vportIndex;
        }

        public final byte[] getPayload() {
            return this.payload;
        }

        public final int getFlags() {
            return this.flags;
        }

        public final int getVersion() {
            return this.version;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Frame)) {
                return false;
            }
            Frame frame = (Frame) other;
            return this.portId == frame.portId && this.vportIndex == frame.vportIndex && this.flags == frame.flags && this.version == frame.version && Arrays.equals(this.payload, frame.payload);
        }

        public int hashCode() {
            return (((((((this.portId * 31) + this.vportIndex) * 31) + Arrays.hashCode(this.payload)) * 31) + this.flags) * 31) + this.version;
        }
    }

    /* compiled from: MuxFrameProtocol.kt */
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000f\u001a\u00020\tJ\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0012\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\tH\u0002J\u001f\u0010\u0013\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u0003H\u0002¢\u0006\u0002\u0010\u0015J'\u0010\u0016\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0017\u001a\u00020\u0003H\u0002¢\u0006\u0002\u0010\u0018J \u0010\u0019\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\t2\u0006\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u0003H\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u001c"}, d2 = {"Lcom/hispark/clouddiag/protocol/MuxFrameProtocol$StreamDecoder;", "", "maxBufferedBytes", "", "resyncToSequentialIndex", "", "<init>", "(IZ)V", SubscriptionStateHeader.PENDING, "", "lastVportIndex", "Ljava/lang/Integer;", MiniSetting.ACCEPT, "", "Lcom/hispark/clouddiag/protocol/MuxFrameProtocol$Frame;", "data", SDPKeywords.CLEAR, "", "keepFromNextMagic", "findSequentialResyncOffset", ConnectionModel.CURRENT_OFFSET, "([BI)Ljava/lang/Integer;", "findDuplicateFrameResyncOffset", "currentFrameEnd", "([BII)Ljava/lang/Integer;", "headersMatch", "firstOffset", "secondOffset", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class StreamDecoder {
        private Integer lastVportIndex;
        private final int maxBufferedBytes;
        private byte[] pending;
        private final boolean resyncToSequentialIndex;

        /* JADX WARN: Multi-variable type inference failed */
        public StreamDecoder() {
            this(0, 0 == true ? 1 : 0, 3, null);
        }

        public StreamDecoder(int i, boolean z) {
            this.maxBufferedBytes = i;
            this.resyncToSequentialIndex = z;
            this.pending = new byte[0];
        }

        public /* synthetic */ StreamDecoder(int i, boolean z, int i2, DefaultConstructorMarker defaultConstructorMarker) {
            this((i2 & 1) != 0 ? 65541 : i, (i2 & 2) != 0 ? false : z);
        }

        public final List<Frame> accept(byte[] data) {
            Intrinsics.checkNotNullParameter(data, "data");
            if (data.length == 0) {
                return CollectionsKt.emptyList();
            }
            this.pending = ArraysKt.plus(this.pending, data);
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (true) {
                int i2 = i + 6;
                if (i2 > this.pending.length) {
                    break;
                }
                Integer payloadLength = MuxFrameProtocol.INSTANCE.payloadLength(this.pending, i);
                if (payloadLength == null) {
                    i++;
                } else {
                    int intValue = i2 + payloadLength.intValue();
                    Integer findDuplicateFrameResyncOffset = findDuplicateFrameResyncOffset(this.pending, i, intValue);
                    if (findDuplicateFrameResyncOffset != null) {
                        i = findDuplicateFrameResyncOffset.intValue();
                    } else {
                        byte[] bArr = this.pending;
                        if (intValue <= bArr.length) {
                            Frame decodeAt = MuxFrameProtocol.INSTANCE.decodeAt(this.pending, i, payloadLength.intValue());
                            arrayList.add(decodeAt);
                            this.lastVportIndex = Integer.valueOf(decodeAt.getVportIndex());
                            i = intValue;
                        } else {
                            Integer findSequentialResyncOffset = findSequentialResyncOffset(bArr, i);
                            if (findSequentialResyncOffset == null) {
                                break;
                            }
                            i = findSequentialResyncOffset.intValue();
                        }
                    }
                }
            }
            byte[] bArr2 = this.pending;
            if (i >= bArr2.length) {
                bArr2 = new byte[0];
            } else if (i > 0) {
                bArr2 = ArraysKt.copyOfRange(bArr2, i, bArr2.length);
            } else if (bArr2.length > this.maxBufferedBytes) {
                bArr2 = keepFromNextMagic(bArr2);
            }
            this.pending = bArr2;
            return arrayList;
        }

        public final void clear() {
            this.pending = new byte[0];
            this.lastVportIndex = null;
        }

        private final byte[] keepFromNextMagic(byte[] data) {
            int length = data.length;
            for (int i = 1; i < length; i++) {
                if ((((data[i] & 255) >> 4) & 15) == 5) {
                    return ArraysKt.copyOfRange(data, i, data.length);
                }
            }
            return new byte[0];
        }

        private final Integer findSequentialResyncOffset(byte[] data, int currentOffset) {
            Integer num;
            if (this.resyncToSequentialIndex && (num = this.lastVportIndex) != null) {
                int intValue = (num.intValue() + 1) & 65535;
                while (true) {
                    currentOffset++;
                    int i = currentOffset + 6;
                    if (i > data.length) {
                        break;
                    }
                    Integer payloadLength = MuxFrameProtocol.INSTANCE.payloadLength(data, currentOffset);
                    if (payloadLength != null && i + payloadLength.intValue() <= data.length && MuxFrameProtocol.INSTANCE.vportIndex(data, currentOffset) == intValue) {
                        return Integer.valueOf(currentOffset);
                    }
                }
            }
            return null;
        }

        private final Integer findDuplicateFrameResyncOffset(byte[] data, int currentOffset, int currentFrameEnd) {
            if (!this.resyncToSequentialIndex) {
                return null;
            }
            int min = Math.min(currentFrameEnd, data.length);
            for (int i = currentOffset + 1; i + 6 <= min; i++) {
                if (MuxFrameProtocol.INSTANCE.payloadLength(data, i) != null && headersMatch(data, currentOffset, i)) {
                    return Integer.valueOf(i);
                }
            }
            return null;
        }

        private final boolean headersMatch(byte[] data, int firstOffset, int secondOffset) {
            for (int i = 0; i < 6; i++) {
                if (data[firstOffset + i] != data[secondOffset + i]) {
                    return false;
                }
            }
            return true;
        }
    }

    public static /* synthetic */ byte[] encode$default(MuxFrameProtocol muxFrameProtocol, Port port, byte[] bArr, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i = 0;
        }
        int i5 = i;
        if ((i4 & 8) != 0) {
            i2 = 1;
        }
        int i6 = i2;
        if ((i4 & 16) != 0) {
            i3 = muxFrameProtocol.nextVportIndex(port.getId());
        }
        return muxFrameProtocol.encode(port, bArr, i5, i6, i3);
    }

    public final byte[] encode(Port port, byte[] payload, int flags, int version, int vportIndex) {
        Intrinsics.checkNotNullParameter(port, "port");
        Intrinsics.checkNotNullParameter(payload, "payload");
        return encode(port.getId(), payload, flags, version, vportIndex);
    }

    public static /* synthetic */ byte[] encode$default(MuxFrameProtocol muxFrameProtocol, int i, byte[] bArr, int i2, int i3, int i4, int i5, Object obj) {
        if ((i5 & 4) != 0) {
            i2 = 0;
        }
        int i6 = i2;
        if ((i5 & 8) != 0) {
            i3 = 1;
        }
        int i7 = i3;
        if ((i5 & 16) != 0) {
            i4 = muxFrameProtocol.nextVportIndex(i);
        }
        return muxFrameProtocol.encode(i, bArr, i6, i7, i4);
    }

    public final byte[] encode(int portId, byte[] payload, int flags, int version, int vportIndex) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (portId < 0 || portId >= 64) {
            throw new IllegalArgumentException("portId must fit in 6 bits".toString());
        }
        if (flags < 0 || flags >= 8) {
            throw new IllegalArgumentException("flags must fit in 3 bits".toString());
        }
        if ((flags & 4) != 0) {
            throw new IllegalArgumentException("crc flag is not supported".toString());
        }
        if (version < 0 || version >= 8) {
            throw new IllegalArgumentException("version must fit in 3 bits".toString());
        }
        if (vportIndex < 0 || vportIndex >= 65536) {
            throw new IllegalArgumentException("vportIndex must fit in 16 bits".toString());
        }
        if (payload.length > 65535) {
            throw new IllegalArgumentException("payload length must fit in 16 bits".toString());
        }
        byte[] bArr = new byte[payload.length + 6];
        bArr[0] = (byte) (((version & 7) << 1) | 80 | ((flags >> 2) & 1));
        bArr[1] = (byte) ((portId & 63) | ((flags & 3) << 6));
        bArr[2] = (byte) ((vportIndex >> 8) & 255);
        bArr[3] = (byte) (vportIndex & 255);
        bArr[4] = (byte) ((payload.length >> 8) & 255);
        bArr[5] = (byte) (payload.length & 255);
        ArraysKt.copyInto$default(payload, bArr, 6, 0, 0, 12, (Object) null);
        return bArr;
    }

    public final Frame decodeOrNull(byte[] data) {
        Integer payloadLength;
        Intrinsics.checkNotNullParameter(data, "data");
        if (data.length < 6 || (payloadLength = payloadLength(data, 0)) == null) {
            return null;
        }
        int intValue = payloadLength.intValue();
        if (data.length != intValue + 6) {
            return null;
        }
        return decodeAt(data, 0, intValue);
    }

    public final List<Frame> decodeAll(byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            int i2 = i + 6;
            if (i2 > data.length) {
                break;
            }
            Integer payloadLength = payloadLength(data, i);
            if (payloadLength == null) {
                i++;
            } else {
                int intValue = i2 + payloadLength.intValue();
                if (intValue > data.length) {
                    break;
                }
                arrayList.add(decodeAt(data, i, payloadLength.intValue()));
                i = intValue;
            }
        }
        return arrayList;
    }

    public final boolean isCompleteFrameSequence(byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (data.length == 0) {
            return false;
        }
        List<Frame> decodeAll = decodeAll(data);
        if (!decodeAll.isEmpty()) {
            Iterator<T> it = decodeAll.iterator();
            int i = 0;
            while (it.hasNext()) {
                i += encodedSize((Frame) it.next());
            }
            if (i == data.length) {
                return true;
            }
        }
        return false;
    }

    public final int encodedSize(Frame frame) {
        Intrinsics.checkNotNullParameter(frame, "frame");
        return frame.getPayload().length + 6;
    }

    public final boolean isLikelyFrameStart(byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return data.length != 0 && (((data[0] & 255) >> 4) & 15) == 5;
    }

    public final boolean hasValidFramePrefix(byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        if (data.length < 6) {
            return isLikelyFrameStart(data);
        }
        return payloadLength(data, 0) != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Integer payloadLength(byte[] data, int offset) {
        byte b = data[offset];
        int i = b & 255;
        byte b2 = data[offset + 1];
        int i2 = b2 & 255;
        if (((i >> 4) & 15) != 5 || ((i >> 1) & 7) != 1 || ((((b & 1) << 2) | ((i2 >> 6) & 3)) & 4) != 0 || (b2 & 63) == 0) {
            return null;
        }
        return Integer.valueOf((data[offset + 5] & 255) | ((data[offset + 4] & 255) << 8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Frame decodeAt(byte[] data, int offset, int payloadLength) {
        byte b = data[offset];
        byte b2 = data[offset + 1];
        int i = ((b & 255) >> 1) & 7;
        int i2 = ((b & 1) << 2) | (((b2 & 255) >> 6) & 3);
        int i3 = offset + 6;
        return new Frame(b2 & 63, vportIndex(data, offset), ArraysKt.copyOfRange(data, i3, payloadLength + i3), i2, i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int vportIndex(byte[] data, int offset) {
        return (data[offset + 3] & 255) | ((data[offset + 2] & 255) << 8);
    }

    private final int nextVportIndex(int portId) {
        int i;
        if (portId < 0 || portId >= 64) {
            throw new IllegalArgumentException("portId must fit in 6 bits".toString());
        }
        synchronized (indexLock) {
            int[] iArr = nextIndexes;
            i = iArr[portId];
            iArr[portId] = (i + 1) & 65535;
        }
        return i;
    }

    public final void resetIndexesForTest$cloud_sdk_release() {
        synchronized (indexLock) {
            ArraysKt.fill$default(nextIndexes, 0, 0, 0, 6, (Object) null);
            Unit unit = Unit.INSTANCE;
        }
    }
}
