package com.baidu.ar;

import android.os.Handler;
import com.baidu.ar.arplay.core.pixel.FramePixels;
import com.baidu.ar.arplay.core.pixel.PixelReadListener;
import com.baidu.ar.arplay.core.pixel.PixelReadParams;

/* loaded from: classes12.dex */
public abstract class o4 extends f0 implements PixelReadListener {
    public static volatile boolean h = true;
    public PixelReadParams e;
    public boolean f = false;
    public Handler g;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ FramePixels f7103a;

        public a(FramePixels framePixels) {
            this.f7103a = framePixels;
        }

        @Override // java.lang.Runnable
        public void run() {
            o4.this.a(this.f7103a);
        }
    }

    public static void b(boolean z) {
        h = z;
    }

    public final void a(Handler handler) {
        this.g = handler;
    }

    @Override // com.baidu.ar.f0, com.baidu.ar.t5
    public final void a(e3 e3Var) {
        h.a("FrameDetector", "setup callback is " + (e3Var != null));
        super.a(e3Var);
        f();
    }

    public void a(boolean z) {
        this.f = z;
    }

    public abstract boolean a(FramePixels framePixels);

    public PixelReadParams b() {
        return this.e;
    }

    public boolean c() {
        return true;
    }

    public boolean d() {
        return this.f;
    }

    public abstract void e();

    public abstract void f();

    @Override // com.baidu.ar.arplay.core.pixel.PixelReadListener
    public boolean onPixelRead(FramePixels framePixels) {
        if (this.f && !h) {
            return false;
        }
        Handler handler = this.g;
        if (handler != null) {
            handler.post(new a(framePixels));
            return true;
        }
        a(framePixels);
        return true;
    }

    @Override // com.baidu.ar.f0, com.baidu.ar.t5
    public final void release() {
        Handler handler = this.g;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.g = null;
        }
        e();
        super.release();
    }
}
