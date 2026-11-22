package com.danikula.videocache;

import android.text.TextUtils;
import com.danikula.videocache.headers.EmptyHeadersInjector;
import com.danikula.videocache.headers.HeaderInjector;
import com.danikula.videocache.sourcestorage.SourceInfoStorage;
import com.danikula.videocache.sourcestorage.SourceInfoStorageFactory;
import com.xiaomi.mipush.sdk.Constants;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Map;

/* loaded from: classes14.dex */
public class HttpUrlSource implements Source {
    private static final int MAX_REDIRECTS = 5;
    private HttpURLConnection connection;
    private final HeaderInjector headerInjector;
    private InputStream inputStream;
    private SourceInfo sourceInfo;
    private final SourceInfoStorage sourceInfoStorage;

    public HttpUrlSource(String str) {
        this(str, SourceInfoStorageFactory.newEmptySourceInfoStorage());
    }

    public HttpUrlSource(String str, SourceInfoStorage sourceInfoStorage) {
        this(str, sourceInfoStorage, new EmptyHeadersInjector());
    }

    public HttpUrlSource(String str, SourceInfoStorage sourceInfoStorage, HeaderInjector headerInjector) {
        this.sourceInfoStorage = (SourceInfoStorage) Preconditions.checkNotNull(sourceInfoStorage);
        this.headerInjector = (HeaderInjector) Preconditions.checkNotNull(headerInjector);
        SourceInfo sourceInfo = sourceInfoStorage.get(str);
        this.sourceInfo = sourceInfo == null ? new SourceInfo(str, -2147483648L, ProxyCacheUtils.getSupposablyMime(str)) : sourceInfo;
    }

    public HttpUrlSource(HttpUrlSource httpUrlSource) {
        this.sourceInfo = httpUrlSource.sourceInfo;
        this.sourceInfoStorage = httpUrlSource.sourceInfoStorage;
        this.headerInjector = httpUrlSource.headerInjector;
    }

    @Override // com.danikula.videocache.Source
    public synchronized long length() throws ProxyCacheException {
        if (this.sourceInfo.length == -2147483648L) {
            fetchContentInfo();
        }
        return this.sourceInfo.length;
    }

    @Override // com.danikula.videocache.Source
    public void open(long j) throws ProxyCacheException {
        try {
            HttpURLConnection openConnection = openConnection(j, -1);
            this.connection = openConnection;
            String contentType = openConnection.getContentType();
            this.inputStream = new BufferedInputStream(this.connection.getInputStream(), 8192);
            HttpURLConnection httpURLConnection = this.connection;
            SourceInfo sourceInfo = new SourceInfo(this.sourceInfo.url, readSourceAvailableBytes(httpURLConnection, j, httpURLConnection.getResponseCode()), contentType);
            this.sourceInfo = sourceInfo;
            this.sourceInfoStorage.put(sourceInfo.url, this.sourceInfo);
        } catch (IOException e) {
            throw new ProxyCacheException("Error opening connection for " + this.sourceInfo.url + " with offset " + j, e);
        }
    }

    private long readSourceAvailableBytes(HttpURLConnection httpURLConnection, long j, int i) throws IOException {
        long contentLength = getContentLength(httpURLConnection);
        return i == 200 ? contentLength : i == 206 ? contentLength + j : this.sourceInfo.length;
    }

    private long getContentLength(HttpURLConnection httpURLConnection) {
        String headerField = httpURLConnection.getHeaderField("Content-Length");
        if (headerField == null) {
            return -1L;
        }
        return Long.parseLong(headerField);
    }

    @Override // com.danikula.videocache.Source
    public void close() throws ProxyCacheException {
        HttpURLConnection httpURLConnection = this.connection;
        if (httpURLConnection != null) {
            try {
                httpURLConnection.disconnect();
            } catch (ArrayIndexOutOfBoundsException unused) {
                Logger.error("Error closing connection correctly. Should happen only on Android L. If anybody know how to fix it, please visit https://github.com/danikula/AndroidVideoCache/issues/88. Until good solution is not know, just ignore this issue.");
            } catch (IllegalArgumentException e) {
                e = e;
                throw new RuntimeException("Wait... but why? WTF!? Really shouldn't happen any more after fixing https://github.com/danikula/AndroidVideoCache/issues/43. If you read it on your device log, please, notify me danikula@gmail.com or create issue here https://github.com/danikula/AndroidVideoCache/issues.", e);
            } catch (NullPointerException e2) {
                e = e2;
                throw new RuntimeException("Wait... but why? WTF!? Really shouldn't happen any more after fixing https://github.com/danikula/AndroidVideoCache/issues/43. If you read it on your device log, please, notify me danikula@gmail.com or create issue here https://github.com/danikula/AndroidVideoCache/issues.", e);
            }
        }
    }

