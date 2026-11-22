package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.impl.ht;
import com.yandex.mobile.ads.instream.InstreamAdBreakType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class pm0 {

    /* renamed from: a, reason: collision with root package name */
    private final gf2 f16583a;

    public pm0(gf2 videoPlayerController) {
        Intrinsics.checkNotNullParameter(videoPlayerController, "videoPlayerController");
        this.f16583a = videoPlayerController;
    }

    public final om0 a(List<gt> adBreaks) {
        Object obj;
        Object obj2;
        Intrinsics.checkNotNullParameter(adBreaks, "adBreaks");
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : adBreaks) {
            if (Intrinsics.areEqual(((gt) obj3).e(), InstreamAdBreakType.MIDROLL)) {
                arrayList2.add(obj3);
            }
        }
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            gt gtVar = (gt) it.next();
            ht b = gtVar.b();
            long b2 = b.b();
            if (ht.a.b == b.a()) {
                b2 = (long) ((b2 / 100) * this.f16583a.b());
            }
            arrayList.add(new ej1(gtVar, b2));
        }
        Collections.sort(arrayList, new a());
        Iterator<T> it2 = adBreaks.iterator();
        while (true) {
            obj = null;
            if (!it2.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it2.next();
            if (Intrinsics.areEqual(((gt) obj2).e(), InstreamAdBreakType.PREROLL)) {
                break;
            }
        }
        gt gtVar2 = (gt) obj2;
        Iterator<T> it3 = adBreaks.iterator();
        while (true) {
            if (!it3.hasNext()) {
                break;
            }
            Object next = it3.next();
            if (Intrinsics.areEqual(((gt) next).e(), InstreamAdBreakType.POSTROLL)) {
                obj = next;
                break;
            }
        }
        return new om0(arrayList, gtVar2, (gt) obj);
    }

    private static final class a implements Comparator<ej1> {
        @Override // java.util.Comparator
        public final int compare(ej1 ej1Var, ej1 ej1Var2) {
            ej1 first = ej1Var;
            ej1 second = ej1Var2;
            Intrinsics.checkNotNullParameter(first, "first");
            Intrinsics.checkNotNullParameter(second, "second");
            if (Intrinsics.areEqual(first, second)) {
                return 0;
            }
            String e = first.a().e();
            String e2 = second.a().e();
            if (Intrinsics.areEqual(e, InstreamAdBreakType.PREROLL)) {
                return -1;
            }
            if (Intrinsics.areEqual(e2, InstreamAdBreakType.PREROLL) || Intrinsics.areEqual(e, InstreamAdBreakType.POSTROLL)) {
                return 1;
            }
            return (!Intrinsics.areEqual(e2, InstreamAdBreakType.POSTROLL) && first.b() >= second.b()) ? 1 : -1;
        }
    }
}
