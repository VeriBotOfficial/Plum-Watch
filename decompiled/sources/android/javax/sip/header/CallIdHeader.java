package android.javax.sip.header;

import java.text.ParseException;

/* loaded from: classes.dex */
public interface CallIdHeader extends Header {
    public static final String NAME = "Call-ID";

    @Override // android.javax.sip.header.Header
    boolean equals(Object obj);

    String getCallId();

    void setCallId(String str) throws ParseException;
}
