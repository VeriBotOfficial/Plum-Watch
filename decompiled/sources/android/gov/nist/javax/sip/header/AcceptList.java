package android.gov.nist.javax.sip.header;

/* loaded from: classes.dex */
public class AcceptList extends SIPHeaderList<Accept> {
    private static final long serialVersionUID = -1800813338560484831L;

    @Override // android.gov.nist.javax.sip.header.SIPHeaderList, android.gov.nist.core.GenericObject
    public Object clone() {
        AcceptList acceptList = new AcceptList();
        acceptList.clonehlist(this.hlist);
        return acceptList;
    }

    public AcceptList() {
        super(Accept.class, "Accept");
    }
}
