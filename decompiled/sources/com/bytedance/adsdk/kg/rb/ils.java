package com.bytedance.adsdk.kg.rb;

import android.util.JsonReader;
import android.util.JsonToken;
import java.io.IOException;

/* loaded from: classes13.dex */
public class ils implements ei<com.bytedance.adsdk.kg.sg.gff> {
    public static final ils fxn = new ils();

    private ils() {
    }

    @Override // com.bytedance.adsdk.kg.rb.ei
    /* renamed from: fxn, reason: merged with bridge method [inline-methods] */
    public com.bytedance.adsdk.kg.sg.gff kg(JsonReader jsonReader, float f) throws IOException {
        boolean z = jsonReader.peek() == JsonToken.BEGIN_ARRAY;
        if (z) {
            jsonReader.beginArray();
        }
        float nextDouble = (float) jsonReader.nextDouble();
        float nextDouble2 = (float) jsonReader.nextDouble();
        while (jsonReader.hasNext()) {
            jsonReader.skipValue();
        }
        if (z) {
            jsonReader.endArray();
        }
        return new com.bytedance.adsdk.kg.sg.gff((nextDouble / 100.0f) * f, (nextDouble2 / 100.0f) * f);
    }
}
