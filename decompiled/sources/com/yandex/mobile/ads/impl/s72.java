package com.yandex.mobile.ads.impl;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.SpannableStringBuilder;
import android.util.Base64;
import android.util.Pair;
import com.yandex.mobile.ads.impl.hv;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

/* loaded from: classes5.dex */
final class s72 {

    /* renamed from: a, reason: collision with root package name */
    public final String f16839a;
    public final String b;
    public final boolean c;
    public final long d;
    public final long e;
    public final v72 f;
    private final String[] g;
    public final String h;
    public final String i;
    public final s72 j;
    private final HashMap<String, Integer> k;
    private final HashMap<String, Integer> l;
    private ArrayList m;

    public final long[] b() {
        TreeSet<Long> treeSet = new TreeSet<>();
        int i = 0;
        a(treeSet, false);
        long[] jArr = new long[treeSet.size()];
        Iterator<Long> it = treeSet.iterator();
        while (it.hasNext()) {
            jArr[i] = it.next().longValue();
            i++;
        }
        return jArr;
    }

    private s72(String str, String str2, long j, long j2, v72 v72Var, String[] strArr, String str3, String str4, s72 s72Var) {
        this.f16839a = str;
        this.b = str2;
        this.i = str4;
        this.f = v72Var;
        this.g = strArr;
        this.c = str2 != null;
        this.d = j;
        this.e = j2;
        this.h = (String) hg.a(str3);
        this.j = s72Var;
        this.k = new HashMap<>();
        this.l = new HashMap<>();
    }

    public final void a(s72 s72Var) {
        if (this.m == null) {
            this.m = new ArrayList();
        }
        this.m.add(s72Var);
    }

    public final String[] c() {
        return this.g;
    }

    public final s72 a(int i) {
        ArrayList arrayList = this.m;
        if (arrayList != null) {
            return (s72) arrayList.get(i);
        }
        throw new IndexOutOfBoundsException();
    }

    public final int a() {
        ArrayList arrayList = this.m;
        if (arrayList == null) {
            return 0;
        }
        return arrayList.size();
    }

