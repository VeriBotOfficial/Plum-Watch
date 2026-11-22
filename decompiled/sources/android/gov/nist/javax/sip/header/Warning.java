package android.gov.nist.javax.sip.header;

import android.javax.sip.InvalidArgumentException;
import android.javax.sip.header.WarningHeader;
import java.text.ParseException;

/* loaded from: classes.dex */
public class Warning extends SIPHeader implements WarningHeader {
    private static final long serialVersionUID = -3433328864230783899L;
    protected String agent;
    protected int code;
    protected String text;

    public Warning() {
        super("Warning");
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
        StringBuilder append;
        String str;
        if (this.text != null) {
            str = "\"";
            append = sb.append(Integer.toString(this.code)).append(" ").append(this.agent).append(" ").append("\"").append(this.text);
        } else {
            append = sb.append(Integer.toString(this.code)).append(" ");
            str = this.agent;
        }
        return append.append(str);
    }

    @Override // android.javax.sip.header.WarningHeader
    public int getCode() {
        return this.code;
    }

    @Override // android.javax.sip.header.WarningHeader
    public String getAgent() {
        return this.agent;
    }

    @Override // android.javax.sip.header.WarningHeader
    public String getText() {
        return this.text;
    }

    @Override // android.javax.sip.header.WarningHeader
    public void setCode(int i) throws InvalidArgumentException {
        if (i > 99 && i < 1000) {
            this.code = i;
            return;
        }
        throw new InvalidArgumentException("Code parameter in the Warning header is invalid: code=" + i);
    }

    @Override // android.javax.sip.header.WarningHeader
    public void setAgent(String str) throws ParseException {
        if (str == null) {
            throw new NullPointerException("the host parameter in the Warning header is null");
        }
        this.agent = str;
    }

    @Override // android.javax.sip.header.WarningHeader
    public void setText(String str) throws ParseException {
        if (str == null) {
            throw new ParseException("The text parameter in the Warning header is null", 0);
        }
        this.text = str;
    }
}
