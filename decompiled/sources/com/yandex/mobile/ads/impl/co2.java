package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.lo2;
import java.util.HashSet;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public abstract class co2 extends lo2 {
    protected final HashSet<String> c;
    protected final JSONObject d;
    protected final long e;

    public co2(lo2.b bVar, HashSet<String> hashSet, JSONObject jSONObject, long j) {
        super(bVar);
        this.c = new HashSet<>(hashSet);
        this.d = jSONObject;
        this.e = j;
    }
}
