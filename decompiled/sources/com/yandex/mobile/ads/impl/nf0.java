package com.yandex.mobile.ads.impl;

import java.net.URLDecoder;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.Regex;

/* loaded from: classes5.dex */
public final class nf0 {

    /* renamed from: a, reason: collision with root package name */
    private static final Charset f16336a = Charsets.ISO_8859_1;
    public static final /* synthetic */ int b = 0;

    public interface a<T> {
        T a(String str);
    }

    @JvmStatic
    public static final boolean a(Map<String, String> responseHeaders, vh0 httpHeader, boolean z) {
        Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
        Intrinsics.checkNotNullParameter(httpHeader, "httpHeader");
        String a2 = a(responseHeaders, httpHeader);
        return a2 == null ? z : Boolean.parseBoolean(a2);
    }

    @JvmStatic
    public static final ArrayList c(Map responseHeaders, vh0 header) {
        Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
        Intrinsics.checkNotNullParameter(header, "header");
        return a(responseHeaders, header, new of0());
    }

    public static int b(Map map, vh0 httpHeader) {
        Intrinsics.checkNotNullParameter(httpHeader, "httpHeader");
        String a2 = a(map, httpHeader);
        int i = oa.b;
        if (a2 == null) {
            return 0;
        }
        try {
            return Integer.parseInt(a2);
        } catch (NumberFormatException unused) {
            return 0;
        }
    }

    @JvmStatic
    public static final String a(Map<String, String> map, vh0 httpHeader) {
        Intrinsics.checkNotNullParameter(httpHeader, "httpHeader");
        if (map != null) {
            return map.get(httpHeader.a());
        }
        return null;
    }

    @JvmStatic
    public static final ArrayList a(Map responseHeaders, vh0 header, a parser) {
        List emptyList;
        Intrinsics.checkNotNullParameter(responseHeaders, "responseHeaders");
        Intrinsics.checkNotNullParameter(header, "header");
        Intrinsics.checkNotNullParameter(parser, "parser");
        ArrayList arrayList = new ArrayList();
        String a2 = a(responseHeaders, header);
        if (a2 != null && a2.length() != 0) {
            List<String> split = new Regex(",").split(a2, 0);
            if (!split.isEmpty()) {
                ListIterator<String> listIterator = split.listIterator(split.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous().length() != 0) {
                        emptyList = CollectionsKt.take(split, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            emptyList = CollectionsKt.emptyList();
            for (String str : (String[]) emptyList.toArray(new String[0])) {
                try {
                    Result.Companion companion = Result.INSTANCE;
                    int length = str.length() - 1;
                    int i = 0;
                    boolean z = false;
                    while (i <= length) {
                        boolean z2 = Intrinsics.compare((int) str.charAt(!z ? i : length), 32) <= 0;
                        if (z) {
                            if (!z2) {
                                break;
                            }
                            length--;
                        } else if (z2) {
                            i++;
                        } else {
                            z = true;
                        }
                    }
                    String decode = URLDecoder.decode(str.subSequence(i, length + 1).toString(), "UTF-8");
                    Intrinsics.checkNotNull(decode);
                    Object a3 = parser.a(decode);
                    if (a3 != null) {
                        arrayList.add(a3);
                    } else {
                        a3 = null;
                    }
                    Result.m14057constructorimpl(a3);
                } catch (Throwable th) {
                    Result.Companion companion2 = Result.INSTANCE;
                    Result.m14057constructorimpl(ResultKt.createFailure(th));
                }
            }
        }
        return arrayList;
    }

    @JvmStatic
    public static final Charset a(Map<String, String> map) {
        List emptyList;
        List emptyList2;
        if (map == null) {
            return f16336a;
        }
        String str = map.get("Content-Type");
        if (str != null) {
            List<String> split = new Regex(";").split(str, 0);
            if (!split.isEmpty()) {
                ListIterator<String> listIterator = split.listIterator(split.size());
                while (listIterator.hasPrevious()) {
                    if (listIterator.previous().length() != 0) {
                        emptyList = CollectionsKt.take(split, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            emptyList = CollectionsKt.emptyList();
            String[] strArr = (String[]) emptyList.toArray(new String[0]);
            int length = strArr.length;
            for (int i = 1; i < length; i++) {
                String str2 = strArr[i];
                int length2 = str2.length() - 1;
                int i2 = 0;
                boolean z = false;
                while (i2 <= length2) {
                    boolean z2 = Intrinsics.compare((int) str2.charAt(!z ? i2 : length2), 32) <= 0;
                    if (z) {
                        if (!z2) {
                            break;
                        }
                        length2--;
                    } else if (z2) {
                        i2++;
                    } else {
                        z = true;
                    }
                }
                List<String> split2 = new Regex("=").split(str2.subSequence(i2, length2 + 1).toString(), 0);
                if (!split2.isEmpty()) {
                    ListIterator<String> listIterator2 = split2.listIterator(split2.size());
                    while (listIterator2.hasPrevious()) {
                        if (listIterator2.previous().length() != 0) {
                            emptyList2 = CollectionsKt.take(split2, listIterator2.nextIndex() + 1);
                            break;
                        }
                    }
                }
                emptyList2 = CollectionsKt.emptyList();
                String[] strArr2 = (String[]) emptyList2.toArray(new String[0]);
                if (strArr2.length == 2 && Intrinsics.areEqual(strArr2[0], "charset")) {
                    Charset forName = Charset.forName(strArr2[1]);
                    Intrinsics.checkNotNullExpressionValue(forName, "forName(...)");
                    return forName;
                }
            }
        }
        return f16336a;
    }
}
