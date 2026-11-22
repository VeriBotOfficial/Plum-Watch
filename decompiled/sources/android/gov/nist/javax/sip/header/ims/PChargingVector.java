package android.gov.nist.javax.sip.header.ims;

import android.gov.nist.javax.sip.header.ParametersHeader;
import android.javax.sip.SipException;
import android.javax.sip.header.ExtensionHeader;
import java.text.ParseException;

/* loaded from: classes.dex */
public class PChargingVector extends ParametersHeader implements PChargingVectorHeader, SIPHeaderNamesIms, ExtensionHeader {
    public PChargingVector() {
        super("P-Charging-Vector");
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
        if (getNameValue(ParameterNamesIms.ICID_VALUE) != null) {
            this.parameters.encode(sb);
            return sb;
        }
        try {
            throw new SipException("icid-value is mandatory");
        } catch (SipException e) {
            e.printStackTrace();
            return sb;
        }
    }

    @Override // android.gov.nist.javax.sip.header.ims.PChargingVectorHeader
    public String getICID() {
        return getParameter(ParameterNamesIms.ICID_VALUE);
    }

    @Override // android.gov.nist.javax.sip.header.ims.PChargingVectorHeader
    public void setICID(String str) throws ParseException {
        if (str == null) {
            throw new NullPointerException("JAIN-SIP Exception, P-Charging-Vector, setICID(), the icid parameter is null.");
        }
        setParameter(ParameterNamesIms.ICID_VALUE, str);
    }

    @Override // android.gov.nist.javax.sip.header.ims.PChargingVectorHeader
    public String getICIDGeneratedAt() {
        return getParameter(ParameterNamesIms.ICID_GENERATED_AT);
    }

    @Override // android.gov.nist.javax.sip.header.ims.PChargingVectorHeader
    public void setICIDGeneratedAt(String str) throws ParseException {
        if (str == null) {
            throw new NullPointerException("JAIN-SIP Exception, P-Charging-Vector, setICIDGeneratedAt(), the host parameter is null.");
        }
        setParameter(ParameterNamesIms.ICID_GENERATED_AT, str);
    }

    @Override // android.gov.nist.javax.sip.header.ims.PChargingVectorHeader
    public String getOriginatingIOI() {
        return getParameter(ParameterNamesIms.ORIG_IOI);
    }

    @Override // android.gov.nist.javax.sip.header.ims.PChargingVectorHeader
    public void setOriginatingIOI(String str) throws ParseException {
        if (str != null && str.length() != 0) {
            this.parameters.set(ParameterNamesIms.ORIG_IOI, str);
        } else {
            removeParameter(ParameterNamesIms.ORIG_IOI);
        }
    }

    @Override // android.gov.nist.javax.sip.header.ims.PChargingVectorHeader
    public String getTerminatingIOI() {
        return getParameter(ParameterNamesIms.TERM_IOI);
    }

    @Override // android.gov.nist.javax.sip.header.ims.PChargingVectorHeader
    public void setTerminatingIOI(String str) throws ParseException {
        if (str != null && str.length() != 0) {
            this.parameters.set(ParameterNamesIms.TERM_IOI, str);
        } else {
            removeParameter(ParameterNamesIms.TERM_IOI);
        }
    }

    @Override // android.javax.sip.header.ExtensionHeader
    public void setValue(String str) throws ParseException {
        throw new ParseException(str, 0);
    }
}
