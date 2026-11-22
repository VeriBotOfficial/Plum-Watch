package android.gov.nist.javax.sdp.fields;

import android.gov.nist.core.Separators;
import android.javax.sdp.Phone;
import android.javax.sdp.SdpException;
import android.javax.sdp.SdpParseException;

/* loaded from: classes.dex */
public class PhoneField extends SDPField implements Phone {
    protected String name;
    protected String phoneNumber;

    public PhoneField() {
        super(SDPFieldNames.PHONE_FIELD);
    }

    public String getName() {
        return this.name;
    }

    public String getPhoneNumber() {
        return this.phoneNumber;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setPhoneNumber(String str) {
        this.phoneNumber = str;
    }

    @Override // android.javax.sdp.Phone
    public String getValue() throws SdpParseException {
        return getName();
    }

    @Override // android.javax.sdp.Phone
    public void setValue(String str) throws SdpException {
        if (str == null) {
            throw new SdpException("The value parameter is null");
        }
        setName(str);
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPField, android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public String encode() {
        String str = this.name;
        String str2 = SDPFieldNames.PHONE_FIELD;
        if (str != null) {
            str2 = SDPFieldNames.PHONE_FIELD + this.name + Separators.LESS_THAN;
        }
        String str3 = str2 + this.phoneNumber;
        if (this.name != null) {
            str3 = str3 + Separators.GREATER_THAN;
        }
        return str3 + "\r\n";
    }
}
