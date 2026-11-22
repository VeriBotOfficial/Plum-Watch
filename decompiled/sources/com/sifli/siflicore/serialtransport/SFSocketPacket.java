package com.sifli.siflicore.serialtransport;

import com.sifli.siflicore.log.SFLog;
import com.sifli.siflicore.util.CRC32MPEG2;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes14.dex */
public class SFSocketPacket {
    public static final int HEADER_SIZE = 16;
    public static final int MAGIC = 1397048134;
    private static final String TAG = "SFSocketPacket";

    public static byte[] pack(byte[] bArr, byte b) {
        ByteBuffer order = ByteBuffer.allocate(bArr.length + 16).order(ByteOrder.LITTLE_ENDIAN);
        order.putInt(MAGIC);
        order.putInt(bArr.length);
        order.put(b);
        order.put(new byte[3]);
        order.put(bArr);
        order.putInt(CRC32MPEG2.CRC32MPEG2GetValue(bArr));
        return order.array();
    }

    public static byte[] unpack(byte[] bArr) throws Exception {
        ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
        if (order.getInt() != 1397048134) {
            SFLog.e(TAG, "Invalid magic numbe");
            return null;
        }
        int i = order.getInt();
        if (i > bArr.length - 16) {
            SFLog.e(TAG, "Data length exceeds packet size");
            return null;
        }
        order.getInt();
        byte[] bArr2 = new byte[i];
        order.get(bArr2);
        order.position(order.position() + 4);
        return bArr2;
    }
}
