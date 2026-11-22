package io.appmetrica.analytics.remotepermissions.impl;

import io.appmetrica.analytics.coreapi.internal.data.ProtobufConverter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.collections.CollectionsKt;
import kotlin.text.Charsets;

/* loaded from: classes6.dex */
public final class c implements ProtobufConverter {
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final f fromModel(a aVar) {
        f fVar = new f();
        Set set = aVar.f18707a;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((String) it.next()).getBytes(Charsets.UTF_8));
        }
        Object[] array = arrayList.toArray(new byte[0][]);
        if (array == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        }
        fVar.f18711a = (byte[][]) array;
        return fVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0021, code lost:
    
        if (r7 == null) goto L9;
     */
    @Override // io.appmetrica.analytics.coreapi.internal.data.Converter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final io.appmetrica.analytics.remotepermissions.impl.a toModel(io.appmetrica.analytics.remotepermissions.impl.f r7) {
        /*
            r6 = this;
            byte[][] r7 = r7.f18711a
            if (r7 == 0) goto L23
            java.util.ArrayList r0 = new java.util.ArrayList
            int r1 = r7.length
            r0.<init>(r1)
            int r1 = r7.length
            r2 = 0
        Lc:
            if (r2 >= r1) goto L1d
            r3 = r7[r2]
            java.lang.String r4 = new java.lang.String
            java.nio.charset.Charset r5 = kotlin.text.Charsets.UTF_8
            r4.<init>(r3, r5)
            r0.add(r4)
            int r2 = r2 + 1
            goto Lc
        L1d:
            java.util.Set r7 = kotlin.collections.CollectionsKt.toSet(r0)
            if (r7 != 0) goto L27
        L23:
            java.util.Set r7 = kotlin.collections.SetsKt.emptySet()
        L27:
            io.appmetrica.analytics.remotepermissions.impl.a r0 = new io.appmetrica.analytics.remotepermissions.impl.a
            r0.<init>(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: io.appmetrica.analytics.remotepermissions.impl.c.toModel(io.appmetrica.analytics.remotepermissions.impl.f):io.appmetrica.analytics.remotepermissions.impl.a");
    }
}
