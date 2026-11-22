package android.gov.nist.javax.sip;

import android.javax.sip.ClientTransaction;
import android.javax.sip.Dialog;
import android.javax.sip.address.Hop;

/* loaded from: classes.dex */
public interface ClientTransactionExt extends ClientTransaction, TransactionExt {
    void alertIfStillInCallingStateBy(int i);

    Dialog getDefaultDialog();

    Hop getNextHop();

    boolean isSecure();

    void setNotifyOnRetransmit(boolean z);
}
