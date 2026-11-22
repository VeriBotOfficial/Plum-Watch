package com.tramini.plugin.a.f;

import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.ValueCallback;
import android.webkit.WebView;
import com.anythink.basead.c.b;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.luck.picture.lib.config.PictureMimeType;
import com.tramini.plugin.a.d.a;
import com.tramini.plugin.a.f.f;
import java.io.IOException;
import java.io.StringReader;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Properties;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import org.json.JSONArray;
import org.json.JSONObject;
import org.xmind.core.INotes;

/* loaded from: classes2.dex */
public final class b extends f {
    public static com.tramini.plugin.a.d.a a(JSONObject jSONObject, com.tramini.plugin.a.d.c cVar, String str, String str2) {
        return a(a(jSONObject.optString("in_na"), str), "", jSONObject.optString("tobj_k"), jSONObject.optLong("bwt", 10000L), jSONObject.optLong("bswt", 2000L), jSONObject, jSONObject.optString("bu_k"), cVar.e, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static com.tramini.plugin.a.d.a a(Object obj, String str, String str2, long j, long j2, JSONObject jSONObject, String str3, JSONArray jSONArray, String str4) {
        JSONObject jSONObject2;
        String str5;
        String str6;
        String str7;
        JSONObject jSONObject3;
        String str8;
        String str9;
        String str10;
        String str11;
        JSONObject jSONObject4;
        String str12;
        String str13;
        String str14;
        boolean z;
        JSONObject jSONObject5;
        String str15;
        String str16;
        String str17;
        Object obj2 = obj;
        JSONObject jSONObject6 = jSONObject;
        JSONArray jSONArray2 = jSONArray;
        String str18 = str + obj2.getClass().getName() + ",";
        JSONObject jSONObject7 = new JSONObject();
        try {
            boolean equals = str4.equals("2");
            String str19 = "all";
            String str20 = b.a.A;
            try {
                if (equals) {
                    if (!(obj2 instanceof ViewGroup) || ((ViewGroup) obj2).getChildCount() <= 0) {
                        jSONObject2 = null;
                        str6 = "";
                        str5 = "2";
                        jSONObject3 = jSONObject2;
                        str7 = str6;
                        str10 = str7;
                        str11 = str10;
                        str9 = str11;
                        str8 = str9;
                    } else {
                        View childAt = ((ViewGroup) obj2).getChildAt(0);
                        if (childAt instanceof WebView) {
                            str8 = "";
                            str15 = a((WebView) childAt, j, j2);
                            if (!TextUtils.isEmpty(str15)) {
                                str16 = str8;
                                str10 = str16;
                                str17 = str10;
                                for (int i = 0; i < jSONArray2.length(); i++) {
                                    String optString = jSONArray2.optString(i);
                                    String optString2 = jSONObject6.optString(optString);
                                    if (TextUtils.equals(optString2, b.a.A)) {
                                        str10 = optString;
                                    } else if (TextUtils.equals(optString2, "all")) {
                                        str17 = optString;
                                    } else {
                                        try {
                                            if (!TextUtils.isEmpty(optString2)) {
                                                String d = d(optString2, str15);
                                                if (!TextUtils.isEmpty(d)) {
                                                    jSONObject7.put(optString, d);
                                                }
                                                if (TextUtils.equals(optString, "i_lr")) {
                                                    str16 = d;
                                                }
                                            }
                                        } catch (Throwable unused) {
                                        }
                                    }
                                }
                                jSONObject5 = null;
                                jSONObject3 = jSONObject5;
                                str11 = str17;
                                str5 = "2";
                                str9 = str16;
                                str7 = str15;
                                str6 = str8;
                            }
                        } else {
                            str8 = "";
                        }
                        jSONObject5 = null;
                        str15 = str8;
                        str16 = str15;
                        str10 = str16;
                        str17 = str10;
                        jSONObject3 = jSONObject5;
                        str11 = str17;
                        str5 = "2";
                        str9 = str16;
                        str7 = str15;
                        str6 = str8;
                    }
                } else {
                    String str21 = "";
                    jSONObject2 = null;
                    long j3 = j2;
                    ArrayList arrayList = new ArrayList();
                    a(obj2.getClass(), arrayList);
                    int size = arrayList.size();
                    str5 = "2";
                    Field[] fieldArr = new Field[size];
                    arrayList.toArray(fieldArr);
                    if (size != 0) {
                        JSONObject jSONObject8 = null;
                        int i2 = 0;
                        String str22 = str21;
                        String str23 = str22;
                        String str24 = str23;
                        String str25 = str24;
                        while (i2 < size) {
                            Field field = fieldArr[i2];
                            int i3 = i2;
                            field.setAccessible(true);
                            Object obj3 = field.get(obj2);
                            JSONObject c = c(obj3, str2);
                            if (c != null) {
                                try {
                                    String optString3 = c.optString("xml");
                                    String b = b(obj3);
                                    try {
                                        String optString4 = c.optString(INotes.HTML);
                                        String optString5 = !TextUtils.isEmpty(str3) ? c.optString(str3) : str21;
                                        jSONObject4 = c;
                                        int i4 = 0;
                                        while (i4 < jSONArray2.length()) {
                                            try {
                                                String optString6 = jSONArray2.optString(i4);
                                                int i5 = i4;
                                                String optString7 = jSONObject6.optString(optString6);
                                                if (TextUtils.equals(optString7, str20)) {
                                                    str24 = optString6;
                                                } else if (TextUtils.equals(optString7, str19)) {
                                                    str25 = optString6;
                                                } else {
                                                    try {
                                                        if (!TextUtils.isEmpty(optString7)) {
                                                            String a2 = a(optString7, obj3, jSONObject4, optString3, b, optString4, optString5);
                                                            if (!TextUtils.isEmpty(a2)) {
                                                                jSONObject7.put(optString6, a2);
                                                            }
                                                            if (TextUtils.equals(optString6, "i_lr")) {
                                                                str23 = a2;
                                                            }
                                                        }
                                                    } catch (Throwable unused2) {
                                                    }
                                                }
                                                i4 = i5 + 1;
                                            } catch (Throwable unused3) {
                                                str22 = b;
                                                str12 = str19;
                                                str13 = str20;
                                                str14 = str21;
                                                z = false;
                                                i2 = i3 + 1;
                                                j3 = j2;
                                                jSONObject6 = jSONObject;
                                                jSONArray2 = jSONArray;
                                                str21 = str14;
                                                str19 = str12;
                                                str20 = str13;
                                                jSONObject8 = jSONObject4;
                                                obj2 = obj;
                                            }
                                        }
                                        str12 = str19;
                                        str13 = str20;
                                        str14 = str21;
                                        str22 = b;
                                    } catch (Throwable unused4) {
                                        jSONObject4 = c;
                                    }
                                } catch (Throwable unused5) {
                                    jSONObject4 = c;
                                }
                                z = false;
                                i2 = i3 + 1;
                                j3 = j2;
                                jSONObject6 = jSONObject;
                                jSONArray2 = jSONArray;
                                str21 = str14;
                                str19 = str12;
                                str20 = str13;
                                jSONObject8 = jSONObject4;
                                obj2 = obj;
                            } else {
                                jSONObject4 = c;
                                if (obj3 != null && !str18.contains(obj3.getClass().getName())) {
                                    str12 = str19;
                                    str13 = str20;
                                    str14 = str21;
                                    z = false;
                                    com.tramini.plugin.a.d.a a3 = a(obj3, str18, str2, j, j3, jSONObject6, str3, jSONArray2, str4);
                                    if (a3 != null && a3.f13714a != null) {
                                        return a3;
                                    }
                                    i2 = i3 + 1;
                                    j3 = j2;
                                    jSONObject6 = jSONObject;
                                    jSONArray2 = jSONArray;
                                    str21 = str14;
                                    str19 = str12;
                                    str20 = str13;
                                    jSONObject8 = jSONObject4;
                                    obj2 = obj;
                                }
                            }
                            str12 = str19;
                            str13 = str20;
                            str14 = str21;
                            z = false;
                            i2 = i3 + 1;
                            j3 = j2;
                            jSONObject6 = jSONObject;
                            jSONArray2 = jSONArray;
                            str21 = str14;
                            str19 = str12;
                            str20 = str13;
                            jSONObject8 = jSONObject4;
                            obj2 = obj;
                        }
                        str6 = str21;
                        str7 = str6;
                        jSONObject3 = jSONObject8;
                        str8 = str22;
                        str9 = str23;
                        str10 = str24;
                        str11 = str25;
                    } else {
                        str6 = str21;
                        jSONObject3 = jSONObject2;
                        str7 = str6;
                        str10 = str7;
                        str11 = str10;
                        str9 = str11;
                        str8 = str9;
                    }
                }
                com.tramini.plugin.a.d.a aVar = new com.tramini.plugin.a.d.a();
                if (jSONObject7.length() > 0) {
                    if (!TextUtils.isEmpty(str9) && !TextUtils.isEmpty(str10)) {
                        String a4 = a(str9);
                        if (!TextUtils.isEmpty(a4)) {
                            jSONObject7.put(str10, a4);
                        }
                    }
                    if (str4.equals(str5)) {
                        if (!TextUtils.isEmpty(str7) && !TextUtils.isEmpty(str11)) {
                            jSONObject7.put(str11, com.tramini.plugin.a.h.c.a(str7.getBytes()));
                        }
                    } else if (jSONObject3 != null && !TextUtils.isEmpty(str11)) {
                        jSONObject7.put(str11, com.tramini.plugin.a.h.c.a(jSONObject3.toString().getBytes()));
                    }
                    aVar.f13714a = jSONObject7;
                } else {
                    String str26 = str5;
                    if (str4.equals(str26)) {
                        if (TextUtils.isEmpty(str7)) {
                            aVar.b = new a.C0904a("1", str6);
                        } else {
                            aVar.b = new a.C0904a(str26, str7);
                        }
                    } else if (jSONObject3 == null) {
                        aVar.b = new a.C0904a("1", str6);
                    } else {
                        if (!TextUtils.isEmpty(str8)) {
                            jSONObject3.put("obj_source_html", str8);
                        }
                        aVar.b = new a.C0904a(str26, jSONObject3.toString());
                    }
                }
                return aVar;
            } catch (Throwable unused6) {
                return str;
            }
        } catch (Throwable unused7) {
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x016a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x016b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private static java.lang.String a(java.lang.String r8, java.lang.Object r9, org.json.JSONObject r10, java.lang.String r11, java.lang.String r12, java.lang.String r13, java.lang.String r14) {
        /*
            Method dump skipped, instructions count: 390
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tramini.plugin.a.f.b.a(java.lang.String, java.lang.Object, org.json.JSONObject, java.lang.String, java.lang.String, java.lang.String, java.lang.String):java.lang.String");
    }

    private static String d(String str, String str2) {
        try {
            JSONArray jSONArray = new JSONArray(str);
            String str3 = "";
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null) {
                    int optInt = optJSONObject.optInt("action", -1);
                    String optString = optJSONObject.optString(RemoteMessageConst.MessageBody.PARAM, "");
                    if (optInt == 101) {
                        if (TextUtils.isEmpty(str2)) {
                            continue;
                        } else {
                            str3 = f.b.a(str2, optString);
                        }
                    }
                    if (!TextUtils.isEmpty(str3)) {
                        return str3;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return "";
    }

    private static JSONObject c(Object obj, String str) {
        try {
            ArrayList<Field> arrayList = new ArrayList();
            a(obj.getClass(), arrayList);
            for (Field field : arrayList) {
                if (field != null) {
                    field.setAccessible(true);
                    Object obj2 = field.get(obj);
                    if (obj2 != null && (obj2 instanceof JSONObject) && !TextUtils.isEmpty(((JSONObject) obj2).optString(str, ""))) {
                        return (JSONObject) obj2;
                    }
                }
            }
            return null;
        } catch (Throwable unused) {
            return null;
        }
    }

    private static String a(Object obj) {
        if (obj != null) {
            try {
                ArrayList<Field> arrayList = new ArrayList();
                a(obj.getClass(), arrayList);
                for (Field field : arrayList) {
                    if (field != null) {
                        field.setAccessible(true);
                        Object obj2 = field.get(obj);
                        if (obj2 != null && (obj2 instanceof String) && ((String) obj2).endsWith(PictureMimeType.MP4)) {
                            return (String) obj2;
                        }
                    }
                }
                return "";
            } catch (Throwable unused) {
                return "";
            }
        }
        return "";
    }

    private static String b(Object obj) {
        if (obj != null) {
            try {
                ArrayList<Field> arrayList = new ArrayList();
                a(obj.getClass(), arrayList);
                for (Field field : arrayList) {
                    if (field != null) {
                        field.setAccessible(true);
                        Object obj2 = field.get(obj);
                        if (obj2 != null && (obj2 instanceof String) && ((String) obj2).contains("<!DOCTYPE html>")) {
                            return (String) obj2;
                        }
                    }
                }
                return "";
            } catch (Throwable unused) {
                return "";
            }
        }
        return "";
    }

    private static String a(WebView webView, long j, long j2) {
        try {
            Thread.sleep(j);
        } catch (InterruptedException unused) {
        }
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(2);
        String[] strArr = new String[1];
        try {
            newFixedThreadPool.submit(new AnonymousClass1(webView, newFixedThreadPool, strArr));
        } catch (Throwable unused2) {
        }
        try {
            synchronized (newFixedThreadPool) {
                newFixedThreadPool.wait(j + j2);
            }
            newFixedThreadPool.shutdown();
            String str = strArr[0];
            return str != null ? str : "";
        } catch (Exception unused3) {
            return "";
        }
    }

    /* renamed from: com.tramini.plugin.a.f.b$1, reason: invalid class name */
    final class AnonymousClass1 implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ WebView f13723a;
        final /* synthetic */ ExecutorService b;
        final /* synthetic */ String[] c;

        AnonymousClass1(WebView webView, ExecutorService executorService, String[] strArr) {
            this.f13723a = webView;
            this.b = executorService;
            this.c = strArr;
        }

        @Override // java.lang.Runnable
        public final void run() {
            try {
                if (this.f13723a == null) {
                    synchronized (this.b) {
                        this.b.notifyAll();
                    }
                }
                this.f13723a.post(new Runnable() { // from class: com.tramini.plugin.a.f.b.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        AnonymousClass1.this.f13723a.evaluateJavascript("(function() { return (document.getElementsByTagName('html')[0].innerHTML); })();", new ValueCallback<String>() { // from class: com.tramini.plugin.a.f.b.1.1.1
                            @Override // android.webkit.ValueCallback
                            public final /* synthetic */ void onReceiveValue(String str) {
                                Properties properties = new Properties();
                                try {
                                    properties.load(new StringReader("unicodedString=".concat(String.valueOf(str))));
                                } catch (IOException unused) {
                                }
                                String property = properties.getProperty("unicodedString");
                                if (property.length() > 2) {
                                    AnonymousClass1.this.c[0] = property.substring(1, property.length() - 1);
                                }
                                synchronized (AnonymousClass1.this.b) {
                                    AnonymousClass1.this.b.notifyAll();
                                }
                            }

                            private void a(String str) {
                                Properties properties = new Properties();
                                try {
                                    properties.load(new StringReader("unicodedString=".concat(String.valueOf(str))));
                                } catch (IOException unused) {
                                }
                                String property = properties.getProperty("unicodedString");
                                if (property.length() > 2) {
                                    AnonymousClass1.this.c[0] = property.substring(1, property.length() - 1);
                                }
                                synchronized (AnonymousClass1.this.b) {
                                    AnonymousClass1.this.b.notifyAll();
                                }
                            }
                        });
                    }
                });
            } catch (Throwable unused) {
            }
        }
    }
}
