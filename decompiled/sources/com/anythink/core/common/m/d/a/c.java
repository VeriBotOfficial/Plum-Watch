package com.anythink.core.common.m.d.a;

import com.anythink.core.common.m.b.h;
import com.anythink.core.common.m.d.d;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketException;

/* loaded from: classes12.dex */
public abstract class c {
    private static final int c = 0;
    private static final int d = 7;

    /* renamed from: a, reason: collision with root package name */
    protected Socket f4009a;
    private String e;
    private int f;
    private final String b = getClass().getSimpleName();
    private byte[] g = null;
    private final byte[] h = new byte[1];

    protected abstract void a(d dVar, d.a aVar);

    private void a(d dVar) {
        synchronized (this) {
            if (this.f4009a == null) {
                Socket socket = new Socket();
                this.f4009a = socket;
                socket.setSoTimeout(60000);
            }
            h e_ = dVar.e_();
            if (e_ != null) {
                this.e = e_.a();
                int b = e_.b();
                this.f = b;
                new Object[]{this.e, Integer.valueOf(b)};
                this.f4009a.connect(new InetSocketAddress(this.e, this.f), 30000);
            } else {
                throw new IllegalArgumentException("The domain must not can be null or empty.");
            }
        }
    }

    private void a() {
        synchronized (this) {
            try {
                Socket socket = this.f4009a;
                if (socket != null) {
                    socket.close();
                    this.f4009a = null;
                }
            } catch (Exception unused) {
            }
        }
    }

    private boolean b() {
        Socket socket = this.f4009a;
        return (socket == null || !socket.isConnected() || this.f4009a.isClosed()) ? false : true;
    }

