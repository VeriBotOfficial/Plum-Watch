package com.anythink.core.common.res.image;

import android.os.SystemClock;
import com.anythink.core.common.v.b.d;
import java.io.InputStream;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;
import java.util.Map;
import org.apache.http.conn.ConnectTimeoutException;

/* loaded from: classes12.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private final String f4303a = getClass().getSimpleName();
    protected String d;
    protected boolean e;
    protected long f;
    protected long g;
    protected long h;
    protected long i;
    protected long j;

    private static int g() {
        return 60000;
    }

    private static int h() {
        return 60000;
    }

    protected abstract Map<String, String> a();

    protected abstract void a(d dVar);

    protected abstract void a(String str, String str2);

    protected abstract boolean a(InputStream inputStream);

    protected abstract void b();

    protected abstract void c();

    public b(String str) {
        this.d = str;
    }

    public final void d() {
        this.e = false;
        a(new AnonymousClass1());
    }

    private void e() {
        this.e = true;
    }

    /* renamed from: com.anythink.core.common.res.image.b$1, reason: invalid class name */
    final class AnonymousClass1 extends d {
        AnonymousClass1() {
        }

        @Override // com.anythink.core.common.v.b.d
        public final void a() {
            try {
                b(b.this.d);
            } catch (Exception e) {
                String unused = b.this.f4303a;
                e.getMessage();
                b.this.a(c.f4305a, e.getMessage());
            } catch (OutOfMemoryError e2) {
                e = e2;
                System.gc();
                b.this.a(c.f4305a, e.getMessage());
            } catch (StackOverflowError e3) {
                e = e3;
                System.gc();
                b.this.a(c.f4305a, e.getMessage());
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r1v10, types: [java.net.HttpURLConnection] */
        /* JADX WARN: Type inference failed for: r1v11 */
        /* JADX WARN: Type inference failed for: r1v13 */
        /* JADX WARN: Type inference failed for: r1v14 */
        /* JADX WARN: Type inference failed for: r1v15 */
        /* JADX WARN: Type inference failed for: r1v16 */
        /* JADX WARN: Type inference failed for: r1v17 */
        /* JADX WARN: Type inference failed for: r1v18 */
        /* JADX WARN: Type inference failed for: r1v19 */
        /* JADX WARN: Type inference failed for: r1v2 */
        /* JADX WARN: Type inference failed for: r1v23, types: [boolean] */
        /* JADX WARN: Type inference failed for: r1v25, types: [int] */
        /* JADX WARN: Type inference failed for: r1v3 */
        /* JADX WARN: Type inference failed for: r1v30 */
        /* JADX WARN: Type inference failed for: r1v31 */
        /* JADX WARN: Type inference failed for: r1v34, types: [com.anythink.core.common.res.image.b] */
        /* JADX WARN: Type inference failed for: r1v38, types: [java.lang.StringBuilder] */
        /* JADX WARN: Type inference failed for: r1v39 */
        /* JADX WARN: Type inference failed for: r1v4, types: [java.net.HttpURLConnection] */
        /* JADX WARN: Type inference failed for: r1v40 */
        /* JADX WARN: Type inference failed for: r1v41 */
        /* JADX WARN: Type inference failed for: r1v42 */
        /* JADX WARN: Type inference failed for: r1v43 */
        /* JADX WARN: Type inference failed for: r1v44 */
        /* JADX WARN: Type inference failed for: r1v45 */
        /* JADX WARN: Type inference failed for: r1v46 */
        /* JADX WARN: Type inference failed for: r1v47 */
        /* JADX WARN: Type inference failed for: r1v48 */
        /* JADX WARN: Type inference failed for: r1v49 */
        /* JADX WARN: Type inference failed for: r1v5, types: [java.net.HttpURLConnection] */
        /* JADX WARN: Type inference failed for: r1v6, types: [java.net.HttpURLConnection] */
        /* JADX WARN: Type inference failed for: r1v7, types: [java.net.HttpURLConnection] */
        /* JADX WARN: Type inference failed for: r1v8, types: [java.net.HttpURLConnection] */
        /* JADX WARN: Type inference failed for: r1v9, types: [java.net.HttpURLConnection] */
        /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.StringBuilder] */
        /* JADX WARN: Type inference failed for: r5v2, types: [java.lang.StringBuilder] */
        private void b(String str) {
            HttpURLConnection httpURLConnection;
            b.this.f = System.currentTimeMillis();
            b.this.g = SystemClock.elapsedRealtime();
            ?? r1 = 0;
            r1 = 0;
            r1 = 0;
            r1 = 0;
            r1 = 0;
            r1 = 0;
            r1 = 0;
            try {
                try {
                    String unused = b.this.f4303a;
                    httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                } catch (Throwable th) {
                    th = th;
                }
                try {
                    httpURLConnection.setInstanceFollowRedirects(false);
                    Map<String, String> a2 = b.this.a();
                    if (a2 != null && a2.size() > 0) {
                        for (String str2 : a2.keySet()) {
                            httpURLConnection.addRequestProperty(str2, a2.get(str2));
                            String unused2 = b.this.f4303a;
                            new StringBuilder("REQUEST ADDED HEADER: \n").append(str2).append("  :  ");
                            a2.get(str2);
                        }
                    }
                    r1 = b.this.e;
                    if (r1 != 0) {
                        b.this.a(c.b, "Task had been canceled.");
                        if (httpURLConnection != null) {
                            httpURLConnection.disconnect();
                        }
                    } else {
                        httpURLConnection.setConnectTimeout(60000);
                        httpURLConnection.setReadTimeout(60000);
                        httpURLConnection.connect();
                        r1 = httpURLConnection.getResponseCode();
                        if (r1 != 200) {
                            String unused3 = b.this.f4303a;
                            new StringBuilder("http respond status code is ").append(r1).append(" ! url=");
                            if (r1 != 302 && r1 != 301 && r1 != 307) {
                                b bVar = b.this;
                                r1 = new StringBuilder("Resource download fail, status code: ").append(r1).append(", ").append(httpURLConnection.getResponseMessage()).append(", url: ");
                                bVar.a(c.f4305a, r1.append(str).toString());
                                if (httpURLConnection != null) {
                                    httpURLConnection.disconnect();
                                    return;
                                }
                            }
                            if (b.this.e) {
                                b.this.a(c.b, "Task had been canceled.");
                                r1 = r1;
                            } else {
                                String headerField = httpURLConnection.getHeaderField("Location");
                                r1 = r1;
                                if (headerField != null) {
                                    boolean startsWith = headerField.toLowerCase().startsWith("http");
                                    if (startsWith) {
                                        b(headerField);
                                        r1 = startsWith;
                                    } else {
                                        r1 = b.this;
                                        r1.a(c.f4305a, "Final url is wrong:".concat(String.valueOf(headerField)));
                                        if (httpURLConnection != null) {
                                            httpURLConnection.disconnect();
                                            return;
                                        }
                                    }
                                }
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                        } else if (b.this.e) {
                            b.this.a(c.b, "Task had been canceled.");
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                        } else {
                            b.this.j = httpURLConnection.getContentLength();
                            InputStream inputStream = httpURLConnection.getInputStream();
                            boolean a3 = b.this.a(inputStream);
                            if (inputStream != null) {
                                inputStream.close();
                            }
                            b.this.h = System.currentTimeMillis();
                            b.this.i = SystemClock.elapsedRealtime();
                            if (a3) {
                                String unused4 = b.this.f4303a;
                                String str3 = b.this.d;
                                b.this.c();
                                r1 = a3;
                            } else {
                                String unused5 = b.this.f4303a;
                                String str4 = b.this.d;
                                b.this.a(c.f4305a, "Save fail!");
                                r1 = "Save fail!";
                            }
                            if (httpURLConnection != null) {
                                httpURLConnection.disconnect();
                            }
                        }
                    }
                } catch (OutOfMemoryError e) {
                    e = e;
                    r1 = httpURLConnection;
                    System.gc();
                    String unused6 = b.this.f4303a;
                    e.getMessage();
                    b.this.a(c.f4305a, e.getMessage());
                    if (r1 != 0) {
                        r1.disconnect();
                    }
                } catch (StackOverflowError e2) {
                    e = e2;
                    r1 = httpURLConnection;
                    System.gc();
                    String unused7 = b.this.f4303a;
                    e.getMessage();
                    b.this.a(c.f4305a, e.getMessage());
                    if (r1 != 0) {
                        r1.disconnect();
                    }
                } catch (Error e3) {
                    e = e3;
                    r1 = httpURLConnection;
                    System.gc();
                    String unused8 = b.this.f4303a;
                    e.getMessage();
                    b.this.a(c.f4305a, e.getMessage());
                    if (r1 != 0) {
                        r1.disconnect();
                    }
                } catch (SocketTimeoutException e4) {
                    e = e4;
                    r1 = httpURLConnection;
                    b.this.a(c.f4305a, e.getMessage());
                    String unused9 = b.this.f4303a;
                    if (r1 != 0) {
                        r1.disconnect();
                    }
                } catch (ConnectTimeoutException e5) {
                    e = e5;
                    r1 = httpURLConnection;
                    b.this.a(c.f4305a, e.getMessage());
                    if (r1 != 0) {
                        r1.disconnect();
                    }
                } catch (Exception e6) {
                    e = e6;
                    r1 = httpURLConnection;
                    String unused10 = b.this.f4303a;
                    e.getMessage();
                    b.this.a(c.f4305a, e.getMessage());
                    if (r1 != 0) {
                        r1.disconnect();
                    }
                } catch (Throwable th2) {
                    th = th2;
                    r1 = httpURLConnection;
                    if (r1 != 0) {
                        r1.disconnect();
                    }
                    throw th;
                }
            } catch (OutOfMemoryError e7) {
                e = e7;
            } catch (StackOverflowError e8) {
                e = e8;
            } catch (Error e9) {
                e = e9;
            } catch (SocketTimeoutException e10) {
                e = e10;
            } catch (ConnectTimeoutException e11) {
                e = e11;
            } catch (Exception e12) {
                e = e12;
            }
        }
    }

    private void f() {
        a(new AnonymousClass1());
    }
}
