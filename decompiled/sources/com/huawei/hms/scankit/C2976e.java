package com.huawei.hms.scankit;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.os.Bundle;
import android.os.Process;
import android.os.RemoteException;
import android.util.Log;
import android.view.MotionEvent;
import android.view.TextureView;
import com.hjq.permissions.Permission;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import com.huawei.hms.feature.dynamic.ObjectWrapper;
import com.huawei.hms.hmsscankit.api.IOnErrorCallback;
import com.huawei.hms.hmsscankit.api.IOnResultCallback;
import com.huawei.hms.ml.scan.HmsScan;
import com.huawei.hms.scankit.aiscan.common.BarcodeFormat;
import com.huawei.hms.scankit.aiscan.common.EnumC2970d;
import com.huawei.hms.scankit.p.C2983b;
import com.huawei.hms.scankit.p.C2995e;
import com.huawei.hms.scankit.p.C2999f;
import com.huawei.hms.scankit.p.C3001fb;
import com.huawei.hms.scankit.p.C3003g;
import com.huawei.hms.scankit.p.C3013ib;
import java.math.BigDecimal;
import java.util.Collection;
import java.util.Collections;
import java.util.Map;

/* compiled from: CaptureHelper.java */
/* renamed from: com.huawei.hms.scankit.e, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public class C2976e implements InterfaceC2977f, h, InterfaceC2978g {

    /* renamed from: a, reason: collision with root package name */
    public static final String f10538a = "e";
    public static volatile C3013ib b;
    private IObjectWrapper A;
    private z B;
    private IOnResultCallback C;
    private IOnErrorCallback G;
    private final Rect d;
    private final int e;
    private final boolean f;
    private Context g;
    private HandlerC2966a h;
    private A i;
    private C2995e j;
    private ViewfinderView k;
    private TextureView l;
    private TextureView.SurfaceTextureListener m;
    private Collection<BarcodeFormat> n;
    private Map<EnumC2970d, ?> o;
    private String p;
    private String r;
    private float t;
    private boolean x;
    private boolean y;
    private boolean z;
    public volatile C3001fb c = null;
    private boolean s = true;
    private boolean u = true;
    private boolean v = false;
    private boolean w = true;
    private boolean D = false;
    private boolean E = false;
    private boolean H = true;

    /* renamed from: q, reason: collision with root package name */
    private boolean f10539q = false;
    private boolean F = false;

    public C2976e(Context context, TextureView textureView, ViewfinderView viewfinderView, Rect rect, int i, IObjectWrapper iObjectWrapper, boolean z, String str, boolean z2) {
        this.g = context;
        this.k = viewfinderView;
        this.A = iObjectWrapper;
        this.l = textureView;
        this.d = rect;
        this.e = i;
        this.f = z;
        this.r = str;
        this.y = z2;
    }

    private void i() {
        HandlerC2966a handlerC2966a = this.h;
        if (handlerC2966a != null) {
            handlerC2966a.e();
            this.h = null;
        }
        if (!this.f10539q) {
            this.l.setSurfaceTextureListener(null);
        }
        this.j.k();
    }

    public void e() {
        TextureView textureView;
        TextureView textureView2;
        this.F = false;
        try {
            this.c = new C3001fb((Bundle) ObjectWrapper.unwrap(this.A), this.r);
            this.c.b();
        } catch (RuntimeException unused) {
            com.huawei.hms.scankit.util.a.b(f10538a, "RuntimeException");
        } catch (Exception unused2) {
            com.huawei.hms.scankit.util.a.b(f10538a, "Exception");
        }
        if (!this.D && !this.f10539q && (textureView2 = this.l) != null) {
            textureView2.setSurfaceTextureListener(this.m);
            if (this.f10539q) {
                a(this.l);
            } else {
                this.l.setSurfaceTextureListener(this.m);
            }
        }
        if (this.E && this.g.checkPermission(Permission.CAMERA, Process.myPid(), Process.myUid()) == 0 && (textureView = this.l) != null) {
            this.E = false;
            a(textureView);
        }
    }

    public void f() {
        this.F = false;
        TextureView textureView = this.l;
        if (textureView != null) {
            textureView.setSurfaceTextureListener(this.m);
            this.D = true;
            if (this.f10539q) {
                a(this.l);
            } else {
                this.l.setSurfaceTextureListener(this.m);
            }
        }
    }

    public void g() {
        this.F = true;
        if (this.c != null) {
            this.c.c();
        }
        this.c = null;
        if (this.D) {
            i();
        }
    }

    public void h() {
        try {
            C2995e c2995e = this.j;
            if (c2995e != null) {
                c2995e.c(1);
            }
        } catch (RuntimeException unused) {
            com.huawei.hms.scankit.util.a.b(f10538a, "RuntimeException in reset zoomValue");
        } catch (Exception unused2) {
            com.huawei.hms.scankit.util.a.b(f10538a, "Exception in reset zoomValue");
        }
    }

    public void c() {
        this.F = true;
        this.j.j();
        b = null;
    }

    public void d() {
        this.F = true;
        if (this.D) {
            return;
        }
        i();
    }

    public void b() {
        this.F = false;
        try {
            b = new C3013ib((Bundle) ObjectWrapper.unwrap(this.A), this.r);
            b.a("single");
        } catch (RuntimeException unused) {
            com.huawei.hms.scankit.util.a.b(f10538a, "RuntimeException");
        } catch (Exception unused2) {
            com.huawei.hms.scankit.util.a.b(f10538a, "Exception");
        }
        if (this.g.getPackageManager() != null && !this.g.getPackageManager().hasSystemFeature("android.hardware.camera")) {
            Log.e("scankit", "has no camera");
            return;
        }
        C2983b a2 = a(this.g);
        Log.i(f10538a, "onCreate: CameraManageOncreate");
        C2995e c2995e = new C2995e(this.g, a2);
        this.j = c2995e;
        c2995e.a(new C2973b(this));
        this.m = new TextureViewSurfaceTextureListenerC2974c(this);
        this.i = new C2975d(this);
    }

    public boolean a(MotionEvent motionEvent) {
        if (!this.s || this.j.f().a() < C2995e.b.CAMERA_OPENED.a() || motionEvent.getPointerCount() <= 1) {
            return false;
        }
        int action = motionEvent.getAction() & 255;
        if (action == 2) {
            float b2 = b(motionEvent);
            float f = this.t;
            if (b2 > f + 6.0f) {
                a(true, this.j);
            } else if (b2 < f - 6.0f) {
                a(false, this.j);
            } else {
                com.huawei.hms.scankit.util.a.c("CaptureHelper", "MotionEvent.ACTION_MOVE no handleZoom");
            }
            this.t = b2;
        } else if (action == 5) {
            this.t = b(motionEvent);
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(TextureView textureView) {
        if (textureView != null && textureView.getSurfaceTexture() != null) {
            try {
                this.j.a(textureView);
                this.j.a(Collections.singletonList(new C2999f.a(new Rect(-150, -150, 150, 150), 1000)));
                try {
                    this.j.m();
                } catch (Exception e) {
                    com.huawei.hms.scankit.util.a.b(f10538a, "initCamera() get exception");
                    e.printStackTrace();
                }
                if (this.h == null) {
                    HandlerC2966a handlerC2966a = new HandlerC2966a(this.g, this.k, this.i, this.n, this.o, this.p, this.j, this.d, this.e, this.y, this.H);
                    this.h = handlerC2966a;
                    handlerC2966a.c(this.x);
                    this.h.a(this.z);
                    this.h.b(this.u);
                    this.h.a(this.B);
                    return;
                }
                return;
            } catch (Exception e2) {
                if (this.c != null) {
                    this.c.c(-1002);
                }
                com.huawei.hms.scankit.util.a.a(f10538a, "initCamera IOException", e2);
                e2.printStackTrace();
                return;
            }
        }
        com.huawei.hms.scankit.util.a.d(f10538a, "initCamera() no surface view");
    }

    private float b(MotionEvent motionEvent) {
        float x = motionEvent.getX(0) - motionEvent.getX(1);
        float y = motionEvent.getY(0) - motionEvent.getY(1);
        double sqrt = Math.sqrt((x * x) + (y * y));
        if (Double.isInfinite(sqrt) || Double.isNaN(sqrt)) {
            return 0.0f;
        }
        return BigDecimal.valueOf(sqrt).floatValue();
    }

    public void b(boolean z) {
        this.H = z;
    }

    private void a(boolean z, C2995e c2995e) {
        try {
            C3003g g = c2995e.g();
            if (c2995e.i()) {
                int c = g.c();
                int b2 = g.b();
                if (z && b2 < c) {
                    b2++;
                } else if (b2 > 0) {
                    b2--;
                } else {
                    com.huawei.hms.scankit.util.a.c(f10538a, "handleZoom  zoom not change");
                }
                c2995e.c(b2);
                return;
            }
            com.huawei.hms.scankit.util.a.c(f10538a, "zoom not supported");
        } catch (RuntimeException unused) {
            Log.e(f10538a, "handleZoom: RuntimeException");
        }
    }

    public void a(HmsScan[] hmsScanArr, Bitmap bitmap) {
        com.huawei.hms.scankit.util.a.a("scan-time", "decode time:" + System.currentTimeMillis());
        try {
            String str = f10538a;
            com.huawei.hms.scankit.util.a.c(str, "result onResult");
            if (this.B.a()) {
                com.huawei.hms.scankit.util.a.c(str, "result intercepted");
                return;
            }
            if (this.c != null) {
                this.c.a(hmsScanArr);
            }
            if (!this.f) {
                hmsScanArr = com.huawei.hms.scankit.util.b.a(hmsScanArr);
            }
            if (this.B != null) {
                if (this.k != null && hmsScanArr.length > 0 && hmsScanArr[0] != null) {
                    com.huawei.hms.scankit.util.a.c(str, "result draw result point");
                    if (this.g instanceof Activity) {
                        this.k.a(hmsScanArr[0].getBorderRect(), com.huawei.hms.scankit.util.b.c((Activity) this.g), this.j.e());
                    }
                    this.F = false;
                }
                this.B.a(hmsScanArr);
            }
            if (this.C != null) {
                try {
                    com.huawei.hms.scankit.util.a.c(str, "result callback end: pauseStatus" + this.F);
                    if (this.F) {
                        return;
                    }
                    if (this.z && hmsScanArr != null && hmsScanArr.length > 0 && hmsScanArr[0] != null) {
                        Context context = this.g;
                        if (context instanceof Activity) {
                            hmsScanArr[0].originalBitmap = com.huawei.hms.scankit.util.b.a(bitmap, ((Activity) context).getWindowManager().getDefaultDisplay().getRotation());
                        }
                    }
                    this.C.onResult(hmsScanArr);
                } catch (RemoteException e) {
                    if (this.c != null) {
                        this.c.c(-1003);
                    }
                    com.huawei.hms.scankit.util.a.d("CaptureHelper", "onResult  RemoteException  e:" + e);
                }
            }
        } catch (RuntimeException e2) {
            Log.e(f10538a, "onResult:RuntimeException " + e2);
        } catch (Exception e3) {
            Log.e(f10538a, "onResult:Exception: " + e3);
        }
    }

    public C2976e a(boolean z) {
        this.z = z;
        HandlerC2966a handlerC2966a = this.h;
        if (handlerC2966a != null) {
            handlerC2966a.a(z);
        }
        return this;
    }

    public C2976e a(z zVar) {
        this.B = zVar;
        return this;
    }

    public void a(IOnResultCallback iOnResultCallback) {
        this.C = iOnResultCallback;
    }

    public C2995e a() {
        return this.j;
    }

    public void a(IOnErrorCallback iOnErrorCallback) {
        this.G = iOnErrorCallback;
    }

    private C2983b a(Context context) {
        C2983b a2;
        int rotation = ((Activity) context).getWindowManager().getDefaultDisplay().getRotation();
        Log.i(f10538a, "initCameraConfig:false");
        if (rotation == 0) {
            a2 = new C2983b.a().a(new Point(1920, 1080)).a(1).b(90).b(false).a(true).a();
        } else if (rotation == 1) {
            a2 = new C2983b.a().a(new Point(1920, 1080)).a(1).b(0).b(false).a(true).a();
        } else if (rotation == 2) {
            a2 = new C2983b.a().a(new Point(1920, 1080)).a(1).b(270).b(false).a(true).a();
        } else if (rotation != 3) {
            a2 = new C2983b.a().a(new Point(1920, 1080)).a(1).b(90).b(false).a(true).a();
        } else {
            a2 = new C2983b.a().a(new Point(1920, 1080)).a(1).b(180).b(false).a(true).a();
        }
        return "ceres-c3".equals(Build.DEVICE) ? new C2983b.a().a(new Point(1080, 1920)).a(1).b(false).a(true).a() : a2;
    }
}
