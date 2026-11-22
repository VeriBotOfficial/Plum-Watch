package com.anythink.basead.mixad.e;

import com.anythink.core.common.h.y;
import com.anythink.core.common.l.g.d;
import java.io.Serializable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes11.dex */
public final class c extends y implements Serializable {
    private final int o;
    private final int p;

    /* renamed from: q, reason: collision with root package name */
    private final int f2903q;
    private boolean r;

    public c(com.anythink.core.common.l.g.a aVar) {
        w(aVar.d());
        p(aVar.c());
        b(aVar.b() * 1000);
        q(aVar.a());
        y(aVar.e());
        x(aVar.f());
        e(aVar.n());
        this.f2903q = aVar.j();
        int k = aVar.k();
        this.o = k;
        this.p = aVar.m();
        if (aVar instanceof d) {
            this.r = ((d) aVar).p();
        }
        f(String.valueOf(k));
        an(aVar.o());
    }

    public final boolean a() {
        return this.f2903q == 1;
    }

    public final int b() {
        return this.o;
    }

    public final int c() {
        return this.p;
    }

    public final boolean d() {
        return this.r;
    }

    public final String toString() {
        return "ThirdPartyAdSetting{adSourceInterType=" + this.o + ", adSourceShakeType=" + this.p + ", nativeRenderingType=" + this.f2903q + ", isShowCloseButton=" + this.r + ", probabilityForDelayShowCloseButtonInEndCard=" + this.e + ", MinDelayTimeWhenShowCloseButton=" + this.f + ", MaxDelayTimeWhenShowCloseButton=" + this.g + ", interstitialType='" + this.h + "', rewardTime=" + this.i + ", isRewardForPlayFail=" + this.j + ", closeClickType=" + this.k + ", splashImageScaleType=" + this.l + ", impressionMonitorTime=" + this.m + AbstractJsonLexerKt.END_OBJ;
    }
}
