package sg.bigo.ads.core.landing;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.gov.nist.core.Separators;
import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import sg.bigo.ads.api.AdActivity;
import sg.bigo.ads.api.core.e;
import sg.bigo.ads.common.utils.c;
import sg.bigo.ads.common.utils.q;
import sg.bigo.ads.core.d.b;

/* loaded from: classes9.dex */
public final class a {
    private static Intent a(Uri uri) {
        return new Intent("android.intent.action.VIEW", uri).addFlags(268435456);
    }

    public static String a(String str, Map<String, String> map, String str2) {
        String host = Uri.parse(str2).getHost();
        if (!q.a((CharSequence) str) && !map.isEmpty() && !q.a((CharSequence) host)) {
            try {
                Set<String> queryParameterNames = Uri.parse(str2).getQueryParameterNames();
                if (str.equals("all") || str.contains(host)) {
                    StringBuilder sb = new StringBuilder();
                    for (Map.Entry<String, String> entry : map.entrySet()) {
                        if (!queryParameterNames.contains(entry.getKey())) {
                            sb.append(entry.getValue()).append("&");
                        }
                    }
                    String sb2 = sb.toString();
                    if (!TextUtils.isEmpty(sb2)) {
                        String substring = sb2.substring(0, sb2.length() - 1);
                        return (str2.contains(Separators.QUESTION) ? new StringBuilder().append(str2).append("&").append(substring) : new StringBuilder().append(str2).append(Separators.QUESTION).append(substring)).toString();
                    }
                }
            } catch (Throwable th) {
                sg.bigo.ads.common.t.a.a(0, "LinkUtils", "appendPixel error =" + th.getMessage());
            }
        }
        return str2;
    }

    public static boolean a(Context context, String str) {
        try {
            context.startActivity(context.getPackageManager().getLaunchIntentForPackage(str));
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean a(Context context, String str, String str2, List<String> list) {
        String str3;
        try {
            Intent a2 = a(Uri.parse(str));
            if (!TextUtils.isEmpty(str2)) {
                a2.setPackage(str2);
            }
            context.startActivity(a2);
            return true;
        } catch (Exception e) {
            if (e instanceof ActivityNotFoundException) {
                str3 = "Unable to open target URL by browser due to ActivityNotFoundException.";
            } else {
                StringBuilder sb = new StringBuilder();
                if (TextUtils.isEmpty(str2)) {
                    str2 = "unknown";
                }
                list.add(sb.append(str2).append(": ").append(e.getMessage()).toString());
                str3 = "Unable to open target URL by system browser.";
            }
            sg.bigo.ads.common.t.a.a(2, "LinkUtils", str3);
            return false;
        }
    }

    public static boolean a(Context context, String str, JSONArray jSONArray) {
        int i;
        if (!str.startsWith("http://") && !str.startsWith("https://")) {
            str = "http://".concat(String.valueOf(str));
        }
        ArrayList arrayList = new ArrayList();
        if (jSONArray != null && jSONArray.length() > 0) {
            int length = jSONArray.length();
            for (int i2 = 0; i2 < length; i2++) {
                String optString = jSONArray.optString(i2);
                if (!TextUtils.isEmpty(optString) && a(context, str, optString, arrayList)) {
                    b.a("1", arrayList, optString, 1);
                    return true;
                }
            }
        }
        if (c.b(context, "com.android.chrome") == 1 && a(context, str, "com.android.chrome", arrayList)) {
            i = 2;
        } else {
            if (!a(context, str, (String) null, arrayList)) {
                b.a("0", arrayList, "", 0);
                return false;
            }
            i = 3;
        }
        b.a("1", arrayList, "", i);
        return true;
    }

    public static boolean a(Uri uri, Context context, e eVar) {
        int i;
        Intent a2 = a(uri);
        a2.setPackage("com.android.vending");
        try {
            context.startActivity(a2);
            eVar.b = 1;
            return true;
        } catch (ActivityNotFoundException unused) {
            i = 2;
            eVar.b = i;
            try {
                context.startActivity(a(uri));
                return true;
            } catch (Exception e) {
                sg.bigo.ads.common.t.a.a(0, "LinkUtils", e.toString());
                return false;
            }
        } catch (Exception e2) {
            sg.bigo.ads.common.t.a.a(0, "LinkUtils", e2.toString());
            i = 4;
            eVar.b = i;
            context.startActivity(a(uri));
            return true;
        }
    }

    public static boolean a(Uri uri, Context context, e eVar, String str) {
        if (uri == null || uri.getScheme() == null || uri.getScheme().startsWith("http")) {
            return false;
        }
        eVar.e = uri.toString();
        if (uri.getScheme().startsWith("market")) {
            Intent a2 = a(uri);
            a2.setPackage("com.android.vending");
            try {
                context.startActivity(a2);
                eVar.b = 1;
                return true;
            } catch (ActivityNotFoundException unused) {
                eVar.b = 2;
            } catch (Exception e) {
                sg.bigo.ads.common.t.a.a(0, "LinkUtils", e.toString());
                eVar.b = 4;
            }
        }
        eVar.f = str;
        try {
            context.startActivity(a(uri));
            eVar.c = 1;
            return true;
        } catch (ActivityNotFoundException unused2) {
            eVar.b = 2;
            return false;
        } catch (Exception e2) {
            sg.bigo.ads.common.t.a.a(0, "LinkUtils", e2.toString());
            eVar.c = 4;
            return false;
        }
    }

    public static boolean a(String str) {
        return str.startsWith("market://") || str.startsWith("http://play.google.com") || str.startsWith("https://play.google.com");
    }

    public static void b(Context context, String str) {
        Intent a2 = AdActivity.a(context, WebViewActivityImpl.class);
        a2.putExtra("url", str);
        context.startActivity(a2);
    }
}
