package android.javax.sip.header;

import android.javax.sip.InvalidArgumentException;

/* loaded from: classes.dex */
public interface RSeqHeader extends Header {
    public static final String NAME = "RSeq";

    int getSequenceNumber();

    void setSequenceNumber(int i) throws InvalidArgumentException;
}
