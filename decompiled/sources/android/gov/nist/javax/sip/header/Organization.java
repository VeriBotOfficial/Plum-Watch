package android.gov.nist.javax.sip.header;

import android.javax.sip.header.OrganizationHeader;
import java.text.ParseException;

/* loaded from: classes.dex */
public class Organization extends SIPHeader implements OrganizationHeader {
    private static final long serialVersionUID = -2775003113740192712L;
    protected String organization;

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
        return sb.append(this.organization);
    }

    public Organization() {
        super("Organization");
    }

    @Override // android.javax.sip.header.OrganizationHeader
    public String getOrganization() {
        return this.organization;
    }

    @Override // android.javax.sip.header.OrganizationHeader
    public void setOrganization(String str) throws ParseException {
        if (str == null) {
            throw new NullPointerException("JAIN-SIP Exception, Organization, setOrganization(), the organization parameter is null");
        }
        this.organization = str;
    }
}
