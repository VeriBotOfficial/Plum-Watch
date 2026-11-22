package io.appmetrica.analytics.impl;

import android.text.TextUtils;
import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import org.json.JSONObject;

/* loaded from: classes6.dex */
public final class Pe implements ProtobufConverter {

    /* renamed from: a, reason: collision with root package name */
    public final C3200ef f18012a;

    public Pe() {
        this(new C3200ef());
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final C3125bf fromModel(Re re) {
        C3125bf c3125bf = new C3125bf();
        if (!TextUtils.isEmpty(re.f18048a)) {
            c3125bf.f18199a = re.f18048a;
        }
        c3125bf.b = re.b.toString();
        c3125bf.c = this.f18012a.fromModel(re.c).intValue();
        return c3125bf;
    }

    public Pe(C3200ef c3200ef) {
        this.f18012a = c3200ef;
    }

    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final Re toModel(C3125bf c3125bf) {
        JSONObject jSONObject;
        String str = c3125bf.f18199a;
        String str2 = c3125bf.b;
        if (!TextUtils.isEmpty(str2)) {
            try {
                jSONObject = new JSONObject(str2);
            } catch (Throwable unused) {
            }
            return new Re(str, jSONObject, this.f18012a.toModel(Integer.valueOf(c3125bf.c)));
        }
        jSONObject = new JSONObject();
        return new Re(str, jSONObject, this.f18012a.toModel(Integer.valueOf(c3125bf.c)));
    }
}
