package com.yandex.mobile.ads.impl;

import com.monetization.ads.mediation.base.MediatedAdapterInfo;
import com.monetization.ads.mediation.base.model.MediatedAdObject;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes5.dex */
public final class tx0 {

    /* renamed from: a, reason: collision with root package name */
    private final com.monetization.ads.mediation.base.a f17000a;

    public tx0(com.monetization.ads.mediation.base.a mediatedAd) {
        Intrinsics.checkNotNullParameter(mediatedAd, "mediatedAd");
        this.f17000a = mediatedAd;
    }

    public final MediatedAdapterInfo b() {
        Object m14057constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m14057constructorimpl = Result.m14057constructorimpl(this.f17000a.getAdapterInfo());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m14057constructorimpl = Result.m14057constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m14060exceptionOrNullimpl(m14057constructorimpl) != null) {
            m14057constructorimpl = new MediatedAdapterInfo.Builder().setAdapterVersion(AbstractJsonLexerKt.NULL).setNetworkName(AbstractJsonLexerKt.NULL).setNetworkSdkVersion(AbstractJsonLexerKt.NULL).build();
        }
        return (MediatedAdapterInfo) m14057constructorimpl;
    }

    public final boolean c() {
        Object m14057constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m14057constructorimpl = Result.m14057constructorimpl(Boolean.valueOf(this.f17000a.getShouldTrackImpressionAutomatically()));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m14057constructorimpl = Result.m14057constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m14060exceptionOrNullimpl(m14057constructorimpl) != null) {
            m14057constructorimpl = Boolean.TRUE;
        }
        return ((Boolean) m14057constructorimpl).booleanValue();
    }

    public final MediatedAdObject a() {
        Object m14057constructorimpl;
        try {
            Result.Companion companion = Result.INSTANCE;
            m14057constructorimpl = Result.m14057constructorimpl(this.f17000a.getAdObject());
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            m14057constructorimpl = Result.m14057constructorimpl(ResultKt.createFailure(th));
        }
        if (Result.m14063isFailureimpl(m14057constructorimpl)) {
            m14057constructorimpl = null;
        }
        return (MediatedAdObject) m14057constructorimpl;
    }
}
