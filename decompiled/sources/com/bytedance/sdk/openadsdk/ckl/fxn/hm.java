package com.bytedance.sdk.openadsdk.ckl.fxn;

import android.os.Build;
import android.text.TextUtils;
import com.anythink.basead.webtemplet.a.b;
import com.baidu.mapapi.SDKInitializer;
import com.bytedance.sdk.component.utils.dx;
import com.bytedance.sdk.component.utils.je;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.ckl.fxn.hm;
import com.bytedance.sdk.openadsdk.core.jq;
import com.bytedance.sdk.openadsdk.core.rmu;
import com.bytedance.sdk.openadsdk.utils.qhf;
import com.bytedance.sdk.openadsdk.utils.uhw;
import com.xiaomi.mipush.sdk.Constants;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class hm<T extends hm> implements gff {
    private String dgx;
    private String fxn;
    private String gff;
    private String hie;
    private String jq;
    private String kg;
    private String mvp;
    private String rlu;

    /* renamed from: sg, reason: collision with root package name */
    private String f9427sg;
    private final String hm = BuildConfig.VERSION_NAME;
    private long rb = System.currentTimeMillis() / 1000;
    private int bh = 0;
    private int tw = 0;

    private T xdg() {
        return this;
    }

    private hm() {
        try {
            this.rlu = uhw.fxn();
        } catch (Throwable unused) {
            this.rlu = "default";
        }
    }

    public static hm<hm> kg() {
        return new hm<>();
    }

    @Override // com.bytedance.sdk.openadsdk.ckl.fxn.gff
    public JSONObject fxn() {
        JSONObject jSONObject;
        JSONObject jSONObject2 = new JSONObject();
        try {
            jSONObject2.put("ad_sdk_version", sg());
            jSONObject2.put("app_version", qhf.tw());
            jSONObject2.put("timestamp", tw());
            jSONObject2.put("conn_type", je.kg(rmu.fxn()));
            jSONObject2.put("appid", TextUtils.isEmpty(jq.kg().hm()) ? "" : jq.kg().hm());
            jSONObject2.put(b.c.d, ckl());
            if (!TextUtils.isEmpty(gff())) {
                jSONObject2.put("type", gff());
            }
            jSONObject2.put(SDKInitializer.SDK_BROADTCAST_INTENT_EXTRA_INFO_KEY_ERROR_CODE, dgx());
            if (!TextUtils.isEmpty(mvp())) {
                jSONObject2.put("error_msg", mvp());
            }
            if (!TextUtils.isEmpty(rb())) {
                jSONObject2.put("rit", rb());
            }
            if (!TextUtils.isEmpty(bh())) {
                jSONObject2.put("creative_id", bh());
            }
            if (jq() > 0) {
                jSONObject2.put("adtype", jq());
            }
            if (!TextUtils.isEmpty(hie())) {
                jSONObject2.put("req_id", hie());
            }
            if (!TextUtils.isEmpty(rlu())) {
                jSONObject2.put("extra", rlu());
            }
            String hm = hm();
            if (TextUtils.isEmpty(hm)) {
                jSONObject = new JSONObject();
            } else {
                try {
                    jSONObject = new JSONObject(hm);
                } catch (Throwable unused) {
                    jSONObject = null;
                }
            }
            if (jSONObject != null) {
                jSONObject.put("os_version_int", Build.VERSION.SDK_INT);
                jSONObject.put("pangle_client_unique_id", "pangle-" + this.rlu + Constants.ACCEPT_TIME_SEPARATOR_SERVER + System.currentTimeMillis());
                jSONObject2.put("event_extra", jSONObject.toString());
            } else if (!TextUtils.isEmpty(hm)) {
                jSONObject2.put("event_extra", hm);
            }
            if (!TextUtils.isEmpty(zu())) {
                jSONObject2.put("duration", zu());
            }
        } catch (Throwable th) {
            dx.gff("LogStatsBase", th.getMessage());
        }
        return jSONObject2;
    }

    private JSONObject ckl() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("os", 1);
            jSONObject.put("model", Build.MODEL);
            jSONObject.put("vendor", Build.MANUFACTURER);
            jSONObject.put("package_name", qhf.bh());
            jSONObject.put("ua", qhf.hm());
        } catch (Throwable unused) {
        }
        return jSONObject;
    }

    public String gff() {
        return this.fxn;
    }

    public T fxn(String str) {
        this.fxn = str;
        return xdg();
    }

    public String hm() {
        return this.dgx;
    }

    public T kg(String str) {
        this.dgx = str;
        return xdg();
    }

    public String rb() {
        return this.kg;
    }

    public T gff(String str) {
        this.kg = str;
        return xdg();
    }

    public String bh() {
        return this.gff;
    }

    public T hm(String str) {
        this.gff = str;
        return xdg();
    }

    public String sg() {
        return TextUtils.isEmpty(BuildConfig.VERSION_NAME) ? "" : BuildConfig.VERSION_NAME;
    }

    public long tw() {
        return this.rb;
    }

    public int jq() {
        return this.bh;
    }

    public T fxn(int i) {
        this.bh = i;
        return xdg();
    }

    public String hie() {
        return this.f9427sg;
    }

    public T rb(String str) {
        this.f9427sg = str;
        return xdg();
    }

    public int dgx() {
        return this.tw;
    }

    public T kg(int i) {
        this.tw = i;
        return xdg();
    }

    public String mvp() {
        return this.jq;
    }

    public T bh(String str) {
        this.jq = str;
        return xdg();
    }

    public String rlu() {
        return this.hie;
    }

    public T sg(String str) {
        this.hie = str;
        return xdg();
    }

    public String zu() {
        return this.mvp;
    }

    public T tw(String str) {
        this.mvp = str;
        return xdg();
    }
}
