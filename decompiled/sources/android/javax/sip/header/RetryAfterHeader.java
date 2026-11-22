package android.javax.sip.header;

import android.javax.sip.InvalidArgumentException;
import java.text.ParseException;

/* loaded from: classes.dex */
public interface RetryAfterHeader extends Header, Parameters {
    public static final String NAME = "Retry-After";

    String getComment();

    int getDuration();

    int getRetryAfter();

    void setComment(String str) throws ParseException;

    void setDuration(int i) throws InvalidArgumentException;

    void setRetryAfter(int i) throws InvalidArgumentException;
}
