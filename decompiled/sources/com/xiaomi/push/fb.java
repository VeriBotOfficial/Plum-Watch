package com.xiaomi.push;

import android.content.Context;
import android.os.SystemClock;
import android.util.Pair;
import com.efs.sdk.base.core.util.NetworkUtil;
import com.unity3d.ads.core.data.datasource.AndroidDynamicDeviceInfoDataSource;
import com.xiaomi.push.service.XMPushService;
import com.xiaomi.push.service.am;
import java.io.Reader;
import java.io.Writer;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: classes4.dex */
public abstract class fb {

    /* renamed from: a, reason: collision with root package name */
    private static final AtomicInteger f14583a = new AtomicInteger(0);

    /* renamed from: a, reason: collision with other field name */
    public static boolean f511a;

    /* renamed from: a, reason: collision with other field name */
    protected fc f514a;

    /* renamed from: a, reason: collision with other field name */
    protected XMPushService f516a;

    /* renamed from: a, reason: collision with other field name */
    protected int f512a = 0;

    /* renamed from: a, reason: collision with other field name */
    protected long f513a = -1;

    /* renamed from: b, reason: collision with other field name */
    protected volatile long f521b = 0;

    /* renamed from: c, reason: collision with other field name */
    protected volatile long f524c = 0;

    /* renamed from: a, reason: collision with other field name */
    private LinkedList<Pair<Integer, Long>> f519a = new LinkedList<>();

    /* renamed from: a, reason: collision with other field name */
    private final Collection<fe> f518a = new CopyOnWriteArrayList();

    /* renamed from: a, reason: collision with other field name */
    protected final Map<fg, a> f520a = new ConcurrentHashMap();

    /* renamed from: b, reason: collision with other field name */
    protected final Map<fg, a> f523b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with other field name */
    protected fk f515a = null;

    /* renamed from: a, reason: collision with other field name */
    protected String f517a = "";

    /* renamed from: b, reason: collision with other field name */
    protected String f522b = "";
    private int c = 2;
    protected final int b = f14583a.getAndIncrement();
    private long e = 0;
    protected long d = 0;

    public abstract void a(fp fpVar);

    public abstract void a(am.b bVar);

    public abstract void a(String str, String str2);

    public abstract void a(es[] esVarArr);

    /* renamed from: a */
    public boolean mo12140a() {
        return false;
    }

    public abstract void b(int i, Exception exc);

    public abstract void b(es esVar);

    public abstract void b(boolean z);

    static {
        f511a = false;
        try {
            f511a = Boolean.getBoolean("smack.debugEnabled");
        } catch (Exception unused) {
        }
        fh.m12156a();
    }

    protected fb(XMPushService xMPushService, fc fcVar) {
        this.f514a = fcVar;
        this.f516a = xMPushService;
        m12150b();
    }

    /* renamed from: a, reason: collision with other method in class */
    public fc m12146a() {
        return this.f514a;
    }

    /* renamed from: a, reason: collision with other method in class */
    public String mo12147a() {
        return this.f514a.c();
    }

    /* renamed from: b, reason: collision with other method in class */
    public String m12149b() {
        return this.f514a.b();
    }

    /* renamed from: a, reason: collision with other method in class */
    public long m12145a() {
        return this.f524c;
    }

    public void a(fe feVar) {
        if (feVar == null || this.f518a.contains(feVar)) {
            return;
        }
        this.f518a.add(feVar);
    }

    public void b(fe feVar) {
        this.f518a.remove(feVar);
    }

    public void a(fg fgVar, fl flVar) {
        if (fgVar == null) {
            throw new NullPointerException("Packet listener is null.");
        }
        this.f520a.put(fgVar, new a(fgVar, flVar));
    }

    public void a(fg fgVar) {
        this.f520a.remove(fgVar);
    }

    /* renamed from: a, reason: collision with other method in class */
    protected Map<fg, a> m12148a() {
        return this.f520a;
    }

    public void b(fg fgVar, fl flVar) {
        if (fgVar == null) {
            throw new NullPointerException("Packet listener is null.");
        }
        this.f523b.put(fgVar, new a(fgVar, flVar));
    }

    public void b(fg fgVar) {
        this.f523b.remove(fgVar);
    }

