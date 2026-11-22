package com.bytedance.adsdk.kg.rb;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

/* loaded from: classes13.dex */
class ke {
    static com.bytedance.adsdk.kg.fxn.kg.jq fxn(JsonReader jsonReader, com.bytedance.adsdk.kg.sg sgVar) throws IOException {
        return new com.bytedance.adsdk.kg.fxn.kg.jq(sgVar, dx.fxn(jsonReader, sgVar, com.bytedance.adsdk.kg.bh.bh.fxn(), mve.fxn, jsonReader.peek() == JsonToken.BEGIN_OBJECT, false));
    }
}
