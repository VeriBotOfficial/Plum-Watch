package com.hispark.crashdump;

import android.util.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: BoardFileTransferSizing.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\n\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\fX\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/hispark/crashdump/BoardFileTransferSizing;", "", "<init>", "()V", "ATT_PROTOCOL_OVERHEAD_BYTES", "", "BOARD_FILE_REPLY_OVERHEAD_BYTES", "MUX_OVERHEAD_BYTES", "SAFETY_BUFFER_BYTES", "PROTOCOL_OVERHEAD_BYTES", "TOTAL_BLE_OVERHEAD_BYTES", "TAG", "", "resolve", "transport", "Lcom/hispark/crashdump/BoardByteTransport;", "deviceId", "linkType", "Lcom/hispark/crashdump/BoardLinkType;", "configuredUpperBound", "", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BoardFileTransferSizing {
    private static final int ATT_PROTOCOL_OVERHEAD_BYTES = 3;
    private static final int BOARD_FILE_REPLY_OVERHEAD_BYTES = 25;
    public static final BoardFileTransferSizing INSTANCE = new BoardFileTransferSizing();
    private static final int MUX_OVERHEAD_BYTES = 6;
    private static final int PROTOCOL_OVERHEAD_BYTES = 34;
    private static final int SAFETY_BUFFER_BYTES = 8;
    private static final String TAG = "BoardFileTransferSizing";
    private static final int TOTAL_BLE_OVERHEAD_BYTES = 42;

    private BoardFileTransferSizing() {
    }

    public final int resolve(BoardByteTransport transport, String deviceId, BoardLinkType linkType, short configuredUpperBound) {
        Intrinsics.checkNotNullParameter(transport, "transport");
        Intrinsics.checkNotNullParameter(deviceId, "deviceId");
        Intrinsics.checkNotNullParameter(linkType, "linkType");
        if (configuredUpperBound <= 0) {
            throw new IllegalArgumentException(("文件传输 blockSize 配置必须大于 0：" + ((int) configuredUpperBound)).toString());
        }
        if (linkType == BoardLinkType.BLE) {
            NegotiatedMtuAwareBoardByteTransport negotiatedMtuAwareBoardByteTransport = transport instanceof NegotiatedMtuAwareBoardByteTransport ? (NegotiatedMtuAwareBoardByteTransport) transport : null;
            if (negotiatedMtuAwareBoardByteTransport != null) {
                try {
                    if (negotiatedMtuAwareBoardByteTransport.supportsNegotiatedMtu(deviceId)) {
                        try {
                            Integer negotiatedMtu = negotiatedMtuAwareBoardByteTransport.negotiatedMtu(deviceId);
                            if (negotiatedMtu != null) {
                                int intValue = negotiatedMtu.intValue();
                                int i = intValue - 42;
                                if (i <= 0) {
                                    throw new IllegalStateException("BLE 文件传输无法开始：协商 MTU=" + intValue + " 过小，protocolOverhead=34, safetyBuffer=8，扣除后无可用数据空间");
                                }
                                int min = Math.min((int) configuredUpperBound, i);
                                Log.i(TAG, "Resolved BLE file block size: device=" + deviceId + ", negotiatedMtu=" + intValue + ", configuredUpperBound=" + ((int) configuredUpperBound) + ", protocolOverhead=34, safetyBuffer=8, resolvedBlockSize=" + min);
                                return min;
                            }
                            throw new IllegalStateException("BLE 文件传输无法开始：MTU 未成功协商，protocolOverhead=34, safetyBuffer=8");
                        } catch (Exception e) {
                            throw new IllegalStateException("BLE 文件传输无法开始：读取已协商 MTU 失败", e);
                        }
                    }
                } catch (Exception e2) {
                    throw new IllegalStateException("BLE 文件传输无法开始：读取 MTU 能力失败", e2);
                }
            }
        }
        return configuredUpperBound;
    }
}
