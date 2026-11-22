package com.yandex.mobile.ads.impl;

import java.io.IOException;
import java.net.URL;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class gd1 {
    public static URL a(up1 request, t82 t82Var) throws IOException {
        Intrinsics.checkNotNullParameter(request, "request");
        String l = request.l();
        if (t82Var != null) {
            String a2 = t82Var.a(l);
            if (a2 == null) {
                throw new IOException("URL blocked by rewriter: " + l);
            }
            l = a2;
        }
        return new URL(l);
    }
}
