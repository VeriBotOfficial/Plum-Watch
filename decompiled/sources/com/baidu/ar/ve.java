package com.baidu.ar;

import io.nats.client.support.NatsConstants;
import java.io.IOException;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.URI;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.CountDownLatch;
import javax.net.SocketFactory;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLParameters;

/* loaded from: classes12.dex */
public abstract class ve extends i0 implements Runnable, te {
    public URI i;
    public we j;
    public Socket k;
    public SocketFactory l;
    public OutputStream m;
    public Proxy n;
    public Thread o;
    public Thread p;

    /* renamed from: q, reason: collision with root package name */
    public l3 f7262q;
    public Map<String, String> r;
    public CountDownLatch s;
    public CountDownLatch t;
    public int u;
    public j3 v;

    public class a implements j3 {
        public a(ve veVar) {
        }

        @Override // com.baidu.ar.j3
        public InetAddress a(URI uri) {
            return InetAddress.getByName(uri.getHost());
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final ve f7263a;

        public b(ve veVar) {
            this.f7263a = veVar;
        }

        public final void b() {
            try {
                if (ve.this.k != null) {
                    ve.this.k.close();
                }
            } catch (IOException e) {
                ve.this.a((te) this.f7263a, (Exception) e);
            }
        }

        public final void c() {
            while (!Thread.interrupted()) {
                try {
                    ByteBuffer take = ve.this.j.b.take();
                    ve.this.m.write(take.array(), 0, take.limit());
                    ve.this.m.flush();
                } catch (InterruptedException unused) {
                    for (ByteBuffer byteBuffer : ve.this.j.b) {
                        ve.this.m.write(byteBuffer.array(), 0, byteBuffer.limit());
                        ve.this.m.flush();
                    }
                    Thread.currentThread().interrupt();
                    return;
                }
            }
        }

        @Override // java.lang.Runnable
        public void run() {
            Thread.currentThread().setName("WebSocketWriteThread-" + Thread.currentThread().getId());
            try {
                try {
                    c();
                } catch (IOException e) {
                    ve.this.a(e);
                }
            } finally {
                b();
                ve.this.o = null;
            }
        }
    }

    public ve(URI uri) {
        this(uri, new m3());
    }

    public ve(URI uri, l3 l3Var) {
        this(uri, l3Var, null, 0);
    }

    public ve(URI uri, l3 l3Var, Map<String, String> map, int i) {
        this.i = null;
        this.j = null;
        this.k = null;
        this.l = null;
        this.n = Proxy.NO_PROXY;
        this.s = new CountDownLatch(1);
        this.t = new CountDownLatch(1);
        this.u = 0;
        this.v = null;
        if (uri == null) {
            throw new IllegalArgumentException();
        }
        if (l3Var == null) {
            throw new IllegalArgumentException("null as draft is permitted for `WebSocketServer` only!");
        }
        this.i = uri;
        this.f7262q = l3Var;
        this.v = new a(this);
        if (map != null) {
            TreeMap treeMap = new TreeMap(String.CASE_INSENSITIVE_ORDER);
            this.r = treeMap;
            treeMap.putAll(map);
        }
        this.u = i;
        b(false);
        a(false);
        this.j = new we(this, l3Var);
    }

    public void a(int i, String str) {
    }

    public abstract void a(int i, String str, boolean z);

    public abstract void a(pb pbVar);

    @Override // com.baidu.ar.te
    public void a(q4 q4Var) {
        this.j.a(q4Var);
    }

    @Override // com.baidu.ar.xe
    public void a(te teVar, int i, String str) {
        a(i, str);
    }

    @Override // com.baidu.ar.xe
    public void a(te teVar, int i, String str, boolean z) {
        b(i, str, z);
    }

    @Override // com.baidu.ar.xe
    public final void a(te teVar, d5 d5Var) {
        g();
        a((pb) d5Var);
        this.s.countDown();
    }

    @Override // com.baidu.ar.xe
    public final void a(te teVar, Exception exc) {
        a(exc);
    }

    @Override // com.baidu.ar.xe
    public final void a(te teVar, String str) {
        a(str);
    }

    @Override // com.baidu.ar.xe
    public final void a(te teVar, ByteBuffer byteBuffer) {
        a(byteBuffer);
    }

    public final void a(IOException iOException) {
        if (iOException instanceof SSLException) {
            a((Exception) iOException);
        }
        this.j.a();
    }

    public abstract void a(Exception exc);

    public abstract void a(String str);

