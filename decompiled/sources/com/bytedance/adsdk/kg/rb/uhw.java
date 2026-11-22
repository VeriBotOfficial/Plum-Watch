package com.bytedance.adsdk.kg.rb;

import android.util.JsonReader;
import com.bytedance.adsdk.kg.gff.kg.jq;
import java.io.IOException;

/* loaded from: classes13.dex */
class uhw {
    static com.bytedance.adsdk.kg.gff.kg.jq fxn(JsonReader jsonReader) throws IOException {
        String str = null;
        jq.fxn fxnVar = null;
        boolean z = false;
        while (jsonReader.hasNext()) {
            String nextName = jsonReader.nextName();
            nextName.hashCode();
            switch (nextName) {
                case "hd":
                    z = jsonReader.nextBoolean();
                    break;
                case "mm":
                    fxnVar = jq.fxn.fxn(jsonReader.nextInt());
                    break;
                case "nm":
                    str = jsonReader.nextString();
                    break;
                default:
                    jsonReader.skipValue();
                    break;
            }
        }
        return new com.bytedance.adsdk.kg.gff.kg.jq(str, fxnVar, z);
    }
}
