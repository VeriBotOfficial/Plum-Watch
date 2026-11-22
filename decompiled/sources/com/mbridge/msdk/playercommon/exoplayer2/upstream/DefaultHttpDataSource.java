package com.mbridge.msdk.playercommon.exoplayer2.upstream;

import android.net.Uri;
import android.util.Log;
import com.facebook.react.animated.InterpolationAnimatedNode;
import com.mbridge.msdk.foundation.same.net.MBridgeHostnameVerifier;
import com.mbridge.msdk.playercommon.exoplayer2.upstream.HttpDataSource;
import com.mbridge.msdk.playercommon.exoplayer2.util.Assertions;
import com.mbridge.msdk.playercommon.exoplayer2.util.Predicate;
import com.mbridge.msdk.playercommon.exoplayer2.util.Util;
import com.xiaomi.mipush.sdk.Constants;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.lang.reflect.Method;
import java.net.NoRouteToHostException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;
import java.util.regex.Pattern;
import javax.net.ssl.HttpsURLConnection;

/* loaded from: classes17.dex */
public class DefaultHttpDataSource implements HttpDataSource {
    public static final int DEFAULT_CONNECT_TIMEOUT_MILLIS = 8000;
    public static final int DEFAULT_READ_TIMEOUT_MILLIS = 8000;
    private static final long MAX_BYTES_TO_DRAIN = 2048;
    private static final int MAX_REDIRECTS = 20;
    private static final String TAG = "DefaultHttpDataSource";
    private final boolean allowCrossProtocolRedirects;
    private long bytesRead;
    private long bytesSkipped;
    private long bytesToRead;
    private long bytesToSkip;
    private final int connectTimeoutMillis;
    private HttpsURLConnection connection;
    private final Predicate<String> contentTypePredicate;
    private DataSpec dataSpec;
    private final HttpDataSource.RequestProperties defaultRequestProperties;
    private InputStream inputStream;
    private final TransferListener<? super DefaultHttpDataSource> listener;
    private boolean opened;
    private final int readTimeoutMillis;
    private final HttpDataSource.RequestProperties requestProperties;
    private final String userAgent;
    private static final Pattern CONTENT_RANGE_HEADER = Pattern.compile("^bytes (\\d+)-(\\d+)/(\\d+)$");
    private static final AtomicReference<byte[]> skipBufferReference = new AtomicReference<>();

    public DefaultHttpDataSource(String str, Predicate<String> predicate) {
        this(str, predicate, null);
    }

