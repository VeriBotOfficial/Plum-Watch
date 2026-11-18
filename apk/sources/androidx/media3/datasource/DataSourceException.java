package androidx.media3.datasource;

import java.io.IOException;

/* JADX INFO: loaded from: classes8.dex */
public class DataSourceException extends IOException {

    @Deprecated
    public static final int POSITION_OUT_OF_RANGE = 2008;
    public final int reason;

    public static boolean isCausedByPositionOutOfRange(IOException iOException) {
        for (Throwable cause = iOException; cause != null; cause = cause.getCause()) {
            if ((cause instanceof DataSourceException) && ((DataSourceException) cause).reason == 2008) {
                return true;
            }
        }
        return false;
    }

    public DataSourceException(int r1) {
        this.reason = r1;
    }

    public DataSourceException(Throwable th, int r2) {
        super(th);
        this.reason = r2;
    }

    public DataSourceException(String str, int r2) {
        super(str);
        this.reason = r2;
    }

    public DataSourceException(String str, Throwable th, int r3) {
        super(str, th);
        this.reason = r3;
    }
}
