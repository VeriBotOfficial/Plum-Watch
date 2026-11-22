package android.gov.nist.javax.sip.header;

import android.javax.sip.InvalidArgumentException;
import android.javax.sip.header.ExpiresHeader;

/* loaded from: classes.dex */
public class Expires extends SIPHeader implements ExpiresHeader {
    private static final long serialVersionUID = 3134344915465784267L;
    protected int expires;

    public Expires() {
        super("Expires");
    }

    public String encodeBody() {
        return encodeBody(new StringBuilder()).toString();
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    protected StringBuilder encodeBody(StringBuilder sb) {
        return sb.append(this.expires);
    }

    @Override // android.javax.sip.header.ExpiresHeader
    public int getExpires() {
        return this.expires;
    }

    @Override // android.javax.sip.header.ExpiresHeader
    public void setExpires(int i) throws InvalidArgumentException {
        if (i < 0) {
            throw new InvalidArgumentException("bad argument " + i);
        }
        this.expires = i;
    }
}
