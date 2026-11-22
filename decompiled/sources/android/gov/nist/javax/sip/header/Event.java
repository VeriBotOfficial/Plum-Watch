package android.gov.nist.javax.sip.header;

import android.javax.sip.header.EventHeader;
import java.text.ParseException;

/* loaded from: classes.dex */
public class Event extends ParametersHeader implements EventHeader {
    private static final long serialVersionUID = -6458387810431874841L;
    protected String eventType;

    public Event() {
        super("Event");
    }

    @Override // android.javax.sip.header.EventHeader
    public void setEventType(String str) throws ParseException {
        if (str == null) {
            throw new NullPointerException(" the eventType is null");
        }
        this.eventType = str;
    }

    @Override // android.javax.sip.header.EventHeader
    public String getEventType() {
        return this.eventType;
    }

    @Override // android.javax.sip.header.EventHeader
    public void setEventId(String str) throws ParseException {
        if (str == null) {
            throw new NullPointerException(" the eventId parameter is null");
        }
        setParameter("id", str);
    }

    @Override // android.javax.sip.header.EventHeader
    public String getEventId() {
        return getParameter("id");
    }

    public String encodeBody() {
        return encodeBody(new StringBuilder()).toString();
    }

    @Override // android.gov.nist.javax.sip.header.ParametersHeader, android.gov.nist.javax.sip.header.SIPHeader
    protected StringBuilder encodeBody(StringBuilder sb) {
        String str = this.eventType;
        if (str != null) {
            sb.append(str);
        }
        if (!this.parameters.isEmpty()) {
            sb.append(";");
            this.parameters.encode(sb);
        }
        return sb;
    }

    public boolean match(Event event) {
        String str = event.eventType;
        if (str == null && this.eventType != null) {
            return false;
        }
        if (str != null && this.eventType == null) {
            return false;
        }
        if (this.eventType == null && str == null) {
            return false;
        }
        if (getEventId() != null || event.getEventId() == null) {
            return (getEventId() == null || event.getEventId() != null) && event.eventType.equalsIgnoreCase(this.eventType) && (getEventId() == event.getEventId() || getEventId().equalsIgnoreCase(event.getEventId()));
        }
        return false;
    }
}
