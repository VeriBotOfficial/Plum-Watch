package android.gov.nist.javax.sdp;

import android.gov.nist.javax.sdp.fields.RepeatField;
import android.gov.nist.javax.sdp.fields.TimeField;
import android.javax.sdp.SdpException;
import android.javax.sdp.Time;
import android.javax.sdp.TimeDescription;
import java.util.Vector;

/* loaded from: classes.dex */
public class TimeDescriptionImpl implements TimeDescription {
    private Vector repeatList;
    private TimeField timeImpl;

    public TimeDescriptionImpl() {
        this.timeImpl = new TimeField();
        this.repeatList = new Vector();
    }

    public TimeDescriptionImpl(TimeField timeField) {
        this.timeImpl = timeField;
        this.repeatList = new Vector();
    }

    @Override // android.javax.sdp.TimeDescription
    public Time getTime() {
        return this.timeImpl;
    }

    @Override // android.javax.sdp.TimeDescription
    public void setTime(Time time) throws SdpException {
        if (time == null) {
            throw new SdpException("The parameter is null");
        }
        if (time instanceof TimeField) {
            this.timeImpl = (TimeField) time;
            return;
        }
        throw new SdpException("The parameter is not an instance of TimeField");
    }

    @Override // android.javax.sdp.TimeDescription
    public Vector getRepeatTimes(boolean z) {
        return this.repeatList;
    }

    @Override // android.javax.sdp.TimeDescription
    public void setRepeatTimes(Vector vector) throws SdpException {
        this.repeatList = vector;
    }

    public void addRepeatField(RepeatField repeatField) {
        if (repeatField == null) {
            throw new NullPointerException("null repeatField");
        }
        this.repeatList.add(repeatField);
    }

    public String toString() {
        String encode = this.timeImpl.encode();
        for (int i = 0; i < this.repeatList.size(); i++) {
            encode = encode + ((RepeatField) this.repeatList.elementAt(i)).encode();
        }
        return encode;
    }
}
