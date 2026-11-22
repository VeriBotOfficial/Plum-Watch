package android.gov.nist.javax.sip.parser;

import android.gov.nist.javax.sip.header.Priority;
import android.gov.nist.javax.sip.header.SIPHeader;
import java.text.ParseException;

/* loaded from: classes.dex */
public class PriorityParser extends HeaderParser {
    public PriorityParser(String str) {
        super(str);
    }

    protected PriorityParser(Lexer lexer) {
        super(lexer);
    }

    @Override // android.gov.nist.javax.sip.parser.HeaderParser
    public SIPHeader parse() throws ParseException {
        if (debug) {
            dbg_enter("PriorityParser.parse");
        }
        Priority priority = new Priority();
        try {
            headerName(2081);
            priority.setHeaderName("Priority");
            this.lexer.SPorHT();
            priority.setPriority(this.lexer.ttokenSafe());
            this.lexer.SPorHT();
            this.lexer.match(10);
            return priority;
        } finally {
            if (debug) {
                dbg_leave("PriorityParser.parse");
            }
        }
    }

    public static void main(String[] strArr) throws ParseException {
        String[] strArr2 = new String[1];
        System.out.println("encoded = " + ((Priority) new PriorityParser("Priority: 8;a\n").parse()).encode());
    }
}
