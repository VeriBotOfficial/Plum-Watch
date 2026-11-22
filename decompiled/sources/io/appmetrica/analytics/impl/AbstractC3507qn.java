package io.appmetrica.analytics.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* renamed from: io.appmetrica.analytics.impl.qn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public abstract class AbstractC3507qn {
    public static final C3432nn a(Throwable th, S s, List list, String str, Boolean bool) {
        ArrayList arrayList = null;
        C3183dn a2 = th != null ? AbstractC3208en.a(th, 1, 0) : null;
        if (list != null) {
            arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(new C3231fl((StackTraceElement) it.next()));
            }
        }
        return new C3432nn(a2, s, arrayList, null, null, null, str, bool);
    }
}
