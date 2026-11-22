package android.javax.sdp;

/* loaded from: classes.dex */
public class SdpFactoryException extends SdpException {
    protected Exception ex;

    public SdpFactoryException() {
    }

    public SdpFactoryException(String str) {
        super(str);
    }

    public SdpFactoryException(Exception exc) {
        super(exc.getMessage());
        this.ex = exc;
    }

    public SdpFactoryException(String str, Exception exc) {
        super(str);
        this.ex = exc;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        if (super.getMessage() != null) {
            return super.getMessage();
        }
        Exception exc = this.ex;
        if (exc != null) {
            return exc.getMessage();
        }
        return null;
    }

    public Exception getException() {
        return this.ex;
    }
}
