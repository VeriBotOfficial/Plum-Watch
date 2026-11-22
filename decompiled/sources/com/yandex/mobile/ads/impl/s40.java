package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import com.yandex.mobile.ads.impl.ht;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class s40 {

    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f16829a;
        private final ht.a b;
        private final long c;

        public a(String adBreakType, ht.a adBreakPositionType, long j) {
            Intrinsics.checkNotNullParameter(adBreakType, "adBreakType");
            Intrinsics.checkNotNullParameter(adBreakPositionType, "adBreakPositionType");
            this.f16829a = adBreakType;
            this.b = adBreakPositionType;
            this.c = j;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f16829a, aVar.f16829a) && this.b == aVar.b && this.c == aVar.c;
        }

        public final int hashCode() {
            return Long.hashCode(this.c) + ((this.b.hashCode() + (this.f16829a.hashCode() * 31)) * 31);
        }

        public final String toString() {
            return "AdBreakSignature(adBreakType=" + this.f16829a + ", adBreakPositionType=" + this.b + ", adBreakPositionValue=" + this.c + Separators.RPAREN;
        }
    }

    public static ArrayList a(ArrayList adBreaks) {
        Intrinsics.checkNotNullParameter(adBreaks, "adBreaks");
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        Iterator it = adBreaks.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            gt gtVar = (gt) next;
            if (hashSet.add(new a(gtVar.e(), gtVar.b().a(), gtVar.b().b()))) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }
}
