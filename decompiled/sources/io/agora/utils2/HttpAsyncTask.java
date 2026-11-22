package io.agora.utils2;

import android.os.AsyncTask;
import java.util.Map;

/* loaded from: classes6.dex */
class HttpAsyncTask extends AsyncTask<HttpAsyncTaskParam, Void, Void> {
    private static final int RESPONSE_COMPLETED = 1;
    private static final int RESPONSE_COMPLETED_REASON_NONE = 0;
    private static final int RESPONSE_COMPLETED_REASON_OTHER_ERROR = 4;
    private static final int RESPONSE_COMPLETED_REASON_SOCKET_TIMEOUT = 3;
    private static final int RESPONSE_COMPLETED_REASON_SUCCESS = 1;
    private static final int RESPONSE_COMPLETED_REASON_UNKNOWN_HOST = 2;
    private static final int RESPONSE_ON_GOING = 0;
    private static final int SIZE_FOR_CALLBACK = 16384;
    private static final String TAG = "HttpAsyncTask";
    private long nativeHandle;

    public HttpAsyncTask(long nativeHandle) {
        this.nativeHandle = nativeHandle;
    }

    private static native int nativeNotifyResponse(long handle, int status, int isCompleted, int completedReason, byte[] body, int size, Map<String, String> headers);

    private int notifyNativeResponse(int status, int isCompleted, int completedReason, byte[] body, Map<String, String> headers) {
        return nativeNotifyResponse(this.nativeHandle, status, isCompleted, completedReason, body, body != null ? body.length : 0, headers);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Can't wrap try/catch for region: R(12:(5:64|(1:66)(1:70)|67|68|69)|73|74|(2:115|116)(1:76)|77|(3:78|79|(3:81|(5:83|84|85|86|(2:92|93)(3:88|89|90))(1:108)|91)(2:109|110))|94|95|(1:97)|98|68|69) */
    /* JADX WARN: Can't wrap try/catch for region: R(33:7|8|(1:10)(1:128)|11|12|(3:14|(2:17|15)|18)|19|(1:27)|28|(1:32)|33|(1:35)|36|(1:38)|39|(1:41)|42|(3:44|(6:47|48|(1:50)|(1:55)(2:52|53)|54|45)|56)|57|(5:64|(1:66)(1:70)|67|68|69)|71|72|73|74|(2:115|116)(1:76)|77|(3:78|79|(3:81|(5:83|84|85|86|(2:92|93)(3:88|89|90))(1:108)|91)(2:109|110))|94|95|(1:97)|98|68|69) */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x01e3, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01ea, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01eb, code lost:
    
        r17 = r10;
        r9 = null;
        r12 = null;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0209 A[Catch: Exception -> 0x0222, SocketTimeoutException -> 0x0239, UnknownHostException -> 0x0240, TRY_ENTER, TryCatch #9 {SocketTimeoutException -> 0x0239, UnknownHostException -> 0x0240, Exception -> 0x0222, blocks: (B:8:0x001d, B:10:0x0028, B:11:0x002e, B:12:0x0036, B:14:0x003a, B:15:0x0044, B:17:0x004a, B:19:0x0060, B:21:0x0064, B:23:0x006c, B:25:0x0070, B:27:0x0078, B:28:0x00b3, B:30:0x00b7, B:32:0x00bf, B:33:0x00c6, B:35:0x00d8, B:36:0x00e2, B:38:0x00ec, B:39:0x00ef, B:41:0x00f3, B:42:0x0104, B:44:0x0113, B:45:0x011b, B:47:0x0121, B:54:0x0143, B:57:0x0147, B:59:0x0162, B:61:0x0166, B:64:0x016b, B:66:0x0171, B:68:0x0214, B:72:0x017e, B:97:0x01df, B:103:0x0209, B:125:0x021e, B:126:0x0221, B:128:0x0031), top: B:7:0x001d }] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r9v5 */
    @Override // android.os.AsyncTask
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Void doInBackground(io.agora.utils2.HttpAsyncTaskParam... r19) {
        /*
            Method dump skipped, instructions count: 595
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: io.agora.utils2.HttpAsyncTask.doInBackground(io.agora.utils2.HttpAsyncTaskParam[]):java.lang.Void");
    }
}
