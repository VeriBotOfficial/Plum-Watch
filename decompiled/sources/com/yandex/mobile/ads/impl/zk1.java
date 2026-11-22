package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class zk1 {

    public static final class b extends zk1 {

        /* renamed from: a, reason: collision with root package name */
        private final n90 f17534a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(n90 feedItem) {
            super(0);
            Intrinsics.checkNotNullParameter(feedItem, "feedItem");
            this.f17534a = feedItem;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.f17534a, ((b) obj).f17534a);
        }

        public final int hashCode() {
            return this.f17534a.hashCode();
        }

        public final String toString() {
            return "Success(feedItem=" + this.f17534a + Separators.RPAREN;
        }
    }

    private zk1() {
    }

    public static final class a extends zk1 {

        /* renamed from: a, reason: collision with root package name */
        private final w3 f17533a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(w3 adRequestError) {
            super(0);
            Intrinsics.checkNotNullParameter(adRequestError, "adRequestError");
            this.f17533a = adRequestError;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f17533a, ((a) obj).f17533a);
        }

        public final int hashCode() {
            return this.f17533a.hashCode();
        }

        public final String toString() {
            return "Failure(adRequestError=" + this.f17533a + Separators.RPAREN;
        }

        public final w3 a() {
            return this.f17533a;
        }
    }

    public /* synthetic */ zk1(int i) {
        this();
    }
}
