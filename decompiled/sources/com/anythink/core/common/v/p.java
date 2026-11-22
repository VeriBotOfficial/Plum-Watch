package com.anythink.core.common.v;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import android.webkit.WebView;
import com.anythink.core.api.ATCustomRuleKeys;
import com.anythink.core.api.ATShowConfig;
import com.anythink.core.common.d.j;
import com.anythink.core.common.h.bj;
import com.anythink.core.common.h.bo;
import com.anythink.core.common.h.bv;
import com.phancy.mini.core.api.ApiError;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.UUID;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class p {

    /* renamed from: a, reason: collision with root package name */
    static Random f4424a = new Random();
    private static final String b = "CommonSDKUtil";

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public static final String f4425a = "com.android.vending";
    }

    public static boolean b(int i) {
        return i == 2 || i == 7 || i == 9 || i == 12;
    }

    public static boolean c(int i) {
        return i == 3 || i == 4 || i == 5 || i == 8 || i == 11 || i == 13;
    }

    public static boolean d(int i) {
        return i == 1 || i == 6 || i == 10;
    }

    public static boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.e("anythink", "Channel Error: The channel cannot be null or empty.");
        }
        return !TextUtils.isEmpty(str);
    }

    public static boolean b(String str) {
        if (TextUtils.isEmpty(str)) {
            Log.e("anythink", "SubChannel Error: The subChannel cannot be null or empty.");
        }
        return !TextUtils.isEmpty(str);
    }

    public static boolean c(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (str.length() > 50) {
            Log.e("anythink", "Invalid ScenarioId(" + str + "):The length of ScenarioId must be between 1-50.");
            return false;
        }
        if (!Pattern.matches(".*[\\u4E00-\\u9FFF\\s]+.*", str)) {
            return true;
        }
        Log.e("anythink", "Invalid ScenarioId(" + str + "):ScenarioId cannot contain spaces or chinese characters.");
        return false;
    }

    public static String d(String str) {
        return (!TextUtils.isEmpty(str) && c(str)) ? str : "";
    }

    public static ATShowConfig e(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return new ATShowConfig.Builder().scenarioId(str).build();
    }

    public static String a(String str, String str2, long j) {
        return str + "_" + str2 + "_" + j;
    }

    public static String b(String str, String str2, long j) {
        return a(str, str2, j) + "_refresh";
    }

    public static String f(String str) {
        str.hashCode();
        switch (str) {
            case "0":
                return j.n.f3693a;
            case "1":
                return j.n.b;
            case "2":
                return j.n.c;
            case "3":
                return "Interstitial";
            case "4":
                return "Splash";
            default:
                return "";
        }
    }

    public static JSONObject a(Context context, String str, String str2, int i, int i2) {
        int[] a2 = com.anythink.core.a.a.a(context).a(i);
        int i3 = a2[0];
        int i4 = a2[1];
        bo a3 = com.anythink.core.a.a.a(context).a(str2, i);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("sr", "tp");
            jSONObject.put("rid", str);
            jSONObject.put("ads", i3);
            jSONObject.put("ahs", i4);
            jSONObject.put("pds", a3 != null ? a3.c : 0);
            jSONObject.put("phs", a3 != null ? a3.d : 0);
            jSONObject.put("ap", i2);
            jSONObject.put("tpl", str2);
        } catch (Exception unused) {
        }
        return jSONObject;
    }

    public static String a(Context context) {
        String B = com.anythink.core.common.d.t.b().B();
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(m.d(context));
        stringBuffer.append("&");
        stringBuffer.append(m.f());
        stringBuffer.append("&");
        stringBuffer.append(B);
        stringBuffer.append("&");
        stringBuffer.append(System.currentTimeMillis());
        stringBuffer.append("&");
        stringBuffer.append(new Random().nextInt(10000));
        return o.a(stringBuffer.toString());
    }

    public static void a(List<bv> list, bv bvVar) {
        if (list == null) {
            return;
        }
        int size = list.size();
        if (size == 0) {
            list.add(bvVar);
            return;
        }
        int i = size - 1;
        for (int i2 = 0; i2 < size; i2++) {
            if (l.a(bvVar, list.get(i2)) <= 0) {
                list.add(i2, bvVar);
                return;
            } else {
                if (i2 == i) {
                    list.add(bvVar);
                    return;
                }
            }
        }
    }

    private static boolean a(List<bv> list, bv bvVar, bv bvVar2, int i, int i2, boolean z) {
        if (z && bvVar.e() == -1) {
            list.add(i, bvVar2);
            return true;
        }
        if (l.a(bvVar2, bvVar) <= 0) {
            list.add(i, bvVar2);
            return true;
        }
        if (i != i2) {
            return false;
        }
        list.add(bvVar2);
        return true;
    }

    private static String d(Context context) {
        String B = com.anythink.core.common.d.t.b().B();
        if (TextUtils.isEmpty(B)) {
            B = m.d(context) + m.f();
        }
        return o.a(B + UUID.randomUUID().toString());
    }

    public static void a(WebView webView) {
        if (webView == null) {
            return;
        }
        webView.removeJavascriptInterface("searchBoxjavaBridge_");
        webView.removeJavascriptInterface("accessibility");
        webView.removeJavascriptInterface("accessibilityTraversal");
        webView.getSettings().setAllowFileAccess(false);
        webView.getSettings().setAllowFileAccessFromFileURLs(false);
        webView.getSettings().setAllowUniversalAccessFromFileURLs(false);
        webView.getSettings().setSavePassword(false);
    }

    public static double a(bv bvVar) {
        if (bvVar != null) {
            return bvVar.at();
        }
        return 0.0d;
    }

    public static double b(bv bvVar) {
        if (bvVar != null) {
            return bvVar.c();
        }
        return 0.0d;
    }

    public static double c(bv bvVar) {
        if (bvVar == null) {
            return 0.0d;
        }
        double at = bvVar.at();
        if (at <= 0.0d) {
            return at;
        }
        try {
            if (!bvVar.o()) {
                return at;
            }
            double bp = bvVar != null ? bvVar.bp() : 0.0d;
            double d = bp > 0.0d ? at * bp : at;
            try {
                new Object[]{Double.valueOf(at), Double.valueOf(d), Double.valueOf(bp)};
                return d;
            } catch (Throwable unused) {
                return d;
            }
        } catch (Throwable unused2) {
            return at;
        }
    }

    private static double d(bv bvVar) {
        if (bvVar != null) {
            return bvVar.bp();
        }
        return 0.0d;
    }

    private static void a(String str, List<bv> list) {
        if (list != null) {
            try {
                StringBuilder sb = new StringBuilder();
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    bv bvVar = list.get(i);
                    sb.append("\n").append(i).append(" --> adSourceId: ").append(bvVar.z()).append(", ").append(bvVar.h()).append(", real: ").append(bvVar.D()).append(", sort: ").append(a(bvVar));
                    String F = bvVar.F();
                    if (!TextUtils.isEmpty(F)) {
                        sb.append(", errorMsg: ").append(F);
                    }
                }
                Log.e(str, sb.toString());
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static String a() {
        if (!TextUtils.isEmpty("UA_6.5.10")) {
            return "UA_6.5.10";
        }
        return "UA_0.0.0";
    }

    public static String a(com.anythink.core.common.h.w wVar) {
        String str;
        com.anythink.core.common.h.y r;
        String str2 = wVar.I() + wVar.v();
        if ((wVar instanceof bj) && (r = wVar.r()) != null) {
            str2 = r.aw() != 2 ? b(wVar) + wVar.I() + wVar.v() : b(wVar) + wVar.I();
        }
        if (com.anythink.core.common.d.t.b().g() == null) {
            str = "";
        } else {
            str = com.anythink.core.common.d.t.b().g().getPackageName();
        }
        String str3 = str2 + str;
        new Object[]{str2, str3};
        return o.a(str3);
    }

    public static String b(com.anythink.core.common.h.w wVar) {
        if (wVar instanceof bj) {
            return ((bj) wVar).aD();
        }
        return "";
    }

    public static boolean b() {
        try {
            Map<String, Object> m = com.anythink.core.common.d.t.b().m();
            if (m == null || !m.containsKey(ATCustomRuleKeys.AGE)) {
                return false;
            }
            return Integer.parseInt(m.get(ATCustomRuleKeys.AGE).toString()) <= 13;
        } catch (Throwable unused) {
            return false;
        }
    }

    public static void a(Map<String, Object> map, com.anythink.core.common.h.n nVar) {
        if (nVar == null || nVar.Y() >= 100000) {
            return;
        }
        map.put(j.w.i, nVar);
        map.put(j.w.j, nVar.aI());
    }

    public static boolean b(Context context) {
        return ag.a().a(context);
    }

    public static boolean c(Context context) {
        return ag.a().b(context);
    }

    public static boolean c() {
        return ag.a().b();
    }

    private static int a(int i, int[] iArr, int i2) {
        if (iArr != null) {
            for (int i3 : iArr) {
                if (i == i3) {
                    return i;
                }
            }
        }
        return i2;
    }

    public static List<bv> a(List<bv> list, com.anythink.core.common.k.f fVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        HashMap hashMap = new HashMap(3);
        ArrayList arrayList = new ArrayList();
        for (bv bvVar : list) {
            double a2 = a(bvVar);
            List list2 = (List) linkedHashMap.get(String.valueOf(a2));
            if (list2 == null) {
                list2 = new ArrayList();
                linkedHashMap.put(String.valueOf(a2), list2);
            }
            Integer num = (Integer) hashMap.get(String.valueOf(a2));
            if (num == null) {
                num = 0;
            }
            hashMap.put(String.valueOf(a2), Integer.valueOf(num.intValue() + bvVar.Z()));
            list2.add(bvVar);
        }
        int i = 0;
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            List list3 = (List) entry.getValue();
            int intValue = ((Integer) hashMap.get(entry.getKey())).intValue();
            int i2 = -1;
            while (true) {
                if (list3.size() <= 0) {
                    break;
                }
                if (list3.size() == 1) {
                    bv bvVar2 = (bv) list3.get(0);
                    arrayList.add(bvVar2);
                    list3.remove(0);
                    if (fVar != null) {
                        fVar.a(bvVar2, i, i2);
                    }
                    i++;
                } else {
                    int nextInt = f4424a.nextInt(intValue) + 1;
                    Iterator it = list3.iterator();
                    int i3 = 0;
                    while (true) {
                        if (it.hasNext()) {
                            bv bvVar3 = (bv) it.next();
                            if (bvVar3.Z() + i3 >= nextInt) {
                                arrayList.add(bvVar3);
                                list3.remove(bvVar3);
                                intValue -= bvVar3.Z();
                                if (i2 == -1) {
                                    i2 = 0;
                                }
                                if (fVar != null) {
                                    fVar.a(bvVar3, i, i2);
                                }
                                i2++;
                                i++;
                            } else {
                                i3 += bvVar3.Z();
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public static String a(int i) {
        switch (i) {
            case 2:
                return "c2s";
            case 3:
                return "s2s";
            case 4:
                return com.qumeng.overseas.advlib.trdparty.unionset.network.c.o;
            case 5:
                return "adx open";
            case 6:
            case 10:
            default:
                return "";
            case 7:
                return "fb in-house";
            case 8:
                return "directly";
            case 9:
                return "dynamic";
            case 11:
                return "custom in-house";
            case 12:
                return "dynamic c2s";
            case 13:
                return "dynamic s2s";
        }
    }

    public static JSONObject a(StackTraceElement[] stackTraceElementArr) {
        JSONObject jSONObject = null;
        if (stackTraceElementArr == null || stackTraceElementArr.length <= 0) {
            return null;
        }
        try {
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray = new JSONArray();
                JSONArray jSONArray2 = new JSONArray();
                for (int i = 0; i < stackTraceElementArr.length; i++) {
                    String className = stackTraceElementArr[i].getClassName();
                    if (!className.startsWith("com.anythink")) {
                        jSONArray.put(stackTraceElementArr[i].toString());
                        try {
                            jSONArray2.put(Class.forName(className).getSuperclass().getName());
                        } catch (Throwable unused) {
                            jSONArray2.put(ApiError.ERROR_MSG_FAIL);
                        }
                        if (jSONArray.length() >= 5) {
                            break;
                        }
                    }
                }
                jSONObject2.put("stacks", jSONArray);
                jSONObject2.put("classes", jSONArray2);
                return jSONObject2;
            } catch (Throwable unused2) {
                jSONObject = jSONObject2;
                return jSONObject;
            }
        } catch (Throwable unused3) {
        }
    }

    public static boolean a(List<String> list, String str) {
        return list == null || list.size() <= 0 || list.contains(str);
    }

    public static boolean b(List<String> list, String str) {
        return list != null && list.size() > 0 && list.contains(str);
    }

    public static int e(int i) {
        if (c(i)) {
            return 1;
        }
        return b(i) ? 2 : 0;
    }
}
