package android.javax.sip;

import android.javax.sip.message.Request;

/* loaded from: classes.dex */
public interface ClientTransaction extends Transaction {
    Request createAck() throws SipException;

    Request createCancel() throws SipException;

    void sendRequest() throws SipException;
}
