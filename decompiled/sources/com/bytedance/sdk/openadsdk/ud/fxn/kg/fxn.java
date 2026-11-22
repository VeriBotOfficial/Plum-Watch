package com.bytedance.sdk.openadsdk.ud.fxn.kg;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.sdk.component.tw.tw;
import com.bytedance.sdk.openadsdk.core.settings.rlu;
import com.bytedance.sdk.openadsdk.utils.DeviceUtils;
import com.bytedance.sdk.openadsdk.utils.yws;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class fxn {
    private static volatile fxn hm;
    private AtomicLong fxn = new AtomicLong(0);
    private int kg = 0;
    private String gff = "";

    public static fxn fxn() {
        if (hm == null) {
            synchronized (fxn.class) {
                if (hm == null) {
                    hm = new fxn();
                }
            }
        }
        return hm;
    }

    private fxn() {
    }

    public String kg() {
        if (gff()) {
            return this.gff;
        }
        return "";
    }

    public void fxn(String str) {
        this.gff = str;
    }

    public void fxn(boolean z) {
        if (this.kg == 1 || !TextUtils.isEmpty(kg())) {
            return;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (z || this.fxn.get() <= elapsedRealtime) {
            this.fxn.set(elapsedRealtime + 300000);
            yws.fxn((tw) new DeviceUtils.gff());
        }
    }

    public void fxn(int i) {
        this.kg = i;
    }

    public boolean gff() {
        return rlu.jt().ke("gaid");
    }

    public void fxn(JSONObject jSONObject) {
        if (!gff() || jSONObject == null) {
            return;
        }
        try {
            jSONObject.put("gaid", this.gff);
        } catch (JSONException unused) {
        }
    }
}
