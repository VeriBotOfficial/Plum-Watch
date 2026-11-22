package com.bytedance.sdk.component.adexpress.bh;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class dx extends ud {
    private TextView fxn;

    public dx(Context context, View view, int i, int i2, int i3, JSONObject jSONObject) {
        super(context, view, i, i2, i3, jSONObject);
    }

    @Override // com.bytedance.sdk.component.adexpress.bh.ud
    protected void fxn(Context context, View view) {
        addView(view);
        this.fxn = (TextView) findViewById(2097610747);
    }

    @Override // com.bytedance.sdk.component.adexpress.bh.ud
    public void setShakeText(String str) {
        if (this.fxn == null) {
            return;
        }
        if (TextUtils.isEmpty(str)) {
            try {
                this.fxn.setText(com.bytedance.sdk.component.utils.jz.kg(this.fxn.getContext(), "tt_splash_default_click_shake"));
                return;
            } catch (Exception e) {
                e.getMessage();
                return;
            }
        }
        this.fxn.setText(str);
    }
}
