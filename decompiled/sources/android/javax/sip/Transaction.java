package android.javax.sip;

import android.javax.sip.message.Request;
import java.io.Serializable;

/* loaded from: classes.dex */
public interface Transaction extends Serializable {
    Object getApplicationData();

    String getBranchId();

    Dialog getDialog();

    Request getRequest();

    int getRetransmitTimer() throws UnsupportedOperationException;

    TransactionState getState();

    void setApplicationData(Object obj);

    void setRetransmitTimer(int i) throws UnsupportedOperationException;

    void terminate() throws ObjectInUseException;
}
