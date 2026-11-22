package com.bykv.vk.openvk.fxn.fxn.kg;

import com.anythink.expressad.foundation.g.a.f;
import com.bykv.vk.openvk.fxn.fxn.fxn.fxn.kg;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class fxn {
    public static int fxn = 10;
    public static int gff = 10;
    public static int hm = 10;
    public static int kg = 10;
    private static kg rb;

    public static void fxn(JSONObject jSONObject) {
        if (jSONObject == null) {
            return;
        }
        try {
            fxn = jSONObject.optInt(f.f, 10);
            kg = jSONObject.optInt("reward", 10);
            gff = jSONObject.optInt("brand", 10);
            int optInt = jSONObject.optInt("other", 10);
            hm = optInt;
            if (fxn < 0) {
                fxn = 10;
            }
            if (kg < 0) {
                kg = 10;
            }
            if (gff < 0) {
                gff = 10;
            }
            if (optInt < 0) {
                hm = 10;
            }
            new Object[]{"splash=", Integer.valueOf(fxn), ",reward=", Integer.valueOf(kg), ",brand=", Integer.valueOf(gff), ",other=", Integer.valueOf(hm)};
        } catch (Throwable th) {
            th.getMessage();
        }
    }

    public static void fxn(kg kgVar) {
        rb = kgVar;
    }

    public static void fxn() {
        kg kgVar = rb;
        if (kgVar != null) {
            kgVar.hm();
        }
    }

    public static int kg() {
        return fxn;
    }

    public static int gff() {
        return kg;
    }

    public static int hm() {
        return gff;
    }

    public static int rb() {
        return hm;
    }
}
