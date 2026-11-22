package com.huawei.hms.scankit;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Build;
import android.os.Bundle;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.OrientationEventListener;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.huawei.hms.feature.DynamicModuleInitializer;
import com.huawei.hms.feature.dynamic.IObjectWrapper;
import com.huawei.hms.feature.dynamic.ObjectWrapper;
import com.huawei.hms.hmsscankit.DetailRect;
import com.huawei.hms.hmsscankit.api.IOnErrorCallback;
import com.huawei.hms.hmsscankit.api.IOnLightCallback;
import com.huawei.hms.hmsscankit.api.IOnResultCallback;
import com.huawei.hms.hmsscankit.api.IRemoteViewDelegate;
import com.huawei.hms.ml.scan.HmsScan;
import com.huawei.hms.scankit.p.C3013ib;
import com.umeng.analytics.pro.ak;
import java.util.Iterator;
import kotlinx.coroutines.DebugKt;

/* compiled from: IRemoteCustomedViewDelegateImpl.java */
/* loaded from: classes14.dex */
public class q extends IRemoteViewDelegate.Stub implements z, SensorEventListener {

    /* renamed from: a, reason: collision with root package name */
    private static final String f10707a = "q";
    protected static boolean b = false;
    protected int d;
    protected Context e;
    protected ProviderRemoteView f;
    protected TextureView g;
    protected C2976e h;
    protected IOnResultCallback i;
    protected SensorManager j;
    protected View.OnClickListener k;
    protected Boolean n;
    protected AlertDialog o;
    protected Rect p;

    /* renamed from: q, reason: collision with root package name */
    private IObjectWrapper f10708q;
    protected boolean r;
    private OrientationEventListener s;
    private boolean t;
    protected boolean u;
    protected IOnLightCallback w;
    protected LinearLayout x;
    private volatile C3013ib c = null;
    protected boolean l = false;
    protected final Float m = Float.valueOf(40.0f);
    protected boolean v = true;
    boolean y = false;

    public q(Context context, int i, Object obj, IObjectWrapper iObjectWrapper, boolean z, boolean z2, boolean z3) {
        this.d = 0;
        this.r = false;
        this.e = context;
        this.d = i;
        this.f10708q = iObjectWrapper;
        if (obj instanceof Rect) {
            this.p = (Rect) obj;
        } else {
            this.p = null;
        }
        this.r = z;
        this.t = z2;
        this.u = z3;
    }

    protected boolean b() {
        try {
            return this.h.a().h().equals("torch");
        } catch (RuntimeException unused) {
            com.huawei.hms.scankit.util.a.b(f10707a, "getFlashStatusRuntimeException");
            return false;
        } catch (Exception unused2) {
            com.huawei.hms.scankit.util.a.b(f10707a, "getFlashStatusException");
            return false;
        }
    }

    protected void c() {
        Object systemService = this.e.getSystemService(ak.ac);
        if (systemService instanceof SensorManager) {
            SensorManager sensorManager = (SensorManager) systemService;
            this.j = sensorManager;
            Iterator<Sensor> it = sensorManager.getSensorList(-1).iterator();
            while (it.hasNext()) {
                if (5 == it.next().getType()) {
                    this.l = true;
                    return;
                }
            }
        }
    }

