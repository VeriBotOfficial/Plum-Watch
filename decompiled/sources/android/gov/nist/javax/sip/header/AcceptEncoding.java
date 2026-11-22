package android.gov.nist.javax.sip.header;

import android.javax.sip.InvalidArgumentException;
import android.javax.sip.header.AcceptEncodingHeader;
import java.text.ParseException;

/* loaded from: classes.dex */
public final class AcceptEncoding extends ParametersHeader implements AcceptEncodingHeader {
    private static final long serialVersionUID = -1476807565552873525L;
    protected String contentCoding;

    public AcceptEncoding() {
        super("Accept-Encoding");
    }

    protected String encodeBody() {
        return encode(new StringBuilder()).toString();
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    protected StringBuilder encodeBody(StringBuilder sb) {
        String str = this.contentCoding;
        if (str != null) {
            sb.append(str);
        }
        if (this.parameters != null && !this.parameters.isEmpty()) {
            sb.append(";").append(this.parameters.encode());
        }
        return sb;
    }

    @Override // android.javax.sip.header.AcceptEncodingHeader
    public float getQValue() {
        return getParameterAsFloat("q");
    }

    @Override // android.javax.sip.header.Encoding
    public String getEncoding() {
        return this.contentCoding;
    }

    @Override // android.javax.sip.header.AcceptEncodingHeader
    public void setQValue(float f) throws InvalidArgumentException {
        double d = f;
        if (d < 0.0d || d > 1.0d) {
            throw new InvalidArgumentException("qvalue out of range!");
        }
        super.setParameter("q", f);
    }

    @Override // android.javax.sip.header.Encoding
    public void setEncoding(String str) throws ParseException {
        if (str == null) {
            throw new NullPointerException(" encoding parameter is null");
        }
        this.contentCoding = str;
    }
}
