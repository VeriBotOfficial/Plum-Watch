package android.gov.nist.javax.sip.header.extensions;

import android.gov.nist.javax.sip.header.ParametersHeader;
import android.javax.sip.header.ExtensionHeader;
import java.text.ParseException;
import java.util.Iterator;

/* loaded from: classes.dex */
public class References extends ParametersHeader implements ReferencesHeader, ExtensionHeader {
    private static final long serialVersionUID = 8536961681006637622L;
    private String callId;

    public References() {
        super(ReferencesHeader.NAME);
    }

    @Override // android.gov.nist.javax.sip.header.extensions.ReferencesHeader
    public String getCallId() {
        return this.callId;
    }

    @Override // android.gov.nist.javax.sip.header.extensions.ReferencesHeader
    public String getRel() {
        return getParameter(ReferencesHeader.REL);
    }

    @Override // android.gov.nist.javax.sip.header.extensions.ReferencesHeader
    public void setCallId(String str) {
        this.callId = str;
    }

    @Override // android.gov.nist.javax.sip.header.extensions.ReferencesHeader
    public void setRel(String str) throws ParseException {
        if (str != null) {
            setParameter(ReferencesHeader.REL, str);
        }
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.javax.sip.header.Parameters
    public String getParameter(String str) {
        return super.getParameter(str);
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.javax.sip.header.Parameters
    public Iterator getParameterNames() {
        return super.getParameterNames();
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.javax.sip.header.Parameters
    public void removeParameter(String str) {
        super.removeParameter(str);
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.javax.sip.header.Parameters
    public void setParameter(String str, String str2) throws ParseException {
        super.setParameter(str, str2);
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader, android.javax.sip.header.Header
    public String getName() {
        return ReferencesHeader.NAME;
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
        if (this.parameters.isEmpty()) {
            return sb.append(this.callId);
        }
        return this.parameters.encode(sb.append(this.callId).append(";"));
    }

    @Override // android.javax.sip.header.ExtensionHeader
    public void setValue(String str) throws ParseException {
        throw new UnsupportedOperationException("operation not supported");
    }
}
