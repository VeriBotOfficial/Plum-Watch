package com.iflytek.cloud.record;

import android.content.Context;
import android.media.AudioManager;
import android.media.AudioTrack;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.msc.util.g;
import com.iflytek.cloud.msc.util.log.DebugLog;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* loaded from: classes17.dex */
public class c {
    private boolean A;
    ReentrantLock B;
    Condition C;
    AudioManager.OnAudioFocusChangeListener D;
    private int E;
    private Handler F;

    /* renamed from: a, reason: collision with root package name */
    private AudioTrack f11202a;
    private com.iflytek.cloud.record.b b;
    private Context c;
    private d d;
    private InterfaceC0656c e;
    private volatile int f;
    private boolean g;
    private int h;
    private int i;
    private boolean j;
    private boolean k;
    private Object l;
    private Object m;
    private final int n;
    private final int o;
    private final int p;

    /* renamed from: q, reason: collision with root package name */
    private int f11203q;
    private final float r;
    private final float s;
    private final float t;
    private int u;
    private float v;
    private float w;
    private float x;
    private boolean y;
    private boolean z;

    class a implements AudioManager.OnAudioFocusChangeListener {
        a() {
        }

        @Override // android.media.AudioManager.OnAudioFocusChangeListener
        public void onAudioFocusChange(int i) {
            if (i == -2 || i == -3 || i == -1) {
                DebugLog.LogD("PcmPlayer", "pause start");
                if (c.this.d()) {
                    DebugLog.LogD("PcmPlayer", "pause success");
                    c.this.k = true;
                    if (c.this.e != null) {
                        c.this.e.c();
                        return;
                    }
                    return;
                }
                return;
            }
            if (i == 1) {
                DebugLog.LogD("PcmPlayer", "resume start");
                if (c.this.k) {
                    c.this.k = false;
                    if (c.this.g()) {
                        DebugLog.LogD("PcmPlayer", "resume success");
                        if (c.this.e != null) {
                            c.this.e.b();
                        }
                    }
                }
            }
        }
    }

    class b extends Handler {
        b(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int i = message.what;
            if (i == 0) {
                if (c.this.e != null) {
                    c.this.e.onError((SpeechError) message.obj);
                    c.this.e = null;
                    return;
                }
                return;
            }
            if (i == 1) {
                if (c.this.e != null) {
                    c.this.e.c();
                    return;
                }
                return;
            }
            if (i == 2) {
                if (c.this.e != null) {
                    c.this.e.b();
                }
            } else if (i == 3) {
                if (c.this.e != null) {
                    c.this.e.a(message.arg1, message.arg2, c.this.E);
                }
            } else if (i == 4 && c.this.e != null) {
                c.this.e.a();
                c.this.e = null;
            }
        }
    }

    /* renamed from: com.iflytek.cloud.record.c$c, reason: collision with other inner class name */
    public interface InterfaceC0656c {
        void a();

        void a(int i, int i2, int i3);

        void b();

        void c();

        void onError(SpeechError speechError);
    }

    private class d extends Thread {

        /* renamed from: a, reason: collision with root package name */
        private int f11206a;

        class a implements AudioTrack.OnPlaybackPositionUpdateListener {
            a() {
            }

            @Override // android.media.AudioTrack.OnPlaybackPositionUpdateListener
            public void onMarkerReached(AudioTrack audioTrack) {
                DebugLog.LogI("PcmPlayer onMarkerReached");
                c.this.B.lock();
                try {
                    c.this.C.signalAll();
                } catch (Exception unused) {
                } finally {
                    c.this.B.unlock();
                }
            }

            @Override // android.media.AudioTrack.OnPlaybackPositionUpdateListener
            public void onPeriodicNotification(AudioTrack audioTrack) {
            }
        }

        private d() {
            this.f11206a = c.this.h;
        }

        public int a() {
            return this.f11206a;
        }

        /* JADX WARN: Code restructure failed: missing block: B:182:0x0382, code lost:
        
            if (r9.b.g == false) goto L138;
         */
        /* JADX WARN: Code restructure failed: missing block: B:82:0x0303, code lost:
        
            if (r9.b.g != false) goto L137;
         */
        /* JADX WARN: Code restructure failed: missing block: B:83:0x039c, code lost:
        
            com.iflytek.cloud.msc.util.g.b(r9.b.c, java.lang.Boolean.valueOf(r9.b.j), null);
         */
        /* JADX WARN: Code restructure failed: missing block: B:84:0x03af, code lost:
        
            r9.b.d = null;
            com.iflytek.cloud.msc.util.log.DebugLog.LogD("PcmPlayer", "player stopped");
         */
        /* JADX WARN: Code restructure failed: missing block: B:85:0x03bb, code lost:
        
            return;
         */
        /* JADX WARN: Code restructure failed: missing block: B:86:0x0384, code lost:
        
            com.iflytek.cloud.msc.util.g.b(r9.b.c, java.lang.Boolean.valueOf(r9.b.j), r9.b.D);
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public void run() {
            /*
                Method dump skipped, instructions count: 1061
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.iflytek.cloud.record.c.d.run():void");
        }

        public void a(int i) {
            this.f11206a = i;
        }

        /* synthetic */ d(c cVar, a aVar) {
            this();
        }
    }

