package com.qumeng.overseas.advlib.__remote__.framework.videoplayer.cache;

import android.content.Context;
import com.qumeng.overseas.advlib.__remote__.utils.n;
import java.io.Closeable;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes17.dex */
public final class c {
    private static final String h = "VCacheProxy";
    private static volatile c i = null;
    private static final int j = 10000;
    private static final int k = 10000;
    private static final int l = 131072;
    private static final int m = 200;
    private com.qumeng.overseas.advlib.__remote__.framework.videoplayer.cache.a e;
    private volatile ExecutorService f;

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashMap<String, String> f13006a = new a(64, 0.75f, true);
    private final Set<String> b = Collections.newSetFromMap(new ConcurrentHashMap());
    private final ConcurrentHashMap<String, Object> c = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, e> d = new ConcurrentHashMap<>();
    private final AtomicBoolean g = new AtomicBoolean(false);

    class a extends LinkedHashMap<String, String> {
        a(int i, float f, boolean z) {
            super(i, f, z);
        }

        @Override // java.util.LinkedHashMap
        protected boolean removeEldestEntry(Map.Entry<String, String> entry) {
            return size() > 200;
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f13008a;

        b(String str) {
            this.f13008a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.a(this.f13008a);
        }
    }

    /* renamed from: com.qumeng.overseas.advlib.__remote__.framework.videoplayer.cache.c$c, reason: collision with other inner class name */
    class RunnableC0813c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f13009a;

        RunnableC0813c(String str) {
            this.f13009a = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            c.this.a(this.f13009a);
        }
    }

    class d implements ThreadFactory {

        /* renamed from: a, reason: collision with root package name */
        private final AtomicInteger f13010a = new AtomicInteger(0);

