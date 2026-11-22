package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.nh0;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;

/* loaded from: classes5.dex */
public final class hh0 implements Closeable {
    private static final zx1 C;
    private final c A;
    private final LinkedHashSet B;

    /* renamed from: a, reason: collision with root package name */
    private final boolean f15688a;
    private final b b;
    private final LinkedHashMap c;
    private final String d;
    private int e;
    private int f;
    private boolean g;
    private final l42 h;
    private final k42 i;
    private final k42 j;
    private final k42 k;
    private final cn1 l;
    private long m;
    private long n;
    private long o;
    private long p;

    /* renamed from: q, reason: collision with root package name */
    private long f15689q;
    private long r;
    private final zx1 s;
    private zx1 t;
    private long u;
    private long v;
    private long w;
    private long x;
    private final Socket y;
    private final ph0 z;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private boolean f15690a;
        private final l42 b;
        public Socket c;
        public String d;
        public BufferedSource e;
        public BufferedSink f;
        private b g;
        private cn1 h;
        private int i;

        public a(l42 taskRunner) {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            this.f15690a = true;
            this.b = taskRunner;
            this.g = b.f15691a;
            this.h = cn1.f15209a;
        }

        public final a j() {
            this.i = 0;
            return this;
        }

        public final boolean a() {
            return this.f15690a;
        }

        public final a a(b listener) {
            Intrinsics.checkNotNullParameter(listener, "listener");
            this.g = listener;
            return this;
        }

        public final l42 i() {
            return this.b;
        }

        public final Socket g() {
            Socket socket = this.c;
            if (socket != null) {
                return socket;
            }
            Intrinsics.throwUninitializedPropertyAccessException("socket");
            return null;
        }

        public final String b() {
            String str = this.d;
            if (str != null) {
                return str;
            }
            Intrinsics.throwUninitializedPropertyAccessException("connectionName");
            return null;
        }

        public final BufferedSource h() {
            BufferedSource bufferedSource = this.e;
            if (bufferedSource != null) {
                return bufferedSource;
            }
            Intrinsics.throwUninitializedPropertyAccessException("source");
            return null;
        }

        public final BufferedSink f() {
            BufferedSink bufferedSink = this.f;
            if (bufferedSink != null) {
                return bufferedSink;
            }
            Intrinsics.throwUninitializedPropertyAccessException("sink");
            return null;
        }

        public final b c() {
            return this.g;
        }

        public final cn1 e() {
            return this.h;
        }

        public final int d() {
            return this.i;
        }

