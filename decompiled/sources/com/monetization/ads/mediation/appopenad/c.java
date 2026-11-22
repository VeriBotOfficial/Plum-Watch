package com.monetization.ads.mediation.appopenad;

import android.content.Context;
import com.monetization.ads.mediation.appopenad.MediatedAppOpenAdAdapter;
import com.yandex.mobile.ads.impl.yx0;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes17.dex */
public final class c implements yx0<MediatedAppOpenAdAdapter, MediatedAppOpenAdAdapter.MediatedAppOpenAdAdapterListener> {

    /* renamed from: a, reason: collision with root package name */
    private MediatedAppOpenAdAdapter f12690a;

    @Override // com.yandex.mobile.ads.impl.yx0
    public final void a(com.monetization.ads.mediation.base.a aVar) {
        MediatedAppOpenAdAdapter mediatedAdapter = (MediatedAppOpenAdAdapter) aVar;
        Intrinsics.checkNotNullParameter(mediatedAdapter, "mediatedAdapter");
        mediatedAdapter.onInvalidate();
    }

    @Override // com.yandex.mobile.ads.impl.yx0
    public final void a(Context context, com.monetization.ads.mediation.base.a aVar, Object obj, Map localExtras, Map serverExtras) {
        MediatedAppOpenAdAdapter mediatedAdapter = (MediatedAppOpenAdAdapter) aVar;
        MediatedAppOpenAdAdapter.MediatedAppOpenAdAdapterListener mediatedAdapterListener = (MediatedAppOpenAdAdapter.MediatedAppOpenAdAdapterListener) obj;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(mediatedAdapter, "mediatedAdapter");
        Intrinsics.checkNotNullParameter(mediatedAdapterListener, "mediatedAdapterListener");
        Intrinsics.checkNotNullParameter(localExtras, "localExtras");
        Intrinsics.checkNotNullParameter(serverExtras, "serverExtras");
        this.f12690a = mediatedAdapter;
        mediatedAdapter.loadAppOpenAd(context, mediatedAdapterListener, localExtras, serverExtras);
    }

    public final MediatedAppOpenAdAdapter a() {
        return this.f12690a;
    }
}
