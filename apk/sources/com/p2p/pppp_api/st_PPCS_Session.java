package com.p2p.pppp_api;

/* JADX INFO: loaded from: classes2.dex */
public class st_PPCS_Session {
    int Skt = -1;
    byte[] RemoteIP = new byte[16];
    int RemotePort = 0;
    byte[] MyLocalIP = new byte[16];
    int MyLocalPort = 0;
    byte[] MyWanIP = new byte[16];
    int MyWanPort = 0;
    int ConnectTime = 0;
    byte[] DID = new byte[24];
    byte bCorD = 0;
    byte bMode = 0;

    public static String bytes2Str(byte[] bArr) {
        int r1 = 0;
        while (r1 < bArr.length && bArr[r1] != 0) {
            r1++;
        }
        if (r1 == 0) {
            return "";
        }
        return new String(bArr, 0, r1);
    }

    public int getSkt() {
        return this.Skt;
    }

    public String getRemoteIP() {
        return bytes2Str(this.RemoteIP);
    }

    public int getRemotePort() {
        return this.RemotePort;
    }

    public String getMyLocalIP() {
        return bytes2Str(this.MyLocalIP);
    }

    public int getMyLocalPort() {
        return this.MyLocalPort;
    }

    public String getMyWanIP() {
        return bytes2Str(this.MyWanIP);
    }

    public int getMyWanPort() {
        return this.MyWanPort;
    }

    public int getConnectTime() {
        return this.ConnectTime;
    }

    public String getDID() {
        return bytes2Str(this.DID);
    }

    public int getCorD() {
        return this.bCorD & 255;
    }

    public int getMode() {
        return this.bMode & 255;
    }
}
