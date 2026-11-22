package com.huawei.hms.scankit.p;

import android.content.Context;
import android.graphics.Point;
import android.hardware.Camera;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.view.TextureView;
import com.huawei.hms.mlkit.common.ha.HianalyticsLogProvider;
import com.huawei.hms.scankit.p.C2999f;
import com.wakeup.howear.R;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.List;
import kotlinx.coroutines.DebugKt;

/* compiled from: CameraManager.java */
/* renamed from: com.huawei.hms.scankit.p.e, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C2995e {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f10633a;
    private C2983b b;
    private c c;
    private a d;
    private Camera.PreviewCallback e;
    private WeakReference<Context> f;
    private C3023l g;
    private C3019k h;
    private C3031n i;
    private C3027m j;
    private Camera k;
    private C3015j l;
    private C3035o m;
    private String n;
    private b o = b.CAMERA_CLOSED;
    private boolean p = false;

    /* renamed from: q, reason: collision with root package name */
    private int f10634q = -1;

    /* compiled from: CameraManager.java */
    /* renamed from: com.huawei.hms.scankit.p.e$a */
    public interface a {
        void a(Point point);
    }

    /* compiled from: CameraManager.java */
    /* renamed from: com.huawei.hms.scankit.p.e$b */
    public enum b {
        CAMERA_CLOSED(1),
        CAMERA_OPENED(2),
        CAMERA_INITIALED(3),
        PREVIEW_STARTED(4),
        PREVIEW_STOPPED(5);

        private final int g;

        b(int i) {
            this.g = i;
        }

        public final int a() {
            return this.g;
        }
    }

    /* compiled from: CameraManager.java */
    /* renamed from: com.huawei.hms.scankit.p.e$c */
    public interface c {
        void a();

        void b();

        void onClosed();
    }

    /* compiled from: CameraManager.java */
    /* renamed from: com.huawei.hms.scankit.p.e$d */
    public interface d {
        void a(byte[] bArr);
    }

    /* compiled from: CameraManager.java */
    /* renamed from: com.huawei.hms.scankit.p.e$e, reason: collision with other inner class name */
    static class C0612e implements Camera.PreviewCallback {
        private C0612e() {
        }

        @Override // android.hardware.Camera.PreviewCallback
        public void onPreviewFrame(byte[] bArr, Camera camera) {
        }
    }

    public C2995e(Context context, C2983b c2983b) {
        if (context == null || c2983b == null) {
            throw new IllegalArgumentException("CameraManager constructor param invalid");
        }
        this.f = new WeakReference<>(context);
        this.b = c2983b;
        this.n = c2983b.f();
        this.l = new C3015j();
        this.h = new C3019k();
        this.i = new C3031n();
        this.j = new C3027m();
        this.m = new C3035o(context);
        this.f10633a = c2983b.g();
        r();
    }

    private void q() {
        if (this.f10633a) {
            return;
        }
        if (HianalyticsLogProvider.getInstance().sdkForbiddenHiLog(this.f.get())) {
            Log.w("CameraManager", "CameraManager::closeHaTimer failed");
            return;
        }
        HianalyticsLogProvider.getInstance().reportAndCancelTimer("MLKitCamera");
        if (this.p) {
            Handler handler = this.m.b;
            if (handler != null) {
                Message.obtain(handler, R.integer.N_lastNextMothAlphaColor).sendToTarget();
            }
            this.p = false;
        }
    }

    private void r() {
        if (this.f10633a) {
            return;
        }
        if (HianalyticsLogProvider.getInstance().sdkForbiddenHiLog(this.f.get())) {
            Log.w("CameraManager", "CameraManager::initialHaTimer failed");
            return;
        }
        HianalyticsLogProvider.getInstance().initTimer("MLKitCamera");
        if (this.p) {
            return;
        }
        this.m.start();
        this.p = true;
    }

    public synchronized void a(d dVar) {
        if (dVar == null) {
            throw new IllegalArgumentException("CameraManager::setFrameCallback param invalid");
        }
        this.e = new C3039p(this.m, dVar);
    }

    public synchronized C2987c b() {
        if (this.k != null && this.o.a() != b.CAMERA_CLOSED.a()) {
            return this.h.a();
        }
        return null;
    }

    public synchronized void c(int i) {
        if (this.k != null && this.o.a() != b.CAMERA_CLOSED.a()) {
            this.i.a(i);
        }
    }

    public synchronized int d() {
        return this.b.d();
    }

    public synchronized Point e() {
        return this.l.b;
    }

    public synchronized b f() {
        return this.o;
    }

    public synchronized C3003g g() {
        if (this.k != null && this.o.a() != b.CAMERA_CLOSED.a()) {
            return this.i.a();
        }
        return null;
    }

    public synchronized String h() {
        return this.n;
    }

    public synchronized boolean i() {
        return this.i.b();
    }

    public synchronized void j() {
        q();
        this.d = null;
    }

    public synchronized void k() {
        try {
            if (this.o.a() == b.PREVIEW_STARTED.a()) {
                a();
                p();
                this.o = b.PREVIEW_STOPPED;
            }
            if (h().equals("torch")) {
                a(DebugKt.DEBUG_PROPERTY_VALUE_OFF);
            }
            if (this.o.a() >= b.CAMERA_OPENED.a()) {
                this.o = b.CAMERA_CLOSED;
                Camera camera = this.k;
                if (camera != null) {
                    camera.release();
                    this.k = null;
                }
                c cVar = this.c;
                if (cVar != null) {
                    cVar.onClosed();
                }
            }
        } catch (RuntimeException unused) {
            Log.e("CameraManager", "CameraManager::onPause failed");
        }
    }

    public synchronized void l() {
        b bVar = this.o;
        if (bVar == b.CAMERA_CLOSED || bVar == b.PREVIEW_STOPPED) {
            try {
                this.k = Camera.open(d(this.b.b()));
            } catch (RuntimeException e) {
                Log.e("CameraManager", "CameraManager::Camera open failed, " + e.getMessage());
            }
            if (this.k == null) {
                Log.e("CameraManager", "CameraManager::initCamera failed");
                c cVar = this.c;
                if (cVar != null) {
                    cVar.b();
                }
            } else {
                c cVar2 = this.c;
                if (cVar2 != null) {
                    cVar2.a();
                }
                this.o = b.CAMERA_OPENED;
            }
        }
    }

    public synchronized void m() {
        Camera camera;
        if (this.o.a() < b.CAMERA_OPENED.a()) {
            return;
        }
        if (this.b.c() != 0 && (camera = this.k) != null) {
            camera.setPreviewCallback(new C0612e());
        }
    }

    public synchronized void n() {
        if (this.b.c() == 1) {
            Log.d("CameraManager", "CameraManager::requestPreviewFrame PREVIEW_ONE_SHOT");
            if (this.o == b.PREVIEW_STOPPED) {
                return;
            }
            Camera camera = this.k;
            if (camera != null) {
                camera.setOneShotPreviewCallback(this.e);
            }
        } else if (this.b.c() == 0) {
            Log.d("CameraManager", "CameraManager::requestPreviewFrame PICTURE_MODE");
            if (this.o == b.PREVIEW_STOPPED) {
                o();
            }
        } else if (this.b.c() == 2) {
            Log.d("CameraManager", "CameraManager::requestPreviewFrame PREVIEW_MULTI_SHOT");
            if (this.o == b.PREVIEW_STOPPED) {
                return;
            }
            Camera camera2 = this.k;
            if (camera2 != null) {
                camera2.setPreviewCallback(this.e);
            }
        } else {
            Log.w("CameraManager", "CameraManager::requestPreviewFrame unknown mode");
        }
    }

    public synchronized void o() {
        try {
            if (this.o.a() < b.CAMERA_INITIALED.a()) {
                Log.w("CameraManager", "CameraManager::startPreview camera is not initialed yet");
                return;
            }
            Camera camera = this.k;
            if (camera != null) {
                camera.startPreview();
                this.o = b.PREVIEW_STARTED;
            }
        } catch (RuntimeException unused) {
            Log.w("CameraManager", "stopPreview error");
        }
    }

    public synchronized void p() {
        try {
            if (this.o.a() < b.PREVIEW_STARTED.a()) {
                Log.w("CameraManager", "CameraManager::startPreview camera is not startPreview yet");
                return;
            }
            Camera camera = this.k;
            if (camera != null) {
                camera.setPreviewCallback(null);
                this.k.stopPreview();
                this.o = b.PREVIEW_STOPPED;
            }
        } catch (RuntimeException unused) {
            Log.w("CameraManager", "stopPreview error");
        }
    }

    private int d(int i) {
        if (i != 0 && i != 1) {
            return 0;
        }
        int numberOfCameras = Camera.getNumberOfCameras();
        Camera.CameraInfo cameraInfo = new Camera.CameraInfo();
        for (int i2 = 0; i2 < numberOfCameras; i2++) {
            Camera.getCameraInfo(i2, cameraInfo);
            if (cameraInfo.facing == i) {
                Log.i("CameraManager", "findCameraId: ".concat(String.valueOf(i2)));
                return i2;
            }
        }
        return 0;
    }

    public synchronized void a(c cVar) {
        if (cVar != null) {
            this.c = cVar;
        } else {
            throw new IllegalArgumentException("CameraManager::setCameraStatusListener param invalid");
        }
    }

    public synchronized void b(int i) {
        if (this.k != null && this.o.a() != b.CAMERA_CLOSED.a()) {
            this.h.a(i);
        }
    }

    public synchronized C2999f c() {
        if (this.k != null && this.o.a() != b.CAMERA_CLOSED.a()) {
            return this.j.a();
        }
        return null;
    }

    public synchronized void a(TextureView textureView) throws IOException {
        if (textureView != null) {
            if (this.o.a() != b.CAMERA_OPENED.a()) {
                Log.w("CameraManager", "CameraManager::initCamera camera is not opened yet");
                l();
            }
            this.h.a(this.k);
            this.i.a(this.k);
            this.j.a(this.k);
            Camera camera = this.k;
            if (camera != null) {
                camera.setPreviewTexture(textureView.getSurfaceTexture());
            }
            this.l.a(this.k, this.b);
            Camera camera2 = this.k;
            if (camera2 != null) {
                camera2.setDisplayOrientation(this.b.d());
            }
            a aVar = this.d;
            if (aVar != null) {
                aVar.a(this.l.b);
            }
            this.o = b.CAMERA_INITIALED;
        } else {
            throw new IllegalArgumentException("CameraManager::initCamera SurfaceHolder is null");
        }
    }

    public synchronized void a(String str) {
        try {
            if (this.k == null || this.o.a() == b.CAMERA_CLOSED.a()) {
                return;
            }
            if (DebugKt.DEBUG_PROPERTY_VALUE_OFF.equals(str) || "torch".equals(str)) {
                Camera.Parameters parameters = this.k.getParameters();
                parameters.setFlashMode(str);
                this.k.setParameters(parameters);
                this.n = str;
            }
        } catch (RuntimeException unused) {
            Log.w("CameraManager", "CameraManager::setTorchStatus error");
        }
    }

    public synchronized void a() {
        C3023l c3023l = this.g;
        if (c3023l != null) {
            c3023l.a();
            throw null;
        }
    }

    public synchronized void a(List<C2999f.a> list) {
        if (this.k != null && this.o.a() != b.CAMERA_CLOSED.a()) {
            this.j.a(list);
        }
    }

    public synchronized void a(int i) {
        if (this.b != null && this.k != null && this.o.a() >= b.CAMERA_OPENED.a()) {
            this.b.a(i);
            this.k.setDisplayOrientation(i);
        }
    }
}
