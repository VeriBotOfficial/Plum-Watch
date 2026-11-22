package android.javax.sip.header;

import android.javax.sip.address.URI;

/* loaded from: classes.dex */
public interface AlertInfoHeader extends Parameters, Header {
    public static final String NAME = "Alert-Info";

    URI getAlertInfo();

    void setAlertInfo(URI uri);
}
