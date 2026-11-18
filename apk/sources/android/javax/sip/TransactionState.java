package android.javax.sip;

import java.io.ObjectStreamException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class TransactionState implements Serializable {
    public static final int _CALLING = 0;
    public static final int _COMPLETED = 3;
    public static final int _CONFIRMED = 4;
    public static final int _PROCEEDING = 2;
    public static final int _TERMINATED = 5;
    public static final int _TRYING = 1;
    private static int m_size = 6;
    private int m_transactionState;
    private static TransactionState[] m_transStateArray = new TransactionState[6];
    public static final TransactionState CALLING = new TransactionState(0);
    public static final TransactionState TRYING = new TransactionState(1);
    public static final TransactionState PROCEEDING = new TransactionState(2);
    public static final TransactionState COMPLETED = new TransactionState(3);
    public static final TransactionState CONFIRMED = new TransactionState(4);
    public static final TransactionState TERMINATED = new TransactionState(5);

    private TransactionState(int r2) {
        this.m_transactionState = r2;
        m_transStateArray[r2] = this;
    }

    public static TransactionState getObject(int r1) {
        if (r1 >= 0 && r1 < m_size) {
            return m_transStateArray[r1];
        }
        throw new IllegalArgumentException("Invalid transactionState value");
    }

    public int getValue() {
        return this.m_transactionState;
    }

    private Object readResolve() throws ObjectStreamException {
        return m_transStateArray[this.m_transactionState];
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof TransactionState) && ((TransactionState) obj).m_transactionState == this.m_transactionState;
    }

    public int hashCode() {
        return this.m_transactionState;
    }

    public String toString() {
        int r0 = this.m_transactionState;
        if (r0 == 0) {
            return "Calling Transaction";
        }
        if (r0 == 1) {
            return "Trying Transaction";
        }
        if (r0 == 2) {
            return "Proceeding Transaction";
        }
        if (r0 == 3) {
            return "Completed Transaction";
        }
        if (r0 == 4) {
            return "Confirmed Transaction";
        }
        if (r0 == 5) {
            return "Terminated Transaction";
        }
        return "Error while printing Transaction State";
    }
}
