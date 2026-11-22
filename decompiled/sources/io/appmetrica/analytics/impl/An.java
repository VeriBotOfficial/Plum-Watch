package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import java.util.HashMap;

/* loaded from: classes6.dex */
public final class An {
    public static final int[] c = {0, 1, 2, 3};

    /* renamed from: a, reason: collision with root package name */
    public final SparseArray f17772a = new SparseArray();
    public int b = 0;

    public An(int[] iArr) {
        for (int i : iArr) {
            this.f17772a.put(i, new HashMap());
        }
    }
}
