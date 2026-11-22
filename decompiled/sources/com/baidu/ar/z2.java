package com.baidu.ar;

import android.os.Handler;
import android.os.Looper;

/* loaded from: classes12.dex */
public class z2 {

    /* renamed from: a, reason: collision with root package name */
    public int f7357a;
    public a b;
    public Handler c;
    public b d;

    public interface a {
        void onTick();
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public int f7358a;
        public a b;
        public Handler c;

        public b(Handler handler, int i, a aVar) {
            this.f7358a = i;
            this.c = handler;
            this.b = aVar;
        }

        public void b() {
            this.c.removeCallbacksAndMessages(null);
            this.c = null;
            this.b = null;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.c != null) {
                if (this.b != null && z2.this.f7357a > 0) {
                    this.b.onTick();
                }
                this.c.postDelayed(this, this.f7358a);
            }
        }
    }

    public z2(int i) {
        this.f7357a = i;
    }

    public void a() {
        Handler handler = this.c;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.c.removeCallbacks(this.d);
            b bVar = this.d;
            if (bVar != null) {
                bVar.b();
                this.d = null;
            }
            this.c = null;
            this.f7357a = 0;
            this.b = null;
        }
    }

    public void a(a aVar) {
        this.b = aVar;
    }

    public void b() {
        Handler handler = new Handler(Looper.myLooper());
        this.c = handler;
        b bVar = new b(handler, this.f7357a, this.b);
        this.d = bVar;
        this.c.post(bVar);
    }
}
