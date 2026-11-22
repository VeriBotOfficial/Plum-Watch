package android.gov.nist.javax.sip.header;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.address.GenericURI;
import android.javax.sip.address.URI;
import android.javax.sip.header.ErrorInfoHeader;
import java.text.ParseException;

/* loaded from: classes.dex */
public final class ErrorInfo extends ParametersHeader implements ErrorInfoHeader {
    private static final long serialVersionUID = -6347702901964436362L;
    protected GenericURI errorInfo;

    public ErrorInfo() {
        super("Error-Info");
    }

    public ErrorInfo(GenericURI genericURI) {
        this();
        this.errorInfo = genericURI;
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
        sb.append(Separators.LESS_THAN);
        this.errorInfo.encode(sb);
        sb.append(Separators.GREATER_THAN);
        if (!this.parameters.isEmpty()) {
            sb.append(";");
            this.parameters.encode(sb);
        }
        return sb;
    }

    @Override // android.javax.sip.header.ErrorInfoHeader
    public void setErrorInfo(URI uri) {
        this.errorInfo = (GenericURI) uri;
    }

    @Override // android.javax.sip.header.ErrorInfoHeader
    public URI getErrorInfo() {
        return this.errorInfo;
    }

    @Override // android.javax.sip.header.ErrorInfoHeader
    public void setErrorMessage(String str) throws ParseException {
        if (str == null) {
            throw new NullPointerException("JAIN-SIP Exception , ErrorInfoHeader, setErrorMessage(), the message parameter is null");
        }
        setParameter("message", str);
    }

    @Override // android.javax.sip.header.ErrorInfoHeader
    public String getErrorMessage() {
        return getParameter("message");
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.core.GenericObject
    public Object clone() {
        ErrorInfo errorInfo = (ErrorInfo) super.clone();
        GenericURI genericURI = this.errorInfo;
        if (genericURI != null) {
            errorInfo.errorInfo = (GenericURI) genericURI.clone();
        }
        return errorInfo;
    }
}
