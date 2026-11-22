package android.javax.sip.header;

import java.text.ParseException;

/* loaded from: classes.dex */
public interface SIPIfMatchHeader extends Header {
    public static final String NAME = "SIP-If-Match";

    String getETag();

    void setETag(String str) throws ParseException;
}
