package android.javax.sip.header;

import android.javax.sip.InvalidArgumentException;

/* loaded from: classes.dex */
public interface ContentLengthHeader extends Header {
    public static final String NAME = "Content-Length";

    int getContentLength();

    void setContentLength(int i) throws InvalidArgumentException;
}
