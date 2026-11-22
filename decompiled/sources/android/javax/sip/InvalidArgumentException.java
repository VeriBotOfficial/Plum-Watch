package android.javax.sip;

/* loaded from: classes.dex */
public class InvalidArgumentException extends Exception {
    protected Throwable m_Cause;

    public InvalidArgumentException() {
        this.m_Cause = null;
    }

    public InvalidArgumentException(String str) {
        super(str);
        this.m_Cause = null;
    }

    public InvalidArgumentException(String str, Throwable th) {
        super(str);
        this.m_Cause = th;
    }

    @Override // java.lang.Throwable
    public Throwable getCause() {
        return this.m_Cause;
    }
}
