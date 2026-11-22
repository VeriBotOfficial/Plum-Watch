package android.gov.nist.javax.sip.stack;

import android.javax.sip.ListeningPoint;
import android.javax.sip.address.Hop;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class HopImpl implements Hop, Serializable {
    protected boolean defaultRoute;
    protected String host;
    protected int port;
    protected String transport;
    protected boolean uriRoute;

    @Override // android.javax.sip.address.Hop
    public String toString() {
        return this.host + ":" + this.port + "/" + this.transport;
    }

    public HopImpl(String str, int i, String str2) {
        this.host = str;
        if (str.indexOf(":") >= 0 && this.host.indexOf("[") < 0) {
            this.host = "[" + this.host + "]";
        }
        this.port = i;
        this.transport = str2;
    }

    HopImpl(String str) throws IllegalArgumentException {
        String substring;
        if (str == null) {
            throw new IllegalArgumentException("Null arg!");
        }
        int indexOf = str.indexOf(93);
        int indexOf2 = str.indexOf(58, indexOf);
        int indexOf3 = str.indexOf(47, indexOf2);
        if (indexOf2 > 0) {
            this.host = str.substring(0, indexOf2);
            if (indexOf3 > 0) {
                substring = str.substring(indexOf2 + 1, indexOf3);
                this.transport = str.substring(indexOf3 + 1);
            } else {
                substring = str.substring(indexOf2 + 1);
                this.transport = ListeningPoint.UDP;
            }
            try {
                this.port = Integer.parseInt(substring);
            } catch (NumberFormatException unused) {
                throw new IllegalArgumentException("Bad port spec");
            }
        } else {
            if (indexOf3 > 0) {
                this.host = str.substring(0, indexOf3);
                String substring2 = str.substring(indexOf3 + 1);
                this.transport = substring2;
                this.port = substring2.equalsIgnoreCase("TLS") ? 5061 : 5060;
            } else {
                this.host = str;
                this.transport = ListeningPoint.UDP;
                this.port = 5060;
            }
        }
        String str2 = this.host;
        if (str2 == null || str2.length() == 0) {
            throw new IllegalArgumentException("no host!");
        }
        this.host = this.host.trim();
        this.transport = this.transport.trim();
        if (indexOf > 0 && this.host.charAt(0) != '[') {
            throw new IllegalArgumentException("Bad IPv6 reference spec");
        }
    }

    @Override // android.javax.sip.address.Hop
    public String getHost() {
        return this.host;
    }

    @Override // android.javax.sip.address.Hop
    public int getPort() {
        return this.port;
    }

    @Override // android.javax.sip.address.Hop
    public String getTransport() {
        return this.transport;
    }

    public boolean isURIRoute() {
        return this.uriRoute;
    }

    public void setURIRouteFlag() {
        this.uriRoute = true;
    }
}
