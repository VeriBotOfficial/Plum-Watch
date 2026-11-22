package com.bytedance.sdk.component.sg.kg;

import android.text.TextUtils;
import com.bytedance.sdk.component.kg.fxn.dgx;
import com.bytedance.sdk.component.kg.fxn.mvp;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes13.dex */
public abstract class gff {
    int bh;
    protected dgx gff;
    String rb;
    protected String hm = null;

    /* renamed from: sg, reason: collision with root package name */
    protected final Map<String, String> f9397sg = new HashMap();
    protected String tw = null;
    protected boolean jq = false;

    public void fxn(String str) {
        this.rb = str;
    }

    public void fxn(int i) {
        this.bh = i;
    }

    public gff(dgx dgxVar) {
        this.gff = dgxVar;
        try {
            gff(UUID.randomUUID().toString());
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public void kg(String str) {
        this.tw = str;
    }

    public void kg(String str, String str2) {
        this.f9397sg.put(str, str2);
    }

    public void hm(Map<String, String> map) {
        if (map != null) {
            for (Map.Entry<String, String> entry : map.entrySet()) {
                this.f9397sg.put(entry.getKey(), entry.getValue());
            }
        }
    }

    public void gff(String str) {
        this.hm = str;
    }

    public String gff() {
        return this.hm;
    }

    public void kg() {
        dgx dgxVar;
        if (this.hm == null || (dgxVar = this.gff) == null) {
            return;
        }
        com.bytedance.sdk.component.kg.fxn.hm fxn = dgxVar.fxn();
        synchronized (fxn) {
            for (com.bytedance.sdk.component.kg.fxn.kg kgVar : fxn.gff()) {
                if (this.hm.equals(kgVar.fxn().fxn())) {
                    kgVar.gff();
                }
            }
            for (com.bytedance.sdk.component.kg.fxn.kg kgVar2 : fxn.hm()) {
                if (this.hm.equals(kgVar2.fxn().fxn())) {
                    kgVar2.gff();
                }
            }
        }
    }

    protected void fxn(mvp.fxn fxnVar) {
        if (fxnVar != null && this.f9397sg.size() > 0) {
            for (Map.Entry<String, String> entry : this.f9397sg.entrySet()) {
                String key = entry.getKey();
                if (!TextUtils.isEmpty(key)) {
                    String value = entry.getValue();
                    if (value == null) {
                        value = "";
                    }
                    fxnVar.kg(key, value);
                }
            }
        }
    }

    public String hm() {
        return this.tw;
    }
}
