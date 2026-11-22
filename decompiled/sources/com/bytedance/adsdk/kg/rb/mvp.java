package com.bytedance.adsdk.kg.rb;

import android.util.JsonReader;
import java.io.IOException;

/* loaded from: classes13.dex */
public class mvp implements ei<Float> {
    public static final mvp fxn = new mvp();

    private mvp() {
    }

    @Override // com.bytedance.adsdk.kg.rb.ei
    /* renamed from: fxn, reason: merged with bridge method [inline-methods] */
    public Float kg(JsonReader jsonReader, float f) throws IOException {
        return Float.valueOf(ud.kg(jsonReader) * f);
    }
}
