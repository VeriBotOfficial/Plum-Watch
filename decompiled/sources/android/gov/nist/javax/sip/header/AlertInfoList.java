package android.gov.nist.javax.sip.header;

/* loaded from: classes.dex */
public class AlertInfoList extends SIPHeaderList<AlertInfo> {
    private static final long serialVersionUID = 1;

    @Override // android.gov.nist.javax.sip.header.SIPHeaderList, android.gov.nist.core.GenericObject
    public Object clone() {
        AlertInfoList alertInfoList = new AlertInfoList();
        alertInfoList.clonehlist(this.hlist);
        return alertInfoList;
    }

    public AlertInfoList() {
        super(AlertInfo.class, "Alert-Info");
    }
}
