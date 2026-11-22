package android.javax.sip;

import android.javax.sip.message.Response;

/* loaded from: classes.dex */
public interface ServerTransaction extends Transaction {
    void enableRetransmissionAlerts() throws SipException;

    void sendResponse(Response response) throws SipException, InvalidArgumentException;
}
