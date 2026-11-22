package com.baidu.mapapi.map.bmsdk.ui;

import com.baidu.mapapi.animation.Animation;
import com.baidu.mapapi.map.CollisionBehavior;
import com.baidu.platform.comapi.bmsdk.animation.BmAnimation;
import com.baidu.platform.comapi.bmsdk.ui.BmBaseUI;
import com.baidu.platform.comapi.bmsdk.ui.BmRichView;
import com.baidu.platform.comapi.bmsdk.xmlui.BmXmlParse;
import com.baidu.platform.comapi.bmsdk.xmlui.a;
import org.w3c.dom.Document;

/* loaded from: classes13.dex */
public class RichView {

    /* renamed from: a, reason: collision with root package name */
    private BmRichView f8031a = new BmRichView();
    private BmBaseUI b;

    public BmRichView getBmRichView() {
        return this.f8031a;
    }

    public BmBaseUI getView() {
        return this.b;
    }

    public void setAnimation(Animation animation) {
        BmAnimation bmAnimation;
        if (animation == null || (bmAnimation = animation.bmAnimation) == null) {
            return;
        }
        this.f8031a.a(bmAnimation);
    }

    public void setCollisionBehavior(CollisionBehavior collisionBehavior) {
        this.f8031a.a(collisionBehavior.getNumber());
    }

    public void setCollisionPriority(short s) {
        BmRichView bmRichView = this.f8031a;
        if (s < 0) {
            s = 0;
        }
        bmRichView.a(s);
    }

    public void setLocated(Located located) {
        this.f8031a.b(located.getNumber());
    }

    public void setScale(float f) {
        this.f8031a.a(f);
    }

    public void setScaleX(float f) {
        this.f8031a.b(f);
    }

    public void setScaleY(float f) {
        this.f8031a.c(f);
    }

    public void setShowLevel(int i, int i2) {
        this.f8031a.a(i, i2);
    }

    public void setView(BaseUI baseUI) {
        this.f8031a.a(baseUI.getBmBaseUI());
    }

    public void setVisibility(int i) {
        this.f8031a.c(i);
    }

    public void setXmlView(String str) {
        Document a2 = BmXmlParse.a(str.getBytes());
        if (a2 != null) {
            this.f8031a = new a().a(a2);
        }
    }
}
