package com.anythink.expressad.activity;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.Display;
import android.view.OrientationEventListener;
import android.view.Window;
import android.view.WindowManager;
import com.anythink.expressad.foundation.f.b;

/* loaded from: classes12.dex */
public abstract class ATBaseActivity extends Activity {

    /* renamed from: a, reason: collision with root package name */
    private static final String f4590a = "ATBaseActivity";
    private OrientationEventListener b;
    private Display c;
    private int d = -1;

    public abstract void a(int i, int i2, int i3, int i4, int i5);

    public final void a() {
        getWindow().getDecorView().postDelayed(new Runnable() { // from class: com.anythink.expressad.activity.ATBaseActivity.1
            /* JADX WARN: Removed duplicated region for block: B:29:0x0081 A[Catch: all -> 0x0087, TRY_LEAVE, TryCatch #0 {all -> 0x0087, blocks: (B:2:0x0000, B:4:0x0012, B:6:0x0018, B:8:0x001e, B:10:0x003f, B:13:0x0052, B:27:0x0074, B:29:0x0081), top: B:1:0x0000 }] */
            /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
            @Override // java.lang.Runnable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final void run() {
                /*
                    r12 = this;
                    com.anythink.expressad.activity.ATBaseActivity r0 = com.anythink.expressad.activity.ATBaseActivity.this     // Catch: java.lang.Throwable -> L87
                    android.view.Window r0 = r0.getWindow()     // Catch: java.lang.Throwable -> L87
                    android.view.View r0 = r0.getDecorView()     // Catch: java.lang.Throwable -> L87
                    android.view.WindowInsets r0 = r0.getRootWindowInsets()     // Catch: java.lang.Throwable -> L87
                    r1 = -1
                    r2 = 0
                    if (r0 == 0) goto L6f
                    int r3 = android.os.Build.VERSION.SDK_INT     // Catch: java.lang.Throwable -> L87
                    r4 = 28
                    if (r3 < r4) goto L6f
                    android.view.DisplayCutout r0 = r0.getDisplayCutout()     // Catch: java.lang.Throwable -> L87
                    if (r0 == 0) goto L6f
                    int r3 = r0.getSafeInsetLeft()     // Catch: java.lang.Throwable -> L87
                    int r4 = r0.getSafeInsetRight()     // Catch: java.lang.Throwable -> L87
                    int r5 = r0.getSafeInsetTop()     // Catch: java.lang.Throwable -> L87
                    int r0 = r0.getSafeInsetBottom()     // Catch: java.lang.Throwable -> L87
                    com.anythink.expressad.activity.ATBaseActivity r6 = com.anythink.expressad.activity.ATBaseActivity.this     // Catch: java.lang.Throwable -> L87
                    int r6 = com.anythink.expressad.activity.ATBaseActivity.a(r6)     // Catch: java.lang.Throwable -> L87
                    com.anythink.expressad.activity.ATBaseActivity r7 = com.anythink.expressad.activity.ATBaseActivity.this     // Catch: java.lang.Throwable -> L87
                    int r7 = com.anythink.expressad.activity.ATBaseActivity.b(r7)     // Catch: java.lang.Throwable -> L87
                    r8 = 3
                    r9 = 2
                    r10 = 1
                    if (r7 != r1) goto L5a
                    com.anythink.expressad.activity.ATBaseActivity r7 = com.anythink.expressad.activity.ATBaseActivity.this     // Catch: java.lang.Throwable -> L87
                    if (r6 != 0) goto L45
                    r11 = r8
                    goto L52
                L45:
                    if (r6 != r10) goto L49
                    r11 = r10
                    goto L52
                L49:
                    if (r6 != r9) goto L4d
                    r11 = 4
                    goto L52
                L4d:
                    if (r6 != r8) goto L51
                    r11 = r9
                    goto L52
                L51:
                    r11 = r1
                L52:
                    com.anythink.expressad.activity.ATBaseActivity.a(r7, r11)     // Catch: java.lang.Throwable -> L87
                    com.anythink.expressad.activity.ATBaseActivity r7 = com.anythink.expressad.activity.ATBaseActivity.this     // Catch: java.lang.Throwable -> L87
                    com.anythink.expressad.activity.ATBaseActivity.b(r7)     // Catch: java.lang.Throwable -> L87
                L5a:
                    if (r6 == 0) goto L6d
                    if (r6 == r10) goto L6a
                    if (r6 == r9) goto L67
                    if (r6 == r8) goto L64
                L62:
                    r6 = r0
                    goto L73
                L64:
                    r1 = 270(0x10e, float:3.78E-43)
                    goto L62
                L67:
                    r1 = 180(0xb4, float:2.52E-43)
                    goto L62
                L6a:
                    r1 = 90
                    goto L62
                L6d:
                    r6 = r0
                    goto L74
                L6f:
                    r3 = r2
                    r4 = r3
                    r5 = r4
                    r6 = r5
                L73:
                    r2 = r1
                L74:
                    com.anythink.expressad.activity.ATBaseActivity r1 = com.anythink.expressad.activity.ATBaseActivity.this     // Catch: java.lang.Throwable -> L87
                    r1.a(r2, r3, r4, r5, r6)     // Catch: java.lang.Throwable -> L87
                    com.anythink.expressad.activity.ATBaseActivity r0 = com.anythink.expressad.activity.ATBaseActivity.this     // Catch: java.lang.Throwable -> L87
                    android.view.OrientationEventListener r0 = com.anythink.expressad.activity.ATBaseActivity.c(r0)     // Catch: java.lang.Throwable -> L87
                    if (r0 != 0) goto L86
                    com.anythink.expressad.activity.ATBaseActivity r0 = com.anythink.expressad.activity.ATBaseActivity.this     // Catch: java.lang.Throwable -> L87
                    com.anythink.expressad.activity.ATBaseActivity.d(r0)     // Catch: java.lang.Throwable -> L87
                L86:
                    return
                L87:
                    r0 = move-exception
                    r0.getMessage()
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.anythink.expressad.activity.ATBaseActivity.AnonymousClass1.run():void");
            }
        }, 500L);
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            requestWindowFeature(1);
            getWindow().setFlags(1024, 1024);
            getWindow().addFlags(512);
            d();
            c();
            Window window = getWindow();
            if (window == null || Build.VERSION.SDK_INT < 28) {
                return;
            }
            WindowManager.LayoutParams attributes = window.getAttributes();
            if (Build.VERSION.SDK_INT >= 30) {
                attributes.layoutInDisplayCutoutMode = 3;
            } else {
                attributes.layoutInDisplayCutoutMode = 1;
            }
            window.setAttributes(attributes);
        } catch (Exception e) {
            e.getMessage();
        }
    }

    @Override // android.app.Activity
    protected void onResume() {
        if (Build.VERSION.SDK_INT < 29) {
            try {
                try {
                    super.onResume();
                } catch (Throwable unused) {
                }
            } catch (Throwable unused2) {
                finish();
            }
        } else {
            super.onResume();
        }
        if (b.c) {
            return;
        }
        a();
        d();
    }

    @Override // android.app.Activity
    protected void onDestroy() {
        super.onDestroy();
        OrientationEventListener orientationEventListener = this.b;
        if (orientationEventListener != null) {
            orientationEventListener.disable();
            this.b = null;
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        d();
    }

    /* renamed from: com.anythink.expressad.activity.ATBaseActivity$2, reason: invalid class name */
    final class AnonymousClass2 extends OrientationEventListener {
        AnonymousClass2(Context context) {
            super(context, 1);
        }

        @Override // android.view.OrientationEventListener
        public final void onOrientationChanged(int i) {
            int c = ATBaseActivity.this.c();
            if (c < 0) {
                c = 0;
            }
            if (c != 1 || ATBaseActivity.this.d == 1) {
                if (c != 3 || ATBaseActivity.this.d == 2) {
                    if (c != 0 || ATBaseActivity.this.d == 3) {
                        if (c != 2 || ATBaseActivity.this.d == 4) {
                            return;
                        }
                        ATBaseActivity.this.d = 4;
                        ATBaseActivity.this.a();
                        return;
                    }
                    ATBaseActivity.this.d = 3;
                    ATBaseActivity.this.a();
                    return;
                }
                ATBaseActivity.this.d = 2;
                ATBaseActivity.this.a();
                return;
            }
            ATBaseActivity.this.d = 1;
            ATBaseActivity.this.a();
        }
    }

    private void b() {
        AnonymousClass2 anonymousClass2 = new AnonymousClass2(this);
        this.b = anonymousClass2;
        if (anonymousClass2.canDetectOrientation()) {
            this.b.enable();
        } else {
            this.b.disable();
            this.b = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int c() {
        if (this.c == null) {
            if (Build.VERSION.SDK_INT >= 30) {
                this.c = getDisplay();
            } else {
                this.c = ((WindowManager) getSystemService("window")).getDefaultDisplay();
            }
        }
        Display display = this.c;
        if (display == null) {
            return -1;
        }
        try {
            return display.getRotation();
        } catch (Throwable unused) {
            return -1;
        }
    }

    private void d() {
        try {
            getWindow().addFlags(67108864);
            getWindow().getDecorView().setSystemUiVisibility(4098);
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    private void e() {
        try {
            finish();
        } catch (Throwable unused) {
        }
    }

    static /* synthetic */ void d(ATBaseActivity aTBaseActivity) {
        AnonymousClass2 anonymousClass2 = aTBaseActivity.new AnonymousClass2(aTBaseActivity);
        aTBaseActivity.b = anonymousClass2;
        if (anonymousClass2.canDetectOrientation()) {
            aTBaseActivity.b.enable();
        } else {
            aTBaseActivity.b.disable();
            aTBaseActivity.b = null;
        }
    }
}
