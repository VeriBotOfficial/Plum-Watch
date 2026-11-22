package android.gov.nist.javax.sip.header;

import android.javax.sip.header.ContentEncodingHeader;
import java.text.ParseException;

/* loaded from: classes.dex */
public class ContentEncoding extends SIPHeader implements ContentEncodingHeader {
    private static final long serialVersionUID = 2034230276579558857L;
    protected String contentEncoding;

    public ContentEncoding() {
        super("Content-Encoding");
    }

    public ContentEncoding(String str) {
        super("Content-Encoding");
        this.contentEncoding = str;
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
        return sb.append(this.contentEncoding);
    }

    @Override // android.javax.sip.header.Encoding
    public String getEncoding() {
        return this.contentEncoding;
    }

    @Override // android.javax.sip.header.Encoding
    public void setEncoding(String str) throws ParseException {
        if (str == null) {
            throw new NullPointerException("JAIN-SIP Exception,  encoding is null");
        }
        this.contentEncoding = str;
    }
}
