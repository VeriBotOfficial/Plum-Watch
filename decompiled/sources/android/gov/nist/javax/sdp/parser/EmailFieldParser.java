package android.gov.nist.javax.sdp.parser;

import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.Email;
import android.gov.nist.javax.sdp.fields.EmailAddress;
import android.gov.nist.javax.sdp.fields.EmailField;
import android.gov.nist.javax.sdp.fields.SDPField;
import java.text.ParseException;

/* loaded from: classes.dex */
public class EmailFieldParser extends SDPParser {
    public EmailFieldParser(String str) {
        this.lexer = new Lexer("charLexer", str);
    }

    public String getDisplayName(String str) {
        try {
            int indexOf = str.indexOf(Separators.LPAREN);
            int indexOf2 = str.indexOf(Separators.RPAREN);
            if (indexOf != -1) {
                return str.substring(indexOf + 1, indexOf2);
            }
            int indexOf3 = str.indexOf(Separators.LESS_THAN);
            if (indexOf3 != -1) {
                return str.substring(0, indexOf3);
            }
            return null;
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public Email getEmail(String str) {
        Email email = new Email();
        try {
            int indexOf = str.indexOf(Separators.LPAREN);
            if (indexOf != -1) {
                String substring = str.substring(0, indexOf);
                int indexOf2 = substring.indexOf(Separators.AT);
                if (indexOf2 != -1) {
                    email.setUserName(substring.substring(0, indexOf2));
                    email.setHostName(substring.substring(indexOf2 + 1));
                    return email;
                }
            } else {
                int indexOf3 = str.indexOf(Separators.LESS_THAN);
                int indexOf4 = str.indexOf(Separators.GREATER_THAN);
                if (indexOf3 != -1) {
                    String substring2 = str.substring(indexOf3 + 1, indexOf4);
                    int indexOf5 = substring2.indexOf(Separators.AT);
                    if (indexOf5 != -1) {
                        email.setUserName(substring2.substring(0, indexOf5));
                        email.setHostName(substring2.substring(indexOf5 + 1));
                        return email;
                    }
                } else {
                    int indexOf6 = str.indexOf(Separators.AT);
                    str.indexOf("\n");
                    if (indexOf6 != -1) {
                        email.setUserName(str.substring(0, indexOf6));
                        email.setHostName(str.substring(indexOf6 + 1));
                        return email;
                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return email;
    }

    public EmailField emailField() throws ParseException {
        try {
            this.lexer.match(101);
            this.lexer.SPorHT();
            this.lexer.match(61);
            this.lexer.SPorHT();
            EmailField emailField = new EmailField();
            EmailAddress emailAddress = new EmailAddress();
            String rest = this.lexer.getRest();
            emailAddress.setDisplayName(getDisplayName(rest.trim()));
            emailAddress.setEmail(getEmail(rest));
            emailField.setEmailAddress(emailAddress);
            return emailField;
        } catch (Exception unused) {
            throw new ParseException(this.lexer.getBuffer(), this.lexer.getPtr());
        }
    }

    @Override // android.gov.nist.javax.sdp.parser.SDPParser
    public SDPField parse() throws ParseException {
        return emailField();
    }
}