    public void a(ByteBuffer byteBuffer) {
    }

    public abstract void a(SSLParameters sSLParameters);

    public void a(byte[] bArr) {
        this.j.a(bArr);
    }

    public void b(int i, String str, boolean z) {
    }

    @Override // com.baidu.ar.xe
    public final void b(te teVar) {
    }

    @Override // com.baidu.ar.xe
    public final void b(te teVar, int i, String str, boolean z) {
        h();
        Thread thread = this.o;
        if (thread != null) {
            thread.interrupt();
        }
        a(i, str, z);
        this.s.countDown();
        this.t.countDown();
    }

    public void b(String str) {
        this.j.a(str);
    }

    @Override // com.baidu.ar.i0
    public Collection<te> c() {
        return Collections.singletonList(this.j);
    }

    public void i() {
        if (this.o != null) {
            this.j.a(1000);
        }
    }

    public void j() {
        i();
        this.t.await();
    }

    public void k() {
        if (this.p != null) {
            throw new IllegalStateException("WebSocketClient objects are not reuseable");
        }
        Thread thread = new Thread(this);
        this.p = thread;
        thread.setName("WebSocketConnectReadThread-" + this.p.getId());
        this.p.start();
    }

    public final int l() {
        int port = this.i.getPort();
        if (port != -1) {
            return port;
        }
        String scheme = this.i.getScheme();
        if (NatsConstants.SECURE_WEBSOCKET_PROTOCOL.equals(scheme)) {
            return 443;
        }
        if ("ws".equals(scheme)) {
            return 80;
        }
        throw new IllegalArgumentException("unknown scheme: " + scheme);
    }

    public boolean m() {
        return this.j.e();
    }

    public boolean n() {
        return this.j.f();
    }

    public boolean o() {
        return this.j.g();
    }

    public void p() {
        q();
        k();
    }

    public final void q() {
        Thread currentThread = Thread.currentThread();
        if (currentThread == this.o || currentThread == this.p) {
            throw new IllegalStateException("You cannot initialize a reconnect out of the websocket thread. Use reconnect in another thread to insure a successful cleanup.");
        }
        try {
            j();
            Thread thread = this.o;
            if (thread != null) {
                thread.interrupt();
                this.o = null;
            }
            Thread thread2 = this.p;
            if (thread2 != null) {
                thread2.interrupt();
                this.p = null;
            }
            this.f7262q.c();
            Socket socket = this.k;
            if (socket != null) {
                socket.close();
                this.k = null;
            }
            this.s = new CountDownLatch(1);
            this.t = new CountDownLatch(1);
            this.j = new we(this, this.f7262q);
        } catch (Exception e) {
            a(e);
            this.j.b(1006, e.getMessage());
        }
    }

    public final void r() {
        String rawPath = this.i.getRawPath();
        String rawQuery = this.i.getRawQuery();
        if (rawPath == null || rawPath.length() == 0) {
            rawPath = "/";
        }
        if (rawQuery != null) {
            rawPath = rawPath + '?' + rawQuery;
        }
        int l = l();
        String str = this.i.getHost() + ((l == 80 || l == 443) ? "" : ":" + l);
        a5 a5Var = new a5();
        a5Var.b(rawPath);
        a5Var.a("Host", str);
        Map<String, String> map = this.r;
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                a5Var.a(entry.getKey(), entry.getValue());
            }
        }
        this.j.a((b2) a5Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x008c A[Catch: InternalError -> 0x00fb, Exception -> 0x012a, TryCatch #4 {Exception -> 0x012a, InternalError -> 0x00fb, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x0024, B:9:0x003e, B:13:0x005b, B:15:0x0067, B:16:0x0086, B:18:0x008c, B:19:0x0098, B:41:0x000e, B:43:0x0012, B:44:0x001d, B:46:0x00f5, B:47:0x00fa), top: B:2:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x003e A[Catch: InternalError -> 0x00fb, Exception -> 0x012a, TRY_LEAVE, TryCatch #4 {Exception -> 0x012a, InternalError -> 0x00fb, blocks: (B:3:0x0001, B:5:0x0007, B:7:0x0024, B:9:0x003e, B:13:0x005b, B:15:0x0067, B:16:0x0086, B:18:0x008c, B:19:0x0098, B:41:0x000e, B:43:0x0012, B:44:0x001d, B:46:0x00f5, B:47:0x00fa), top: B:2:0x0001 }] */
    @Override // java.lang.Runnable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 311
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.ar.ve.run():void");
    }
}
