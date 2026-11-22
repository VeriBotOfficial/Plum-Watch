package android.javax.sip;

import android.javax.sip.message.Request;
import java.util.EventObject;

/* loaded from: classes.dex */
public class RequestEvent extends EventObject {
    private Dialog m_dialog;
    private Request m_request;
    private ServerTransaction m_transaction;

    public RequestEvent(Object obj, ServerTransaction serverTransaction, Dialog dialog, Request request) {
        super(obj);
        this.m_transaction = serverTransaction;
        this.m_request = request;
        this.m_dialog = dialog;
    }

    public ServerTransaction getServerTransaction() {
        return this.m_transaction;
    }

    public Request getRequest() {
        return this.m_request;
    }

    public Dialog getDialog() {
        return this.m_dialog;
    }
}
