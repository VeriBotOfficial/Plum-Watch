package com.baidu.ar;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.util.Log;
import android.view.MotionEvent;
import android.webkit.WebView;
import com.baidu.ar.arplay.core.engine.ARPEngine;

/* loaded from: classes12.dex */
public class s4 extends WebView {

    /* renamed from: a, reason: collision with root package name */
    public b f7185a;
    public boolean b;

    public class a implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ lc f7186a;

        public a(lc lcVar) {
            this.f7186a = lcVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            lc lcVar = this.f7186a;
            if (lcVar != null) {
                lcVar.d();
                s4.this.b = false;
            }
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public int f7187a;
        public boolean b;
        public String c;
        public String d;
        public int e;
        public int f;
    }

    public s4(Context context) {
        super(context);
        this.b = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        if (this.f7185a == null || canvas == null || !this.b) {
            return;
        }
        lc a2 = mc.a().a(this.f7185a.f7187a);
        if (a2 == null) {
            Log.e("GLWebView", "HtmlTextureHolder is null: mTextureId: " + this.f7185a.f7187a);
            return;
        }
        Canvas a3 = a2.a();
        if (a3 != null) {
            float width = a3.getWidth() / canvas.getWidth();
            a3.scale(width, width);
            a3.translate(-getScrollX(), -getScrollY());
            a3.drawColor(0, PorterDuff.Mode.CLEAR);
            super.draw(a3);
        }
        a2.c();
        ARPEngine.getInstance().getARPRenderer().runSyncOnRenderContext(new a(a2));
    }

    public b getWebViewData() {
        return this.f7185a;
    }

    @Override // android.webkit.WebView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void setIsNeedRender(boolean z) {
        this.b = z;
    }

    public void setWebViewData(b bVar) {
        this.f7185a = bVar;
    }
}
