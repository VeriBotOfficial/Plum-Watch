package com.anythink.core.common.v.a;

import android.view.View;
import com.anythink.core.common.v.a.f;
import java.util.List;
import java.util.Map;

/* loaded from: classes12.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    public static final int f4366a = 1;
    public static final int b = 2;
    private final f c;
    private final Map<View, b> d;
    private final Map<View, d<b>> e;
    private final f.b f;
    private f.d g;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(int r6) {
        /*
            r5 = this;
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            java.util.WeakHashMap r1 = new java.util.WeakHashMap
            r1.<init>()
            com.anythink.core.common.v.a.f$b r2 = new com.anythink.core.common.v.a.f$b
            r2.<init>(r6)
            com.anythink.core.common.v.a.f r3 = new com.anythink.core.common.v.a.f
            r3.<init>(r6)
            android.os.Handler r6 = new android.os.Handler
            android.os.Looper r4 = android.os.Looper.getMainLooper()
            r6.<init>(r4)
            r5.<init>(r0, r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.v.a.c.<init>(int):void");
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public c(int r5, int r6) {
        /*
            r4 = this;
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            java.util.WeakHashMap r1 = new java.util.WeakHashMap
            r1.<init>()
            com.anythink.core.common.v.a.f$b r2 = new com.anythink.core.common.v.a.f$b
            r2.<init>(r5)
            com.anythink.core.common.v.a.f r3 = new com.anythink.core.common.v.a.f
            r3.<init>(r6, r5)
            android.os.Handler r5 = new android.os.Handler
            android.os.Looper r6 = android.os.Looper.getMainLooper()
            r5.<init>(r6)
            r4.<init>(r0, r1, r2, r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.core.common.v.a.c.<init>(int, int):void");
    }

    private c(Map<View, b> map, Map<View, d<b>> map2, f.b bVar, f fVar) {
        this.d = map;
        this.e = map2;
        this.f = bVar;
        this.c = fVar;
        f.d dVar = new f.d() { // from class: com.anythink.core.common.v.a.c.1
            @Override // com.anythink.core.common.v.a.f.d
            public final void a(List<View> list) {
                for (View view : list) {
                    b bVar2 = (b) c.this.d.get(view);
                    if (bVar2 == null) {
                        c.this.a(view);
                    } else {
                        bVar2.recordImpression(view);
                        bVar2.setImpressionRecorded();
                    }
                }
            }
        };
        this.g = dVar;
        fVar.a(dVar);
    }

    public final void a(View view, b bVar) {
        if (this.d.get(view) == bVar) {
            return;
        }
        a(view);
        if (bVar.isImpressionRecorded()) {
            return;
        }
        this.d.put(view, bVar);
        f fVar = this.c;
        int impressionMinPercentageViewed = bVar.getImpressionMinPercentageViewed();
        fVar.a(view, view, impressionMinPercentageViewed, impressionMinPercentageViewed, bVar.getImpressionMinVisiblePx());
    }

    public final void a(View view) {
        this.d.remove(view);
        b(view);
        this.c.a(view);
    }

    public final void a() {
        this.d.clear();
        this.e.clear();
        this.c.a();
    }

    public final void b() {
        a();
        this.c.b();
        this.g = null;
    }

    private void b(View view) {
        this.e.remove(view);
    }

    @Deprecated
    private f.d c() {
        return this.g;
    }
}
