package com.iflytek.cloud.a.d.e.b;

import android.os.Environment;
import android.os.MemoryFile;
import android.text.TextUtils;
import com.iflytek.cloud.ErrorCode;
import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.a.d.e.a;
import com.iflytek.cloud.a.d.e.b.b;
import com.iflytek.cloud.a.d.e.b.c;
import com.iflytek.cloud.msc.util.log.DebugLog;
import com.iflytek.msc.AIMIC;
import com.unity3d.services.UnityAdsConstants;
import io.livekit.android.room.util.MediaConstraintKeys;
import java.io.File;
import java.io.RandomAccessFile;
import java.lang.Thread;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* loaded from: classes17.dex */
public class a extends com.iflytek.cloud.a.d.e.a {

    /* renamed from: a, reason: collision with root package name */
    private static a f11118a;
    private static final Object b = new Object();
    private boolean g;
    private final com.iflytek.cloud.a.d.e.b.c i;
    private final d j;
    private int k;
    private final b l;
    private int m;
    private final int n;
    private final int o;
    private final int p;

    /* renamed from: q, reason: collision with root package name */
    private com.iflytek.cloud.a.d.e.b.b f11119q;
    private final c r;
    private int s;
    private int t;
    private int u;
    private int v;
    private boolean w;
    private final int c = 49152;
    private final int d = 491520;
    private final int e = 983040;
    private final Object f = new Object();
    private final byte[] h = new byte[256];

    private class c implements b.c {

        /* renamed from: a, reason: collision with root package name */
        private int f11121a;
        private final int b;
        private final int c;
        private final int d;
        private final com.iflytek.cloud.a.d.e.b.c e;
        private final com.iflytek.cloud.a.d.e.b.c f;
        private volatile com.iflytek.cloud.a.d.e.b.c g;
        private volatile com.iflytek.cloud.a.d.e.b.c h;
        private final String i;
        private Thread j;
        private boolean k;
        private boolean l;

        /* renamed from: com.iflytek.cloud.a.d.e.b.a$c$a, reason: collision with other inner class name */
        class C0644a extends Thread {
            C0644a(String str) {
                super(str);
            }

            /* JADX WARN: Removed duplicated region for block: B:61:0x0141 A[Catch: all -> 0x013d, TRY_LEAVE, TryCatch #5 {all -> 0x013d, blocks: (B:72:0x0139, B:61:0x0141), top: B:71:0x0139 }] */
            /* JADX WARN: Removed duplicated region for block: B:68:0x0155  */
            /* JADX WARN: Removed duplicated region for block: B:71:0x0139 A[EXC_TOP_SPLITTER, SYNTHETIC] */
            @Override // java.lang.Thread, java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public void run() {
                /*
                    Method dump skipped, instructions count: 358
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.iflytek.cloud.a.d.e.b.a.c.C0644a.run():void");
            }
        }

        private c() {
            this.f11121a = 0;
            this.b = 49152;
            this.c = 512000;
            this.d = 61440000;
            com.iflytek.cloud.a.d.e.b.c cVar = new com.iflytek.cloud.a.d.e.b.c(512000L, 49152, 0L, true, false);
            this.e = cVar;
            com.iflytek.cloud.a.d.e.b.c cVar2 = new com.iflytek.cloud.a.d.e.b.c(512000L, 49152, 0L, true, false);
            this.f = cVar2;
            this.g = cVar;
            this.h = cVar2;
            this.i = Environment.getExternalStorageDirectory().getPath() + "/aimic_alsa.pcm";
            this.j = null;
            this.k = false;
            this.l = false;
        }

        private void c() {
            C0644a c0644a = new C0644a("AlsaAudioSavingThread");
            this.j = c0644a;
            c0644a.start();
        }

        public void b() {
            this.l = false;
            if (a()) {
                a(0, true);
            }
        }

        @Override // com.iflytek.cloud.a.d.e.b.b.c
        public void a(byte[] bArr, int i) {
            if (a()) {
                b(bArr, i);
            }
            int a2 = a.this.a(bArr, 0, i);
            this.f11121a = a2;
            if (a2 != 0) {
                a.this.l.a(new SpeechError(this.f11121a));
            }
        }

        private void b(byte[] bArr, int i) {
            if (this.j == null) {
                File file = new File(this.i);
                if (file.exists()) {
                    file.delete();
                }
                this.e.a();
                this.f.a();
                this.g = this.e;
                this.h = this.f;
                this.l = true;
                c();
            }
            try {
                a(i, false);
                synchronized (this.g) {
                    this.g.a(bArr, 0, i);
                }
            } catch (Throwable th) {
                DebugLog.LogE(th);
                a.this.l.a(new SpeechError(th, ErrorCode.ERROR_UNKNOWN));
            }
        }

        public void a(boolean z) {
            this.k = z;
        }

        private boolean a() {
            return this.k;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public boolean a(RandomAccessFile randomAccessFile, MemoryFile memoryFile, int i, int i2) {
            try {
                if (randomAccessFile != null && memoryFile != null && i >= 0 && i2 >= 0) {
                    int i3 = i2 + i;
                    byte[] bArr = new byte[65536];
                    while (i3 > i) {
                        int min = Math.min(65536, i3 - i);
                        if (memoryFile.readBytes(bArr, i, 0, min) != min) {
                            DebugLog.LogE("saveFileFromMemory error: read bytes length error!");
                            return false;
                        }
                        i += min;
                        randomAccessFile.write(bArr, 0, min);
                    }
                    return true;
                }
                DebugLog.LogE("saveFileFromMemory error: arguments error");
                return false;
            } catch (Throwable th) {
                DebugLog.LogE(th);
                return false;
            }
        }

        private void a(int i, boolean z) {
            com.iflytek.cloud.a.d.e.b.c cVar;
            synchronized (this.g) {
                if (!z) {
                    if (this.g.e() + i < 512000) {
                        cVar = null;
                    }
                }
                cVar = this.g;
                this.g = cVar.equals(this.f) ? this.e : this.f;
            }
            if (cVar != null) {
                synchronized (this.h) {
                    this.h = cVar;
                }
                Thread thread = this.j;
                if (thread != null) {
                    synchronized (thread) {
                        if (Thread.State.WAITING == this.j.getState()) {
                            this.j.notify();
                        }
                    }
                }
                synchronized (this.g) {
                    if (0 != this.g.e()) {
                        DebugLog.LogE("Error: buffer is not null when exchanged!");
                        a.this.l.a(new SpeechError(ErrorCode.ERROR_UNKNOWN));
                    }
                }
            }
        }
    }

    private class d extends Thread {

        /* renamed from: a, reason: collision with root package name */
        private final int f11123a;
        private final int b;
        private final int c;
        private final com.iflytek.cloud.a.d.e.b.c d;
        private int e;
        private final HashMap<Integer, Integer> f;
        private SpeechError g;
        private long h;
        private boolean i;

