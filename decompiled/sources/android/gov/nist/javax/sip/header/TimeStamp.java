package android.gov.nist.javax.sip.header;

import android.javax.sip.InvalidArgumentException;
import android.javax.sip.header.TimeStampHeader;

/* loaded from: classes.dex */
public class TimeStamp extends SIPHeader implements TimeStampHeader {
    private static final long serialVersionUID = -3711322366481232720L;
    protected int delay;
    protected float delayFloat;
    protected long timeStamp;
    private float timeStampFloat;

    public TimeStamp() {
        super("Timestamp");
        this.timeStamp = -1L;
        this.delayFloat = -1.0f;
        this.timeStampFloat = -1.0f;
        this.delay = -1;
    }

    private String getTimeStampAsString() {
        long j = this.timeStamp;
        if (j == -1 && this.timeStampFloat == -1.0f) {
            return "";
        }
        if (j != -1) {
            return Long.toString(j);
        }
        return Float.toString(this.timeStampFloat);
    }

    private String getDelayAsString() {
        int i = this.delay;
        if (i == -1 && this.delayFloat == -1.0f) {
            return "";
        }
        if (i != -1) {
            return Integer.toString(i);
        }
        return Float.toString(this.delayFloat);
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
        String timeStampAsString = getTimeStampAsString();
        String delayAsString = getDelayAsString();
        if (timeStampAsString.equals("") && delayAsString.equals("")) {
            return sb.append("");
        }
        if (!timeStampAsString.equals("")) {
            sb.append(timeStampAsString);
        }
        if (!delayAsString.equals("")) {
            sb.append(" ").append(delayAsString);
        }
        return sb;
    }

    public boolean hasDelay() {
        return this.delay != -1;
    }

    public void removeDelay() {
        this.delay = -1;
    }

    @Override // android.javax.sip.header.TimeStampHeader
    public void setTimeStamp(float f) throws InvalidArgumentException {
        if (f < 0.0f) {
            throw new InvalidArgumentException("JAIN-SIP Exception, TimeStamp, setTimeStamp(), the timeStamp parameter is <0");
        }
        this.timeStamp = -1L;
        this.timeStampFloat = f;
    }

    @Override // android.javax.sip.header.TimeStampHeader
    public float getTimeStamp() {
        float f = this.timeStampFloat;
        return f == -1.0f ? Float.valueOf(this.timeStamp).floatValue() : f;
    }

    @Override // android.javax.sip.header.TimeStampHeader
    public float getDelay() {
        float f = this.delayFloat;
        return f == -1.0f ? Float.valueOf(this.delay).floatValue() : f;
    }

    @Override // android.javax.sip.header.TimeStampHeader
    public void setDelay(float f) throws InvalidArgumentException {
        if (f < 0.0f && f != -1.0f) {
            throw new InvalidArgumentException("JAIN-SIP Exception, TimeStamp, setDelay(), the delay parameter is <0");
        }
        this.delayFloat = f;
        this.delay = -1;
    }

    @Override // android.javax.sip.header.TimeStampHeader
    public long getTime() {
        long j = this.timeStamp;
        return j == -1 ? (long) this.timeStampFloat : j;
    }

    @Override // android.javax.sip.header.TimeStampHeader
    public int getTimeDelay() {
        int i = this.delay;
        return i == -1 ? (int) this.delayFloat : i;
    }

    @Override // android.javax.sip.header.TimeStampHeader
    public void setTime(long j) throws InvalidArgumentException {
        if (j < -1) {
            throw new InvalidArgumentException("Illegal timestamp");
        }
        this.timeStamp = j;
        this.timeStampFloat = -1.0f;
    }

    @Override // android.javax.sip.header.TimeStampHeader
    public void setTimeDelay(int i) throws InvalidArgumentException {
        if (i < -1) {
            throw new InvalidArgumentException("Value out of range " + i);
        }
        this.delay = i;
        this.delayFloat = -1.0f;
    }
}
