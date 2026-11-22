package com.tencent.open.b;

import android.os.Bundle;
import java.io.Serializable;
import java.util.HashMap;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* compiled from: ProGuard */
/* loaded from: classes2.dex */
public class c implements Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap<String, String> f13635a;

    public c(Bundle bundle) {
        this.f13635a = new HashMap<>();
        if (bundle != null) {
            for (String str : bundle.keySet()) {
                this.f13635a.put(str, bundle.getString(str));
            }
        }
    }

    public c(HashMap<String, String> hashMap) {
        this.f13635a = new HashMap<>(hashMap);
    }

    public String toString() {
        return "BaseData{time=" + this.f13635a.get("time") + ", name=" + this.f13635a.get("interface_name") + AbstractJsonLexerKt.END_OBJ;
    }
}
