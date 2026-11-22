package com.bytedance.adsdk.kg.rb;

import android.util.JsonReader;
import java.io.IOException;

/* loaded from: classes13.dex */
public class je implements ei<Integer> {
    public static final je fxn = new je();

    private je() {
    }

    @Override // com.bytedance.adsdk.kg.rb.ei
    /* renamed from: fxn, reason: merged with bridge method [inline-methods] */
    public Integer kg(JsonReader jsonReader, float f) throws IOException {
        return Integer.valueOf(Math.round(ud.kg(jsonReader) * f));
    }
}
