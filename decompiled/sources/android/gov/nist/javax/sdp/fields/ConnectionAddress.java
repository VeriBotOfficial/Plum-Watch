package android.gov.nist.javax.sdp.fields;

import android.gov.nist.core.Host;

/* loaded from: classes.dex */
public class ConnectionAddress extends SDPObject {
    protected Host address;
    protected int port;
    protected int ttl;

    public Host getAddress() {
        return this.address;
    }

    public int getTtl() {
        return this.ttl;
    }

    public int getPort() {
        return this.port;
    }

    public void setAddress(Host host) {
        this.address = host;
    }

    public void setTtl(int i) {
        this.ttl = i;
    }

    public void setPort(int i) {
        this.port = i;
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public String encode() {
        String str;
        Host host = this.address;
        if (host == null) {
            str = "";
        } else {
            str = host.encode();
            if (Host.isIPv6Reference(str)) {
                str = str.substring(1, str.length() - 1);
            }
        }
        int i = this.ttl;
        if (i == 0 || this.port == 0) {
            return i != 0 ? str + "/" + this.ttl : str;
        }
        return str + "/" + this.ttl + "/" + this.port;
    }

    @Override // android.gov.nist.core.GenericObject
    public Object clone() {
        ConnectionAddress connectionAddress = (ConnectionAddress) super.clone();
        Host host = this.address;
        if (host != null) {
            connectionAddress.address = (Host) host.clone();
        }
        return connectionAddress;
    }
}