        public final a a(Socket socket, String peerName, BufferedSource source, BufferedSink sink) throws IOException {
            String str;
            Intrinsics.checkNotNullParameter(socket, "socket");
            Intrinsics.checkNotNullParameter(peerName, "peerName");
            Intrinsics.checkNotNullParameter(source, "source");
            Intrinsics.checkNotNullParameter(sink, "sink");
            Intrinsics.checkNotNullParameter(socket, "<set-?>");
            this.c = socket;
            if (this.f15690a) {
                str = g92.g + " " + peerName;
            } else {
                str = "MockWebServer " + peerName;
            }
            Intrinsics.checkNotNullParameter(str, "<set-?>");
            this.d = str;
            Intrinsics.checkNotNullParameter(source, "<set-?>");
            this.e = source;
            Intrinsics.checkNotNullParameter(sink, "<set-?>");
            this.f = sink;
            return this;
        }
    }

    public final class c implements nh0.c, Function0<Unit> {
        private final nh0 b;
        final /* synthetic */ hh0 c;

        public c(hh0 hh0Var, nh0 reader) {
            Intrinsics.checkNotNullParameter(reader, "reader");
            this.c = hh0Var;
            this.b = reader;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r12v1 */
        /* JADX WARN: Type inference failed for: r12v2, types: [T, com.yandex.mobile.ads.impl.zx1] */
        /* JADX WARN: Type inference failed for: r12v3 */
        public final void a(boolean z, zx1 settings) {
            ?? r12;
            long b;
            int i;
            oh0[] oh0VarArr;
            Intrinsics.checkNotNullParameter(settings, "settings");
            Ref.ObjectRef objectRef = new Ref.ObjectRef();
            ph0 k = this.c.k();
            hh0 hh0Var = this.c;
            synchronized (k) {
                synchronized (hh0Var) {
                    zx1 h = hh0Var.h();
                    if (z) {
                        r12 = settings;
                    } else {
                        zx1 zx1Var = new zx1();
                        zx1Var.a(h);
                        zx1Var.a(settings);
                        r12 = zx1Var;
                    }
                    objectRef.element = r12;
                    b = r12.b() - h.b();
                    if (b != 0 && !hh0Var.i().isEmpty()) {
                        oh0VarArr = (oh0[]) hh0Var.i().values().toArray(new oh0[0]);
                        hh0Var.a((zx1) objectRef.element);
                        hh0Var.k.a(new a(hh0Var.c() + " onSettings", hh0Var, objectRef), 0L);
                        Unit unit = Unit.INSTANCE;
                    }
                    oh0VarArr = null;
                    hh0Var.a((zx1) objectRef.element);
                    hh0Var.k.a(new a(hh0Var.c() + " onSettings", hh0Var, objectRef), 0L);
                    Unit unit2 = Unit.INSTANCE;
                }
                try {
                    hh0Var.k().a((zx1) objectRef.element);
                } catch (IOException e) {
                    hh0.a(hh0Var, e);
                }
                Unit unit3 = Unit.INSTANCE;
            }
            if (oh0VarArr != null) {
                for (oh0 oh0Var : oh0VarArr) {
                    synchronized (oh0Var) {
                        oh0Var.a(b);
                        Unit unit4 = Unit.INSTANCE;
                    }
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v0, types: [com.yandex.mobile.ads.impl.t50] */
        /* JADX WARN: Type inference failed for: r0v3 */
        /* JADX WARN: Type inference failed for: r0v6, types: [kotlin.Unit] */
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            Throwable th;
            t50 t50Var;
            t50 t50Var2 = t50.f;
            IOException e = null;
            try {
                try {
                    this.b.a(this);
                    while (this.b.a(false, this)) {
                    }
                    t50 t50Var3 = t50.d;
                    try {
                        this.c.a(t50Var3, t50.i, (IOException) null);
                        g92.a(this.b);
                        t50Var = t50Var3;
                    } catch (IOException e2) {
                        e = e2;
                        t50 t50Var4 = t50.e;
                        hh0 hh0Var = this.c;
                        hh0Var.a(t50Var4, t50Var4, e);
                        g92.a(this.b);
                        t50Var = hh0Var;
                        t50Var2 = Unit.INSTANCE;
                        return t50Var2;
                    }
                } catch (Throwable th2) {
                    th = th2;
                    this.c.a(t50Var, t50Var2, e);
                    g92.a(this.b);
                    throw th;
                }
            } catch (IOException e3) {
                e = e3;
            } catch (Throwable th3) {
                th = th3;
                t50Var = t50Var2;
                this.c.a(t50Var, t50Var2, e);
                g92.a(this.b);
                throw th;
            }
            t50Var2 = Unit.INSTANCE;
            return t50Var2;
        }

        public static final class a extends h42 {
            final /* synthetic */ hh0 e;
            final /* synthetic */ Ref.ObjectRef f;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, hh0 hh0Var, Ref.ObjectRef objectRef) {
                super(str, true);
                this.e = hh0Var;
                this.f = objectRef;
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // com.yandex.mobile.ads.impl.h42
            public final long e() {
                this.e.e().a(this.e, (zx1) this.f.element);
                return -1L;
            }
        }

        @Override // com.yandex.mobile.ads.impl.nh0.c
        public final void a(int i, int i2, BufferedSource source, boolean z) throws IOException {
            Intrinsics.checkNotNullParameter(source, "source");
            this.c.getClass();
            if (hh0.b(i)) {
                this.c.a(i, i2, source, z);
                return;
            }
            oh0 a2 = this.c.a(i);
            if (a2 == null) {
                this.c.c(i, t50.e);
                long j = i2;
                this.c.b(j);
                source.skip(j);
                return;
            }
            a2.a(source, i2);
            if (z) {
                a2.a(g92.b, true);
            }
        }

        @Override // com.yandex.mobile.ads.impl.nh0.c
        public final void a(int i, t50 errorCode, ByteString debugData) {
            int i2;
            Object[] array;
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            Intrinsics.checkNotNullParameter(debugData, "debugData");
            debugData.size();
            hh0 hh0Var = this.c;
            synchronized (hh0Var) {
                array = hh0Var.i().values().toArray(new oh0[0]);
                hh0Var.g = true;
                Unit unit = Unit.INSTANCE;
            }
            for (oh0 oh0Var : (oh0[]) array) {
                if (oh0Var.f() > i && oh0Var.p()) {
                    oh0Var.b(t50.h);
                    this.c.c(oh0Var.f());
                }
            }
        }

        @Override // com.yandex.mobile.ads.impl.nh0.c
        public final void a(boolean z, int i, List headerBlock) {
            Intrinsics.checkNotNullParameter(headerBlock, "headerBlock");
            this.c.getClass();
            if (hh0.b(i)) {
                this.c.a(i, (List<lf0>) headerBlock, z);
                return;
            }
            hh0 hh0Var = this.c;
            synchronized (hh0Var) {
                oh0 a2 = hh0Var.a(i);
                if (a2 == null) {
                    if (hh0Var.g) {
                        return;
                    }
                    if (i <= hh0Var.d()) {
                        return;
                    }
                    if (i % 2 == hh0Var.f() % 2) {
                        return;
                    }
                    oh0 oh0Var = new oh0(i, hh0Var, false, z, g92.a((List<lf0>) headerBlock));
                    hh0Var.d(i);
                    hh0Var.i().put(Integer.valueOf(i), oh0Var);
                    hh0Var.h.e().a(new ih0(hh0Var.c() + "[" + i + "] onStream", hh0Var, oh0Var), 0L);
                    return;
                }
                Unit unit = Unit.INSTANCE;
                a2.a(g92.a((List<lf0>) headerBlock), z);
            }
        }

        @Override // com.yandex.mobile.ads.impl.nh0.c
        public final void a(int i, int i2, boolean z) {
            if (!z) {
                this.c.i.a(new jh0(this.c.c() + " ping", this.c, i, i2), 0L);
                return;
            }
            hh0 hh0Var = this.c;
            synchronized (hh0Var) {
                if (i == 1) {
                    hh0Var.n++;
                } else if (i == 2) {
                    hh0Var.p++;
                } else {
                    if (i == 3) {
                        hh0Var.f15689q++;
                        Intrinsics.checkNotNull(hh0Var, "null cannot be cast to non-null type java.lang.Object");
                        hh0Var.notifyAll();
                    }
                    Unit unit = Unit.INSTANCE;
                }
            }
        }

        @Override // com.yandex.mobile.ads.impl.nh0.c
        public final void a(int i, List requestHeaders) {
            Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
            this.c.a(i, (List<lf0>) requestHeaders);
        }

        @Override // com.yandex.mobile.ads.impl.nh0.c
        public final void a(int i, t50 errorCode) {
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            this.c.getClass();
            if (hh0.b(i)) {
                this.c.a(i, errorCode);
                return;
            }
            oh0 c = this.c.c(i);
            if (c != null) {
                c.b(errorCode);
            }
        }

        @Override // com.yandex.mobile.ads.impl.nh0.c
        public final void a(zx1 settings) {
            Intrinsics.checkNotNullParameter(settings, "settings");
            this.c.i.a(new kh0(this.c.c() + " applyAndAckSettings", this, settings), 0L);
        }

        @Override // com.yandex.mobile.ads.impl.nh0.c
        public final void a(int i, long j) {
            if (i == 0) {
                hh0 hh0Var = this.c;
                synchronized (hh0Var) {
                    hh0Var.x = hh0Var.j() + j;
                    Intrinsics.checkNotNull(hh0Var, "null cannot be cast to non-null type java.lang.Object");
                    hh0Var.notifyAll();
                    Unit unit = Unit.INSTANCE;
                }
                return;
            }
            oh0 a2 = this.c.a(i);
            if (a2 != null) {
                synchronized (a2) {
                    a2.a(j);
                    Unit unit2 = Unit.INSTANCE;
                }
            }
        }
    }

    static {
        zx1 zx1Var = new zx1();
        zx1Var.a(7, 65535);
        zx1Var.a(5, 16384);
        C = zx1Var;
    }

    public hh0(a builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        boolean a2 = builder.a();
        this.f15688a = a2;
        this.b = builder.c();
        this.c = new LinkedHashMap();
        String b2 = builder.b();
        this.d = b2;
        this.f = builder.a() ? 3 : 2;
        l42 i2 = builder.i();
        this.h = i2;
        k42 e2 = i2.e();
        this.i = e2;
        this.j = i2.e();
        this.k = i2.e();
        this.l = builder.e();
        zx1 zx1Var = new zx1();
        if (builder.a()) {
            zx1Var.a(7, 16777216);
        }
        this.s = zx1Var;
        this.t = C;
        this.x = r2.b();
        this.y = builder.g();
        this.z = new ph0(builder.f(), a2);
        this.A = new c(this, new nh0(builder.h(), a2));
        this.B = new LinkedHashSet();
        if (builder.d() != 0) {
            long nanos = TimeUnit.MILLISECONDS.toNanos(builder.d());
            e2.a(new h(b2 + " ping", this, nanos), nanos);
        }
    }

    public static boolean b(int i2) {
        return i2 != 0 && (i2 & 1) == 0;
    }

    public static final void a(hh0 hh0Var, IOException iOException) {
        hh0Var.getClass();
        t50 t50Var = t50.e;
        hh0Var.a(t50Var, t50Var, iOException);
    }

    public final LinkedHashMap i() {
        return this.c;
    }

    public final boolean b() {
        return this.f15688a;
    }

    public final int f() {
        return this.f;
    }

    public final ph0 k() {
        return this.z;
    }

    public final zx1 g() {
        return this.s;
    }

    public final void a(t50 connectionCode, t50 streamCode, IOException iOException) {
        int i2;
        Object[] objArr;
        Intrinsics.checkNotNullParameter(connectionCode, "connectionCode");
        Intrinsics.checkNotNullParameter(streamCode, "streamCode");
        if (g92.f && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        try {
            a(connectionCode);
        } catch (IOException unused) {
        }
        synchronized (this) {
            if (this.c.isEmpty()) {
                objArr = null;
            } else {
                objArr = this.c.values().toArray(new oh0[0]);
                this.c.clear();
            }
            Unit unit = Unit.INSTANCE;
        }
        oh0[] oh0VarArr = (oh0[]) objArr;
        if (oh0VarArr != null) {
            for (oh0 oh0Var : oh0VarArr) {
                try {
                    oh0Var.a(streamCode, iOException);
                } catch (IOException unused2) {
                }
            }
        }
        try {
            this.z.close();
        } catch (IOException unused3) {
        }
        try {
            this.y.close();
        } catch (IOException unused4) {
        }
        this.i.j();
        this.j.j();
        this.k.j();
    }

    public final zx1 h() {
        return this.t;
    }

    public final b e() {
        return this.b;
    }

    public final String c() {
        return this.d;
    }

    public final int d() {
        return this.e;
    }

    public final long j() {
        return this.x;
    }

    public static final class d extends h42 {
        final /* synthetic */ hh0 e;
        final /* synthetic */ int f;
        final /* synthetic */ List g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, hh0 hh0Var, int i, List list, boolean z) {
            super(str, true);
            this.e = hh0Var;
            this.f = i;
            this.g = list;
        }

        @Override // com.yandex.mobile.ads.impl.h42
        public final long e() {
            cn1 cn1Var = this.e.l;
            List responseHeaders = this.g;
            ((bn1) cn1Var).getClass();
            Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
            try {
                this.e.k().a(this.f, t50.i);
                synchronized (this.e) {
                    this.e.B.remove(Integer.valueOf(this.f));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    public static final class e extends h42 {
        final /* synthetic */ hh0 e;
        final /* synthetic */ int f;
        final /* synthetic */ List g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, hh0 hh0Var, int i, List list) {
            super(str, true);
            this.e = hh0Var;
            this.f = i;
            this.g = list;
        }

        @Override // com.yandex.mobile.ads.impl.h42
        public final long e() {
            cn1 cn1Var = this.e.l;
            List requestHeaders = this.g;
            ((bn1) cn1Var).getClass();
            Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
            try {
                this.e.k().a(this.f, t50.i);
                synchronized (this.e) {
                    this.e.B.remove(Integer.valueOf(this.f));
                }
                return -1L;
            } catch (IOException unused) {
                return -1L;
            }
        }
    }

    public static final class f extends h42 {
        final /* synthetic */ hh0 e;
        final /* synthetic */ int f;
        final /* synthetic */ t50 g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, hh0 hh0Var, int i, t50 t50Var) {
            super(str, true);
            this.e = hh0Var;
            this.f = i;
            this.g = t50Var;
        }

        @Override // com.yandex.mobile.ads.impl.h42
        public final long e() {
            cn1 cn1Var = this.e.l;
            t50 errorCode = this.g;
            ((bn1) cn1Var).getClass();
            Intrinsics.checkNotNullParameter(errorCode, "errorCode");
            synchronized (this.e) {
                this.e.B.remove(Integer.valueOf(this.f));
                Unit unit = Unit.INSTANCE;
            }
            return -1L;
        }
    }

    public static final class g extends h42 {
        final /* synthetic */ hh0 e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, hh0 hh0Var) {
            super(str, true);
            this.e = hh0Var;
        }

        @Override // com.yandex.mobile.ads.impl.h42
        public final long e() {
            this.e.a(2, 0, false);
            return -1L;
        }
    }

    public static final class h extends h42 {
        final /* synthetic */ hh0 e;
        final /* synthetic */ long f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, hh0 hh0Var, long j) {
            super(str);
            this.e = hh0Var;
            this.f = j;
        }

        @Override // com.yandex.mobile.ads.impl.h42
        public final long e() {
            boolean z;
            synchronized (this.e) {
                if (this.e.n < this.e.m) {
                    z = true;
                } else {
                    this.e.m++;
                    z = false;
                }
            }
            if (z) {
                hh0.a(this.e, (IOException) null);
                return -1L;
            }
            this.e.a(1, 0, false);
            return this.f;
        }
    }

    public static final class i extends h42 {
        final /* synthetic */ hh0 e;
        final /* synthetic */ int f;
        final /* synthetic */ t50 g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, hh0 hh0Var, int i, t50 t50Var) {
            super(str, true);
            this.e = hh0Var;
            this.f = i;
            this.g = t50Var;
        }

        @Override // com.yandex.mobile.ads.impl.h42
        public final long e() {
            try {
                this.e.b(this.f, this.g);
                return -1L;
            } catch (IOException e) {
                hh0.a(this.e, e);
                return -1L;
            }
        }
    }

    public static final class j extends h42 {
        final /* synthetic */ hh0 e;
        final /* synthetic */ int f;
        final /* synthetic */ long g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, hh0 hh0Var, int i, long j) {
            super(str, true);
            this.e = hh0Var;
            this.f = i;
            this.g = j;
        }

        @Override // com.yandex.mobile.ads.impl.h42
        public final long e() {
            try {
                this.e.k().a(this.f, this.g);
                return -1L;
            } catch (IOException e) {
                hh0.a(this.e, e);
                return -1L;
            }
        }
    }

    public final void d(int i2) {
        this.e = i2;
    }

    public final synchronized void b(long j2) {
        long j3 = this.u + j2;
        this.u = j3;
        long j4 = j3 - this.v;
        if (j4 >= this.s.b() / 2) {
            a(0, j4);
            this.v += j4;
        }
    }

    public final void b(int i2, t50 statusCode) throws IOException {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        this.z.a(i2, statusCode);
    }

    public final synchronized oh0 c(int i2) {
        oh0 oh0Var;
        oh0Var = (oh0) this.c.remove(Integer.valueOf(i2));
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type java.lang.Object");
        notifyAll();
        return oh0Var;
    }

    public final void flush() throws IOException {
        this.z.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a(t50.d, t50.i, (IOException) null);
    }

    public final void l() {
        synchronized (this) {
            long j2 = this.p;
            long j3 = this.o;
            if (j2 < j3) {
                return;
            }
            this.o = j3 + 1;
            this.r = System.nanoTime() + 1000000000;
            Unit unit = Unit.INSTANCE;
            this.i.a(new g(this.d + " ping", this), 0L);
        }
    }

    public static abstract class b {

        /* renamed from: a, reason: collision with root package name */
        public static final a f15691a = new a();

        public void a(hh0 connection, zx1 settings) {
            Intrinsics.checkNotNullParameter(connection, "connection");
            Intrinsics.checkNotNullParameter(settings, "settings");
        }

        public abstract void a(oh0 oh0Var) throws IOException;

        public static final class a extends b {
            @Override // com.yandex.mobile.ads.impl.hh0.b
            public final void a(oh0 stream) throws IOException {
                Intrinsics.checkNotNullParameter(stream, "stream");
                stream.a(t50.h, (IOException) null);
            }

            a() {
            }
        }
    }

    public static void l(hh0 hh0Var) throws IOException {
        l42 taskRunner = l42.h;
        Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        hh0Var.z.a();
        hh0Var.z.b(hh0Var.s);
        if (hh0Var.s.b() != 65535) {
            hh0Var.z.a(0, r1 - 65535);
        }
        taskRunner.e().a(new j42(hh0Var.d, hh0Var.A), 0L);
    }

    public final void c(int i2, t50 errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.i.a(new i(this.d + "[" + i2 + "] writeSynReset", this, i2, errorCode), 0L);
    }

    public final synchronized oh0 a(int i2) {
        return (oh0) this.c.get(Integer.valueOf(i2));
    }

    public final synchronized boolean a(long j2) {
        if (this.g) {
            return false;
        }
        if (this.p < this.o) {
            if (j2 >= this.r) {
                return false;
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x004e A[Catch: all -> 0x006f, TryCatch #4 {all -> 0x006f, blocks: (B:14:0x002b, B:16:0x0030, B:18:0x0038, B:22:0x0048, B:24:0x004e, B:25:0x0057, B:36:0x0069, B:37:0x006e), top: B:10:0x001e }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final com.yandex.mobile.ads.impl.oh0 a(java.util.ArrayList r11, boolean r12) throws java.io.IOException {
        /*
            r10 = this;
            java.lang.String r0 = "requestHeaders"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r11, r0)
            r4 = r12 ^ 1
            com.yandex.mobile.ads.impl.ph0 r7 = r10.z
            monitor-enter(r7)
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L78
            int r0 = r10.f     // Catch: java.lang.Throwable -> L71
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L1c
            com.yandex.mobile.ads.impl.t50 r0 = com.yandex.mobile.ads.impl.t50.h     // Catch: java.lang.Throwable -> L18
            r10.a(r0)     // Catch: java.lang.Throwable -> L18
            goto L1c
        L18:
            r0 = move-exception
            r11 = r0
            r3 = r10
            goto L74
        L1c:
            boolean r0 = r10.g     // Catch: java.lang.Throwable -> L71
            if (r0 != 0) goto L68
            int r2 = r10.f     // Catch: java.lang.Throwable -> L71
            int r0 = r2 + 2
            r10.f = r0     // Catch: java.lang.Throwable -> L71
            com.yandex.mobile.ads.impl.oh0 r1 = new com.yandex.mobile.ads.impl.oh0     // Catch: java.lang.Throwable -> L71
            r6 = 0
            r5 = 0
            r3 = r10
            r1.<init>(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L6f
            if (r12 == 0) goto L47
            long r5 = r3.w     // Catch: java.lang.Throwable -> L6f
            long r8 = r3.x     // Catch: java.lang.Throwable -> L6f
            int r12 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r12 >= 0) goto L47
            long r5 = r1.n()     // Catch: java.lang.Throwable -> L6f
            long r8 = r1.m()     // Catch: java.lang.Throwable -> L6f
            int r12 = (r5 > r8 ? 1 : (r5 == r8 ? 0 : -1))
            if (r12 < 0) goto L45
            goto L47
        L45:
            r12 = 0
            goto L48
        L47:
            r12 = 1
        L48:
            boolean r0 = r1.q()     // Catch: java.lang.Throwable -> L6f
            if (r0 == 0) goto L57
            java.util.LinkedHashMap r0 = r3.c     // Catch: java.lang.Throwable -> L6f
            java.lang.Integer r5 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L6f
            r0.put(r5, r1)     // Catch: java.lang.Throwable -> L6f
        L57:
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L6f
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L76
            com.yandex.mobile.ads.impl.ph0 r0 = r3.z     // Catch: java.lang.Throwable -> L76
            r0.a(r2, r11, r4)     // Catch: java.lang.Throwable -> L76
            monitor-exit(r7)
            if (r12 == 0) goto L67
            com.yandex.mobile.ads.impl.ph0 r11 = r3.z
            r11.flush()
        L67:
            return r1
        L68:
            r3 = r10
            com.yandex.mobile.ads.impl.qr r11 = new com.yandex.mobile.ads.impl.qr     // Catch: java.lang.Throwable -> L6f
            r11.<init>()     // Catch: java.lang.Throwable -> L6f
            throw r11     // Catch: java.lang.Throwable -> L6f
        L6f:
            r0 = move-exception
            goto L73
        L71:
            r0 = move-exception
            r3 = r10
        L73:
            r11 = r0
        L74:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L76
            throw r11     // Catch: java.lang.Throwable -> L76
        L76:
            r0 = move-exception
            goto L7a
        L78:
            r0 = move-exception
            r3 = r10
        L7a:
            r11 = r0
            monitor-exit(r7)
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.hh0.a(java.util.ArrayList, boolean):com.yandex.mobile.ads.impl.oh0");
    }

    public final void a(int i2, int i3, BufferedSource source, boolean z) throws IOException {
        Intrinsics.checkNotNullParameter(source, "source");
        Buffer buffer = new Buffer();
        long j2 = i3;
        source.require(j2);
        source.read(buffer, j2);
        this.j.a(new lh0(this.d + "[" + i2 + "] onData", this, i2, buffer, i3, z), 0L);
    }

    public final void a(int i2, List<lf0> requestHeaders, boolean z) {
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        this.j.a(new d(this.d + "[" + i2 + "] onHeaders", this, i2, requestHeaders, z), 0L);
    }

    public final void a(int i2, List<lf0> requestHeaders) {
        Intrinsics.checkNotNullParameter(requestHeaders, "requestHeaders");
        synchronized (this) {
            if (this.B.contains(Integer.valueOf(i2))) {
                c(i2, t50.e);
                return;
            }
            this.B.add(Integer.valueOf(i2));
            this.j.a(new e(this.d + "[" + i2 + "] onRequest", this, i2, requestHeaders), 0L);
        }
    }

    public final void a(int i2, t50 errorCode) {
        Intrinsics.checkNotNullParameter(errorCode, "errorCode");
        this.j.a(new f(this.d + "[" + i2 + "] onReset", this, i2, errorCode), 0L);
    }

    public final void a(zx1 zx1Var) {
        Intrinsics.checkNotNullParameter(zx1Var, "<set-?>");
        this.t = zx1Var;
    }

    public final void a(t50 statusCode) throws IOException {
        Intrinsics.checkNotNullParameter(statusCode, "statusCode");
        synchronized (this.z) {
            Ref.IntRef intRef = new Ref.IntRef();
            synchronized (this) {
                if (this.g) {
                    return;
                }
                this.g = true;
                int i2 = this.e;
                intRef.element = i2;
                Unit unit = Unit.INSTANCE;
                this.z.a(i2, statusCode, g92.f15568a);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0038, code lost:
    
        r2 = java.lang.Math.min((int) java.lang.Math.min(r12, r6 - r4), r8.z.b());
        r6 = r2;
        r8.w += r6;
        r4 = kotlin.Unit.INSTANCE;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(int r9, boolean r10, okio.Buffer r11, long r12) throws java.io.IOException {
        /*
            r8 = this;
            r0 = 0
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            r3 = 0
            if (r2 != 0) goto Ld
            com.yandex.mobile.ads.impl.ph0 r12 = r8.z
            r12.a(r10, r9, r11, r3)
            return
        Ld:
            int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r2 <= 0) goto L71
            monitor-enter(r8)
        L12:
            long r4 = r8.w     // Catch: java.lang.Throwable -> L60 java.lang.InterruptedException -> L62
            long r6 = r8.x     // Catch: java.lang.Throwable -> L60 java.lang.InterruptedException -> L62
            int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r2 < 0) goto L37
            java.util.LinkedHashMap r2 = r8.c     // Catch: java.lang.Throwable -> L60 java.lang.InterruptedException -> L62
            java.lang.Integer r4 = java.lang.Integer.valueOf(r9)     // Catch: java.lang.Throwable -> L60 java.lang.InterruptedException -> L62
            boolean r2 = r2.containsKey(r4)     // Catch: java.lang.Throwable -> L60 java.lang.InterruptedException -> L62
            if (r2 == 0) goto L2f
            java.lang.String r2 = "null cannot be cast to non-null type java.lang.Object"
            kotlin.jvm.internal.Intrinsics.checkNotNull(r8, r2)     // Catch: java.lang.Throwable -> L60 java.lang.InterruptedException -> L62
            r8.wait()     // Catch: java.lang.Throwable -> L60 java.lang.InterruptedException -> L62
            goto L12
        L2f:
            java.io.IOException r9 = new java.io.IOException     // Catch: java.lang.Throwable -> L60 java.lang.InterruptedException -> L62
            java.lang.String r10 = "stream closed"
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L60 java.lang.InterruptedException -> L62
            throw r9     // Catch: java.lang.Throwable -> L60 java.lang.InterruptedException -> L62
        L37:
            long r6 = r6 - r4
            long r4 = java.lang.Math.min(r12, r6)     // Catch: java.lang.Throwable -> L60
            int r2 = (int) r4     // Catch: java.lang.Throwable -> L60
            com.yandex.mobile.ads.impl.ph0 r4 = r8.z     // Catch: java.lang.Throwable -> L60
            int r4 = r4.b()     // Catch: java.lang.Throwable -> L60
            int r2 = java.lang.Math.min(r2, r4)     // Catch: java.lang.Throwable -> L60
            long r4 = r8.w     // Catch: java.lang.Throwable -> L60
            long r6 = (long) r2     // Catch: java.lang.Throwable -> L60
            long r4 = r4 + r6
            r8.w = r4     // Catch: java.lang.Throwable -> L60
            kotlin.Unit r4 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L60
            monitor-exit(r8)
            long r12 = r12 - r6
            com.yandex.mobile.ads.impl.ph0 r4 = r8.z
            if (r10 == 0) goto L5b
            int r5 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
            if (r5 != 0) goto L5b
            r5 = 1
            goto L5c
        L5b:
            r5 = r3
        L5c:
            r4.a(r5, r9, r11, r2)
            goto Ld
        L60:
            r9 = move-exception
            goto L6f
        L62:
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L60
            r9.interrupt()     // Catch: java.lang.Throwable -> L60
            java.io.InterruptedIOException r9 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L60
            r9.<init>()     // Catch: java.lang.Throwable -> L60
            throw r9     // Catch: java.lang.Throwable -> L60
        L6f:
            monitor-exit(r8)
            throw r9
        L71:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.hh0.a(int, boolean, okio.Buffer, long):void");
    }

    public final void a(int i2, int i3, boolean z) {
        try {
            this.z.a(i2, i3, z);
        } catch (IOException e2) {
            t50 t50Var = t50.e;
            a(t50Var, t50Var, e2);
        }
    }

    public final void a(int i2, long j2) {
        this.i.a(new j(this.d + "[" + i2 + "] windowUpdate", this, i2, j2), 0L);
    }
}
