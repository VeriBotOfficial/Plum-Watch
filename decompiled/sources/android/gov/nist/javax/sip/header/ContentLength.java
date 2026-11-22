package android.gov.nist.javax.sip.header;

import android.javax.sip.InvalidArgumentException;
import android.javax.sip.header.ContentLengthHeader;

/* loaded from: classes.dex */
public class ContentLength extends SIPHeader implements ContentLengthHeader {
    public static final String NAME_LOWER = "Content-Length".toLowerCase();
    private static final long serialVersionUID = 1187190542411037027L;
    protected int contentLength;

    public ContentLength() {
        super("Content-Length");
        this.contentLength = -1;
    }

    public ContentLength(int i) {
        super("Content-Length");
        this.contentLength = i;
    }

    @Override // android.javax.sip.header.ContentLengthHeader
    public int getContentLength() {
        return this.contentLength;
    }

    @Override // android.javax.sip.header.ContentLengthHeader
    public void setContentLength(int i) throws InvalidArgumentException {
        if (i < 0) {
            throw new InvalidArgumentException("JAIN-SIP Exception, ContentLength, setContentLength(), the contentLength parameter is <0");
        }
        this.contentLength = Integer.valueOf(i).intValue();
    }

    public String encodeBody() {
        return encodeBody(new StringBuilder()).toString();
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    protected StringBuilder encodeBody(StringBuilder sb) {
        int i = this.contentLength;
        if (i < 0) {
            sb.append("0");
            return sb;
        }
        sb.append(i);
        return sb;
    }

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public boolean match(Object obj) {
        return obj instanceof ContentLength;
    }

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        return (obj instanceof ContentLengthHeader) && getContentLength() == ((ContentLengthHeader) obj).getContentLength();
    }
}
