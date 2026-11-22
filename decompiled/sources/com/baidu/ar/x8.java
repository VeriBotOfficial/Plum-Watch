package com.baidu.ar;

import android.content.Context;
import android.text.TextUtils;
import android.util.SparseArray;
import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class x8 {

    /* renamed from: a, reason: collision with root package name */
    public SparseArray<w8> f7330a = new SparseArray<>();

    public static String a(Context context, String str) {
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(context.getAssets().open(str), "UTF-8");
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    bufferedReader.close();
                    inputStreamReader.close();
                    return sb.toString();
                }
                sb.append(readLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x003f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String a(java.io.File r3) {
        /*
            r0 = 0
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2b
            java.io.FileReader r2 = new java.io.FileReader     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2b
            r2.<init>(r3)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2b
            r1.<init>(r2)     // Catch: java.lang.Throwable -> L29 java.lang.Exception -> L2b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L27 java.lang.Throwable -> L3b
            r3.<init>()     // Catch: java.lang.Exception -> L27 java.lang.Throwable -> L3b
        L10:
            java.lang.String r2 = r1.readLine()     // Catch: java.lang.Exception -> L27 java.lang.Throwable -> L3b
            if (r2 == 0) goto L1a
            r3.append(r2)     // Catch: java.lang.Exception -> L27 java.lang.Throwable -> L3b
            goto L10
        L1a:
            java.lang.String r3 = r3.toString()     // Catch: java.lang.Exception -> L27 java.lang.Throwable -> L3b
            r1.close()     // Catch: java.io.IOException -> L22
            return r3
        L22:
            r0 = move-exception
            r0.printStackTrace()
            return r3
        L27:
            r3 = move-exception
            goto L2d
        L29:
            r3 = move-exception
            goto L3d
        L2b:
            r3 = move-exception
            r1 = r0
        L2d:
            r3.printStackTrace()     // Catch: java.lang.Throwable -> L3b
            if (r1 == 0) goto L3a
            r1.close()     // Catch: java.io.IOException -> L36
            goto L3a
        L36:
            r3 = move-exception
            r3.printStackTrace()
        L3a:
            return r0
        L3b:
            r3 = move-exception
            r0 = r1
        L3d:
            if (r0 == 0) goto L47
            r0.close()     // Catch: java.io.IOException -> L43
            goto L47
        L43:
            r0 = move-exception
            r0.printStackTrace()
        L47:
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.baidu.ar.x8.a(java.io.File):java.lang.String");
    }

    public SparseArray<w8> a() {
        return this.f7330a;
    }

    public void a(String str, Context context) {
        String a2;
        boolean z;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        if (str.startsWith("file:///android_asset/")) {
            str = str.substring(22);
            if (!str.endsWith("/")) {
                str = str + "/";
            }
            a2 = a(context, str + "dl_config.json");
            z = true;
        } else {
            a2 = a(new File(str, "dl_config.json"));
            z = false;
        }
        a(a2, str, z);
    }

    public final void a(String str, String str2, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONArray jSONArray = new JSONArray(str);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                int i2 = jSONObject.getInt("type");
                JSONArray jSONArray2 = jSONObject.getJSONArray("models");
                int length2 = jSONArray2.length();
                w8 w8Var = new w8();
                w8Var.f7304a = new String[length2];
                for (int i3 = 0; i3 < length2; i3++) {
                    JSONObject jSONObject2 = jSONArray2.getJSONObject(i3);
                    int optInt = jSONObject2.optInt("model_type", i3);
                    File file = new File(str2, jSONObject2.getString("dir"));
                    String optString = jSONObject2.optString("design_model", "");
                    if (!TextUtils.isEmpty(optString)) {
                        file = new File(file, optString);
                    }
                    String absolutePath = file.getAbsolutePath();
                    if (z) {
                        absolutePath = absolutePath.substring(1);
                    }
                    w8Var.f7304a[optInt] = absolutePath;
                }
                this.f7330a.put(i2, w8Var);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
