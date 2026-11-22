package com.yandex.mobile.ads.impl;

import android.text.SpannableStringBuilder;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayDeque;
import java.util.Map;

/* loaded from: classes5.dex */
final class u72 {
    public static void a(SpannableStringBuilder spannableStringBuilder, int i, int i2, v72 v72Var, s72 s72Var, Map map, int i3) {
        s72 s72Var2;
        if (v72Var.k() != -1) {
            spannableStringBuilder.setSpan(new StyleSpan(v72Var.k()), i, i2, 33);
        }
        if (v72Var.q()) {
            spannableStringBuilder.setSpan(new StrikethroughSpan(), i, i2, 33);
        }
        if (v72Var.r()) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
        }
        if (v72Var.p()) {
            o12.a(spannableStringBuilder, new ForegroundColorSpan(v72Var.b()), i, i2);
        }
        if (v72Var.o()) {
            o12.a(spannableStringBuilder, new BackgroundColorSpan(v72Var.a()), i, i2);
        }
        if (v72Var.c() != null) {
            o12.a(spannableStringBuilder, new TypefaceSpan(v72Var.c()), i, i2);
        }
        if (v72Var.n() != null) {
            r42 n = v72Var.n();
            n.getClass();
            int i4 = n.f16728a;
            o12.a(spannableStringBuilder, new s42(), i, i2);
        }
        int i5 = v72Var.i();
        if (i5 == 2) {
            while (true) {
                s72Var2 = null;
                if (s72Var == null) {
                    s72Var = null;
                    break;
                }
                v72 a2 = a(s72Var.f, s72Var.c(), map);
                if (a2 != null && a2.i() == 1) {
                    break;
                } else {
                    s72Var = s72Var.j;
                }
            }
            if (s72Var != null) {
                ArrayDeque arrayDeque = new ArrayDeque();
                arrayDeque.push(s72Var);
                while (true) {
                    if (arrayDeque.isEmpty()) {
                        break;
                    }
                    s72 s72Var3 = (s72) arrayDeque.pop();
                    v72 a3 = a(s72Var3.f, s72Var3.c(), map);
                    if (a3 != null && a3.i() == 3) {
                        s72Var2 = s72Var3;
                        break;
                    }
                    for (int a4 = s72Var3.a() - 1; a4 >= 0; a4--) {
                        arrayDeque.push(s72Var3.a(a4));
                    }
                }
                if (s72Var2 != null) {
                    if (s72Var2.a() != 1 || s72Var2.a(0).b == null) {
                        et0.c("TtmlRenderUtil", "Skipping rubyText node without exactly one text child.");
                    } else {
                        String str = s72Var2.a(0).b;
                        int i6 = f92.f15466a;
                        v72 a5 = a(s72Var2.f, s72Var2.c(), map);
                        if (a5 == null || a5.h() == -1) {
                            a(s72Var.f, s72Var.c(), map);
                        }
                        spannableStringBuilder.setSpan(new zs1(), i, i2, 33);
                    }
                }
            }
        } else if (i5 == 3 || i5 == 4) {
            spannableStringBuilder.setSpan(new z00(), i, i2, 33);
        }
        if (v72Var.m()) {
            o12.a(spannableStringBuilder, new yf0(), i, i2);
        }
        int e = v72Var.e();
        if (e == 1) {
            o12.a(spannableStringBuilder, new AbsoluteSizeSpan((int) v72Var.d(), true), i, i2);
        } else if (e == 2) {
            o12.a(spannableStringBuilder, new RelativeSizeSpan(v72Var.d()), i, i2);
        } else {
            if (e != 3) {
                return;
            }
            o12.a(spannableStringBuilder, new RelativeSizeSpan(v72Var.d() / 100.0f), i, i2);
        }
    }

    public static v72 a(v72 v72Var, String[] strArr, Map<String, v72> map) {
        int i = 0;
        if (v72Var == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                v72 v72Var2 = new v72();
                int length = strArr.length;
                while (i < length) {
                    v72Var2.a(map.get(strArr[i]));
                    i++;
                }
                return v72Var2;
            }
        } else {
            if (strArr != null && strArr.length == 1) {
                return v72Var.a(map.get(strArr[0]));
            }
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    v72Var.a(map.get(strArr[i]));
                    i++;
                }
            }
        }
        return v72Var;
    }
}
