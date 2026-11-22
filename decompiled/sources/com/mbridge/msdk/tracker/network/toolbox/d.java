package com.mbridge.msdk.tracker.network.toolbox;

import android.gov.nist.core.Separators;
import android.text.TextUtils;
import com.mbridge.msdk.tracker.network.t;

/* compiled from: Common.java */
/* loaded from: classes17.dex */
public class d {
    public static String a(String str, t<?> tVar) {
        if (TextUtils.isEmpty(str) || tVar == null) {
            return "";
        }
        byte[] b = tVar.b();
        return (b == null || b.length == 0) ? str : str.endsWith(Separators.QUESTION) ? str + new String(b) : str + Separators.QUESTION + new String(b);
    }
}
