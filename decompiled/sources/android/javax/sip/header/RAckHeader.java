package android.javax.sip.header;

import android.javax.sip.InvalidArgumentException;
import java.text.ParseException;

/* loaded from: classes.dex */
public interface RAckHeader extends Header {
    public static final String NAME = "RAck";

    int getCSeqNumber();

    String getMethod();

    int getRSeqNumber();

    void setCSeqNumber(int i) throws InvalidArgumentException;

    void setMethod(String str) throws ParseException;

    void setRSeqNumber(int i) throws InvalidArgumentException;
}
