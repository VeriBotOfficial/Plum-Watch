package com.sifli.siflicore.serialtransport;

import com.sifli.siflicore.log.SFLog;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.Arrays;

/* loaded from: classes14.dex */
public class SFSocketPacketResolver {
    private static final int MAX_BUFFER_SIZE = 1048576;
    private static final String TAG = "SFSocketPacketResolver";
    private byte[] buffer = new byte[0];
    private ISFSocketPacketResolverCallback callback;

    public void setCallback(ISFSocketPacketResolverCallback iSFSocketPacketResolverCallback) {
        this.callback = iSFSocketPacketResolverCallback;
    }

    public synchronized void putData(byte[] bArr) {
        byte[] bArr2 = this.buffer;
        byte[] bArr3 = new byte[bArr2.length + bArr.length];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, 0, bArr3, this.buffer.length, bArr.length);
        this.buffer = bArr3;
        processBuffer();
    }

    private void processBuffer() {
        int i;
        ISFSocketPacketResolverCallback iSFSocketPacketResolverCallback;
        while (true) {
            byte[] bArr = this.buffer;
            if (bArr.length < 16) {
                return;
            }
            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            if (order.getInt() != 1397048134) {
                int findMagicPosition = findMagicPosition();
                if (findMagicPosition < 0) {
                    this.buffer = new byte[0];
                    return;
                } else {
                    byte[] bArr2 = this.buffer;
                    this.buffer = Arrays.copyOfRange(bArr2, findMagicPosition, bArr2.length);
                }
            } else {
                i = order.getInt();
                if (i < 0 || i > 1048576) {
                    break;
                }
                int i2 = i + 16;
                byte[] bArr3 = this.buffer;
                if (bArr3.length < i2) {
                    return;
                }
                try {
                    byte[] unpack = SFSocketPacket.unpack(Arrays.copyOfRange(bArr3, 0, i2));
                    if (unpack != null && (iSFSocketPacketResolverCallback = this.callback) != null) {
                        iSFSocketPacketResolverCallback.onSocketPacketReceived(unpack);
                    }
                    byte[] bArr4 = this.buffer;
                    this.buffer = Arrays.copyOfRange(bArr4, i2, bArr4.length);
                } catch (Exception e) {
                    SFLog.e(TAG, "Packet processing error: " + e.getMessage());
                    this.buffer = new byte[0];
                }
            }
        }
        this.buffer = new byte[0];
        SFLog.e(TAG, "Invalid packet length: " + i);
    }

    private int findMagicPosition() {
        int i = 1;
        while (true) {
            byte[] bArr = this.buffer;
            if (i > bArr.length - 4) {
                return -1;
            }
            if (ByteBuffer.wrap(bArr, i, 4).order(ByteOrder.LITTLE_ENDIAN).getInt() == 1397048134) {
                return i;
            }
            i++;
        }
    }
}
