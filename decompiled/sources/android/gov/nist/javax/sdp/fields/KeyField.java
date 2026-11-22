package android.gov.nist.javax.sdp.fields;

import android.javax.sdp.Key;
import android.javax.sdp.SdpException;
import android.javax.sdp.SdpParseException;

/* loaded from: classes.dex */
public class KeyField extends SDPField implements Key {
    protected String keyData;
    protected String type;

    public KeyField() {
        super(SDPFieldNames.KEY_FIELD);
    }

    public String getType() {
        return this.type;
    }

    public String getKeyData() {
        return this.keyData;
    }

    public void setType(String str) {
        this.type = str;
    }

    public void setKeyData(String str) {
        this.keyData = str;
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPField, android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public String encode() {
        String str = SDPFieldNames.KEY_FIELD + this.type;
        if (this.keyData != null) {
            str = (str + ":") + this.keyData;
        }
        return str + "\r\n";
    }

    @Override // android.javax.sdp.Key
    public String getMethod() throws SdpParseException {
        return this.type;
    }

    @Override // android.javax.sdp.Key
    public void setMethod(String str) throws SdpException {
        this.type = str;
    }

    @Override // android.javax.sdp.Key
    public boolean hasKey() throws SdpParseException {
        return getKeyData() != null;
    }

    @Override // android.javax.sdp.Key
    public String getKey() throws SdpParseException {
        return getKeyData();
    }

    @Override // android.javax.sdp.Key
    public void setKey(String str) throws SdpException {
        if (str == null) {
            throw new SdpException("The key is null");
        }
        setKeyData(str);
    }
}
