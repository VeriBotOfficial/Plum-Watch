package android.javax.sip.header;

import android.javax.sip.InvalidArgumentException;

/* loaded from: classes.dex */
public interface MaxForwardsHeader extends Header {
    public static final String NAME = "Max-Forwards";

    void decrementMaxForwards() throws TooManyHopsException;

    @Override // android.javax.sip.header.Header
    boolean equals(Object obj);

    int getMaxForwards();

    void setMaxForwards(int i) throws InvalidArgumentException;
}
