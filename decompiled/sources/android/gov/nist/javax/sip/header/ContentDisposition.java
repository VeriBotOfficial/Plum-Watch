package android.gov.nist.javax.sip.header;

import android.javax.sip.header.ContentDispositionHeader;
import java.text.ParseException;

/* loaded from: classes.dex */
public final class ContentDisposition extends ParametersHeader implements ContentDispositionHeader {
    private static final long serialVersionUID = 835596496276127003L;
    protected String dispositionType;

    public ContentDisposition() {
        super("Content-Disposition");
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
        sb.append(this.dispositionType);
        if (!this.parameters.isEmpty()) {
            sb.append(";").append(this.parameters.encode());
        }
        return sb;
    }

    @Override // android.javax.sip.header.ContentDispositionHeader
    public void setDispositionType(String str) throws ParseException {
        if (str == null) {
            throw new NullPointerException("JAIN-SIP Exception, ContentDisposition, setDispositionType(), the dispositionType parameter is null");
        }
        this.dispositionType = str;
    }

    @Override // android.javax.sip.header.ContentDispositionHeader
    public String getDispositionType() {
        return this.dispositionType;
    }

    @Override // android.javax.sip.header.ContentDispositionHeader
    public String getHandling() {
        return getParameter(ParameterNames.HANDLING);
    }

    @Override // android.javax.sip.header.ContentDispositionHeader
    public void setHandling(String str) throws ParseException {
        if (str == null) {
            throw new NullPointerException("JAIN-SIP Exception, ContentDisposition, setHandling(), the handling parameter is null");
        }
        setParameter(ParameterNames.HANDLING, str);
    }

    public String getContentDisposition() {
        return encodeBody(new StringBuilder()).toString();
    }
}
