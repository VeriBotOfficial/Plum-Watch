package com.bytedance.adsdk.fxn.kg.hm;

import android.gov.nist.core.Separators;
import com.xiaomi.mipush.sdk.Constants;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/* loaded from: classes13.dex */
public enum gff implements rb {
    QUESTION(Separators.QUESTION, 0),
    COLON(":", 0),
    DOUBLE_AMP("&&", 1),
    DOUBLE_BAR("||", 1),
    EQ("==", 2),
    GT(Separators.GREATER_THAN, 2),
    LT(Separators.LESS_THAN, 2),
    LT_EQ("<=", 2),
    GT_EQ(">=", 2),
    NOT_EQ("!=", 2),
    PLUS("+", 3),
    MINUS(Constants.ACCEPT_TIME_SEPARATOR_SERVER, 3),
    MULTI("*", 4),
    DIVISION("/", 4),
    MOD(Separators.PERCENT, 4);

    private final String je;
    private final int ud;
    private static final Map<String, gff> xdg = new HashMap(128);
    private static final Set<gff> rmu = new HashSet();

    static {
        for (gff gffVar : values()) {
            xdg.put(gffVar.fxn(), gffVar);
            rmu.add(gffVar);
        }
    }

    gff(String str, int i) {
        this.je = str;
        this.ud = i;
    }

    public static gff fxn(String str) {
        return xdg.get(str);
    }

    public static boolean fxn(rb rbVar) {
        return rbVar instanceof gff;
    }

    public String fxn() {
        return this.je;
    }

    public int kg() {
        return this.ud;
    }
}