    private void closeConnectionQuietly() {
        HttpsURLConnection httpsURLConnection = this.connection;
        if (httpsURLConnection != null) {
            try {
                httpsURLConnection.disconnect();
            } catch (Exception e) {
                Log.e(TAG, "Unexpected error while disconnecting", e);
            }
            this.connection = null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:6:0x003b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static long getContentLength(javax.net.ssl.HttpsURLConnection r11) {
        /*
            java.lang.String r0 = "Inconsistent headers ["
            java.lang.String r1 = "Content-Length"
            java.lang.String r1 = r11.getHeaderField(r1)
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            java.lang.String r3 = "DefaultHttpDataSource"
            java.lang.String r4 = "]"
            if (r2 != 0) goto L2d
            long r5 = java.lang.Long.parseLong(r1)     // Catch: java.lang.NumberFormatException -> L17
            goto L2f
        L17:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r5 = "Unexpected Content-Length ["
            r2.<init>(r5)
            java.lang.StringBuilder r2 = r2.append(r1)
            java.lang.StringBuilder r2 = r2.append(r4)
            java.lang.String r2 = r2.toString()
            android.util.Log.e(r3, r2)
        L2d:
            r5 = -1
        L2f:
            java.lang.String r2 = "Content-Range"
            java.lang.String r11 = r11.getHeaderField(r2)
            boolean r2 = android.text.TextUtils.isEmpty(r11)
            if (r2 != 0) goto La2
            java.util.regex.Pattern r2 = com.mbridge.msdk.playercommon.exoplayer2.upstream.DefaultHttpDataSource.CONTENT_RANGE_HEADER
            java.util.regex.Matcher r2 = r2.matcher(r11)
            boolean r7 = r2.find()
            if (r7 == 0) goto La2
            r7 = 2
            java.lang.String r7 = r2.group(r7)     // Catch: java.lang.NumberFormatException -> L8c
            long r7 = java.lang.Long.parseLong(r7)     // Catch: java.lang.NumberFormatException -> L8c
            r9 = 1
            java.lang.String r2 = r2.group(r9)     // Catch: java.lang.NumberFormatException -> L8c
            long r9 = java.lang.Long.parseLong(r2)     // Catch: java.lang.NumberFormatException -> L8c
            long r7 = r7 - r9
            r9 = 1
            long r7 = r7 + r9
            r9 = 0
            int r2 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r2 >= 0) goto L65
            r5 = r7
            goto La2
        L65:
            int r2 = (r5 > r7 ? 1 : (r5 == r7 ? 0 : -1))
            if (r2 == 0) goto La2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.NumberFormatException -> L8c
            r2.<init>(r0)     // Catch: java.lang.NumberFormatException -> L8c
            java.lang.StringBuilder r0 = r2.append(r1)     // Catch: java.lang.NumberFormatException -> L8c
            java.lang.String r1 = "] ["
            java.lang.StringBuilder r0 = r0.append(r1)     // Catch: java.lang.NumberFormatException -> L8c
            java.lang.StringBuilder r0 = r0.append(r11)     // Catch: java.lang.NumberFormatException -> L8c
            java.lang.StringBuilder r0 = r0.append(r4)     // Catch: java.lang.NumberFormatException -> L8c
            java.lang.String r0 = r0.toString()     // Catch: java.lang.NumberFormatException -> L8c
            android.util.Log.w(r3, r0)     // Catch: java.lang.NumberFormatException -> L8c
            long r5 = java.lang.Math.max(r5, r7)     // Catch: java.lang.NumberFormatException -> L8c
            goto La2
        L8c:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Unexpected Content-Range ["
            r0.<init>(r1)
            java.lang.StringBuilder r11 = r0.append(r11)
            java.lang.StringBuilder r11 = r11.append(r4)
            java.lang.String r11 = r11.toString()
            android.util.Log.e(r3, r11)
        La2:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.mbridge.msdk.playercommon.exoplayer2.upstream.DefaultHttpDataSource.getContentLength(javax.net.ssl.HttpsURLConnection):long");
    }

    private static URL handleRedirect(URL url, String str) throws IOException {
        if (str == null) {
            throw new ProtocolException("Null location redirect");
        }
        URL url2 = new URL(url, str);
        String protocol = url2.getProtocol();
        if ("https".equals(protocol) || "http".equals(protocol)) {
            return url2;
        }
        throw new ProtocolException("Unsupported protocol redirect: " + protocol);
    }

    private HttpsURLConnection makeConnection(DataSpec dataSpec) throws IOException {
        HttpsURLConnection makeConnection;
        URL url = new URL(dataSpec.uri.toString());
        byte[] bArr = dataSpec.postBody;
        long j = dataSpec.position;
        long j2 = dataSpec.length;
        boolean isFlagSet = dataSpec.isFlagSet(1);
        if (!this.allowCrossProtocolRedirects) {
            return makeConnection(url, bArr, j, j2, isFlagSet, true);
        }
        int i = 0;
        while (true) {
            int i2 = i + 1;
            if (i > 20) {
                throw new NoRouteToHostException("Too many redirects: " + i2);
            }
            long j3 = j2;
            boolean z = isFlagSet;
            long j4 = j;
            makeConnection = makeConnection(url, bArr, j4, j3, z, false);
            j = j4;
            j2 = j3;
            isFlagSet = z;
            int responseCode = makeConnection.getResponseCode();
            if (responseCode == 300 || responseCode == 301 || responseCode == 302 || responseCode == 303 || (bArr == null && (responseCode == 307 || responseCode == 308))) {
                String headerField = makeConnection.getHeaderField("Location");
                makeConnection.disconnect();
                url = handleRedirect(url, headerField);
                bArr = null;
                i = i2;
            }
        }
        return makeConnection;
    }

    private static void maybeTerminateInputStream(HttpsURLConnection httpsURLConnection, long j) {
        int i = Util.SDK_INT;
        if (i == 19 || i == 20) {
            try {
                InputStream inputStream = httpsURLConnection.getInputStream();
                if (j == -1) {
                    if (inputStream.read() == -1) {
                        return;
                    }
                } else if (j <= 2048) {
                    return;
                }
                String name = inputStream.getClass().getName();
                if ("com.android.okhttp.internal.http.HttpTransport$ChunkedInputStream".equals(name) || "com.android.okhttp.internal.http.HttpTransport$FixedLengthInputStream".equals(name)) {
                    Method declaredMethod = inputStream.getClass().getSuperclass().getDeclaredMethod("unexpectedEndOfInput", new Class[0]);
                    declaredMethod.setAccessible(true);
                    declaredMethod.invoke(inputStream, new Object[0]);
                }
            } catch (Exception unused) {
            }
        }
    }

    private int readInternal(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        long j = this.bytesToRead;
        if (j != -1) {
            long j2 = j - this.bytesRead;
            if (j2 == 0) {
                return -1;
            }
            i2 = (int) Math.min(i2, j2);
        }
        int read = this.inputStream.read(bArr, i, i2);
        if (read == -1) {
            if (this.bytesToRead == -1) {
                return -1;
            }
            throw new EOFException();
        }
        this.bytesRead += read;
        TransferListener<? super DefaultHttpDataSource> transferListener = this.listener;
        if (transferListener != null) {
            transferListener.onBytesTransferred(this, read);
        }
        return read;
    }

    private void skipInternal() throws IOException {
        if (this.bytesSkipped == this.bytesToSkip) {
            return;
        }
        byte[] andSet = skipBufferReference.getAndSet(null);
        if (andSet == null) {
            andSet = new byte[4096];
        }
        while (true) {
            long j = this.bytesSkipped;
            long j2 = this.bytesToSkip;
            if (j == j2) {
                skipBufferReference.set(andSet);
                return;
            }
            int read = this.inputStream.read(andSet, 0, (int) Math.min(j2 - j, andSet.length));
            if (Thread.currentThread().isInterrupted()) {
                throw new InterruptedIOException();
            }
            if (read == -1) {
                throw new EOFException();
            }
            this.bytesSkipped += read;
            TransferListener<? super DefaultHttpDataSource> transferListener = this.listener;
            if (transferListener != null) {
                transferListener.onBytesTransferred(this, read);
            }
        }
    }

    protected final long bytesRead() {
        return this.bytesRead;
    }

    protected final long bytesRemaining() {
        long j = this.bytesToRead;
        return j == -1 ? j : j - this.bytesRead;
    }

    protected final long bytesSkipped() {
        return this.bytesSkipped;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.HttpDataSource
    public void clearAllRequestProperties() {
        this.requestProperties.clear();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.HttpDataSource
    public void clearRequestProperty(String str) {
        Assertions.checkNotNull(str);
        this.requestProperties.remove(str);
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.HttpDataSource, com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    public void close() throws HttpDataSource.HttpDataSourceException {
        try {
            if (this.inputStream != null) {
                maybeTerminateInputStream(this.connection, bytesRemaining());
                try {
                    this.inputStream.close();
                } catch (IOException e) {
                    throw new HttpDataSource.HttpDataSourceException(e, this.dataSpec, 3);
                }
            }
        } finally {
            this.inputStream = null;
            closeConnectionQuietly();
            if (this.opened) {
                this.opened = false;
                TransferListener<? super DefaultHttpDataSource> transferListener = this.listener;
                if (transferListener != null) {
                    transferListener.onTransferEnd(this);
                }
            }
        }
    }

    protected final HttpsURLConnection getConnection() {
        return this.connection;
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.HttpDataSource
    public Map<String, List<String>> getResponseHeaders() {
        HttpsURLConnection httpsURLConnection = this.connection;
        if (httpsURLConnection == null) {
            return null;
        }
        return httpsURLConnection.getHeaderFields();
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    public Uri getUri() {
        HttpsURLConnection httpsURLConnection = this.connection;
        if (httpsURLConnection == null) {
            return null;
        }
        return Uri.parse(httpsURLConnection.getURL().toString());
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.HttpDataSource, com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    public long open(DataSpec dataSpec) throws HttpDataSource.HttpDataSourceException {
        this.dataSpec = dataSpec;
        long j = 0;
        this.bytesRead = 0L;
        this.bytesSkipped = 0L;
        try {
            HttpsURLConnection makeConnection = makeConnection(dataSpec);
            this.connection = makeConnection;
            try {
                int responseCode = makeConnection.getResponseCode();
                if (responseCode < 200 || responseCode > 299) {
                    Map<String, List<String>> headerFields = this.connection.getHeaderFields();
                    closeConnectionQuietly();
                    HttpDataSource.InvalidResponseCodeException invalidResponseCodeException = new HttpDataSource.InvalidResponseCodeException(responseCode, headerFields, dataSpec);
                    if (responseCode != 416) {
                        throw invalidResponseCodeException;
                    }
                    invalidResponseCodeException.initCause(new DataSourceException(0));
                    throw invalidResponseCodeException;
                }
                String contentType = this.connection.getContentType();
                Predicate<String> predicate = this.contentTypePredicate;
                if (predicate != null && !predicate.evaluate(contentType)) {
                    closeConnectionQuietly();
                    throw new HttpDataSource.InvalidContentTypeException(contentType, dataSpec);
                }
                if (responseCode == 200) {
                    long j2 = dataSpec.position;
                    if (j2 != 0) {
                        j = j2;
                    }
                }
                this.bytesToSkip = j;
                if (dataSpec.isFlagSet(1)) {
                    this.bytesToRead = dataSpec.length;
                } else {
                    long j3 = dataSpec.length;
                    if (j3 != -1) {
                        this.bytesToRead = j3;
                    } else {
                        long contentLength = getContentLength(this.connection);
                        this.bytesToRead = contentLength != -1 ? contentLength - this.bytesToSkip : -1L;
                    }
                }
                try {
                    this.inputStream = this.connection.getInputStream();
                    this.opened = true;
                    TransferListener<? super DefaultHttpDataSource> transferListener = this.listener;
                    if (transferListener != null) {
                        transferListener.onTransferStart(this, dataSpec);
                    }
                    return this.bytesToRead;
                } catch (IOException e) {
                    closeConnectionQuietly();
                    throw new HttpDataSource.HttpDataSourceException(e, dataSpec, 1);
                }
            } catch (IOException e2) {
                closeConnectionQuietly();
                throw new HttpDataSource.HttpDataSourceException("Unable to connect to " + dataSpec.uri.toString(), e2, dataSpec, 1);
            }
        } catch (IOException e3) {
            throw new HttpDataSource.HttpDataSourceException("Unable to connect to " + dataSpec.uri.toString(), e3, dataSpec, 1);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.HttpDataSource, com.mbridge.msdk.playercommon.exoplayer2.upstream.DataSource
    public int read(byte[] bArr, int i, int i2) throws HttpDataSource.HttpDataSourceException {
        try {
            skipInternal();
            return readInternal(bArr, i, i2);
        } catch (IOException e) {
            throw new HttpDataSource.HttpDataSourceException(e, this.dataSpec, 2);
        }
    }

    @Override // com.mbridge.msdk.playercommon.exoplayer2.upstream.HttpDataSource
    public void setRequestProperty(String str, String str2) {
        Assertions.checkNotNull(str);
        Assertions.checkNotNull(str2);
        this.requestProperties.set(str, str2);
    }

    public DefaultHttpDataSource(String str, Predicate<String> predicate, TransferListener<? super DefaultHttpDataSource> transferListener) {
        this(str, predicate, transferListener, 8000, 8000);
    }

    public DefaultHttpDataSource(String str, Predicate<String> predicate, TransferListener<? super DefaultHttpDataSource> transferListener, int i, int i2) {
        this(str, predicate, transferListener, i, i2, false, null);
    }

    public DefaultHttpDataSource(String str, Predicate<String> predicate, TransferListener<? super DefaultHttpDataSource> transferListener, int i, int i2, boolean z, HttpDataSource.RequestProperties requestProperties) {
        this.userAgent = Assertions.checkNotEmpty(str);
        this.contentTypePredicate = predicate;
        this.listener = transferListener;
        this.requestProperties = new HttpDataSource.RequestProperties();
        this.connectTimeoutMillis = i;
        this.readTimeoutMillis = i2;
        this.allowCrossProtocolRedirects = z;
        this.defaultRequestProperties = requestProperties;
    }

    private HttpsURLConnection makeConnection(URL url, byte[] bArr, long j, long j2, boolean z, boolean z2) throws IOException {
        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) url.openConnection();
        httpsURLConnection.setHostnameVerifier(new MBridgeHostnameVerifier(url));
        httpsURLConnection.setConnectTimeout(this.connectTimeoutMillis);
        httpsURLConnection.setReadTimeout(this.readTimeoutMillis);
        HttpDataSource.RequestProperties requestProperties = this.defaultRequestProperties;
        if (requestProperties != null) {
            for (Map.Entry<String, String> entry : requestProperties.getSnapshot().entrySet()) {
                httpsURLConnection.setRequestProperty(entry.getKey(), entry.getValue());
            }
        }
        for (Map.Entry<String, String> entry2 : this.requestProperties.getSnapshot().entrySet()) {
            httpsURLConnection.setRequestProperty(entry2.getKey(), entry2.getValue());
        }
        if (j != 0 || j2 != -1) {
            String str = "bytes=" + j + Constants.ACCEPT_TIME_SEPARATOR_SERVER;
            if (j2 != -1) {
                str = str + ((j + j2) - 1);
            }
            httpsURLConnection.setRequestProperty("Range", str);
        }
        httpsURLConnection.setRequestProperty("User-Agent", this.userAgent);
        if (!z) {
            httpsURLConnection.setRequestProperty("Accept-Encoding", InterpolationAnimatedNode.EXTRAPOLATE_TYPE_IDENTITY);
        }
        httpsURLConnection.setInstanceFollowRedirects(z2);
        httpsURLConnection.setDoOutput(bArr != null);
        if (bArr != null) {
            httpsURLConnection.setRequestMethod("POST");
            if (bArr.length == 0) {
                httpsURLConnection.connect();
                return httpsURLConnection;
            }
            httpsURLConnection.setFixedLengthStreamingMode(bArr.length);
            httpsURLConnection.connect();
            OutputStream outputStream = httpsURLConnection.getOutputStream();
            outputStream.write(bArr);
            outputStream.close();
            return httpsURLConnection;
        }
        httpsURLConnection.connect();
        return httpsURLConnection;
    }
}
