package sg.bigo.ads.core.mraid;

import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.util.Pair;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import sg.bigo.ads.common.utils.u;

/* loaded from: classes9.dex */
public final class p {

    /* renamed from: a, reason: collision with root package name */
    final WeakReference<View> f20117a;
    b d;
    boolean e;
    private final ViewTreeObserver.OnPreDrawListener i;
    private WeakReference<ViewTreeObserver> j;
    float f = -1.0f;
    Rect g = new Rect();
    boolean h = false;
    final Handler c = new Handler();
    final a b = new a();

    class a implements Runnable {
        a() {
        }

        /* JADX WARN: Removed duplicated region for block: B:26:0x00a6  */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00bb  */
        /* JADX WARN: Removed duplicated region for block: B:37:0x00e3  */
        @Override // java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final void run() {
            /*
                Method dump skipped, instructions count: 260
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: sg.bigo.ads.core.mraid.p.a.run():void");
        }
    }

    public interface b {
        void a(boolean z, sg.bigo.ads.core.mraid.b bVar);
    }

    public p(View view) {
        this.f20117a = new WeakReference<>(view);
        ViewTreeObserver.OnPreDrawListener onPreDrawListener = new ViewTreeObserver.OnPreDrawListener() { // from class: sg.bigo.ads.core.mraid.p.1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                p pVar = p.this;
                if (!pVar.e) {
                    pVar.e = true;
                    pVar.c.postDelayed(pVar.b, 500L);
                }
                return true;
            }
        };
        this.i = onPreDrawListener;
        this.j = new WeakReference<>(null);
        Context context = view.getContext();
        ViewTreeObserver viewTreeObserver = this.j.get();
        if (viewTreeObserver == null || !viewTreeObserver.isAlive()) {
            View a2 = u.a(context, view);
            if (a2 == null) {
                sg.bigo.ads.common.t.a.a(0, "VisibilityTracker", "Unable to set Visibility Tracker due to no available root view.");
                return;
            }
            ViewTreeObserver viewTreeObserver2 = a2.getViewTreeObserver();
            if (!viewTreeObserver2.isAlive()) {
                sg.bigo.ads.common.t.a.a(0, "VisibilityTracker", "Visibility Tracker was unable to track views because the root view tree observer was not alive");
            } else {
                this.j = new WeakReference<>(viewTreeObserver2);
                viewTreeObserver2.addOnPreDrawListener(onPreDrawListener);
            }
        }
    }

    static Rect a(Rect rect, int i) {
        return new Rect((rect.left * 160) / i, (rect.top * 160) / i, (rect.right * 160) / i, (rect.bottom * 160) / i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r12v1, types: [android.view.View] */
    /* JADX WARN: Type inference failed for: r12v2 */
    /* JADX WARN: Type inference failed for: r12v3, types: [android.view.ViewGroup] */
    /* JADX WARN: Type inference failed for: r12v5 */
    static /* synthetic */ Pair a(Rect rect, View view) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        ViewGroup viewGroup = (ViewGroup) view.getRootView();
        loop0: while (true) {
            View view2 = view;
            view = (ViewGroup) view.getParent();
            while (true) {
                if (view == 0) {
                    z = false;
                    break loop0;
                }
                z = true;
                if (view.getAlpha() == 0.0f) {
                    break loop0;
                }
                for (int indexOfChild = view.indexOfChild(view2) + 1; indexOfChild < view.getChildCount(); indexOfChild++) {
                    View childAt = view.getChildAt(indexOfChild);
                    if (childAt.getVisibility() == 0) {
                        Rect rect2 = new Rect();
                        childAt.getGlobalVisibleRect(rect2);
                        if (Rect.intersects(rect, rect2)) {
                            arrayList.add(new Rect(Math.max(rect.left, rect2.left), Math.max(rect.top, rect2.top), Math.min(rect.right, rect2.right), Math.min(rect.bottom, rect2.bottom)));
                        }
                    }
                }
                if (view != viewGroup) {
                    break;
                }
                view = 0;
            }
        }
        return new Pair(Boolean.valueOf(z), arrayList);
    }

    static /* synthetic */ List a(List list, int i) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(a((Rect) it.next(), i));
        }
        return arrayList;
    }
}
