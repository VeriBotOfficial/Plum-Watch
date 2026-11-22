package org.apache.commons.net.daytime;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import org.apache.commons.net.DatagramSocketClient;

/* loaded from: classes8.dex */
public final class DaytimeUDPClient extends DatagramSocketClient {
    public static final int DEFAULT_PORT = 13;
    private final byte[] dummyData = new byte[1];
    private final byte[] timeData = new byte[256];

    public String getTime(InetAddress inetAddress) throws IOException {
        return getTime(inetAddress, 13);
    }

    public String getTime(InetAddress inetAddress, int i) throws IOException {
        byte[] bArr = this.dummyData;
        DatagramPacket datagramPacket = new DatagramPacket(bArr, bArr.length, inetAddress, i);
        byte[] bArr2 = this.timeData;
        DatagramPacket datagramPacket2 = new DatagramPacket(bArr2, bArr2.length);
        checkOpen().send(datagramPacket);
        checkOpen().receive(datagramPacket2);
        return new String(datagramPacket2.getData(), 0, datagramPacket2.getLength(), getCharset());
    }
}
