package com.anythink.core.common.h;

import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class o extends av {

    /* renamed from: a, reason: collision with root package name */
    public int f3923a;
    public bu b;
    public long c;

    @Override // com.anythink.core.common.h.av
    public final JSONObject a() {
        JSONObject O = this.b.O(this.f3923a);
        if (O != null) {
            try {
                O.put("sdk_time", this.c);
                return O;
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        return O;
    }
}
