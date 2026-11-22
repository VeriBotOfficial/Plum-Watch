package com.yandex.mobile.ads.impl;

import java.io.IOException;

/* loaded from: classes5.dex */
public final class wv {
    public static void a(tv tvVar) {
        if (tvVar != null) {
            try {
                tvVar.close();
            } catch (IOException unused) {
            }
        }
    }
}
