package com.mbridge.msdk.foundation.entity;

import android.text.TextUtils;
import com.mbridge.msdk.foundation.tools.o0;
import com.mbridge.msdk.system.NoProGuard;
import java.io.Serializable;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public class AabEntity implements Serializable, NoProGuard {
    private static final String TAG = "AabEntity";
    public int h3c;
    public int hlp;

    public static AabEntity parser(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            AabEntity aabEntity = new AabEntity();
            if (jSONObject.has("hlp")) {
                aabEntity.setHlp(jSONObject.optInt("hlp"));
            }
            if (jSONObject.has(com.anythink.expressad.foundation.g.g.a.b.aw)) {
                aabEntity.setH3c(jSONObject.optInt(com.anythink.expressad.foundation.g.g.a.b.aw));
            }
            return aabEntity;
        } catch (Throwable th) {
            o0.b(TAG, th.getMessage());
            return null;
        }
    }

    public int getH3c() {
        return this.h3c;
    }

    public int getHlp() {
        return this.hlp;
    }

    public void setH3c(int i) {
        this.h3c = i;
    }

    public void setHlp(int i) {
        this.hlp = i;
    }

    public JSONObject toJson() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("hlp", this.hlp);
            jSONObject.put(com.anythink.expressad.foundation.g.g.a.b.aw, this.h3c);
            return jSONObject;
        } catch (JSONException e) {
            o0.b(TAG, e.getMessage());
            return jSONObject;
        }
    }
}
