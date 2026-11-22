package com.anythink.core.common.v;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import com.anythink.core.api.AdError;
import com.anythink.core.common.d.u;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class g {
    private static volatile g d;
    private String g;
    private File i;
    private String l;
    private String m;
    private final String c = getClass().getSimpleName();
    private final String e = k.b("aHR0cHM6Ly9tb3Jlcy5hbnl0aGlua3RlY2guY29tL3RpbmlmeS90YWt1X2FkeF9leHRfcmVzX2pzb24udHh0");
    private final String f = "adx_optional_res.txt";
    private final String h = "anythink_optres/";

    /* renamed from: a, reason: collision with root package name */
    boolean f4408a = false;
    final String b = "adx_optional_res_url";
    private final Object j = new Object();
    private Map<String, String> k = new HashMap();

    public static g a() {
        if (d == null) {
            synchronized (g.class) {
                if (d == null) {
                    d = new g();
                }
            }
        }
        return d;
    }

    public final void a(final Context context) {
        try {
            this.i = new File(com.anythink.core.common.d.t.b().g().getFilesDir().getAbsoluteFile().getAbsolutePath() + "/anythink_optres/");
        } catch (Throwable unused) {
        }
        com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.core.common.v.g.1
            @Override // java.lang.Runnable
            public final void run() {
                g.this.d(context);
                g gVar = g.this;
                gVar.k = gVar.d("adx_optional_res.txt");
            }
        }, 2);
    }

    public final boolean b(Context context) {
        String str;
        if (this.f4408a) {
            return false;
        }
        com.anythink.core.d.b b = com.anythink.core.d.d.a(context).b(com.anythink.core.common.d.t.b().p());
        if (b != null && !b.S()) {
            str = b.aa();
        } else {
            str = "";
        }
        if (TextUtils.isEmpty(str)) {
            str = this.e;
        }
        if (TextUtils.isEmpty(str) || TextUtils.equals(this.m, str)) {
            return false;
        }
        String b2 = b();
        if (!TextUtils.isEmpty(b2) && TextUtils.equals(b2, str)) {
            if (this.k.isEmpty()) {
                this.k = d("adx_optional_res.txt");
            }
            return false;
        }
        this.g = str;
        return true;
    }

    public final void c(final Context context) {
        if (b(context)) {
            this.f4408a = true;
            try {
                new com.anythink.core.common.m.h(this.g).a(1, new com.anythink.core.common.m.q() { // from class: com.anythink.core.common.v.g.2
                    @Override // com.anythink.core.common.m.q
                    public final void onLoadStart(int i) {
                    }

                    @Override // com.anythink.core.common.m.q
                    public final void onLoadFinish(int i, Object obj) {
                        String obj2 = obj != null ? obj.toString() : "";
                        String unused = g.this.c;
                        String unused2 = g.this.g;
                        obj2.length();
                        if (!TextUtils.isEmpty(obj2)) {
                            g gVar = g.this;
                            gVar.a(context, gVar.g);
                            g gVar2 = g.this;
                            gVar2.k = gVar2.e(obj2);
                            g.a(g.this, obj2, "adx_optional_res.txt");
                        }
                        g.this.f4408a = false;
                    }

                    @Override // com.anythink.core.common.m.q
                    public final void onLoadError(int i, String str, AdError adError) {
                        g gVar = g.this;
                        gVar.m = gVar.g;
                        g.this.f4408a = false;
                        com.anythink.core.common.u.e.a(3, g.this.g, adError != null ? adError.printStackTrace() : "");
                    }

                    @Override // com.anythink.core.common.m.q
                    public final void onLoadCanceled(int i) {
                        g.this.f4408a = false;
                    }
                });
            } catch (Throwable unused) {
                this.f4408a = false;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized Map<String, String> d(String str) {
        Map<String, String> e;
        synchronized (this.j) {
            String str2 = "";
            try {
                File file = new File(this.i, str);
                if (file.exists() && file.canRead()) {
                    str2 = w.a(file);
                }
            } catch (Throwable unused) {
            }
            e = e(str2);
        }
        return e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized Map<String, String> e(String str) {
        HashMap hashMap = new HashMap();
        if (TextUtils.isEmpty(str)) {
            return hashMap;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.optString(next));
            }
        } catch (Throwable unused) {
        }
        return hashMap;
    }

    /* renamed from: com.anythink.core.common.v.g$3, reason: invalid class name */
    final class AnonymousClass3 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ String f4411a;
        final /* synthetic */ String b;

        AnonymousClass3(String str, String str2) {
            this.f4411a = str;
            this.b = str2;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (g.this.j) {
                try {
                    if (!g.this.i.exists()) {
                        g.this.i.mkdirs();
                    }
                    File file = new File(g.this.i, this.f4411a);
                    if (file.exists()) {
                        file.delete();
                    }
                    w.a(this.b.getBytes(), file);
                } catch (Throwable unused) {
                }
            }
        }
    }

    private void a(String str, String str2) {
        com.anythink.core.common.v.b.b.a().b(new AnonymousClass3(str2, str), 2);
    }

    public final String a(String str) {
        Map<String, String> map = this.k;
        if (map == null || map.isEmpty()) {
            return "";
        }
        return this.k.get(str);
    }

    public final boolean b(String str) {
        Map<String, String> map = this.k;
        if (map != null && !map.isEmpty()) {
            String str2 = this.k.get(str);
            if (!TextUtils.isEmpty(str2) && com.anythink.core.common.res.b.a(com.anythink.core.common.d.t.b().g()).b(new com.anythink.core.common.res.e(3, str2), 0, 0) != null) {
                return true;
            }
        }
        return false;
    }

    public final Bitmap c(String str) {
        Map<String, String> map = this.k;
        if (map == null || map.isEmpty()) {
            return null;
        }
        String str2 = this.k.get(str);
        if (TextUtils.isEmpty(str2)) {
            return null;
        }
        return com.anythink.core.common.res.b.a(com.anythink.core.common.d.t.b().g()).b(new com.anythink.core.common.res.e(3, str2), 0, 0);
    }

    private void a(List<String> list, String str) {
        if (list == null) {
            return;
        }
        String a2 = a(str);
        if (TextUtils.isEmpty(a2)) {
            return;
        }
        list.add(a2);
    }

    public final void a(Set<String> set, String str) {
        String a2 = a(str);
        if (TextUtils.isEmpty(a2)) {
            return;
        }
        set.add(a2);
    }

    private synchronized String b() {
        return this.l;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void a(Context context, String str) {
        this.l = str;
        af.b(context, u.b.f3741a, "adx_optional_res_url", str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public synchronized void d(Context context) {
        if (context == null) {
            context = com.anythink.core.common.d.t.b().g();
        }
        this.l = af.c(context, u.b.f3741a, "adx_optional_res_url", "");
    }

    static /* synthetic */ void a(g gVar, String str, String str2) {
        com.anythink.core.common.v.b.b.a().b(gVar.new AnonymousClass3(str2, str), 2);
    }
}
