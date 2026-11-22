package android.javax.sip.header;

import android.javax.sip.InvalidArgumentException;

/* loaded from: classes.dex */
public interface MimeVersionHeader extends Header {
    public static final String NAME = "MIME-Version";

    int getMajorVersion();

    int getMinorVersion();

    void setMajorVersion(int i) throws InvalidArgumentException;

    void setMinorVersion(int i) throws InvalidArgumentException;
}
