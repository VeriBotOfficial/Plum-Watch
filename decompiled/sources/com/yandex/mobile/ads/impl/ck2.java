package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import android.graphics.Color;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import androidx.media3.extractor.text.ttml.TtmlNode;
import com.anythink.basead.webtemplet.a.b;
import com.wakeup.common.functionSwitch.FunctionSwitchManager;
import com.yandex.mobile.ads.impl.ck2;
import com.yandex.mobile.ads.impl.hv;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.text.Typography;
import org.xmind.core.internal.dom.DOMConstants;

/* loaded from: classes5.dex */
public final class ck2 {

    /* renamed from: a, reason: collision with root package name */
    public static final Pattern f15197a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");
    private static final Pattern b = Pattern.compile("(\\S+?):(\\S+)");
    private static final Map<String, Integer> c;
    private static final Map<String, Integer> d;

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap.put("red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(255, 255, 255)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, 255, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, 255, 255)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(255, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(255, 255, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(255, 0, 255)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, 255)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        d = Collections.unmodifiableMap(hashMap2);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    private static void a(SpannableStringBuilder spannableStringBuilder, b bVar, String str, List list, List list2) {
        char c2;
        int i;
        ArrayList arrayList;
        int i2 = bVar.b;
        int length = spannableStringBuilder.length();
        String str2 = bVar.f15199a;
        str2.getClass();
        str2.hashCode();
        switch (str2.hashCode()) {
            case 0:
                if (str2.equals("")) {
                    c2 = 0;
                    break;
                }
                c2 = 65535;
                break;
            case 98:
                if (str2.equals("b")) {
                    c2 = 1;
                    break;
                }
                c2 = 65535;
                break;
            case 99:
                if (str2.equals("c")) {
                    c2 = 2;
                    break;
                }
                c2 = 65535;
                break;
            case 105:
                if (str2.equals("i")) {
                    c2 = 3;
                    break;
                }
                c2 = 65535;
                break;
            case 117:
                if (str2.equals(com.umeng.analytics.pro.ak.aG)) {
                    c2 = 4;
                    break;
                }
                c2 = 65535;
                break;
            case 118:
                if (str2.equals("v")) {
                    c2 = 5;
                    break;
                }
                c2 = 65535;
                break;
            case 3314158:
                if (str2.equals(b.c.j)) {
                    c2 = 6;
                    break;
                }
                c2 = 65535;
                break;
            case 3511770:
                if (str2.equals(TtmlNode.ATTR_TTS_RUBY)) {
                    c2 = 7;
                    break;
                }
                c2 = 65535;
                break;
            default:
                c2 = 65535;
                break;
        }
        switch (c2) {
            case 0:
            case 5:
            case 6:
                break;
            case 1:
                spannableStringBuilder.setSpan(new StyleSpan(1), i2, length, 33);
                break;
            case 2:
                for (String str3 : bVar.d) {
                    Map<String, Integer> map = c;
                    if (map.containsKey(str3)) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(map.get(str3).intValue()), i2, length, 33);
                    } else {
                        Map<String, Integer> map2 = d;
                        if (map2.containsKey(str3)) {
                            spannableStringBuilder.setSpan(new BackgroundColorSpan(map2.get(str3).intValue()), i2, length, 33);
                        }
                    }
                }
                break;
            case 3:
                spannableStringBuilder.setSpan(new StyleSpan(2), i2, length, 33);
                break;
            case 4:
                spannableStringBuilder.setSpan(new UnderlineSpan(), i2, length, 33);
                break;
            case 7:
                ArrayList arrayList2 = new ArrayList();
                for (int i3 = 0; i3 < list2.size(); i3++) {
                    ak2 ak2Var = (ak2) list2.get(i3);
                    int a2 = ak2Var.a(str, bVar.f15199a, bVar.d, bVar.c);
                    if (a2 > 0) {
                        arrayList2.add(new c(a2, ak2Var));
                    }
                }
                Collections.sort(arrayList2);
                for (int i4 = 0; i4 < arrayList2.size() && ((c) arrayList2.get(i4)).c.g() == -1; i4++) {
                }
                ArrayList arrayList3 = new ArrayList(list.size());
                arrayList3.addAll(list);
                Collections.sort(arrayList3, a.c);
                int i5 = bVar.b;
                int i6 = 0;
                int i7 = 0;
                while (i6 < arrayList3.size()) {
                    if ("rt".equals(((a) arrayList3.get(i6)).f15198a.f15199a)) {
                        a aVar = (a) arrayList3.get(i6);
                        b bVar2 = aVar.f15198a;
                        ArrayList arrayList4 = new ArrayList();
                        int i8 = 0;
                        while (i8 < list2.size()) {
                            ak2 ak2Var2 = (ak2) list2.get(i8);
                            ArrayList arrayList5 = arrayList3;
                            int i9 = i8;
                            int a3 = ak2Var2.a(str, bVar2.f15199a, bVar2.d, bVar2.c);
                            if (a3 > 0) {
                                arrayList4.add(new c(a3, ak2Var2));
                            }
                            i8 = i9 + 1;
                            arrayList3 = arrayList5;
                        }
                        arrayList = arrayList3;
                        Collections.sort(arrayList4);
                        int i10 = 0;
                        while (true) {
                            if (i10 < arrayList4.size()) {
                                ak2 ak2Var3 = ((c) arrayList4.get(i10)).c;
                                if (ak2Var3.g() != -1) {
                                    ak2Var3.g();
                                } else {
                                    i10++;
                                }
                            }
                        }
                        int i11 = aVar.f15198a.b - i7;
                        int i12 = aVar.b - i7;
                        CharSequence subSequence = spannableStringBuilder.subSequence(i11, i12);
                        spannableStringBuilder.delete(i11, i12);
                        subSequence.toString();
                        spannableStringBuilder.setSpan(new zs1(), i5, i11, 33);
                        i7 += subSequence.length();
                        i5 = i11;
                    } else {
                        arrayList = arrayList3;
                    }
                    i6++;
                    arrayList3 = arrayList;
                }
                break;
            default:
                return;
        }
        ArrayList arrayList6 = new ArrayList();
        for (int i13 = 0; i13 < list2.size(); i13++) {
            ak2 ak2Var4 = (ak2) list2.get(i13);
            int a4 = ak2Var4.a(str, bVar.f15199a, bVar.d, bVar.c);
            if (a4 > 0) {
                arrayList6.add(new c(a4, ak2Var4));
            }
        }
        Collections.sort(arrayList6);
        for (int i14 = 0; i14 < arrayList6.size(); i14++) {
            ak2 ak2Var5 = ((c) arrayList6.get(i14)).c;
            if (ak2Var5 != null) {
                if (ak2Var5.h() != -1) {
                    o12.a(spannableStringBuilder, new StyleSpan(ak2Var5.h()), i2, length);
                }
                if (ak2Var5.k()) {
                    i = 33;
                    spannableStringBuilder.setSpan(new StrikethroughSpan(), i2, length, 33);
                } else {
                    i = 33;
                }
                if (ak2Var5.l()) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i2, length, i);
                }
                if (ak2Var5.j()) {
                    o12.a(spannableStringBuilder, new ForegroundColorSpan(ak2Var5.c()), i2, length);
                }
                if (ak2Var5.i()) {
                    o12.a(spannableStringBuilder, new BackgroundColorSpan(ak2Var5.a()), i2, length);
                }
                if (ak2Var5.d() != null) {
                    o12.a(spannableStringBuilder, new TypefaceSpan(ak2Var5.d()), i2, length);
                }
                int f = ak2Var5.f();
                if (f == 1) {
                    o12.a(spannableStringBuilder, new AbsoluteSizeSpan((int) ak2Var5.e(), true), i2, length);
                } else if (f == 2) {
                    o12.a(spannableStringBuilder, new RelativeSizeSpan(ak2Var5.e()), i2, length);
                } else if (f == 3) {
                    o12.a(spannableStringBuilder, new RelativeSizeSpan(ak2Var5.e() / 100.0f), i2, length);
                }
                if (ak2Var5.b()) {
                    spannableStringBuilder.setSpan(new yf0(), i2, length, 33);
                }
            }
        }
    }

    public static bk2 a(ag1 ag1Var, ArrayList arrayList) {
        String j = ag1Var.j();
        if (j == null) {
            return null;
        }
        Pattern pattern = f15197a;
        Matcher matcher = pattern.matcher(j);
        if (matcher.matches()) {
            return a(null, matcher, ag1Var, arrayList);
        }
        String j2 = ag1Var.j();
        if (j2 == null) {
            return null;
        }
        Matcher matcher2 = pattern.matcher(j2);
        if (matcher2.matches()) {
            return a(j.trim(), matcher2, ag1Var, arrayList);
        }
        return null;
    }

    private static bk2 a(String str, Matcher matcher, ag1 ag1Var, ArrayList arrayList) {
        d dVar = new d();
        try {
            String group = matcher.group(1);
            group.getClass();
            dVar.f15200a = ek2.a(group);
            String group2 = matcher.group(2);
            group2.getClass();
            dVar.b = ek2.a(group2);
            String group3 = matcher.group(3);
            group3.getClass();
            a(group3, dVar);
            StringBuilder sb = new StringBuilder();
            String j = ag1Var.j();
            while (!TextUtils.isEmpty(j)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(j.trim());
                j = ag1Var.j();
            }
            dVar.c = a(str, sb.toString(), arrayList);
            return new bk2(dVar.a().a(), dVar.f15200a, dVar.b);
        } catch (NumberFormatException unused) {
            et0.d("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    private static void b(String str, d dVar) {
        String substring;
        int i;
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            substring = str.substring(indexOf + 1);
            substring.getClass();
            substring.hashCode();
            i = 2;
            switch (substring) {
                case "center":
                case "middle":
                    i = 1;
                    break;
                case "end":
                    break;
                case "start":
                    i = 0;
                    break;
                default:
                    et0.d("WebvttCueParser", "Invalid anchor value: ".concat(substring));
                    i = Integer.MIN_VALUE;
                    break;
            }
            dVar.g = i;
            str = str.substring(0, indexOf);
        }
        if (str.endsWith(Separators.PERCENT)) {
            int i2 = ek2.f15393a;
            if (str.endsWith(Separators.PERCENT)) {
                dVar.e = Float.parseFloat(str.substring(0, str.length() - 1)) / 100.0f;
                dVar.f = 0;
                return;
            }
            throw new NumberFormatException("Percentages must end with %");
        }
        dVar.e = Integer.parseInt(str);
        dVar.f = 1;
    }

    static hv.a a(String str) {
        d dVar = new d();
        a(str, dVar);
        return dVar.a();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    static SpannedString a(String str, String str2, List<ak2> list) {
        int i;
        String str3;
        String substring;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i2 = 0;
        int i3 = 0;
        while (i3 < str2.length()) {
            char charAt = str2.charAt(i3);
            if (charAt == '&') {
                i3++;
                int indexOf = str2.indexOf(59, i3);
                int indexOf2 = str2.indexOf(32, i3);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    substring = str2.substring(i3, indexOf);
                    substring.getClass();
                    substring.hashCode();
                    switch (substring) {
                        case "gt":
                            spannableStringBuilder.append(Typography.greater);
                            break;
                        case "lt":
                            spannableStringBuilder.append(Typography.less);
                            break;
                        case "amp":
                            spannableStringBuilder.append(Typography.amp);
                            break;
                        case "nbsp":
                            spannableStringBuilder.append(' ');
                            break;
                        default:
                            et0.d("WebvttCueParser", "ignoring unsupported entity: '&" + substring + ";'");
                            break;
                    }
                    if (indexOf == indexOf2) {
                        spannableStringBuilder.append((CharSequence) " ");
                    }
                    i3 = indexOf + 1;
                } else {
                    spannableStringBuilder.append(charAt);
                }
                i2 = 0;
            } else if (charAt != '<') {
                spannableStringBuilder.append(charAt);
                i3++;
            } else {
                int i4 = i3 + 1;
                if (i4 < str2.length()) {
                    int i5 = str2.charAt(i4) == '/' ? 1 : i2;
                    int indexOf3 = str2.indexOf(62, i4);
                    i4 = indexOf3 == -1 ? str2.length() : indexOf3 + 1;
                    int i6 = i4 - 2;
                    int i7 = str2.charAt(i6) == '/' ? 1 : i2;
                    int i8 = i3 + (i5 != 0 ? 2 : 1);
                    if (i7 == 0) {
                        i6 = i4 - 1;
                    }
                    String substring2 = str2.substring(i8, i6);
                    if (!substring2.trim().isEmpty()) {
                        String trim = substring2.trim();
                        if (!trim.isEmpty()) {
                            int i9 = f92.f15466a;
                            String str4 = trim.split("[ \\.]", 2)[i2];
                            str4.getClass();
                            str4.hashCode();
                            switch (str4.hashCode()) {
                                case 98:
                                    if (str4.equals("b")) {
                                        i = i2;
                                        break;
                                    }
                                    i = -1;
                                    break;
                                case 99:
                                    if (str4.equals("c")) {
                                        i = 1;
                                        break;
                                    }
                                    i = -1;
                                    break;
                                case 105:
                                    if (str4.equals("i")) {
                                        i = 2;
                                        break;
                                    }
                                    i = -1;
                                    break;
                                case 117:
                                    if (str4.equals(com.umeng.analytics.pro.ak.aG)) {
                                        i = 3;
                                        break;
                                    }
                                    i = -1;
                                    break;
                                case 118:
                                    if (str4.equals("v")) {
                                        i = 4;
                                        break;
                                    }
                                    i = -1;
                                    break;
                                case 3650:
                                    if (str4.equals("rt")) {
                                        i = 5;
                                        break;
                                    }
                                    i = -1;
                                    break;
                                case 3314158:
                                    if (str4.equals(b.c.j)) {
                                        i = 6;
                                        break;
                                    }
                                    i = -1;
                                    break;
                                case 3511770:
                                    if (str4.equals(TtmlNode.ATTR_TTS_RUBY)) {
                                        i = 7;
                                        break;
                                    }
                                    i = -1;
                                    break;
                                default:
                                    i = -1;
                                    break;
                            }
                            switch (i) {
                                case 0:
                                case 1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                case 7:
                                    if (i5 != 0) {
                                        while (!arrayDeque.isEmpty()) {
                                            b bVar = (b) arrayDeque.pop();
                                            a(spannableStringBuilder, bVar, str, arrayList, list);
                                            if (!arrayDeque.isEmpty()) {
                                                arrayList.add(new a(bVar, spannableStringBuilder.length()));
                                            } else {
                                                arrayList.clear();
                                            }
                                            if (bVar.f15199a.equals(str4)) {
                                            }
                                        }
                                    } else if (i7 == 0) {
                                        int length = spannableStringBuilder.length();
                                        String trim2 = substring2.trim();
                                        if (!trim2.isEmpty()) {
                                            int indexOf4 = trim2.indexOf(" ");
                                            if (indexOf4 == -1) {
                                                str3 = "";
                                            } else {
                                                String trim3 = trim2.substring(indexOf4).trim();
                                                trim2 = trim2.substring(i2, indexOf4);
                                                str3 = trim3;
                                            }
                                            String[] split = trim2.split("\\.", -1);
                                            String str5 = split[i2];
                                            HashSet hashSet = new HashSet();
                                            for (int i10 = 1; i10 < split.length; i10++) {
                                                hashSet.add(split[i10]);
                                            }
                                            arrayDeque.push(new b(str5, length, str3, hashSet));
                                        } else {
                                            throw new IllegalArgumentException();
                                        }
                                    }
                                default:
                                    i3 = i4;
                                    break;
                            }
                        } else {
                            throw new IllegalArgumentException();
                        }
                    }
                }
                i3 = i4;
            }
        }
        while (!arrayDeque.isEmpty()) {
            a(spannableStringBuilder, (b) arrayDeque.pop(), str, arrayList, list);
        }
        a(spannableStringBuilder, new b("", 0, "", Collections.emptySet()), str, Collections.emptyList(), list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
    java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
     */
    private static void a(String str, d dVar) {
        int i;
        int i2;
        int i3;
        Matcher matcher = b.matcher(str);
        while (matcher.find()) {
            String group = matcher.group(1);
            group.getClass();
            String group2 = matcher.group(2);
            group2.getClass();
            try {
                if ("line".equals(group)) {
                    b(group2, dVar);
                } else {
                    if (DOMConstants.ATTR_ALIGN.equals(group)) {
                        group2.hashCode();
                        switch (group2) {
                            case "center":
                            case "middle":
                                i = 2;
                                break;
                            case "end":
                                i = 3;
                                break;
                            case "left":
                                i = 4;
                                break;
                            case "right":
                                i = 5;
                                break;
                            case "start":
                                i = 1;
                                break;
                            default:
                                et0.d("WebvttCueParser", "Invalid alignment value: ".concat(group2));
                                i = 2;
                                break;
                        }
                        dVar.d = i;
                    } else if ("position".equals(group)) {
                        int indexOf = group2.indexOf(44);
                        if (indexOf != -1) {
                            String substring = group2.substring(indexOf + 1);
                            substring.getClass();
                            substring.hashCode();
                            switch (substring.hashCode()) {
                                case -1842484672:
                                    if (substring.equals("line-left")) {
                                        break;
                                    }
                                    break;
                                case -1364013995:
                                    if (substring.equals("center")) {
                                        break;
                                    }
                                    break;
                                case -1276788989:
                                    if (substring.equals("line-right")) {
                                        break;
                                    }
                                    break;
                                case -1074341483:
                                    if (substring.equals(FunctionSwitchManager.KEY_MIDDLE)) {
                                        break;
                                    }
                                    break;
                                case 100571:
                                    if (substring.equals("end")) {
                                        break;
                                    }
                                    break;
                                case 109757538:
                                    if (substring.equals("start")) {
                                        break;
                                    }
                                    break;
                            }
                            /*  JADX ERROR: Method code generation error
                                java.lang.NullPointerException: Switch insn not found in header
                                	at java.base/java.util.Objects.requireNonNull(Objects.java:246)
                                	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:246)
                                	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:84)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                                	at jadx.core.codegen.RegionGen.connectElseIf(RegionGen.java:157)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:136)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:140)
                                	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeTryCatch(RegionGen.java:317)
                                	at jadx.core.dex.regions.TryCatchRegion.generate(TryCatchRegion.java:85)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                                	at jadx.core.codegen.RegionGen.makeLoop(RegionGen.java:226)
                                	at jadx.core.dex.regions.loops.LoopRegion.generate(LoopRegion.java:171)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.dex.regions.Region.generate(Region.java:35)
                                	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                                	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:297)
                                	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:276)
                                	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:406)
                                	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:335)
                                	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:301)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:186)
                                	at java.base/java.util.ArrayList.forEach(ArrayList.java:1604)
                                	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                                	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                                	at java.base/java.util.stream.ReferencePipeline$7$1FlatMap.end(ReferencePipeline.java:284)
                                	at java.base/java.util.stream.AbstractPipeline.copyInto(AbstractPipeline.java:571)
                                	at java.base/java.util.stream.AbstractPipeline.wrapAndCopyInto(AbstractPipeline.java:560)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp.evaluateSequential(ForEachOps.java:153)
                                	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.evaluateSequential(ForEachOps.java:176)
                                	at java.base/java.util.stream.AbstractPipeline.evaluate(AbstractPipeline.java:265)
                                	at java.base/java.util.stream.ReferencePipeline.forEach(ReferencePipeline.java:632)
                                	at jadx.core.codegen.ClassGen.addInnerClsAndMethods(ClassGen.java:297)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:286)
                                	at jadx.core.codegen.ClassGen.addClassBody(ClassGen.java:270)
                                	at jadx.core.codegen.ClassGen.addClassCode(ClassGen.java:161)
                                	at jadx.core.codegen.ClassGen.makeClass(ClassGen.java:103)
                                	at jadx.core.codegen.CodeGen.wrapCodeGen(CodeGen.java:45)
                                	at jadx.core.codegen.CodeGen.generateJavaCode(CodeGen.java:34)
                                	at jadx.core.codegen.CodeGen.generate(CodeGen.java:22)
                                	at jadx.core.ProcessClass.process(ProcessClass.java:79)
                                	at jadx.core.ProcessClass.generateCode(ProcessClass.java:117)
                                	at jadx.core.dex.nodes.ClassNode.generateClassCode(ClassNode.java:402)
                                	at jadx.core.dex.nodes.ClassNode.decompile(ClassNode.java:390)
                                	at jadx.core.dex.nodes.ClassNode.getCode(ClassNode.java:340)
                                */
                            /*
                                Method dump skipped, instructions count: 556
                                To view this dump add '--comments-level debug' option
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ck2.a(java.lang.String, com.yandex.mobile.ads.impl.ck2$d):void");
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        static final class d {
                            public CharSequence c;

                            /* renamed from: a, reason: collision with root package name */
                            public long f15200a = 0;
                            public long b = 0;
                            public int d = 2;
                            public float e = -3.4028235E38f;
                            public int f = 1;
                            public int g = 0;
                            public float h = -3.4028235E38f;
                            public int i = Integer.MIN_VALUE;
                            public float j = 1.0f;
                            public int k = Integer.MIN_VALUE;

                            /* JADX WARN: Code restructure failed: missing block: B:52:0x0072, code lost:
                            
                                if (r8 == 0) goto L43;
                             */
                            /* JADX WARN: Removed duplicated region for block: B:36:0x008b  */
                            /* JADX WARN: Removed duplicated region for block: B:43:0x00ba  */
                            /* JADX WARN: Removed duplicated region for block: B:49:0x00a6  */
                            /* JADX WARN: Removed duplicated region for block: B:51:0x0070  */
                            /* JADX WARN: Removed duplicated region for block: B:52:0x0072  */
                            /*
                                Code decompiled incorrectly, please refer to instructions dump.
                                To view partially-correct add '--show-bad-code' argument
                            */
                            public final com.yandex.mobile.ads.impl.hv.a a() {
                                /*
                                    r13 = this;
                                    float r0 = r13.h
                                    r1 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
                                    int r2 = (r0 > r1 ? 1 : (r0 == r1 ? 0 : -1))
                                    r3 = 1056964608(0x3f000000, float:0.5)
                                    r4 = 0
                                    r5 = 5
                                    r6 = 4
                                    r7 = 1065353216(0x3f800000, float:1.0)
                                    if (r2 == 0) goto L11
                                    goto L1c
                                L11:
                                    int r0 = r13.d
                                    if (r0 == r6) goto L1b
                                    if (r0 == r5) goto L19
                                    r0 = r3
                                    goto L1c
                                L19:
                                    r0 = r7
                                    goto L1c
                                L1b:
                                    r0 = r4
                                L1c:
                                    int r2 = r13.i
                                    r8 = -2147483648(0xffffffff80000000, float:-0.0)
                                    r9 = 3
                                    r10 = 2
                                    r11 = 1
                                    if (r2 == r8) goto L26
                                    goto L35
                                L26:
                                    int r2 = r13.d
                                    if (r2 == r11) goto L34
                                    if (r2 == r9) goto L32
                                    if (r2 == r6) goto L34
                                    if (r2 == r5) goto L32
                                    r2 = r11
                                    goto L35
                                L32:
                                    r2 = r10
                                    goto L35
                                L34:
                                    r2 = 0
                                L35:
                                    com.yandex.mobile.ads.impl.hv$a r8 = new com.yandex.mobile.ads.impl.hv$a
                                    r8.<init>()
                                    int r12 = r13.d
                                    if (r12 == r11) goto L55
                                    if (r12 == r10) goto L52
                                    if (r12 == r9) goto L4f
                                    if (r12 == r6) goto L55
                                    if (r12 == r5) goto L4f
                                    java.lang.String r5 = "Unknown textAlignment: "
                                    java.lang.String r6 = "WebvttCueParser"
                                    com.yandex.mobile.ads.impl.xr0.a(r5, r12, r6)
                                    r5 = 0
                                    goto L57
                                L4f:
                                    android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_OPPOSITE
                                    goto L57
                                L52:
                                    android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_CENTER
                                    goto L57
                                L55:
                                    android.text.Layout$Alignment r5 = android.text.Layout.Alignment.ALIGN_NORMAL
                                L57:
                                    com.yandex.mobile.ads.impl.hv$a r5 = r8.b(r5)
                                    float r6 = r13.e
                                    int r8 = r13.f
                                    int r9 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
                                    if (r9 == 0) goto L6e
                                    if (r8 != 0) goto L6e
                                    int r4 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                                    if (r4 < 0) goto L74
                                    int r4 = (r6 > r7 ? 1 : (r6 == r7 ? 0 : -1))
                                    if (r4 <= 0) goto L6e
                                    goto L74
                                L6e:
                                    if (r9 == 0) goto L72
                                    r1 = r6
                                    goto L75
                                L72:
                                    if (r8 != 0) goto L75
                                L74:
                                    r1 = r7
                                L75:
                                    com.yandex.mobile.ads.impl.hv$a r1 = r5.a(r8, r1)
                                    int r4 = r13.g
                                    com.yandex.mobile.ads.impl.hv$a r1 = r1.a(r4)
                                    com.yandex.mobile.ads.impl.hv$a r1 = r1.b(r0)
                                    com.yandex.mobile.ads.impl.hv$a r1 = r1.b(r2)
                                    float r4 = r13.j
                                    if (r2 == 0) goto La6
                                    if (r2 == r11) goto L9a
                                    if (r2 != r10) goto L90
                                    goto La8
                                L90:
                                    java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                                    java.lang.String r1 = java.lang.String.valueOf(r2)
                                    r0.<init>(r1)
                                    throw r0
                                L9a:
                                    int r2 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                                    r3 = 1073741824(0x40000000, float:2.0)
                                    if (r2 > 0) goto La2
                                    float r0 = r0 * r3
                                    goto La8
                                La2:
                                    float r7 = r7 - r0
                                    float r0 = r7 * r3
                                    goto La8
                                La6:
                                    float r0 = r7 - r0
                                La8:
                                    float r0 = java.lang.Math.min(r4, r0)
                                    com.yandex.mobile.ads.impl.hv$a r0 = r1.d(r0)
                                    int r1 = r13.k
                                    com.yandex.mobile.ads.impl.hv$a r0 = r0.c(r1)
                                    java.lang.CharSequence r1 = r13.c
                                    if (r1 == 0) goto Lbd
                                    r0.a(r1)
                                Lbd:
                                    return r0
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.yandex.mobile.ads.impl.ck2.d.a():com.yandex.mobile.ads.impl.hv$a");
                            }
                        }

                        private static final class c implements Comparable<c> {
                            public final int b;
                            public final ak2 c;

                            @Override // java.lang.Comparable
                            public final int compareTo(c cVar) {
                                return Integer.compare(this.b, cVar.b);
                            }

                            public c(int i, ak2 ak2Var) {
                                this.b = i;
                                this.c = ak2Var;
                            }
                        }

                        private static final class b {

                            /* renamed from: a, reason: collision with root package name */
                            public final String f15199a;
                            public final int b;
                            public final String c;
                            public final Set<String> d;

                            private b(String str, int i, String str2, Set<String> set) {
                                this.b = i;
                                this.f15199a = str;
                                this.c = str2;
                                this.d = set;
                            }
                        }

                        /* JADX INFO: Access modifiers changed from: private */
                        static class a {
                            private static final Comparator<a> c = new Comparator() { // from class: com.yandex.mobile.ads.impl.ck2$a$$ExternalSyntheticLambda0
                                @Override // java.util.Comparator
                                public final int compare(Object obj, Object obj2) {
                                    int a2;
                                    a2 = ck2.a.a((ck2.a) obj, (ck2.a) obj2);
                                    return a2;
                                }
                            };

                            /* renamed from: a, reason: collision with root package name */
                            private final b f15198a;
                            private final int b;

                            /* JADX INFO: Access modifiers changed from: private */
                            public static /* synthetic */ int a(a aVar, a aVar2) {
                                return Integer.compare(aVar.f15198a.b, aVar2.f15198a.b);
                            }

                            private a(b bVar, int i) {
                                this.f15198a = bVar;
                                this.b = i;
                            }
                        }
                    }
