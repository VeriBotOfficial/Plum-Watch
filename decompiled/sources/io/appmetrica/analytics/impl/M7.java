package io.appmetrica.analytics.impl;

import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;

/* loaded from: classes6.dex */
public final class M7 implements ServiceComponentsInitializer {

    /* renamed from: a, reason: collision with root package name */
    public final List f17971a = CollectionsKt.listOf((Object[]) new String[]{"io.appmetrica.analytics.remotepermissions.internal.RemotePermissionsModuleEntryPoint", "io.appmetrica.analytics.apphud.internal.ApphudServiceModuleEntryPoint"});

    @Override // io.appmetrica.analytics.coreapi.internal.servicecomponents.ServiceComponentsInitializer
    public final void onCreate(Context context) {
        Xc xc = C3593ua.E.s;
        List list = this.f17971a;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(new D5((String) it.next()));
        }
        Object[] array = arrayList.toArray(new D5[0]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        D5[] d5Arr = (D5[]) array;
        Wc[] wcArr = (Wc[]) Arrays.copyOf(d5Arr, d5Arr.length);
        synchronized (xc) {
            CollectionsKt.addAll(xc.f18135a, wcArr);
        }
        C3593ua.E.s.a(new Je(context, "io.appmetrica.analytics.modules.ads", "lsm"));
    }
}