    private void a(TreeSet<Long> treeSet, boolean z) {
        boolean equals = "p".equals(this.f16839a);
        boolean equals2 = "div".equals(this.f16839a);
        if (z || equals || (equals2 && this.i != null)) {
            long j = this.d;
            if (j != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j));
            }
            long j2 = this.e;
            if (j2 != -9223372036854775807L) {
                treeSet.add(Long.valueOf(j2));
            }
        }
        if (this.m == null) {
            return;
        }
        for (int i = 0; i < this.m.size(); i++) {
            ((s72) this.m.get(i)).a(treeSet, z || equals);
        }
    }

    private static SpannableStringBuilder a(String str, TreeMap treeMap) {
        if (!treeMap.containsKey(str)) {
            hv.a aVar = new hv.a();
            aVar.a(new SpannableStringBuilder());
            treeMap.put(str, aVar);
        }
        CharSequence d = ((hv.a) treeMap.get(str)).d();
        d.getClass();
        return (SpannableStringBuilder) d;
    }

    public final boolean a(long j) {
        long j2 = this.d;
        if (j2 == -9223372036854775807L && this.e == -9223372036854775807L) {
            return true;
        }
        if (j2 <= j && this.e == -9223372036854775807L) {
            return true;
        }
        if (j2 != -9223372036854775807L || j >= this.e) {
            return j2 <= j && j < this.e;
        }
        return true;
    }

    private void a(long j, String str, ArrayList arrayList) {
        if (!"".equals(this.h)) {
            str = this.h;
        }
        if (a(j) && "div".equals(this.f16839a) && this.i != null) {
            arrayList.add(new Pair(str, this.i));
            return;
        }
        for (int i = 0; i < a(); i++) {
            a(i).a(j, str, arrayList);
        }
    }

    private void a(long j, Map map, Map map2, String str, TreeMap treeMap) {
        if (a(j)) {
            String str2 = "".equals(this.h) ? str : this.h;
            Iterator<Map.Entry<String, Integer>> it = this.l.entrySet().iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                Map.Entry<String, Integer> next = it.next();
                String key = next.getKey();
                int intValue = this.k.containsKey(key) ? this.k.get(key).intValue() : 0;
                int intValue2 = next.getValue().intValue();
                if (intValue != intValue2) {
                    hv.a aVar = (hv.a) treeMap.get(key);
                    aVar.getClass();
                    t72 t72Var = (t72) map2.get(str2);
                    t72Var.getClass();
                    int i = t72Var.j;
                    v72 a2 = u72.a(this.f, this.g, map);
                    SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) aVar.d();
                    if (spannableStringBuilder == null) {
                        spannableStringBuilder = new SpannableStringBuilder();
                        aVar.a(spannableStringBuilder);
                    }
                    SpannableStringBuilder spannableStringBuilder2 = spannableStringBuilder;
                    if (a2 != null) {
                        u72.a(spannableStringBuilder2, intValue, intValue2, a2, this.j, map, i);
                        if ("p".equals(this.f16839a)) {
                            if (a2.j() != Float.MAX_VALUE) {
                                aVar.c((a2.j() * (-90.0f)) / 100.0f);
                            }
                            if (a2.l() != null) {
                                aVar.b(a2.l());
                            }
                            if (a2.g() != null) {
                                aVar.a(a2.g());
                            }
                        }
                    }
                }
            }
            for (int i2 = 0; i2 < a(); i2++) {
                a(i2).a(j, map, map2, str2, treeMap);
            }
        }
    }

    private void a(long j, boolean z, String str, TreeMap treeMap) {
        boolean z2;
        TreeMap treeMap2;
        long j2;
        this.k.clear();
        this.l.clear();
        if ("metadata".equals(this.f16839a)) {
            return;
        }
        if (!"".equals(this.h)) {
            str = this.h;
        }
        String str2 = str;
        if (this.c && z) {
            SpannableStringBuilder a2 = a(str2, treeMap);
            String str3 = this.b;
            str3.getClass();
            a2.append((CharSequence) str3);
            return;
        }
        if ("br".equals(this.f16839a) && z) {
            a(str2, treeMap).append('\n');
            return;
        }
        if (a(j)) {
            for (Map.Entry entry : treeMap.entrySet()) {
                HashMap<String, Integer> hashMap = this.k;
                String str4 = (String) entry.getKey();
                CharSequence d = ((hv.a) entry.getValue()).d();
                d.getClass();
                hashMap.put(str4, Integer.valueOf(d.length()));
            }
            boolean equals = "p".equals(this.f16839a);
            int i = 0;
            while (i < a()) {
                s72 a3 = a(i);
                if (z || equals) {
                    z2 = true;
                    treeMap2 = treeMap;
                    j2 = j;
                } else {
                    z2 = false;
                    j2 = j;
                    treeMap2 = treeMap;
                }
                a3.a(j2, z2, str2, treeMap2);
                j = j2;
                i++;
                treeMap = treeMap2;
            }
            TreeMap treeMap3 = treeMap;
            if (equals) {
                SpannableStringBuilder a4 = a(str2, treeMap3);
                int length = a4.length() - 1;
                while (length >= 0 && a4.charAt(length) == ' ') {
                    length--;
                }
                if (length >= 0 && a4.charAt(length) != '\n') {
                    a4.append('\n');
                }
            }
            for (Map.Entry entry2 : treeMap3.entrySet()) {
                HashMap<String, Integer> hashMap2 = this.l;
                String str5 = (String) entry2.getKey();
                CharSequence d2 = ((hv.a) entry2.getValue()).d();
                d2.getClass();
                hashMap2.put(str5, Integer.valueOf(d2.length()));
            }
        }
    }

    public static s72 a(String str) {
        return new s72(null, str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " "), -9223372036854775807L, -9223372036854775807L, null, null, "", null, null);
    }

    public static s72 a(String str, long j, long j2, v72 v72Var, String[] strArr, String str2, String str3, s72 s72Var) {
        return new s72(str, null, j, j2, v72Var, strArr, str2, str3, s72Var);
    }

    public final ArrayList a(long j, Map map, Map map2, Map map3) {
        ArrayList arrayList = new ArrayList();
        a(j, this.h, arrayList);
        TreeMap treeMap = new TreeMap();
        a(j, false, this.h, treeMap);
        a(j, map, map2, this.h, treeMap);
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Pair pair = (Pair) it.next();
            String str = (String) map3.get(pair.second);
            if (str != null) {
                byte[] decode = Base64.decode(str, 0);
                Bitmap decodeByteArray = BitmapFactory.decodeByteArray(decode, 0, decode.length);
                t72 t72Var = (t72) map2.get(pair.first);
                t72Var.getClass();
                arrayList2.add(new hv.a().a(decodeByteArray).b(t72Var.b).b(0).a(0, t72Var.c).a(t72Var.e).d(t72Var.f).a(t72Var.g).c(t72Var.j).a());
            }
        }
        for (Map.Entry entry : treeMap.entrySet()) {
            t72 t72Var2 = (t72) map2.get(entry.getKey());
            t72Var2.getClass();
            hv.a aVar = (hv.a) entry.getValue();
            CharSequence d = aVar.d();
            d.getClass();
            SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) d;
            for (z00 z00Var : (z00[]) spannableStringBuilder.getSpans(0, spannableStringBuilder.length(), z00.class)) {
                spannableStringBuilder.replace(spannableStringBuilder.getSpanStart(z00Var), spannableStringBuilder.getSpanEnd(z00Var), (CharSequence) "");
            }
            for (int i = 0; i < spannableStringBuilder.length(); i++) {
                if (spannableStringBuilder.charAt(i) == ' ') {
                    int i2 = i + 1;
                    int i3 = i2;
                    while (i3 < spannableStringBuilder.length() && spannableStringBuilder.charAt(i3) == ' ') {
                        i3++;
                    }
                    int i4 = i3 - i2;
                    if (i4 > 0) {
                        spannableStringBuilder.delete(i, i4 + i);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(0) == ' ') {
                spannableStringBuilder.delete(0, 1);
            }
            for (int i5 = 0; i5 < spannableStringBuilder.length() - 1; i5++) {
                if (spannableStringBuilder.charAt(i5) == '\n') {
                    int i6 = i5 + 1;
                    if (spannableStringBuilder.charAt(i6) == ' ') {
                        spannableStringBuilder.delete(i6, i5 + 2);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == ' ') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            for (int i7 = 0; i7 < spannableStringBuilder.length() - 1; i7++) {
                if (spannableStringBuilder.charAt(i7) == ' ') {
                    int i8 = i7 + 1;
                    if (spannableStringBuilder.charAt(i8) == '\n') {
                        spannableStringBuilder.delete(i7, i8);
                    }
                }
            }
            if (spannableStringBuilder.length() > 0 && spannableStringBuilder.charAt(spannableStringBuilder.length() - 1) == '\n') {
                spannableStringBuilder.delete(spannableStringBuilder.length() - 1, spannableStringBuilder.length());
            }
            aVar.a(t72Var2.d, t72Var2.c);
            aVar.a(t72Var2.e);
            aVar.b(t72Var2.b);
            aVar.d(t72Var2.f);
            aVar.b(t72Var2.h, t72Var2.i);
            aVar.c(t72Var2.j);
            arrayList2.add(aVar.a());
        }
        return arrayList2;
    }
}
