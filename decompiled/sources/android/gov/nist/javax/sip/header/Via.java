package android.gov.nist.javax.sip.header;

import android.gov.nist.core.Host;
import android.gov.nist.core.HostPort;
import android.gov.nist.core.NameValue;
import android.gov.nist.core.NameValueList;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.stack.HopImpl;
import android.javax.sip.InvalidArgumentException;
import android.javax.sip.address.Hop;
import android.javax.sip.header.ViaHeader;
import java.text.ParseException;

/* loaded from: classes.dex */
public class Via extends ParametersHeader implements ViaHeader, ViaHeaderExt {
    public static final String BRANCH = "branch";
    public static final String MADDR = "maddr";
    public static final String RECEIVED = "received";
    public static final String RPORT = "rport";
    public static final String TTL = "ttl";
    private static final long serialVersionUID = 5281728373401351378L;
    protected String comment;
    protected HostPort sentBy;
    protected Protocol sentProtocol;

    public Via() {
        super("Via");
        this.sentProtocol = new Protocol();
    }

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ViaHeader) {
            ViaHeader viaHeader = (ViaHeader) obj;
            if (getProtocol().equalsIgnoreCase(viaHeader.getProtocol()) && getTransport().equalsIgnoreCase(viaHeader.getTransport()) && getHost().equalsIgnoreCase(viaHeader.getHost()) && getPort() == viaHeader.getPort() && equalParameters(viaHeader)) {
                return true;
            }
        }
        return false;
    }

    public String getProtocolVersion() {
        Protocol protocol = this.sentProtocol;
        if (protocol == null) {
            return null;
        }
        return protocol.getProtocolVersion();
    }

    public Protocol getSentProtocol() {
        return this.sentProtocol;
    }

    public HostPort getSentBy() {
        return this.sentBy;
    }

    public Hop getHop() {
        return new HopImpl(this.sentBy.getHost().getHostname(), this.sentBy.getPort(), this.sentProtocol.getTransport());
    }

    public NameValueList getViaParms() {
        return this.parameters;
    }

    public String getComment() {
        return this.comment;
    }

    public boolean hasPort() {
        return getSentBy().hasPort();
    }

    public boolean hasComment() {
        return this.comment != null;
    }

    public void removePort() {
        this.sentBy.removePort();
    }

    public void removeComment() {
        this.comment = null;
    }

    public void setProtocolVersion(String str) {
        if (this.sentProtocol == null) {
            this.sentProtocol = new Protocol();
        }
        this.sentProtocol.setProtocolVersion(str);
    }

    public void setHost(Host host) {
        if (this.sentBy == null) {
            this.sentBy = new HostPort();
        }
        this.sentBy.setHost(host);
    }

    public void setSentProtocol(Protocol protocol) {
        this.sentProtocol = protocol;
    }

    public void setSentBy(HostPort hostPort) {
        this.sentBy = hostPort;
    }

    public void setComment(String str) {
        this.comment = str;
    }

    protected String encodeBody() {
        return encodeBody(new StringBuilder()).toString();
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    protected StringBuilder encodeBody(StringBuilder sb) {
        this.sentProtocol.encode(sb);
        sb.append(" ");
        this.sentBy.encode(sb);
        if (!this.parameters.isEmpty()) {
            sb.append(";");
            this.parameters.encode(sb);
        }
        if (this.comment != null) {
            sb.append(" ").append(Separators.LPAREN).append(this.comment).append(Separators.RPAREN);
        }
        return sb;
    }

    @Override // android.javax.sip.header.ViaHeader
    public void setHost(String str) throws ParseException {
        if (this.sentBy == null) {
            this.sentBy = new HostPort();
        }
        try {
            this.sentBy.setHost(new Host(str));
        } catch (Exception unused) {
            throw new NullPointerException(" host parameter is null");
        }
    }

    @Override // android.javax.sip.header.ViaHeader
    public String getHost() {
        Host host;
        HostPort hostPort = this.sentBy;
        if (hostPort == null || (host = hostPort.getHost()) == null) {
            return null;
        }
        return host.getHostname();
    }

    @Override // android.javax.sip.header.ViaHeader
    public void setPort(int i) throws InvalidArgumentException {
        if (i != -1 && (i < 1 || i > 65535)) {
            throw new InvalidArgumentException("Port value out of range -1, [1..65535]");
        }
        if (this.sentBy == null) {
            this.sentBy = new HostPort();
        }
        this.sentBy.setPort(i);
    }

    @Override // android.javax.sip.header.ViaHeader
    public void setRPort() {
        try {
            setParameter("rport", (String) null);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    @Override // android.javax.sip.header.ViaHeader
    public int getPort() {
        HostPort hostPort = this.sentBy;
        if (hostPort == null) {
            return -1;
        }
        return hostPort.getPort();
    }

    @Override // android.javax.sip.header.ViaHeader
    public int getRPort() {
        String parameter = getParameter("rport");
        if (parameter == null || parameter.equals("")) {
            return -1;
        }
        return Integer.valueOf(parameter).intValue();
    }

    @Override // android.javax.sip.header.ViaHeader
    public String getTransport() {
        Protocol protocol = this.sentProtocol;
        if (protocol == null) {
            return null;
        }
        return protocol.getTransport();
    }

    @Override // android.javax.sip.header.ViaHeader
    public void setTransport(String str) throws ParseException {
        if (str == null) {
            throw new NullPointerException("JAIN-SIP Exception, Via, setTransport(), the transport parameter is null.");
        }
        if (this.sentProtocol == null) {
            this.sentProtocol = new Protocol();
        }
        this.sentProtocol.setTransport(str);
    }

    @Override // android.javax.sip.header.ViaHeader
    public String getProtocol() {
        Protocol protocol = this.sentProtocol;
        if (protocol == null) {
            return null;
        }
        return protocol.getProtocol();
    }

    @Override // android.javax.sip.header.ViaHeader
    public void setProtocol(String str) throws ParseException {
        if (str == null) {
            throw new NullPointerException("JAIN-SIP Exception, Via, setProtocol(), the protocol parameter is null.");
        }
        if (this.sentProtocol == null) {
            this.sentProtocol = new Protocol();
        }
        this.sentProtocol.setProtocol(str);
    }

    @Override // android.javax.sip.header.ViaHeader
    public int getTTL() {
        return getParameterAsInt("ttl");
    }

    @Override // android.javax.sip.header.ViaHeader
    public void setTTL(int i) throws InvalidArgumentException {
        if (i < 0 && i != -1) {
            throw new InvalidArgumentException("JAIN-SIP Exception, Via, setTTL(), the ttl parameter is < 0");
        }
        setParameter(new NameValue("ttl", Integer.valueOf(i)));
    }

    @Override // android.javax.sip.header.ViaHeader
    public String getMAddr() {
        return getParameter("maddr");
    }

    @Override // android.javax.sip.header.ViaHeader
    public void setMAddr(String str) throws ParseException {
        if (str == null) {
            throw new NullPointerException("JAIN-SIP Exception, Via, setMAddr(), the mAddr parameter is null.");
        }
        Host host = new Host();
        host.setAddress(str);
        setParameter(new NameValue("maddr", host));
    }

    @Override // android.javax.sip.header.ViaHeader
    public String getReceived() {
        return getParameter("received");
    }

    @Override // android.javax.sip.header.ViaHeader
    public void setReceived(String str) throws ParseException {
        if (str == null) {
            throw new NullPointerException("JAIN-SIP Exception, Via, setReceived(), the received parameter is null.");
        }
        setParameter("received", str);
    }

    @Override // android.javax.sip.header.ViaHeader
    public String getBranch() {
        return getParameter("branch");
    }

    @Override // android.javax.sip.header.ViaHeader
    public void setBranch(String str) throws ParseException {
        if (str == null || str.length() == 0) {
            throw new NullPointerException("JAIN-SIP Exception, Via, setBranch(), the branch parameter is null or length 0.");
        }
        setParameter("branch", str);
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.core.GenericObject
    public Object clone() {
        Via via = (Via) super.clone();
        Protocol protocol = this.sentProtocol;
        if (protocol != null) {
            via.sentProtocol = (Protocol) protocol.clone();
        }
        HostPort hostPort = this.sentBy;
        if (hostPort != null) {
            via.sentBy = (HostPort) hostPort.clone();
        }
        if (getRPort() != -1) {
            via.setParameter("rport", getRPort());
        }
        return via;
    }

    @Override // android.gov.nist.javax.sip.header.ViaHeaderExt
    public String getSentByField() {
        HostPort hostPort = this.sentBy;
        if (hostPort != null) {
            return hostPort.encode();
        }
        return null;
    }

    @Override // android.gov.nist.javax.sip.header.ViaHeaderExt
    public String getSentProtocolField() {
        Protocol protocol = this.sentProtocol;
        if (protocol != null) {
            return protocol.encode();
        }
        return null;
    }
}
