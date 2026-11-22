package android.gov.nist.javax.sip.header;

import android.javax.sip.InvalidArgumentException;
import android.javax.sip.header.MaxForwardsHeader;
import android.javax.sip.header.TooManyHopsException;

/* loaded from: classes.dex */
public class MaxForwards extends SIPHeader implements MaxForwardsHeader {
    private static final long serialVersionUID = -3096874323347175943L;
    protected int maxForwards;

    public MaxForwards() {
        super("Max-Forwards");
    }

    public MaxForwards(int i) throws InvalidArgumentException {
        super("Max-Forwards");
        setMaxForwards(i);
    }

    @Override // android.javax.sip.header.MaxForwardsHeader
    public int getMaxForwards() {
        return this.maxForwards;
    }

    @Override // android.javax.sip.header.MaxForwardsHeader
    public void setMaxForwards(int i) throws InvalidArgumentException {
        if (i < 0 || i > 255) {
            throw new InvalidArgumentException("bad max forwards value " + i);
        }
        this.maxForwards = i;
    }

    public String encodeBody() {
        return encodeBody(new StringBuilder()).toString();
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    protected StringBuilder encodeBody(StringBuilder sb) {
        return sb.append(this.maxForwards);
    }

    public boolean hasReachedZero() {
        return this.maxForwards == 0;
    }

    @Override // android.javax.sip.header.MaxForwardsHeader
    public void decrementMaxForwards() throws TooManyHopsException {
        int i = this.maxForwards;
        if (i > 0) {
            this.maxForwards = i - 1;
            return;
        }
        throw new TooManyHopsException("has already reached 0!");
    }

    @Override // android.gov.nist.javax.sip.header.SIPObject, android.gov.nist.core.GenericObject
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MaxForwardsHeader) && getMaxForwards() == ((MaxForwardsHeader) obj).getMaxForwards();
    }
}
