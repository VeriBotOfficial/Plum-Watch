package android.gov.nist.javax.sip.header;

import android.javax.sip.header.PriorityHeader;
import java.text.ParseException;

/* loaded from: classes.dex */
public class Priority extends SIPHeader implements PriorityHeader {
    public static final String EMERGENCY = "emergency";
    public static final String NON_URGENT = "non-urgent";
    public static final String NORMAL = "normal";
    public static final String URGENT = "urgent";
    private static final long serialVersionUID = 3837543366074322106L;
    protected String priority;

    public Priority() {
        super("Priority");
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
        return sb.append(this.priority);
    }

    @Override // android.javax.sip.header.PriorityHeader
    public String getPriority() {
        return this.priority;
    }

    @Override // android.javax.sip.header.PriorityHeader
    public void setPriority(String str) throws ParseException {
        if (str == null) {
            throw new NullPointerException("JAIN-SIP Exception,Priority, setPriority(), the priority parameter is null");
        }
        this.priority = str;
    }
}
