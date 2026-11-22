package android.gov.nist.javax.sip.header;

import android.javax.sip.header.ExtensionHeader;
import android.javax.sip.header.SIPETagHeader;
import java.text.ParseException;

/* loaded from: classes.dex */
public class SIPETag extends SIPHeader implements SIPETagHeader, ExtensionHeader {
    private static final long serialVersionUID = 3837543366074322107L;
    protected String entityTag;

    public SIPETag() {
        super("SIP-ETag");
    }

    public SIPETag(String str) throws ParseException {
        this();
        setETag(str);
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
        return sb.append(this.entityTag);
    }

    @Override // android.javax.sip.header.SIPETagHeader
    public String getETag() {
        return this.entityTag;
    }

    @Override // android.javax.sip.header.SIPETagHeader
    public void setETag(String str) throws ParseException {
        if (str == null) {
            throw new NullPointerException("JAIN-SIP Exception,SIP-ETag, setETag(), the etag parameter is null");
        }
        this.entityTag = str;
    }

    @Override // android.javax.sip.header.ExtensionHeader
    public void setValue(String str) throws ParseException {
        setETag(str);
    }
}
