package android.gov.nist.javax.sip.header;

import android.javax.sip.InvalidArgumentException;
import android.javax.sip.header.RSeqHeader;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* loaded from: classes.dex */
public class RSeq extends SIPHeader implements RSeqHeader {
    private static final long serialVersionUID = 8765762413224043394L;
    protected long sequenceNumber;

    public RSeq() {
        super("RSeq");
    }

    @Override // android.javax.sip.header.RSeqHeader
    public int getSequenceNumber() {
        return (int) this.sequenceNumber;
    }

    @Override // android.gov.nist.javax.sip.header.SIPHeader
    public StringBuilder encodeBody(StringBuilder sb) {
        return sb.append(Long.toString(this.sequenceNumber));
    }

    public long getSeqNumber() {
        return this.sequenceNumber;
    }

    public void setSeqNumber(long j) throws InvalidArgumentException {
        if (j <= 0 || j > IjkMediaMeta.AV_CH_WIDE_LEFT) {
            throw new InvalidArgumentException("Bad seq number " + j);
        }
        this.sequenceNumber = j;
    }

    @Override // android.javax.sip.header.RSeqHeader
    public void setSequenceNumber(int i) throws InvalidArgumentException {
        setSeqNumber(i);
    }
}
