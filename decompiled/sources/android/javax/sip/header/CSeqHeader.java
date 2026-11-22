package android.javax.sip.header;

import android.javax.sip.InvalidArgumentException;
import java.text.ParseException;

/* loaded from: classes.dex */
public interface CSeqHeader extends Header {
    public static final String NAME = "CSeq";

    @Override // android.javax.sip.header.Header
    boolean equals(Object obj);

    String getMethod();

    long getSeqNumber();

    int getSequenceNumber();

    void setMethod(String str) throws ParseException;

    void setSeqNumber(long j) throws InvalidArgumentException;

    void setSequenceNumber(int i) throws InvalidArgumentException;
}
