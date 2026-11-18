package android.javax.sip;

import java.io.ObjectStreamException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class Timeout implements Serializable {
    public static final int _RETRANSMIT = 0;
    public static final int _TRANSACTION = 1;
    private static int m_size = 2;
    private int m_timeout;
    private static Timeout[] m_timeoutArray = new Timeout[2];
    public static final Timeout RETRANSMIT = new Timeout(0);
    public static final Timeout TRANSACTION = new Timeout(1);

    private Timeout(int r2) {
        this.m_timeout = r2;
        m_timeoutArray[r2] = this;
    }

    public Timeout getObject(int r2) {
        if (r2 >= 0 && r2 < m_size) {
            return m_timeoutArray[r2];
        }
        throw new IllegalArgumentException("Invalid timeout value");
    }

    public int getValue() {
        return this.m_timeout;
    }

    private Object readResolve() throws ObjectStreamException {
        return m_timeoutArray[this.m_timeout];
    }

    public String toString() {
        int r0 = this.m_timeout;
        if (r0 == 0) {
            return "Retransmission Timeout";
        }
        if (r0 == 1) {
            return "Transaction Timeout";
        }
        return "Error while printing Timeout";
    }
}
