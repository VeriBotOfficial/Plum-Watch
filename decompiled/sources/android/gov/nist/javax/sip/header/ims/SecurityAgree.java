package android.gov.nist.javax.sip.header.ims;

import android.gov.nist.core.NameValue;
import android.gov.nist.javax.sip.header.ParametersHeader;
import android.javax.sip.InvalidArgumentException;
import java.text.ParseException;

/* loaded from: classes.dex */
public abstract class SecurityAgree extends ParametersHeader {
    private String secMechanism;

    public SecurityAgree(String str) {
        super(str);
        this.parameters.setSeparator(";");
    }

    public SecurityAgree() {
        this.parameters.setSeparator(";");
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.javax.sip.header.Parameters
    public void setParameter(String str, String str2) throws ParseException {
        if (str2 == null) {
            throw new NullPointerException("null value");
        }
        NameValue nameValue = this.parameters.getNameValue(str.toLowerCase());
        if (nameValue == null) {
            NameValue nameValue2 = new NameValue(str, str2);
            if (str.equalsIgnoreCase(ParameterNamesIms.D_VER)) {
                nameValue2.setQuotedValue();
                if (str2.startsWith("\"")) {
                    throw new ParseException(str2 + " : Unexpected DOUBLE_QUOTE", 0);
                }
            }
            super.setParameter(nameValue2);
            return;
        }
        nameValue.setValueAsObject(str2);
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
        sb.append(this.secMechanism).append(";").append(" ");
        return this.parameters.encode(sb);
    }

    public void setSecurityMechanism(String str) throws ParseException {
        if (str == null) {
            throw new NullPointerException("JAIN-SIP Exception, SecurityAgree, setSecurityMechanism(), the sec-mechanism parameter is null");
        }
        this.secMechanism = str;
    }

    public void setEncryptionAlgorithm(String str) throws ParseException {
        if (str == null) {
            throw new NullPointerException("JAIN-SIP Exception, SecurityClient, setEncryptionAlgorithm(), the encryption-algorithm parameter is null");
        }
        setParameter(ParameterNamesIms.EALG, str);
    }

    public void setAlgorithm(String str) throws ParseException {
        if (str == null) {
            throw new NullPointerException("JAIN-SIP Exception, SecurityClient, setAlgorithm(), the algorithm parameter is null");
        }
        setParameter(ParameterNamesIms.ALG, str);
    }

    public void setProtocol(String str) throws ParseException {
        if (str == null) {
            throw new NullPointerException("JAIN-SIP Exception, SecurityClient, setProtocol(), the protocol parameter is null");
        }
        setParameter(ParameterNamesIms.PROT, str);
    }

    public void setMode(String str) throws ParseException {
        if (str == null) {
            throw new NullPointerException("JAIN-SIP Exception, SecurityClient, setMode(), the mode parameter is null");
        }
        setParameter("mod", str);
    }

    public void setSPIClient(int i) throws InvalidArgumentException {
        if (i < 0) {
            throw new InvalidArgumentException("JAIN-SIP Exception, SecurityClient, setSPIClient(), the spi-c parameter is <0");
        }
        setParameter(ParameterNamesIms.SPI_C, i);
    }

    public void setSPIServer(int i) throws InvalidArgumentException {
        if (i < 0) {
            throw new InvalidArgumentException("JAIN-SIP Exception, SecurityClient, setSPIServer(), the spi-s parameter is <0");
        }
        setParameter(ParameterNamesIms.SPI_S, i);
    }

    public void setPortClient(int i) throws InvalidArgumentException {
        if (i < 0) {
            throw new InvalidArgumentException("JAIN-SIP Exception, SecurityClient, setPortClient(), the port-c parameter is <0");
        }
        setParameter(ParameterNamesIms.PORT_C, i);
    }

    public void setPortServer(int i) throws InvalidArgumentException {
        if (i < 0) {
            throw new InvalidArgumentException("JAIN-SIP Exception, SecurityClient, setPortServer(), the port-s parameter is <0");
        }
        setParameter(ParameterNamesIms.PORT_S, i);
    }

    public void setPreference(float f) throws InvalidArgumentException {
        if (f < 0.0f) {
            throw new InvalidArgumentException("JAIN-SIP Exception, SecurityClient, setPreference(), the preference (q) parameter is <0");
        }
        setParameter("q", f);
    }

    public String getSecurityMechanism() {
        return this.secMechanism;
    }

    public String getEncryptionAlgorithm() {
        return getParameter(ParameterNamesIms.EALG);
    }

    public String getAlgorithm() {
        return getParameter(ParameterNamesIms.ALG);
    }

    public String getProtocol() {
        return getParameter(ParameterNamesIms.PROT);
    }

    public String getMode() {
        return getParameter("mod");
    }

    public int getSPIClient() {
        return Integer.parseInt(getParameter(ParameterNamesIms.SPI_C));
    }

    public int getSPIServer() {
        return Integer.parseInt(getParameter(ParameterNamesIms.SPI_S));
    }

    public int getPortClient() {
        return Integer.parseInt(getParameter(ParameterNamesIms.PORT_C));
    }

    public int getPortServer() {
        return Integer.parseInt(getParameter(ParameterNamesIms.PORT_S));
    }

    public float getPreference() {
        return Float.parseFloat(getParameter("q"));
    }

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        if (obj instanceof SecurityAgreeHeader) {
            SecurityAgreeHeader securityAgreeHeader = (SecurityAgreeHeader) obj;
            if (getSecurityMechanism().equals(securityAgreeHeader.getSecurityMechanism()) && equalParameters(securityAgreeHeader)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.core.GenericObject
    public Object clone() {
        SecurityAgree securityAgree = (SecurityAgree) super.clone();
        String str = this.secMechanism;
        if (str != null) {
            securityAgree.secMechanism = str;
        }
        return securityAgree;
    }
}
