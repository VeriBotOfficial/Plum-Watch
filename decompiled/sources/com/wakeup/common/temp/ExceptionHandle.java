package com.wakeup.common.temp;

import android.net.ParseException;
import com.google.gson.JsonParseException;
import com.google.gson.stream.MalformedJsonException;
import java.net.ConnectException;
import java.net.SocketTimeoutException;
import java.net.UnknownHostException;
import javax.net.ssl.SSLException;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import retrofit2.HttpException;

/* compiled from: ExceptionHandle.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/wakeup/common/temp/ExceptionHandle;", "", "<init>", "()V", "handleException", "Lcom/wakeup/common/temp/ResponseThrowable;", "e", "", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ExceptionHandle {
    public static final ExceptionHandle INSTANCE = new ExceptionHandle();

    private ExceptionHandle() {
    }

    public final ResponseThrowable handleException(Throwable e) {
        Intrinsics.checkNotNullParameter(e, "e");
        if (e instanceof ResponseThrowable) {
            return (ResponseThrowable) e;
        }
        if (e instanceof HttpException) {
            return new ResponseThrowable(ERROR.HTTP_ERROR, e);
        }
        if ((e instanceof JsonParseException) || (e instanceof JSONException) || (e instanceof ParseException) || (e instanceof MalformedJsonException)) {
            return new ResponseThrowable(ERROR.PARSE_ERROR, e);
        }
        if (e instanceof ConnectException) {
            return new ResponseThrowable(ERROR.NETWORD_ERROR, e);
        }
        if (e instanceof SSLException) {
            return new ResponseThrowable(ERROR.SSL_ERROR, e);
        }
        if (e instanceof SocketTimeoutException) {
            return new ResponseThrowable(ERROR.TIMEOUT_ERROR, e);
        }
        if (e instanceof UnknownHostException) {
            return new ResponseThrowable(ERROR.TIMEOUT_ERROR, e);
        }
        String message = e.getMessage();
        if (message == null || message.length() == 0) {
            return new ResponseThrowable(ERROR.UNKNOWN, e);
        }
        String message2 = e.getMessage();
        Intrinsics.checkNotNull(message2);
        return new ResponseThrowable(1007, message2, e);
    }
}
