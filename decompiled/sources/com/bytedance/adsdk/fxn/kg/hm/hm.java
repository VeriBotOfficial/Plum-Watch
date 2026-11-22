package com.bytedance.adsdk.fxn.kg.hm;

import android.gov.nist.core.Separators;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes13.dex */
public enum hm implements rb {
    LEFT_PAREN(Separators.LPAREN),
    RIGHT_PAREN(Separators.RPAREN),
    LEFT_BRACKET("["),
    RIGHT_BRACKET("]"),
    COMMA(",");

    private static final Map<String, hm> bh;

    /* renamed from: sg, reason: collision with root package name */
    private final String f9224sg;

    static {
        HashMap hashMap = new HashMap(128);
        bh = hashMap;
        for (hm hmVar : hashMap.values()) {
            bh.put(hmVar.fxn(), hmVar);
        }
    }

    hm(String str) {
        this.f9224sg = str;
    }

    public static boolean fxn(rb rbVar) {
        return rbVar instanceof hm;
    }

    public String fxn() {
        return this.f9224sg;
    }
}
