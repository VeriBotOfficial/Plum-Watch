package com.google.android.gms.common.data;

import com.xiaomi.push.service.f;
import java.util.ArrayList;
import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-base@@18.4.0 */
/* loaded from: classes13.dex */
public final class FreezableUtils {
    public static <T, E extends Freezable<T>> ArrayList<T> freeze(ArrayList<E> arrayList) {
        f.AnonymousClass3 anonymousClass3 = (ArrayList<T>) new ArrayList(arrayList.size());
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            anonymousClass3.add(arrayList.get(i).freeze());
        }
        return anonymousClass3;
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freezeIterable(Iterable<E> iterable) {
        f.AnonymousClass3 anonymousClass3 = (ArrayList<T>) new ArrayList();
        Iterator<E> it = iterable.iterator();
        while (it.hasNext()) {
            anonymousClass3.add(it.next().freeze());
        }
        return anonymousClass3;
    }

    public static <T, E extends Freezable<T>> ArrayList<T> freeze(E[] eArr) {
        f.AnonymousClass3 anonymousClass3 = (ArrayList<T>) new ArrayList(eArr.length);
        for (E e : eArr) {
            anonymousClass3.add(e.freeze());
        }
        return anonymousClass3;
    }
}
