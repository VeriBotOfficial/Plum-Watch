package android.gov.nist.javax.sip.header;

import android.javax.sip.header.CallIdHeader;
import java.text.ParseException;

/* loaded from: classes.dex */
public class CallID extends SIPHeader implements CallIdHeader {
    public static final String NAME_LOWER = "Call-ID".toLowerCase();
    private static final long serialVersionUID = -6463630258703731156L;
    protected CallIdentifier callIdentifier;

    public CallID() {
        super("Call-ID");
    }

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof CallIdHeader) {
            return getCallId().equalsIgnoreCase(((CallIdHeader) obj).getCallId());
        }
        return false;
    }

    public String encodeBody() {
        return encodeBody(new StringBuilder()).toString();
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    protected StringBuilder encodeBody(StringBuilder sb) {
        CallIdentifier callIdentifier = this.callIdentifier;
        if (callIdentifier != null) {
            callIdentifier.encode(sb);
        }
        return sb;
    }

    @Override // android.javax.sip.header.CallIdHeader
    public String getCallId() {
        return encodeBody();
    }

    public CallIdentifier getCallIdentifer() {
        return this.callIdentifier;
    }

    @Override // android.javax.sip.header.CallIdHeader
    public void setCallId(String str) throws ParseException {
        try {
            this.callIdentifier = new CallIdentifier(str);
        } catch (IllegalArgumentException unused) {
            throw new ParseException(str, 0);
        }
    }

    public void setCallIdentifier(CallIdentifier callIdentifier) {
        this.callIdentifier = callIdentifier;
    }

    public CallID(String str) throws IllegalArgumentException {
        super("Call-ID");
        this.callIdentifier = new CallIdentifier(str);
    }

    @Override // android.gov.nist.core.GenericObject
    public Object clone() {
        CallID callID = (CallID) super.clone();
        CallIdentifier callIdentifier = this.callIdentifier;
        if (callIdentifier != null) {
            callID.callIdentifier = (CallIdentifier) callIdentifier.clone();
        }
        return callID;
    }
}
