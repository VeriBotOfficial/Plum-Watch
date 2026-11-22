package com.baidu.ar;

import android.text.TextUtils;
import com.baidu.ar.statistic.StatisticApi;
import com.baidu.ar.statistic.StatisticConstants;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes12.dex */
public class ac {

    /* renamed from: a, reason: collision with root package name */
    public static s3 f6768a;
    public static final List<String> b = Arrays.asList(StatisticConstants.EVENT_FILTER_ADJUST, StatisticConstants.EVENT_FILTER_SWITCH, StatisticConstants.EVENT_BEAUTIFY_ADJUST);

    public class a implements s3 {
        @Override // com.baidu.ar.s3
        public List<Integer> a() {
            ArrayList arrayList = new ArrayList();
            arrayList.add(1801);
            arrayList.add(1901);
            return arrayList;
        }

        @Override // com.baidu.ar.s3
        public void a(int i, int i2, HashMap<String, Object> hashMap) {
            if (i == 1801) {
                ac.c(hashMap);
            } else if (i == 1901) {
                ac.d(hashMap);
            }
        }
    }

    public static void a(r3 r3Var) {
        a aVar = new a();
        f6768a = aVar;
        r3Var.a(aVar);
    }

    public static void b(r3 r3Var) {
        s3 s3Var = f6768a;
        if (s3Var != null) {
            if (r3Var != null) {
                r3Var.b(s3Var);
            }
            f6768a = null;
        }
    }

    public static void c(HashMap<String, Object> hashMap) {
        if (hashMap != null) {
            String str = (String) hashMap.get("id");
            String str2 = (String) hashMap.get("type");
            if (TextUtils.isEmpty(str2)) {
                return;
            }
            HashMap hashMap2 = new HashMap();
            if (hashMap.size() > 1) {
                for (Map.Entry<String, Object> entry : hashMap.entrySet()) {
                    if (entry.getValue() != null) {
                        hashMap2.put(entry.getKey(), entry.getValue().toString());
                    }
                }
                hashMap2.remove("type");
                if (hashMap2.containsKey("id")) {
                    hashMap2.remove("id");
                    hashMap2.put("event_param", str);
                }
            }
            if (b.contains(str2)) {
                StatisticApi.onEventDebounce(str2, 200L, hashMap2);
            } else {
                StatisticApi.onEvent(str2, hashMap2);
            }
        }
    }

    public static void d(HashMap<String, Object> hashMap) {
        if (hashMap != null && hashMap.containsKey(com.anythink.expressad.foundation.g.g.a.b.aS) && hashMap.containsKey("event_id") && "statistic_lua_event".equals((String) hashMap.get(com.anythink.expressad.foundation.g.g.a.b.aS))) {
            String str = (String) hashMap.get("event_id");
            Object obj = hashMap.get("event_map");
            if (obj == null || !(obj instanceof Map)) {
                StatisticApi.onEvent(str);
            } else {
                StatisticApi.onEvent(str, (Map<String, String>) obj);
            }
        }
    }
}
