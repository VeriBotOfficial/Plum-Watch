package com.qumeng.overseas.advlib.__remote__.framework.videoplayer;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.qumeng.overseas.advlib.__remote__.core.proto.response.AdsObject;
import com.qumeng.overseas.advlib.__remote__.framework.videoplayer.b;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes17.dex */
public class f {

    /* renamed from: a, reason: collision with root package name */
    com.qumeng.overseas.advlib.__remote__.framework.videoplayer.b f13021a;
    private Context b;
    private AdsObject c;
    private d d;
    public int g;
    private List<b.a> e = new ArrayList();
    private ArrayList<WeakReference<MediaStateChangeListener>> f = new ArrayList<>();
    private boolean h = false;
    private int i = -2;
    private boolean j = false;
    Handler k = new a(Looper.getMainLooper());

    class a extends Handler {
        a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what != 1) {
                return;
            }
            if (f.this.c() != -1 && f.this.c() != 3) {
                removeMessages(1);
                return;
            }
            long b = f.this.b();
            if (b <= 0) {
                if (f.this.c() == 2 || f.this.c() == 4) {
                    removeMessages(1);
                    return;
                } else {
                    sendEmptyMessageDelayed(1, 500L);
                    return;
                }
            }
            long j = b / 1000;
            f fVar = f.this;
            if (j < fVar.g) {
                fVar.p();
            } else {
                fVar.b(0L);
                sendEmptyMessageDelayed(1, 200L);
            }
        }
    }

    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f13023a;
        final /* synthetic */ long b;

        b(int i, long j) {
            this.f13023a = i;
            this.b = j;
        }

        @Override // java.lang.Runnable
        public void run() {
            for (int i = 0; i < f.this.e.size(); i++) {
                ((b.a) f.this.e.get(i)).onVideoStateChanged(this.f13023a, this.b);
            }
            for (int i2 = 0; i2 < f.this.f.size(); i2++) {
                if (f.this.f.get(i2) != null && ((WeakReference) f.this.f.get(i2)).get() != null) {
                    ((MediaStateChangeListener) ((WeakReference) f.this.f.get(i2)).get()).onPlayintStateChanged(this.f13023a, this.b);
                }
            }
        }
    }

    class c extends d {
        boolean d;

        c(com.qumeng.overseas.advlib.__remote__.framework.videoplayer.b bVar) {
            super(bVar);
        }

        @Override // com.qumeng.overseas.advlib.__remote__.framework.videoplayer.f.d
        public void callBack(int i) {
            try {
                int i2 = i / 1000;
                if (f.this.c != null) {
                    f.this.c.setPlayTime(i2);
                }
                f.this.a(i);
                if (this.d) {
                    return;
                }
                f fVar = f.this;
                if (i2 <= fVar.g * 10 || fVar.c == null) {
                    return;
                }
                this.d = true;
                com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.utils.h.a(f.this.b, f.this.c, f.this.b());
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static abstract class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        private com.qumeng.overseas.advlib.__remote__.framework.videoplayer.b f13024a;
        private boolean b = false;
        private Runnable c = new a();

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                if (d.this.f13024a != null) {
                    d dVar = d.this;
                    dVar.callBack((int) dVar.f13024a.getCurrentPosition());
                }
            }
        }

        public d(com.qumeng.overseas.advlib.__remote__.framework.videoplayer.b bVar) {
            this.f13024a = bVar;
        }

        public abstract void callBack(int i);

        public boolean isRunning() {
            return this.b;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.b) {
                com.qumeng.overseas.advlib.__remote__.framework.videoplayer.b bVar = this.f13024a;
                if (bVar == null || !bVar.isPlaying()) {
                    setRunning(false);
                } else {
                    com.qumeng.overseas.advlib.__remote__.utils.j.a(this, 1000L);
                    com.qumeng.overseas.advlib.__remote__.utils.j.c().post(this.c);
                }
            }
        }

        public void setRunning(boolean z) {
            this.b = z;
        }
    }

    public f(Context context, AdsObject adsObject, com.qumeng.overseas.advlib.__remote__.framework.videoplayer.b bVar) {
        this.b = context.getApplicationContext();
        this.c = adsObject;
        this.f13021a = bVar;
        this.g = adsObject.getVideoDuration();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void p() {
        if (this.d == null) {
            synchronized (this) {
                if (this.d == null) {
                    this.d = new c(this.f13021a);
                }
            }
        }
        synchronized (this) {
            d dVar = this.d;
            if (dVar != null && !dVar.isRunning()) {
                this.d.setRunning(true);
                com.qumeng.overseas.advlib.__remote__.utils.j.c().post(this.d);
                a(0, b());
            }
        }
    }

    public void g() {
        a(-200, b());
    }

    public void h() {
        a(6, b());
    }

    public void i() {
        a(2, b());
    }

    public void j() {
        a(8, b());
    }

    public void k() {
        a(7, b());
    }

    public void l() {
        a(3, b());
        n();
    }

    public void m() {
        a(9, b());
    }

    public void n() {
        if (this.k.hasMessages(1)) {
            return;
        }
        this.k.sendEmptyMessage(1);
    }

    public void o() {
        d dVar = this.d;
        if (dVar != null) {
            synchronized (dVar) {
                d dVar2 = this.d;
                if (dVar2 != null) {
                    dVar2.setRunning(false);
                }
                int i = this.i;
                if (i != 4 && i != 5) {
                    a(4, b());
                    if (this.j) {
                        f();
                    }
                }
            }
        }
    }

    public void b(b.a aVar) {
        this.e.remove(aVar);
    }

    public int c() {
        return this.i;
    }

    public boolean d() {
        return this.j;
    }

    public boolean e() {
        return this.h;
    }

    public void f() {
        AdsObject adsObject = this.c;
        if (adsObject == null || !adsObject.hasExpFeature(com.qumeng.overseas.advlib.__remote__.ui.elements.j.f)) {
            if (this.i != 4) {
                a(4, b());
            }
            a(5, b());
        } else {
            com.qumeng.overseas.advlib.__remote__.framework.videoplayer.b bVar = this.f13021a;
            if (bVar != null) {
                bVar.replay();
            }
            a(5, b());
        }
    }

    public void a(b.a aVar) {
        if (this.e.contains(aVar)) {
            return;
        }
        this.e.add(aVar);
    }

    public void b(MediaStateChangeListener mediaStateChangeListener) {
        int a2;
        if (mediaStateChangeListener == null || (a2 = new j().a(this.f, mediaStateChangeListener)) < 0 || a2 > this.f.size() - 1) {
            return;
        }
        this.f.remove(a2);
    }

    public void a(MediaStateChangeListener mediaStateChangeListener) {
        if (new j().a(this.f, mediaStateChangeListener) != -1) {
            return;
        }
        this.f.add(new WeakReference<>(mediaStateChangeListener));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public long b() {
        com.qumeng.overseas.advlib.__remote__.framework.videoplayer.b bVar = this.f13021a;
        if (bVar != null) {
            return bVar.getCurrentPosition();
        }
        return -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(long j) {
        com.qumeng.overseas.advlib.__remote__.framework.videoplayer.b bVar = this.f13021a;
        if (bVar != null) {
            bVar.seekTo(j);
        }
    }

    public void a(int i) {
        if (i == 6 || i == 7) {
            return;
        }
        this.i = i;
    }

    public void a(boolean z) {
        this.j = z;
    }

    public void a(long j) {
        d dVar = this.d;
        if (dVar != null) {
            synchronized (dVar) {
                d dVar2 = this.d;
                if (dVar2 != null && dVar2.isRunning()) {
                    a(1, j);
                    a(false);
                }
            }
        }
    }

    public void a(int i, long j) {
        this.h = i == 2;
        a(i);
        com.qumeng.overseas.advlib.__remote__.utils.j.c().post(new b(i, j));
    }

    public void a(Bundle bundle) {
        g();
    }

    public void a() {
        this.c = null;
        d dVar = this.d;
        if (dVar != null) {
            dVar.setRunning(false);
        }
        this.d = null;
        this.e.clear();
        this.f.clear();
        this.f13021a = null;
        this.k.removeCallbacksAndMessages(null);
    }
}
