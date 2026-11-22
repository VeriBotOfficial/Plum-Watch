package android.gov.nist.core;

import java.net.InetAddress;
import java.net.UnknownHostException;

/* loaded from: classes.dex */
public final class HostPort extends GenericObject {
    private static final long serialVersionUID = -7103412227431884523L;
    protected Host host = null;
    protected int port = -1;

    @Override // android.gov.nist.core.GenericObject
    public String encode() {
        return encode(new StringBuilder()).toString();
    }

    @Override // android.gov.nist.core.GenericObject
    public StringBuilder encode(StringBuilder sb) {
        this.host.encode(sb);
        if (this.port != -1) {
            sb.append(":").append(this.port);
        }
        return sb;
    }

    @Override // android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HostPort hostPort = (HostPort) obj;
        return this.port == hostPort.port && this.host.equals(hostPort.host);
    }

    public Host getHost() {
        return this.host;
    }

    public int getPort() {
        return this.port;
    }

    public boolean hasPort() {
        return this.port != -1;
    }

    public void removePort() {
        this.port = -1;
    }

    public void setHost(Host host) {
        this.host = host;
    }

    public void setPort(int i) {
        this.port = i;
    }

    public InetAddress getInetAddress() throws UnknownHostException {
        Host host = this.host;
        if (host == null) {
            return null;
        }
        return host.getInetAddress();
    }

    @Override // android.gov.nist.core.GenericObject
    public void merge(Object obj) {
        super.merge(obj);
        if (this.port == -1) {
            this.port = ((HostPort) obj).port;
        }
    }

    @Override // android.gov.nist.core.GenericObject
    public Object clone() {
        HostPort hostPort = (HostPort) super.clone();
        Host host = this.host;
        if (host != null) {
            hostPort.host = (Host) host.clone();
        }
        return hostPort;
    }

    public String toString() {
        return encode();
    }

    public int hashCode() {
        return this.host.hashCode() + this.port;
    }
}