    /* renamed from: b, reason: collision with other method in class */
    protected void m12150b() {
        String str;
        if (this.f514a.m12154a() && this.f515a == null) {
            Class<?> cls = null;
            try {
                str = System.getProperty("smack.debuggerClass");
            } catch (Throwable unused) {
                str = null;
            }
            if (str != null) {
                try {
                    cls = Class.forName(str);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            if (cls == null) {
                this.f515a = new fa(this);
                return;
            }
            try {
                this.f515a = (fk) cls.getConstructor(fb.class, Writer.class, Reader.class).newInstance(this);
            } catch (Exception e2) {
                throw new IllegalArgumentException("Can't initialize the configured debugger!", e2);
            }
        }
    }

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private fg f14584a;

        /* renamed from: a, reason: collision with other field name */
        private fl f525a;

        public a(fg fgVar, fl flVar) {
            this.f14584a = fgVar;
            this.f525a = flVar;
        }

        public void a(fp fpVar) {
            fl flVar = this.f525a;
            if (flVar == null || flVar.mo11973a(fpVar)) {
                this.f14584a.a(fpVar);
            }
        }

        public void a(es esVar) {
            this.f14584a.a(esVar);
        }
    }

    /* renamed from: b, reason: collision with other method in class */
    public boolean m12151b() {
        return this.c == 0;
    }

    /* renamed from: c, reason: collision with other method in class */
    public boolean m12152c() {
        return this.c == 1;
    }

    public int a() {
        return this.f512a;
    }

    public void a(int i, int i2, Exception exc) {
        int i3 = this.c;
        if (i != i3) {
            com.xiaomi.channel.commonutils.logger.b.m11781a(String.format("update the connection status. %1$s -> %2$s : %3$s ", a(i3), a(i), com.xiaomi.push.service.an.a(i2)));
        }
        if (av.m11884a((Context) this.f516a)) {
            m12144a(i);
        }
        if (i == 1) {
            this.f516a.a(10);
            if (this.c != 0) {
                com.xiaomi.channel.commonutils.logger.b.m11781a("try set connected while not connecting.");
            }
            this.c = i;
            Iterator<fe> it = this.f518a.iterator();
            while (it.hasNext()) {
                it.next().b(this);
            }
            return;
        }
        if (i == 0) {
            if (this.c != 2) {
                com.xiaomi.channel.commonutils.logger.b.m11781a("try set connecting while not disconnected.");
            }
            this.c = i;
            Iterator<fe> it2 = this.f518a.iterator();
            while (it2.hasNext()) {
                it2.next().a(this);
            }
            return;
        }
        if (i == 2) {
            this.f516a.a(10);
            int i4 = this.c;
            if (i4 == 0) {
                Iterator<fe> it3 = this.f518a.iterator();
                while (it3.hasNext()) {
                    it3.next().a(this, exc == null ? new CancellationException("disconnect while connecting") : exc);
                }
            } else if (i4 == 1) {
                Iterator<fe> it4 = this.f518a.iterator();
                while (it4.hasNext()) {
                    it4.next().a(this, i2, exc);
                }
            }
            this.c = i;
        }
    }

    private String a(int i) {
        if (i == 1) {
            return AndroidDynamicDeviceInfoDataSource.USB_EXTRA_CONNECTED;
        }
        if (i == 0) {
            return "connecting";
        }
        if (i == 2) {
            return NetworkUtil.NETWORK_CLASS_DISCONNECTED;
        }
        return "unknown";
    }

    public int b() {
        return this.c;
    }

    public synchronized void a(String str) {
        if (this.c == 0) {
            com.xiaomi.channel.commonutils.logger.b.m11781a("setChallenge hash = " + bb.a(str).substring(0, 8));
            this.f517a = str;
            a(1, 0, null);
        } else {
            com.xiaomi.channel.commonutils.logger.b.m11781a("ignore setChallenge because connection was disconnected");
        }
    }

    public synchronized void c() {
        this.e = SystemClock.elapsedRealtime();
    }

    public synchronized boolean a(long j) {
        return this.e >= j;
    }

    /* renamed from: a, reason: collision with other method in class */
    private void m12144a(int i) {
        synchronized (this.f519a) {
            if (i == 1) {
                this.f519a.clear();
            } else {
                this.f519a.add(new Pair<>(Integer.valueOf(i), Long.valueOf(System.currentTimeMillis())));
                if (this.f519a.size() > 6) {
                    this.f519a.remove(0);
                }
            }
        }
    }

    public void d() {
        synchronized (this.f519a) {
            this.f519a.clear();
        }
    }
}
