package com.qumeng.overseas.advlib.__remote__.core.proto.utils;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes17.dex */
public class v {
    public static boolean a(String str, String str2) {
        return a(str, str2, AbstractJsonLexerKt.COMMA, 0, true);
    }

    public static boolean a(String str, String str2, char c, int i, boolean z) {
        int indexOf;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || i >= str.length() || (indexOf = str.indexOf(str2, i)) == -1) {
            return false;
        }
        int length = str2.length() + indexOf;
        boolean z2 = indexOf == 0 || str.charAt(indexOf - 1) == c;
        boolean z3 = length == str.length() || str.charAt(length) == c;
        if (z2 && z3) {
            return true;
        }
        if (z) {
            return a(str, str2, c, length, true);
        }
        return false;
    }

    public static List<String> a(Map<String, Integer> map, List<String> list) {
        if (d.a((Map<? extends Object, ? extends Object>) map)) {
            return list;
        }
        int intValue = ((Integer) d.a(map.get(com.qumeng.overseas.advlib.__remote__.ui.banner.impadbanner.a.c), -1)).intValue();
        int intValue2 = ((Integer) d.a(map.get(com.qumeng.overseas.advlib.__remote__.ui.banner.impadbanner.a.d), -1)).intValue();
        int intValue3 = ((Integer) d.a(map.get(com.qumeng.overseas.advlib.__remote__.ui.banner.impadbanner.a.f13039a), -1)).intValue();
        int intValue4 = ((Integer) d.a(map.get(com.qumeng.overseas.advlib.__remote__.ui.banner.impadbanner.a.b), -1)).intValue();
        int intValue5 = ((Integer) d.a(map.get("ad_width"), -1)).intValue();
        int intValue6 = ((Integer) d.a(map.get("ad_height"), -1)).intValue();
        float f = intValue5;
        int i = (int) ((intValue3 / f) * 1000.0f);
        float f2 = intValue6;
        int i2 = (int) ((intValue4 / f2) * 1000.0f);
        int i3 = (int) ((intValue / f) * 1000.0f);
        int i4 = (int) ((intValue2 / f2) * 1000.0f);
        ArrayList arrayList = new ArrayList();
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            int i5 = intValue;
            int i6 = intValue6;
            String replace = it.next().replace("${up_x}", String.valueOf(i5)).replace("${up_y}", String.valueOf(intValue2)).replace("${down_x}", String.valueOf(intValue3)).replace("${down_y}", String.valueOf(intValue4)).replace("${ad_width}", String.valueOf(intValue5)).replace("${ad_height}", String.valueOf(i6)).replace("${relative_down_x}", String.valueOf(i)).replace("${relative_down_y}", String.valueOf(i2)).replace("${relative_up_x}", String.valueOf(i3)).replace("${relative_up_y}", String.valueOf(i4));
            if (replace.contains("fancyapi.com")) {
                replace = replace.replace("__AZCX__", String.valueOf(map.get(com.qumeng.overseas.advlib.__remote__.ui.banner.impadbanner.a.c))).replace("__AZCY__", String.valueOf(map.get(com.qumeng.overseas.advlib.__remote__.ui.banner.impadbanner.a.d))).replace("__SLOTX__", String.valueOf(map.get(com.qumeng.overseas.advlib.__remote__.ui.banner.impadbanner.a.e))).replace("__SLOTY__", String.valueOf(map.get(com.qumeng.overseas.advlib.__remote__.ui.banner.impadbanner.a.f)));
            }
            arrayList.add(replace);
            intValue = i5;
            intValue6 = i6;
        }
        return arrayList;
    }

    public static String a(Map<String, Integer> map, String str) {
        return a(map, (List<String>) Collections.singletonList(str)).get(0);
    }
}
