package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import com.yandex.div.DivDataTag;
import com.yandex.div2.DivData;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* loaded from: classes5.dex */
public final class b30 {

    /* renamed from: a, reason: collision with root package name */
    private final String f15068a;
    private final JSONObject b;
    private final JSONObject c;
    private final List<xj0> d;
    private final DivData e;
    private final DivDataTag f;
    private final Set<s20> g;

    public b30(String target, JSONObject card, JSONObject jSONObject, List<xj0> list, DivData divData, DivDataTag divDataTag, Set<s20> divAssets) {
        Intrinsics.checkNotNullParameter(target, "target");
        Intrinsics.checkNotNullParameter(card, "card");
        Intrinsics.checkNotNullParameter(divData, "divData");
        Intrinsics.checkNotNullParameter(divDataTag, "divDataTag");
        Intrinsics.checkNotNullParameter(divAssets, "divAssets");
        this.f15068a = target;
        this.b = card;
        this.c = jSONObject;
        this.d = list;
        this.e = divData;
        this.f = divDataTag;
        this.g = divAssets;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b30)) {
            return false;
        }
        b30 b30Var = (b30) obj;
        return Intrinsics.areEqual(this.f15068a, b30Var.f15068a) && Intrinsics.areEqual(this.b, b30Var.b) && Intrinsics.areEqual(this.c, b30Var.c) && Intrinsics.areEqual(this.d, b30Var.d) && Intrinsics.areEqual(this.e, b30Var.e) && Intrinsics.areEqual(this.f, b30Var.f) && Intrinsics.areEqual(this.g, b30Var.g);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.f15068a.hashCode() * 31)) * 31;
        JSONObject jSONObject = this.c;
        int hashCode2 = (hashCode + (jSONObject == null ? 0 : jSONObject.hashCode())) * 31;
        List<xj0> list = this.d;
        return this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((hashCode2 + (list != null ? list.hashCode() : 0)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "DivKitDesign(target=" + this.f15068a + ", card=" + this.b + ", templates=" + this.c + ", images=" + this.d + ", divData=" + this.e + ", divDataTag=" + this.f + ", divAssets=" + this.g + Separators.RPAREN;
    }

    public final String e() {
        return this.f15068a;
    }

    public final List<xj0> d() {
        return this.d;
    }

    public final DivData b() {
        return this.e;
    }

    public final DivDataTag c() {
        return this.f;
    }

    public final Set<s20> a() {
        return this.g;
    }
}
