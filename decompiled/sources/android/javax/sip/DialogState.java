package android.javax.sip;

import java.io.ObjectStreamException;
import java.io.Serializable;

/* loaded from: classes.dex */
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

    private DialogState(int i) {
        this.m_dialogState = i;
        m_dialogStateArray[i] = this;
    }

    public static DialogState getObject(int i) {
        if (i >= 0 && i < m_size) {
            return m_dialogStateArray[i];
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
        int i = this.m_dialogState;
        if (i == 0) {
            return "Early Dialog";
        }
        if (i == 1) {
            return "Confirmed Dialog";
        }
        if (i == 2) {
            return "Completed Dialog";
        }
        if (i == 3) {
            return "Terminated Dialog";
        }
        return "Error while printing Dialog State";
    }
}
