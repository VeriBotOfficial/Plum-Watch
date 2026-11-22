package android.gov.nist.javax.sip.parser;

import android.gov.nist.javax.sip.header.StatusLine;
import com.huawei.hms.support.hianalytics.HiAnalyticsConstant;
import java.text.ParseException;

/* loaded from: classes.dex */
public class StatusLineParser extends Parser {
    public StatusLineParser(String str) {
        this.lexer = new Lexer("status_lineLexer", str);
    }

    public StatusLineParser(Lexer lexer) {
        this.lexer = lexer;
        this.lexer.selectLexer("status_lineLexer");
    }

    protected int statusCode() throws ParseException {
        String number = this.lexer.number();
        if (debug) {
            dbg_enter(HiAnalyticsConstant.HaKey.BI_KEY_RESULT);
        }
        try {
            try {
                return Integer.parseInt(number);
            } catch (NumberFormatException e) {
                throw new ParseException(this.lexer.getBuffer() + ":" + e.getMessage(), this.lexer.getPtr());
            }
        } finally {
            if (debug) {
                dbg_leave(HiAnalyticsConstant.HaKey.BI_KEY_RESULT);
            }
        }
    }

    protected String reasonPhrase() throws ParseException {
        return this.lexer.getRest().trim();
    }

    public StatusLine parse() throws ParseException {
        try {
            if (debug) {
                dbg_enter("parse");
            }
            StatusLine statusLine = new StatusLine();
            statusLine.setSipVersion(sipVersion());
            this.lexer.SPorHT();
            statusLine.setStatusCode(statusCode());
            this.lexer.SPorHT();
            statusLine.setReasonPhrase(reasonPhrase());
            this.lexer.SPorHT();
            return statusLine;
        } finally {
            if (debug) {
                dbg_leave("parse");
            }
        }
    }
}
