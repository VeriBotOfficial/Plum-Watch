package android.gov.nist.javax.sdp.fields;

import android.javax.sdp.SdpException;
import android.javax.sdp.SdpFactory;
import android.javax.sdp.SdpParseException;
import android.javax.sdp.Time;
import java.util.Date;

/* loaded from: classes.dex */
public class TimeField extends SDPField implements Time {
    protected long startTime;
    protected long stopTime;

    @Override // android.javax.sdp.Time
    public boolean getTypedTime() {
        return false;
    }

    @Override // android.javax.sdp.Time
    public void setTypedTime(boolean z) {
    }

    public TimeField() {
        super(SDPFieldNames.TIME_FIELD);
    }

    public long getStartTime() {
        return this.startTime;
    }

    public long getStopTime() {
        return this.stopTime;
    }

    public void setStartTime(long j) {
        this.startTime = j;
    }

    public void setStopTime(long j) {
        this.stopTime = j;
    }

    @Override // android.javax.sdp.Time
    public Date getStart() throws SdpParseException {
        return SdpFactory.getDateFromNtp(this.startTime);
    }

    @Override // android.javax.sdp.Time
    public Date getStop() throws SdpParseException {
        return SdpFactory.getDateFromNtp(this.stopTime);
    }

    @Override // android.javax.sdp.Time
    public void setStop(Date date) throws SdpException {
        if (date == null) {
            throw new SdpException("The date is null");
        }
        this.stopTime = SdpFactory.getNtpTime(date);
    }

    @Override // android.javax.sdp.Time
    public void setStart(Date date) throws SdpException {
        if (date == null) {
            throw new SdpException("The date is null");
        }
        this.startTime = SdpFactory.getNtpTime(date);
    }

    @Override // android.javax.sdp.Time
    public boolean isZero() {
        return getStartTime() == 0 && getStopTime() == 0;
    }

    @Override // android.javax.sdp.Time
    public void setZero() {
        setStopTime(0L);
        setStartTime(0L);
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPField, android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public String encode() {
        return SDPFieldNames.TIME_FIELD + this.startTime + " " + this.stopTime + "\r\n";
    }
}
