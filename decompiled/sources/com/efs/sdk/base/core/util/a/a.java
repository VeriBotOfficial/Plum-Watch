package com.efs.sdk.base.core.util.a;

import com.efs.sdk.base.core.util.FileUtil;
import com.efs.sdk.base.core.util.Log;
import com.efs.sdk.base.http.HttpResponse;
import com.efs.sdk.base.http.IHttpUtil;
import com.google.common.net.HttpHeaders;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.Collections;
import java.util.Map;

/* loaded from: classes14.dex */
public final class a implements IHttpUtil {
    /* synthetic */ a(byte b) {
        this();
    }

    private a() {
    }

    /* renamed from: com.efs.sdk.base.core.util.a.a$a, reason: collision with other inner class name */
    static class C0555a {

        /* renamed from: a, reason: collision with root package name */
        private static final a f9643a = new a(0);
    }

    public static a a() {
        return C0555a.f9643a;
    }

    private static HttpURLConnection a(String str, Map<String, String> map) {
        HttpURLConnection httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
        httpURLConnection.setConnectTimeout(15000);
        httpURLConnection.setReadTimeout(10000);
        httpURLConnection.setDoInput(true);
        httpURLConnection.setDoOutput(true);
        httpURLConnection.setUseCaches(false);
        if (map == null) {
            map = Collections.emptyMap();
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
        return httpURLConnection;
    }

    private static HttpResponse a(HttpURLConnection httpURLConnection) {
        ByteArrayOutputStream byteArrayOutputStream;
        Throwable th;
        InputStream inputStream;
        HttpResponse httpResponse = new HttpResponse();
        if (httpURLConnection != null) {
            try {
                httpResponse.setHttpCode(httpURLConnection.getResponseCode());
                inputStream = httpURLConnection.getInputStream();
                try {
                    byte[] bArr = new byte[1024];
                    byteArrayOutputStream = new ByteArrayOutputStream(inputStream.available());
                    while (true) {
                        try {
                            int read = inputStream.read(bArr);
                            if (read != -1) {
                                byteArrayOutputStream.write(bArr, 0, read);
                            } else {
                                httpResponse.data = byteArrayOutputStream.toString();
                                return httpResponse;
                            }
                        } catch (Throwable th2) {
                            th = th2;
                            try {
                                Log.e("efs.util.http", "get response error", th);
                                return httpResponse;
                            } finally {
                                FileUtil.safeClose(inputStream);
                                FileUtil.safeClose(byteArrayOutputStream);
                            }
                        }
                    }
                } catch (Throwable th3) {
                    byteArrayOutputStream = null;
                    th = th3;
                }
            } catch (Throwable th4) {
                byteArrayOutputStream = null;
                th = th4;
                inputStream = null;
            }
        }
        return httpResponse;
    }

    @Override // com.efs.sdk.base.http.IHttpUtil
    public final HttpResponse get(String str, Map<String, String> map) {
        HttpURLConnection httpURLConnection;
        HttpResponse httpResponse = new HttpResponse();
        int i = 0;
        while (true) {
            if (i >= 3) {
                break;
            }
            httpURLConnection = null;
            try {
                try {
                    try {
                        httpURLConnection = a(str, map);
                        httpURLConnection.setRequestMethod("GET");
                        httpURLConnection.setInstanceFollowRedirects(true);
                        httpURLConnection.setRequestProperty(HttpHeaders.CONNECTION, "close");
                        httpURLConnection.connect();
                        httpResponse = a(httpURLConnection);
                        b(httpURLConnection);
                        break;
                    } catch (SocketTimeoutException e) {
                        httpResponse.setHttpCode(-3);
                        Log.e("efs.util.http", "post file '" + str + "' error", e);
                    }
                } catch (UnknownHostException e2) {
                    httpResponse.setHttpCode(-2);
                    Log.e("efs.util.http", "get request '" + str + "' error， maybe network is disconnect", e2);
                }
            } finally {
                try {
                    i++;
                    b(httpURLConnection);
                } catch (Throwable th) {
                    b(httpURLConnection);
                }
            }
            i++;
            b(httpURLConnection);
        }
        httpResponse.setReqUrl(str);
        return httpResponse;
    }

    @Override // com.efs.sdk.base.http.IHttpUtil
    public final HttpResponse postAsFile(String str, Map<String, String> map, byte[] bArr) {
        return a(str, map, null, bArr);
    }

    @Override // com.efs.sdk.base.http.IHttpUtil
    public final HttpResponse post(String str, Map<String, String> map, File file) {
        return a(str, map, file, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v0, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r13v28 */
    /* JADX WARN: Type inference failed for: r13v29 */
    /* JADX WARN: Type inference failed for: r13v30 */
    /* JADX WARN: Type inference failed for: r13v4, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r13v7, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v18 */
    /* JADX WARN: Type inference failed for: r4v19 */
    /* JADX WARN: Type inference failed for: r4v20 */
    /* JADX WARN: Type inference failed for: r4v21 */
    /* JADX WARN: Type inference failed for: r4v9 */
    private static HttpResponse a(String str, Map<String, String> map, File file, byte[] bArr) {
        FileInputStream fileInputStream;
        OutputStream outputStream;
        DataOutputStream dataOutputStream;
        FileInputStream fileInputStream2;
        FileInputStream fileInputStream3;
        FileInputStream fileInputStream4;
        HttpResponse httpResponse = new HttpResponse();
        HttpURLConnection httpURLConnection = null;
        r4 = null;
        r4 = null;
        r4 = null;
        ?? r4 = null;
        httpURLConnection = null;
        httpURLConnection = null;
        httpURLConnection = null;
        try {
            try {
                HttpURLConnection a2 = a(str, map);
                try {
                    a2.setRequestMethod("POST");
                    a2.setRequestProperty(HttpHeaders.CONNECTION, "close");
                    a2.setRequestProperty("Content-Type", "multipart/form-data;boundary=----WebKitFormBoundaryP0Rfzlf32iRoMhmb");
                    outputStream = a2.getOutputStream();
                    try {
                        dataOutputStream = new DataOutputStream(outputStream);
                        try {
                            dataOutputStream.writeBytes("------WebKitFormBoundaryP0Rfzlf32iRoMhmb\r\n");
                            if (bArr == 0) {
                                if (file != null && file.exists()) {
                                    dataOutputStream.writeBytes("Content-Disposition: form-data;name=\"file\";filename=\"" + file.getName() + "\"\r\n");
                                    dataOutputStream.writeBytes("\r\n");
                                    fileInputStream4 = new FileInputStream(file);
                                    try {
                                        byte[] bArr2 = new byte[4096];
                                        while (true) {
                                            int read = fileInputStream4.read(bArr2);
                                            if (read == -1) {
                                                break;
                                            }
                                            dataOutputStream.write(bArr2, 0, read);
                                        }
                                        r4 = fileInputStream4;
                                    } catch (SocketTimeoutException e) {
                                        e = e;
                                        httpURLConnection = a2;
                                        fileInputStream3 = fileInputStream4;
                                        httpResponse.setHttpCode(-3);
                                        Log.e("efs.util.http", "post file '" + str + "' error", e);
                                        bArr = fileInputStream3;
                                        httpResponse.setReqUrl(str);
                                        return httpResponse;
                                    } catch (UnknownHostException e2) {
                                        e = e2;
                                        httpURLConnection = a2;
                                        fileInputStream2 = fileInputStream4;
                                        httpResponse.setHttpCode(-2);
                                        Log.e("efs.util.http", "post file '" + str + "' error， maybe network is disconnect", e);
                                        bArr = fileInputStream2;
                                        httpResponse.setReqUrl(str);
                                        return httpResponse;
                                    } catch (Throwable th) {
                                        th = th;
                                        httpURLConnection = a2;
                                        fileInputStream = fileInputStream4;
                                        Log.e("efs.util.http", "post file '" + str + "' error", th);
                                        bArr = fileInputStream;
                                        httpResponse.setReqUrl(str);
                                        return httpResponse;
                                    }
                                }
                                b(a2);
                                FileUtil.safeClose(outputStream);
                                FileUtil.safeClose(dataOutputStream);
                                FileUtil.safeClose(null);
                                return httpResponse;
                            }
                            dataOutputStream.writeBytes("Content-Disposition: form-data;name=\"file\";filename=\"f\"\r\n");
                            dataOutputStream.writeBytes("\r\n");
                            dataOutputStream.write(bArr, 0, bArr.length);
                            dataOutputStream.writeBytes("\r\n");
                            dataOutputStream.writeBytes("------WebKitFormBoundaryP0Rfzlf32iRoMhmb--\r\n");
                            httpResponse = a(a2);
                            b(a2);
                            FileUtil.safeClose(outputStream);
                            FileUtil.safeClose(dataOutputStream);
                            FileUtil.safeClose(r4);
                        } catch (SocketTimeoutException e3) {
                            e = e3;
                            fileInputStream4 = r4;
                        } catch (UnknownHostException e4) {
                            e = e4;
                            fileInputStream4 = r4;
                        } catch (Throwable th2) {
                            th = th2;
                            fileInputStream4 = r4;
                        }
                    } catch (SocketTimeoutException e5) {
                        e = e5;
                        fileInputStream4 = null;
                        dataOutputStream = null;
                    } catch (UnknownHostException e6) {
                        e = e6;
                        fileInputStream4 = null;
                        dataOutputStream = null;
                    } catch (Throwable th3) {
                        th = th3;
                        fileInputStream4 = null;
                        dataOutputStream = null;
                    }
                } catch (SocketTimeoutException e7) {
                    e = e7;
                    fileInputStream4 = null;
                    outputStream = null;
                    dataOutputStream = null;
                } catch (UnknownHostException e8) {
                    e = e8;
                    fileInputStream4 = null;
                    outputStream = null;
                    dataOutputStream = null;
                } catch (Throwable th4) {
                    th = th4;
                    fileInputStream4 = null;
                    outputStream = null;
                    dataOutputStream = null;
                }
            } finally {
                b(httpURLConnection);
                FileUtil.safeClose(outputStream);
                FileUtil.safeClose(dataOutputStream);
                FileUtil.safeClose(bArr);
            }
        } catch (SocketTimeoutException e9) {
            e = e9;
            fileInputStream3 = null;
            outputStream = null;
            dataOutputStream = null;
        } catch (UnknownHostException e10) {
            e = e10;
            fileInputStream2 = null;
            outputStream = null;
            dataOutputStream = null;
        } catch (Throwable th5) {
            th = th5;
            fileInputStream = null;
            outputStream = null;
            dataOutputStream = null;
        }
        httpResponse.setReqUrl(str);
        return httpResponse;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v0, types: [java.util.Map, java.util.Map<java.lang.String, java.lang.String>] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9, types: [java.net.HttpURLConnection] */
    @Override // com.efs.sdk.base.http.IHttpUtil
    public final HttpResponse post(String str, Map<String, String> map, byte[] bArr) {
        HttpResponse httpResponse = new HttpResponse();
        OutputStream outputStream = null;
        try {
            try {
                map = a(str, map);
                try {
                    map.setRequestMethod("POST");
                    map.setRequestProperty(HttpHeaders.CONNECTION, "close");
                    outputStream = map.getOutputStream();
                    outputStream.write(bArr);
                    httpResponse = a(map);
                } catch (SocketTimeoutException e) {
                    e = e;
                    httpResponse.setHttpCode(-3);
                    Log.e("efs.util.http", "post file '" + str + "' error", e);
                    map = map;
                    httpResponse.setReqUrl(str);
                    return httpResponse;
                } catch (UnknownHostException e2) {
                    e = e2;
                    httpResponse.setHttpCode(-2);
                    Log.e("efs.util.http", "post data to '" + str + "' error， maybe network is disconnect", e);
                    map = map;
                    httpResponse.setReqUrl(str);
                    return httpResponse;
                } catch (Throwable th) {
                    th = th;
                    Log.e("efs.util.http", "post data '" + str + "' error", th);
                    map = map;
                    httpResponse.setReqUrl(str);
                    return httpResponse;
                }
            } finally {
                FileUtil.safeClose(outputStream);
                b(map);
            }
        } catch (SocketTimeoutException e3) {
            e = e3;
            map = 0;
        } catch (UnknownHostException e4) {
            e = e4;
            map = 0;
        } catch (Throwable th2) {
            th = th2;
            map = 0;
        }
        httpResponse.setReqUrl(str);
        return httpResponse;
    }

    private static void b(HttpURLConnection httpURLConnection) {
        if (httpURLConnection != null) {
            httpURLConnection.disconnect();
            try {
                FileUtil.safeClose(httpURLConnection.getInputStream());
            } catch (Throwable unused) {
            }
        }
    }
}
