package android.javax.sip.header;

import java.text.ParseException;

/* loaded from: classes.dex */
public interface SIPETagHeader extends Header {
    public static final String NAME = "SIP-ETag";

    String getETag();

    void setETag(String str) throws ParseException;
}
