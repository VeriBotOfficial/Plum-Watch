package com.pgl.ssdk;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.input.InputManager;
import android.os.Build;
import android.text.TextUtils;
import android.view.InputDevice;
import com.wakeup.common.DeviceFeatures;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public class y {

    /* renamed from: a, reason: collision with root package name */
    private static int f12768a = 0;
    private static int b = 0;
    private static int c = 0;
    private static int d = 0;
    private static int e = 0;
    private static int f = 0;
    public static volatile boolean g = false;
    private static boolean h = false;
    private static InputManager i;

    static class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f12769a;
        final /* synthetic */ Context b;
        final /* synthetic */ int c;

        a(String str, Context context, int i) {
            this.f12769a = str;
            this.b = context;
            this.c = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (y.g) {
                com.pgl.ssdk.ces.a.meta(DeviceFeatures.AI_AUDIO_SEARCH, null, this.f12769a);
            }
            InputManager b = y.b(this.b);
            if (b == null) {
                return;
            }
            InputDevice inputDevice = b.getInputDevice(this.c);
            y.h();
            if (inputDevice == null) {
                y.b();
                y.c();
                y.c("nihc");
            } else if (inputDevice.isVirtual()) {
                y.d();
                y.e();
                y.c("vihc");
            } else {
                if (Build.VERSION.SDK_INT < 29 || !inputDevice.isExternal()) {
                    return;
                }
                y.f();
                y.g();
                y.c("eihc");
            }
        }
    }

    static /* synthetic */ int b() {
        int i2 = c;
        c = i2 + 1;
        return i2;
    }

    static /* synthetic */ int c() {
        int i2 = f;
        f = i2 + 1;
        return i2;
    }

    static /* synthetic */ int d() {
        int i2 = f12768a;
        f12768a = i2 + 1;
        return i2;
    }

    static /* synthetic */ int e() {
        int i2 = d;
        d = i2 + 1;
        return i2;
    }

    static /* synthetic */ int f() {
        int i2 = b;
        b = i2 + 1;
        return i2;
    }

    static /* synthetic */ int g() {
        int i2 = e;
        e = i2 + 1;
        return i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void h() {
        if (h) {
            return;
        }
        try {
            SharedPreferences a2 = ax.a(z.b());
            if (a2 != null) {
                f = a2.getInt("nihc", 0);
                e = a2.getInt("eihc", 0);
                d = a2.getInt("vihc", 0);
                h = true;
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int b(String str) {
        char c2;
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        h();
        str.hashCode();
        str.hashCode();
        switch (str.hashCode()) {
            case 100415:
                if (str.equals("eic")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 109064:
                if (str.equals("nic")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 116752:
                if (str.equals("vic")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 3113119:
                if (str.equals("eihc")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 3381238:
                if (str.equals("nihc")) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 3619566:
                if (str.equals("vihc")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void c(String str) {
        try {
            SharedPreferences a2 = ax.a(z.b());
            if (a2 != null) {
                a2.edit().putInt(str, a2.getInt(str, 0) + 1).apply();
            }
        } catch (Throwable unused) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x003f, code lost:
    
        if (r0.contains("android.view.ViewRootImpl$InputStage") == false) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void a(android.view.MotionEvent r2, android.content.Context r3) {
        /*
            if (r2 == 0) goto L4f
            if (r3 == 0) goto L4f
            boolean r0 = com.pgl.ssdk.y.g
            if (r0 == 0) goto L42
            r0 = 0
            int r0 = r2.getToolType(r0)     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L1c
            int r0 = r2.getSource()     // Catch: java.lang.Throwable -> L42
            if (r0 == 0) goto L1c
            int r0 = r2.getSource()     // Catch: java.lang.Throwable -> L42
            r1 = 2
            if (r0 != r1) goto L42
        L1c:
            java.lang.Exception r0 = new java.lang.Exception     // Catch: java.lang.Throwable -> L42
            r0.<init>()     // Catch: java.lang.Throwable -> L42
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()     // Catch: java.lang.Throwable -> L42
            java.lang.String r0 = java.util.Arrays.toString(r0)     // Catch: java.lang.Throwable -> L42
            java.lang.String r1 = "android.view.InputEventReceiver"
            boolean r1 = r0.contains(r1)     // Catch: java.lang.Throwable -> L42
            if (r1 != 0) goto L42
            java.lang.String r1 = "android.view.ViewRootImpl$WindowInputEventReceiver"
            boolean r1 = r0.contains(r1)     // Catch: java.lang.Throwable -> L42
            if (r1 != 0) goto L42
            java.lang.String r1 = "android.view.ViewRootImpl$InputStage"
            boolean r1 = r0.contains(r1)     // Catch: java.lang.Throwable -> L42
            if (r1 != 0) goto L42
            goto L43
        L42:
            r0 = 0
        L43:
            int r2 = r2.getDeviceId()
            com.pgl.ssdk.y$a r1 = new com.pgl.ssdk.y$a
            r1.<init>(r0, r3, r2)
            com.pgl.ssdk.ar.b(r1)
        L4f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.pgl.ssdk.y.a(android.view.MotionEvent, android.content.Context):void");
    }

    public static void a(JSONObject jSONObject) {
        h();
        try {
            jSONObject.put("vihc", d);
            jSONObject.put("eihc", e);
            jSONObject.put("nihc", f);
            jSONObject.put("vic", f12768a);
            jSONObject.put("nic", c);
            jSONObject.put("eic", b);
        } catch (JSONException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static InputManager b(Context context) {
        if (i == null) {
            i = (InputManager) context.getSystemService("input");
        }
        return i;
    }
}
