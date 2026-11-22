package android.gov.nist.javax.sip.header;

import android.javax.sip.header.SubjectHeader;
import java.text.ParseException;

/* loaded from: classes.dex */
public class Subject extends SIPHeader implements SubjectHeader {
    private static final long serialVersionUID = -6479220126758862528L;
    protected String subject;

    public Subject() {
        super("Subject");
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
        String str = this.subject;
        if (str != null) {
            return sb.append(str);
        }
        return sb.append("");
    }

    @Override // android.javax.sip.header.SubjectHeader
    public void setSubject(String str) throws ParseException {
        if (str == null) {
            throw new NullPointerException("JAIN-SIP Exception,  Subject, setSubject(), the subject parameter is null");
        }
        this.subject = str;
    }

    @Override // android.javax.sip.header.SubjectHeader
    public String getSubject() {
        return this.subject;
    }
}
