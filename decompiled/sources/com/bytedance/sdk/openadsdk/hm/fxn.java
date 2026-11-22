package com.bytedance.sdk.openadsdk.hm;

import android.text.TextUtils;
import com.anythink.expressad.foundation.g.a;
import com.baidu.mapapi.SDKInitializer;
import com.bytedance.sdk.component.utils.dx;
import com.bytedance.sdk.openadsdk.core.model.ggo;
import com.bytedance.sdk.openadsdk.core.model.jz;
import com.bytedance.sdk.openadsdk.utils.uhw;
import com.bytedance.sdk.openadsdk.utils.yws;
import com.iflytek.cloud.SpeechConstant;
import com.phancy.mini.api.file.FileSystemManager;
import com.wakeup.module.xmly.XmlyWebViewActivity;
import com.xiaomi.mipush.sdk.Constants;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class fxn implements com.bytedance.sdk.component.bh.fxn.hm.fxn.kg {
    private final String bh;
    private String bx;
    private String ckl;
    private com.bytedance.sdk.openadsdk.hm.kg.fxn dx;
    public final String fxn;
    private boolean gff;
    private long hm;
    private String iwp;
    private String je;
    private int jq;
    private int jz;
    protected final JSONObject kg;
    private final AtomicBoolean mvp;
    private long rb;
    private JSONObject rlu;
    private String rmu;

    /* renamed from: sg, reason: collision with root package name */
    private int f9553sg;
    private int tw;
    private String ud;
    private String ums;
    private String xdg;
    private String zu;
    private static final Set<String> hie = new HashSet(Arrays.asList("insight_log"));
    private static final Map<String, String> dgx = new HashMap<String, String>() { // from class: com.bytedance.sdk.openadsdk.hm.fxn.1
        {
            put("id", "extra_id");
            put("source", "extra_source");
            put("url", XmlyWebViewActivity.EXTRA_URL);
            put("toolType", "extra_tool_type");
            put("storeOpenType", "store_open_type");
            put("errorCode", SDKInitializer.SDK_BROADTCAST_INTENT_EXTRA_INFO_KEY_ERROR_CODE);
            put(FileSystemManager.DIGEST_MD5, "extra_md5");
            put("areaType", "area_type");
            put("rectInfo", "rect_info");
        }
    };

    public fxn(String str, JSONObject jSONObject) {
        this.bh = "adiff";
        this.mvp = new AtomicBoolean(false);
        this.rlu = new JSONObject();
        this.fxn = str;
        this.kg = jSONObject;
    }

    private void bh() {
        JSONObject jSONObject = this.rlu;
        if (jSONObject == null) {
            if (!fxn(this.rmu, this.xdg, this.iwp)) {
                return;
            }
        } else {
            String optString = jSONObject.optString("value");
            String optString2 = this.rlu.optString(SpeechConstant.ISE_CATEGORY);
            String optString3 = this.rlu.optString("log_extra");
            if (fxn(this.rmu, this.xdg, this.iwp)) {
                if (!TextUtils.isEmpty(optString) && TextUtils.equals(optString, "0")) {
                    return;
                }
                if (!TextUtils.isEmpty(optString2) && !kg(optString2)) {
                    return;
                }
            } else {
                if ((TextUtils.isEmpty(optString) || TextUtils.equals(optString, "0")) && (TextUtils.isEmpty(this.rmu) || TextUtils.equals(this.rmu, "0"))) {
                    return;
                }
                if ((TextUtils.isEmpty(this.xdg) || !kg(this.xdg)) && (TextUtils.isEmpty(optString2) || !kg(optString2))) {
                    return;
                }
                if (TextUtils.isEmpty(this.iwp) && TextUtils.isEmpty(optString3)) {
                    return;
                }
            }
        }
        this.hm = com.bytedance.sdk.openadsdk.hm.fxn.hm.fxn.incrementAndGet();
    }

    private boolean kg(String str) {
        str.hashCode();
        switch (str) {
            case "umeng":
            case "event_v1":
            case "event_v3":
            case "app_union":
                return true;
            default:
                return false;
        }
    }

    private boolean fxn(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str) || TextUtils.equals(str, "0") || TextUtils.isEmpty(str3)) {
            return false;
        }
        str2.hashCode();
        switch (str2) {
        }
        return false;
    }

    private JSONObject fxn(JSONObject jSONObject) {
        try {
            if (!jSONObject.has("adiff")) {
                jSONObject.put("adiff", this.fxn);
            }
            if (this.gff) {
                if (!jSONObject.has("interaction_method")) {
                    jSONObject.put("interaction_method", this.f9553sg);
                }
                if (!jSONObject.has("real_interaction_method")) {
                    jSONObject.put("real_interaction_method", this.tw);
                }
                if (!jSONObject.has("image_mode")) {
                    jSONObject.put("image_mode", this.jq);
                }
            }
            if (com.bytedance.sdk.openadsdk.ums.fxn.fxn("replace_log_extra_key", false)) {
                kg(jSONObject);
            }
            jSONObject.put("pangle_client_unique_id", "pangle-" + this.fxn + Constants.ACCEPT_TIME_SEPARATOR_SERVER + System.currentTimeMillis());
            return jSONObject;
        } catch (Throwable th) {
            dx.gff("AdEvent", th.getMessage() == null ? "error " : th.getMessage());
            return jSONObject;
        }
    }

    private void kg(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        for (String str : dgx.keySet()) {
            try {
                if (jSONObject.has(str)) {
                    Object opt = jSONObject.opt(str);
                    jSONObject.remove(str);
                    jSONObject.put(dgx.get(str), opt);
                }
            } catch (Throwable unused) {
            }
        }
    }

    public JSONObject gff() {
        if (this.mvp.get()) {
            return this.kg;
        }
        try {
            sg();
        } catch (Throwable th) {
            new Object[]{th};
        }
        if (this.kg.has("ad_extra_data")) {
            Object opt = this.kg.opt("ad_extra_data");
            if (opt != null) {
                try {
                    if (opt instanceof JSONObject) {
                        this.kg.put("ad_extra_data", fxn((JSONObject) opt).toString());
                    } else if (opt instanceof String) {
                        this.kg.put("ad_extra_data", fxn(new JSONObject((String) opt)).toString());
                    }
                } catch (JSONException e) {
                    dx.gff("AdEvent", "json error", e.getMessage());
                }
            }
            this.mvp.set(true);
            return this.kg;
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("adiff", this.fxn);
            if (this.gff) {
                jSONObject.put("interaction_method", this.f9553sg);
                jSONObject.put("real_interaction_method", this.tw);
                jSONObject.put("image_mode", this.jq);
            }
            this.kg.put("ad_extra_data", jSONObject.toString());
        } catch (JSONException e2) {
            dx.gff("AdEvent", "json error", e2.getMessage());
        }
        this.mvp.set(true);
        return this.kg;
        new Object[]{th};
        return this.kg;
    }

    public JSONObject fxn(boolean z) {
        JSONObject gff = gff();
        try {
            if (z) {
                JSONObject jSONObject = new JSONObject(gff.toString());
                JSONObject optJSONObject = jSONObject.optJSONObject("params");
                if (optJSONObject != null) {
                    optJSONObject.remove("app_log_url");
                }
                return jSONObject;
            }
            JSONObject jSONObject2 = new JSONObject(gff.toString());
            jSONObject2.remove("app_log_url");
            return jSONObject2;
        } catch (JSONException e) {
            dx.gff("AdEvent", e.getMessage());
            return gff;
        }
    }

    private void sg() throws JSONException {
        this.kg.putOpt("app_log_url", this.bx);
        this.kg.putOpt("tag", this.zu);
        this.kg.putOpt("label", this.ckl);
        this.kg.putOpt(SpeechConstant.ISE_CATEGORY, this.xdg);
        if (!TextUtils.isEmpty(this.rmu)) {
            try {
                this.kg.putOpt("value", Long.valueOf(Long.parseLong(this.rmu)));
            } catch (NumberFormatException unused) {
                this.kg.putOpt("value", 0L);
            }
        }
        if (!TextUtils.isEmpty(this.ud)) {
            try {
                this.kg.putOpt("ext_value", Long.valueOf(Long.parseLong(this.ud)));
            } catch (Exception unused2) {
            }
        }
        if (!TextUtils.isEmpty(this.iwp)) {
            this.kg.putOpt("log_extra", this.iwp);
        }
        if (!TextUtils.isEmpty(this.ums)) {
            try {
                this.kg.putOpt("ua_policy", Integer.valueOf(Integer.parseInt(this.ums)));
            } catch (NumberFormatException unused3) {
            }
        }
        fxn(this.kg, this.ckl);
        try {
            this.kg.putOpt(a.W, Integer.valueOf(this.jz));
        } catch (Exception unused4) {
        }
        Iterator<String> keys = this.rlu.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            this.kg.putOpt(next, this.rlu.opt(next));
        }
    }

    public String hm() {
        return this.fxn;
    }

    fxn(C0535fxn c0535fxn) {
        this.bh = "adiff";
        this.mvp = new AtomicBoolean(false);
        this.rlu = new JSONObject();
        if (TextUtils.isEmpty(c0535fxn.kg)) {
            this.fxn = uhw.fxn();
        } else {
            this.fxn = c0535fxn.kg;
        }
        this.dx = c0535fxn.ckl;
        this.iwp = c0535fxn.bh;
        this.zu = c0535fxn.gff;
        this.ckl = c0535fxn.hm;
        if (TextUtils.isEmpty(c0535fxn.rb)) {
            this.xdg = "app_union";
        } else {
            this.xdg = c0535fxn.rb;
        }
        this.ums = c0535fxn.dgx;
        this.rmu = c0535fxn.tw;
        this.ud = c0535fxn.jq;
        this.je = c0535fxn.f9555sg;
        this.jz = c0535fxn.mvp;
        this.bx = c0535fxn.rlu;
        this.rlu = c0535fxn.hie = c0535fxn.hie != null ? c0535fxn.hie : new JSONObject();
        JSONObject jSONObject = new JSONObject();
        this.kg = jSONObject;
        if (!TextUtils.isEmpty(c0535fxn.rlu)) {
            try {
                jSONObject.put("app_log_url", c0535fxn.rlu);
            } catch (JSONException e) {
                dx.gff("AdEvent", e.getMessage());
            }
        }
        this.f9553sg = c0535fxn.rmu;
        this.tw = c0535fxn.je;
        this.jq = c0535fxn.fxn;
        this.gff = c0535fxn.ud;
        this.rb = System.currentTimeMillis();
        bh();
    }

    @Override // com.bytedance.sdk.component.bh.fxn.hm.fxn.kg
    public JSONObject fxn(String str) {
        return gff();
    }

    @Override // com.bytedance.sdk.component.bh.fxn.hm.fxn.kg
    public long fxn() {
        return this.rb;
    }

    @Override // com.bytedance.sdk.component.bh.fxn.hm.fxn.kg
    public long kg() {
        return this.hm;
    }

    /* renamed from: com.bytedance.sdk.openadsdk.hm.fxn$fxn, reason: collision with other inner class name */
    public static final class C0535fxn {
        private String bh;
        private com.bytedance.sdk.openadsdk.hm.kg.fxn ckl;
        private String dgx;
        private String dx;
        public int fxn;
        private String gff;
        private JSONObject hie;
        private String hm;
        private int je;
        private String jq;
        private String kg;
        private final int mvp;
        private String rb;
        private String rlu;
        private int rmu;

        /* renamed from: sg, reason: collision with root package name */
        private String f9555sg;
        private String tw;
        private boolean ud;
        private final long xdg;
        private com.bytedance.sdk.openadsdk.hm.kg.kg zu;

        public C0535fxn(long j, jz jzVar) {
            this.rmu = -1;
            this.je = -1;
            this.fxn = -1;
            if (jzVar != null) {
                this.ud = ggo.kg(jzVar);
                this.rmu = jzVar.ln();
                this.je = jzVar.fe();
                this.fxn = jzVar.pfi();
            }
            this.xdg = j;
            this.mvp = com.bytedance.sdk.component.utils.je.gff(com.bytedance.sdk.openadsdk.core.rmu.fxn());
        }

        public C0535fxn fxn(String str) {
            this.rlu = str;
            return this;
        }

        public C0535fxn kg(String str) {
            this.gff = str;
            return this;
        }

        public C0535fxn gff(String str) {
            this.hm = str;
            return this;
        }

        public C0535fxn hm(String str) {
            this.rb = str;
            return this;
        }

        public C0535fxn rb(String str) {
            this.tw = str;
            return this;
        }

        public C0535fxn bh(String str) {
            this.jq = str;
            return this;
        }

        public C0535fxn fxn(JSONObject jSONObject) {
            if (jSONObject == null) {
                return this;
            }
            this.hie = jSONObject;
            return this;
        }

        public C0535fxn sg(String str) {
            this.f9555sg = str;
            return this;
        }

        public void fxn(com.bytedance.sdk.openadsdk.hm.kg.fxn fxnVar) {
            com.bytedance.sdk.openadsdk.bh.kg.fxn().fxn(this.hm, this.dx, this.f9555sg, this.gff);
            this.ckl = fxnVar;
            final fxn fxnVar2 = new fxn(this);
            try {
                com.bytedance.sdk.openadsdk.hm.kg.kg kgVar = this.zu;
                if (kgVar != null) {
                    kgVar.fxn(fxnVar2.kg, this.xdg);
                } else {
                    new com.bytedance.sdk.openadsdk.hm.kg.gff().fxn(fxnVar2.kg, this.xdg);
                }
            } catch (Throwable th) {
                new Object[]{th};
            }
            if (com.bytedance.sdk.openadsdk.multipro.kg.gff()) {
                yws.gff(new com.bytedance.sdk.component.tw.tw("dispatchEvent") { // from class: com.bytedance.sdk.openadsdk.hm.fxn.fxn.1
                    @Override // java.lang.Runnable
                    public void run() {
                        com.bytedance.sdk.openadsdk.hm.fxn.hm.fxn(fxnVar2);
                    }
                });
            } else {
                com.bytedance.sdk.openadsdk.hm.fxn.hm.fxn(fxnVar2);
            }
        }

        public C0535fxn tw(String str) {
            this.dx = str;
            return this;
        }
    }

    public boolean rb() {
        Set<String> dgx2;
        if (this.kg == null || (dgx2 = com.bytedance.sdk.openadsdk.core.rmu.hm().dgx()) == null) {
            return false;
        }
        String optString = this.kg.optString("label");
        if (TextUtils.isEmpty(optString)) {
            if (TextUtils.isEmpty(this.ckl)) {
                return false;
            }
            return dgx2.contains(this.ckl);
        }
        return dgx2.contains(optString);
    }

    private static void fxn(JSONObject jSONObject, String str) {
        try {
            Set<String> set = hie;
            if (!set.contains(str) && !set.contains(jSONObject.get("label"))) {
                jSONObject.putOpt("is_ad_event", "1");
            }
        } catch (Throwable th) {
            dx.gff("AdEvent", th);
        }
    }
}
