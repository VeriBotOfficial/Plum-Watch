package com.qumeng.overseas.advlib.__remote__.utils;

import android.gov.nist.core.Separators;
import android.util.Log;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public class o {

    /* renamed from: a, reason: collision with root package name */
    private static final String f13241a = "MockUtils";
    private static final String b = "debug.ad.tradplus.ecpm";

    public interface a {
        void onError(String str);

        void onSuccess(String str);
    }

    public static void a(a aVar) {
        String b2 = b(new File(com.qumeng.overseas.advlib.__remote__.core.proto.utils.e.a().getExternalFilesDir(null), "mock_ad.json").getAbsolutePath());
        if (b2 == null || b2.isEmpty()) {
            aVar.onError("Mock文件为空或不存在");
            return;
        }
        try {
            new JSONObject(b2);
            aVar.onSuccess(b2);
        } catch (JSONException e) {
            aVar.onError("JSON解析错误：" + e.getMessage());
        }
    }

    public static String b(String str) {
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str));
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream, StandardCharsets.UTF_8));
            StringBuilder sb = new StringBuilder();
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine == null) {
                    bufferedReader.close();
                    fileInputStream.close();
                    return sb.toString();
                }
                sb.append(readLine).append("\n");
            }
        } catch (IOException e) {
            Log.e(f13241a, "读取文件失败", e);
            return null;
        }
    }

    public static void c(a aVar) {
        String b2 = b(new File(com.qumeng.overseas.advlib.__remote__.core.proto.utils.e.a().getExternalFilesDir(null), "mock_mtl.json").getAbsolutePath());
        if (b2 == null || b2.isEmpty()) {
            aVar.onError("Mock文件为空或不存在");
            return;
        }
        try {
            new JSONObject(b2);
            aVar.onSuccess(b2);
        } catch (JSONException e) {
            aVar.onError("JSON解析错误：" + e.getMessage());
        }
    }

    public static Double a() {
        String a2 = a(b);
        if (a2 != null && !a2.isEmpty()) {
            try {
                Double valueOf = Double.valueOf(Double.parseDouble(a2));
                Log.d(f13241a, "===== [MOCK] Succeeded reading mock eCPM from property: " + valueOf + " =====");
                return valueOf;
            } catch (NumberFormatException e) {
                Log.e(f13241a, "[MOCK] Invalid eCPM value in system property 'debug.ad.tradplus.ecpm': '" + a2 + Separators.QUOTE, e);
            }
        }
        return null;
    }

    public static void b(a aVar) {
        String b2 = b(new File(com.qumeng.overseas.advlib.__remote__.core.proto.utils.e.a().getExternalFilesDir(null), "mock_bidding.json").getAbsolutePath());
        if (b2 != null && !b2.isEmpty()) {
            try {
                new JSONObject(b2);
                aVar.onSuccess(b2);
                return;
            } catch (JSONException e) {
                aVar.onError("JSON解析错误：" + e.getMessage());
                return;
            }
        }
        aVar.onError("Mock文件为空或不存在");
    }

    private static String a(String str) {
        try {
            return (String) Class.forName("android.os.SystemProperties").getMethod("get", String.class).invoke(null, str);
        } catch (Exception e) {
            Log.e(f13241a, "Failed to get system property '" + str + Separators.QUOTE, e);
            return null;
        }
    }

    public static boolean b() {
        return Log.isLoggable("MockAd", 2);
    }
}
