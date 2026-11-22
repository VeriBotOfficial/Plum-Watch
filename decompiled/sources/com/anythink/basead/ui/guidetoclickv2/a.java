package com.anythink.basead.ui.guidetoclickv2;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.anythink.basead.g.f;
import com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View;
import com.anythink.basead.ui.improveclick.c;
import com.anythink.basead.ui.improveclick.g;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import java.util.Map;
import java.util.Queue;

/* loaded from: classes11.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    Queue<b> f3330a;
    Map<String, Object> b;
    BaseG2CV2View.b c = new BaseG2CV2View.b() { // from class: com.anythink.basead.ui.guidetoclickv2.a.1
        @Override // com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View.b
        public final void a() {
            a.this.f();
        }

        @Override // com.anythink.basead.ui.guidetoclickv2.BaseG2CV2View.b
        public final void b() {
            Object obj;
            if (a.this.b != null && (obj = a.this.b.get(g.a.c)) != null && (obj instanceof f)) {
                ((f) obj).onATImproveClickViewRenderFail(2);
            }
            a.this.c();
        }
    };
    private Context d;
    private w e;
    private x f;
    private RelativeLayout g;
    private int h;
    private View i;
    private b j;
    private c.a k;

    /* renamed from: com.anythink.basead.ui.guidetoclickv2.a$a, reason: collision with other inner class name */
    public static class C0176a {

        /* renamed from: a, reason: collision with root package name */
        public static int f3332a = 180;
        public static int b = 50;
    }

    public a(Context context, w wVar, x xVar, int i, RelativeLayout relativeLayout, View view, c.a aVar) {
        this.d = context;
        this.e = wVar;
        this.f = xVar;
        this.h = i;
        this.g = relativeLayout;
        this.i = view;
        this.k = aVar;
        d();
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x00ba, code lost:
    
        if (r2 != 3) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private void d() {
        /*
            Method dump skipped, instructions count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.ui.guidetoclickv2.a.d():void");
    }

    public final void a() {
        e();
    }

    public final void b() {
        b bVar = this.j;
        if (bVar != null) {
            bVar.b();
        }
    }

    private void e() {
        b bVar = this.j;
        if (bVar != null) {
            bVar.a();
        } else {
            f();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void f() {
        g();
        if (this.f3330a.size() > 0) {
            this.j = this.f3330a.poll();
            e();
        }
    }

    private void g() {
        b bVar = this.j;
        if (bVar != null) {
            bVar.c();
            this.j = null;
        }
    }

    public final void c() {
        b bVar = this.j;
        if (bVar != null) {
            bVar.b();
        }
        g();
        Queue<b> queue = this.f3330a;
        if (queue != null) {
            queue.clear();
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a1 A[ADDED_TO_REGION, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00a1 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private boolean a(int r6, int r7) {
        /*
            r5 = this;
            r0 = 3
            r1 = 0
            r2 = 1
            switch(r6) {
                case 1: goto L90;
                case 2: goto L7f;
                case 3: goto L78;
                case 4: goto L69;
                case 5: goto L69;
                case 6: goto L90;
                case 7: goto L90;
                case 8: goto L18;
                case 9: goto L18;
                case 10: goto L18;
                case 11: goto L90;
                case 12: goto L90;
                case 13: goto L8;
                default: goto L6;
            }
        L6:
            goto La1
        L8:
            com.anythink.core.common.h.x r6 = r5.f
            int r6 = r6.j
            r3 = 4
            if (r6 == r3) goto L15
            com.anythink.core.common.h.x r6 = r5.f
            int r6 = r6.j
            if (r6 != r0) goto La1
        L15:
            if (r7 != r2) goto La1
            return r1
        L18:
            com.anythink.core.common.h.x r0 = r5.f
            int r0 = r0.j
            if (r0 != r2) goto L21
            if (r7 != r2) goto L21
            goto L22
        L21:
            r1 = r2
        L22:
            if (r1 != 0) goto L68
            r7 = 9
            if (r6 != r7) goto L35
            com.anythink.core.common.v.g r7 = com.anythink.core.common.v.g.a()
            java.lang.String r0 = "g2c_chop"
            boolean r7 = r7.b(r0)
            if (r7 != 0) goto L35
            r1 = r2
        L35:
            r7 = 10
            r0 = 8
            if (r6 == r0) goto L3d
            if (r6 != r7) goto L4a
        L3d:
            com.anythink.core.common.v.g r3 = com.anythink.core.common.v.g.a()
            java.lang.String r4 = "g2c_finger_icon_v2"
            boolean r3 = r3.b(r4)
            if (r3 != 0) goto L4a
            r1 = r2
        L4a:
            if (r6 != r7) goto L59
            com.anythink.core.common.v.g r7 = com.anythink.core.common.v.g.a()
            java.lang.String r3 = "g2c_lucky_bag"
            boolean r7 = r7.b(r3)
            if (r7 != 0) goto L59
            r1 = r2
        L59:
            if (r6 != r0) goto L68
            com.anythink.core.common.v.g r6 = com.anythink.core.common.v.g.a()
            java.lang.String r7 = "g2c_lucky_bag_v2"
            boolean r6 = r6.b(r7)
            if (r6 != 0) goto L68
            return r2
        L68:
            return r1
        L69:
            int r6 = r5.h
            if (r6 == r2) goto L72
            r7 = 2
            if (r6 == r7) goto L72
            if (r6 != r0) goto La1
        L72:
            android.view.View r6 = r5.i
            if (r6 != 0) goto L77
            return r2
        L77:
            return r1
        L78:
            int r6 = r5.h
            if (r6 == r2) goto L7e
            if (r6 != r0) goto La1
        L7e:
            return r1
        L7f:
            com.anythink.core.common.h.w r6 = r5.e
            com.anythink.core.common.h.x r7 = r5.f
            boolean r6 = com.anythink.basead.b.e.a(r6, r7)
            if (r6 != 0) goto La1
            int r6 = r5.h
            if (r6 == r2) goto L8f
            if (r6 != r0) goto La1
        L8f:
            return r1
        L90:
            r7 = 6
            if (r6 != r7) goto La0
            com.anythink.core.common.v.g r6 = com.anythink.core.common.v.g.a()
            java.lang.String r7 = "g2c_finger_icon"
            boolean r6 = r6.b(r7)
            if (r6 != 0) goto La0
            return r2
        La0:
            return r1
        La1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.ui.guidetoclickv2.a.a(int, int):boolean");
    }

    public final void a(Map<String, Object> map) {
        this.b = map;
    }
}
