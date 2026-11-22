package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class gy {

    /* renamed from: a, reason: collision with root package name */
    private final gy f15637a;
    private final fx b;
    private final boolean c;
    private final List<iy> d;

    /* JADX WARN: Multi-variable type inference failed */
    public gy(gy gyVar, fx destination, boolean z, List<? extends iy> uiData) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(uiData, "uiData");
        this.f15637a = gyVar;
        this.b = destination;
        this.c = z;
        this.d = uiData;
    }

    public static gy a(gy gyVar, gy gyVar2, fx destination, boolean z, List uiData, int i) {
        if ((i & 1) != 0) {
            gyVar2 = gyVar.f15637a;
        }
        if ((i & 2) != 0) {
            destination = gyVar.b;
        }
        if ((i & 4) != 0) {
            z = gyVar.c;
        }
        if ((i & 8) != 0) {
            uiData = gyVar.d;
        }
        gyVar.getClass();
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(uiData, "uiData");
        return new gy(gyVar2, destination, z, uiData);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gy)) {
            return false;
        }
        gy gyVar = (gy) obj;
        return Intrinsics.areEqual(this.f15637a, gyVar.f15637a) && Intrinsics.areEqual(this.b, gyVar.b) && this.c == gyVar.c && Intrinsics.areEqual(this.d, gyVar.d);
    }

    public final int hashCode() {
        gy gyVar = this.f15637a;
        return this.d.hashCode() + a7.a(this.c, (this.b.hashCode() + ((gyVar == null ? 0 : gyVar.hashCode()) * 31)) * 31, 31);
    }

    public final String toString() {
        return "DebugPanelUiState(prevState=" + this.f15637a + ", destination=" + this.b + ", isLoading=" + this.c + ", uiData=" + this.d + Separators.RPAREN;
    }

    public final gy b() {
        return this.f15637a;
    }

    public final boolean d() {
        return this.c;
    }

    public final fx a() {
        return this.b;
    }

    public final List<iy> c() {
        return this.d;
    }
}
