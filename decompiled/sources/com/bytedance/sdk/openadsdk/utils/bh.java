package com.bytedance.sdk.openadsdk.utils;

import android.gov.nist.core.Separators;
import android.text.TextUtils;
import java.util.Iterator;

/* loaded from: classes14.dex */
public class bh {
    public static String fxn(String str) {
        if (!com.bytedance.sdk.component.utils.ckl.hm() || TextUtils.isEmpty(str)) {
            return str;
        }
        com.bytedance.sdk.openadsdk.core.model.hie hieVar = new com.bytedance.sdk.openadsdk.core.model.hie(com.bytedance.sdk.openadsdk.core.jq.kg().rlu());
        StringBuilder sb = new StringBuilder(str);
        Iterator<String> it = hieVar.kg().iterator();
        while (it.hasNext()) {
            if (sb.toString().contains(it.next())) {
                if (sb.toString().contains(Separators.QUESTION)) {
                    sb.append("&").append(hieVar.fxn());
                } else {
                    sb.append(Separators.QUESTION).append(hieVar.fxn());
                }
            }
        }
        return sb.toString();
    }
}
