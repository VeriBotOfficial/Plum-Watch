package android.gov.nist.core;

import com.alipay.sdk.m.p.a;
import java.text.ParseException;

/* loaded from: classes.dex */
public abstract class ParserCore {
    public static final boolean debug = Debug.parserDebug;
    static int nesting_level;
    protected LexerCore lexer;

    protected NameValue nameValue(char c) throws ParseException {
        boolean z;
        boolean z2 = debug;
        if (z2) {
            dbg_enter("nameValue");
        }
        try {
            this.lexer.match(4095);
            Token nextToken = this.lexer.getNextToken();
            this.lexer.SPorHT();
            try {
                String str = "";
                boolean z3 = true;
                if (this.lexer.lookAhead(0) == c) {
                    this.lexer.consume(1);
                    this.lexer.SPorHT();
                    char lookAhead = this.lexer.lookAhead(0);
                    if (lookAhead == '\"') {
                        str = this.lexer.quotedString();
                        z = true;
                        z3 = false;
                    } else {
                        if (lookAhead == '[') {
                            this.lexer.match(4100);
                            String str2 = this.lexer.getNextToken().tokenValue;
                            if (str2 != null) {
                                str = str2;
                                z3 = false;
                            }
                        } else {
                            this.lexer.match(4095);
                            String str3 = this.lexer.getNextToken().tokenValue;
                            if (str3 != null) {
                                str = str3;
                                z = false;
                                z3 = false;
                            }
                        }
                        z = false;
                    }
                    NameValue nameValue = new NameValue(nextToken.tokenValue, str, z3);
                    if (z) {
                        nameValue.setQuotedValue();
                    }
                    if (z2) {
                        dbg_leave("nameValue");
                    }
                    return nameValue;
                }
                NameValue nameValue2 = new NameValue(nextToken.tokenValue, "", true);
                if (z2) {
                    dbg_leave("nameValue");
                }
                return nameValue2;
            } catch (ParseException unused) {
                NameValue nameValue3 = new NameValue(nextToken.tokenValue, null, false);
                if (debug) {
                    dbg_leave("nameValue");
                }
                return nameValue3;
            }
        } catch (Throwable th) {
            if (debug) {
                dbg_leave("nameValue");
            }
            throw th;
        }
    }

    protected void dbg_enter(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nesting_level; i++) {
            sb.append(Separators.GREATER_THAN);
        }
        if (debug) {
            System.out.println(((Object) sb) + str + "\nlexer buffer = \n" + this.lexer.getRest());
        }
        nesting_level++;
    }

    protected void dbg_leave(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < nesting_level; i++) {
            sb.append(Separators.LESS_THAN);
        }
        if (debug) {
            System.out.println(((Object) sb) + str + "\nlexer buffer = \n" + this.lexer.getRest());
        }
        nesting_level--;
    }

    protected NameValue nameValue() throws ParseException {
        return nameValue(a.h);
    }

    protected void peekLine(String str) {
        if (debug) {
            Debug.println(str + " " + this.lexer.peekLine());
        }
    }
}
