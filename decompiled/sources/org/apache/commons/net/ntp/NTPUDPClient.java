package org.apache.commons.net.ntp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import org.apache.commons.net.DatagramSocketClient;

/* loaded from: classes8.dex */
public final class NTPUDPClient extends DatagramSocketClient {
    public static final int DEFAULT_PORT = 123;
    private int version = 3;

    public TimeInfo getTime(InetAddress inetAddress) throws IOException {
        return getTime(inetAddress, 123);
    }

    public TimeInfo getTime(InetAddress inetAddress, int i) throws IOException {
        if (!isOpen()) {
            open();
        }
        NtpV3Impl ntpV3Impl = new NtpV3Impl();
        ntpV3Impl.setMode(3);
        ntpV3Impl.setVersion(this.version);
        DatagramPacket datagramPacket = ntpV3Impl.getDatagramPacket();
        datagramPacket.setAddress(inetAddress);
        datagramPacket.setPort(i);
        NtpV3Impl ntpV3Impl2 = new NtpV3Impl();
        DatagramPacket datagramPacket2 = ntpV3Impl2.getDatagramPacket();
        TimeStamp currentTime = TimeStamp.getCurrentTime();
        ntpV3Impl.setTransmitTime(currentTime);
        checkOpen().send(datagramPacket);
        checkOpen().receive(datagramPacket2);
        long currentTimeMillis = System.currentTimeMillis();
        if (!currentTime.equals(ntpV3Impl2.getOriginateTimeStamp())) {
            throw new IOException("Originate time does not match the request");
        }
        return new TimeInfo((NtpV3Packet) ntpV3Impl2, currentTimeMillis, false);
    }

    public int getVersion() {
        return this.version;
    }

    public void setVersion(int i) {
        this.version = i;
    }
}
