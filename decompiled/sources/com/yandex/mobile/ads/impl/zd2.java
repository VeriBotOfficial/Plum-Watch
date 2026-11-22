package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class zd2 {

    public static final class a extends zd2 {

        /* renamed from: a, reason: collision with root package name */
        private final sb2 f17508a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(sb2 error) {
            super(0);
            Intrinsics.checkNotNullParameter(error, "error");
            this.f17508a = error;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.areEqual(this.f17508a, ((a) obj).f17508a);
        }

        public final int hashCode() {
            return this.f17508a.hashCode();
        }

        public final String toString() {
            return "Error(error=" + this.f17508a + Separators.RPAREN;
        }
    }

    public static final class b extends zd2 {

        /* renamed from: a, reason: collision with root package name */
        private final List<mb2> f17509a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(List<mb2> result) {
            super(0);
            Intrinsics.checkNotNullParameter(result, "result");
            this.f17509a = result;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.areEqual(this.f17509a, ((b) obj).f17509a);
        }

        public final int hashCode() {
            return this.f17509a.hashCode();
        }

        public final String toString() {
            return "Success(result=" + this.f17509a + Separators.RPAREN;
        }

        public final List<mb2> a() {
            return this.f17509a;
        }
    }

    private zd2() {
    }

    public /* synthetic */ zd2(int i) {
        this();
    }
}
