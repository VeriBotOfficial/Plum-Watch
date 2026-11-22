package android.javax.sip.header;

import java.text.ParseException;

/* loaded from: classes.dex */
public interface MediaType {
    String getContentSubType();

    String getContentType();

    void setContentSubType(String str) throws ParseException;

    void setContentType(String str) throws ParseException;
}
