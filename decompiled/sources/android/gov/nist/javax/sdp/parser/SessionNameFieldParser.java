package android.gov.nist.javax.sdp.parser;

import android.gov.nist.javax.sdp.fields.SDPField;
import android.gov.nist.javax.sdp.fields.SessionNameField;
import java.text.ParseException;

/* loaded from: classes.dex */
public class SessionNameFieldParser extends SDPParser {
    public SessionNameFieldParser(String str) {
        this.lexer = new Lexer("charLexer", str);
    }

    public SessionNameField sessionNameField() throws ParseException {
        try {
            this.lexer.match(115);
            this.lexer.SPorHT();
            this.lexer.match(61);
            this.lexer.SPorHT();
            SessionNameField sessionNameField = new SessionNameField();
            String rest = this.lexer.getRest();
            sessionNameField.setSessionName(rest == null ? "" : rest.trim());
            return sessionNameField;
        } catch (Exception unused) {
            throw this.lexer.createParseException();
        }
    }

    @Override // android.gov.nist.javax.sdp.parser.SDPParser
    public SDPField parse() throws ParseException {
        return sessionNameField();
    }

    public static void main(String[] strArr) throws ParseException {
        String[] strArr2 = {"s=SDP Seminar \n", "s= Session SDP\n"};
        for (int i = 0; i < 2; i++) {
            System.out.println("encoded: " + new SessionNameFieldParser(strArr2[i]).sessionNameField().encode());
        }
    }
}
