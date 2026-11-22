package com.bytedance.sdk.openadsdk.core.model;

import com.bytedance.sdk.openadsdk.AdSlot;
import io.nats.client.support.ApiConstants;
import java.util.ArrayList;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes14.dex */
public class gff {
    public String bh;
    public String fxn;
    public int gff = 1;
    public ArrayList<Integer> hm;
    public int kg;
    public AdSlot rb;

    /* renamed from: sg, reason: collision with root package name */
    public int f9497sg;

    public String fxn() {
        return this.fxn;
    }

    public void fxn(String str) {
        this.fxn = str;
    }

    public int kg() {
        return this.kg;
    }

    public void fxn(int i) {
        this.kg = i;
    }

    public int gff() {
        return this.gff;
    }

    public void kg(int i) {
        this.gff = i;
    }

    public AdSlot hm() {
        return this.rb;
    }

    public void fxn(AdSlot adSlot) {
        this.rb = adSlot;
    }

    public ArrayList<Integer> rb() {
        return this.hm;
    }

    public void fxn(ArrayList<Integer> arrayList) {
        this.hm = arrayList;
    }

    public void kg(String str) {
        this.bh = str;
    }

    public void gff(int i) {
        this.f9497sg = i;
    }

    public static void fxn(gff gffVar) {
        int kg;
        if (gffVar == null || gffVar.hm() == null || (kg = gffVar.kg()) >= 0 || kg == -8) {
            return;
        }
        com.bytedance.sdk.openadsdk.ckl.gff.fxn();
        com.bytedance.sdk.openadsdk.ckl.gff.fxn("rd_client_custom_error", false, new com.bytedance.sdk.openadsdk.ckl.kg() { // from class: com.bytedance.sdk.openadsdk.core.model.gff.1
            @Override // com.bytedance.sdk.openadsdk.ckl.kg
            public com.bytedance.sdk.openadsdk.ckl.fxn.gff getLogStats() throws Exception {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("from", gff.this.gff());
                jSONObject.put(ApiConstants.ERR_CODE, gff.this.kg());
                jSONObject.put("err_msg", gff.this.bh);
                jSONObject.put("ext_from", gff.this.f9497sg);
                jSONObject.put("server_res_str", gff.this.fxn());
                if (gff.this.rb() != null && gff.this.rb().size() > 0) {
                    jSONObject.put("mate_unavailable_code_list", new JSONArray((Collection) gff.this.rb()).toString());
                }
                new Object[]{"rd_client_custom_error = ", jSONObject};
                return com.bytedance.sdk.openadsdk.ckl.fxn.hm.kg().fxn("rd_client_custom_error").fxn(gff.this.hm().getDurationSlotType()).kg(jSONObject.toString());
            }
        });
    }
}
