package sg.bigo.ads.common.utils;

import android.content.Context;
import android.widget.Toast;

/* loaded from: classes9.dex */
public final class t {

    /* renamed from: a, reason: collision with root package name */
    private static boolean f19734a = false;

    public static void a(Context context, String str) {
        try {
            if (f19734a) {
                Toast.makeText(context, str, 1).show();
                sg.bigo.ads.common.t.a.a(0, 3, "toastDebug", str);
            }
        } catch (Exception unused) {
        }
    }

    public static void a(String str) {
        if (f19734a) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void a(boolean z) {
        f19734a = z;
    }

    public static boolean a() {
        return false;
    }

    public static boolean b() {
        return f19734a;
    }
}
