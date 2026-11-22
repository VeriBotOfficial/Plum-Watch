package android.gov.nist.javax.sip.header;

import android.javax.sip.InvalidArgumentException;
import android.javax.sip.header.MimeVersionHeader;

/* loaded from: classes.dex */
public class MimeVersion extends SIPHeader implements MimeVersionHeader {
    private static final long serialVersionUID = -7951589626435082068L;
    protected int majorVersion;
    protected int minorVersion;

    public MimeVersion() {
        super("MIME-Version");
    }

    @Override // android.javax.sip.header.MimeVersionHeader
    public int getMinorVersion() {
        return this.minorVersion;
    }

    @Override // android.javax.sip.header.MimeVersionHeader
    public int getMajorVersion() {
        return this.majorVersion;
    }

    @Override // android.javax.sip.header.MimeVersionHeader
    public void setMinorVersion(int i) throws InvalidArgumentException {
        if (i < 0) {
            throw new InvalidArgumentException("JAIN-SIP Exception, MimeVersion, setMinorVersion(), the minorVersion parameter is null");
        }
        this.minorVersion = i;
    }

    @Override // android.javax.sip.header.MimeVersionHeader
    public void setMajorVersion(int i) throws InvalidArgumentException {
        if (i < 0) {
            throw new InvalidArgumentException("JAIN-SIP Exception, MimeVersion, setMajorVersion(), the majorVersion parameter is null");
        }
        this.majorVersion = i;
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
        return sb.append(Integer.toString(this.majorVersion)).append(".").append(Integer.toString(this.minorVersion));
    }
}
