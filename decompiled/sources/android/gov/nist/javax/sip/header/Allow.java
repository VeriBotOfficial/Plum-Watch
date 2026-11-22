package android.gov.nist.javax.sip.header;

import android.javax.sip.header.AllowHeader;
import java.text.ParseException;

/* loaded from: classes.dex */
public final class Allow extends SIPHeader implements AllowHeader {
    private static final long serialVersionUID = -3105079479020693930L;
    protected String method;

    public Allow() {
        super("Allow");
        this.method = "";
    }

    public Allow(String str) {
        super("Allow");
        this.method = str;
    }

    @Override // android.javax.sip.header.AllowHeader
    public String getMethod() {
        return this.method;
    }

    @Override // android.javax.sip.header.AllowHeader
    public void setMethod(String str) throws ParseException {
        if (str == null) {
            throw new NullPointerException("JAIN-SIP Exception, Allow, setMethod(), the method parameter is null.");
        }
        this.method = str;
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    protected StringBuilder encodeBody(StringBuilder sb) {
        return sb.append(this.method);
    }
}
