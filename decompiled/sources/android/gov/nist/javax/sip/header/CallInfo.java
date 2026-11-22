package android.gov.nist.javax.sip.header;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.address.GenericURI;
import android.javax.sip.address.URI;
import android.javax.sip.header.CallInfoHeader;
import java.text.ParseException;

/* loaded from: classes.dex */
public final class CallInfo extends ParametersHeader implements CallInfoHeader {
    private static final long serialVersionUID = -8179246487696752928L;
    protected GenericURI info;

    public CallInfo() {
        super("Call-Info");
    }

    public String encodeBody() {
        return encodeBody(new StringBuilder()).toString();
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    protected StringBuilder encodeBody(StringBuilder sb) {
        sb.append(Separators.LESS_THAN);
        this.info.encode(sb);
        sb.append(Separators.GREATER_THAN);
        if (this.parameters != null && !this.parameters.isEmpty()) {
            sb.append(";");
            this.parameters.encode(sb);
        }
        return sb;
    }

    @Override // android.javax.sip.header.CallInfoHeader
    public String getPurpose() {
        return getParameter(ParameterNames.PURPOSE);
    }

    @Override // android.javax.sip.header.CallInfoHeader
    public URI getInfo() {
        return this.info;
    }

    @Override // android.javax.sip.header.CallInfoHeader
    public void setPurpose(String str) {
        if (str == null) {
            throw new NullPointerException("null arg");
        }
        try {
            setParameter(ParameterNames.PURPOSE, str);
        } catch (ParseException unused) {
        }
    }

    @Override // android.javax.sip.header.CallInfoHeader
    public void setInfo(URI uri) {
        this.info = (GenericURI) uri;
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.core.GenericObject
    public Object clone() {
        CallInfo callInfo = (CallInfo) super.clone();
        GenericURI genericURI = this.info;
        if (genericURI != null) {
            callInfo.info = (GenericURI) genericURI.clone();
        }
        return callInfo;
    }
}
