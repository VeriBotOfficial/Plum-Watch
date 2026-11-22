package com.mbridge.msdk.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.OrientationEventListener;
import android.view.WindowInsets;
import android.view.WindowManager;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.foundation.tools.o0;

/* loaded from: classes17.dex */
public abstract class MBBaseActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    private Display f11251a;
    private OrientationEventListener b;
    private int c = -1;
    private volatile boolean d = false;
    private Runnable e;

    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                MBBaseActivity.this.b();
            } catch (Exception e) {
                o0.b("MBBaseActivity", e.getMessage());
            }
        }
    }

    class b extends OrientationEventListener {
        b(Context context, int i) {
            super(context, i);
        }

        @Override // android.view.OrientationEventListener
        public void onOrientationChanged(int i) {
            int rotation = MBBaseActivity.this.f11251a != null ? MBBaseActivity.this.f11251a.getRotation() : 0;
            if (rotation == 1 && MBBaseActivity.this.c != 1) {
                MBBaseActivity.this.c = 1;
                MBBaseActivity.this.getNotchParams();
                o0.b("MBBaseActivity", "Orientation Left");
                return;
            }
            if (rotation == 3 && MBBaseActivity.this.c != 2) {
                MBBaseActivity.this.c = 2;
                MBBaseActivity.this.getNotchParams();
                o0.b("MBBaseActivity", "Orientation Right");
            } else if (rotation == 0 && MBBaseActivity.this.c != 3) {
                MBBaseActivity.this.c = 3;
                MBBaseActivity.this.getNotchParams();
                o0.b("MBBaseActivity", "Orientation Top");
            } else {
                if (rotation != 2 || MBBaseActivity.this.c == 4) {
                    return;
                }
                MBBaseActivity.this.c = 4;
                MBBaseActivity.this.getNotchParams();
                o0.b("MBBaseActivity", "Orientation Bottom");
            }
        }
    }

    private void d() {
        b bVar = new b(this, 1);
        this.b = bVar;
        if (bVar.canDetectOrientation()) {
            this.b.enable();
        } else {
            this.b.disable();
            this.b = null;
        }
    }

    public void getNotchParams() {
        if (this.d) {
            return;
        }
        this.e = new a();
        getWindow().getDecorView().postDelayed(this.e, 500L);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.d = false;
        try {
            requestWindowFeature(1);
            getWindow().setFlags(1024, 1024);
            getWindow().addFlags(512);
            c();
            a();
            c1.a(getWindow());
        } catch (Exception e) {
            o0.b("MBBaseActivity", e.getMessage());
        }
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        this.d = true;
        super.onDestroy();
        try {
            OrientationEventListener orientationEventListener = this.b;
            if (orientationEventListener != null) {
                orientationEventListener.disable();
                this.b = null;
            }
            if (this.e != null) {
                getWindow().getDecorView().removeCallbacks(this.e);
            }
        } catch (Exception e) {
            if (MBridgeConstans.DEBUG) {
                o0.b("MBBaseActivity", e.getMessage());
            }
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        if (com.mbridge.msdk.foundation.feedback.b.f) {
            return;
        }
        getNotchParams();
        c();
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        c();
    }

    public abstract void setTopControllerPadding(int i, int i2, int i3, int i4, int i5);

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        MBBaseActivity mBBaseActivity;
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        DisplayCutout displayCutout;
        int i6 = Build.VERSION.SDK_INT;
        if (this.d) {
            return;
        }
        WindowInsets rootWindowInsets = getWindow().getDecorView().getRootWindowInsets();
        int i7 = -1;
        if (rootWindowInsets == null || i6 < 28 || (displayCutout = rootWindowInsets.getDisplayCutout()) == null) {
            mBBaseActivity = this;
            i = -1;
            i2 = 0;
            i3 = 0;
            i4 = 0;
            i5 = 0;
        } else {
            int safeInsetLeft = displayCutout.getSafeInsetLeft();
            int safeInsetRight = displayCutout.getSafeInsetRight();
            int safeInsetTop = displayCutout.getSafeInsetTop();
            int safeInsetBottom = displayCutout.getSafeInsetBottom();
            Display display = this.f11251a;
            int rotation = display != null ? display.getRotation() : a();
            if (this.c == -1) {
                this.c = rotation == 0 ? 3 : rotation == 1 ? 1 : rotation == 2 ? 4 : rotation == 3 ? 2 : -1;
                o0.b("MBBaseActivity", this.c + "");
            }
            if (rotation != 0) {
                if (rotation == 1) {
                    i7 = 90;
                } else if (rotation == 2) {
                    i7 = 180;
                } else if (rotation == 3) {
                    i7 = 270;
                }
                mBBaseActivity = this;
                i5 = safeInsetBottom;
                i2 = safeInsetLeft;
                i = i7;
            } else {
                mBBaseActivity = this;
                i5 = safeInsetBottom;
                i2 = safeInsetLeft;
                i = 0;
            }
            i3 = safeInsetRight;
            i4 = safeInsetTop;
        }
        mBBaseActivity.setTopControllerPadding(i, i2, i3, i4, i5);
        if (mBBaseActivity.b == null) {
            d();
        }
    }

    private int a() {
        if (this.f11251a == null) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.f11251a = getDisplay();
            } else {
                this.f11251a = ((WindowManager) getSystemService("window")).getDefaultDisplay();
            }
        }
        Display display = this.f11251a;
        if (display != null) {
            return display.getRotation();
        }
        return -1;
    }

    private void c() {
        try {
            getWindow().addFlags(67108864);
            getWindow().getDecorView().setSystemUiVisibility(4098);
        } catch (Throwable th) {
            o0.b("MBBaseActivity", th.getMessage());
        }
    }
}
