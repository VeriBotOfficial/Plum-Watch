package android.javax.sip.header;

import java.text.ParseException;

/* loaded from: classes.dex */
public interface SubjectHeader extends Header {
    public static final String NAME = "Subject";

    String getSubject();

    void setSubject(String str) throws ParseException;
}
