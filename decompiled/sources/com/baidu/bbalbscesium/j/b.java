package com.baidu.bbalbscesium.j;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes12.dex */
public class b {
    public static final String c = "upc";
    public static final long d = 9000000;
    public static final String e = "isc";
    public static final long f = 8000000;

    /* renamed from: a, reason: collision with root package name */
    private a f7403a;
    private Map b = new HashMap();

    public interface a {
        List a();
    }

    public b(a aVar) {
        this.f7403a = aVar;
        for (com.baidu.bbalbscesium.j.a aVar2 : aVar.a()) {
            this.b.put(aVar2.a(), aVar2);
        }
    }

    public com.baidu.bbalbscesium.j.a a(String str) {
        return (com.baidu.bbalbscesium.j.a) this.b.get(str);
    }

    public List a() {
        return new ArrayList(this.b.values());
    }
}
