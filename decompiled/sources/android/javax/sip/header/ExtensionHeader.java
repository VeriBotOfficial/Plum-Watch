package android.javax.sip.header;

import java.text.ParseException;

/* loaded from: classes.dex */
public interface ExtensionHeader extends Header {
    String getValue();

    void setValue(String str) throws ParseException;
}
