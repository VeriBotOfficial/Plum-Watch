package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class nx {

    /* renamed from: a, reason: collision with root package name */
    private final xw f16388a;
    private final yx b;
    private final List<qz0> c;
    private final ax d;
    private final hx e;
    private final ox f;

    public nx(xw appData, yx sdkData, ArrayList mediationNetworksData, ax consentsData, hx debugErrorIndicatorData, ox oxVar) {
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(sdkData, "sdkData");
        Intrinsics.checkNotNullParameter(mediationNetworksData, "mediationNetworksData");
        Intrinsics.checkNotNullParameter(consentsData, "consentsData");
        Intrinsics.checkNotNullParameter(debugErrorIndicatorData, "debugErrorIndicatorData");
        this.f16388a = appData;
        this.b = sdkData;
        this.c = mediationNetworksData;
        this.d = consentsData;
        this.e = debugErrorIndicatorData;
        this.f = oxVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nx)) {
            return false;
        }
        nx nxVar = (nx) obj;
        return Intrinsics.areEqual(this.f16388a, nxVar.f16388a) && Intrinsics.areEqual(this.b, nxVar.b) && Intrinsics.areEqual(this.c, nxVar.c) && Intrinsics.areEqual(this.d, nxVar.d) && Intrinsics.areEqual(this.e, nxVar.e) && Intrinsics.areEqual(this.f, nxVar.f);
    }

    public final int hashCode() {
        int hashCode = (this.e.hashCode() + ((this.d.hashCode() + aa.a(this.c, (this.b.hashCode() + (this.f16388a.hashCode() * 31)) * 31, 31)) * 31)) * 31;
        ox oxVar = this.f;
        return hashCode + (oxVar == null ? 0 : oxVar.hashCode());
    }

    public final String toString() {
        return "DebugPanelLocalData(appData=" + this.f16388a + ", sdkData=" + this.b + ", mediationNetworksData=" + this.c + ", consentsData=" + this.d + ", debugErrorIndicatorData=" + this.e + ", logsData=" + this.f + Separators.RPAREN;
    }

    public final xw a() {
        return this.f16388a;
    }

    public final yx f() {
        return this.b;
    }

    public final List<qz0> e() {
        return this.c;
    }

    public final ax b() {
        return this.d;
    }

    public final hx c() {
        return this.e;
    }

    public final ox d() {
        return this.f;
    }
}
