package android.javax.sip.header;

import android.javax.sip.address.URI;
import java.text.ParseException;

/* loaded from: classes.dex */
public interface WWWAuthenticateHeader extends Parameters, Header {
    public static final String NAME = "WWW-Authenticate";

    String getAlgorithm();

    String getDomain();

    String getNonce();

    String getOpaque();

    String getQop();

    String getRealm();

    String getScheme();

    URI getURI();

    boolean isStale();

    void setAlgorithm(String str) throws ParseException;

    void setDomain(String str) throws ParseException;

    void setNonce(String str) throws ParseException;

    void setOpaque(String str) throws ParseException;

    void setQop(String str) throws ParseException;

    void setRealm(String str) throws ParseException;

    void setScheme(String str);

    void setStale(boolean z);

    void setURI(URI uri);
}
