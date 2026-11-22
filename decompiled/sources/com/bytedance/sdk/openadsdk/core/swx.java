package com.bytedance.sdk.openadsdk.core;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes14.dex */
public class swx {
    private static volatile swx fxn;
    private Map<String, Map<String, String>> kg = new ConcurrentHashMap();

    private swx() {
    }

    public static swx fxn() {
        if (fxn == null) {
            synchronized (swx.class) {
                if (fxn == null) {
                    fxn = new swx();
                }
            }
        }
        return fxn;
    }

    public void fxn(String str, String str2, String str3) {
        Map<String, Map<String, String>> map = this.kg;
        if (map == null) {
            return;
        }
        Map<String, String> map2 = map.get(str);
        if (map2 != null) {
            map2.put(str2, str3);
            return;
        }
        ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        concurrentHashMap.put(str2, str3);
        this.kg.put(str, concurrentHashMap);
    }

    public String fxn(String str, String str2) {
        Map<String, String> map;
        Map<String, Map<String, String>> map2 = this.kg;
        if (map2 == null || !map2.containsKey(str) || (map = this.kg.get(str)) == null) {
            return null;
        }
        return map.get(str2);
    }

    public boolean kg(String str, String str2) {
        Map<String, String> map;
        Map<String, Map<String, String>> map2 = this.kg;
        if (map2 == null || !map2.containsKey(str) || (map = this.kg.get(str)) == null) {
            return false;
        }
        return map.containsKey(str2);
    }

    public boolean gff(String str, String str2) {
        Map<String, String> map;
        Map<String, Map<String, String>> map2 = this.kg;
        if (map2 == null || !map2.containsKey(str) || (map = this.kg.get(str)) == null) {
            return false;
        }
        map.remove(str2);
        return true;
    }

    public void fxn(String str) {
        Map<String, Map<String, String>> map = this.kg;
        if (map != null && map.containsKey(str)) {
            Map<String, String> map2 = this.kg.get(str);
            if (map2 != null) {
                map2.clear();
            }
            this.kg.remove(str);
        }
    }
}
