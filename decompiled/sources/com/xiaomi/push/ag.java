package com.xiaomi.push;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;

/* loaded from: classes4.dex */
public class ag {

    /* renamed from: a, reason: collision with root package name */
    private int f14421a;

    /* renamed from: a, reason: collision with other field name */
    private Handler f175a;

    /* renamed from: a, reason: collision with other field name */
    private a f176a;

    /* renamed from: a, reason: collision with other field name */
    private volatile b f177a;

    /* renamed from: a, reason: collision with other field name */
    private volatile boolean f178a;
    private final boolean b;

    public static abstract class b {
        public void a() {
        }

        public abstract void b();

        /* renamed from: c */
        public void mo11998c() {
        }
    }

    public ag() {
        this(false);
    }

    public ag(boolean z) {
        this(z, 0);
    }

    public ag(boolean z, int i) {
        this.f175a = null;
        this.f178a = false;
        this.f14421a = 0;
        this.f175a = new Handler(Looper.getMainLooper()) { // from class: com.xiaomi.push.ag.1
            @Override // android.os.Handler
            public void handleMessage(Message message) {
                b bVar = (b) message.obj;
                if (message.what == 0) {
                    bVar.a();
                } else if (message.what == 1) {
                    bVar.mo11998c();
                }
                super.handleMessage(message);
            }
        };
        this.b = z;
        this.f14421a = i;
    }

    public synchronized void a(b bVar) {
        if (this.f176a == null) {
            a aVar = new a();
            this.f176a = aVar;
            aVar.setDaemon(this.b);
            this.f178a = false;
            this.f176a.start();
        }
        this.f176a.a(bVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a() {
        this.f176a = null;
        this.f178a = true;
    }

    public void a(final b bVar, long j) {
        this.f175a.postDelayed(new Runnable() { // from class: com.xiaomi.push.ag.2
            @Override // java.lang.Runnable
            public void run() {
                ag.this.a(bVar);
            }
        }, j);
    }

    private class a extends Thread {

        /* renamed from: a, reason: collision with other field name */
        private final LinkedBlockingQueue<b> f180a;

        public a() {
            super("PackageProcessor");
            this.f180a = new LinkedBlockingQueue<>();
        }

        public void a(b bVar) {
            try {
                this.f180a.add(bVar);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        private void a(int i, b bVar) {
            try {
                ag.this.f175a.sendMessage(ag.this.f175a.obtainMessage(i, bVar));
            } catch (Exception e) {
                com.xiaomi.channel.commonutils.logger.b.a(e);
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            long j = ag.this.f14421a > 0 ? ag.this.f14421a : Long.MAX_VALUE;
            while (!ag.this.f178a) {
                try {
                    b poll = this.f180a.poll(j, TimeUnit.SECONDS);
                    ag.this.f177a = poll;
                    if (poll == null) {
                        if (ag.this.f14421a > 0) {
                            ag.this.a();
                        }
                    } else {
                        a(0, poll);
                        poll.b();
                        a(1, poll);
                    }
                } catch (InterruptedException e) {
                    com.xiaomi.channel.commonutils.logger.b.a(e);
                }
            }
        }
    }
}
