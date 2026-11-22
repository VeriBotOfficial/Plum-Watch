package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class aa0 {
    private aa0() {
    }

    public static final class b extends aa0 {

        /* renamed from: a, reason: collision with root package name */
        private final gs0 f14985a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(gs0 feedItem) {
            super(0);
            Intrinsics.checkNotNullParameter(feedItem, "feedItem");
            this.f14985a = feedItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.f14985a, ((b) obj).f14985a);
        }

        public final int hashCode() {
            return this.f14985a.hashCode();
        }

        public final String toString() {
            return "Success(feedItem=" + this.f14985a + Separators.RPAREN;
        }

        public final gs0 a() {
            return this.f14985a;
        }
    }

    public static final class a extends aa0 {

        /* renamed from: a, reason: collision with root package name */
        private final w3 f14984a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(w3 adRequestError) {
            super(0);
            Intrinsics.checkNotNullParameter(adRequestError, "adRequestError");
            this.f14984a = adRequestError;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f14984a, ((a) obj).f14984a);
        }

        public final int hashCode() {
            return this.f14984a.hashCode();
        }

        public final String toString() {
            return "Failure(adRequestError=" + this.f14984a + Separators.RPAREN;
        }

        public final w3 a() {
            return this.f14984a;
        }
    }

    public /* synthetic */ aa0(int i) {
        this();
    }
}
