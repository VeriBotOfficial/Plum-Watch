package com.beken.iot.smartsdk.core.thirdparty.cs2;

import android.javax.sip.ListeningPoint;
import com.p2p.pppp_api.st_PPCS_Session;

/* loaded from: classes13.dex */
public class SessionModel {
    private static final String TAG = "SessionModel";
    public final int connect_time;
    public final String did;
    public final boolean is_device;
    public String mode;
    public final String my_lan_ip;
    public final int my_lan_port;
    public final String my_wan_ip;
    public final int my_wan_port;
    public final String remote_ip;
    public final int remote_port;
    public final int session;
    public final int skt;
    public boolean supportPkt;

    public SessionModel(int i, st_PPCS_Session st_ppcs_session) {
        this.supportPkt = true;
        this.did = st_ppcs_session.getDID();
        this.session = i;
        this.skt = st_ppcs_session.getSkt();
        this.connect_time = st_ppcs_session.getConnectTime();
        this.remote_ip = st_ppcs_session.getRemoteIP();
        this.my_lan_ip = st_ppcs_session.getMyLocalIP();
        this.my_wan_ip = st_ppcs_session.getMyWanIP();
        this.remote_port = st_ppcs_session.getRemotePort();
        this.my_lan_port = st_ppcs_session.getMyLocalPort();
        this.my_wan_port = st_ppcs_session.getMyWanPort();
        this.is_device = st_ppcs_session.getCorD() == 1;
        if (st_ppcs_session.getMode() == 0) {
            if (checkIsLanIP(st_ppcs_session.getMyLocalIP(), st_ppcs_session.getRemoteIP())) {
                this.mode = "LAN";
            } else {
                this.mode = "P2P";
            }
            if (P2PUtil.getSocketType(st_ppcs_session.getSkt()) == 1) {
                this.mode += ".";
                this.supportPkt = false;
                return;
            }
            return;
        }
        if (st_ppcs_session.getMode() == 1) {
            this.mode = "RLY";
            return;
        }
        if (st_ppcs_session.getMode() == 2) {
            this.mode = ListeningPoint.TCP;
            this.supportPkt = false;
        } else if (st_ppcs_session.getMode() == 3) {
            this.mode = "RP2P";
        }
    }

    boolean checkIsLanIP(String str, String str2) {
        String[] split = str.split("\\.");
        String[] split2 = str2.split("\\.");
        if (split.length != 4 || split2.length != 4) {
            return false;
        }
        for (int i = 0; i < 3; i++) {
            if (!split[i].equals(split2[i])) {
                return false;
            }
        }
        return true;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("----------- Session info: ");
        sb.append(this.session).append(" -----------\nSocket: ");
        sb.append(this.skt);
        sb.append("\nRemote Addr: ").append(this.remote_ip).append(":").append(this.remote_port);
        sb.append("\nMy Wan Addr: ").append(this.my_wan_ip).append(":").append(this.my_wan_port);
        sb.append("\nMy Lan Addr: ").append(this.my_lan_ip).append(":").append(this.my_lan_port);
        sb.append("\nConnection time: ").append(this.connect_time).append(" second before\nDID: ");
        sb.append(this.did);
        sb.append("\nI am ").append(this.is_device ? "Device" : "Client");
        sb.append("\nConnection mode: ").append(this.mode);
        sb.append("\n---------- End of Session info ----------\n");
        return sb.toString();
    }
}
