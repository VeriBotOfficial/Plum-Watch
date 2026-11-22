package sg.bigo.ads.common.m;

import android.content.Context;
import android.content.SharedPreferences;
import com.unity3d.ads.core.data.datasource.AndroidTcfDataSource;
import sg.bigo.ads.common.utils.q;

/* loaded from: classes9.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private static String f19648a = "";
    private static int b = 0;
    private static String c = "";
    private static String d = "";
    private static boolean e = true;
    private static SharedPreferences.OnSharedPreferenceChangeListener f = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: sg.bigo.ads.common.m.b.1
        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x004c, code lost:
        
            if (r6.equals("IABTCF_PurposeConsents") == false) goto L7;
         */
        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void onSharedPreferenceChanged(android.content.SharedPreferences r5, java.lang.String r6) {
            /*
                r4 = this;
                boolean r0 = sg.bigo.ads.common.utils.q.a(r6)
                if (r0 == 0) goto L7
                goto L52
            L7:
                java.lang.String r0 = "Listener SharedPreferenceChanged, key: "
                java.lang.String r1 = java.lang.String.valueOf(r6)
                java.lang.String r0 = r0.concat(r1)
                r1 = 0
                r2 = 3
                java.lang.String r3 = "GdprManager"
                sg.bigo.ads.common.t.a.a(r1, r2, r3, r0)
                r6.hashCode()
                int r0 = r6.hashCode()
                r3 = -1
                switch(r0) {
                    case -2004976699: goto L46;
                    case -464306296: goto L3b;
                    case 83641339: goto L30;
                    case 1218895378: goto L25;
                    default: goto L23;
                }
            L23:
                r1 = r3
                goto L4f
            L25:
                java.lang.String r0 = "IABTCF_TCString"
                boolean r6 = r6.equals(r0)
                if (r6 != 0) goto L2e
                goto L23
            L2e:
                r1 = r2
                goto L4f
            L30:
                java.lang.String r0 = "IABTCF_gdprApplies"
                boolean r6 = r6.equals(r0)
                if (r6 != 0) goto L39
                goto L23
            L39:
                r1 = 2
                goto L4f
            L3b:
                java.lang.String r0 = "IABTCF_PurposeLegitimateInterests"
                boolean r6 = r6.equals(r0)
                if (r6 != 0) goto L44
                goto L23
            L44:
                r1 = 1
                goto L4f
            L46:
                java.lang.String r0 = "IABTCF_PurposeConsents"
                boolean r6 = r6.equals(r0)
                if (r6 != 0) goto L4f
                goto L23
            L4f:
                switch(r1) {
                    case 0: goto L62;
                    case 1: goto L5e;
                    case 2: goto L5a;
                    case 3: goto L53;
                    default: goto L52;
                }
            L52:
                return
            L53:
                sg.bigo.ads.common.m.b.d(r5)
            L56:
                sg.bigo.ads.common.m.b.h()
                return
            L5a:
                sg.bigo.ads.common.m.b.b(r5)
                goto L56
            L5e:
                sg.bigo.ads.common.m.b.c(r5)
                goto L56
            L62:
                sg.bigo.ads.common.m.b.a(r5)
                goto L56
            */
            throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.common.m.b.AnonymousClass1.onSharedPreferenceChanged(android.content.SharedPreferences, java.lang.String):void");
        }
    };
    private static Context g;

    public static void a(Context context) {
        g = context;
        sg.bigo.ads.common.x.a.a(context.getPackageName(), f);
    }

    public static void a(SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            return;
        }
        try {
            f19648a = sharedPreferences.getString("IABTCF_PurposeConsents", "");
        } catch (Exception unused) {
            f19648a = "";
        }
    }

    public static boolean a() {
        return g != null;
    }

    public static String b() {
        if (q.a((CharSequence) f19648a) && a()) {
            f19648a = sg.bigo.ads.common.x.a.e(g.getPackageName());
        }
        return f19648a;
    }

    public static String b(Context context) {
        return (context == null || !sg.bigo.ads.common.x.b.a()) ? f19648a : sg.bigo.ads.common.x.a.e(context.getPackageName());
    }

    public static void b(SharedPreferences sharedPreferences) {
        if (sharedPreferences == null || sharedPreferences.getAll() == null) {
            return;
        }
        Object obj = sharedPreferences.getAll().get("IABTCF_gdprApplies");
        if (obj instanceof Integer) {
            b = ((Integer) obj).intValue();
        } else if (obj instanceof String) {
            try {
                b = Integer.parseInt((String) obj);
            } catch (Exception unused) {
                b = 0;
            }
        }
    }

    public static int c() {
        if (b == 0 && a()) {
            b = sg.bigo.ads.common.x.a.g(g.getPackageName());
        }
        return b;
    }

    public static int c(Context context) {
        return (context == null || !sg.bigo.ads.common.x.b.a()) ? b : sg.bigo.ads.common.x.a.g(context.getPackageName());
    }

    public static void c(SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            return;
        }
        try {
            c = sharedPreferences.getString("IABTCF_PurposeLegitimateInterests", "");
        } catch (Exception unused) {
            c = "";
        }
    }

    public static String d() {
        if (q.a((CharSequence) c) && a()) {
            c = sg.bigo.ads.common.x.a.h(g.getPackageName());
        }
        return c;
    }

    public static String d(Context context) {
        return (context == null || !sg.bigo.ads.common.x.b.a()) ? c : sg.bigo.ads.common.x.a.h(context.getPackageName());
    }

    public static void d(SharedPreferences sharedPreferences) {
        if (sharedPreferences == null) {
            return;
        }
        try {
            d = sharedPreferences.getString(AndroidTcfDataSource.TCF_TCSTRING_KEY, "");
        } catch (Exception unused) {
            d = "";
        }
    }

    public static String e() {
        if (q.a((CharSequence) d) && a()) {
            d = sg.bigo.ads.common.x.a.f(g.getPackageName());
        }
        return d;
    }

    public static boolean e(Context context) {
        if (context == null || !sg.bigo.ads.common.x.b.a()) {
            return false;
        }
        return sg.bigo.ads.common.x.a.a(context.getPackageName() + "_preferences", "IABTCF_gdprApplies");
    }

    public static boolean f() {
        return e;
    }

    public static void g() {
        e = false;
    }

    static /* synthetic */ boolean h() {
        e = true;
        return true;
    }
}
