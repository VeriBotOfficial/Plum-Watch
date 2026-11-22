package com.anythink.basead.ui;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.anythink.basead.b.e;
import com.anythink.core.common.d.t;
import com.anythink.core.common.h.y;
import com.anythink.core.common.v.q;

/* loaded from: classes11.dex */
public class ShakeTextHintView extends BaseShakeView {
    protected TextView l;

    public ShakeTextHintView(Context context) {
        super(context);
    }

    public ShakeTextHintView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public ShakeTextHintView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }

    public ShakeTextHintView(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }

    @Override // com.anythink.basead.ui.BaseShakeView
    void a() {
        setOrientation(0);
        setGravity(17);
        LayoutInflater.from(getContext()).inflate(d(), (ViewGroup) this, true);
        int a2 = q.a(getContext(), 4.0f);
        setPadding(a2, a2, a2, a2);
        int a3 = q.a(t.b().g(), "myoffer_shake_text_hint_img", "id");
        int a4 = q.a(t.b().g(), "myoffer_shake_text_hint_title", "id");
        this.f3000a = (ImageView) findViewById(a3);
        this.l = (TextView) findViewById(a4);
    }

    @Override // com.anythink.basead.ui.BaseShakeView
    public void setShakeSetting(y yVar, int i) {
        super.setShakeSetting(yVar, i);
        if (this.l != null) {
            if (!TextUtils.isEmpty(this.f)) {
                this.l.setText(this.f);
            } else {
                this.l.setText(e.a(getContext(), i));
            }
        }
    }

    protected int d() {
        return q.a(getContext(), "myoffer_shake_text_hint", "layout");
    }
}
