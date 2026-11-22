package android.javax.sip.header;

import android.javax.sip.InvalidArgumentException;
import java.util.Locale;

/* loaded from: classes.dex */
public interface AcceptLanguageHeader extends Parameters, Header {
    public static final String NAME = "Accept-Language";

    Locale getAcceptLanguage();

    float getQValue();

    void setAcceptLanguage(Locale locale);

    void setQValue(float f) throws InvalidArgumentException;
}
