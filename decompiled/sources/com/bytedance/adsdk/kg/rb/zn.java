package com.bytedance.adsdk.kg.rb;

import android.graphics.PointF;
import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

/* loaded from: classes13.dex */
public class zn implements ei<PointF> {
    public static final zn fxn = new zn();

    private zn() {
    }

    @Override // com.bytedance.adsdk.kg.rb.ei
    /* renamed from: fxn, reason: merged with bridge method [inline-methods] */
    public PointF kg(JsonReader jsonReader, float f) throws IOException {
        JsonToken peek = jsonReader.peek();
        if (peek == JsonToken.BEGIN_ARRAY) {
            return ud.kg(jsonReader, f);
        }
        if (peek == JsonToken.BEGIN_OBJECT) {
            return ud.kg(jsonReader, f);
        }
        if (peek == JsonToken.NUMBER) {
            PointF pointF = new PointF(((float) jsonReader.nextDouble()) * f, ((float) jsonReader.nextDouble()) * f);
            while (jsonReader.hasNext()) {
                jsonReader.skipValue();
            }
            return pointF;
        }
        throw new IllegalArgumentException("Cannot convert json to point. Next token is ".concat(String.valueOf(peek)));
    }
}
