package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreapi.internal.data.Converter;
import java.nio.charset.Charset;
import java.util.Map;
import kotlin.text.Charsets;

/* renamed from: io.appmetrica.analytics.impl.xe, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3672xe implements Converter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3191e6[] fromModel(Map<String, String> map) {
        int size = map.size();
        C3191e6[] c3191e6Arr = new C3191e6[size];
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            c3191e6Arr[i2] = new C3191e6();
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            C3191e6 c3191e6 = c3191e6Arr[i];
            String key = entry.getKey();
            Charset charset = Charsets.UTF_8;
            c3191e6.f18250a = key.getBytes(charset);
            c3191e6Arr[i].b = entry.getValue().getBytes(charset);
            i++;
        }
        return c3191e6Arr;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    public final Object toModel(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final Map<String, String> a(C3191e6[] c3191e6Arr) {
        throw new UnsupportedOperationException();
    }
}