        d() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread thread = new Thread(runnable, "VideoPreload-" + this.f13010a.getAndIncrement());
            thread.setDaemon(true);
            thread.setPriority(3);
            return thread;
        }
    }

    static final class e {

        /* renamed from: a, reason: collision with root package name */
        final long f13011a;
        final String b;

        e(long j, String str) {
            this.f13011a = j;
            this.b = str;
        }
    }

    private c() {
    }

    public static c b() {
        if (i == null) {
            synchronized (c.class) {
                if (i == null) {
                    i = new c();
                }
            }
        }
        return i;
    }

    public String c(String str) {
        com.qumeng.overseas.advlib.__remote__.framework.videoplayer.cache.a aVar;
        if (str != null) {
            try {
                if (!str.isEmpty() && (aVar = this.e) != null && aVar.d()) {
                    String h2 = com.qumeng.overseas.advlib.__remote__.framework.videoplayer.cache.d.h(str);
                    synchronized (this.f13006a) {
                        this.f13006a.put(h2, str);
                    }
                    return "http://127.0.0.1:" + this.e.c() + "/" + h2;
                }
            } catch (Throwable unused) {
            }
        }
        return str;
    }

    Object d(String str) {
        Object putIfAbsent;
        Object obj = this.c.get(str);
        return (obj != null || (putIfAbsent = this.c.putIfAbsent(str, (obj = new Object()))) == null) ? obj : putIfAbsent;
    }

    public boolean e(String str) {
        if (str != null) {
            try {
                if (com.qumeng.overseas.advlib.__remote__.framework.videoplayer.cache.d.c().g(str)) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public boolean f(String str) {
        if (str != null) {
            try {
                if (this.b.contains(str)) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    public boolean g(String str) {
        if (str != null) {
            try {
                if (this.b.add(str)) {
                    return true;
                }
            } catch (Throwable unused) {
            }
        }
        return false;
    }

    void h(String str) {
        try {
            Object obj = this.c.get(str);
            if (obj != null) {
                synchronized (obj) {
                    obj.notifyAll();
                }
            }
        } catch (Throwable unused) {
        }
    }

    public void i(String str) {
        if (str != null) {
            try {
                if (str.isEmpty()) {
                    return;
                }
                String h2 = com.qumeng.overseas.advlib.__remote__.framework.videoplayer.cache.d.h(str);
                if (this.g.get() && !com.qumeng.overseas.advlib.__remote__.framework.videoplayer.cache.d.c().g(str) && g(str)) {
                    synchronized (this.f13006a) {
                        this.f13006a.put(h2, str);
                    }
                    ExecutorService executorService = this.f;
                    if (executorService != null && !executorService.isShutdown()) {
                        executorService.execute(new b(str));
                        return;
                    }
                    l(str);
                }
            } catch (Throwable unused) {
                n.f(h, "[Preload] 任务提交失败(线程池满), 释放写入槽位, md5=" + com.qumeng.overseas.advlib.__remote__.framework.videoplayer.cache.d.h(str), new Object[0]);
                l(str);
            }
        }
    }

    String j(String str) {
        String str2;
        try {
            synchronized (this.f13006a) {
                str2 = this.f13006a.get(str);
            }
            return str2;
        } catch (Throwable unused) {
            return null;
        }
    }

    void k(String str) {
        ExecutorService executorService = this.f;
        if (executorService == null || executorService.isShutdown()) {
            n.f(h, "[Download] 线程池不可用, 释放写入槽位", new Object[0]);
            l(str);
        } else {
            try {
                executorService.execute(new RunnableC0813c(str));
            } catch (Throwable unused) {
                n.f(h, "[Download] 任务提交失败(线程池满), 释放写入槽位", new Object[0]);
                l(str);
            }
        }
    }

    public void l(String str) {
        if (str != null) {
            try {
                this.b.remove(str);
            } catch (Throwable unused) {
            }
        }
    }

    public void a(Context context) {
        if (this.g.getAndSet(true)) {
            return;
        }
        try {
            com.qumeng.overseas.advlib.__remote__.framework.videoplayer.cache.d.c().a(context.getApplicationContext());
            this.f = a();
            com.qumeng.overseas.advlib.__remote__.framework.videoplayer.cache.a aVar = new com.qumeng.overseas.advlib.__remote__.framework.videoplayer.cache.a();
            this.e = aVar;
            if (aVar.a()) {
                this.e.start();
                n.a(h, "[Init] 代理服务器启动成功, 地址=http://127.0.0.1:" + this.e.c(), new Object[0]);
            } else {
                n.f(h, "[Init] 代理服务器绑定端口失败, 降级为直连播放", new Object[0]);
                this.e = null;
            }
        } catch (Throwable th) {
            n.f(h, "[Init] 初始化异常, 降级为直连播放", th);
            this.e = null;
        }
    }

    public e b(String str) {
        if (str != null) {
            try {
                return this.d.get(str);
            } catch (Throwable unused) {
            }
        }
        return null;
    }

    public void c() {
        try {
            com.qumeng.overseas.advlib.__remote__.framework.videoplayer.cache.a aVar = this.e;
            if (aVar != null) {
                aVar.e();
                this.e = null;
            }
            if (this.f != null) {
                this.f.shutdownNow();
                this.f = null;
            }
            this.b.clear();
            this.d.clear();
            this.c.clear();
            synchronized (this.f13006a) {
                this.f13006a.clear();
            }
            this.g.set(false);
        } catch (Throwable unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't wrap try/catch for region: R(21:(2:(1:136)|137)(4:42|43|44|45)|(19:50|51|(1:53)|54|55|56|57|58|59|(16:60|61|62|63|(7:65|66|67|68|69|(3:71|72|73)(2:75|76)|74)(1:109)|108|79|80|81|82|83|(2:90|91)|85|86|87|88)|110|111|112|113|114|(1:116)|86|87|88)|131|51|(0)|54|55|56|57|58|59|(17:60|61|62|63|(0)(0)|108|79|80|81|82|83|(0)|85|86|87|88|74)|110|111|112|113|114|(0)|86|87|88) */
    /* JADX WARN: Code restructure failed: missing block: B:124:0x0240, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x0241, code lost:
    
        r24 = r6;
        r23 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:127:0x0249, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x024a, code lost:
    
        r13 = r13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0200 A[EDGE_INSN: B:109:0x0200->B:110:0x0200 BREAK  A[LOOP:0: B:60:0x01d1->B:74:0x01f9], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0235 A[Catch: all -> 0x02bb, TRY_LEAVE, TryCatch #15 {all -> 0x02bb, blocks: (B:85:0x0298, B:114:0x020c, B:116:0x0235), top: B:2:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:53:0x018b A[Catch: all -> 0x024d, TryCatch #7 {all -> 0x024d, blocks: (B:22:0x0064, B:24:0x0083, B:25:0x00a0, B:47:0x0165, B:51:0x0172, B:53:0x018b, B:54:0x01b6, B:136:0x012b, B:137:0x0141), top: B:21:0x0064 }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01db A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0295 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.net.HttpURLConnection] */
    /* JADX WARN: Type inference failed for: r13v6, types: [java.net.HttpURLConnection, java.net.URLConnection] */
    /* JADX WARN: Type inference failed for: r13v7 */
    /* JADX WARN: Type inference failed for: r13v8 */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r9v1, types: [java.io.FileOutputStream, java.io.OutputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void a(java.lang.String r30) {
        /*
            Method dump skipped, instructions count: 770
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.qumeng.overseas.advlib.__remote__.framework.videoplayer.cache.c.a(java.lang.String):void");
    }

    private static ExecutorService a() {
        return new ThreadPoolExecutor(0, 3, 60L, TimeUnit.SECONDS, new SynchronousQueue(), new d());
    }

    private static void a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }
}