    public c(Context context, int i, boolean z, boolean z2, boolean z3) {
        this.f11202a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = 0;
        this.g = true;
        this.h = 3;
        this.j = false;
        this.k = false;
        this.l = new Object();
        this.m = this;
        this.n = 2;
        this.o = 500;
        this.p = 50;
        this.f11203q = 1600;
        this.r = 1.0f;
        this.s = 0.0f;
        this.t = 0.1f;
        this.u = 16000;
        this.v = 0.0f;
        this.w = 1.0f;
        this.x = 0.1f;
        this.y = false;
        this.z = false;
        this.A = false;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.B = reentrantLock;
        this.C = reentrantLock.newCondition();
        this.D = new a();
        this.E = 0;
        this.F = new b(Looper.getMainLooper());
        this.c = context;
        this.h = i;
        this.j = z;
        this.A = z2;
        this.z = z3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e() throws Exception {
        d dVar = this.d;
        if (this.f11202a == null || !(dVar == null || dVar.a() == this.h)) {
            DebugLog.LogD("PcmPlayer", "prepAudioPlayer || audiotrack is null or stream type is change.");
            a();
            if (dVar != null) {
                dVar.a(this.h);
            }
        }
    }

    public int c() {
        return this.f;
    }

    public boolean d() {
        if (this.f == 4 || this.f == 3) {
            return false;
        }
        DebugLog.LogD("pause start fade out");
        j();
        this.f = 3;
        return true;
    }

    public void f() {
        synchronized (this.l) {
            AudioTrack audioTrack = this.f11202a;
            if (audioTrack != null) {
                if (audioTrack.getPlayState() == 3) {
                    this.f11202a.stop();
                }
                this.f11202a.release();
                this.f11202a = null;
            }
            DebugLog.LogD("PcmPlayer", "mAudioTrack released");
        }
    }

    public boolean g() {
        boolean a2 = a(3, 2);
        g.a(this.c, Boolean.valueOf(this.j), this.D);
        if (a2) {
            DebugLog.LogD("resume start fade in");
            Message.obtain(this.F, 2).sendToTarget();
            i();
        }
        return a2;
    }

    public void h() {
        DebugLog.LogD("fading set silence");
        synchronized (this.m) {
            if (Math.abs(0.0f - this.w) < 0.1f) {
                this.v = 0.0f;
                this.y = false;
            }
        }
        AudioTrack audioTrack = this.f11202a;
        float f = this.v;
        audioTrack.setStereoVolume(f, f);
    }

    public void i() {
        if (this.A) {
            synchronized (this.m) {
                DebugLog.LogD("start fade in");
                this.y = true;
                this.w = 1.0f;
                this.x = 0.1f;
            }
        }
    }

    public void j() {
        if (this.A) {
            synchronized (this.m) {
                DebugLog.LogD("start fade out");
                this.y = true;
                this.w = 0.0f;
                this.x = -0.1f;
            }
        }
    }

    public void k() {
        if (4 != this.f) {
            DebugLog.LogD("stop start fade out");
            j();
        }
        synchronized (this.m) {
            this.f = 4;
        }
    }

    public void b() {
        if (this.A) {
            synchronized (this.m) {
                if (Math.abs(this.w - this.v) < 0.1f) {
                    this.v = this.w;
                    this.y = false;
                    DebugLog.LogD("fading finish");
                } else {
                    this.v += this.x;
                }
            }
            AudioTrack audioTrack = this.f11202a;
            float f = this.v;
            audioTrack.setStereoVolume(f, f);
            return;
        }
        this.y = false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean a(int i, int i2) {
        boolean z;
        synchronized (this.m) {
            if (i == this.f) {
                this.f = i2;
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    private void a() throws Exception {
        DebugLog.LogD("PcmPlayer", "createAudio start");
        int h = this.b.h();
        this.i = AudioTrack.getMinBufferSize(h, 2, 2);
        int i = h / 1000;
        this.f11203q = i * 100;
        this.u = i * 1000;
        if (this.f11202a != null) {
            f();
        }
        DebugLog.LogD("PcmPlayer", "createAudio || mStreamType = " + this.h + ", buffer size: " + this.i);
        this.f11202a = new AudioTrack(this.h, h, 2, 2, this.i * 2, 1);
        this.b.d(this.i * 2);
        int i2 = this.i;
        if (i2 != -2 && i2 != -1) {
            DebugLog.LogD("PcmPlayer", "createAudio end");
            return;
        }
        throw new Exception();
    }

    public boolean a(com.iflytek.cloud.record.b bVar, InterfaceC0656c interfaceC0656c) {
        boolean z;
        DebugLog.LogD("PcmPlayer", "play mPlaytate= " + this.f + ",mAudioFocus= " + this.g);
        synchronized (this.m) {
            if (this.f == 4 || this.f == 0 || this.f == 3 || this.d == null) {
                this.b = bVar;
                this.e = interfaceC0656c;
                d dVar = new d(this, null);
                this.d = dVar;
                dVar.start();
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public c(Context context) {
        this.f11202a = null;
        this.b = null;
        this.c = null;
        this.d = null;
        this.e = null;
        this.f = 0;
        this.g = true;
        this.h = 3;
        this.j = false;
        this.k = false;
        this.l = new Object();
        this.m = this;
        this.n = 2;
        this.o = 500;
        this.p = 50;
        this.f11203q = 1600;
        this.r = 1.0f;
        this.s = 0.0f;
        this.t = 0.1f;
        this.u = 16000;
        this.v = 0.0f;
        this.w = 1.0f;
        this.x = 0.1f;
        this.y = false;
        this.z = false;
        this.A = false;
        ReentrantLock reentrantLock = new ReentrantLock();
        this.B = reentrantLock;
        this.C = reentrantLock.newCondition();
        this.D = new a();
        this.E = 0;
        this.F = new b(Looper.getMainLooper());
        this.c = context;
    }
}
