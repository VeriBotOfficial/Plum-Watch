package com.baidu.ar.recorder;

import android.content.Context;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.view.Surface;
import com.baidu.ar.ae;
import com.baidu.ar.d9;
import com.baidu.ar.h;
import com.baidu.ar.l6;
import com.baidu.ar.ma;
import com.baidu.ar.p3;
import com.baidu.ar.record.EncoderParams;
import com.baidu.ar.y0;
import com.baidu.ar.z8;
import com.facebook.ads.AdError;
import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public class MovieRecorder implements l6 {
    public static final int ERROR_CODE_ON_START = 4001;
    public static final int ERROR_CODE_ON_STOP = 4002;
    public static final String s = "MovieRecorder";
    public static volatile int t = 0;
    public static volatile boolean u = false;
    public static volatile MovieRecorder v;
    public Context b;
    public HandlerThread d;
    public EncoderParams g;
    public com.baidu.ar.record.MovieRecorderCallback h;
    public d i;
    public ma j;
    public z8 k;
    public d9 l;
    public y0 m;
    public p3 n;
    public ae p;

    /* renamed from: q, reason: collision with root package name */
    public p3 f7153q;

    /* renamed from: a, reason: collision with root package name */
    public int f7152a = 0;
    public boolean c = false;
    public volatile boolean e = false;
    public boolean f = false;
    public volatile boolean o = false;
    public volatile boolean r = false;

    public class a implements p3 {
        public a() {
        }

        @Override // com.baidu.ar.p3
        public void a(boolean z) {
            if (MovieRecorder.this.p != null) {
                MovieRecorder.this.p.f();
                MovieRecorder.this.p = null;
            }
            MovieRecorder.this.f7153q = null;
            MovieRecorder.this.b(2, z);
        }

        @Override // com.baidu.ar.p3
        public void a(boolean z, Object obj) {
            if (z) {
                if (MovieRecorder.this.i != null) {
                    MovieRecorder.this.i.sendMessage(MovieRecorder.this.i.obtainMessage(7000, obj));
                }
                if (MovieRecorder.this.p != null) {
                    MovieRecorder.this.p.g();
                }
            }
        }

        @Override // com.baidu.ar.p3
        public void b(boolean z) {
        }

        @Override // com.baidu.ar.p3
        public void c(boolean z) {
            MovieRecorder.this.r = z;
            MovieRecorder.this.a(2, z);
        }
    }

    public class b implements p3 {
        public b() {
        }

        @Override // com.baidu.ar.p3
        public void a(boolean z) {
            MovieRecorder.this.m.f();
            MovieRecorder.this.m = null;
            MovieRecorder.this.n = null;
            MovieRecorder.this.b(4, z);
        }

        @Override // com.baidu.ar.p3
        public void a(boolean z, Object obj) {
            if (z) {
                MovieRecorder.this.m.g();
            }
        }

        @Override // com.baidu.ar.p3
        public void b(boolean z) {
            boolean unused = MovieRecorder.u = z;
        }

        @Override // com.baidu.ar.p3
        public void c(boolean z) {
            MovieRecorder.this.o = z;
            MovieRecorder.this.a(4, z);
        }
    }

    public class c implements d9 {
        public c() {
        }

        @Override // com.baidu.ar.d9
        public void a(boolean z) {
            MovieRecorder.this.a(1, z);
        }

        @Override // com.baidu.ar.d9
        public void b(boolean z) {
            MovieRecorder.this.k.b();
            MovieRecorder.this.k = null;
            MovieRecorder.this.l = null;
            MovieRecorder.this.b(1, z);
        }
    }

    public class d extends Handler {
        public d(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            switch (message.what) {
                case 7000:
                    if (MovieRecorder.this.h != null) {
                        MovieRecorder.this.h.onRecorderInit((Surface) message.obj);
                        break;
                    }
                    break;
                case 7001:
                    if (MovieRecorder.this.h != null) {
                        MovieRecorder.this.h.onRecorderStart(((Boolean) message.obj).booleanValue());
                    }
                    MovieRecorder.this.e = false;
                    break;
                case 7002:
                    if (MovieRecorder.this.h != null) {
                        MovieRecorder.this.h.onRecorderProcess(((Integer) message.obj).intValue());
                        break;
                    }
                    break;
                case AdError.CLEAR_TEXT_SUPPORT_NOT_ALLOWED /* 7003 */:
                    if (MovieRecorder.this.h != null) {
                        MovieRecorder.this.h.onRecorderComplete(((Boolean) message.obj).booleanValue(), MovieRecorder.this.g != null ? MovieRecorder.this.g.getOutputFile() : null);
                        break;
                    }
                    break;
                case AdError.INCORRECT_STATE_ERROR /* 7004 */:
                    if (MovieRecorder.this.h != null) {
                        MovieRecorder.this.h.onRecorderError(((Integer) message.obj).intValue());
                        break;
                    }
                    break;
                case AdError.MISSING_DEPENDENCIES_ERROR /* 7005 */:
                    MovieRecorder.this.l();
                    break;
                case AdError.API_NOT_SUPPORTED /* 7006 */:
                    MovieRecorder.this.e = false;
                    MovieRecorder.this.stopRecorder();
                    break;
            }
            super.handleMessage(message);
        }
    }

    public static void a(int i) {
        t = i;
    }

    public static void b(boolean z) {
        u = z;
    }

    public static MovieRecorder getInstance() {
        if (v == null) {
            synchronized (MovieRecorder.class) {
                if (v == null) {
                    v = new MovieRecorder();
                }
            }
        }
        return v;
    }

    public static void h() {
        v = null;
    }

    public final void a() {
        this.f7153q = new a();
        this.n = new b();
        this.l = new c();
    }

    public final synchronized void a(int i, boolean z) {
        String str = s;
        h.c(str, "checkMovieRecordStartState condition = " + i + " && state = " + z);
        d(i, z);
        h.c(str, "checkMovieRecordStartState sMovieRecordState = " + t);
        if (e()) {
            boolean c2 = c();
            d dVar = this.i;
            dVar.sendMessage(dVar.obtainMessage(7001, Boolean.valueOf(c2)));
        }
    }

    public final void a(long j) {
        d dVar;
        if (!this.j.a()) {
            this.j.b(j);
            return;
        }
        int a2 = this.j.a(j);
        if (a2 <= 0 || (dVar = this.i) == null) {
            return;
        }
        dVar.sendMessage(dVar.obtainMessage(7002, Integer.valueOf(a2)));
    }

    public final void b() {
        this.k = new z8();
        if (this.g.isAudioIncluded()) {
            this.m = new y0();
        } else {
            u = true;
        }
        this.p = new ae();
        this.f7152a = 0;
        if (!this.c && this.d == null) {
            HandlerThread handlerThread = new HandlerThread(s);
            this.d = handlerThread;
            handlerThread.start();
        }
        d dVar = this.i;
        if (dVar == null) {
            this.i = this.d != null ? new d(this.d.getLooper()) : new d(this.b.getMainLooper());
        } else {
            dVar.removeCallbacksAndMessages(null);
        }
        this.j = new ma(this.g.getOutputTotalMs());
    }

    public final synchronized void b(int i, boolean z) {
        String str = s;
        h.c(str, "checkMovieRecordStopState condition = " + i + " && state = " + z);
        c(i, z);
        h.c(str, "checkMovieRecordStopState sMovieRecordState = " + t);
        if (f() && this.i != null) {
            boolean d2 = d();
            d dVar = this.i;
            dVar.sendMessage(dVar.obtainMessage(AdError.CLEAR_TEXT_SUPPORT_NOT_ALLOWED, Boolean.valueOf(d2)));
        }
    }

    public final void c(int i, boolean z) {
        if (z) {
            t = i ^ t;
        }
        this.f7152a--;
    }

    public final synchronized boolean c() {
        int i;
        h.c(s, "isMovieRecordStarted sMovieRecordState = " + t);
        int i2 = t;
        i = i2 ^ 3;
        EncoderParams encoderParams = this.g;
        if (encoderParams != null) {
            if (encoderParams.isAudioIncluded()) {
                i = i2 ^ 7;
            }
        }
        return i == 0;
    }

    public final void d(int i, boolean z) {
        if (z) {
            t = i | t;
        }
        this.f7152a++;
    }

    public final synchronized boolean d() {
        return t == 0;
    }

    public final boolean e() {
        EncoderParams encoderParams = this.g;
        if (encoderParams == null) {
            return false;
        }
        if (encoderParams.isAudioIncluded()) {
            if (this.f7152a == 3) {
                return true;
            }
        } else if (this.f7152a == 2) {
            return true;
        }
        return false;
    }

    public final boolean f() {
        return this.f7152a == 0;
    }

    public final boolean g() {
        boolean z;
        y0 y0Var = this.m;
        if (y0Var == null || !y0Var.e()) {
            z = true;
        } else {
            h.b(s, "prepareMovieRecorder mAudioRecorder.isRunning !!!");
            this.m.h();
            this.m.f();
            z = false;
        }
        ae aeVar = this.p;
        if (aeVar != null && aeVar.e()) {
            h.b(s, "prepareMovieRecorder mVideoRecorder.isRunning !!!");
            this.p.h();
            this.p.f();
            z = false;
        }
        EncoderParams encoderParams = this.g;
        if (encoderParams == null || this.k.a(encoderParams.getOutputFile(), this.g.getOutputFormat(), this.l)) {
            return z;
        }
        h.b(s, "prepareMovieRecorder movieMuxerInit error!!!");
        return false;
    }

    public final void i() {
        h.c(s, "restartRecorder mRestartTried = " + this.f);
        d dVar = this.i;
        if (dVar != null) {
            this.f = true;
            dVar.sendMessageDelayed(dVar.obtainMessage(AdError.MISSING_DEPENDENCIES_ERROR), 500L);
        }
    }

    public final void j() {
        y0 y0Var = this.m;
        if (y0Var != null) {
            y0Var.a(this.g, this.k, this.n);
        }
    }

    public final void k() {
        d dVar = this.i;
        if (dVar != null) {
            dVar.sendMessageDelayed(dVar.obtainMessage(7001, Boolean.FALSE), 500L);
        }
    }

    public final void l() {
        b();
        a();
        if (g()) {
            j();
            m();
        } else if (this.f) {
            k();
        } else {
            i();
        }
    }

    public final void m() {
        this.p.a(this.g, this.k, this.f7153q);
    }

    @Override // com.baidu.ar.l6
    public void onAudioFrameAvailable(ByteBuffer byteBuffer, int i, long j) {
        y0 y0Var;
        if (this.o && (y0Var = this.m) != null && y0Var.e()) {
            this.m.a(byteBuffer, i, j);
        }
    }

    public void onDestroy() {
        this.j = null;
        this.b = null;
        this.g = null;
        this.h = null;
        a(0);
        h();
        d dVar = this.i;
        if (dVar != null) {
            dVar.removeCallbacksAndMessages(null);
            this.i = null;
        }
        HandlerThread handlerThread = this.d;
        if (handlerThread != null) {
            handlerThread.quit();
            this.d = null;
        }
    }

    @Override // com.baidu.ar.l6
    public void onVideoFrameAvailable(long j) {
        ae aeVar = this.p;
        if (aeVar != null && aeVar.e() && this.r && u) {
            this.p.a(j);
            a(j / 1000000);
        }
    }

    @Override // com.baidu.ar.l6
    public void startRecorder(Context context, EncoderParams encoderParams, com.baidu.ar.record.MovieRecorderCallback movieRecorderCallback) {
        h.c(s, "startRecorder mStarting = " + this.e);
        if (this.e) {
            k();
            return;
        }
        this.e = true;
        this.b = context;
        this.g = encoderParams;
        this.h = movieRecorderCallback;
        l();
    }

    @Override // com.baidu.ar.l6
    public void stopRecorder() {
        d dVar;
        String str = s;
        h.c(str, "stopRecorder mStarting = " + this.e);
        if (this.e) {
            if (!c() && (dVar = this.i) != null) {
                dVar.sendMessage(dVar.obtainMessage(AdError.INCORRECT_STATE_ERROR, 4002));
            }
            h.a(str, "stopRecorder() MovieRecorder is starting, we will try to stop 500ms later!!!");
            d dVar2 = this.i;
            if (dVar2 != null) {
                dVar2.sendMessageDelayed(dVar2.obtainMessage(AdError.API_NOT_SUPPORTED), 500L);
                return;
            }
            return;
        }
        this.o = false;
        this.r = false;
        y0 y0Var = this.m;
        if (y0Var != null && y0Var.e()) {
            this.m.h();
        }
        ae aeVar = this.p;
        if (aeVar != null && aeVar.e()) {
            this.p.h();
        }
        b(false);
    }
}
