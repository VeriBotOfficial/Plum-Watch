package com.anythink.basead.webtemplet.adformat;

import android.content.Context;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.anythink.basead.ui.RoundCornerRelativeLayout;
import com.anythink.basead.webtemplet.WTWebView;
import com.anythink.basead.webtemplet.a.b;
import com.anythink.core.api.ATAdConst;
import com.anythink.core.common.a.b;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;
import com.anythink.core.common.v.m;
import com.anythink.core.common.v.q;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.List;
import java.util.Locale;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class e implements b {

    /* renamed from: a, reason: collision with root package name */
    final String f3460a = getClass().getSimpleName();
    w b;
    x c;
    private a d;
    private com.anythink.basead.ui.component.a e;

    public final void a(w wVar, x xVar) {
        this.b = wVar;
        this.c = xVar;
    }

    public final void a(a aVar) {
        this.d = aVar;
    }

    public final a a() {
        return this.d;
    }

    public final void a(com.anythink.basead.ui.component.a aVar) {
        this.e = aVar;
    }

    @Override // com.anythink.basead.webtemplet.adformat.b
    public void initSuccess(Object obj, String str) {
        String str2;
        if (obj instanceof com.anythink.basead.webtemplet.e) {
            try {
                WTWebView wTWebView = ((com.anythink.basead.webtemplet.e) obj).f3471a;
                if (wTWebView != null) {
                    wTWebView.jsCallInitSuccess();
                    try {
                        Context g = t.b().g();
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put(b.c.f3458a, 2);
                        jSONObject.put(b.c.b, 1);
                        int k = m.k(g) + q.b(g);
                        JSONObject jSONObject2 = new JSONObject();
                        jSONObject2.put(CommonUrlParts.SCREEN_WIDTH, m.j(g));
                        jSONObject2.put(CommonUrlParts.SCREEN_HEIGHT, k);
                        int i = this.c.j;
                        if (i == 1 || i == 3 || i == 4) {
                            jSONObject2.put("top_padding", q.b(g));
                        } else {
                            jSONObject2.put("top_padding", 0);
                        }
                        jSONObject.put(b.c.d, jSONObject2);
                        JSONObject jSONObject3 = new JSONObject();
                        jSONObject3.put("ad_width", m.j(g));
                        jSONObject3.put("ad_height", k);
                        if (this.c.w != null) {
                            Object obj2 = this.c.w.get(ATAdConst.KEY.AD_WIDTH);
                            if (obj2 != null) {
                                jSONObject3.put("ad_width", obj2);
                            }
                            Object obj3 = this.c.w.get(ATAdConst.KEY.AD_HEIGHT);
                            if (obj3 != null) {
                                jSONObject3.put("ad_height", obj3);
                            }
                            Object obj4 = this.c.w.get("orientation");
                            if (obj4 != null) {
                                jSONObject3.put(ATAdConst.KEY.AD_ORIENTATION, obj4);
                            }
                        }
                        jSONObject.put(b.c.e, jSONObject3);
                        JSONObject jSONObject4 = new JSONObject();
                        if (!TextUtils.isEmpty(this.c.v)) {
                            try {
                                jSONObject4 = new JSONObject(this.c.v);
                            } catch (Throwable unused) {
                            }
                        }
                        jSONObject.put(b.c.f, jSONObject4);
                        jSONObject.put("format", this.c.j);
                        jSONObject.put(b.c.i, wTWebView.isPreload() ? "1" : "2");
                        jSONObject.put(b.c.j, Locale.getDefault().getLanguage());
                        str2 = jSONObject.toString();
                    } catch (Throwable unused2) {
                        str2 = "";
                    }
                    if (TextUtils.isEmpty(str2)) {
                        com.anythink.basead.webtemplet.a.a(obj, "");
                        return;
                    } else {
                        com.anythink.basead.webtemplet.a.b(obj, str2);
                        wTWebView.offerDataInject();
                        return;
                    }
                }
                com.anythink.basead.webtemplet.a.a(obj, "WTWebView empty");
            } catch (Throwable th) {
                b(obj, "initSuccess", th);
            }
        }
    }

    @Override // com.anythink.basead.webtemplet.adformat.b
    public void renderSuccess(Object obj, String str) {
        if (obj instanceof com.anythink.basead.webtemplet.e) {
            try {
                WTWebView wTWebView = ((com.anythink.basead.webtemplet.e) obj).f3471a;
                if (wTWebView != null) {
                    wTWebView.renderSuccess();
                    com.anythink.basead.webtemplet.a.b(obj, "");
                } else {
                    com.anythink.basead.webtemplet.a.a(obj, "WTWebView empty");
                }
            } catch (Throwable th) {
                b(obj, "renderSuccess", th);
            }
        }
    }

    @Override // com.anythink.basead.webtemplet.adformat.b
    public void h5ShowException(Object obj, String str) {
        if (obj instanceof com.anythink.basead.webtemplet.e) {
            try {
                WTWebView wTWebView = ((com.anythink.basead.webtemplet.e) obj).f3471a;
                if (wTWebView != null) {
                    wTWebView.h5ShowException(str);
                    com.anythink.basead.webtemplet.a.b(obj, "");
                } else {
                    com.anythink.basead.webtemplet.a.a(obj, "WTWebView empty");
                }
            } catch (Throwable th) {
                b(obj, "h5ShowException", th);
            }
        }
    }

    @Override // com.anythink.basead.webtemplet.adformat.b
    public void sendEventDA(Object obj, String str) {
        if (obj instanceof com.anythink.basead.webtemplet.e) {
            try {
                WTWebView wTWebView = ((com.anythink.basead.webtemplet.e) obj).f3471a;
                if (wTWebView != null) {
                    wTWebView.sendEventDA(str);
                    com.anythink.basead.webtemplet.a.b(obj, "");
                } else {
                    com.anythink.basead.webtemplet.a.a(obj, "WTWebView empty");
                }
            } catch (Throwable th) {
                b(obj, "sendEventDA", th);
            }
        }
    }

    @Override // com.anythink.basead.webtemplet.adformat.b
    public void playerViewInit(final Object obj, String str) {
        com.anythink.basead.ui.component.a aVar = this.e;
        if (aVar != null && aVar.l() != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                final int optInt = jSONObject.optInt("position_x", 0);
                final int optInt2 = jSONObject.optInt("position_y", 0);
                final int optInt3 = jSONObject.optInt("view_width", 0);
                final int optInt4 = jSONObject.optInt("view_height", 0);
                final int optInt5 = jSONObject.optInt("mute", 1);
                final int optInt6 = jSONObject.optInt("right_top_corner", 0);
                final int optInt7 = jSONObject.optInt("right_bottom_corner", 0);
                final int optInt8 = jSONObject.optInt("left_top_corner", 0);
                final int optInt9 = jSONObject.optInt("left_bottom_corner", 0);
                t.b().b(new Runnable() { // from class: com.anythink.basead.webtemplet.adformat.e.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        View m = e.this.e.m();
                        if (m == null) {
                            m = e.this.e.l();
                        }
                        if (m == null) {
                            com.anythink.basead.webtemplet.a.a(obj, "playerViewContainer empty");
                            return;
                        }
                        m.setX(optInt);
                        m.setY(optInt2);
                        ViewGroup.LayoutParams layoutParams = m.getLayoutParams();
                        if (layoutParams != null) {
                            layoutParams.width = optInt3;
                            layoutParams.height = optInt4;
                            m.setLayoutParams(layoutParams);
                        }
                        e.this.e.a(optInt5 == 1, (List<Bitmap>) null, (com.anythink.basead.j.e) null);
                        if (m instanceof RoundCornerRelativeLayout) {
                            ((RoundCornerRelativeLayout) m).setRadius(optInt8, optInt6, optInt7, optInt9);
                        }
                        m.requestLayout();
                        com.anythink.basead.webtemplet.a.b(obj, "");
                        if (e.this.d != null) {
                            e.this.d.b();
                        }
                    }
                });
                return;
            } catch (Throwable th) {
                b(obj, "playerViewInit", th);
                return;
            }
        }
        com.anythink.basead.webtemplet.a.a(obj, "videoComponent empty");
    }

    @Override // com.anythink.basead.webtemplet.adformat.b
    public void playerViewGetProgress(final Object obj, String str) {
        com.anythink.core.common.v.b.b.a().b(new Runnable() { // from class: com.anythink.basead.webtemplet.adformat.e.2
            @Override // java.lang.Runnable
            public final void run() {
                if (e.this.e != null && e.this.e.l() != null) {
                    long i = e.this.e.i();
                    try {
                        JSONObject jSONObject = new JSONObject();
                        jSONObject.put("progress", i);
                        com.anythink.basead.webtemplet.a.a(obj, jSONObject);
                        return;
                    } catch (Throwable th) {
                        e.b(obj, "playerViewGetProgress", th);
                        return;
                    }
                }
                com.anythink.basead.webtemplet.a.a(obj, "videoComponent empty");
            }
        }, 2);
    }

    @Override // com.anythink.basead.webtemplet.adformat.b
    public void playerViewMute(Object obj, String str) {
        com.anythink.basead.ui.component.a aVar = this.e;
        if (aVar != null && aVar.l() != null) {
            try {
                boolean z = true;
                int optInt = new JSONObject(str).optInt("mute", 1);
                com.anythink.basead.ui.component.a aVar2 = this.e;
                if (optInt != 1) {
                    z = false;
                }
                aVar2.c(z);
                com.anythink.basead.webtemplet.a.b(obj, "");
                return;
            } catch (Throwable th) {
                b(obj, "playerViewMute", th);
                return;
            }
        }
        com.anythink.basead.webtemplet.a.a(obj, "videoComponent empty");
    }

    @Override // com.anythink.basead.webtemplet.adformat.b
    public void playerViewRemove(Object obj, String str) {
        com.anythink.basead.ui.component.a aVar = this.e;
        if (aVar != null && aVar.l() != null) {
            try {
                this.e.b();
                com.anythink.basead.webtemplet.a.b(obj, "");
                return;
            } catch (Throwable th) {
                b(obj, "playerViewRemove", th);
                return;
            }
        }
        com.anythink.basead.webtemplet.a.a(obj, "videoComponent empty");
    }

    @Override // com.anythink.basead.webtemplet.adformat.b
    public void playerViewPauseOrResumePlay(Object obj, String str) {
        com.anythink.basead.ui.component.a aVar = this.e;
        if (aVar != null && aVar.l() != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                int optInt = jSONObject.optInt("is_resume", 1);
                boolean z = jSONObject.optInt("can_resume", 1) == 1;
                if (optInt == 1) {
                    this.e.a(z);
                } else {
                    this.e.b(z);
                }
                com.anythink.basead.webtemplet.a.b(obj, "");
                return;
            } catch (Throwable th) {
                b(obj, "playerViewPauseOrResumePlay", th);
                return;
            }
        }
        com.anythink.basead.webtemplet.a.a(obj, "videoComponent empty");
    }

    @Override // com.anythink.basead.webtemplet.adformat.b
    public void playerViewRelayout(Object obj, String str) {
        final Object obj2;
        final int optInt;
        final int optInt2;
        final int optInt3;
        final int optInt4;
        final int optInt5;
        final int optInt6;
        final int optInt7;
        final int optInt8;
        com.anythink.basead.ui.component.a aVar = this.e;
        if (aVar != null && aVar.l() != null) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                optInt = jSONObject.optInt("position_x", 0);
                optInt2 = jSONObject.optInt("position_y", 0);
                optInt3 = jSONObject.optInt("view_width", 0);
                optInt4 = jSONObject.optInt("view_height", 0);
                optInt5 = jSONObject.optInt("right_top_corner", 0);
                optInt6 = jSONObject.optInt("right_bottom_corner", 0);
                optInt7 = jSONObject.optInt("left_top_corner", 0);
                optInt8 = jSONObject.optInt("left_bottom_corner", 0);
                obj2 = obj;
            } catch (Throwable th) {
                th = th;
                obj2 = obj;
            }
            try {
                t.b().b(new Runnable() { // from class: com.anythink.basead.webtemplet.adformat.e.3
                    @Override // java.lang.Runnable
                    public final void run() {
                        View m = e.this.e.m();
                        if (m == null) {
                            e.this.e.l();
                        }
                        if (m == null) {
                            com.anythink.basead.webtemplet.a.a(obj2, "videoComponent empty");
                            return;
                        }
                        m.setX(optInt);
                        m.setY(optInt2);
                        ViewGroup.LayoutParams layoutParams = m.getLayoutParams();
                        if (layoutParams != null) {
                            layoutParams.width = optInt3;
                            layoutParams.height = optInt4;
                            m.setLayoutParams(layoutParams);
                        }
                        if (m instanceof RoundCornerRelativeLayout) {
                            ((RoundCornerRelativeLayout) m).setRadius(optInt7, optInt5, optInt6, optInt8);
                        }
                        m.requestLayout();
                        com.anythink.basead.webtemplet.a.b(obj2, "");
                    }
                });
                return;
            } catch (Throwable th2) {
                th = th2;
                b(obj2, "playerViewRelayout", th);
                return;
            }
        }
        com.anythink.basead.webtemplet.a.a(obj, "videoComponent empty");
    }

    @Override // com.anythink.basead.webtemplet.adformat.b
    public void notifyClick(Object obj, String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            int optInt = jSONObject.optInt("cl_s_type", 0);
            int optInt2 = jSONObject.optInt("cl_area", 0);
            a aVar = this.d;
            if (aVar != null) {
                aVar.a(optInt, optInt2);
                com.anythink.basead.webtemplet.a.b(obj, "");
            } else {
                com.anythink.basead.webtemplet.a.a(obj, "bridgeListener empty");
            }
        } catch (Throwable th) {
            b(obj, "notifyClick", th);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0045 A[Catch: all -> 0x004b, TRY_LEAVE, TryCatch #2 {all -> 0x004b, blocks: (B:4:0x0006, B:6:0x000d, B:8:0x0013, B:15:0x0032, B:18:0x003a, B:19:0x0041, B:22:0x003e, B:23:0x0045), top: B:3:0x0006 }] */
    @Override // com.anythink.basead.webtemplet.adformat.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void openInWebView(java.lang.Object r6, java.lang.String r7) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            boolean r1 = r6 instanceof com.anythink.basead.webtemplet.e
            if (r1 == 0) goto L51
            r1 = r6
            com.anythink.basead.webtemplet.e r1 = (com.anythink.basead.webtemplet.e) r1     // Catch: java.lang.Throwable -> L4b
            com.anythink.basead.webtemplet.WTWebView r1 = r1.f3471a     // Catch: java.lang.Throwable -> L4b
            if (r1 == 0) goto L1c
            android.content.Context r1 = r1.getContext()     // Catch: java.lang.Throwable -> L4b
            if (r1 != 0) goto L1d
            com.anythink.core.common.d.t r1 = com.anythink.core.common.d.t.b()     // Catch: java.lang.Throwable -> L4b
            android.content.Context r1 = r1.g()     // Catch: java.lang.Throwable -> L4b
            goto L1d
        L1c:
            r1 = 0
        L1d:
            r2 = 1
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch: java.lang.Throwable -> L30
            r3.<init>(r7)     // Catch: java.lang.Throwable -> L30
            java.lang.String r7 = "type"
            int r7 = r3.optInt(r7, r2)     // Catch: java.lang.Throwable -> L30
            java.lang.String r4 = "url"
            java.lang.String r3 = r3.optString(r4, r0)     // Catch: java.lang.Throwable -> L31
            goto L32
        L30:
            r7 = r2
        L31:
            r3 = r0
        L32:
            boolean r4 = android.text.TextUtils.isEmpty(r3)     // Catch: java.lang.Throwable -> L4b
            if (r4 != 0) goto L45
            if (r7 != r2) goto L3e
            com.anythink.core.common.v.y.a(r1, r3)     // Catch: java.lang.Throwable -> L4b
            goto L41
        L3e:
            com.anythink.core.common.v.y.a(r3)     // Catch: java.lang.Throwable -> L4b
        L41:
            com.anythink.basead.webtemplet.a.b(r6, r0)     // Catch: java.lang.Throwable -> L4b
            goto L51
        L45:
            java.lang.String r7 = "params error"
            com.anythink.basead.webtemplet.a.a(r6, r7)     // Catch: java.lang.Throwable -> L4b
            goto L51
        L4b:
            r7 = move-exception
            java.lang.String r0 = "openInWebView"
            b(r6, r0, r7)
        L51:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.anythink.basead.webtemplet.adformat.e.openInWebView(java.lang.Object, java.lang.String):void");
    }

    @Override // com.anythink.basead.webtemplet.adformat.b
    public void showFeedbackDialog(Object obj, String str) {
        a aVar = this.d;
        if (aVar != null) {
            aVar.a();
            com.anythink.basead.webtemplet.a.b(obj, "");
        } else {
            com.anythink.basead.webtemplet.a.a(obj, "bridgeListener empty");
        }
    }

    @Override // com.anythink.basead.webtemplet.adformat.b
    public void notifyClose(Object obj, String str) {
        try {
            int optInt = new JSONObject(str).optInt(b.C0190b.f3606a, 0);
            a aVar = this.d;
            if (aVar != null) {
                aVar.a(optInt);
                com.anythink.basead.webtemplet.a.b(obj, "");
            } else {
                com.anythink.basead.webtemplet.a.a(obj, "bridgeListener empty");
            }
        } catch (Throwable th) {
            b(obj, "notifyClose", th);
        }
    }

    @Override // com.anythink.basead.webtemplet.adformat.b
    public void controlShakeView(Object obj, String str) {
        try {
            if (!com.anythink.basead.b.e.a(this.c)) {
                com.anythink.basead.webtemplet.a.a(obj, "not support shake");
                return;
            }
            int optInt = new JSONObject(str).optInt("control_show", 0);
            a aVar = this.d;
            if (aVar != null) {
                aVar.b(optInt);
                com.anythink.basead.webtemplet.a.b(obj, "");
            } else {
                com.anythink.basead.webtemplet.a.a(obj, "bridgeListener empty");
            }
        } catch (Throwable th) {
            b(obj, "notifyClose", th);
        }
    }

    @Override // com.anythink.basead.webtemplet.adformat.b
    public void notifyReward(Object obj, String str) {
        try {
            a aVar = this.d;
            if (aVar != null && (aVar instanceof d)) {
                ((d) aVar).c();
                com.anythink.basead.webtemplet.a.b(obj, "");
            } else if (aVar == null) {
                com.anythink.basead.webtemplet.a.a(obj, "bridgeListener empty");
            } else {
                com.anythink.basead.webtemplet.a.a(obj, "bridgeListener type error");
            }
        } catch (Throwable th) {
            b(obj, "notifyReward", th);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void b(Object obj, String str, Throwable th) {
        if (obj == null || th == null) {
            return;
        }
        com.anythink.basead.webtemplet.a.a(obj, "call method " + str + " fail with exception:" + th.getMessage());
    }
}
