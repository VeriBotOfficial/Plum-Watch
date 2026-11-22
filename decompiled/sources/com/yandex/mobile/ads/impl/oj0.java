package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Looper;
import android.widget.ImageView;
import com.yandex.mobile.ads.impl.id1;
import com.yandex.mobile.ads.impl.xq1;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: classes5.dex */
public class oj0 {

    /* renamed from: a, reason: collision with root package name */
    private final iq1 f16456a;
    private final b b;
    private final HashMap<String, a> c = new HashMap<>();
    private final HashMap<String, a> d = new HashMap<>();
    private final Handler e = new Handler(Looper.getMainLooper());
    private Runnable f;

    /* JADX INFO: Access modifiers changed from: private */
    static class a {

        /* renamed from: a, reason: collision with root package name */
        private final up1<?> f16457a;
        private Bitmap b;
        private si2 c;
        private final ArrayList d;

        public a(tj0 tj0Var, c cVar) {
            ArrayList arrayList = new ArrayList();
            this.d = arrayList;
            this.f16457a = tj0Var;
            arrayList.add(cVar);
        }
    }

    public interface b {
        Bitmap a(String str);

        void a(String str, Bitmap bitmap);
    }

    public class c {

        /* renamed from: a, reason: collision with root package name */
        private Bitmap f16458a;
        private final d b;
        private final String c;

        public final void a() {
            if (Looper.myLooper() != Looper.getMainLooper()) {
                throw new IllegalStateException("Must be invoked from the main thread.");
            }
            if (this.b == null) {
                return;
            }
            a aVar = (a) oj0.this.c.get(this.c);
            if (aVar != null) {
                aVar.d.remove(this);
                if (aVar.d.size() == 0) {
                    aVar.f16457a.a();
                    oj0.this.c.remove(this.c);
                    return;
                }
                return;
            }
            a aVar2 = (a) oj0.this.d.get(this.c);
            if (aVar2 != null) {
                aVar2.d.remove(this);
                if (aVar2.d.size() == 0) {
                    aVar2.f16457a.a();
                }
                if (aVar2.d.size() == 0) {
                    oj0.this.d.remove(this.c);
                }
            }
        }

        public c(Bitmap bitmap, String str, d dVar) {
            this.f16458a = bitmap;
            this.c = str;
            this.b = dVar;
        }

        public final Bitmap b() {
            return this.f16458a;
        }
    }

    public interface d extends xq1.a {
        void a(c cVar, boolean z);
    }

    public final c a(String str, d dVar, int i, int i2) {
        ImageView.ScaleType scaleType = ImageView.ScaleType.CENTER_INSIDE;
        if (Looper.myLooper() != Looper.getMainLooper()) {
            throw new IllegalStateException("Must be invoked from the main thread.");
        }
        String a2 = a(str, i, i2, scaleType);
        Bitmap a3 = this.b.a(a2);
        if (a3 != null) {
            c cVar = new c(a3, null, null);
            dVar.a(cVar, true);
            return cVar;
        }
        c cVar2 = new c(null, a2, dVar);
        dVar.a(cVar2, true);
        a aVar = this.c.get(a2);
        if (aVar == null) {
            aVar = this.d.get(a2);
        }
        if (aVar != null) {
            aVar.d.add(cVar2);
            return cVar2;
        }
        tj0 tj0Var = new tj0(str, new lj0(this, a2), i, i2, scaleType, Bitmap.Config.RGB_565, new mj0(this, a2));
        this.f16456a.a(tj0Var);
        this.c.put(a2, new a(tj0Var, cVar2));
        return cVar2;
    }

    public String a(String str, int i, int i2, ImageView.ScaleType scaleType) {
        throw null;
    }

    public oj0(iq1 iq1Var, id1.b bVar) {
        this.f16456a = iq1Var;
        this.b = bVar;
    }
}
