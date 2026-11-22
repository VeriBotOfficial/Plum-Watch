package com.anythink.core.common.m.a.a;

import android.text.TextUtils;
import com.anythink.core.common.m.a.i;
import com.anythink.core.common.m.a.j;
import java.io.BufferedInputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;
import java.util.zip.GZIPInputStream;

/* loaded from: classes12.dex */
public final class b extends com.anythink.core.common.m.a.a {
    private static final String b = "POST";
    private static final String c = "GET";
    private boolean d;

    @Override // com.anythink.core.common.m.a.b
    public final void a(i iVar, com.anythink.core.common.m.a.c cVar) {
    }

    public b(com.anythink.core.common.m.a.f fVar) {
        super(fVar);
    }

    @Override // com.anythink.core.common.m.a.b
    public final j a(i iVar) {
        return b(iVar);
    }

    @Override // com.anythink.core.common.m.a.b
    public final void a() {
        this.d = true;
    }

    private j b(i iVar) {
        HttpURLConnection httpURLConnection;
        int responseCode;
        byte[] bArr;
        j.a a2 = new j.a().a(iVar);
        InputStream inputStream = null;
        try {
        } catch (Throwable th) {
            th = th;
            httpURLConnection = null;
        }
        if (this.d) {
            a2.a(new InterruptedException("canceled"));
            return a2.a();
        }
        httpURLConnection = (HttpURLConnection) new URL(iVar.f3988a).openConnection();
        try {
            String str = iVar.b;
            if (TextUtils.isEmpty(str)) {
                str = "GET";
            }
            httpURLConnection.setRequestMethod(str);
            if ("POST".equals(str)) {
                httpURLConnection.setDoInput(true);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setUseCaches(false);
            } else if ("GET".equals(str)) {
                httpURLConnection.setInstanceFollowRedirects(false);
            }
            httpURLConnection.setConnectTimeout((int) this.f3979a.e);
            httpURLConnection.setReadTimeout((int) this.f3979a.f3986a);
            if (iVar.e != null && !iVar.e.isEmpty()) {
                for (Map.Entry<String, String> entry : iVar.e.entrySet()) {
                    httpURLConnection.addRequestProperty(entry.getKey(), entry.getValue());
                }
            }
            httpURLConnection.connect();
            if ("POST".equals(str) && (bArr = iVar.c) != null) {
                OutputStream outputStream = httpURLConnection.getOutputStream();
                outputStream.write(bArr);
                outputStream.flush();
                outputStream.close();
            }
            responseCode = httpURLConnection.getResponseCode();
            a2.a(responseCode);
        } catch (Throwable th2) {
            th = th2;
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (Throwable unused) {
                    a2.a(th);
                    return a2.a();
                }
            }
            if (httpURLConnection != null) {
                httpURLConnection.disconnect();
            }
            a2.a(th);
            return a2.a();
        }
        if (responseCode != 200) {
            if (responseCode != 302 && responseCode != 301 && responseCode != 307) {
                a2.a(httpURLConnection.getHeaderFields());
                httpURLConnection.disconnect();
                return a2.a();
            }
            if (!this.d) {
                String headerField = httpURLConnection.getHeaderField("Location");
                if (headerField != null && headerField.toLowerCase().startsWith("http")) {
                    iVar.f3988a = headerField;
                    httpURLConnection.disconnect();
                    return b(iVar);
                }
            } else {
                a2.a(new InterruptedException("canceled"));
            }
            httpURLConnection.disconnect();
            return a2.a();
        }
        if (this.d) {
            a2.a(new InterruptedException("canceled"));
            httpURLConnection.disconnect();
            return a2.a();
        }
        a2.a(new c(httpURLConnection, a(httpURLConnection)));
        return a2.a();
    }

    private static InputStream a(HttpURLConnection httpURLConnection) {
        InputStream inputStream = null;
        if (httpURLConnection == null) {
            return null;
        }
        try {
            inputStream = httpURLConnection.getInputStream();
        } catch (Exception unused) {
        }
        if (!"gzip".equalsIgnoreCase(httpURLConnection.getHeaderField("Content-Encoding"))) {
            return inputStream;
        }
        try {
            byte[] bArr = new byte[2];
            BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
            bufferedInputStream.mark(2);
            int read = bufferedInputStream.read(bArr);
            bufferedInputStream.reset();
            return (read == -1 || (((bArr[1] & 255) << 8) | (bArr[0] & 255)) != 35615) ? bufferedInputStream : new GZIPInputStream(bufferedInputStream);
        } catch (Exception unused2) {
            return inputStream;
        }
    }
}