    protected ProviderRemoteView d() {
        return new ProviderRemoteView(DynamicModuleInitializer.getContext() == null ? this.e : DynamicModuleInitializer.getContext(), true);
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public HmsScan[] decodeWithBitmap(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) throws RemoteException {
        Bundle bundle = (iObjectWrapper2 == null || !(ObjectWrapper.unwrap(iObjectWrapper2) instanceof Bundle)) ? new Bundle() : (Bundle) ObjectWrapper.unwrap(iObjectWrapper2);
        if (this.c == null) {
            try {
                this.c = new C3013ib(bundle, DetailRect.PHOTO_MODE);
            } catch (RuntimeException unused) {
                com.huawei.hms.scankit.util.a.b(f10707a, "RuntimeException");
            } catch (Exception unused2) {
                com.huawei.hms.scankit.util.a.b(f10707a, "Exception");
            }
        }
        return a(iObjectWrapper, iObjectWrapper2);
    }

    protected void e() {
        try {
            if (this.e.getSystemService("window") != null) {
                a(a(this.e));
            }
        } catch (NullPointerException unused) {
            com.huawei.hms.scankit.util.a.d(f10707a, "initSurfaceView: nullpoint");
        } catch (Exception unused2) {
            com.huawei.hms.scankit.util.a.d(f10707a, "initSurfaceView: Exception");
        }
    }

    protected void f() {
        ProviderRemoteView d = d();
        this.f = d;
        this.g = (TextureView) d.findViewById(R.id.surfaceView);
        C2976e c2976e = new C2976e(this.e, this.g, null, this.p, this.d, this.f10708q, this.r, "CustomizedView", true);
        this.h = c2976e;
        c2976e.b(this.u);
        c();
        e();
    }

    protected void g() {
        try {
            C2976e c2976e = this.h;
            if (c2976e == null || c2976e.a() == null) {
                return;
            }
            this.h.a().a(DebugKt.DEBUG_PROPERTY_VALUE_OFF);
        } catch (RuntimeException unused) {
            com.huawei.hms.scankit.util.a.b(f10707a, "offFlashRuntimeException");
        } catch (Exception unused2) {
            com.huawei.hms.scankit.util.a.b(f10707a, "offFlashException");
        }
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public boolean getLightStatus() throws RemoteException {
        return b();
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public IObjectWrapper getView() {
        return ObjectWrapper.wrap(this.f);
    }

    public void h() {
        try {
            C2976e c2976e = this.h;
            if (c2976e == null || c2976e.a() == null) {
                return;
            }
            this.h.a().a("torch");
        } catch (RuntimeException unused) {
            com.huawei.hms.scankit.util.a.b(f10707a, "openFlashRuntimeException");
        } catch (Exception unused2) {
            com.huawei.hms.scankit.util.a.b(f10707a, "openFlashException");
        }
    }

    protected void i() {
        AlertDialog create = new AlertDialog.Builder(this.e).create();
        this.o = create;
        create.show();
        View inflate = LayoutInflater.from(DynamicModuleInitializer.getContext() == null ? this.e : DynamicModuleInitializer.getContext()).inflate(R.layout.scankit_dialog_layout, (ViewGroup) null);
        Window window = this.o.getWindow();
        WindowManager.LayoutParams attributes = window.getAttributes();
        attributes.y = 60;
        window.setAttributes(attributes);
        window.setBackgroundDrawable(new ColorDrawable(0));
        window.setContentView(inflate);
        window.setGravity(80);
        inflate.findViewById(R.id.dialog_sure_btn).setOnClickListener(new p(this));
    }

    @Override // android.hardware.SensorEventListener
    public void onAccuracyChanged(Sensor sensor, int i) {
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void onCreate(Bundle bundle) {
        Context context = this.e;
        if ((context instanceof Activity) && ((Activity) context).getWindow() != null) {
            ((Activity) this.e).getWindow().setFlags(16777216, 16777216);
        }
        Context context2 = this.e;
        if (context2 != null && context2.getPackageManager() != null) {
            this.v = this.e.getPackageManager().hasSystemFeature("android.hardware.camera.flash");
        }
        f();
        this.h.a(this);
        this.f.setOnTouchListener(new n(this));
        IOnResultCallback iOnResultCallback = this.i;
        if (iOnResultCallback != null) {
            this.h.a(iOnResultCallback);
        }
        this.h.a(this.t);
        this.h.b();
        Context context3 = this.e;
        if ((context3 instanceof Activity) && ((Activity) context3).isInMultiWindowMode()) {
            o oVar = new o(this, this.e);
            this.s = oVar;
            if (oVar.canDetectOrientation()) {
                this.s.enable();
            } else {
                this.s.disable();
            }
        }
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void onDestroy() {
        try {
            this.h.c();
            OrientationEventListener orientationEventListener = this.s;
            if (orientationEventListener == null || !orientationEventListener.canDetectOrientation()) {
                return;
            }
            this.s.disable();
        } catch (RuntimeException unused) {
            com.huawei.hms.scankit.util.a.b(f10707a, "onDestroyRuntimeException");
        } catch (Exception unused2) {
            com.huawei.hms.scankit.util.a.b(f10707a, "onDestroyException");
        }
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void onPause() {
        try {
            this.h.d();
            this.j.unregisterListener(this);
        } catch (RuntimeException unused) {
            com.huawei.hms.scankit.util.a.b(f10707a, "onPauseRuntimeException");
        } catch (Exception unused2) {
            com.huawei.hms.scankit.util.a.b(f10707a, "onPauseException");
        }
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void onResume() {
        try {
            this.h.e();
            SensorManager sensorManager = this.j;
            sensorManager.registerListener(this, sensorManager.getDefaultSensor(5), 2);
        } catch (RuntimeException e) {
            com.huawei.hms.scankit.util.a.b(f10707a, "onResumeRuntimeException");
            e.printStackTrace();
        } catch (Exception e2) {
            com.huawei.hms.scankit.util.a.b(f10707a, "onResumeException");
            e2.printStackTrace();
        }
    }

    @Override // android.hardware.SensorEventListener
    public void onSensorChanged(SensorEvent sensorEvent) {
        if (this.l && sensorEvent.sensor.getType() == 5 && this.v) {
            Boolean valueOf = Boolean.valueOf(sensorEvent.values[0] > this.m.floatValue());
            this.n = valueOf;
            if (!valueOf.booleanValue()) {
                LinearLayout linearLayout = this.x;
                if (linearLayout != null) {
                    linearLayout.setVisibility(0);
                }
                IOnLightCallback iOnLightCallback = this.w;
                if (iOnLightCallback != null) {
                    try {
                        iOnLightCallback.onVisibleChanged(true);
                        return;
                    } catch (RemoteException unused) {
                        com.huawei.hms.scankit.util.a.d(f10707a, "onSensorChanged RemoteException");
                        return;
                    }
                }
                return;
            }
            if (sensorEvent.values[0] > 600.0f) {
                if (this.x != null && !b()) {
                    this.x.setVisibility(8);
                }
                IOnLightCallback iOnLightCallback2 = this.w;
                if (iOnLightCallback2 != null) {
                    try {
                        iOnLightCallback2.onVisibleChanged(false);
                    } catch (RemoteException unused2) {
                        com.huawei.hms.scankit.util.a.d(f10707a, "onSensorChanged RemoteException");
                    }
                }
            }
        }
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void onStart() {
        try {
            this.h.f();
        } catch (RuntimeException e) {
            com.huawei.hms.scankit.util.a.b(f10707a, "onStartRuntimeException");
            e.printStackTrace();
        } catch (Exception e2) {
            com.huawei.hms.scankit.util.a.b(f10707a, "onStartException");
            e2.printStackTrace();
        }
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void onStop() {
        try {
            this.h.g();
        } catch (RuntimeException e) {
            com.huawei.hms.scankit.util.a.b(f10707a, "onStopRuntimeException");
            e.printStackTrace();
        } catch (Exception e2) {
            com.huawei.hms.scankit.util.a.b(f10707a, "onStopException");
            e2.printStackTrace();
        }
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void pauseContinuouslyScan() throws RemoteException {
        C2976e c2976e = this.h;
        if (c2976e != null) {
            c2976e.h();
        }
        this.y = true;
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void resumeContinuouslyScan() throws RemoteException {
        this.y = false;
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void setOnClickListener(IObjectWrapper iObjectWrapper) {
        if (iObjectWrapper != null) {
            this.k = (View.OnClickListener) ObjectWrapper.unwrap(iObjectWrapper);
        }
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void setOnErrorCallback(IOnErrorCallback iOnErrorCallback) throws RemoteException {
        C2976e c2976e = this.h;
        if (c2976e != null) {
            c2976e.a(iOnErrorCallback);
        }
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void setOnLightVisbleCallBack(IOnLightCallback iOnLightCallback) throws RemoteException {
        this.w = iOnLightCallback;
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void setOnResultCallback(IOnResultCallback iOnResultCallback) {
        this.i = iOnResultCallback;
        C2976e c2976e = this.h;
        if (c2976e != null) {
            c2976e.a(iOnResultCallback);
        }
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void turnOffLight() throws RemoteException {
        g();
    }

    @Override // com.huawei.hms.hmsscankit.api.IRemoteViewDelegate
    public void turnOnLight() throws RemoteException {
        h();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i) {
        C2976e c2976e = this.h;
        if (c2976e == null || c2976e.a() == null || i == this.h.a().d()) {
            return;
        }
        this.h.a().a(i);
        if (!com.huawei.hms.scankit.util.b.d(this.e) || com.huawei.hms.scankit.util.b.b((Activity) this.e)) {
            e();
            return;
        }
        if (com.huawei.hms.scankit.util.b.c((Activity) this.e)) {
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.g.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = (int) ((a(this.e).x / 1080.0f) * 1920.0f);
            layoutParams.gravity = 17;
            return;
        }
        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) this.g.getLayoutParams();
        layoutParams2.gravity = 17;
        layoutParams2.height = -1;
        layoutParams2.width = (int) ((a(this.e).x / 1080.0f) * 1920.0f);
        layoutParams2.gravity = 17;
    }

    private static Point a(Context context) {
        Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
        Point point = new Point();
        if (com.huawei.hms.scankit.util.b.d(context)) {
            Log.i(f10707a, "initSurfaceView: is in MultiWindowMode");
            defaultDisplay.getSize(point);
            return point;
        }
        defaultDisplay.getRealSize(point);
        return point;
    }

    protected void a(Point point) {
        int i;
        int i2;
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) this.g.getLayoutParams();
        float f = point.x;
        float f2 = point.y;
        if (!com.huawei.hms.scankit.util.b.c((Activity) this.e)) {
            b = true;
            float f3 = f / 1920.0f;
            float f4 = f2 / 1080.0f;
            if (f3 > f4) {
                layoutParams.width = -1;
                layoutParams.height = (int) (f3 * 1080.0f);
                layoutParams.gravity = 17;
                return;
            } else {
                layoutParams.height = -1;
                layoutParams.width = (int) (f4 * 1920.0f);
                layoutParams.gravity = 17;
                return;
            }
        }
        b = false;
        if ("ceres-c3".equals(Build.DEVICE)) {
            i = 1280;
            i2 = 1280;
        } else {
            i = 1080;
            i2 = 1920;
        }
        float f5 = i;
        float f6 = f / f5;
        float f7 = i2;
        float f8 = f2 / f7;
        if (f6 > f8) {
            layoutParams.width = -1;
            layoutParams.height = (int) (f7 * f6);
            layoutParams.gravity = 17;
        } else {
            layoutParams.height = -1;
            layoutParams.width = (int) (f5 * f8);
            layoutParams.gravity = 17;
        }
    }

    @Override // com.huawei.hms.scankit.z
    public boolean a(HmsScan[] hmsScanArr) {
        AlertDialog alertDialog;
        if (hmsScanArr == null || hmsScanArr.length <= 0 || (alertDialog = this.o) == null || !alertDialog.isShowing()) {
            return false;
        }
        this.o.dismiss();
        return false;
    }

    @Override // com.huawei.hms.scankit.z
    public boolean a() {
        return this.y;
    }

    private HmsScan[] a(IObjectWrapper iObjectWrapper, IObjectWrapper iObjectWrapper2) {
        boolean z;
        int i;
        if (iObjectWrapper == null) {
            com.huawei.hms.scankit.util.a.b("ScankitRemoteS", "bitmap is null");
            return new HmsScan[0];
        }
        if (iObjectWrapper2 == null || !(ObjectWrapper.unwrap(iObjectWrapper2) instanceof Bundle)) {
            z = false;
            i = 0;
        } else {
            i = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper2)).getInt(DetailRect.FORMAT_FLAG);
            int i2 = ((Bundle) ObjectWrapper.unwrap(iObjectWrapper2)).getInt(DetailRect.TYPE_TRANS, 0);
            DetailRect.HMSSCAN_SDK_VALUE = i2;
            z = i2 >= 2;
            if (z) {
                i = com.huawei.hms.scankit.util.b.b(i);
            }
        }
        HmsScan[] b2 = C.a().b((Bitmap) ObjectWrapper.unwrap(iObjectWrapper), i, true, this.c);
        if (!z) {
            b2 = com.huawei.hms.scankit.util.b.a(b2);
        }
        if (b2.length == 0) {
            i();
            return b2;
        }
        HmsScan hmsScan = b2[0];
        if (hmsScan != null && TextUtils.isEmpty(hmsScan.originalValue)) {
            i();
        }
        return b2;
    }
}
