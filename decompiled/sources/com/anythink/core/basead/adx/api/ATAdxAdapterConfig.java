package com.anythink.core.basead.adx.api;

import android.text.TextUtils;
import com.anythink.core.d.h;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public class ATAdxAdapterConfig {
    public static final int RULE_TYPE_GROUP = 1;
    public static final int RULE_TYPE_NORMAL = 2;
    boolean isDefault;
    h mAdapterStrategy;
    JSONObject mOriginJSONObject;

    private ATAdxAdapterConfig(h hVar, JSONObject jSONObject) {
        this.mAdapterStrategy = hVar;
        this.mOriginJSONObject = jSONObject;
    }

    private ATAdxAdapterConfig(boolean z) {
        this.isDefault = z;
    }

    public int getRuleType() {
        h hVar = this.mAdapterStrategy;
        if (hVar != null) {
            return hVar.a();
        }
        return 1;
    }

    public int getGroupCount() {
        h.a b;
        h hVar = this.mAdapterStrategy;
        if (hVar == null || (b = hVar.b()) == null) {
            return 3;
        }
        return b.f4514a;
    }

    public int getValuedTimes() {
        h.a b;
        h hVar = this.mAdapterStrategy;
        if (hVar == null || (b = hVar.b()) == null) {
            return 3;
        }
        return b.b;
    }

    public int getCoolingTimes() {
        h.a b;
        h hVar = this.mAdapterStrategy;
        if (hVar == null || (b = hVar.b()) == null) {
            return 5;
        }
        return b.c;
    }

    public JSONObject getOriginJSONObject() {
        return this.mOriginJSONObject;
    }

    public boolean isDefault() {
        return this.isDefault;
    }

    public boolean isExpired() {
        h hVar = this.mAdapterStrategy;
        if (hVar != null) {
            return hVar.c();
        }
        return true;
    }

    public static ATAdxAdapterConfig parse(JSONObject jSONObject) {
        h a2 = h.a(jSONObject);
        if (a2 != null) {
            return new ATAdxAdapterConfig(a2, jSONObject);
        }
        return new ATAdxAdapterConfig(true);
    }

    public static ATAdxAdapterConfig parse(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return parse(new JSONObject(str));
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    public String toString() {
        return "ATAdxAdapterConfig{isDefault=" + isDefault() + ", isExpired=" + isExpired() + ", getRuleType=" + getRuleType() + ", getGroupCount=" + getGroupCount() + ", getValuedTimes=" + getValuedTimes() + ", getCoolingTimes=" + getCoolingTimes() + ", getOriginJSONObject=" + this.mOriginJSONObject + AbstractJsonLexerKt.END_OBJ;
    }
}
