package com.anythink.core.common.n.c;

import android.gov.nist.core.Separators;
import com.anythink.core.common.n.c.a.AnonymousClass1;
import com.anythink.core.common.n.c.a.AnonymousClass2;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.nio.file.Files;
import java.nio.file.OpenOption;
import java.nio.file.Path;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes12.dex */
public final class n {

    /* renamed from: a, reason: collision with root package name */
    static final Logger f4230a = Logger.getLogger(n.class.getName());

    private n() {
    }

    public static e a(w wVar) {
        return new r(wVar);
    }

    public static d a(v vVar) {
        return new q(vVar);
    }

    private static v a(OutputStream outputStream) {
        return a(outputStream, new x());
    }

    private static v a(final OutputStream outputStream, final x xVar) {
        if (outputStream == null) {
            throw new IllegalArgumentException("out == null");
        }
        if (xVar == null) {
            throw new IllegalArgumentException("timeout == null");
        }
        return new v() { // from class: com.anythink.core.common.n.c.n.1
            @Override // com.anythink.core.common.n.c.v
            public final void a(c cVar, long j) {
                y.a(cVar.c, 0L, j);
                while (j > 0) {
                    x.this.g();
                    s sVar = cVar.b;
                    int min = (int) Math.min(j, sVar.e - sVar.d);
                    outputStream.write(sVar.c, sVar.d, min);
                    sVar.d += min;
                    long j2 = min;
                    j -= j2;
                    cVar.c -= j2;
                    if (sVar.d == sVar.e) {
                        cVar.b = sVar.c();
                        t.a(sVar);
                    }
                }
            }

            @Override // com.anythink.core.common.n.c.v, java.io.Flushable
            public final void flush() {
                outputStream.flush();
            }

            @Override // com.anythink.core.common.n.c.v, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                outputStream.close();
            }

            @Override // com.anythink.core.common.n.c.v
            public final x a() {
                return x.this;
            }

            public final String toString() {
                return "sink(" + outputStream + Separators.RPAREN;
            }
        };
    }

    public static v a(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        if (socket.getOutputStream() == null) {
            throw new IOException("socket's output stream == null");
        }
        a c = c(socket);
        return c.new AnonymousClass1(a(socket.getOutputStream(), c));
    }

    public static w a(InputStream inputStream) {
        return a(inputStream, new x());
    }

    private static w a(final InputStream inputStream, final x xVar) {
        if (inputStream == null) {
            throw new IllegalArgumentException("in == null");
        }
        if (xVar == null) {
            throw new IllegalArgumentException("timeout == null");
        }
        return new w() { // from class: com.anythink.core.common.n.c.n.2
            @Override // com.anythink.core.common.n.c.w
            public final long a_(c cVar, long j) {
                if (j < 0) {
                    throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
                }
                if (j == 0) {
                    return 0L;
                }
                try {
                    x.this.g();
                    s g = cVar.g(1);
                    int read = inputStream.read(g.c, g.e, (int) Math.min(j, 8192 - g.e));
                    if (read == -1) {
                        return -1L;
                    }
                    g.e += read;
                    long j2 = read;
                    cVar.c += j2;
                    return j2;
                } catch (AssertionError e) {
                    if (n.a(e)) {
                        throw new IOException(e);
                    }
                    throw e;
                }
            }

            @Override // com.anythink.core.common.n.c.w, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
                inputStream.close();
            }

            @Override // com.anythink.core.common.n.c.w
            public final x a() {
                return x.this;
            }

            public final String toString() {
                return "source(" + inputStream + Separators.RPAREN;
            }
        };
    }

    public static w a(File file) {
        if (file == null) {
            throw new IllegalArgumentException("file == null");
        }
        return a(new FileInputStream(file));
    }

    private static w a(Path path, OpenOption... openOptionArr) {
        if (path == null) {
            throw new IllegalArgumentException("path == null");
        }
        return a(Files.newInputStream(path, openOptionArr));
    }

    public static v b(File file) {
        if (file == null) {
            throw new IllegalArgumentException("file == null");
        }
        return a(new FileOutputStream(file));
    }

    public static v c(File file) {
        if (file == null) {
            throw new IllegalArgumentException("file == null");
        }
        return a(new FileOutputStream(file, true));
    }

    private static v b(Path path, OpenOption... openOptionArr) {
        if (path == null) {
            throw new IllegalArgumentException("path == null");
        }
        return a(Files.newOutputStream(path, openOptionArr));
    }

    public static v a() {
        return new v() { // from class: com.anythink.core.common.n.c.n.3
            @Override // com.anythink.core.common.n.c.v, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
            }

            @Override // com.anythink.core.common.n.c.v, java.io.Flushable
            public final void flush() {
            }

            @Override // com.anythink.core.common.n.c.v
            public final void a(c cVar, long j) {
                cVar.i(j);
            }

            @Override // com.anythink.core.common.n.c.v
            public final x a() {
                return x.c;
            }
        };
    }

    public static w b(Socket socket) {
        if (socket == null) {
            throw new IllegalArgumentException("socket == null");
        }
        if (socket.getInputStream() == null) {
            throw new IOException("socket's input stream == null");
        }
        a c = c(socket);
        return c.new AnonymousClass2(a(socket.getInputStream(), c));
    }

    private static a c(final Socket socket) {
        return new a() { // from class: com.anythink.core.common.n.c.n.4
            @Override // com.anythink.core.common.n.c.a
            protected final IOException a(IOException iOException) {
                SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
                if (iOException != null) {
                    socketTimeoutException.initCause(iOException);
                }
                return socketTimeoutException;
            }

            @Override // com.anythink.core.common.n.c.a
            protected final void a() {
                try {
                    socket.close();
                } catch (AssertionError e) {
                    if (n.a(e)) {
                        n.f4230a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e);
                        return;
                    }
                    throw e;
                } catch (Exception e2) {
                    n.f4230a.log(Level.WARNING, "Failed to close timed out socket " + socket, (Throwable) e2);
                }
            }
        };
    }

    static boolean a(AssertionError assertionError) {
        return (assertionError.getCause() == null || assertionError.getMessage() == null || !assertionError.getMessage().contains("getsockname failed")) ? false : true;
    }
}
