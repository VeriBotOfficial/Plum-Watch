package android.gov.nist.javax.sdp.fields;

/* loaded from: classes.dex */
public class ZoneAdjustment extends SDPObject {
    protected TypedTime offset;
    protected String sign;
    protected long time;

    public void setTime(long j) {
        this.time = j;
    }

    public long getTime() {
        return this.time;
    }

    public TypedTime getOffset() {
        return this.offset;
    }

    public void setOffset(TypedTime typedTime) {
        this.offset = typedTime;
    }

    public void setSign(String str) {
        this.sign = str;
    }

    @Override // android.gov.nist.javax.sdp.fields.SDPObject, android.gov.nist.core.GenericObject
    public String encode() {
        String str = Long.toString(this.time) + " ";
        if (this.sign != null) {
            str = str + this.sign;
        }
        return str + this.offset.encode();
    }

    @Override // android.gov.nist.core.GenericObject
    public Object clone() {
        ZoneAdjustment zoneAdjustment = (ZoneAdjustment) super.clone();
        TypedTime typedTime = this.offset;
        if (typedTime != null) {
            zoneAdjustment.offset = (TypedTime) typedTime.clone();
        }
        return zoneAdjustment;
    }
}
