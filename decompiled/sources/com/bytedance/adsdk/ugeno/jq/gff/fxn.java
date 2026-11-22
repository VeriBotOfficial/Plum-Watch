package com.bytedance.adsdk.ugeno.jq.gff;

import android.content.Context;
import android.text.TextUtils;
import android.widget.ImageView;
import com.anythink.expressad.foundation.h.k;
import com.bytedance.adsdk.ugeno.jq.hm.gff;

/* loaded from: classes13.dex */
public abstract class fxn extends gff {
    private int jt;

    public abstract String dgx(String str);

    public fxn(Context context) {
        super(context);
        this.jt = -16777216;
    }

    @Override // com.bytedance.adsdk.ugeno.jq.hm.gff, com.bytedance.adsdk.ugeno.kg.gff
    public void kg() {
        this.fxn = rlu(this.fxn);
        super.kg();
        ((com.bytedance.adsdk.ugeno.jq.hm.fxn) this.rb).setColorFilter(this.jt);
        ((com.bytedance.adsdk.ugeno.jq.hm.fxn) this.rb).setScaleType(ImageView.ScaleType.FIT_CENTER);
    }

    private String rlu(String str) {
        String dgx = dgx(str);
        if (TextUtils.isEmpty(dgx)) {
            return "";
        }
        return "local://".concat(String.valueOf(dgx));
    }

    @Override // com.bytedance.adsdk.ugeno.jq.hm.gff, com.bytedance.adsdk.ugeno.kg.gff
    public void fxn(String str, String str2) {
        super.fxn(str, str2);
        str.hashCode();
        if (str.equals("textColor")) {
            this.jt = com.bytedance.adsdk.ugeno.sg.fxn.fxn(str2);
        }
    }

    @Override // com.bytedance.adsdk.ugeno.jq.hm.gff
    protected String gff() {
        return k.c;
    }
}
