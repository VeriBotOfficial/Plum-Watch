package android.javax.sip;

import java.io.ObjectStreamException;
import java.io.Serializable;

/* loaded from: classes.dex */
public final class Timeout implements Serializable {
    public static final int _RETRANSMIT = 0;
    public static final int _TRANSACTION = 1;
    private static int m_size = 2;
    private int m_timeout;
    private static Timeout[] m_timeoutArray = new Timeout[2];
    public static final Timeout RETRANSMIT = new Timeout(0);
    public static final Timeout TRANSACTION = new Timeout(1);

    private Timeout(int i) {
        this.m_timeout = i;
        m_timeoutArray[i] = this;
    }

    public Timeout getObject(int i) {
        if (i >= 0 && i < m_size) {
            return m_timeoutArray[i];
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
        int i = this.m_timeout;
        if (i == 0) {
            return "Retransmission Timeout";
        }
        if (i == 1) {
            return "Transaction Timeout";
        }
        return "Error while printing Timeout";
    }
}
