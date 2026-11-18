package androidx.media3.decoder;

/* JADX INFO: loaded from: classes8.dex */
public class CryptoException extends Exception {
    public final int errorCode;

    public CryptoException(int r1, String str) {
        super(str);
        this.errorCode = r1;
    }
}
