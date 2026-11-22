package com.anythink.basead.ui.component;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;
import com.anythink.basead.ui.component.a.c;
import com.anythink.basead.ui.component.a.d;
import com.anythink.basead.ui.component.a.e;
import com.anythink.basead.ui.f.b;
import com.anythink.core.common.h.w;
import com.anythink.core.common.h.x;

/* loaded from: classes11.dex */
public class CTAButtonLayout extends LinearLayout {

    /* renamed from: a, reason: collision with root package name */
    protected final int f3224a;
    protected final int b;
    protected final int c;
    protected final int d;
    d e;
    private int f;

    public CTAButtonLayout(Context context) {
        this(context, null);
    }

    public CTAButtonLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CTAButtonLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f3224a = 0;
        this.b = 1;
        this.c = 2;
        this.d = 3;
        setOrientation(0);
        this.f = 0;
    }

    private void a() {
        setOrientation(0);
        this.f = 0;
    }

    public void initSetting(w wVar, x xVar, boolean z, b.a aVar) {
        d eVar;
        int a2 = a(wVar, xVar, z);
        int i = this.f;
        if (a2 != i) {
            if (i != 0) {
                removeAllViews();
            }
            this.f = a2;
            if (a2 == 2) {
                eVar = new e();
            } else if (a2 == 3) {
                eVar = new com.anythink.basead.ui.component.a.b();
            } else {
                eVar = new c();
            }
            this.e = eVar;
            eVar.b(this);
        }
        d dVar = this.e;
        if (dVar != null) {
            dVar.a(this, wVar, xVar, z, aVar);
        }
    }

    public void changeMinorButtonStyle() {
        d dVar = this.e;
        if (dVar != null) {
            dVar.c(this);
        }
    }

    public void changeMajorButtonBackground(Drawable drawable) {
        d dVar = this.e;
        if (dVar != null) {
            dVar.a(drawable);
        }
    }

    public void setMajorCTAText(String str) {
        d dVar = this.e;
        if (dVar != null) {
            dVar.a(str);
        }
    }

    public String getMajorCTAText() {
        d dVar = this.e;
        if (dVar != null) {
            return dVar.a();
        }
        return "";
    }

    public View getMajorCTAButtonView() {
        d dVar = this.e;
        return dVar != null ? dVar.b() : this;
    }

    protected int a(w wVar, x xVar, boolean z) {
        String valueOf = String.valueOf(xVar.j);
        valueOf.hashCode();
        if (valueOf.equals("1")) {
            return (z || xVar.o.bj() != 2) ? 1 : 3;
        }
        if (valueOf.equals("3")) {
            return (TextUtils.equals("2", xVar.o.O()) || !com.anythink.basead.b.e.a(wVar, xVar)) ? xVar.o.bj() == 2 ? 3 : 1 : (z || xVar.o.bj() != 2) ? 1 : 3;
        }
        return 1;
    }

    private static d a(int i) {
        if (i == 2) {
            return new e();
        }
        if (i == 3) {
            return new com.anythink.basead.ui.component.a.b();
        }
        return new c();
    }

    public boolean needInterceptCloseViewShow() {
        return this.f == 3;
    }

    public void activateSubCloseButton() {
        d dVar = this.e;
        if (dVar != null) {
            dVar.a(this);
        }
    }

    public View getSubCloseView() {
        d dVar;
        if (this.f != 3 || (dVar = this.e) == null) {
            return null;
        }
        return dVar.c();
    }
}
