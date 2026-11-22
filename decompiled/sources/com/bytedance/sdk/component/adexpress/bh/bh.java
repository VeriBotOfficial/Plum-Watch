package com.bytedance.sdk.component.adexpress.bh;

import android.content.Context;
import android.text.TextUtils;
import android.widget.RelativeLayout;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class bh extends iwp {
    private dx fxn;

    public bh(Context context, int i, int i2, int i3, JSONObject jSONObject) {
        super(context);
        fxn(context, i, i2, i3, jSONObject);
    }

    private void fxn(Context context, int i, int i2, int i3, JSONObject jSONObject) {
        dx dxVar = new dx(context, com.bytedance.sdk.component.adexpress.gff.fxn.gff(context), i, i2, i3, jSONObject);
        this.fxn = dxVar;
        addView(dxVar);
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(14);
        layoutParams.addRule(12);
        this.fxn.setLayoutParams(layoutParams);
    }

    public dx getShakeView() {
        return this.fxn;
    }

    public void setShakeText(String str) {
        if (this.fxn == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            this.fxn.setShakeText("");
        } else {
            this.fxn.setShakeText(str);
        }
    }
}
