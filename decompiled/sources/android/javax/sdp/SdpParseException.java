package android.javax.sdp;

/* loaded from: classes.dex */
public class SdpParseException extends SdpException {
    private int charOffset;
    private int lineNumber;

    public SdpParseException(int i, int i2, String str, Throwable th) {
        super(str, th);
        this.lineNumber = i;
        this.charOffset = i2;
    }

    public SdpParseException(int i, int i2, String str) {
        super(str);
        this.lineNumber = i;
        this.charOffset = i2;
    }

    public int getLineNumber() {
        return this.lineNumber;
    }

    public int getCharOffset() {
        return this.charOffset;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return super.getMessage();
    }
}
