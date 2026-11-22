package com.anythink.basead.ui.e;

import android.text.TextUtils;
import com.anythink.core.basead.b.c;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    private static volatile a f3259a;
    private Map<String, c> b = new HashMap();

    private a() {
    }

    public static a a() {
        if (f3259a == null) {
            synchronized (a.class) {
                if (f3259a == null) {
                    f3259a = new a();
                }
            }
        }
        return f3259a;
    }

    public final void a(String str, c cVar) {
        if (TextUtils.isEmpty(str) || cVar == null) {
            return;
        }
        this.b.put(str, cVar);
    }

    public final c a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return this.b.remove(str);
    }
}
