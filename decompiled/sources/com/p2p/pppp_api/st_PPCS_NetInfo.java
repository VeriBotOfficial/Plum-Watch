package com.p2p.pppp_api;

/* loaded from: classes17.dex */
public class st_PPCS_NetInfo {
    public int LanPort;
    public int WanPort;
    byte bFlagInternet = 0;
    byte bFlagHostResolved = 0;
    byte bFlagServerHello = 0;
    byte NAT_Type = 0;
    byte[] MyLanIP = new byte[16];
    byte[] MyWanIP = new byte[16];

    public int getbFlagInternet() {
        return this.bFlagInternet & 255;
    }

    public int getbFlagHostResolved() {
        return this.bFlagHostResolved & 255;
    }

    public int getbFlagServerHello() {
        return this.bFlagServerHello & 255;
    }

    public int getNAT_Type() {
        return this.NAT_Type & 255;
    }

    public String getMyLanIP() {
        return st_PPCS_Session.bytes2Str(this.MyLanIP);
    }

    public String getMyWanIP() {
        return st_PPCS_Session.bytes2Str(this.MyWanIP);
    }

    public int getLanPort() {
        return this.LanPort;
    }

    public int getWanPort() {
        return this.WanPort;
    }
}
