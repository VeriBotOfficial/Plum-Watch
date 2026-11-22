package com.baidu.ar;

import android.app.Activity;
import android.content.Context;
import android.graphics.SurfaceTexture;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.util.Log;
import com.baidu.ar.arrender.FrameRenderListener;
import com.baidu.ar.arrender.IGLRenderer;
import com.baidu.ar.arrender.Texture;
import com.baidu.ar.i1;
import com.baidu.ar.marker.IMarker;
import com.baidu.ar.marker.MarkerFrameInfo;

/* loaded from: classes12.dex */
public class a implements FrameRenderListener, SurfaceTexture.OnFrameAvailableListener, i1.a {

    /* renamed from: a, reason: collision with root package name */
    public HandlerThread f6764a;
    public Handler b;
    public IGLRenderer c;
    public IMarker d;
    public GLSurfaceView e;
    public OnFrmeTrackingStateCallback f;
    public i1 g;

    /* renamed from: com.baidu.ar.a$a, reason: collision with other inner class name */
    public class HandlerC0321a extends Handler {
        public HandlerC0321a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            if (message.what != 1001) {
                return;
            }
            if (a.this.b != null) {
                a.this.b.removeMessages(1001);
                Message message2 = new Message();
                message2.what = 1001;
                a.this.b.sendMessageDelayed(message2, 33L);
            }
            if (a.this.c != null) {
                a.this.c.render();
            }
            if (a.this.e != null) {
                a.this.e.requestRender();
            }
        }
    }

    public void a() {
        Log.d("AREngineManager", "pause()!!!");
        i1 i1Var = this.g;
        if (i1Var != null) {
            i1Var.b();
        }
        Handler handler = this.b;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
        }
    }

    @Override // com.baidu.ar.i1.a
    public void a(int i, float[] fArr, float f, float[] fArr2, float[] fArr3) {
        if (this.d == null) {
            return;
        }
        MarkerFrameInfo markerFrameInfo = new MarkerFrameInfo();
        markerFrameInfo.setFps(30);
        markerFrameInfo.setPoseMat(fArr2);
        markerFrameInfo.setOrignalTransform(fArr3);
        markerFrameInfo.setTrackingState(i);
        markerFrameInfo.setIntrinsics(fArr);
        markerFrameInfo.setScaleY(f);
        markerFrameInfo.setDistort(new float[]{0.0f, 0.0f, 0.0f, 0.0f, 0.0f});
        markerFrameInfo.setMagnet(new double[]{-1.0d, -1.0d, -1.0d});
        this.d.setAvailableFrame(markerFrameInfo);
        OnFrmeTrackingStateCallback onFrmeTrackingStateCallback = this.f;
        if (onFrmeTrackingStateCallback != null) {
            onFrmeTrackingStateCallback.onTrackingState(i);
        }
    }

    public void a(Context context, int i, int i2, NavigationType navigationType, boolean z) {
        i1 dVar;
        h.a("AREngineManager", "setup width * height = " + i + " * " + i2);
        if (navigationType == NavigationType.AREngine) {
            dVar = new e((Activity) context);
        } else if (navigationType != NavigationType.ARCore) {
            return;
        } else {
            dVar = new d((Activity) context);
        }
        this.g = dVar;
        this.g.a(this);
        this.g.a(z);
        HandlerThread handlerThread = new HandlerThread("AREngineManager");
        this.f6764a = handlerThread;
        handlerThread.start();
        this.b = new HandlerC0321a(this.f6764a.getLooper());
    }

    public void a(GLSurfaceView gLSurfaceView) {
        this.e = gLSurfaceView;
    }

    public void a(OnFrmeTrackingStateCallback onFrmeTrackingStateCallback) {
        this.f = onFrmeTrackingStateCallback;
    }

    public void a(IGLRenderer iGLRenderer) {
        this.c = iGLRenderer;
    }

    public void a(Texture texture) {
        Log.d("AREngineManager", "setCameraTexture() texture.getId() = " + texture.getId());
        i1 i1Var = this.g;
        if (i1Var != null) {
            i1Var.a(texture);
        }
    }

    public void a(IMarker iMarker) {
        this.d = iMarker;
    }

    public void b() {
        Log.d("AREngineManager", "release()!!!");
        Handler handler = this.b;
        if (handler != null) {
            handler.removeCallbacksAndMessages(null);
            this.b = null;
        }
        HandlerThread handlerThread = this.f6764a;
        if (handlerThread != null) {
            handlerThread.quit();
            this.f6764a = null;
        }
        i1 i1Var = this.g;
        if (i1Var != null) {
            i1Var.c();
        }
        this.c = null;
        this.e = null;
    }

    public void c() {
        Log.d("AREngineManager", "resume()!!!");
        i1 i1Var = this.g;
        if (i1Var != null) {
            i1Var.d();
        }
        if (this.b != null) {
            Message message = new Message();
            message.what = 1001;
            this.b.sendMessage(message);
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public void onFrameAvailable(SurfaceTexture surfaceTexture) {
        GLSurfaceView gLSurfaceView = this.e;
        if (gLSurfaceView != null) {
            gLSurfaceView.requestRender();
        }
    }

    @Override // com.baidu.ar.arrender.FrameRenderListener
    public void onRenderFinished(long j) {
        Log.d("AREngineManager", "onRenderFinished timestamp = " + j);
    }

    @Override // com.baidu.ar.arrender.FrameRenderListener
    public void onRenderStarted(long j) {
        Log.d("AREngineManager", "onRenderStarted timestamp = " + j);
        i1 i1Var = this.g;
        if (i1Var != null) {
            i1Var.a();
        }
    }
}
