package android.gov.nist.javax.sip.header;

import android.gov.nist.javax.sip.Utils;
import android.javax.sip.InvalidArgumentException;
import android.javax.sip.header.ReasonHeader;
import java.text.ParseException;

/* loaded from: classes.dex */
public class Reason extends ParametersHeader implements ReasonHeader {
    private static final long serialVersionUID = -8903376965568297388L;
    public final String CAUSE;
    public final String TEXT;
    protected String protocol;

    @Override // android.javax.sip.header.ReasonHeader
    public int getCause() {
        return getParameterAsInt(ParameterNames.CAUSE);
    }

    @Override // android.javax.sip.header.ReasonHeader
    public void setCause(int i) throws InvalidArgumentException {
        this.parameters.set(ParameterNames.CAUSE, Integer.valueOf(i));
    }

    @Override // android.javax.sip.header.ReasonHeader
    public void setProtocol(String str) throws ParseException {
        this.protocol = str;
    }

    @Override // android.javax.sip.header.ReasonHeader
    public String getProtocol() {
        return this.protocol;
    }

    @Override // android.javax.sip.header.ReasonHeader
    public void setText(String str) throws ParseException {
        if (str == null || str.trim().length() <= 0) {
            return;
        }
        if (str.charAt(0) != '\"') {
            str = Utils.getQuotedString(str);
        }
        this.parameters.set("text", str);
    }

    @Override // android.javax.sip.header.ReasonHeader
    public String getText() {
        return this.parameters.getParameter("text");
    }

    public Reason() {
        super("Reason");
        this.TEXT = "text";
        this.CAUSE = ParameterNames.CAUSE;
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader, android.javax.sip.header.Header
    public String getName() {
        return "Reason";
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
        sb.append(this.protocol);
        if (this.parameters == null || this.parameters.isEmpty()) {
            return sb;
        }
        return this.parameters.encode(sb.append(";"));
    }
}
