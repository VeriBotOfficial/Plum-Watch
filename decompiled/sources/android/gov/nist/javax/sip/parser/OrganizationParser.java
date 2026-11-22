package android.gov.nist.javax.sip.parser;

import android.gov.nist.javax.sip.header.Organization;
import android.gov.nist.javax.sip.header.SIPHeader;
import java.text.ParseException;

/* loaded from: classes.dex */
public class OrganizationParser extends HeaderParser {
    public OrganizationParser(String str) {
        super(str);
    }

    protected OrganizationParser(Lexer lexer) {
        super(lexer);
    }

    @Override // android.gov.nist.javax.sip.parser.HeaderParser
    public SIPHeader parse() throws ParseException {
        if (debug) {
            dbg_enter("OrganizationParser.parse");
        }
        Organization organization = new Organization();
        try {
            headerName(TokenTypes.ORGANIZATION);
            organization.setOrganization(this.lexer.getRest().trim());
            return organization;
        } finally {
            if (debug) {
                dbg_leave("OrganizationParser.parse");
            }
        }
    }
}
