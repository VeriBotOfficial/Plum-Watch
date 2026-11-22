package com.amap.api.col.p0003sl;

import android.content.Context;
import com.autonavi.aps.amapapi.utils.CoreUtil;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: AbstractBasicLbsRestHandler.java */
/* loaded from: classes11.dex */
public abstract class s8<T, V> extends r8<T, V> {
    public s8(Context context, T t) {
        super(context, t);
    }

    @Override // com.amap.api.col.p0003sl.r8
    protected V e() {
        return null;
    }

    protected abstract String f();

    @Override // com.amap.api.col.p0003sl.ob
    public byte[] getEntityBytes() {
        try {
            return f().getBytes("utf-8");
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    @Override // com.amap.api.col.p0003sl.z3, com.amap.api.col.p0003sl.ob
    public Map<String, String> getParams() {
        return null;
    }

    @Override // com.amap.api.col.p0003sl.r8, com.amap.api.col.p0003sl.ob
    public Map<String, String> getRequestHead() {
        HashMap hashMap = new HashMap(16);
        hashMap.put("Content-Type", " application/json");
        hashMap.put("Accept-Encoding", "gzip");
        hashMap.put("User-Agent", "AMAP SDK Android Trace 11.1.260");
        hashMap.put("x-INFO", c9.a(this.f1857q));
        hashMap.put("platinfo", String.format(Locale.US, "platform=Android&sdkversion=%s&product=%s", CoreUtil.STR_CONFIG_VERSION, "trace"));
        hashMap.put("logversion", "2.1");
        return hashMap;
    }
}
