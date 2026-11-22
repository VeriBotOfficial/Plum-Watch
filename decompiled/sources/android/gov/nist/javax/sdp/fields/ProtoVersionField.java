package android.gov.nist.javax.sdp.fields;

import android.javax.sdp.SdpException;
import android.javax.sdp.SdpParseException;
import android.javax.sdp.Version;

/* loaded from: classes.dex */
public class ProtoVersionField extends SDPField implements Version {
    protected int protoVersion;

    public ProtoVersionField() {
        super(SDPFieldNames.PROTO_VERSION_FIELD);
    }

    public int getProtoVersion() {
        return this.protoVersion;
    }

    public void setProtoVersion(int i) {
        this.protoVersion = i;
    }

    @Override // android.javax.sdp.Version
    public int getVersion() throws SdpParseException {
        return getProtoVersion();
    }

    @Override // android.javax.sdp.Version
    public void setVersion(int i) throws SdpException {
        if (i < 0) {
            throw new SdpException("The value is <0");
        }
        setProtoVersion(i);
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPField, android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public String encode() {
        return SDPFieldNames.PROTO_VERSION_FIELD + this.protoVersion + "\r\n";
    }
}
