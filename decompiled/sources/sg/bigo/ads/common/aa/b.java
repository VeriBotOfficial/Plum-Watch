package sg.bigo.ads.common.aa;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.hardware.display.DisplayManager;
import android.os.PowerManager;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import android.webkit.WebSettings;
import com.autonavi.aps.amapapi.config.Const;
import com.hjq.permissions.Permission;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import sg.bigo.ads.common.d.e;

/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static int f19556a;
    private static final List<a> b = new CopyOnWriteArrayList();
    private static boolean c = false;
    private static String d = "-1";
    private static String e = "-1";
    private static int f = 0;
    private static final AtomicBoolean g = new AtomicBoolean(false);

    public interface a {
        void a(int i);
    }

    public static int a(Activity activity) {
        int rotation = activity.getWindowManager().getDefaultDisplay().getRotation();
        int i = activity.getResources().getConfiguration().orientation;
        if (1 == i) {
            return (rotation == 1 || rotation == 2) ? 9 : 1;
        }
        if (2 == i) {
            return (rotation == 2 || rotation == 3) ? 8 : 0;
        }
        sg.bigo.ads.common.t.a.a(0, "DeviceUtil", "Unknown orientation. return portrait by default");
        return 9;
    }

    public static void a() {
        d = "-1";
        e = "-1";
    }

    public static synchronized void a(Context context, a aVar) {
        synchronized (b.class) {
            if (context != null) {
                List<a> list = b;
                if (!list.contains(aVar)) {
                    list.add(aVar);
                }
                if (!c) {
                    c = true;
                    sg.bigo.ads.common.t.a.a(0, 3, "DeviceUtil", "registerScreenListener");
                    sg.bigo.ads.common.d.a.a().a(context, new e() { // from class: sg.bigo.ads.common.aa.b.1
                        /* JADX WARN: Removed duplicated region for block: B:11:0x0041  */
                        /* JADX WARN: Removed duplicated region for block: B:18:0x005d A[ORIG_RETURN, RETURN] */
                        @Override // sg.bigo.ads.common.d.b
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final void a(android.content.Context r5, android.content.Intent r6) {
                            /*
                                r4 = this;
                                java.lang.String r5 = r6.getAction()
                                boolean r6 = sg.bigo.ads.common.utils.q.a(r5)
                                if (r6 == 0) goto Lb
                                goto L5d
                            Lb:
                                int r6 = sg.bigo.ads.common.aa.b.c()
                                java.lang.String r0 = "action = "
                                java.lang.String r1 = java.lang.String.valueOf(r5)
                                java.lang.String r0 = r0.concat(r1)
                                r1 = 0
                                r2 = 3
                                java.lang.String r3 = "DeviceUtil"
                                sg.bigo.ads.common.t.a.a(r1, r2, r3, r0)
                                r5.hashCode()
                                java.lang.String r0 = "android.intent.action.SCREEN_OFF"
                                boolean r0 = r5.equals(r0)
                                if (r0 != 0) goto L39
                                java.lang.String r0 = "android.intent.action.USER_PRESENT"
                                boolean r5 = r5.equals(r0)
                                if (r5 != 0) goto L34
                                goto L3b
                            L34:
                                r5 = 1
                            L35:
                                sg.bigo.ads.common.aa.b.a(r5)
                                goto L3b
                            L39:
                                r5 = 2
                                goto L35
                            L3b:
                                int r5 = sg.bigo.ads.common.aa.b.c()
                                if (r6 == r5) goto L5d
                                java.util.List r5 = sg.bigo.ads.common.aa.b.d()
                                java.util.Iterator r5 = r5.iterator()
                            L49:
                                boolean r6 = r5.hasNext()
                                if (r6 == 0) goto L5d
                                java.lang.Object r6 = r5.next()
                                sg.bigo.ads.common.aa.b$a r6 = (sg.bigo.ads.common.aa.b.a) r6
                                int r0 = sg.bigo.ads.common.aa.b.c()
                                r6.a(r0)
                                goto L49
                            L5d:
                                return
                            */
                            throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.common.aa.b.AnonymousClass1.a(android.content.Context, android.content.Intent):void");
                        }
                    });
                }
            }
        }
    }

    public static boolean a(Context context) {
        PowerManager powerManager;
        if (context == null) {
            return false;
        }
        if (f19556a == 0) {
            f19556a = (context == null || !((powerManager = (PowerManager) context.getSystemService("power")) == null || powerManager.isScreenOn())) ? 2 : 1;
        }
        return f19556a == 1;
    }

    public static String b(Context context) {
        Resources resources;
        Locale locale;
        if (context == null || (resources = context.getResources()) == null || (locale = resources.getConfiguration().locale) == null) {
            return Locale.US.getLanguage();
        }
        String language = locale.getLanguage();
        return language.equals(Const.SP_KEY_INFO_WRITE) ? "he" : language.equals("in") ? "id" : language.equals("ji") ? "yi" : language;
    }

    public static boolean b() {
        return f() && f == 1;
    }

    public static String c(Context context) {
        Resources resources;
        Locale locale;
        return (context == null || (resources = context.getResources()) == null || (locale = resources.getConfiguration().locale) == null) ? "zz" : locale.getCountry();
    }

    public static String d(Context context) {
        if (context == null) {
            return "";
        }
        if ("-1".equals(d)) {
            d = "";
            if (!sg.bigo.ads.common.utils.c.a(context, Permission.READ_PHONE_STATE)) {
                return d;
            }
            try {
                d = ((TelephonyManager) context.getSystemService("phone")).getSimOperatorName();
            } catch (Exception unused) {
            }
        }
        return d;
    }

    public static String e(Context context) {
        if (context == null) {
            return "";
        }
        if ("-1".equals(e)) {
            e = "";
            if (!sg.bigo.ads.common.utils.c.a(context, Permission.READ_PHONE_STATE)) {
                return e;
            }
            try {
                TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
                String networkCountryIso = telephonyManager.getNetworkCountryIso();
                e = networkCountryIso;
                if (TextUtils.isEmpty(networkCountryIso)) {
                    e = telephonyManager.getSimCountryIso();
                }
            } catch (Exception unused) {
            }
        }
        return e;
    }

    public static String f(Context context) {
        String str;
        try {
            str = context.getPackageManager().getPackageInfo("com.google.android.webview", 0).versionName;
        } catch (Exception unused) {
            str = "";
        }
        try {
            if (!TextUtils.isEmpty(str)) {
                return str;
            }
            String defaultUserAgent = WebSettings.getDefaultUserAgent(context);
            return !TextUtils.isEmpty(defaultUserAgent) ? defaultUserAgent.substring(defaultUserAgent.indexOf("Chrome/") + 7, defaultUserAgent.indexOf("Mobile")).trim() : defaultUserAgent;
        } catch (Exception unused2) {
            return str;
        }
    }

    private static boolean f() {
        return true;
    }

    public static void g(Context context) {
        if (g.getAndSet(true) || context == null || !f()) {
            return;
        }
        sg.bigo.ads.common.t.a.a(0, 3, "DeviceUtil", "Register display listener");
        final DisplayManager displayManager = (DisplayManager) context.getSystemService("display");
        displayManager.registerDisplayListener(new DisplayManager.DisplayListener() { // from class: sg.bigo.ads.common.aa.b.2
            @Override // android.hardware.display.DisplayManager.DisplayListener
            public final void onDisplayAdded(int i) {
            }

            @Override // android.hardware.display.DisplayManager.DisplayListener
            public final void onDisplayChanged(int i) {
                if (i == 0) {
                    try {
                        int unused = b.f = displayManager.getDisplay(i).getState();
                    } catch (Throwable unused2) {
                    }
                }
                sg.bigo.ads.common.t.a.a(0, 3, "DeviceUtil", "onDisplayChanged: " + i + ", sDefaultDisplayState: " + b.f);
            }

            @Override // android.hardware.display.DisplayManager.DisplayListener
            public final void onDisplayRemoved(int i) {
            }
        }, null);
    }

    public static sg.bigo.ads.common.b h(Context context) {
        Intent registerReceiver;
        if (context != null) {
            try {
                registerReceiver = context.registerReceiver(null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
            } catch (Exception e2) {
                sg.bigo.ads.common.t.a.a(0, 3, "DeviceUtil", "getBatteryLevel exception: " + e2.getMessage());
            }
        } else {
            registerReceiver = null;
        }
        if (registerReceiver != null) {
            return new sg.bigo.ads.common.b(registerReceiver.getIntExtra("level", -1), registerReceiver.getIntExtra("scale", -1), registerReceiver.getIntExtra("status", -1));
        }
        return null;
    }
}
