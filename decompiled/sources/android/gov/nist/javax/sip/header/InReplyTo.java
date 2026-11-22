package android.gov.nist.javax.sip.header;

import android.javax.sip.header.InReplyToHeader;
import java.text.ParseException;

/* loaded from: classes.dex */
public class InReplyTo extends SIPHeader implements InReplyToHeader {
    private static final long serialVersionUID = 1682602905733508890L;
    protected CallIdentifier callId;

    public InReplyTo() {
        super("In-Reply-To");
    }

    public InReplyTo(CallIdentifier callIdentifier) {
        super("In-Reply-To");
        this.callId = callIdentifier;
    }

    @Override // android.javax.sip.header.InReplyToHeader
    public void setCallId(String str) throws ParseException {
        try {
            this.callId = new CallIdentifier(str);
        } catch (Exception e) {
            throw new ParseException(e.getMessage(), 0);
        }
    }

    @Override // android.javax.sip.header.InReplyToHeader
    public String getCallId() {
        CallIdentifier callIdentifier = this.callId;
        if (callIdentifier == null) {
            return null;
        }
        return callIdentifier.encode();
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
        return this.callId.encode(sb);
    }

    @Override // android.gov.nist.core.GenericObject
    public Object clone() {
        InReplyTo inReplyTo = (InReplyTo) super.clone();
        CallIdentifier callIdentifier = this.callId;
        if (callIdentifier != null) {
            inReplyTo.callId = (CallIdentifier) callIdentifier.clone();
        }
        return inReplyTo;
    }
}
