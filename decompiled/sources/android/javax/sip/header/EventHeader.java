package android.javax.sip.header;

import java.text.ParseException;

/* loaded from: classes.dex */
public interface EventHeader extends Parameters, Header {
    public static final String NAME = "Event";

    String getEventId();

    String getEventType();

    void setEventId(String str) throws ParseException;

    void setEventType(String str) throws ParseException;
}
