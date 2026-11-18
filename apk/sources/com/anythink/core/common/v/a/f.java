package com.anythink.core.common.v.a;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes16.dex */
public class f {
    private static String c = "f";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final int f4369a;
    final ViewTreeObserver.OnPreDrawListener b;
    private int d;
    private final ArrayList<View> e;
    private long f;
    private final Map<View, a> g;
    private final b h;
    private d i;
    private final c j;
    private final Handler k;
    private boolean l;

    interface d {
        void a(List<View> list);
    }

    static /* synthetic */ boolean d(f fVar) {
        fVar.l = false;
        return false;
    }

    static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f4371a;
        int b;
        long c;
        View d;
        Integer e;

        a() {
        }
    }

    public f(int r4) {
        this(new WeakHashMap(10), new b(r4), new Handler(Looper.getMainLooper()));
    }

    public f(int r4, int r5) {
        this(new WeakHashMap(10), new b(r5), new Handler(Looper.getMainLooper()));
        this.d = r4;
    }

    private f(Map<View, a> map, b bVar, Handler handler) {
        this.d = 100;
        this.f4369a = 50;
        this.f = 0L;
        this.g = map;
        this.h = bVar;
        this.k = handler;
        this.j = new c();
        this.e = new ArrayList<>(50);
        this.b = new ViewTreeObserver.OnPreDrawListener() { // from class: com.anythink.core.common.v.a.f.1
            @Override // android.view.ViewTreeObserver.OnPreDrawListener
            public final boolean onPreDraw() {
                f.this.c();
                return true;
            }
        };
    }

    final void a(d dVar) {
        this.i = dVar;
    }

    private void a(View view, View view2, int r9, Integer num) {
        a(view, view2, r9, r9, num);
    }

    final void a(View view, View view2, int r5, int r6, Integer num) {
        try {
            if (a(view2.getContext(), view2)) {
                a aVar = this.g.get(view2);
                if (aVar == null) {
                    aVar = new a();
                    this.g.put(view2, aVar);
                    c();
                }
                int r7 = Math.min(r6, r5);
                aVar.d = view;
                aVar.f4371a = r5;
                aVar.b = r7;
                aVar.c = this.f;
                aVar.e = num;
                view2.getViewTreeObserver().addOnPreDrawListener(this.b);
                long j = this.f;
                long j2 = 1 + j;
                this.f = j2;
                if (j2 % 50 == 0) {
                    a(j - 49);
                }
            }
        } catch (Throwable unused) {
        }
    }

    private void a(long j) {
        for (Map.Entry<View, a> entry : this.g.entrySet()) {
            if (entry.getValue().c < j) {
                this.e.add(entry.getKey());
            }
        }
        Iterator<View> it = this.e.iterator();
        while (it.hasNext()) {
            a(it.next());
        }
        this.e.clear();
    }

    final void a(View view) {
        this.g.remove(view);
    }

    final void a() {
        this.g.clear();
        this.k.removeMessages(0);
        this.l = false;
    }

    final void b() {
        a();
        this.i = null;
    }

    final void c() {
        if (this.l) {
            return;
        }
        this.l = true;
        this.k.postDelayed(this.j, this.d);
    }

    class c implements Runnable {
        private final ArrayList<View> c = new ArrayList<>();
        private final ArrayList<View> b = new ArrayList<>();

        c() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            for (Map.Entry entry : f.this.g.entrySet()) {
                View view = (View) entry.getKey();
                int r3 = ((a) entry.getValue()).f4371a;
                int r4 = ((a) entry.getValue()).b;
                Integer num = ((a) entry.getValue()).e;
                View view2 = ((a) entry.getValue()).d;
                if (!f.this.h.a(view2, view, r3, num)) {
                    if (!f.this.h.a(view2, view, r4, null)) {
                        this.c.add(view);
                    }
                } else {
                    this.b.add(view);
                    try {
                        view.getViewTreeObserver().removeOnPreDrawListener(f.this.b);
                    } catch (Throwable unused) {
                    }
                }
            }
            if (f.this.i != null) {
                f.this.i.a(this.b);
            }
            this.b.clear();
            this.c.clear();
            f.d(f.this);
        }
    }

    public static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static String f4372a = "b";
        private final Rect b;
        private int c;

        b() {
            this.b = new Rect();
            this.c = 1;
        }

        public b(int r2) {
            this.b = new Rect();
            this.c = r2;
        }

        private static boolean a(long j, int r4) {
            return SystemClock.uptimeMillis() - j >= ((long) r4);
        }

        public final boolean a(View view, View view2, int r10, Integer num) {
            if (view2 != null && view != null) {
                try {
                    if (view.getParent() != null && view2.getWindowVisibility() == 0) {
                        if ((this.c == 1 && !view2.hasWindowFocus()) || !view2.getGlobalVisibleRect(this.b)) {
                            return false;
                        }
                        long jHeight = ((long) this.b.height()) * ((long) this.b.width());
                        long height = ((long) view2.getHeight()) * ((long) view2.getWidth());
                        if (height <= 0) {
                            return false;
                        }
                        if ((num == null || num.intValue() <= 0 || jHeight >= num.intValue()) && jHeight * 100 >= ((long) r10) * height) {
                            return view2.isShown();
                        }
                        return false;
                    }
                } catch (Throwable th) {
                    Log.e(f4372a, "checkVisibilityPercent error: " + th.getMessage());
                    th.printStackTrace();
                }
            }
            return false;
        }

        public static int a(View view) {
            Rect rect = new Rect();
            try {
                view.getGlobalVisibleRect(rect);
                return (int) ((((((long) rect.height()) * ((long) rect.width())) * 1.0d) / (((long) view.getHeight()) * ((long) view.getWidth()))) * 100.0d);
            } catch (Throwable unused) {
                return 100;
            }
        }
    }

    private static boolean a(Context context, View view) {
        View rootView;
        View viewFindViewById = null;
        View viewFindViewById2 = !(context instanceof Activity) ? null : ((Activity) context).getWindow().getDecorView().findViewById(R.id.content);
        if (view != null && (rootView = view.getRootView()) != null && (viewFindViewById = rootView.findViewById(R.id.content)) == null) {
            viewFindViewById = rootView;
        }
        if (viewFindViewById2 == null) {
            viewFindViewById2 = viewFindViewById;
        }
        return viewFindViewById2 != null && viewFindViewById2.getViewTreeObserver().isAlive();
    }

    private void a(View view, int r8, Integer num) {
        a(view, view, r8, r8, num);
    }
}
