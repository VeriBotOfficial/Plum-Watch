package android.gov.nist.javax.sip.parser;

import android.gov.nist.javax.sip.header.SIPHeader;
import android.gov.nist.javax.sip.header.Subject;
import java.text.ParseException;

/* loaded from: classes.dex */
public class SubjectParser extends HeaderParser {
    public SubjectParser(String str) {
        super(str);
    }

    protected SubjectParser(Lexer lexer) {
        super(lexer);
    }

    @Override // android.gov.nist.javax.sip.parser.HeaderParser
    public SIPHeader parse() throws ParseException {
        Subject subject = new Subject();
        if (debug) {
            dbg_enter("SubjectParser.parse");
        }
        try {
            headerName(TokenTypes.SUBJECT);
            subject.setSubject(this.lexer.getRest().trim());
            return subject;
        } finally {
            if (debug) {
                dbg_leave("SubjectParser.parse");
            }
        }
    }
}
