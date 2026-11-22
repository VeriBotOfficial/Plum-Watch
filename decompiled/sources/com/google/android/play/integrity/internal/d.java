package com.google.android.play.integrity.internal;

import android.os.Bundle;
import com.anythink.core.common.e.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: com.google.android.play:integrity@@1.3.0 */
/* loaded from: classes16.dex */
public final class d {
    public static final List a(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            f fVar = (f) it.next();
            Bundle bundle = new Bundle();
            bundle.putInt(a.C0193a.b, fVar.a());
            bundle.putLong("event_timestamp", fVar.b());
            arrayList.add(bundle);
        }
        return arrayList;
    }

    public static final void b(int i, List list) {
        list.add(f.c(i, System.currentTimeMillis()));
    }
}
