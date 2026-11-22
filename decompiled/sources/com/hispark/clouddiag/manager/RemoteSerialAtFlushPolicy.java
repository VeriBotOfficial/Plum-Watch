package com.hispark.clouddiag.manager;

import com.hispark.clouddiag.protocol.MuxFrameProtocol;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;

/* compiled from: RemoteSerialAtFlushPolicy.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0005\n\u0002\b\u0003\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tJ\u000e\u0010\u000e\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u0006\u0010\r\u001a\u00020\tH\u0002J(\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\tH\u0002J0\u0010\u0011\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\t2\u0006\u0010\u0016\u001a\u00020\fH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/hispark/clouddiag/manager/RemoteSerialAtFlushPolicy;", "", "<init>", "()V", "CR", "", "LF", "TILDE", "OK", "", "ERROR", "isAtPortFrame", "", "data", "isTerminalResponseFrame", "decodeAtFrame", "Lcom/hispark/clouddiag/protocol/MuxFrameProtocol$Frame;", "endsWithStatusLine", "offset", "", "length", "status", "hasTilde", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class RemoteSerialAtFlushPolicy {
    private static final byte CR = 13;
    private static final byte[] ERROR;
    public static final RemoteSerialAtFlushPolicy INSTANCE = new RemoteSerialAtFlushPolicy();
    private static final byte LF = 10;
    private static final byte[] OK;
    private static final byte TILDE = 126;

    private RemoteSerialAtFlushPolicy() {
    }

    static {
        byte[] bytes = "OK".getBytes(Charsets.US_ASCII);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        OK = bytes;
        byte[] bytes2 = "ERROR".getBytes(Charsets.US_ASCII);
        Intrinsics.checkNotNullExpressionValue(bytes2, "getBytes(...)");
        ERROR = bytes2;
    }

    public final boolean isAtPortFrame(byte[] data) {
        Intrinsics.checkNotNullParameter(data, "data");
        return decodeAtFrame(data) != null;
    }

    public final boolean isTerminalResponseFrame(byte[] data) {
        byte[] payload;
        Intrinsics.checkNotNullParameter(data, "data");
        MuxFrameProtocol.Frame decodeAtFrame = decodeAtFrame(data);
        if (decodeAtFrame == null || (payload = decodeAtFrame.getPayload()) == null) {
            return false;
        }
        return endsWithStatusLine(payload, 0, payload.length, OK) || endsWithStatusLine(payload, 0, payload.length, ERROR);
    }

    private final MuxFrameProtocol.Frame decodeAtFrame(byte[] data) {
        MuxFrameProtocol.Frame decodeOrNull = MuxFrameProtocol.INSTANCE.decodeOrNull(data);
        if (decodeOrNull == null || decodeOrNull.getPortId() != MuxFrameProtocol.Port.AT.getId()) {
            return null;
        }
        return decodeOrNull;
    }

    private final boolean endsWithStatusLine(byte[] data, int offset, int length, byte[] status) {
        return endsWithStatusLine(data, offset, length, status, false) || endsWithStatusLine(data, offset, length, status, true);
    }

    private final boolean endsWithStatusLine(byte[] data, int offset, int length, byte[] status, boolean hasTilde) {
        byte b;
        int length2 = status.length + (hasTilde ? 3 : 2);
        if (length < length2) {
            return false;
        }
        int i = (length + offset) - length2;
        int length3 = status.length;
        for (int i2 = 0; i2 < length3; i2++) {
            if (data[i + i2] != status[i2]) {
                return false;
            }
        }
        int length4 = status.length + i;
        if (hasTilde) {
            if (data[length4] != 126) {
                return false;
            }
            length4++;
        }
        if (data[length4] == 13 && data[length4 + 1] == 10) {
            return i == offset || (b = data[i - 1]) == 10 || b == 13;
        }
        return false;
    }
}
