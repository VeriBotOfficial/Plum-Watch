package org.apache.commons.net.tftp;

import android.gov.nist.core.Separators;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.DatagramPacket;
import java.net.SocketException;
import java.time.Duration;
import org.apache.commons.net.DatagramSocketClient;

/* loaded from: classes8.dex */
public class TFTP extends DatagramSocketClient {
    public static final int ASCII_MODE = 0;
    public static final int BINARY_MODE = 1;
    public static final int DEFAULT_PORT = 69;

    @Deprecated
    public static final int DEFAULT_TIMEOUT = 5000;
    public static final Duration DEFAULT_TIMEOUT_DURATION = Duration.ofSeconds(5);
    public static final int IMAGE_MODE = 1;
    public static final int NETASCII_MODE = 0;
    public static final int OCTET_MODE = 1;
    static final int PACKET_SIZE = 516;
    private byte[] receiveBuffer;
    private DatagramPacket receiveDatagram;
    byte[] sendBuffer;
    private DatagramPacket sendDatagram;

    protected void trace(String str, TFTPPacket tFTPPacket) {
    }

    public static final String getModeName(int i) {
        return TFTPRequestPacket.modeStrings[i];
    }

    public TFTP() {
        setDefaultTimeout(DEFAULT_TIMEOUT_DURATION);
        this.receiveBuffer = null;
        this.receiveDatagram = null;
    }

    public final void beginBufferedOps() {
        this.receiveBuffer = new byte[516];
        byte[] bArr = this.receiveBuffer;
        this.receiveDatagram = new DatagramPacket(bArr, bArr.length);
        this.sendBuffer = new byte[516];
        byte[] bArr2 = this.sendBuffer;
        this.sendDatagram = new DatagramPacket(bArr2, bArr2.length);
    }

    public final TFTPPacket bufferedReceive() throws IOException, InterruptedIOException, SocketException, TFTPPacketException {
        this.receiveDatagram.setData(this.receiveBuffer);
        this.receiveDatagram.setLength(this.receiveBuffer.length);
        checkOpen().receive(this.receiveDatagram);
        TFTPPacket newTFTPPacket = TFTPPacket.newTFTPPacket(this.receiveDatagram);
        trace(Separators.LESS_THAN, newTFTPPacket);
        return newTFTPPacket;
    }

    public final void bufferedSend(TFTPPacket tFTPPacket) throws IOException {
        trace(Separators.GREATER_THAN, tFTPPacket);
        checkOpen().send(tFTPPacket.newDatagram(this.sendDatagram, this.sendBuffer));
    }

    public final void discardPackets() throws IOException {
        DatagramPacket datagramPacket = new DatagramPacket(new byte[516], 516);
        Duration soTimeoutDuration = getSoTimeoutDuration();
        setSoTimeout(Duration.ofMillis(1L));
        while (true) {
            try {
                checkOpen().receive(datagramPacket);
            } catch (InterruptedIOException | SocketException unused) {
                setSoTimeout(soTimeoutDuration);
                return;
            }
        }
    }

    public final void endBufferedOps() {
        this.receiveBuffer = null;
        this.receiveDatagram = null;
        this.sendBuffer = null;
        this.sendDatagram = null;
    }

    public final TFTPPacket receive() throws IOException, InterruptedIOException, SocketException, TFTPPacketException {
        DatagramPacket datagramPacket = new DatagramPacket(new byte[516], 516);
        checkOpen().receive(datagramPacket);
        TFTPPacket newTFTPPacket = TFTPPacket.newTFTPPacket(datagramPacket);
        trace(Separators.LESS_THAN, newTFTPPacket);
        return newTFTPPacket;
    }

    public final void send(TFTPPacket tFTPPacket) throws IOException {
        trace(Separators.GREATER_THAN, tFTPPacket);
        checkOpen().send(tFTPPacket.newDatagram());
    }
}
