package android.javax.sip.header;

import android.javax.sip.InvalidArgumentException;

/* loaded from: classes.dex */
public interface ContactHeader extends HeaderAddress, Parameters, Header {
    public static final String NAME = "Contact";

    int getExpires();

    float getQValue();

    boolean isWildCard();

    void setExpires(int i) throws InvalidArgumentException;

    void setQValue(float f) throws InvalidArgumentException;

    void setWildCard();
}
