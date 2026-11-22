package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAdBreakType;

/* loaded from: classes5.dex */
public final class q2 {
    public static w2 a(String str) {
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -318297696) {
                if (hashCode != 757909789) {
                    if (hashCode == 1055572677 && str.equals(InstreamAdBreakType.MIDROLL)) {
                        return w2.c;
                    }
                } else if (str.equals(InstreamAdBreakType.POSTROLL)) {
                    return w2.d;
                }
            } else if (str.equals(InstreamAdBreakType.PREROLL)) {
                return w2.b;
            }
        }
        return w2.e;
    }
}
