package android.javax.sip.header;

import java.util.Locale;

/* loaded from: classes.dex */
public interface ContentLanguageHeader extends Header {
    public static final String NAME = "Content-Language";

    Locale getContentLanguage();

    void setContentLanguage(Locale locale);
}
