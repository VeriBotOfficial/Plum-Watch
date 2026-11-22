package org.apache.commons.net.tftp;

import java.net.DatagramPacket;
import java.net.InetAddress;

/* loaded from: classes8.dex */
public final class TFTPAckPacket extends TFTPPacket {
    int blockNumber;

    TFTPAckPacket(DatagramPacket datagramPacket) throws TFTPPacketException {
        super(4, datagramPacket.getAddress(), datagramPacket.getPort());
        byte[] data = datagramPacket.getData();
        if (getType() != data[1]) {
            throw new TFTPPacketException("TFTP operator code does not match type.");
        }
        this.blockNumber = (data[3] & 255) | ((data[2] & 255) << 8);
    }

    public TFTPAckPacket(InetAddress inetAddress, int i, int i2) {
        super(4, inetAddress, i);
        this.blockNumber = i2;
    }

    public int getBlockNumber() {
        return this.blockNumber;
    }

    @Override // org.apache.commons.net.tftp.TFTPPacket
    public DatagramPacket newDatagram() {
        byte b = (byte) this.type;
        int i = this.blockNumber;
        return new DatagramPacket(new byte[]{0, b, (byte) ((65535 & i) >> 8), (byte) (i & 255)}, 4, this.address, this.port);
    }

    @Override // org.apache.commons.net.tftp.TFTPPacket
    DatagramPacket newDatagram(DatagramPacket datagramPacket, byte[] bArr) {
        bArr[0] = 0;
        bArr[1] = (byte) this.type;
        int i = this.blockNumber;
        bArr[2] = (byte) ((65535 & i) >> 8);
        bArr[3] = (byte) (i & 255);
        datagramPacket.setAddress(this.address);
        datagramPacket.setPort(this.port);
        datagramPacket.setData(bArr);
        datagramPacket.setLength(4);
        return datagramPacket;
    }

    public void setBlockNumber(int i) {
        this.blockNumber = i;
    }

    @Override // org.apache.commons.net.tftp.TFTPPacket
    public String toString() {
        return super.toString() + " ACK " + this.blockNumber;
    }
}
