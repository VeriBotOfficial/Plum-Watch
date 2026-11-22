package org.apache.commons.net.echo;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import org.apache.commons.net.discard.DiscardUDPClient;
import org.apache.commons.net.util.NetConstants;

/* loaded from: classes8.dex */
public final class EchoUDPClient extends DiscardUDPClient {
    public static final int DEFAULT_PORT = 7;
    private final DatagramPacket receivePacket = new DatagramPacket(NetConstants.EMPTY_BTYE_ARRAY, 0);

    public int receive(byte[] bArr) throws IOException {
        return receive(bArr, bArr.length);
    }

    public int receive(byte[] bArr, int i) throws IOException {
        this.receivePacket.setData(bArr);
        this.receivePacket.setLength(i);
        checkOpen().receive(this.receivePacket);
        return this.receivePacket.getLength();
    }

    @Override // org.apache.commons.net.discard.DiscardUDPClient
    public void send(byte[] bArr, InetAddress inetAddress) throws IOException {
        send(bArr, bArr.length, inetAddress, 7);
    }

    @Override // org.apache.commons.net.discard.DiscardUDPClient
    public void send(byte[] bArr, int i, InetAddress inetAddress) throws IOException {
        send(bArr, i, inetAddress, 7);
    }
}
