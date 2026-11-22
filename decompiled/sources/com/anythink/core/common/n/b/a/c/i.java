package com.anythink.core.common.n.b.a.c;

import com.anythink.core.common.n.b.ad;
import com.anythink.core.common.n.b.v;
import java.net.Proxy;

/* loaded from: classes12.dex */
public final class i {
    private i() {
    }

    private static String a(ad adVar, Proxy.Type type) {
        StringBuilder sb = new StringBuilder();
        sb.append(adVar.b());
        sb.append(' ');
        if (!adVar.g() && type == Proxy.Type.HTTP) {
            sb.append(adVar.a());
        } else {
            sb.append(a(adVar.a()));
        }
        sb.append(" HTTP/1.1");
        return sb.toString();
    }

    private static boolean b(ad adVar, Proxy.Type type) {
        return !adVar.g() && type == Proxy.Type.HTTP;
    }

    public static String a(v vVar) {
        String h = vVar.h();
        String j = vVar.j();
        return j != null ? h + '?' + j : h;
    }
}
