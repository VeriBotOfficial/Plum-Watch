package android.gov.nist.javax.sip.header;

/* loaded from: classes.dex */
public class AcceptEncodingList extends SIPHeaderList<AcceptEncoding> {
    @Override // android.gov.nist.javax.sip.header.SIPHeaderList, android.gov.nist.core.GenericObject
    public Object clone() {
        AcceptEncodingList acceptEncodingList = new AcceptEncodingList();
        acceptEncodingList.clonehlist(this.hlist);
        return acceptEncodingList;
    }

    public AcceptEncodingList() {
        super(AcceptEncoding.class, "Accept-Encoding");
    }
}
