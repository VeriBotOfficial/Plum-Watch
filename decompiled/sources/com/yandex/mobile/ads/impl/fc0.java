package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.graphics.Typeface;
import androidx.core.content.res.ResourcesCompat;
import com.yandex.mobile.ads.R;
import com.yandex.mobile.ads.impl.pw1;
import kotlin.NoWhenBranchMatchedException;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class fc0 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ a[] f;
        public static final /* synthetic */ int g = 0;
        private final int b;
        private final int c;
        private final int d;
        private final int e;

        static {
            a[] aVarArr = {new a(R.font.monetization_ads_internal_font_light, R.font.monetization_ads_internal_font_regular, R.font.monetization_ads_internal_font_medium, R.font.monetization_ads_internal_font_bold)};
            f = aVarArr;
            EnumEntriesKt.enumEntries(aVarArr);
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f.clone();
        }

        private a(int i, int i2, int i3, int i4) {
            this.b = i;
            this.c = i2;
            this.d = i3;
            this.e = i4;
        }

        public final int a() {
            return this.e;
        }

        public final int b() {
            return this.b;
        }

        public final int c() {
            return this.d;
        }

        public final int d() {
            return this.c;
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f15474a;

        static {
            int[] iArr = new int[a.values().length];
            try {
                int i = a.g;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f15474a = iArr;
        }
    }

    public static ec0 a(Context context) {
        Typeface typeface;
        Typeface typeface2;
        Typeface typeface3;
        Typeface typeface4;
        Intrinsics.checkNotNullParameter(context, "context");
        int i = pw1.l;
        ju1 a2 = pw1.a.a().a(context);
        String t = a2 != null ? a2.t() : null;
        if (t == null) {
            return null;
        }
        try {
            a valueOf = a.valueOf(t);
            if (b.f15474a[valueOf.ordinal()] != 1) {
                throw new NoWhenBranchMatchedException();
            }
            try {
                typeface = ResourcesCompat.getFont(context, valueOf.b());
            } catch (Throwable unused) {
                typeface = null;
            }
            try {
                typeface2 = ResourcesCompat.getFont(context, valueOf.d());
            } catch (Throwable unused2) {
                typeface2 = null;
            }
            try {
                typeface3 = ResourcesCompat.getFont(context, valueOf.c());
            } catch (Throwable unused3) {
                typeface3 = null;
            }
            try {
                typeface4 = ResourcesCompat.getFont(context, valueOf.a());
            } catch (Throwable unused4) {
                typeface4 = null;
            }
            return new ec0(typeface, typeface2, typeface3, typeface4);
        } catch (Throwable unused5) {
            return null;
        }
    }
}
