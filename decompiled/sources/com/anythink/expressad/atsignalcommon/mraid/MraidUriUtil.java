package com.anythink.expressad.atsignalcommon.mraid;

import android.net.Uri;
import android.text.TextUtils;
import com.anythink.core.express.a.a;
import com.anythink.expressad.atsignalcommon.windvane.WindVaneWebView;
import com.anythink.expressad.atsignalcommon.windvane.b;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class MraidUriUtil {

    /* renamed from: a, reason: collision with root package name */
    private static volatile ConcurrentHashMap<String, String> f4686a = new ConcurrentHashMap<>();
    private static ArrayList<String> b = new ArrayList<>();

    public static b getMraidMethodContext(WindVaneWebView windVaneWebView, String str) {
        Set<String> unmodifiableSet;
        Uri parse = Uri.parse(str);
        String scheme = parse.getScheme();
        if (TextUtils.isEmpty(scheme) || !scheme.contains("mraid")) {
            return null;
        }
        b bVar = new b();
        bVar.d = a.b("n+ztLkxpVTzBLkxgHN==");
        bVar.e = parse.getHost();
        int i = 0;
        if (b.size() == 0) {
            for (Method method : IMraidSignalCommunication.class.getDeclaredMethods()) {
                b.add(method.getName());
            }
        }
        if (!b.contains(bVar.e) && windVaneWebView != null) {
            String campaignId = windVaneWebView.getCampaignId();
            String str2 = bVar.e;
            if (!TextUtils.isEmpty(campaignId)) {
                if (f4686a.containsKey(campaignId)) {
                    String str3 = f4686a.get(campaignId);
                    if (!TextUtils.isEmpty(str2) && !str3.contains(str2)) {
                        if (str3.length() > 0) {
                            str3 = str3.concat(",");
                        }
                        f4686a.put(campaignId, str3.concat(str2));
                    }
                } else {
                    f4686a.put(campaignId, str2);
                }
            }
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.a(windVaneWebView, bVar.e);
            com.anythink.core.express.b.a.a();
            com.anythink.core.express.b.a.a(windVaneWebView, bVar.e, "Specified command is not implemented");
            return null;
        }
        String encodedQuery = parse.getEncodedQuery();
        if (encodedQuery == null) {
            unmodifiableSet = Collections.emptySet();
        } else {
            LinkedHashSet linkedHashSet = new LinkedHashSet();
            do {
                int indexOf = encodedQuery.indexOf(38, i);
                if (indexOf == -1) {
                    indexOf = encodedQuery.length();
                }
                int indexOf2 = encodedQuery.indexOf(61, i);
                if (indexOf2 > indexOf || indexOf2 == -1) {
                    indexOf2 = indexOf;
                }
                linkedHashSet.add(Uri.decode(encodedQuery.substring(i, indexOf2)));
                i = indexOf + 1;
            } while (i < encodedQuery.length());
            unmodifiableSet = Collections.unmodifiableSet(linkedHashSet);
        }
        try {
            JSONObject jSONObject = new JSONObject();
            for (String str4 : unmodifiableSet) {
                jSONObject.put(str4, parse.getQueryParameter(str4));
            }
            bVar.f = jSONObject.toString();
            return bVar;
        } catch (Exception e) {
            e.printStackTrace();
            return bVar;
        }
    }

    private static Set<String> a(Uri uri) {
        String encodedQuery = uri.getEncodedQuery();
        if (encodedQuery == null) {
            return Collections.emptySet();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        int i = 0;
        do {
            int indexOf = encodedQuery.indexOf(38, i);
            if (indexOf == -1) {
                indexOf = encodedQuery.length();
            }
            int indexOf2 = encodedQuery.indexOf(61, i);
            if (indexOf2 > indexOf || indexOf2 == -1) {
                indexOf2 = indexOf;
            }
            linkedHashSet.add(Uri.decode(encodedQuery.substring(i, indexOf2)));
            i = indexOf + 1;
        } while (i < encodedQuery.length());
        return Collections.unmodifiableSet(linkedHashSet);
    }

    private static void a() {
        for (Method method : IMraidSignalCommunication.class.getDeclaredMethods()) {
            b.add(method.getName());
        }
    }

    public static String getUnSupportMraidMethodString(String str) {
        if (f4686a.containsKey(str)) {
            return f4686a.get(str);
        }
        return null;
    }

    private static void a(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (f4686a.containsKey(str)) {
            String str3 = f4686a.get(str);
            if (TextUtils.isEmpty(str2) || str3.contains(str2)) {
                return;
            }
            if (str3.length() > 0) {
                str3 = str3.concat(",");
            }
            f4686a.put(str, str3.concat(str2));
            return;
        }
        f4686a.put(str, str2);
    }

    public static void clearUnSupportMraidMethodMap() {
        if (f4686a.size() > 0) {
            f4686a.clear();
        }
    }

    public static void clearUnSupportMraidMethodMap(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        f4686a.remove(str);
    }
}
