package com.vivo.push.restructure.a.a;

import android.text.TextUtils;
import com.vivo.push.util.t;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: NodeSaveImpl.java */
/* loaded from: classes2.dex */
final class o implements n {

    /* renamed from: a, reason: collision with root package name */
    private Map<String, m> f14122a = new ConcurrentHashMap();

    o() {
    }

    @Override // com.vivo.push.restructure.a.a.n
    public final void a(com.vivo.push.restructure.a.a aVar, a aVar2) {
        if (aVar == null) {
            t.a("addToCache error. msg is null");
        } else if (TextUtils.isEmpty(aVar.a())) {
            t.a("addToCache error. messageID is null");
        } else if (aVar2 == null) {
            t.a("addToCache error. firstNode is null");
        }
    }
}
