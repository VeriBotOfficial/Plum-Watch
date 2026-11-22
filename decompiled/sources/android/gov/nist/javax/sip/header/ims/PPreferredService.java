package android.gov.nist.javax.sip.header.ims;

import android.gov.nist.javax.sip.header.SIPHeader;
import android.javax.sip.header.ExtensionHeader;
import java.text.ParseException;

/* loaded from: classes.dex */
public class PPreferredService extends SIPHeader implements PPreferredServiceHeader, SIPHeaderNamesIms, ExtensionHeader {
    private String subAppIds;
    private String subServiceIds;

    protected PPreferredService(String str) {
        super("P-Preferred-Service");
    }

    public PPreferredService() {
        super("P-Preferred-Service");
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    protected StringBuilder encodeBody(StringBuilder sb) {
        sb.append(ParameterNamesIms.SERVICE_ID);
        if (this.subServiceIds != null) {
            sb.append(ParameterNamesIms.SERVICE_ID_LABEL).append(".");
            sb.append(getSubserviceIdentifiers());
            return sb;
        }
        if (this.subAppIds != null) {
            sb.append(ParameterNamesIms.APPLICATION_ID_LABEL).append(".");
            sb.append(getApplicationIdentifiers());
        }
        return sb;
    }

    @Override // android.javax.sip.header.ExtensionHeader
    public void setValue(String str) throws ParseException {
        throw new ParseException(str, 0);
    }

    @Override // android.gov.nist.javax.sip.header.ims.PPreferredServiceHeader
    public String getApplicationIdentifiers() {
        if (this.subAppIds.charAt(0) == '.') {
            return this.subAppIds.substring(1).trim();
        }
        return this.subAppIds;
    }

    @Override // android.gov.nist.javax.sip.header.ims.PPreferredServiceHeader
    public String getSubserviceIdentifiers() {
        if (this.subServiceIds.charAt(0) == '.') {
            return this.subServiceIds.substring(1).trim();
        }
        return this.subServiceIds;
    }

    @Override // android.gov.nist.javax.sip.header.ims.PPreferredServiceHeader
    public void setApplicationIdentifiers(String str) {
        this.subAppIds = str;
    }

    @Override // android.gov.nist.javax.sip.header.ims.PPreferredServiceHeader
    public void setSubserviceIdentifiers(String str) {
        this.subServiceIds = ".".concat(str);
    }

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        return (obj instanceof PPreferredServiceHeader) && super.equals(obj);
    }

    @Override // android.gov.nist.core.GenericObject
    public Object clone() {
        return (PPreferredService) super.clone();
    }
}
