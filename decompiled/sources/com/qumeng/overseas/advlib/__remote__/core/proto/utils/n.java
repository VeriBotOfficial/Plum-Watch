package com.qumeng.overseas.advlib.__remote__.core.proto.utils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes17.dex */
public class n {
    public static List<Integer> a(int[] iArr) {
        if (com.qumeng.overseas.advlib.__remote__.utils.q.a(iArr)) {
            return Collections.EMPTY_LIST;
        }
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }
}
