package com.baidu.mapapi.http;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import com.baidu.mapapi.JNIInitializer;
import com.baidu.mapapi.common.Logger;
import com.baidu.mapapi.http.wrapper.FileWrapper;
import com.baidu.mapsdkplatform.comapi.util.g;
import com.google.common.net.HttpHeaders;
import com.phancy.mini.core.app.storage.MiniSetting;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import java.util.Map;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSession;

/* loaded from: classes13.dex */
public class HttpClient {
    public static final String BOUNDRYSTR = "bd_map_sdk_cc";
    public static final String ENDFLAG = "--";
    public static final String FILE_TEMPLATE = "Content-Disposition: form-data; name=\"%s\"; filename=\"%s\"";
    public static final String NEWLINE = "\r\n";
    public static final String PARAM_TEMPLATE = "Content-Disposition: form-data; name=\"%s\"";
    public static boolean isHttpsEnable = true;
    private HttpURLConnection c;
    private final String f;
    private ProtoResultCallback g;
    private HttpHeader h;

    /* renamed from: a, reason: collision with root package name */
    private String f7851a = null;
    private String b = null;
    private int d = 10000;
    private int e = 10000;

    public static class HttpHeader {

        /* renamed from: a, reason: collision with root package name */
        private String f7852a;
        private String b;
        private String c;
        private String d;
        private Map<String, Object> e;

        public HttpHeader() {
        }

        public String getAccept() {
            return this.d;
        }

        public String getCharset() {
            return this.b;
        }

        public String getConnection() {
            return this.f7852a;
        }

        public String getContentType() {
            return this.c;
        }

        public Map<String, Object> getCustom() {
            return this.e;
        }

        public HttpHeader setAccept(String str) {
            this.d = str;
            return this;
        }

        public HttpHeader setCharset(String str) {
            this.b = str;
            return this;
        }

        public HttpHeader setConnection(String str) {
            this.f7852a = str;
            return this;
        }

        public HttpHeader setContentType(String str) {
            this.c = str;
            return this;
        }

        public HttpHeader setCustom(Map<String, Object> map) {
            this.e = map;
            return this;
        }

        public HttpHeader(String str, String str2, String str3, String str4) {
            this.f7852a = str;
            this.b = str2;
            this.c = str3;
            this.d = str4;
        }
    }

    public enum HttpStateError {
        NO_ERROR,
        NETWORK_ERROR,
        INNER_ERROR,
        REQUEST_ERROR,
        SERVER_ERROR
    }

    public static abstract class ProtoResultCallback {
        public abstract void onFailed(HttpStateError httpStateError);

        public abstract void onSuccess(String str);
    }

    private static class b implements HostnameVerifier {
        private b() {
        }

        @Override // javax.net.ssl.HostnameVerifier
        public boolean verify(String str, SSLSession sSLSession) {
            return HttpsURLConnection.getDefaultHostnameVerifier().verify(str, sSLSession);
        }
    }

    public HttpClient(String str) {
        this.f = str;
    }

    private HttpURLConnection a() {
        HttpURLConnection httpURLConnection;
        try {
            URL url = new URL(this.f7851a);
            if (isHttpsEnable) {
                HttpsURLConnection httpsURLConnection = (HttpsURLConnection) url.openConnection();
                httpsURLConnection.setHostnameVerifier(new b());
                httpURLConnection = httpsURLConnection;
            } else {
                httpURLConnection = (HttpURLConnection) url.openConnection();
            }
            httpURLConnection.setRequestMethod(this.f);
            httpURLConnection.setDoOutput(!"GET".equalsIgnoreCase(this.f));
            httpURLConnection.setDoInput(true);
            httpURLConnection.setConnectTimeout(this.d);
            httpURLConnection.setReadTimeout(this.e);
            a(httpURLConnection);
            return httpURLConnection;
        } catch (Exception e) {
            Log.e("HttpClient", "url connect failed");
            if (Logger.debugEnable()) {
                e.printStackTrace();
            } else {
                Logger.logW("HttpClient", e.getMessage());
            }
            return null;
        }
    }

    public static String getAuthToken() {
        return g.F;
    }

    public static String getPhoneInfo() {
        return g.h();
    }

