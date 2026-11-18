package com.bytedance.sdk.openadsdk.hm.fxn;

import com.phancy.mini.core.api.ApiError;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes11.dex */
public class kg {
    public int hm;
    public AtomicInteger fxn = new AtomicInteger(0);
    public AtomicInteger kg = new AtomicInteger(0);
    public AtomicLong gff = new AtomicLong(0);
    public AtomicInteger rb = new AtomicInteger(0);
    public Map<Integer, Integer> bh = new HashMap();

    /* JADX INFO: renamed from: sg, reason: collision with root package name */
    public AtomicBoolean f9556sg = new AtomicBoolean(false);

    public kg(int r5) {
        this.hm = r5;
    }

    JSONObject fxn() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("success", this.fxn.get());
            jSONObject.put(ApiError.ERROR_MSG_FAIL, this.kg.get());
            jSONObject.put("type", this.hm);
            jSONObject.put("duration", this.gff.get() / ((long) this.fxn.get()));
            JSONObject jSONObject2 = new JSONObject();
            if (this.bh.size() > 0) {
                for (Map.Entry<Integer, Integer> entry : this.bh.entrySet()) {
                    jSONObject2.put(String.valueOf(entry.getKey()), entry.getValue());
                }
            }
            jSONObject.put("fail_error_code", jSONObject2);
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }

    JSONObject kg() {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("success", this.fxn.get());
            jSONObject.put(ApiError.ERROR_MSG_FAIL, this.kg.get());
            jSONObject.put("type", this.hm);
            jSONObject.put("time", this.rb.get());
            return jSONObject;
        } catch (Exception unused) {
            return null;
        }
    }
}
