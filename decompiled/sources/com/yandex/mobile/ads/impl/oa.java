package com.yandex.mobile.ads.impl;

import android.content.Context;
import android.gov.nist.core.Separators;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.util.Base64;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.bouncycastle.asn1.cmc.BodyPartID;

/* loaded from: classes5.dex */
public final class oa {

    /* renamed from: a, reason: collision with root package name */
    private static final long f16428a = (long) (Math.floor(Math.random() * BodyPartID.bodyIdMax) + 1);
    public static final /* synthetic */ int b = 0;

    private static String a(String str, Map map) {
        if (map == null) {
            return str;
        }
        Uri.Builder buildUpon = Uri.parse(str).buildUpon();
        for (Map.Entry entry : map.entrySet()) {
            Uri parse = Uri.parse(Separators.QUESTION + ((String) entry.getKey()) + "=" + ((String) entry.getValue()));
            for (String str2 : parse.getQueryParameterNames()) {
                buildUpon.appendQueryParameter(str2, parse.getQueryParameter(str2));
            }
        }
        String uri = buildUpon.build().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return uri;
    }

    @JvmStatic
    public static final ArrayList a(o8 adResponse, Map map) {
        fy1 fy1Var;
        Intrinsics.checkNotNullParameter(adResponse, "adResponse");
        List<String> l = adResponse.l();
        List<Long> f = adResponse.f();
        List<Integer> q2 = adResponse.q();
        ArrayList arrayList = new ArrayList();
        if (l != null && f != null && q2 != null) {
            int size = l.size();
            int i = 0;
            while (i < size) {
                String url = a(l.get(i), map);
                long longValue = f.size() > i ? f.get(i).longValue() : 0L;
                int intValue = q2.size() > i ? q2.get(i).intValue() : 0;
                Intrinsics.checkNotNullParameter(url, "url");
                if (StringsKt.contains$default((CharSequence) url, (CharSequence) "/rtbcount/", false, 2, (Object) null)) {
                    fy1Var = fy1.c;
                } else if (StringsKt.contains$default((CharSequence) url, (CharSequence) "/count/", false, 2, (Object) null)) {
                    fy1Var = fy1.b;
                } else {
                    fy1Var = fy1.d;
                }
                arrayList.add(new ey1(intValue, longValue, fy1Var, url));
                i++;
            }
        }
        return arrayList;
    }

    public static Bitmap a(String data) {
        Intrinsics.checkNotNullParameter(data, "data");
        try {
            String substring = data.substring(StringsKt.indexOf$default((CharSequence) data, ",", 0, false, 6, (Object) null) + 1);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            if (substring.length() <= 0) {
                return null;
            }
            byte[] decode = Base64.decode(substring, 0);
            return BitmapFactory.decodeByteArray(decode, 0, decode.length);
        } catch (Exception unused) {
            return null;
        }
    }

    @JvmStatic
    public static final <T> String a(T t) {
        String obj = t != null ? t.toString() : null;
        return obj == null ? "" : obj;
    }

    public static boolean a(ro roVar) {
        return roVar == null || roVar.a();
    }

    @JvmStatic
    public static final boolean a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        try {
            return sj2.a(context) != null;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static long a() {
        return f16428a;
    }
}
