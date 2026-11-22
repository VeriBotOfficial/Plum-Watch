package com.huawei.hms.scankit.p;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* compiled from: BarcodeValue.java */
/* renamed from: com.huawei.hms.scankit.p.ga, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
final class C3004ga {

    /* renamed from: a, reason: collision with root package name */
    private final Map<Integer, Integer> f10642a = new HashMap();

    C3004ga() {
    }

    void a(int i) {
        Integer num = this.f10642a.get(Integer.valueOf(i));
        if (num == null) {
            num = 0;
        }
        this.f10642a.put(Integer.valueOf(i), Integer.valueOf(num.intValue() + 1));
    }

    int[] a() {
        ArrayList arrayList = new ArrayList();
        int i = -1;
        for (Map.Entry<Integer, Integer> entry : this.f10642a.entrySet()) {
            if (entry.getValue().intValue() > i) {
                i = entry.getValue().intValue();
                arrayList.clear();
                arrayList.add(entry.getKey());
            } else if (entry.getValue().intValue() == i) {
                arrayList.add(entry.getKey());
            }
        }
        return C3055ta.a(arrayList);
    }
}
