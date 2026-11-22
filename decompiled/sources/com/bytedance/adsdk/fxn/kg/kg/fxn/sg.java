package com.bytedance.adsdk.fxn.kg.kg.fxn;

import io.livekit.android.room.util.MediaConstraintKeys;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.json.JSONObject;

/* loaded from: classes13.dex */
public class sg implements com.bytedance.adsdk.fxn.kg.kg.fxn {
    private final Object fxn;

    public sg(String str) {
        if (str.equalsIgnoreCase(MediaConstraintKeys.TRUE)) {
            this.fxn = Boolean.TRUE;
        } else if (str.equalsIgnoreCase("false")) {
            this.fxn = Boolean.FALSE;
        } else {
            if (str.equalsIgnoreCase(AbstractJsonLexerKt.NULL)) {
                this.fxn = null;
                return;
            }
            throw new IllegalArgumentException();
        }
    }

    @Override // com.bytedance.adsdk.fxn.kg.kg.fxn
    public Object fxn(Map<String, JSONObject> map) {
        return this.fxn;
    }

    @Override // com.bytedance.adsdk.fxn.kg.kg.fxn
    public com.bytedance.adsdk.fxn.kg.hm.rb fxn() {
        return com.bytedance.adsdk.fxn.kg.hm.bh.CONSTANT;
    }

    public String toString() {
        return "KeywordNode [keywordValue=" + this.fxn + "]";
    }

    @Override // com.bytedance.adsdk.fxn.kg.kg.fxn
    public String kg() {
        Object obj = this.fxn;
        if (obj != null) {
            return obj.toString();
        }
        return "NULL";
    }
}
