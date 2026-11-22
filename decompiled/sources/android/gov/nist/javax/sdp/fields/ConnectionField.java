package android.gov.nist.javax.sdp.fields;

import android.gov.nist.core.Host;
import android.javax.sdp.Connection;
import android.javax.sdp.SdpException;
import android.javax.sdp.SdpParseException;

/* loaded from: classes.dex */
public class ConnectionField extends SDPField implements Connection {
    protected ConnectionAddress address;
    protected String addrtype;
    protected String nettype;

    public ConnectionField() {
        super(SDPFieldNames.CONNECTION_FIELD);
    }

    public String getNettype() {
        return this.nettype;
    }

    public String getAddrtype() {
        return this.addrtype;
    }

    public ConnectionAddress getConnectionAddress() {
        return this.address;
    }

    public void setNettype(String str) {
        this.nettype = str;
    }

    public void setAddrType(String str) {
        this.addrtype = str;
    }

    public void setAddress(ConnectionAddress connectionAddress) {
        this.address = connectionAddress;
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPField, android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public String encode() {
        String str = this.nettype;
        String str2 = SDPFieldNames.CONNECTION_FIELD;
        if (str != null) {
            str2 = SDPFieldNames.CONNECTION_FIELD + this.nettype;
        }
        if (this.addrtype != null) {
            str2 = str2 + " " + this.addrtype;
        }
        if (this.address != null) {
            str2 = str2 + " " + this.address.encode();
        }
        return str2 + "\r\n";
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPField, android.gov.nist.javax.sdp.fields.SDPObject
    public String toString() {
        return encode();
    }

    @Override // android.javax.sdp.Connection
    public String getAddress() throws SdpParseException {
        Host address;
        ConnectionAddress connectionAddress = getConnectionAddress();
        if (connectionAddress == null || (address = connectionAddress.getAddress()) == null) {
            return null;
        }
        return address.getAddress();
    }

    @Override // android.javax.sdp.Connection
    public String getAddressType() throws SdpParseException {
        return getAddrtype();
    }

    @Override // android.javax.sdp.Connection
    public String getNetworkType() throws SdpParseException {
        return getNettype();
    }

    @Override // android.javax.sdp.Connection
    public void setAddress(String str) throws SdpException {
        if (str == null) {
            throw new SdpException("the addr is null");
        }
        ConnectionAddress connectionAddress = this.address;
        if (connectionAddress == null) {
            this.address = new ConnectionAddress();
            this.address.setAddress(new Host(str));
        } else {
            Host address = connectionAddress.getAddress();
            if (address == null) {
                this.address.setAddress(new Host(str));
            } else {
                address.setAddress(str);
            }
        }
        setAddress(this.address);
    }

    @Override // android.javax.sdp.Connection
    public void setAddressType(String str) throws SdpException {
        if (str == null) {
            throw new SdpException("the type is null");
        }
        this.addrtype = str;
    }

    @Override // android.javax.sdp.Connection
    public void setNetworkType(String str) throws SdpException {
        if (str == null) {
            throw new SdpException("the type is null");
        }
        setNettype(str);
    }

    @Override // android.gov.nist.core.GenericObject
    public Object clone() {
        ConnectionField connectionField = (ConnectionField) super.clone();
        ConnectionAddress connectionAddress = this.address;
        if (connectionAddress != null) {
            connectionField.address = (ConnectionAddress) connectionAddress.clone();
        }
        return connectionField;
    }
}
