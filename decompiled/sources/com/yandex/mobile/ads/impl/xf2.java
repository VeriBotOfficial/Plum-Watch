package com.yandex.mobile.ads.impl;

import android.graphics.Matrix;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class xf2 {

    /* renamed from: a, reason: collision with root package name */
    private final fz1 f17333a;
    private final fz1 b;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    private static final class a {
        public static final a b;
        public static final a c;
        private static final /* synthetic */ a[] d;

        static {
            a aVar = new a(0, "LEFT_TOP");
            b = aVar;
            a aVar2 = new a(1, "CENTER");
            c = aVar2;
            a[] aVarArr = {aVar, aVar2};
            d = aVarArr;
            EnumEntriesKt.enumEntries(aVarArr);
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) d.clone();
        }

        private a(int i, String str) {
        }
    }

    public xf2(fz1 viewSize, fz1 videoSize) {
        Intrinsics.checkNotNullParameter(viewSize, "viewSize");
        Intrinsics.checkNotNullParameter(videoSize, "videoSize");
        this.f17333a = viewSize;
        this.b = videoSize;
    }

    private final Matrix a(float f, float f2, a aVar) {
        int ordinal = aVar.ordinal();
        if (ordinal == 0) {
            Matrix matrix = new Matrix();
            matrix.setScale(f, f2, 0.0f, 0.0f);
            return matrix;
        }
        if (ordinal == 1) {
            Matrix matrix2 = new Matrix();
            matrix2.setScale(f, f2, this.f17333a.b() / 2.0f, this.f17333a.a() / 2.0f);
            return matrix2;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final Matrix a(yf2 videoScaleType) {
        Intrinsics.checkNotNullParameter(videoScaleType, "videoScaleType");
        fz1 fz1Var = this.b;
        if (fz1Var.b() <= 0 || fz1Var.a() <= 0) {
            return null;
        }
        fz1 fz1Var2 = this.f17333a;
        if (fz1Var2.b() <= 0 || fz1Var2.a() <= 0) {
            return null;
        }
        int ordinal = videoScaleType.ordinal();
        if (ordinal == 0) {
            return a(1.0f, 1.0f, a.b);
        }
        if (ordinal == 1) {
            float b = this.f17333a.b() / this.b.b();
            float a2 = this.f17333a.a() / this.b.a();
            float min = Math.min(b, a2);
            return a(min / b, min / a2, a.c);
        }
        if (ordinal == 2) {
            float b2 = this.f17333a.b() / this.b.b();
            float a3 = this.f17333a.a() / this.b.a();
            float max = Math.max(b2, a3);
            return a(max / b2, max / a3, a.c);
        }
        throw new NoWhenBranchMatchedException();
    }
}
