package android.gov.nist.javax.sip.header;

import android.javax.sip.header.ExtensionHeader;
import android.javax.sip.header.SIPIfMatchHeader;
import java.text.ParseException;

/* loaded from: classes.dex */
public class SIPIfMatch extends SIPHeader implements SIPIfMatchHeader, ExtensionHeader {
    private static final long serialVersionUID = 3833745477828359730L;
    protected String entityTag;

    public SIPIfMatch() {
        super("SIP-If-Match");
    }

    public SIPIfMatch(String str) throws ParseException {
        this();
        setETag(str);
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
        return sb.append(this.entityTag);
    }

    @Override // android.javax.sip.header.SIPIfMatchHeader
    public String getETag() {
        return this.entityTag;
    }

    @Override // android.javax.sip.header.SIPIfMatchHeader
    public void setETag(String str) throws ParseException {
        if (str == null) {
            throw new NullPointerException("JAIN-SIP Exception,SIP-If-Match, setETag(), the etag parameter is null");
        }
        this.entityTag = str;
    }

    @Override // android.javax.sip.header.ExtensionHeader
    public void setValue(String str) throws ParseException {
        setETag(str);
    }
}