    public static Map<String, String> getPhoneInfoRaw() {
        return g.j();
    }

    protected boolean checkNetwork() {
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) JNIInitializer.getCachedContext().getSystemService("connectivity");
            if (connectivityManager == null) {
                return false;
            }
            if (Build.VERSION.SDK_INT < 29) {
                NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                return activeNetworkInfo != null && activeNetworkInfo.isAvailable();
            }
            for (Network network : connectivityManager.getAllNetworks()) {
                NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(network);
                if (networkCapabilities != null && networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16)) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            if (Logger.debugEnable()) {
                e.printStackTrace();
            } else {
                Logger.logW("HttpClient", e.getMessage());
            }
            e.printStackTrace();
            return false;
        }
    }

    public void request(String str) {
        request(str, null, null, null);
    }

    public void setHeader(HttpHeader httpHeader) {
        this.h = httpHeader;
    }

    public void setMaxTimeOut(int i) {
        this.d = i;
    }

    public void setReadTimeOut(int i) {
        this.e = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:58:0x015d A[Catch: all -> 0x00d7, TryCatch #1 {all -> 0x00d7, blocks: (B:38:0x00a0, B:39:0x00a5, B:41:0x00ac, B:43:0x00b1, B:56:0x0157, B:58:0x015d, B:59:0x0168, B:61:0x0171, B:62:0x0176, B:71:0x0161), top: B:37:0x00a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0171 A[Catch: all -> 0x00d7, TryCatch #1 {all -> 0x00d7, blocks: (B:38:0x00a0, B:39:0x00a5, B:41:0x00ac, B:43:0x00b1, B:56:0x0157, B:58:0x015d, B:59:0x0168, B:61:0x0171, B:62:0x0176, B:71:0x0161), top: B:37:0x00a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:68:0x018b A[Catch: Exception -> 0x01a1, TryCatch #6 {Exception -> 0x01a1, blocks: (B:29:0x0079, B:45:0x00b9, B:46:0x00bf, B:48:0x00c3, B:75:0x0193, B:76:0x0199, B:78:0x019d, B:79:0x01a0, B:65:0x0181, B:66:0x0187, B:68:0x018b, B:91:0x0144, B:93:0x0148), top: B:28:0x0079 }] */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0161 A[Catch: all -> 0x00d7, TryCatch #1 {all -> 0x00d7, blocks: (B:38:0x00a0, B:39:0x00a5, B:41:0x00ac, B:43:0x00b1, B:56:0x0157, B:58:0x015d, B:59:0x0168, B:61:0x0171, B:62:0x0176, B:71:0x0161), top: B:37:0x00a0 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x019d A[Catch: Exception -> 0x01a1, TryCatch #6 {Exception -> 0x01a1, blocks: (B:29:0x0079, B:45:0x00b9, B:46:0x00bf, B:48:0x00c3, B:75:0x0193, B:76:0x0199, B:78:0x019d, B:79:0x01a0, B:65:0x0181, B:66:0x0187, B:68:0x018b, B:91:0x0144, B:93:0x0148), top: B:28:0x0079 }] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.StringBuilder] */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v15, types: [int] */
    /* JADX WARN: Type inference failed for: r7v25, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [java.io.InputStream] */
    /* JADX WARN: Type inference failed for: r8v13, types: [java.lang.StringBuilder] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public com.baidu.mapapi.http.HttpClient.HttpResponse request(java.lang.String r5, java.lang.String r6, java.lang.String r7, java.util.Map<java.lang.String, java.util.List<com.baidu.mapapi.http.wrapper.FileWrapper>> r8) {
        /*
            Method dump skipped, instructions count: 457
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.mapapi.http.HttpClient.request(java.lang.String, java.lang.String, java.lang.String, java.util.Map):com.baidu.mapapi.http.HttpClient$HttpResponse");
    }

    public static class HttpResponse {

        /* renamed from: a, reason: collision with root package name */
        private String f7853a;
        private HttpStateError b;

        public HttpResponse(String str) {
            this.f7853a = str;
            this.b = HttpStateError.NO_ERROR;
        }

        public String getData() {
            return this.f7853a;
        }

        public HttpStateError getError() {
            return this.b;
        }

        public void setData(String str) {
            this.f7853a = str;
        }

        public void setError(HttpStateError httpStateError) {
            this.b = httpStateError;
        }

        public HttpResponse(HttpStateError httpStateError) {
            this.b = httpStateError;
        }
    }

    public HttpClient(String str, ProtoResultCallback protoResultCallback) {
        this.f = str;
        this.g = protoResultCallback;
    }

    private void a(HttpURLConnection httpURLConnection) {
        HttpHeader httpHeader = this.h;
        if (httpHeader == null || httpURLConnection == null) {
            return;
        }
        if (httpHeader.getConnection() != null && !this.h.getConnection().isEmpty()) {
            httpURLConnection.setRequestProperty(HttpHeaders.CONNECTION, this.h.getConnection());
        }
        if (this.h.getCharset() != null && !this.h.getCharset().isEmpty()) {
            httpURLConnection.setRequestProperty("Charset", this.h.getCharset());
        }
        if (this.h.getContentType() != null && !this.h.getContentType().isEmpty()) {
            httpURLConnection.setRequestProperty("Content-Type", this.h.getContentType());
        }
        if (this.h.getAccept() != null && !this.h.getAccept().isEmpty()) {
            httpURLConnection.setRequestProperty(MiniSetting.ACCEPT, this.h.getAccept());
        }
        Map<String, Object> custom = this.h.getCustom();
        if (custom == null || custom.isEmpty()) {
            return;
        }
        for (Map.Entry<String, Object> entry : custom.entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), String.valueOf(entry.getValue()));
        }
    }

    private void a(HttpURLConnection httpURLConnection, String str, Map<String, List<FileWrapper>> map) {
        if ("GET".equalsIgnoreCase(this.f)) {
            return;
        }
        try {
            OutputStream outputStream = httpURLConnection.getOutputStream();
            a(str, outputStream);
            a(map, outputStream);
            if (TextUtils.equals(this.h.getContentType(), "multipart/form-data;boundary=bd_map_sdk_cc")) {
                outputStream.write("--bd_map_sdk_cc--\r\n".getBytes());
            }
            outputStream.flush();
            outputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private void a(String str, OutputStream outputStream) throws IOException {
        if (str == null || str.isEmpty()) {
            return;
        }
        outputStream.write(str.getBytes());
    }

    private void a(Map<String, List<FileWrapper>> map, OutputStream outputStream) throws IOException {
        if (map == null || map.isEmpty()) {
            return;
        }
        for (Map.Entry<String, List<FileWrapper>> entry : map.entrySet()) {
            for (FileWrapper fileWrapper : entry.getValue()) {
                if (fileWrapper.getRawFile() != null) {
                    File rawFile = fileWrapper.getRawFile();
                    outputStream.write(("--bd_map_sdk_cc\r\n" + String.format(FILE_TEMPLATE, entry.getKey(), rawFile.getName()) + "\r\n" + String.format("Content-Type: %s", URLConnection.getFileNameMap().getContentTypeFor(rawFile.getName())) + "\r\n\r\n").getBytes());
                    a(rawFile, outputStream);
                    outputStream.write("\r\n".getBytes());
                } else {
                    byte[] file = fileWrapper.getFile();
                    String mimeType = fileWrapper.getMimeType();
                    String name = fileWrapper.getName();
                    if (file != null && file.length > 0 && !TextUtils.isEmpty(mimeType) && !TextUtils.isEmpty(name)) {
                        outputStream.write(("--bd_map_sdk_cc\r\n" + String.format(FILE_TEMPLATE, entry.getKey(), name) + "\r\n" + String.format("Content-Type: %s", mimeType) + "\r\n\r\n").getBytes());
                        outputStream.write(file);
                        outputStream.write("\r\n".getBytes());
                    }
                }
            }
        }
    }

    private void a(File file, OutputStream outputStream) throws IOException {
        int read;
        FileInputStream fileInputStream = new FileInputStream(file);
        byte[] bArr = new byte[1024];
        do {
            read = fileInputStream.read(bArr);
            if (read > 0) {
                outputStream.write(bArr, 0, read);
            }
        } while (read > 0);
        fileInputStream.close();
    }
}
