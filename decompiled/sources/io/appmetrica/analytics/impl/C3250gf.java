package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.gf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C3250gf implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final C3200ef f18293a = new C3200ef();

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3100af fromModel(C3225ff c3225ff) {
        C3100af c3100af = new C3100af();
        if (!TextUtils.isEmpty(c3225ff.f18273a)) {
            c3100af.f18183a = c3225ff.f18273a;
        }
        c3100af.b = c3225ff.b.toString();
        c3100af.c = c3225ff.c;
        c3100af.d = c3225ff.d;
        c3100af.e = this.f18293a.fromModel(c3225ff.e).intValue();
        return c3100af;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3225ff toModel(C3100af c3100af) {
        JSONObject jSONObject;
        String str = c3100af.f18183a;
        String str2 = c3100af.b;
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject = new JSONObject(str2);
            } catch (Throwable unused) {
            }
            return new C3225ff(str, jSONObject, c3100af.c, c3100af.d, this.f18293a.toModel(Integer.valueOf(c3100af.e)));
        }
        jSONObject = new JSONObject();
        return new C3225ff(str, jSONObject, c3100af.c, c3100af.d, this.f18293a.toModel(Integer.valueOf(c3100af.e)));
    }
}
