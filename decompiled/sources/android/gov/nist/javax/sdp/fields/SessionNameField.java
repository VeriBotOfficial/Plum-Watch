package android.gov.nist.javax.sdp.fields;

import android.javax.sdp.SdpException;
import android.javax.sdp.SdpParseException;
import android.javax.sdp.SessionName;

/* loaded from: classes.dex */
public class SessionNameField extends SDPField implements SessionName {
    protected String sessionName;

    public SessionNameField() {
        super(SDPFieldNames.SESSION_NAME_FIELD);
    }

    public String getSessionName() {
        return this.sessionName;
    }

    public void setSessionName(String str) {
        this.sessionName = str;
    }

    @Override // android.javax.sdp.SessionName
    public String getValue() throws SdpParseException {
        return getSessionName();
    }

    @Override // android.javax.sdp.SessionName
    public void setValue(String str) throws SdpException {
        if (str == null) {
            throw new SdpException("The value is null");
        }
        setSessionName(str);
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPField, android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public String encode() {
        return SDPFieldNames.SESSION_NAME_FIELD + this.sessionName + "\r\n";
    }
}
