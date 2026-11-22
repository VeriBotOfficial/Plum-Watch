package com.xiaomi.push;

import android.text.TextUtils;
import java.nio.charset.StandardCharsets;
import java.util.Iterator;
import java.util.LinkedHashMap;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public class bh extends JSONObject implements bf {

    /* renamed from: a, reason: collision with root package name */
    private static final int f14455a = "{}".length();
    private static final int b = "\"\":".length();

    /* renamed from: a, reason: collision with other field name */
    private final LinkedHashMap<String, Integer> f225a = new LinkedHashMap<>();

    @Override // com.xiaomi.push.bf
    public int a() {
        int i = f14455a;
        Iterator<Integer> it = this.f225a.values().iterator();
        while (it.hasNext()) {
            i += it.next().intValue();
        }
        return i + (length() - 1);
    }

    @Override // org.json.JSONObject
    public JSONObject put(String str, int i) {
        if (!TextUtils.isEmpty(str)) {
            this.f225a.put(str, Integer.valueOf(str.length() + String.valueOf(i).length() + b));
        }
        return super.put(str, i);
    }

    @Override // org.json.JSONObject
    public JSONObject put(String str, long j) {
        if (!TextUtils.isEmpty(str)) {
            this.f225a.put(str, Integer.valueOf(str.length() + String.valueOf(j).length() + b));
        }
        return super.put(str, j);
    }

    @Override // org.json.JSONObject
    public JSONObject put(String str, double d) {
        if (!TextUtils.isEmpty(str)) {
            this.f225a.put(str, Integer.valueOf(str.length() + String.valueOf(d).length() + b));
        }
        return super.put(str, d);
    }

    @Override // org.json.JSONObject
    public JSONObject put(String str, Object obj) {
        JSONObject put = super.put(str, obj);
        if (!TextUtils.isEmpty(str) && obj != null) {
            if (obj instanceof bf) {
                this.f225a.put(str, Integer.valueOf(str.length() + ((bf) obj).a() + b));
                return put;
            }
            this.f225a.put(str, Integer.valueOf(str.length() + String.valueOf(obj).getBytes(StandardCharsets.UTF_8).length + b + f14455a));
        }
        return put;
    }

    @Override // org.json.JSONObject
    public JSONObject put(String str, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            this.f225a.put(str, Integer.valueOf(str.length() + String.valueOf(z).length() + b));
        }
        return super.put(str, z);
    }

    @Override // org.json.JSONObject
    public Object remove(String str) {
        this.f225a.remove(str);
        return super.remove(str);
    }
}