    @Override // com.danikula.videocache.Source
    public int read(byte[] bArr) throws ProxyCacheException {
        InputStream inputStream = this.inputStream;
        if (inputStream == null) {
            throw new ProxyCacheException("Error reading data from " + this.sourceInfo.url + ": connection is absent!");
        }
        try {
            return inputStream.read(bArr, 0, bArr.length);
        } catch (InterruptedIOException e) {
            throw new InterruptedProxyCacheException("Reading source " + this.sourceInfo.url + " is interrupted", e);
        } catch (IOException e2) {
            throw new ProxyCacheException("Error reading data from " + this.sourceInfo.url, e2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0086  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void fetchContentInfo() throws com.danikula.videocache.ProxyCacheException {
        /*
            r9 = this;
            java.lang.String r0 = "Source info fetched: "
            java.lang.String r1 = "Error fetching info from "
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "Read content info from "
            r2.<init>(r3)
            com.danikula.videocache.SourceInfo r3 = r9.sourceInfo
            java.lang.String r3 = r3.url
            java.lang.StringBuilder r2 = r2.append(r3)
            java.lang.String r2 = r2.toString()
            com.danikula.videocache.Logger.debug(r2)
            r2 = 0
            r4 = 10000(0x2710, float:1.4013E-41)
            r5 = 0
            java.net.HttpURLConnection r2 = r9.openConnection(r2, r4)     // Catch: java.lang.Throwable -> L60 java.io.IOException -> L63
            long r3 = r9.getContentLength(r2)     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L64
            java.lang.String r6 = r2.getContentType()     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L64
            java.io.InputStream r5 = r2.getInputStream()     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L64
            com.danikula.videocache.SourceInfo r7 = new com.danikula.videocache.SourceInfo     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L64
            com.danikula.videocache.SourceInfo r8 = r9.sourceInfo     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L64
            java.lang.String r8 = r8.url     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L64
            r7.<init>(r8, r3, r6)     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L64
            r9.sourceInfo = r7     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L64
            com.danikula.videocache.sourcestorage.SourceInfoStorage r3 = r9.sourceInfoStorage     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L64
            java.lang.String r4 = r7.url     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L64
            com.danikula.videocache.SourceInfo r6 = r9.sourceInfo     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L64
            r3.put(r4, r6)     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L64
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L64
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L64
            com.danikula.videocache.SourceInfo r0 = r9.sourceInfo     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L64
            java.lang.StringBuilder r0 = r3.append(r0)     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L64
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L64
            com.danikula.videocache.Logger.debug(r0)     // Catch: java.lang.Throwable -> L5e java.io.IOException -> L64
            com.danikula.videocache.ProxyCacheUtils.close(r5)
            if (r2 == 0) goto L80
            r2.disconnect()
            return
        L5e:
            r0 = move-exception
            goto L81
        L60:
            r0 = move-exception
            r2 = r5
            goto L81
        L63:
            r2 = r5
        L64:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L5e
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L5e
            com.danikula.videocache.SourceInfo r1 = r9.sourceInfo     // Catch: java.lang.Throwable -> L5e
            java.lang.String r1 = r1.url     // Catch: java.lang.Throwable -> L5e
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.Throwable -> L5e
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> L5e
            com.danikula.videocache.Logger.error(r0)     // Catch: java.lang.Throwable -> L5e
            com.danikula.videocache.ProxyCacheUtils.close(r5)
            if (r2 == 0) goto L80
            r2.disconnect()
        L80:
            return
        L81:
            com.danikula.videocache.ProxyCacheUtils.close(r5)
            if (r2 == 0) goto L89
            r2.disconnect()
        L89:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.danikula.videocache.HttpUrlSource.fetchContentInfo():void");
    }

    private HttpURLConnection openConnection(long j, int i) throws IOException, ProxyCacheException {
        HttpURLConnection httpURLConnection;
        boolean z;
        String str = this.sourceInfo.url;
        int i2 = 0;
        do {
            Logger.debug("Open connection " + (j > 0 ? " with offset " + j : "") + " to " + str);
            httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
            injectCustomHeaders(httpURLConnection, str);
            if (j > 0) {
                httpURLConnection.setRequestProperty("Range", "bytes=" + j + Constants.ACCEPT_TIME_SEPARATOR_SERVER);
            }
            if (i > 0) {
                httpURLConnection.setConnectTimeout(i);
                httpURLConnection.setReadTimeout(i);
            }
            int responseCode = httpURLConnection.getResponseCode();
            z = responseCode == 301 || responseCode == 302 || responseCode == 303;
            if (z) {
                str = httpURLConnection.getHeaderField("Location");
                i2++;
                httpURLConnection.disconnect();
            }
            if (i2 > 5) {
                throw new ProxyCacheException("Too many redirects: " + i2);
            }
        } while (z);
        return httpURLConnection;
    }

    private void injectCustomHeaders(HttpURLConnection httpURLConnection, String str) {
        for (Map.Entry<String, String> entry : this.headerInjector.addHeaders(str).entrySet()) {
            httpURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
        }
    }

    public synchronized String getMime() throws ProxyCacheException {
        if (TextUtils.isEmpty(this.sourceInfo.mime)) {
            fetchContentInfo();
        }
        return this.sourceInfo.mime;
    }

    public String getUrl() {
        return this.sourceInfo.url;
    }

    public String toString() {
        return "HttpUrlSource{sourceInfo='" + this.sourceInfo + "}";
    }
}
