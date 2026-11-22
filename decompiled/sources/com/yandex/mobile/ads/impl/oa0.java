package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class oa0 implements x {

    /* renamed from: a, reason: collision with root package name */
    private final String f16429a;
    private final List<a> b;

    public oa0(String actionType, ArrayList items) {
        Intrinsics.checkNotNullParameter(actionType, "actionType");
        Intrinsics.checkNotNullParameter(items, "items");
        this.f16429a = actionType;
        this.b = items;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oa0)) {
            return false;
        }
        oa0 oa0Var = (oa0) obj;
        return Intrinsics.areEqual(this.f16429a, oa0Var.f16429a) && Intrinsics.areEqual(this.b, oa0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.f16429a.hashCode() * 31);
    }

    public final String toString() {
        return "FeedbackAction(actionType=" + this.f16429a + ", items=" + this.b + Separators.RPAREN;
    }

    @Override // com.yandex.mobile.ads.impl.x
    public final String a() {
        return this.f16429a;
    }

    public final List<a> c() {
        return this.b;
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final String f16430a;
        private final String b;

        public a(String title, String url) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(url, "url");
            this.f16430a = title;
            this.b = url;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.areEqual(this.f16430a, aVar.f16430a) && Intrinsics.areEqual(this.b, aVar.b);
        }

        public final int hashCode() {
            return this.b.hashCode() + (this.f16430a.hashCode() * 31);
        }

        public final String toString() {
            return "Item(title=" + this.f16430a + ", url=" + this.b + Separators.RPAREN;
        }

        public final String a() {
            return this.f16430a;
        }

        public final String b() {
            return this.b;
        }
    }
}
