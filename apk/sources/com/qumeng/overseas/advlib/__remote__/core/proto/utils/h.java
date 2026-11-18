package com.qumeng.overseas.advlib.__remote__.core.proto.utils;

import android.os.Bundle;
import android.util.Pair;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: classes2.dex */
public class h {

    public static class a<E> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private List<E> f12856a = new ArrayList();

        public a add(E e) {
            this.f12856a.add(e);
            return this;
        }

        public List<E> toList() {
            return this.f12856a;
        }

        public a add(E... eArr) {
            add((Collection) Arrays.asList(eArr));
            return this;
        }

        public a add(Collection<? extends E> collection) {
            this.f12856a.addAll(collection);
            return this;
        }
    }

    public static class b<K, V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Map<K, V> f12857a = new HashMap();

        public b() {
        }

        public b append(Map<? extends K, ? extends V> map) {
            if (map != null) {
                this.f12857a.putAll(map);
            }
            return this;
        }

        public Map<K, V> getMap() {
            return this.f12857a;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public b putBundle(Bundle bundle, Class<? extends Serializable>... clsArr) {
            Set<String> setKeySet = bundle.keySet();
            List listAsList = Arrays.asList(clsArr);
            for (String str : setKeySet) {
                Object obj = bundle.get(str);
                if (obj != null && Serializable.class.isAssignableFrom(obj.getClass()) && listAsList.contains(obj.getClass())) {
                    this.f12857a.put((K) str, (V) obj);
                }
            }
            return this;
        }

        public b putMap(Map map, Class<? extends Serializable>... clsArr) {
            Set<K> setKeySet = map.keySet();
            List listAsList = Arrays.asList(clsArr);
            for (K k : setKeySet) {
                Object obj = map.get(k);
                if (obj != null && Serializable.class.isAssignableFrom(obj.getClass()) && listAsList.contains(obj.getClass())) {
                    this.f12857a.put((K) k, (V) obj);
                }
            }
            return this;
        }

        public b putReverseMap(Map<? extends V, ? extends K> map) {
            if (map != null) {
                for (Map.Entry<? extends V, ? extends K> entry : map.entrySet()) {
                    V key = entry.getKey();
                    this.f12857a.put(entry.getValue(), key);
                }
            }
            return this;
        }

        public b append(Map.Entry<? extends K, ? extends V>... entryArr) {
            for (Map.Entry<? extends K, ? extends V> entry : entryArr) {
                this.f12857a.put(entry.getKey(), entry.getValue());
            }
            return this;
        }

        public b(Map<? extends K, ? extends V> map) {
            append(map);
        }

        public b append(Pair<? extends K, ? extends V>... pairArr) {
            for (Pair<? extends K, ? extends V> pair : pairArr) {
                this.f12857a.put((K) pair.first, (V) pair.second);
            }
            return this;
        }

        public b append(K k, V v) {
            this.f12857a.put(k, v);
            return this;
        }

        public b(Map.Entry<? extends K, ? extends V>... entryArr) {
            append(entryArr);
        }

        public b(Pair<? extends K, ? extends V>... pairArr) {
            append(pairArr);
        }
    }
}