        public d(String str) {
            super(str);
            this.f11123a = 1;
            this.b = 16;
            this.c = 1000;
            this.d = a.this.i;
            this.e = 10;
            HashMap<Integer, Integer> hashMap = new HashMap<>();
            this.f = hashMap;
            this.g = null;
            this.h = System.currentTimeMillis();
            this.i = true;
            hashMap.put(0, 1);
            hashMap.put(1, 5);
            hashMap.put(2, 10);
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0053, code lost:
        
            com.iflytek.cloud.msc.util.log.DebugLog.LogD("get a thread group has target priority");
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        private void b(int r5) {
            /*
                r4 = this;
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                java.lang.String r1 = "update priority enter, target priority: "
                r0.<init>(r1)
                java.lang.StringBuilder r0 = r0.append(r5)
                java.lang.String r1 = ", current priority: "
                java.lang.StringBuilder r0 = r0.append(r1)
                int r1 = r4.getPriority()
                java.lang.StringBuilder r0 = r0.append(r1)
                java.lang.String r0 = r0.toString()
                com.iflytek.cloud.msc.util.log.DebugLog.LogD(r0)
                int r0 = r4.getPriority()
                if (r5 == r0) goto Lae
                java.util.LinkedList r0 = new java.util.LinkedList     // Catch: java.lang.Throwable -> La5
                r0.<init>()     // Catch: java.lang.Throwable -> La5
                java.lang.ThreadGroup r1 = r4.getThreadGroup()     // Catch: java.lang.Throwable -> La5
            L30:
                if (r1 == 0) goto L6d
                java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La5
                r2.<init>()     // Catch: java.lang.Throwable -> La5
                java.lang.String r3 = "thread group name: "
                java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> La5
                java.lang.String r3 = r1.getName()     // Catch: java.lang.Throwable -> La5
                java.lang.StringBuilder r2 = r2.append(r3)     // Catch: java.lang.Throwable -> La5
                java.lang.String r2 = r2.toString()     // Catch: java.lang.Throwable -> La5
                com.iflytek.cloud.msc.util.log.DebugLog.LogD(r2)     // Catch: java.lang.Throwable -> La5
                int r2 = r1.getMaxPriority()     // Catch: java.lang.Throwable -> L64
                if (r5 > r2) goto L59
                java.lang.String r1 = "get a thread group has target priority"
                com.iflytek.cloud.msc.util.log.DebugLog.LogD(r1)     // Catch: java.lang.Throwable -> L64
                goto L6d
            L59:
                r1.checkAccess()     // Catch: java.lang.Throwable -> L64
                r0.addFirst(r1)     // Catch: java.lang.Throwable -> L64
                java.lang.ThreadGroup r1 = r1.getParent()     // Catch: java.lang.Throwable -> L64
                goto L30
            L64:
                r1 = move-exception
                java.lang.String r2 = "exception while improve thread group priority"
                com.iflytek.cloud.msc.util.log.DebugLog.LogE(r2)     // Catch: java.lang.Throwable -> La5
                com.iflytek.cloud.msc.util.log.DebugLog.LogE(r1)     // Catch: java.lang.Throwable -> La5
            L6d:
                java.util.Iterator r0 = r0.iterator()     // Catch: java.lang.Throwable -> La5
            L71:
                boolean r1 = r0.hasNext()     // Catch: java.lang.Throwable -> La5
                if (r1 == 0) goto L87
                java.lang.Object r1 = r0.next()     // Catch: java.lang.Throwable -> La5
                java.lang.ThreadGroup r1 = (java.lang.ThreadGroup) r1     // Catch: java.lang.Throwable -> La5
                int r2 = r1.getMaxPriority()     // Catch: java.lang.Throwable -> La5
                if (r5 <= r2) goto L71
                r1.setMaxPriority(r5)     // Catch: java.lang.Throwable -> La5
                goto L71
            L87:
                r4.setPriority(r5)     // Catch: java.lang.Throwable -> La5
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La5
                r5.<init>()     // Catch: java.lang.Throwable -> La5
                java.lang.String r0 = "set thread priority to target, after that is: "
                java.lang.StringBuilder r5 = r5.append(r0)     // Catch: java.lang.Throwable -> La5
                int r0 = r4.getPriority()     // Catch: java.lang.Throwable -> La5
                java.lang.StringBuilder r5 = r5.append(r0)     // Catch: java.lang.Throwable -> La5
                java.lang.String r5 = r5.toString()     // Catch: java.lang.Throwable -> La5
                com.iflytek.cloud.msc.util.log.DebugLog.LogD(r5)     // Catch: java.lang.Throwable -> La5
                goto Lae
            La5:
                r5 = move-exception
                java.lang.String r0 = "exception while set thread priority"
                com.iflytek.cloud.msc.util.log.DebugLog.LogE(r0)
                com.iflytek.cloud.msc.util.log.DebugLog.LogE(r5)
            Lae:
                java.lang.String r5 = "update priority leave"
                com.iflytek.cloud.msc.util.log.DebugLog.LogD(r5)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iflytek.cloud.a.d.e.b.a.d.b(int):void");
        }

        public SpeechError a() {
            return this.g;
        }

        public void c() {
            this.g = null;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            int i;
            Throwable th;
            int i2;
            int i3;
            UnsatisfiedLinkError e;
            c.a k;
            DebugLog.LogD("aimic audio writing thread enter");
            b(this.e);
            int i4 = 0;
            int i5 = 0;
            while (true) {
                int i6 = i5;
                while (a.this.i()) {
                    try {
                        k = this.d.k();
                    } catch (UnsatisfiedLinkError e2) {
                        int i7 = i5;
                        i = i4;
                        e = e2;
                        i2 = i6;
                        i3 = i7;
                    } catch (Throwable th2) {
                        int i8 = i5;
                        i = i4;
                        th = th2;
                        i2 = i6;
                        i3 = i8;
                    }
                    if (k != null) {
                        i4++;
                        if (30 <= i4) {
                            try {
                                DebugLog.LogD("current buf container size in aimic thread is " + this.d.f());
                                i4 = 0;
                            } catch (UnsatisfiedLinkError e3) {
                                e = e3;
                                i2 = i6;
                                i3 = i5;
                                i = 0;
                                DebugLog.LogE(e);
                                this.g = new SpeechError(ErrorCode.ERROR_UNSATISFIED_LINK);
                                i4 = i;
                                i5 = i3;
                                i6 = i2;
                            } catch (Throwable th3) {
                                th = th3;
                                i2 = i6;
                                i3 = i5;
                                i = 0;
                                DebugLog.LogE(th);
                                this.g = new SpeechError(ErrorCode.ERROR_UNKNOWN);
                                i4 = i;
                                i5 = i3;
                                i6 = i2;
                            }
                        }
                        try {
                            int AIMICAudioWrite = AIMIC.AIMICAudioWrite(AIMIC.getHandler(), (byte[]) k.getKey(), 0, ((Integer) k.getValue()).intValue());
                            this.d.a(k);
                            if (AIMICAudioWrite != 0) {
                                DebugLog.LogE("AIMICAudioWrite error: " + AIMICAudioWrite);
                                a.this.l.a(new SpeechError(AIMICAudioWrite));
                            }
                            i5 = 0;
                        } catch (UnsatisfiedLinkError e4) {
                            i = i4;
                            e = e4;
                            i3 = 0;
                            i2 = 0;
                            DebugLog.LogE(e);
                            this.g = new SpeechError(ErrorCode.ERROR_UNSATISFIED_LINK);
                            i4 = i;
                            i5 = i3;
                            i6 = i2;
                        } catch (Throwable th4) {
                            i = i4;
                            th = th4;
                            i3 = 0;
                            i2 = 0;
                            DebugLog.LogE(th);
                            this.g = new SpeechError(ErrorCode.ERROR_UNKNOWN);
                            i4 = i;
                            i5 = i3;
                            i6 = i2;
                        }
                    } else {
                        b();
                        if (1000 <= i5) {
                            try {
                                synchronized (this) {
                                    if (this.d.i()) {
                                        DebugLog.LogD("aimic audio writing will suspend");
                                        wait();
                                        DebugLog.LogD("aimic audio writing is waked");
                                    }
                                }
                                i5 = 0;
                            } catch (UnsatisfiedLinkError e5) {
                                i = i4;
                                e = e5;
                                i2 = i6;
                                i3 = 0;
                                DebugLog.LogE(e);
                                this.g = new SpeechError(ErrorCode.ERROR_UNSATISFIED_LINK);
                                i4 = i;
                                i5 = i3;
                                i6 = i2;
                            } catch (Throwable th5) {
                                i = i4;
                                th = th5;
                                i2 = i6;
                                i3 = 0;
                                DebugLog.LogE(th);
                                this.g = new SpeechError(ErrorCode.ERROR_UNKNOWN);
                                i4 = i;
                                i5 = i3;
                                i6 = i2;
                            }
                        } else {
                            i5++;
                            i6 = Math.min(i6 + 1, 16);
                            Thread.sleep(i6);
                        }
                    }
                }
                this.d.a();
                DebugLog.LogD("aimic audio writing thread exited");
                return;
            }
        }

        public void a(int i) {
            Integer num = this.f.get(Integer.valueOf(i));
            this.e = num != null ? num.intValue() : this.e;
            DebugLog.LogD("set priority, target aimic priority: " + i + ", real target priority: " + this.e);
            b(this.e);
        }

        private void b() {
            if (1 == a.this.k || UnityAdsConstants.Timeout.INIT_TIMEOUT_MS < System.currentTimeMillis() - this.h) {
                return;
            }
            long c = this.d.c();
            if (49152 < c && c + this.d.e() > 491520) {
                boolean z = this.i;
                this.i = !z;
                if (z) {
                    this.d.b();
                }
            }
            this.h = System.currentTimeMillis();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v1, types: [com.iflytek.cloud.a.d.e.b.a$a] */
    /* JADX WARN: Type inference failed for: r5v6 */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    private a(String str) throws UnsatisfiedLinkError, SpeechError, Throwable {
        int indexOf;
        int i = 0;
        this.g = false;
        com.iflytek.cloud.a.d.e.b.c cVar = new com.iflytek.cloud.a.d.e.b.c(491520L, 49152, 245760L, false, false);
        this.i = cVar;
        d dVar = new d("AIMicAudioWritingThread");
        this.j = dVar;
        this.k = 2;
        String str2 = 0;
        str2 = 0;
        str2 = 0;
        b bVar = new b();
        this.l = bVar;
        this.m = 4000;
        this.n = 16000;
        this.o = 2;
        this.p = 1536;
        this.f11119q = null;
        this.r = new c();
        this.s = 16000;
        this.t = 2;
        this.u = 1536;
        this.v = -3;
        this.w = false;
        DebugLog.LogD("aimic constructor enter: " + str);
        StringBuffer stringBuffer = new StringBuffer();
        if (!TextUtils.isEmpty(str)) {
            stringBuffer.append(str);
        }
        if (!AIMIC.isLoaded()) {
            if (str != null && (indexOf = str.indexOf(SpeechConstant.LIB_NAME)) >= 0 && indexOf < str.length()) {
                int indexOf2 = str.indexOf(44, indexOf);
                indexOf2 = indexOf2 < 0 ? str.length() : indexOf2;
                String substring = str.substring(str.indexOf(61, indexOf) + 1, indexOf2);
                stringBuffer.delete(indexOf, indexOf2);
                str2 = substring;
            }
            AIMIC.loadLibrary(str2);
        }
        if (!AIMIC.isValid() && (i = AIMIC.AIMICNew(com.iflytek.cloud.msc.util.d.a(stringBuffer.toString()), bVar)) != 0) {
            DebugLog.LogE("AIMICNew return error: " + i);
            AIMIC.AIMICDestroy(AIMIC.getHandler());
        }
        if (i != 0) {
            throw new SpeechError(i);
        }
        this.g = true;
        dVar.start();
        int i2 = this.k;
        if (i2 == 0 || 2 == i2) {
            cVar.a(491520L);
        }
        DebugLog.LogD("aimic constructor leave: " + i);
    }

    public static a h() {
        a aVar;
        DebugLog.LogD("aimic getAIMic enter");
        synchronized (b) {
            aVar = f11118a;
        }
        DebugLog.LogD("aimic getAIMic leave: " + aVar);
        return aVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean i() {
        return this.g;
    }

    private int j() {
        if (!i()) {
            return ErrorCode.ERROR_AIMIC_NOT_INIT;
        }
        com.iflytek.cloud.a.d.e.b.b c2 = com.iflytek.cloud.a.d.e.b.b.c();
        this.f11119q = c2;
        if (c2 == null || c2.b() != this.t || this.f11119q.f() != this.s || this.f11119q.e() != this.u) {
            com.iflytek.cloud.a.d.e.b.b bVar = this.f11119q;
            if (bVar != null) {
                bVar.h();
                this.f11119q.a();
                this.f11119q = null;
            }
            DebugLog.LogD("create new audio recorder");
            this.f11119q = com.iflytek.cloud.a.d.e.b.b.a(this.t, this.s, this.u);
        }
        com.iflytek.cloud.a.d.e.b.b bVar2 = this.f11119q;
        if (bVar2 == null) {
            return ErrorCode.ERROR_AIMIC_CREATE_HANDLE;
        }
        if (bVar2.g() && !this.r.equals(this.f11119q.d())) {
            DebugLog.LogD("Current record listener is not this, recorder will be stoped.");
            this.f11119q.h();
        }
        this.f11119q.a(DebugLog.getShowLog() && DebugLog.a.detail.ordinal() >= DebugLog.getLogLevel().ordinal());
        if (this.f11119q.g()) {
            DebugLog.LogD("audio recorder is recording.");
            return 0;
        }
        DebugLog.LogD("start audio recording.");
        return this.f11119q.a(this.r);
    }

    private void k() {
        if (this.f11119q != null) {
            DebugLog.LogD("stop audio record");
            this.f11119q.h();
            this.r.b();
            this.f11119q = null;
        }
    }

    @Override // com.iflytek.cloud.a.d.e.a
    public int e() {
        int i;
        DebugLog.LogD("aimic  reset enter");
        synchronized (this.f) {
            try {
                try {
                    i = i() ? AIMIC.AIMICResetEng(AIMIC.getHandler()) : ErrorCode.ERROR_AIMIC_NOT_INIT;
                } finally {
                    DebugLog.LogD("aimic  reset leave: " + i);
                    return i;
                }
            } catch (SpeechError e) {
                DebugLog.LogE(e);
                i = e.getErrorCode();
            } catch (UnsatisfiedLinkError e2) {
                DebugLog.LogE(e2);
                i = ErrorCode.ERROR_UNSATISFIED_LINK;
            }
        }
        DebugLog.LogD("aimic  reset leave: " + i);
        return i;
    }

    @Override // com.iflytek.cloud.a.d.e.a
    public int f() {
        int i;
        DebugLog.LogD("aimic  startListening enter");
        synchronized (this.f) {
            if (!this.w) {
                DebugLog.LogD("aimic  startListening clear old datas.");
                this.i.a();
            }
            if (i()) {
                int i2 = this.v;
                if (-3 == i2) {
                    i = j();
                } else if (-1 != i2) {
                    DebugLog.LogE("startListening failed, invalid audio source: " + this.v);
                    i = ErrorCode.ERROR_AIMIC_INVALID_PARA_VALUE;
                } else if (this.f11119q != null) {
                    DebugLog.LogE("startListening failed, current internal recorder is not stoped!");
                    i = ErrorCode.ERROR_AIMIC_BUSY;
                } else {
                    i = 0;
                }
            } else {
                i = ErrorCode.ERROR_AIMIC_NOT_INIT;
            }
            this.w = i == 0;
        }
        DebugLog.LogD("aimic  startListening leave: " + i);
        return i;
    }

    @Override // com.iflytek.cloud.a.d.e.a
    public void g() {
        DebugLog.LogD("aimic  stopListening enter");
        synchronized (this.f) {
            b bVar = this.l;
            if (bVar == null || bVar.b()) {
                DebugLog.LogD("AIMic Listener is empty, audio recorder will stop recording.");
                k();
                this.w = false;
            }
        }
        DebugLog.LogD("aimic  stopListening leave");
    }

    private static class b implements AIMIC.Listener {

        /* renamed from: a, reason: collision with root package name */
        private final HashSet<a.b> f11120a;
        private final HashSet<a.InterfaceC0642a> b;
        private final Object c;
        private final Object d;
        private final int e;
        private final int f;
        private final int g;
        private final int h;
        private final com.iflytek.cloud.a.d.e.b.c i;
        private final int j;
        private boolean k;
        private int l;

        private b() {
            this.f11120a = new HashSet<>();
            this.b = new HashSet<>();
            this.c = new Object();
            this.d = new Object();
            this.e = 32;
            this.f = 4000;
            this.g = 128000;
            this.h = 512;
            this.i = new com.iflytek.cloud.a.d.e.b.c(128000L, 512, 0L, false, true);
            this.j = 1;
            this.k = true;
            this.l = 128000;
        }

        public void a() {
            HashSet<a.b> hashSet = this.f11120a;
            if (hashSet != null) {
                hashSet.clear();
            }
            HashSet<a.InterfaceC0642a> hashSet2 = this.b;
            if (hashSet2 != null) {
                hashSet2.clear();
            }
        }

        public boolean b() {
            HashSet<a.b> hashSet = this.f11120a;
            if (hashSet != null && !hashSet.isEmpty()) {
                return false;
            }
            HashSet<a.InterfaceC0642a> hashSet2 = this.b;
            return hashSet2 == null || hashSet2.isEmpty();
        }

        @Override // com.iflytek.msc.AIMIC.Listener
        public void onRecogAudio(byte[] bArr, int i, int i2, Object obj) {
            try {
                synchronized (this.d) {
                    boolean z = this.k && this.b.isEmpty();
                    this.k = z;
                    if (z) {
                        long e = this.i.e();
                        if (i + e > this.l) {
                            DebugLog.LogD(e + " matched max buffering len: " + this.l + ", will be clean");
                            this.k = false;
                            this.i.a();
                        } else {
                            this.i.a(bArr, 0, i);
                        }
                    } else {
                        Iterator<a.InterfaceC0642a> it = this.b.iterator();
                        while (it.hasNext()) {
                            a.InterfaceC0642a next = it.next();
                            if (!this.i.i()) {
                                com.iflytek.cloud.a.d.e.b.c cVar = this.i;
                                while (true) {
                                    c.a k = cVar.k();
                                    if (k == null) {
                                        break;
                                    }
                                    next.onRecogAudio((byte[]) k.getKey(), ((Integer) k.getValue()).intValue(), 0, null);
                                    this.i.a(k);
                                    cVar = this.i;
                                }
                                this.i.a();
                            }
                            next.onRecogAudio(bArr, i, i2, obj);
                        }
                    }
                }
            } catch (Throwable th) {
                DebugLog.LogE(th);
                a(new SpeechError(th, ErrorCode.ERROR_UNKNOWN));
            }
        }

        @Override // com.iflytek.msc.AIMIC.Listener
        public void onWakeupAudio(byte[] bArr, int i, int i2, Object obj) {
            try {
                synchronized (this.c) {
                    Iterator<a.b> it = this.f11120a.iterator();
                    while (it.hasNext()) {
                        it.next().onWakeupAudio(bArr, i, i2, obj);
                    }
                }
            } catch (Throwable th) {
                a(new SpeechError(th, ErrorCode.ERROR_UNKNOWN));
            }
        }

        @Override // com.iflytek.msc.AIMIC.Listener
        public void onWakeupMsg(int i, int i2, int i3, byte[] bArr, int i4, byte[] bArr2, int i5, byte[] bArr3, int i6) {
            try {
                DebugLog.LogS("onWakeupMsg enter");
                boolean z = true;
                if (1 == i) {
                    synchronized (this.d) {
                        if (this.l <= 0) {
                            z = false;
                        }
                        this.k = z;
                    }
                }
                synchronized (this.c) {
                    Iterator<a.b> it = this.f11120a.iterator();
                    while (it.hasNext()) {
                        it.next().onWakeupMsg(i, i2, i3, bArr, i4, bArr2, i5, bArr3, i6);
                    }
                }
                DebugLog.LogS("onWakeupMsg leave");
            } catch (Throwable th) {
                DebugLog.LogE(th);
                a(new SpeechError(th, ErrorCode.ERROR_UNKNOWN));
            }
        }

        public void b(a.b bVar) {
            if (bVar != null) {
                synchronized (this.c) {
                    this.f11120a.remove(bVar);
                }
            }
        }

        public void b(a.InterfaceC0642a interfaceC0642a) {
            if (interfaceC0642a != null) {
                synchronized (this.d) {
                    this.b.remove(interfaceC0642a);
                }
            }
        }

        public void a(int i) {
            this.l = i * 32;
        }

        public void a(a.b bVar) {
            if (bVar != null) {
                synchronized (this.c) {
                    this.f11120a.add(bVar);
                }
            }
        }

        public void a(a.InterfaceC0642a interfaceC0642a) {
            if (interfaceC0642a != null) {
                synchronized (this.d) {
                    this.b.add(interfaceC0642a);
                }
            }
        }

        public void a(SpeechError speechError) {
            DebugLog.LogE(speechError);
            synchronized (this.c) {
                Iterator<a.b> it = this.f11120a.iterator();
                while (it.hasNext()) {
                    it.next().onError(speechError.getErrorCode());
                }
            }
            synchronized (this.d) {
                Iterator<a.InterfaceC0642a> it2 = this.b.iterator();
                while (it2.hasNext()) {
                    it2.next().onError(speechError.getErrorCode());
                }
            }
        }
    }

    public static a c(String str) {
        a aVar;
        DebugLog.LogD("aimic createAIMic enter");
        synchronized (b) {
            if (f11118a == null) {
                try {
                    try {
                        f11118a = new a(str);
                    } catch (UnsatisfiedLinkError e) {
                        DebugLog.LogE(e);
                    }
                } catch (SpeechError e2) {
                    DebugLog.LogE(e2);
                } catch (Throwable th) {
                    DebugLog.LogE(th);
                }
            }
            aVar = f11118a;
        }
        DebugLog.LogD("aimic createAIMic leave: " + aVar);
        return aVar;
    }

    public static String d() {
        String str;
        synchronized (b) {
            try {
                str = com.iflytek.cloud.msc.util.d.a(AIMIC.AIMICGetVersion());
            } finally {
                return str;
            }
        }
        return str;
    }

    @Override // com.iflytek.cloud.a.d.e.a
    public void a() {
        DebugLog.LogD("aimic destroy enter");
        synchronized (this.f) {
            this.g = false;
            b bVar = this.l;
            if (bVar != null) {
                bVar.a();
            }
            com.iflytek.cloud.a.d.e.b.b bVar2 = this.f11119q;
            if (bVar2 != null) {
                bVar2.h();
                this.f11119q.a();
                this.f11119q = null;
            }
        }
        synchronized (this.j) {
            if (this.j.isAlive()) {
                this.j.notify();
            }
        }
        synchronized (b) {
            if (f11118a != null) {
                try {
                    AIMIC.AIMICDestroy(AIMIC.getHandler());
                } catch (Throwable th) {
                    DebugLog.LogE(th);
                }
                f11118a = null;
            }
        }
        System.gc();
        DebugLog.LogD("aimic destroy leave");
    }

    @Override // com.iflytek.cloud.a.d.e.a
    public void b(a.b bVar) {
        DebugLog.LogD("aimic  unregisterListener enter: " + bVar);
        synchronized (this.f) {
            this.l.b(bVar);
            if (this.l.b()) {
                g();
            }
        }
        DebugLog.LogD("aimic  unregisterListener leave");
    }

    private boolean d(String str) {
        if (str != null) {
            return str.equals(MediaConstraintKeys.TRUE) || str.equals("1");
        }
        return false;
    }

    @Override // com.iflytek.cloud.a.d.e.a
    public void b(a.InterfaceC0642a interfaceC0642a) {
        DebugLog.LogD("aimic  unregisterListener enter: " + interfaceC0642a);
        synchronized (this.f) {
            this.l.b(interfaceC0642a);
            if (this.l.b()) {
                g();
            }
        }
        DebugLog.LogD("aimic  unregisterListener leave");
    }

    @Override // com.iflytek.cloud.a.d.e.a
    public String b(String str) {
        int AIMICGetParam;
        String a2;
        DebugLog.LogD("aimic  getParameter enter");
        byte[] bArr = this.h;
        synchronized (this.f) {
            if (i()) {
                try {
                    AIMICGetParam = AIMIC.AIMICGetParam(AIMIC.getHandler(), com.iflytek.cloud.msc.util.d.a(str), bArr);
                } catch (Throwable th) {
                    DebugLog.LogE(th);
                }
                if (AIMICGetParam == 0) {
                    a2 = com.iflytek.cloud.msc.util.d.a(bArr);
                } else {
                    DebugLog.LogE("get parameter error: " + AIMICGetParam);
                }
            }
            a2 = null;
        }
        DebugLog.LogD("aimic  getParameter leave: " + a2);
        return a2;
    }

    public static int c() {
        try {
            return AIMIC.AIMICGetChannel();
        } catch (Throwable th) {
            DebugLog.LogE(th);
            return -1;
        }
    }

    @Override // com.iflytek.cloud.a.d.e.a
    public void a(a.b bVar) {
        DebugLog.LogD("aimic  registerListener enter: " + bVar);
        synchronized (this.f) {
            this.l.a(bVar);
        }
        DebugLog.LogD("aimic  setParameter leave");
    }

    private int b(byte[] bArr, int i, int i2) {
        try {
            this.i.a(bArr, i, i2);
            synchronized (this.j) {
                if (Thread.State.WAITING == this.j.getState()) {
                    this.j.notify();
                }
            }
            SpeechError a2 = this.j.a();
            if (a2 == null) {
                return 0;
            }
            int errorCode = a2.getErrorCode();
            this.j.c();
            return errorCode;
        } catch (IllegalArgumentException e) {
            DebugLog.LogE(e);
            return ErrorCode.ERROR_AIMIC_INVALID_PARA;
        } catch (NullPointerException e2) {
            DebugLog.LogE(e2);
            return ErrorCode.ERROR_AIMIC_NULL_HANDLE;
        } catch (OutOfMemoryError e3) {
            DebugLog.LogE(e3);
            if (2 == this.k) {
                DebugLog.LogE("write audio too soon, current audios  in buffer will be ignored!");
                this.i.a();
                return 0;
            }
            DebugLog.LogE("write audio too soon, please wait for a second, and try again!");
            return ErrorCode.ERROR_AIMIC_BUSY;
        } catch (Throwable th) {
            DebugLog.LogE("write audio too soon, please wait for a second, and try again!");
            DebugLog.LogE(th);
            return ErrorCode.ERROR_UNKNOWN;
        }
    }

    @Override // com.iflytek.cloud.a.d.e.a
    public void a(a.InterfaceC0642a interfaceC0642a) {
        DebugLog.LogD("aimic  registerListener enter: " + interfaceC0642a);
        synchronized (this.f) {
            this.l.a(interfaceC0642a);
        }
        DebugLog.LogD("aimic  registerListener leave");
    }

    @Override // com.iflytek.cloud.a.d.e.a
    public int a(String str, String str2) {
        int i;
        DebugLog.LogD("aimic  setParameter enter key=" + str + ", value=" + str2);
        try {
            synchronized (this.f) {
                DebugLog.LogD("aimic  setParameter sync");
                if ("aimic_asr_buffer_time".equalsIgnoreCase(str)) {
                    int parseInt = Integer.parseInt(str2);
                    this.m = parseInt;
                    this.l.a(parseInt);
                } else if ("alsa_rate".equalsIgnoreCase(str)) {
                    this.s = Integer.parseInt(str2);
                } else if ("alsa_card".equalsIgnoreCase(str)) {
                    this.t = Integer.parseInt(str2);
                } else if ("alsa_per_size".equalsIgnoreCase(str)) {
                    this.u = Integer.parseInt(str2);
                } else if ("alsa_save".equalsIgnoreCase(str)) {
                    this.r.a(d(str2));
                } else if (SpeechConstant.AUDIO_SOURCE.equalsIgnoreCase(str)) {
                    this.v = Integer.parseInt(str2);
                } else if ("buf_mode".equalsIgnoreCase(str)) {
                    int parseInt2 = Integer.parseInt(str2);
                    this.k = parseInt2;
                    if (parseInt2 != 1) {
                        com.iflytek.cloud.a.d.e.b.c cVar = this.i;
                        cVar.a(983040 - cVar.g());
                    } else {
                        com.iflytek.cloud.a.d.e.b.c cVar2 = this.i;
                        cVar2.a(491520 - cVar2.g());
                    }
                    if (i()) {
                        DebugLog.LogD("aimic  setParameter Native");
                        i = AIMIC.AIMICSetParam(AIMIC.getHandler(), com.iflytek.cloud.msc.util.d.a(str), com.iflytek.cloud.msc.util.d.a(str2));
                    }
                    i = ErrorCode.ERROR_AIMIC_NOT_INIT;
                } else if ("thread_priority".equalsIgnoreCase(str)) {
                    if (i()) {
                        DebugLog.LogD("aimic  setParameter Native");
                        i = AIMIC.AIMICSetParam(AIMIC.getHandler(), com.iflytek.cloud.msc.util.d.a(str), com.iflytek.cloud.msc.util.d.a(str2));
                        this.j.a(Integer.parseInt(str2));
                    }
                    i = ErrorCode.ERROR_AIMIC_NOT_INIT;
                } else {
                    if (i()) {
                        DebugLog.LogD("aimic  setParameter Native");
                        i = AIMIC.AIMICSetParam(AIMIC.getHandler(), com.iflytek.cloud.msc.util.d.a(str), com.iflytek.cloud.msc.util.d.a(str2));
                    }
                    i = ErrorCode.ERROR_AIMIC_NOT_INIT;
                }
                i = 0;
            }
        } catch (UnsatisfiedLinkError e) {
            DebugLog.LogE(e);
            i = ErrorCode.ERROR_UNSATISFIED_LINK;
        } catch (Throwable th) {
            DebugLog.LogE(th);
            i = ErrorCode.ERROR_UNKNOWN;
        }
        DebugLog.LogD("aimic  setParameter leave: " + i);
        return i;
    }

    @Override // com.iflytek.cloud.a.d.e.a
    public int a(byte[] bArr, int i, int i2) {
        int i3;
        synchronized (this.f) {
            if (i()) {
                i3 = b(bArr, i, i2);
            } else {
                DebugLog.LogE("write audio while not init!");
                i3 = ErrorCode.ERROR_AIMIC_NOT_INIT;
            }
        }
        return i3;
    }

    @Override // com.iflytek.cloud.a.d.e.a
    public void a(boolean z, int i) {
        synchronized (this.f) {
            try {
                DebugLog.setShowLog(z);
                DebugLog.setLogLevel(DebugLog.a.values()[i]);
                AIMIC.AIMICDebugLog(z, i);
                com.iflytek.cloud.a.d.e.b.b bVar = this.f11119q;
                if (bVar != null) {
                    bVar.a(z && DebugLog.a.detail.ordinal() >= i);
                }
            } finally {
            }
        }
    }
}
