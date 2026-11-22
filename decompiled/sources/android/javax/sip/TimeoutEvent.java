package android.javax.sip;

import java.util.EventObject;

/* loaded from: classes.dex */
public class TimeoutEvent extends EventObject {
    private ClientTransaction m_clientTransaction;
    private boolean m_isServerTransaction;
    private ServerTransaction m_serverTransaction;
    private Timeout m_timeout;

    public TimeoutEvent(Object obj, ServerTransaction serverTransaction, Timeout timeout) {
        super(obj);
        this.m_clientTransaction = null;
        this.m_serverTransaction = serverTransaction;
        this.m_isServerTransaction = true;
        this.m_timeout = timeout;
    }

    public TimeoutEvent(Object obj, ClientTransaction clientTransaction, Timeout timeout) {
        super(obj);
        this.m_serverTransaction = null;
        this.m_clientTransaction = clientTransaction;
        this.m_isServerTransaction = false;
        this.m_timeout = timeout;
    }

    public ServerTransaction getServerTransaction() {
        return this.m_serverTransaction;
    }

    public ClientTransaction getClientTransaction() {
        return this.m_clientTransaction;
    }

    public boolean isServerTransaction() {
        return this.m_isServerTransaction;
    }

    public Timeout getTimeout() {
        return this.m_timeout;
    }
}
