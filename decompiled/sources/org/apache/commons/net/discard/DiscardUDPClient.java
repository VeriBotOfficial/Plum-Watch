package org.apache.commons.net.discard;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import org.apache.commons.net.DatagramSocketClient;
import org.apache.commons.net.util.NetConstants;

/* loaded from: classes8.dex */
public class DiscardUDPClient extends DatagramSocketClient {
    public static final int DEFAULT_PORT = 9;
    private final DatagramPacket sendPacket = new DatagramPacket(NetConstants.EMPTY_BTYE_ARRAY, 0);

    public void send(byte[] bArr, InetAddress inetAddress) throws IOException {
        send(bArr, bArr.length, inetAddress, 9);
    }

    public void send(byte[] bArr, int i, InetAddress inetAddress) throws IOException {
        send(bArr, i, inetAddress, 9);
    }

    public void send(byte[] bArr, int i, InetAddress inetAddress, int i2) throws IOException {
        this.sendPacket.setData(bArr);
        this.sendPacket.setLength(i);
        this.sendPacket.setAddress(inetAddress);
        this.sendPacket.setPort(i2);
        checkOpen().send(this.sendPacket);
    }
}