    public final void b(final d dVar, final d.a aVar) {
        com.anythink.core.common.v.b.d dVar2 = new com.anythink.core.common.v.b.d() { // from class: com.anythink.core.common.m.d.a.c.1
            /* JADX WARN: Removed duplicated region for block: B:16:0x0094  */
            /* JADX WARN: Removed duplicated region for block: B:18:? A[RETURN, SYNTHETIC] */
            @Override // com.anythink.core.common.v.b.d
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void a() {
                /*
                    r6 = this;
                    com.anythink.core.common.m.d.a.c r0 = com.anythink.core.common.m.d.a.c.this     // Catch: java.lang.Throwable -> L11 java.net.SocketException -> L1f
                    com.anythink.core.common.m.d.d r1 = r2     // Catch: java.lang.Throwable -> L11 java.net.SocketException -> L1f
                    com.anythink.core.common.m.d.a.c.a(r0, r1)     // Catch: java.lang.Throwable -> L11 java.net.SocketException -> L1f
                    com.anythink.core.common.m.d.a.c r0 = com.anythink.core.common.m.d.a.c.this     // Catch: java.lang.Throwable -> L11 java.net.SocketException -> L1f
                    com.anythink.core.common.m.d.d r1 = r2     // Catch: java.lang.Throwable -> L11 java.net.SocketException -> L1f
                    com.anythink.core.common.m.d.d$a r2 = r3     // Catch: java.lang.Throwable -> L11 java.net.SocketException -> L1f
                    r0.a(r1, r2)     // Catch: java.lang.Throwable -> L11 java.net.SocketException -> L1f
                    return
                L11:
                    r0 = move-exception
                    com.anythink.core.common.m.d.a.c r1 = com.anythink.core.common.m.d.a.c.this
                    com.anythink.core.common.m.d.a.c.a(r1)
                    java.lang.String r1 = r0.getMessage()
                    new java.lang.Object[]{r1}
                    goto L52
                L1f:
                    r0 = move-exception
                    com.anythink.core.common.m.d.a.c r1 = com.anythink.core.common.m.d.a.c.this
                    com.anythink.core.common.m.d.a.c.a(r1)
                    r0.getMessage()
                    com.anythink.core.common.m.d.d r1 = r2
                    r1.toString()
                    com.anythink.core.common.m.d.a.c r1 = com.anythink.core.common.m.d.a.c.this
                    com.anythink.core.common.m.d.a.c.b(r1)
                    com.anythink.core.common.m.d.a.c r1 = com.anythink.core.common.m.d.a.c.this     // Catch: java.lang.Throwable -> L43
                    com.anythink.core.common.m.d.d r2 = r2     // Catch: java.lang.Throwable -> L43
                    com.anythink.core.common.m.d.a.c.a(r1, r2)     // Catch: java.lang.Throwable -> L43
                    com.anythink.core.common.m.d.a.c r1 = com.anythink.core.common.m.d.a.c.this     // Catch: java.lang.Throwable -> L43
                    com.anythink.core.common.m.d.d r2 = r2     // Catch: java.lang.Throwable -> L43
                    com.anythink.core.common.m.d.d$a r3 = r3     // Catch: java.lang.Throwable -> L43
                    r1.a(r2, r3)     // Catch: java.lang.Throwable -> L43
                    goto L97
                L43:
                    r1 = move-exception
                    com.anythink.core.common.m.d.a.c r2 = com.anythink.core.common.m.d.a.c.this
                    com.anythink.core.common.m.d.a.c.a(r2)
                    r0.getMessage()
                    com.anythink.core.common.m.d.d r0 = r2
                    r0.toString()
                    r0 = r1
                L52:
                    java.lang.StringBuilder r1 = new java.lang.StringBuilder
                    r1.<init>()
                    java.lang.String r2 = r0.getMessage()
                    java.lang.StringBuilder r1 = r1.append(r2)
                    java.lang.String r2 = ","
                    java.lang.StringBuilder r1 = r1.append(r2)
                    java.lang.StackTraceElement[] r2 = r0.getStackTrace()
                    java.lang.String r2 = com.anythink.core.common.v.q.a(r2)
                    java.lang.StringBuilder r1 = r1.append(r2)
                    java.lang.String r1 = r1.toString()
                    com.anythink.core.common.m.d.a.c r2 = com.anythink.core.common.m.d.a.c.this
                    com.anythink.core.common.m.d.a.c.a(r2)
                    new java.lang.Object[]{r1}
                    com.anythink.core.common.m.d.d r2 = r2
                    com.anythink.core.common.m.d.a.c r3 = com.anythink.core.common.m.d.a.c.this
                    java.lang.String r3 = com.anythink.core.common.m.d.a.c.c(r3)
                    com.anythink.core.common.m.d.a.c r4 = com.anythink.core.common.m.d.a.c.this
                    int r4 = com.anythink.core.common.m.d.a.c.d(r4)
                    java.lang.String r5 = ""
                    r2.a(r5, r1, r3, r4)
                    com.anythink.core.common.m.d.d$a r1 = r3
                    if (r1 == 0) goto L97
                    r1.a(r0)
                L97:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.m.d.a.c.AnonymousClass1.a():void");
            }
        };
        if (dVar.c() == 6) {
            com.anythink.core.common.v.b.b.a().a(dVar2, 2);
        } else {
            com.anythink.core.common.v.b.b.a().a(dVar2, 3);
        }
    }

    protected final int a(InputStream inputStream) {
        if (inputStream.read(this.h, 0, 1) == -1) {
            throw new SocketException("Socket.InputStream read length = -1!");
        }
        byte[] bArr = this.h;
        byte b = bArr[0];
        bArr[0] = 0;
        return b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void b(d dVar) {
        Socket socket = this.f4009a;
        if (socket == null || !socket.isConnected() || this.f4009a.isClosed()) {
            synchronized (this) {
                if (this.f4009a == null) {
                    Socket socket2 = new Socket();
                    this.f4009a = socket2;
                    socket2.setSoTimeout(60000);
                }
                h e_ = dVar.e_();
                if (e_ != null) {
                    this.e = e_.a();
                    int b = e_.b();
                    this.f = b;
                    new Object[]{this.e, Integer.valueOf(b)};
                    this.f4009a.connect(new InetSocketAddress(this.e, this.f), 30000);
                } else {
                    throw new IllegalArgumentException("The domain must not can be null or empty.");
                }
            }
        }
        byte[] e = dVar.e();
        if (e != null) {
            int length = e.length;
            if (e.length == 0) {
                return;
            }
            int i = length + 7;
            byte[] bArr = this.g;
            if (bArr == null || bArr.length < i) {
                this.g = new byte[i];
            }
            byte[] bArr2 = this.g;
            bArr2[0] = 0;
            bArr2[1] = 3;
            bArr2[2] = (byte) dVar.c();
            byte[] bArr3 = this.g;
            bArr3[3] = (byte) ((length >>> 24) & 255);
            bArr3[4] = (byte) ((length >>> 16) & 255);
            bArr3[5] = (byte) ((length >>> 8) & 255);
            bArr3[6] = (byte) (length & 255);
            System.arraycopy(e, 0, bArr3, 7, e.length);
            OutputStream outputStream = this.f4009a.getOutputStream();
            outputStream.write(this.g, 0, i);
            outputStream.flush();
        }
    }

    static /* synthetic */ void b(c cVar) {
        synchronized (cVar) {
            try {
                Socket socket = cVar.f4009a;
                if (socket != null) {
                    socket.close();
                    cVar.f4009a = null;
                }
            } catch (Exception unused) {
            }
        }
    }
}
