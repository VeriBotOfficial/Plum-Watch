package com.bytedance.sdk.component.fxn;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import com.autonavi.aps.amapapi.config.Const;
import com.bytedance.sdk.component.fxn.bh;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public abstract class fxn {
    protected Context fxn;
    protected sg gff;
    protected dgx kg;
    protected String rb;

    /* renamed from: sg, reason: collision with root package name */
    bh f9363sg;
    protected Handler hm = new Handler(Looper.getMainLooper());
    protected volatile boolean bh = false;
    private final Map<String, bh> tw = new HashMap();

    protected abstract Context fxn(jq jqVar);

    protected abstract String fxn();

    protected abstract void fxn(String str);

    protected abstract void kg(jq jqVar);

    protected fxn() {
    }

    protected void invokeMethod(final String str) {
        if (this.bh) {
            return;
        }
        this.hm.post(new Runnable() { // from class: com.bytedance.sdk.component.fxn.fxn.1
            @Override // java.lang.Runnable
            public void run() {
                zu zuVar;
                if (fxn.this.bh) {
                    return;
                }
                try {
                    zuVar = fxn.this.fxn(new JSONObject(str));
                } catch (Exception unused) {
                    zuVar = null;
                }
                if (zu.fxn(zuVar)) {
                    new StringBuilder("By pass invalid call: ").append(zuVar);
                    if (zuVar != null) {
                        fxn.this.kg(ud.fxn(new xdg(zuVar.fxn, "Failed to parse invocation.")), zuVar);
                        return;
                    }
                    return;
                }
                fxn.this.fxn(zuVar);
            }
        });
    }

    protected void fxn(String str, zu zuVar) {
        fxn(str);
    }

    protected void kg() {
        this.f9363sg.fxn();
        Iterator<bh> it = this.tw.values().iterator();
        while (it.hasNext()) {
            it.next().fxn();
        }
        this.hm.removeCallbacksAndMessages(null);
        this.bh = true;
    }

    protected final void fxn(zu zuVar) {
        String fxn;
        if (this.bh || (fxn = fxn()) == null) {
            return;
        }
        bh kg = kg(zuVar.f9365sg);
        if (kg == null) {
            new StringBuilder("Received call with unknown namespace, ").append(zuVar);
            if (this.kg != null) {
                fxn();
            }
            kg(ud.fxn(new xdg(-4, "Namespace " + zuVar.f9365sg + " unknown.")), zuVar);
            return;
        }
        rb rbVar = new rb();
        rbVar.kg = fxn;
        rbVar.fxn = this.fxn;
        rbVar.gff = kg;
        try {
            bh.fxn fxn2 = kg.fxn(zuVar, rbVar);
            if (fxn2 == null) {
                new StringBuilder("Received call but not registered, ").append(zuVar);
                if (this.kg != null) {
                    fxn();
                }
                kg(ud.fxn(new xdg(-2, "Function " + zuVar.hm + " is not registered.")), zuVar);
                return;
            }
            if (fxn2.fxn) {
                kg(fxn2.kg, zuVar);
            }
            if (this.kg != null) {
                fxn();
            }
        } catch (Exception e) {
            new StringBuilder("call finished with error, ").append(zuVar);
            kg(ud.fxn(e), zuVar);
        }
    }

    final void gff(jq jqVar) {
        this.fxn = fxn(jqVar);
        this.gff = jqVar.hm;
        this.kg = jqVar.tw;
        this.f9363sg = new bh(jqVar, this);
        this.rb = jqVar.hie;
        kg(jqVar);
    }

    final void kg(String str, zu zuVar) {
        JSONObject jSONObject;
        if (this.bh || TextUtils.isEmpty(zuVar.bh)) {
            return;
        }
        if (!str.startsWith(Const.STR_MART_JSON_BEGIN) || !str.endsWith("}")) {
            tw.fxn(new IllegalArgumentException("Illegal callback data: ".concat(String.valueOf(str))));
        }
        String str2 = zuVar.bh;
        try {
            jSONObject = new JSONObject(str);
        } catch (Exception unused) {
            jSONObject = new JSONObject();
        }
        fxn(rlu.fxn().fxn("__msg_type", "callback").fxn("__callback_id", zuVar.bh).fxn("__params", jSONObject).kg(), zuVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public zu fxn(JSONObject jSONObject) {
        String optString;
        Object opt;
        if (this.bh) {
            return null;
        }
        String optString2 = jSONObject.optString("__callback_id");
        String optString3 = jSONObject.optString("func");
        if (fxn() == null) {
            return null;
        }
        try {
            String string = jSONObject.getString("__msg_type");
            String str = "";
            try {
                opt = jSONObject.opt("params");
            } catch (Throwable unused) {
                optString = jSONObject.optString("params");
            }
            if (opt != null) {
                if (opt instanceof JSONObject) {
                    optString = String.valueOf((JSONObject) opt);
                    String string2 = jSONObject.getString("JSSDK");
                    String optString4 = jSONObject.optString("namespace");
                    return zu.fxn().fxn(string2).kg(string).gff(optString3).hm(optString).rb(optString2).bh(optString4).sg(jSONObject.optString("__iframe_url")).fxn();
                }
                if (opt instanceof String) {
                    str = (String) opt;
                } else {
                    str = String.valueOf(opt);
                }
            }
            optString = str;
            String string22 = jSONObject.getString("JSSDK");
            String optString42 = jSONObject.optString("namespace");
            return zu.fxn().fxn(string22).kg(string).gff(optString3).hm(optString).rb(optString2).bh(optString42).sg(jSONObject.optString("__iframe_url")).fxn();
        } catch (JSONException unused2) {
            return zu.fxn(optString2, -1);
        }
    }

    private bh kg(String str) {
        if (TextUtils.equals(str, this.rb) || TextUtils.isEmpty(str)) {
            return this.f9363sg;
        }
        return this.tw.get(str);
    }
}
