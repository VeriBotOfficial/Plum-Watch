package com.bytedance.sdk.component.jq;

import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes13.dex */
public class kg {
    public static boolean fxn(List<String> list, String str) {
        if (list != null && !list.isEmpty()) {
            Iterator<String> it = list.iterator();
            while (it.hasNext()) {
                if (Pattern.matches(it.next(), str)) {
                    return true;
                }
            }
        }
        return false;
    }
}
