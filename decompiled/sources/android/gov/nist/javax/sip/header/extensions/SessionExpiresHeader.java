package android.gov.nist.javax.sip.header.extensions;

import android.javax.sip.InvalidArgumentException;
import android.javax.sip.header.ExtensionHeader;
import android.javax.sip.header.Header;
import android.javax.sip.header.Parameters;

/* loaded from: classes.dex */
public interface SessionExpiresHeader extends Parameters, Header, ExtensionHeader {
    public static final String NAME = "Session-Expires";

    int getExpires();

    String getRefresher();

    void setExpires(int i) throws InvalidArgumentException;

    void setRefresher(String str);
}
