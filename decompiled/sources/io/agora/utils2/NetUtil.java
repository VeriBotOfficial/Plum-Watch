package io.agora.utils2;

import android.text.TextUtils;
import android.util.Log;
import io.agora.utils2.internal.Logging;
import java.net.URI;
import java.net.URL;
import java.net.URLDecoder;

/* loaded from: classes6.dex */
public class NetUtil {
    private static final String TAG = "NetUtil";

    public static boolean checkUrlEncoded(String urlStr) {
        try {
            return !TextUtils.equals(urlStr, URLDecoder.decode(urlStr, "UTF-8"));
        } catch (Exception e) {
            Log.e(TAG, "checkUrlEncoded failed: ", e);
            return false;
        }
    }

    public static String encodeUrl(String urlStr) {
        Logging.d(TAG, "encodedUrl()");
        try {
            URL url = new URL(urlStr);
            return new URI(url.getProtocol(), url.getUserInfo(), url.getHost(), url.getPort(), url.getPath(), url.getQuery(), url.getRef()).toASCIIString();
        } catch (Exception e) {
            Log.e(TAG, "encodeUrl failed: ", e);
            return urlStr;
        }
    }

    public static String getDecodedUrl(String urlStr) {
        try {
            return URLDecoder.decode(urlStr, "UTF-8");
        } catch (Exception e) {
            Log.e(TAG, "getDecodedUrl failed: ", e);
            return urlStr;
        }
    }

    public static String getEncodedUrl(String urlStr) {
        return checkUrlEncoded(urlStr) ? urlStr : encodeUrl(urlStr);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0050  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean testNetworkUrlAvailable(java.lang.String r5) {
        /*
            java.lang.String r0 = io.agora.utils2.NetUtil.TAG
            java.lang.String r1 = "testNetworkUrlAvailable encodedUrl"
            io.agora.utils2.internal.Logging.d(r0, r1)
            r0 = 0
            r1 = 0
            java.net.URL r2 = new java.net.URL     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3c
            r2.<init>(r5)     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3c
            java.net.URLConnection r5 = r2.openConnection()     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3c
            java.net.HttpURLConnection r5 = (java.net.HttpURLConnection) r5     // Catch: java.lang.Throwable -> L37 java.lang.Exception -> L3c
            r0 = 1000(0x3e8, float:1.401E-42)
            r5.setConnectTimeout(r0)     // Catch: java.lang.Exception -> L35 java.lang.Throwable -> L4d
            r5.setReadTimeout(r0)     // Catch: java.lang.Exception -> L35 java.lang.Throwable -> L4d
            int r0 = r5.getResponseCode()     // Catch: java.lang.Exception -> L35 java.lang.Throwable -> L4d
            r2 = 404(0x194, float:5.66E-43)
            if (r0 == r2) goto L26
            r0 = 1
            r1 = r0
        L26:
            java.io.InputStream r0 = r5.getInputStream()     // Catch: java.lang.Exception -> L35 java.lang.Throwable -> L4d
            if (r0 == 0) goto L2f
            r0.close()     // Catch: java.lang.Exception -> L35 java.lang.Throwable -> L4d
        L2f:
            if (r5 == 0) goto L34
            r5.disconnect()
        L34:
            return r1
        L35:
            r0 = move-exception
            goto L40
        L37:
            r5 = move-exception
            r4 = r0
            r0 = r5
            r5 = r4
            goto L4e
        L3c:
            r5 = move-exception
            r4 = r0
            r0 = r5
            r5 = r4
        L40:
            java.lang.String r2 = io.agora.utils2.NetUtil.TAG     // Catch: java.lang.Throwable -> L4d
            java.lang.String r3 = "testNetworkUrlAvailable failed: "
            android.util.Log.e(r2, r3, r0)     // Catch: java.lang.Throwable -> L4d
            if (r5 == 0) goto L4c
            r5.disconnect()
        L4c:
            return r1
        L4d:
            r0 = move-exception
        L4e:
            if (r5 == 0) goto L53
            r5.disconnect()
        L53:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.agora.utils2.NetUtil.testNetworkUrlAvailable(java.lang.String):boolean");
    }
}
