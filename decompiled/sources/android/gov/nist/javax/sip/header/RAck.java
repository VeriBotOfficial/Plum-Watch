package android.gov.nist.javax.sip.header;

import android.javax.sip.InvalidArgumentException;
import android.javax.sip.header.RAckHeader;
import java.text.ParseException;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* loaded from: classes.dex */
public class RAck extends SIPHeader implements RAckHeader {
    private static final long serialVersionUID = 743999286077404118L;
    protected long cSeqNumber;
    protected String method;
    protected long rSeqNumber;

    public RAck() {
        super("RAck");
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
        return sb.append(this.rSeqNumber).append(" ").append(this.cSeqNumber).append(" ").append(this.method);
    }

    @Override // android.javax.sip.header.RAckHeader
    public int getCSeqNumber() {
        return (int) this.cSeqNumber;
    }

    public long getCSeqNumberLong() {
        return this.cSeqNumber;
    }

    @Override // android.javax.sip.header.RAckHeader
    public String getMethod() {
        return this.method;
    }

    @Override // android.javax.sip.header.RAckHeader
    public int getRSeqNumber() {
        return (int) this.rSeqNumber;
    }

    @Override // android.javax.sip.header.RAckHeader
    public void setCSeqNumber(int i) throws InvalidArgumentException {
        setCSequenceNumber(i);
    }

    @Override // android.javax.sip.header.RAckHeader
    public void setMethod(String str) throws ParseException {
        this.method = str;
    }

    public long getCSequenceNumber() {
        return this.cSeqNumber;
    }

    public long getRSequenceNumber() {
        return this.rSeqNumber;
    }

    public void setCSequenceNumber(long j) throws InvalidArgumentException {
        if (j <= 0 || j > IjkMediaMeta.AV_CH_WIDE_LEFT) {
            throw new InvalidArgumentException("Bad CSeq # " + j);
        }
        this.cSeqNumber = j;
    }

    @Override // android.javax.sip.header.RAckHeader
    public void setRSeqNumber(int i) throws InvalidArgumentException {
        setRSequenceNumber(i);
    }

    public void setRSequenceNumber(long j) throws InvalidArgumentException {
        if (j <= 0 || this.cSeqNumber > IjkMediaMeta.AV_CH_WIDE_LEFT) {
            throw new InvalidArgumentException("Bad rSeq # " + j);
        }
        this.rSeqNumber = j;
    }
}
