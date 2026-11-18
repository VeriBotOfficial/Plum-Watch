package com.anythink.expressad.foundation.g.g.a;

import android.text.TextUtils;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes16.dex */
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Map<String, String> f4906a = new HashMap();

    public final void a(String str, Object obj) {
        if (TextUtils.isEmpty(str) || obj == null) {
            return;
        }
        try {
            if (obj instanceof String) {
                if (TextUtils.isEmpty((String) obj)) {
                    return;
                }
                this.f4906a.put(str, (String) obj);
                return;
            }
            this.f4906a.put(str, String.valueOf(obj));
        } catch (Exception unused) {
        }
    }

    private boolean a(String str) {
        return this.f4906a.containsKey(str);
    }

    private Object b(String str) {
        return this.f4906a.get(str);
    }

    private void c(String str) {
        if (this.f4906a == null || TextUtils.isEmpty(str)) {
            return;
        }
        this.f4906a.remove(str);
    }

    public final Map<String, String> a() {
        return this.f4906a;
    }

    private void a(f fVar) {
        Map<String, String> map;
        Map<String, String> map2;
        if (fVar == null || (map = fVar.f4906a) == null || (map2 = this.f4906a) == null) {
            return;
        }
        map2.putAll(map);
    }

    private void a(Map map) {
        if (map == null || map.size() <= 0) {
            return;
        }
        this.f4906a.putAll(map);
    }
}
