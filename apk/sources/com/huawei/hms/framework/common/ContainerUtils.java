package com.huawei.hms.framework.common;

import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes11.dex */
public class ContainerUtils {
    public static final String FIELD_DELIMITER = "&";
    public static final String KEY_VALUE_DELIMITER = "=";

    public static <K, V> boolean equals(Map<K, V> map, Map<K, V> map2) {
        if (map == map2) {
            return true;
        }
        boolean z = false;
        if (map == null || map2 == null || map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<K, V> entry : map.entrySet()) {
            if (map2.get(entry.getKey()) != entry.getValue()) {
                z = true;
                break;
            }
        }
        return !z;
    }

    public static <K, V> int hashCode(Map<K, V> map) {
        return toString(map).hashCode();
    }

    public static <K, V> String toString(Map<K, V> map) {
        if (map == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int r1 = 0;
        for (Map.Entry<K, V> entry : map.entrySet()) {
            int r3 = r1 + 1;
            if (r1 > 0) {
                sb.append("&");
            }
            sb.append(entry.getKey().toString()).append("=").append(entry.getValue().toString());
            r1 = r3;
        }
        return sb.toString();
    }

    public static <K> String toString(Set<K> set) {
        if (set == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int r1 = 0;
        for (K k : set) {
            int r3 = r1 + 1;
            if (r1 > 0) {
                sb.append("&");
            }
            sb.append(k.toString());
            r1 = r3;
        }
        return sb.toString();
    }

    public static <K> String toString(List<K> list) {
        if (list == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int r1 = 0;
        for (K k : list) {
            int r3 = r1 + 1;
            if (r1 > 0) {
                sb.append("&");
            }
            sb.append(k.toString());
            r1 = r3;
        }
        return sb.toString();
    }
}
