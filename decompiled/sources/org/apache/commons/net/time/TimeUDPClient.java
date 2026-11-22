package org.apache.commons.net.time;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.InetAddress;
import java.util.Date;
import org.apache.commons.net.DatagramSocketClient;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes8.dex */
public final class TimeUDPClient extends DatagramSocketClient {
    public static final int DEFAULT_PORT = 37;
    public static final long SECONDS_1900_TO_1970 = 2208988800L;

    static long toTime(byte[] bArr) {
        return (((bArr[0] & 255) << 24) & BodyPartID.bodyIdMax) | (((bArr[1] & 255) << 16) & BodyPartID.bodyIdMax) | (((bArr[2] & 255) << 8) & BodyPartID.bodyIdMax) | (BodyPartID.bodyIdMax & bArr[3] & 255);
    }

    public Date getDate(InetAddress inetAddress) throws IOException {
        return new Date((getTime(inetAddress, 37) - 2208988800L) * 1000);
    }

    public Date getDate(InetAddress inetAddress, int i) throws IOException {
        return new Date((getTime(inetAddress, i) - 2208988800L) * 1000);
    }

    public long getTime(InetAddress inetAddress) throws IOException {
        return getTime(inetAddress, 37);
    }

    public long getTime(InetAddress inetAddress, int i) throws IOException {
        byte[] bArr = new byte[4];
        DatagramPacket datagramPacket = new DatagramPacket(new byte[1], 1, inetAddress, i);
        DatagramPacket datagramPacket2 = new DatagramPacket(bArr, 4);
        checkOpen().send(datagramPacket);
        checkOpen().receive(datagramPacket2);
        return toTime(bArr);
    }
}
