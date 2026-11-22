package android.javax.sip.header;

import android.javax.sip.InvalidArgumentException;

/* loaded from: classes.dex */
public interface AcceptEncodingHeader extends Parameters, Encoding, Header {
    public static final String NAME = "Accept-Encoding";

    float getQValue();

    void setQValue(float f) throws InvalidArgumentException;
}
