package com.anythink.core.common.r;

import android.os.Handler;
import android.text.TextUtils;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes12.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private static final String f4271a = "e";
    private final Map<String, Integer> b = new ConcurrentHashMap();
    private final Map<String, f> c = new ConcurrentHashMap();
    private Handler d;

    public final void a(h hVar, Handler handler, a aVar) {
        Integer num;
        try {
            this.d = handler;
            g gVar = hVar != null ? hVar.j : null;
            if (gVar == null) {
                return;
            }
            if (!gVar.a(16)) {
                new Object[]{hVar.b, 16};
                return;
            }
            String str = hVar.b;
            Integer num2 = this.b.get(str);
            if (num2 != null) {
                num = Integer.valueOf(num2.intValue() + 1);
            } else {
                num = 1;
            }
            hVar.i = num.intValue();
            this.b.put(str, num);
            new Object[]{str, num};
            if (num.intValue() > gVar.g()) {
                new Object[]{str, num};
                return;
            }
            long h = gVar.h() * num.intValue();
            new Object[]{16, str, Long.valueOf(h)};
            f fVar = new f(hVar, aVar);
            this.c.put(str, fVar);
            handler.postDelayed(fVar, h);
        } catch (Throwable th) {
            new Object[]{th.getMessage(), hVar != null ? hVar.b : ""};
        }
    }

    public final void a(h hVar) {
        if (hVar == null) {
            return;
        }
        String str = hVar.b;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            hVar.i = 0;
            this.b.remove(str);
            if (this.d != null) {
                f remove = this.c.remove(str);
                new Object[]{str, remove};
                if (remove != null) {
                    this.d.removeCallbacks(remove);
                }
            }
        } catch (Throwable th) {
            new Object[]{str, th.getMessage()};
        }
    }
}
