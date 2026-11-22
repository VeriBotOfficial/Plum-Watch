package android.gov.nist.javax.sdp.fields;

import android.javax.sdp.Info;
import android.javax.sdp.SdpException;
import android.javax.sdp.SdpParseException;

/* loaded from: classes.dex */
public class InformationField extends SDPField implements Info {
    protected String information;

    public InformationField() {
        super(SDPFieldNames.INFORMATION_FIELD);
    }

    public String getInformation() {
        return this.information;
    }

    public void setInformation(String str) {
        this.information = str;
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPField, android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public String encode() {
        return SDPFieldNames.INFORMATION_FIELD + this.information + "\r\n";
    }

    @Override // android.javax.sdp.Info
    public String getValue() throws SdpParseException {
        return this.information;
    }

    @Override // android.javax.sdp.Info
    public void setValue(String str) throws SdpException {
        if (str == null) {
            throw new SdpException("The value is null");
        }
        setInformation(str);
    }
}
