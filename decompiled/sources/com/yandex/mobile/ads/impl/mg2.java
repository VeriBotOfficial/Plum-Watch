package com.yandex.mobile.ads.impl;

import android.view.View;
import java.util.List;
import kotlin.enums.EnumEntriesKt;

/* loaded from: classes5.dex */
public interface mg2 {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a b;
        public static final a c;
        public static final a d;
        private static final /* synthetic */ a[] e;

        static {
            a aVar = new a(0, "FIRST_QUARTILE");
            b = aVar;
            a aVar2 = new a(1, "MIDPOINT");
            c = aVar2;
            a aVar3 = new a(2, "THIRD_QUARTILE");
            d = aVar3;
            a[] aVarArr = {aVar, aVar2, aVar3};
            e = aVarArr;
            EnumEntriesKt.enumEntries(aVarArr);
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) e.clone();
        }

        private a(int i, String str) {
        }
    }

    void a();

    void a(float f);

    void a(float f, long j);

    void a(View view, List<xb2> list);

    void a(a aVar);

    void a(xc2 xc2Var);

    void a(String str);

    void b();

    void c();

    void d();

    void e();

    void f();

    void g();

    void h();

    void i();

    void j();

    void k();

    void l();

    void m();

    void n();
}
