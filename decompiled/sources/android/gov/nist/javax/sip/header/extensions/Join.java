package android.gov.nist.javax.sip.header.extensions;

import android.gov.nist.javax.sip.header.CallIdentifier;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.header.ParametersHeader;
import android.javax.sip.header.ExtensionHeader;
import java.text.ParseException;

/* loaded from: classes.dex */
public class Join extends ParametersHeader implements ExtensionHeader, JoinHeader {
    public static final String NAME = "Join";
    private static final long serialVersionUID = -840116548918120056L;
    public String callId;
    public CallIdentifier callIdentifier;

    public Join() {
        super("Join");
    }

    public Join(String str) throws IllegalArgumentException {
        super("Join");
        this.callIdentifier = new CallIdentifier(str);
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
        String str = this.callId;
        if (str != null) {
            sb.append(str);
            if (!this.parameters.isEmpty()) {
                sb.append(";");
                this.parameters.encode(sb);
            }
        }
        return sb;
    }

    @Override // android.gov.nist.javax.sip.header.extensions.JoinHeader
    public String getCallId() {
        return this.callId;
    }

    public CallIdentifier getCallIdentifer() {
        return this.callIdentifier;
    }

    @Override // android.gov.nist.javax.sip.header.extensions.JoinHeader
    public void setCallId(String str) {
        this.callId = str;
    }

    public void setCallIdentifier(CallIdentifier callIdentifier) {
        this.callIdentifier = callIdentifier;
    }

    @Override // android.gov.nist.javax.sip.header.extensions.JoinHeader
    public String getToTag() {
        if (this.parameters == null) {
            return null;
        }
        return getParameter(ParameterNames.TO_TAG);
    }

    @Override // android.gov.nist.javax.sip.header.extensions.JoinHeader
    public void setToTag(String str) throws ParseException {
        if (str == null) {
            throw new NullPointerException("null tag ");
        }
        if (str.trim().equals("")) {
            throw new ParseException("bad tag", 0);
        }
        setParameter(ParameterNames.TO_TAG, str);
    }

    public boolean hasToTag() {
        return hasParameter(ParameterNames.TO_TAG);
    }

    public void removeToTag() {
        this.parameters.delete(ParameterNames.TO_TAG);
    }

    @Override // android.gov.nist.javax.sip.header.extensions.JoinHeader
    public String getFromTag() {
        if (this.parameters == null) {
            return null;
        }
        return getParameter(ParameterNames.FROM_TAG);
    }

    @Override // android.gov.nist.javax.sip.header.extensions.JoinHeader
    public void setFromTag(String str) throws ParseException {
        if (str == null) {
            throw new NullPointerException("null tag ");
        }
        if (str.trim().equals("")) {
            throw new ParseException("bad tag", 0);
        }
        setParameter(ParameterNames.FROM_TAG, str);
    }

    public boolean hasFromTag() {
        return hasParameter(ParameterNames.FROM_TAG);
    }

    public void removeFromTag() {
        this.parameters.delete(ParameterNames.FROM_TAG);
    }

    @Override // android.javax.sip.header.ExtensionHeader
    public void setValue(String str) throws ParseException {
        throw new ParseException(str, 0);
    }
}
