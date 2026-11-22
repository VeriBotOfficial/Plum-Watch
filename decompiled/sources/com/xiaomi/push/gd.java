package com.xiaomi.push;

import android.content.Context;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes4.dex */
public class gd {
    public static void a(Context context, gf gfVar, List<gk> list) {
        HashMap<String, ArrayList<gk>> a2 = a(context, list);
        if (a2 == null || a2.size() == 0) {
            com.xiaomi.channel.commonutils.logger.b.m11781a("TinyData TinyDataCacheUploader.uploadTinyData itemsUploading == null || itemsUploading.size() == 0  ts:" + System.currentTimeMillis());
        } else {
            a(context, gfVar, a2);
        }
    }

    private static HashMap<String, ArrayList<gk>> a(Context context, List<gk> list) {
        if (list == null || list.size() == 0) {
            return null;
        }
        HashMap<String, ArrayList<gk>> hashMap = new HashMap<>();
        for (gk gkVar : list) {
            a(context, gkVar);
            ArrayList<gk> arrayList = hashMap.get(gkVar.c());
            if (arrayList == null) {
                arrayList = new ArrayList<>();
                hashMap.put(gkVar.c(), arrayList);
            }
            arrayList.add(gkVar);
        }
        return hashMap;
    }

    private static void a(Context context, gk gkVar) {
        if (gkVar.f589a) {
            gkVar.a("push_sdk_channel");
        }
        if (TextUtils.isEmpty(gkVar.d())) {
            gkVar.f(com.xiaomi.push.service.az.a());
        }
        gkVar.b(System.currentTimeMillis());
        if (TextUtils.isEmpty(gkVar.e())) {
            gkVar.e(context.getPackageName());
        }
        if (TextUtils.isEmpty(gkVar.c())) {
            gkVar.e(gkVar.e());
        }
    }

    private static void a(Context context, gf gfVar, HashMap<String, ArrayList<gk>> hashMap) {
        for (Map.Entry<String, ArrayList<gk>> entry : hashMap.entrySet()) {
            try {
                ArrayList<gk> value = entry.getValue();
                if (value != null && value.size() != 0) {
                    gfVar.a(value, value.get(0).e(), entry.getKey());
                }
            } catch (Exception unused) {
            }
        }
    }
}
