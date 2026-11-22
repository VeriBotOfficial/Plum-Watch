package android.gov.nist.javax.sdp.fields;

import android.javax.sdp.EMail;
import android.javax.sdp.SdpException;
import android.javax.sdp.SdpParseException;

/* loaded from: classes.dex */
public class EmailField extends SDPField implements EMail {
    protected EmailAddress emailAddress;

    public EmailField() {
        super(SDPFieldNames.EMAIL_FIELD);
        this.emailAddress = new EmailAddress();
    }

    public EmailAddress getEmailAddress() {
        return this.emailAddress;
    }

    public void setEmailAddress(EmailAddress emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPField, android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public String encode() {
        return SDPFieldNames.EMAIL_FIELD + this.emailAddress.encode() + "\r\n";
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPField, android.gov.nist.javax.sdp.fields.SDPObject
    public String toString() {
        return encode();
    }

    @Override // android.javax.sdp.EMail
    public String getValue() throws SdpParseException {
        EmailAddress emailAddress = this.emailAddress;
        if (emailAddress == null) {
            return null;
        }
        return emailAddress.getDisplayName();
    }

    @Override // android.javax.sdp.EMail
    public void setValue(String str) throws SdpException {
        if (str == null) {
            throw new SdpException("The value is null");
        }
        this.emailAddress.setDisplayName(str);
    }

    @Override // android.gov.nist.core.GenericObject
    public Object clone() {
        EmailField emailField = (EmailField) super.clone();
        EmailAddress emailAddress = this.emailAddress;
        if (emailAddress != null) {
            emailField.emailAddress = (EmailAddress) emailAddress.clone();
        }
        return emailField;
    }
}
