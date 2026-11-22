package android.gov.nist.javax.sdp.fields;

import android.gov.nist.core.Host;
import android.javax.sdp.Origin;
import android.javax.sdp.SdpException;
import android.javax.sdp.SdpParseException;

/* loaded from: classes.dex */
public class OriginField extends SDPField implements Origin {
    protected Host address;
    protected String addrtype;
    protected String nettype;
    private String sessIdString;
    private String sessVersionString;
    protected String username;

    public OriginField() {
        super(SDPFieldNames.ORIGIN_FIELD);
    }

    @Override // android.javax.sdp.Origin
    public String getUsername() throws SdpParseException {
        return this.username;
    }

    public long getSessId() {
        return Long.valueOf(this.sessIdString).longValue();
    }

    public String getSessIdAsString() {
        return this.sessIdString;
    }

    public long getSessVersion() {
        return Long.valueOf(this.sessVersionString).longValue();
    }

    public String getSessVersionAsString() {
        return this.sessVersionString;
    }

    public String getNettype() {
        return this.nettype;
    }

    public String getAddrtype() {
        return this.addrtype;
    }

    public Host getHost() {
        return this.address;
    }

    public void setSessId(long j) {
        this.sessIdString = Long.toString(j);
    }

    public void setSessionId(String str) {
        this.sessIdString = str;
    }

    public void setSessVersion(long j) {
        this.sessVersionString = Long.toString(j);
    }

    public void setSessVersion(String str) {
        this.sessVersionString = str;
    }

    public void setNettype(String str) {
        this.nettype = str;
    }

    public void setAddrtype(String str) {
        this.addrtype = str;
    }

    public void setAddress(Host host) {
        this.address = host;
    }

    @Override // android.javax.sdp.Origin
    public void setUsername(String str) throws SdpException {
        if (str == null) {
            throw new SdpException("The user parameter is null");
        }
        this.username = str;
    }

    @Override // android.javax.sdp.Origin
    public long getSessionId() throws SdpParseException {
        return getSessId();
    }

    @Override // android.javax.sdp.Origin
    public void setSessionId(long j) throws SdpException {
        if (j < 0) {
            throw new SdpException("The is parameter is <0");
        }
        setSessId(j);
    }

    @Override // android.javax.sdp.Origin
    public long getSessionVersion() throws SdpParseException {
        return getSessVersion();
    }

    @Override // android.javax.sdp.Origin
    public void setSessionVersion(long j) throws SdpException {
        if (j < 0) {
            throw new SdpException("The version parameter is <0");
        }
        setSessVersion(j);
    }

    @Override // android.javax.sdp.Origin
    public String getAddress() throws SdpParseException {
        Host host = getHost();
        if (host == null) {
            return null;
        }
        return host.getAddress();
    }

    @Override // android.javax.sdp.Origin
    public String getAddressType() throws SdpParseException {
        return getAddrtype();
    }

    @Override // android.javax.sdp.Origin
    public String getNetworkType() throws SdpParseException {
        return getNettype();
    }

    @Override // android.javax.sdp.Origin
    public void setAddress(String str) throws SdpException {
        if (str == null) {
            throw new SdpException("The addr parameter is null");
        }
        Host host = getHost();
        if (host == null) {
            host = new Host();
        }
        host.setAddress(str);
        setAddress(host);
    }

    @Override // android.javax.sdp.Origin
    public void setAddressType(String str) throws SdpException {
        if (str == null) {
            throw new SdpException("The type parameter is <0");
        }
        setAddrtype(str);
    }

    @Override // android.javax.sdp.Origin
    public void setNetworkType(String str) throws SdpException {
        if (str == null) {
            throw new SdpException("The type parameter is <0");
        }
        setNettype(str);
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPField, android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public String encode() {
        String str;
        Host host = this.address;
        if (host != null) {
            str = host.encode();
            if (Host.isIPv6Reference(str)) {
                str = str.substring(1, str.length() - 1);
            }
        } else {
            str = null;
        }
        return SDPFieldNames.ORIGIN_FIELD + this.username + " " + this.sessIdString + " " + this.sessVersionString + " " + this.nettype + " " + this.addrtype + " " + str + "\r\n";
    }

    @Override // android.gov.nist.core.GenericObject
    public Object clone() {
        OriginField originField = (OriginField) super.clone();
        Host host = this.address;
        if (host != null) {
            originField.address = (Host) host.clone();
        }
        return originField;
    }
}
