package android.javax.sdp;

/* JADX INFO: loaded from: classes.dex */
public class SdpException extends Exception {
    public SdpException() {
    }

    public SdpException(String str) {
        super(str);
    }

    public SdpException(String str, Throwable th) {
        super(th.getMessage() + ";" + str);
    }

    public SdpException(Throwable th) {
        super(th.getLocalizedMessage());
    }

    public Throwable getRootCause() {
        return fillInStackTrace();
    }
}
