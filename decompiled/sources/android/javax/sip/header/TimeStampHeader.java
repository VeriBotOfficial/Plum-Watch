package android.javax.sip.header;

import android.javax.sip.InvalidArgumentException;

/* loaded from: classes.dex */
public interface TimeStampHeader extends Header {
    public static final String NAME = "Timestamp";

    float getDelay();

    long getTime();

    int getTimeDelay();

    float getTimeStamp();

    void setDelay(float f) throws InvalidArgumentException;

    void setTime(long j) throws InvalidArgumentException;

    void setTimeDelay(int i) throws InvalidArgumentException;

    void setTimeStamp(float f) throws InvalidArgumentException;
}
