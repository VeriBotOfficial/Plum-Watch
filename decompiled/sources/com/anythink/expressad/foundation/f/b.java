package com.anythink.expressad.foundation.f;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import com.anythink.core.common.d.t;
import com.anythink.expressad.foundation.d.d;
import com.anythink.expressad.foundation.f.a.a;
import com.anythink.expressad.foundation.h.v;
import com.anythink.expressad.widget.FeedBackButton;
import com.anythink.expressad.widget.a.c;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes12.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static int f4824a = -2;
    public static int b = -2;
    public static volatile boolean c = false;
    private final ConcurrentHashMap<String, com.anythink.expressad.foundation.f.a.a> d;
    private final RelativeLayout.LayoutParams e;
    private com.anythink.expressad.f.a f;

    /* synthetic */ b(byte b2) {
        this();
    }

    private b() {
        this.d = new ConcurrentHashMap<>();
        this.e = new RelativeLayout.LayoutParams(f4824a, b);
    }

    static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final b f4825a = new b(0);

        a() {
        }
    }

    public static b a() {
        return a.f4825a;
    }

    public static Activity a(Context context) {
        Activity activity;
        Context h = com.anythink.expressad.foundation.b.a.c().h();
        Activity activity2 = null;
        try {
            activity = h instanceof Activity ? (Activity) h : null;
        } catch (Exception e) {
            e = e;
        }
        try {
            if ((context instanceof Activity) && !((Activity) context).isDestroyed()) {
                activity = (Activity) context;
            }
            if (activity != null && !activity.isFinishing()) {
                if (!activity.isDestroyed()) {
                    return activity;
                }
            }
            return null;
        } catch (Exception e2) {
            e = e2;
            activity2 = activity;
            e.printStackTrace();
            return activity2;
        }
    }

    private static boolean b(Context context, c cVar) {
        Activity a2 = a(context);
        if (a2 == null || cVar == null || a2.isDestroyed()) {
            return false;
        }
        try {
            if (!cVar.isShowing() && !a2.isFinishing()) {
                cVar.show();
                return true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean a(Context context, c cVar) {
        if (cVar == null) {
            return false;
        }
        return b(context, cVar);
    }

    private void a(String str, int i, ViewGroup viewGroup) {
        com.anythink.expressad.foundation.f.a.a a2 = a(str);
        if (a2.c() != null) {
            a2.a(i);
            if (i == 0) {
                a(str, t.b().g(), viewGroup, null, null);
            }
        }
    }

    private void a(String str, int i, int i2, int i3, float f, float f2, float f3, String str2, String str3) {
        com.anythink.expressad.foundation.f.a.a a2 = a(str);
        Context g = t.b().g();
        a2.a(v.b(g, f), v.b(g, f2), v.b(g, i), v.b(g, i2), v.b(g, i3), f3, str2, str3);
    }

    private void a(String str, Context context, ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        a(str, context, viewGroup, layoutParams, null);
    }

    public final boolean b() {
        com.anythink.expressad.f.b.a();
        com.anythink.expressad.f.a c2 = com.anythink.expressad.f.b.c();
        this.f = c2;
        return c2.K() != 0;
    }

    public final void a(String str, com.anythink.expressad.foundation.f.a aVar) {
        a(str).a(new a.C0236a(str, aVar));
    }

    public final void a(String str, Context context, ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams, com.anythink.expressad.foundation.f.a aVar) {
        if (b()) {
            com.anythink.expressad.foundation.f.a.a a2 = a(str);
            if (aVar != null) {
                a2.a(new a.C0236a(str, aVar));
            }
            FeedBackButton c2 = a2.c();
            if (c2 != null) {
                if (layoutParams == null) {
                    int b2 = v.b(t.b().g(), 10.0f);
                    this.e.setMargins(b2, b2, b2, b2);
                    layoutParams = this.e;
                }
                ViewGroup viewGroup2 = (ViewGroup) c2.getParent();
                if (viewGroup2 != null) {
                    viewGroup2.removeView(c2);
                }
                Activity a3 = a(context);
                if (a3 != null && viewGroup == null) {
                    viewGroup = (ViewGroup) a3.findViewById(R.id.content);
                }
                if (viewGroup != null) {
                    viewGroup.removeView(c2);
                    viewGroup.addView(c2, layoutParams);
                }
            }
        }
    }

    private void a(String str, int i, com.anythink.expressad.foundation.f.a aVar) {
        com.anythink.expressad.foundation.f.a.a a2 = a(str);
        a2.a(new a.C0236a(str, aVar));
        if (i == 1) {
            a2.b();
        } else {
            a2.a();
        }
    }

    public final void a(String str, d dVar) {
        a(str).a(dVar);
    }

    public final void a(String str, int i) {
        a(str).b(i);
    }

    public final void b(String str, int i) {
        a(str).c(i);
    }

    public final com.anythink.expressad.foundation.f.a.a a(String str) {
        com.anythink.expressad.foundation.f.a.a aVar;
        if (TextUtils.isEmpty(str)) {
            str = com.anythink.expressad.foundation.b.a.c().f();
        }
        if (!this.d.containsKey(str)) {
            aVar = new com.anythink.expressad.foundation.f.a.a(str);
            this.d.put(str, aVar);
        } else {
            aVar = this.d.get(str);
        }
        if (aVar != null) {
            return aVar;
        }
        com.anythink.expressad.foundation.f.a.a aVar2 = new com.anythink.expressad.foundation.f.a.a(str);
        this.d.put(str, aVar2);
        return aVar2;
    }

    private com.anythink.expressad.foundation.f.a.a d(String str) {
        if (TextUtils.isEmpty(str)) {
            str = com.anythink.expressad.foundation.b.a.c().f();
        }
        if (this.d.containsKey(str)) {
            return this.d.get(str);
        }
        return null;
    }

    public final void a(String str, FeedBackButton feedBackButton) {
        a(str).a(feedBackButton);
    }

    public final FeedBackButton b(String str) {
        return a(str).c();
    }

    private void e(String str) {
        a(str).e();
    }

    public final void c(String str) {
        try {
            String f = TextUtils.isEmpty(str) ? com.anythink.expressad.foundation.b.a.c().f() : str;
            com.anythink.expressad.foundation.f.a.a aVar = this.d.containsKey(f) ? this.d.get(f) : null;
            if (aVar != null) {
                aVar.d();
            }
            this.d.remove(str);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
