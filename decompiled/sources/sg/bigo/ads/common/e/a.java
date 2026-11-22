package sg.bigo.ads.common.e;

import android.view.View;
import android.view.ViewTreeObserver;

/* loaded from: classes9.dex */
public final class a {

    /* renamed from: sg.bigo.ads.common.e.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC1071a {

        /* renamed from: a, reason: collision with root package name */
        private final Object f19571a = new ViewTreeObserver.OnWindowFocusChangeListener() { // from class: sg.bigo.ads.common.e.a.a.1
            @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
            public final void onWindowFocusChanged(boolean z) {
                AbstractC1071a.this.a(z);
            }
        };

        final ViewTreeObserver.OnWindowFocusChangeListener a() {
            Object obj = this.f19571a;
            if (obj instanceof ViewTreeObserver.OnWindowFocusChangeListener) {
                return (ViewTreeObserver.OnWindowFocusChangeListener) obj;
            }
            return null;
        }

        public abstract void a(boolean z);
    }

    public static void a(View view) {
        view.postInvalidateOnAnimation();
    }

    public static void a(View view, float f) {
        if (view == null) {
            return;
        }
        view.setZ(f);
    }

    public static void a(View view, int i) {
        if (view == null) {
            return;
        }
        view.setElevation(i);
    }

    public static void a(View view, Runnable runnable) {
        view.postOnAnimation(runnable);
    }

    public static void a(View view, AbstractC1071a abstractC1071a) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver.OnWindowFocusChangeListener a2;
        if (view == null || abstractC1071a == null || (viewTreeObserver = view.getViewTreeObserver()) == null || !viewTreeObserver.isAlive() || (a2 = abstractC1071a.a()) == null) {
            return;
        }
        viewTreeObserver.addOnWindowFocusChangeListener(a2);
    }

    public static void b(View view, AbstractC1071a abstractC1071a) {
        ViewTreeObserver viewTreeObserver;
        ViewTreeObserver.OnWindowFocusChangeListener a2;
        if (view == null || abstractC1071a == null || (viewTreeObserver = view.getViewTreeObserver()) == null || !viewTreeObserver.isAlive() || (a2 = abstractC1071a.a()) == null) {
            return;
        }
        viewTreeObserver.removeOnWindowFocusChangeListener(a2);
    }
}
