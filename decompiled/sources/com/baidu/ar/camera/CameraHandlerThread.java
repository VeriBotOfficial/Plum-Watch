package com.baidu.ar.camera;

import android.graphics.SurfaceTexture;
import android.hardware.Camera;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Log;
import android.view.SurfaceHolder;

/* loaded from: classes12.dex */
public class CameraHandlerThread extends HandlerThread {

    /* renamed from: a, reason: collision with root package name */
    public final Handler f6841a;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Camera.ErrorCallback f6842a;

        public a(CameraHandlerThread cameraHandlerThread, Camera.ErrorCallback errorCallback) {
            this.f6842a = errorCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            CameraManager.getInstance().setOnCameraError(this.f6842a);
        }
    }

    public class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ byte[] f6843a;

        public b(CameraHandlerThread cameraHandlerThread, byte[] bArr) {
            this.f6843a = bArr;
        }

        @Override // java.lang.Runnable
        public void run() {
            CameraManager.getInstance().addCameraCallbackBuffer(this.f6843a);
        }
    }

    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f6844a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;
        public final /* synthetic */ int d;

        public c(int i, int i2, int i3, int i4) {
            this.f6844a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }

        @Override // java.lang.Runnable
        public void run() {
            CameraHandlerThread.this.a(this.f6844a, this.b, this.c, this.d);
            CameraHandlerThread.this.f();
        }
    }

    public class d implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f6845a;
        public final /* synthetic */ int b;

        public d(int i, int i2) {
            this.f6845a = i;
            this.b = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            CameraHandlerThread.this.internalReopenCamera(this.f6845a, this.b);
            CameraHandlerThread.this.f();
        }
    }

    public class e implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SurfaceHolder f6846a;

        public e(SurfaceHolder surfaceHolder) {
            this.f6846a = surfaceHolder;
        }

        @Override // java.lang.Runnable
        public void run() {
            CameraHandlerThread.this.a(this.f6846a);
        }
    }

    public class f implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ SurfaceTexture f6847a;

        public f(SurfaceTexture surfaceTexture) {
            this.f6847a = surfaceTexture;
        }

        @Override // java.lang.Runnable
        public void run() {
            CameraHandlerThread.this.a(this.f6847a);
        }
    }

    public class g implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ Camera.PreviewCallback f6848a;

        public g(Camera.PreviewCallback previewCallback) {
            this.f6848a = previewCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            CameraHandlerThread.this.a(this.f6848a);
        }
    }

    public class h implements Runnable {
        public h() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CameraHandlerThread.this.d();
        }
    }

    public class i implements Runnable {
        public i() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CameraHandlerThread.this.e();
        }
    }

    public class j implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ int f6851a;
        public final /* synthetic */ int b;
        public final /* synthetic */ int c;

        public j(int i, int i2, int i3) {
            this.f6851a = i;
            this.b = i2;
            this.c = i3;
        }

        @Override // java.lang.Runnable
        public void run() {
            CameraHandlerThread.this.a(this.f6851a, this.b, this.c);
        }
    }

    public class k implements Runnable {
        public k() {
        }

        @Override // java.lang.Runnable
        public void run() {
            CameraHandlerThread.this.c();
            CameraHandlerThread.this.g();
        }
    }

    public CameraHandlerThread() {
        super("CameraHandlerThread");
        start();
        this.f6841a = new Handler(getLooper());
    }

    public CameraHandlerThread(String str) {
        super(str);
        start();
        this.f6841a = new Handler(getLooper());
    }

    public final void a(int i2, int i3, int i4) {
        CameraManager.getInstance().switchCamera(i2, i3, i4);
    }

    public final void a(int i2, int i3, int i4, int i5) {
        CameraManager.getInstance().openCamera(i2, i3, i4, i5);
    }

    public final void a(SurfaceTexture surfaceTexture) {
        CameraManager.getInstance().setPreviewSurface(surfaceTexture);
    }

    public final void a(Camera.PreviewCallback previewCallback) {
        CameraManager.getInstance().setPreviewCallback(previewCallback);
    }

    public final void a(SurfaceHolder surfaceHolder) {
        CameraManager.getInstance().setPreviewSurface(surfaceHolder);
    }

    public void addCameraCallbackBuffer(byte[] bArr) {
        b();
        this.f6841a.post(new b(this, bArr));
    }

    public final void b() {
        if (this.f6841a == null) {
            throw new NullPointerException("Handler is not available!");
        }
    }

    public final void c() {
        CameraManager.getInstance().releaseCamera();
    }

    public final void d() {
        CameraManager.getInstance().startPreview();
    }

    public void destoryThread() {
        this.f6841a.removeCallbacksAndMessages(null);
        quitSafely();
    }

    public final void e() {
        CameraManager.getInstance().stopPreview();
    }

    public final synchronized void f() {
        notify();
    }

    public final synchronized void g() {
        notify();
    }

    public int getCameraId() {
        return CameraManager.getInstance().getCameraID();
    }

    public Handler getHandler() {
        return this.f6841a;
    }

    public final void h() {
        try {
            wait();
        } catch (InterruptedException unused) {
            Log.w("CameraHandlerThread", "wait was interrupted");
        }
    }

    public void internalReopenCamera(int i2, int i3) {
        CameraManager.getInstance().reopenCamera(i2, i3);
    }

    public synchronized void openCamera(int i2, int i3, int i4, int i5) {
        try {
            try {
                b();
                this.f6841a.post(new c(i2, i3, i4, i5));
                h();
            } catch (Throwable th) {
                th = th;
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public synchronized void releaseCamera() {
        b();
        this.f6841a.post(new k());
        h();
    }

    public synchronized void reopenCamera(int i2, int i3) {
        b();
        this.f6841a.post(new d(i2, i3));
        h();
    }

    public boolean setCameraFlashMode(String str) {
        return CameraManager.getInstance().setCameraFlashMode(str);
    }

    public void setOnCameraError(Camera.ErrorCallback errorCallback) {
        b();
        this.f6841a.post(new a(this, errorCallback));
    }

    public void setPreviewCallback(Camera.PreviewCallback previewCallback) {
        b();
        this.f6841a.post(new g(previewCallback));
    }

    public void setPreviewSurface(SurfaceTexture surfaceTexture) {
        b();
        this.f6841a.post(new f(surfaceTexture));
    }

    public void setPreviewSurface(SurfaceHolder surfaceHolder) {
        b();
        this.f6841a.post(new e(surfaceHolder));
    }

    public void startPreview() {
        b();
        this.f6841a.post(new h());
    }

    public void stopPreview() {
        b();
        this.f6841a.post(new i());
    }

    public void switchCamera(int i2, int i3, int i4) {
        b();
        this.f6841a.post(new j(i2, i3, i4));
    }
}
