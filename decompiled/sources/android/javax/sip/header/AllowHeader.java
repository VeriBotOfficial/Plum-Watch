package android.javax.sip.header;

import java.text.ParseException;

/* loaded from: classes.dex */
public interface AllowHeader extends Header {
    public static final String NAME = "Allow";

    String getMethod();

    void setMethod(String str) throws ParseException;
}
