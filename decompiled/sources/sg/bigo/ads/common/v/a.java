package sg.bigo.ads.common.v;

import android.app.KeyguardManager;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import sg.bigo.ads.common.f.b;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static int f19739a = 0;
    public static int b = 1;
    public static int c = 2;
    public static int d = 3;
    public static int e = 4;
    public static int f = 5;
    public int g = f19739a;

    public static boolean a(View view) {
        if (view == null) {
            return false;
        }
        try {
            KeyguardManager keyguardManager = (KeyguardManager) view.getContext().getSystemService("keyguard");
            if (keyguardManager != null) {
                return keyguardManager.isKeyguardLocked();
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static boolean b(View view) {
        WindowManager.LayoutParams layoutParams;
        if (view == null) {
            return false;
        }
        while (true) {
            ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
            if (!(layoutParams2 instanceof WindowManager.LayoutParams)) {
                Object parent = view.getParent();
                if (!(parent instanceof View)) {
                    layoutParams = null;
                    break;
                }
                view = (View) parent;
            } else {
                layoutParams = (WindowManager.LayoutParams) layoutParams2;
                break;
            }
        }
        if (layoutParams == null) {
            return false;
        }
        int i = layoutParams.type;
        return i == 2002 || i == 2003 || i == 2006 || i == 2007 || i == 2010 || i == 2038;
    }

    public final int a() {
        int c2 = b.c();
        this.g = c2 != 1 ? c2 != 2 ? f19739a : e : b;
        return this.g;
    }
}
