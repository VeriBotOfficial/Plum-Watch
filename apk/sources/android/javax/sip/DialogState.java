package android.javax.sip;

import java.io.ObjectStreamException;
import java.io.Serializable;

/* JADX INFO: loaded from: classes.dex */
public final class DialogState implements Serializable {
    public static final int _COMPLETED = 2;
    public static final int _CONFIRMED = 1;
    public static final int _EARLY = 0;
    public static final int _TERMINATED = 3;
    private static int m_size = 4;
    private int m_dialogState;
    private static DialogState[] m_dialogStateArray = new DialogState[4];
    public static final DialogState EARLY = new DialogState(0);
    public static final DialogState CONFIRMED = new DialogState(1);
    public static final DialogState COMPLETED = new DialogState(2);
    public static final DialogState TERMINATED = new DialogState(3);

    private DialogState(int r2) {
        this.m_dialogState = r2;
        m_dialogStateArray[r2] = this;
    }

    public static DialogState getObject(int r1) {
        if (r1 >= 0 && r1 < m_size) {
            return m_dialogStateArray[r1];
        }
        throw new IllegalArgumentException("Invalid dialogState value");
    }

    public int getValue() {
        return this.m_dialogState;
    }

    private Object readResolve() throws ObjectStreamException {
        return m_dialogStateArray[this.m_dialogState];
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        return (obj instanceof DialogState) && ((DialogState) obj).m_dialogState == this.m_dialogState;
    }

    public int hashCode() {
        return this.m_dialogState;
    }

    public String toString() {
        int r0 = this.m_dialogState;
        if (r0 == 0) {
            return "Early Dialog";
        }
        if (r0 == 1) {
            return "Confirmed Dialog";
        }
        if (r0 == 2) {
            return "Completed Dialog";
        }
        if (r0 == 3) {
            return "Terminated Dialog";
        }
        return "Error while printing Dialog State";
    }
}
