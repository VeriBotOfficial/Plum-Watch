package android.gov.nist.javax.sip.header;

import android.javax.sip.header.AllowEventsHeader;
import java.text.ParseException;

/* loaded from: classes.dex */
public final class AllowEvents extends SIPHeader implements AllowEventsHeader {
    private static final long serialVersionUID = 617962431813193114L;
    protected String eventType;

    public AllowEvents() {
        super("Allow-Events");
    }

    public AllowEvents(String str) {
        super("Allow-Events");
        this.eventType = str;
    }

    @Override // android.javax.sip.header.AllowEventsHeader
    public void setEventType(String str) throws ParseException {
        if (str == null) {
            throw new NullPointerException("JAIN-SIP Exception,AllowEvents, setEventType(), the eventType parameter is null");
        }
        this.eventType = str;
    }

    @Override // android.javax.sip.header.AllowEventsHeader
    public String getEventType() {
        return this.eventType;
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    protected StringBuilder encodeBody(StringBuilder sb) {
        return sb.append(this.eventType);
    }
}
