package android.gov.nist.javax.sip.header;

import android.gov.nist.javax.sip.Utils;
import android.javax.sip.ListeningPoint;
import java.text.ParseException;

/* loaded from: classes.dex */
public class Protocol extends SIPObject {
    private static final long serialVersionUID = 2216758055974073280L;
    protected String protocolName = "SIP";
    protected String protocolVersion = "2.0";
    protected String transport = ListeningPoint.UDP;

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public String encode() {
        return encode(new StringBuilder()).toString();
    }

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public StringBuilder encode(StringBuilder sb) {
        sb.append(Utils.toUpperCase(this.protocolName)).append("/").append(this.protocolVersion).append("/").append(this.transport.toUpperCase());
        return sb;
    }

    public String getProtocolName() {
        return this.protocolName;
    }

    public String getProtocolVersion() {
        return this.protocolVersion;
    }

    public String getProtocol() {
        return this.protocolName + '/' + this.protocolVersion;
    }

    public void setProtocol(String str) throws ParseException {
        int indexOf = str.indexOf(47);
        if (indexOf > 0) {
            this.protocolName = str.substring(0, indexOf);
            this.protocolVersion = str.substring(indexOf + 1);
            return;
        }
        throw new ParseException("Missing '/' in protocol", 0);
    }

    public String getTransport() {
        return this.transport;
    }

    public void setProtocolName(String str) {
        this.protocolName = str;
    }

    public void setProtocolVersion(String str) {
        this.protocolVersion = str;
    }

    public void setTransport(String str) {
        this.transport = str;
    }
}
