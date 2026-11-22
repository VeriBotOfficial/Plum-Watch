package com.umeng.umcrash.custom_exception;

import android.text.TextUtils;
import android.util.Log;
import com.umeng.crash.UCrash;
import com.umeng.innner.umcrash.UMCrashThreadPoolExecutorFactory;
import com.umeng.umcrash.UMCrashUtils;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public class UAPMCustomException {
    private static final String TAG = "UAPMCustomException";

    public static void generateCustomLog(final boolean z, boolean z2, boolean z3, final String str, final String str2, final String str3, final boolean z4, final boolean z5) {
        if (!z && !z2) {
            Log.e(TAG, "generate user is closed .");
        } else if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            Log.e(TAG, "generate custom log failed ! e is null or type is empty .");
        } else {
            UMCrashThreadPoolExecutorFactory.execute(new Runnable() { // from class: com.umeng.umcrash.custom_exception.UAPMCustomException.1
                @Override // java.lang.Runnable
                public void run() {
                    try {
                        HashMap hashMap = new HashMap(20);
                        hashMap.put(UMCustomLogInfoBuilder.LOG_KEY_CT, "exception");
                        hashMap.put(UMCustomLogInfoBuilder.LOG_KEY_AC, str2);
                        StringBuffer stringBuffer = new StringBuffer();
                        for (Map.Entry entry : hashMap.entrySet()) {
                            stringBuffer.append((String) entry.getKey()).append(":").append((String) entry.getValue()).append("\n");
                        }
                        String str4 = str3;
                        if (str4 == null) {
                            str4 = "";
                        }
                        String str5 = "Exception message:" + str4 + "\nBack traces starts.\n" + str + "\nBack traces ends.";
                        if (!TextUtils.isEmpty(str5)) {
                            stringBuffer.append(str5).append("\n");
                        }
                        if (z5) {
                            Map<String, String> allThreadTraces = UMCrashUtils.getAllThreadTraces();
                            stringBuffer.append(UMCustomLogInfoBuilder.LOG_SECTION_SEP).append("\n").append("AllThreadsTraces: \n");
                            for (Map.Entry<String, String> entry2 : allThreadTraces.entrySet()) {
                                stringBuffer.append(entry2.getKey()).append("\n").append(entry2.getValue()).append("\n");
                            }
                        }
                        if (z) {
                            UCrash.generateCustomLog(stringBuffer.toString(), z4);
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }

    public static void generateCustomLog(final boolean z, boolean z2, boolean z3, final Throwable th, final String str, final String str2, final boolean z4, final boolean z5) {
        if (!z && !z2) {
            Log.e(TAG, "generate user is closed .");
        } else if (th == null || TextUtils.isEmpty(str)) {
            Log.e(TAG, "generate custom log failed ! e is null or type is empty .");
        } else {
            UMCrashThreadPoolExecutorFactory.execute(new Runnable() { // from class: com.umeng.umcrash.custom_exception.UAPMCustomException.2
                @Override // java.lang.Runnable
                public void run() {
                    CustomLogInfo build;
                    try {
                        UMCustomLogInfoBuilder addLogCat = new UMCustomLogInfoBuilder(str).stack(th, str2).addLogCat(z4);
                        if (z5) {
                            StringBuilder sb = new StringBuilder("AllThreadsTraces: \n");
                            for (Map.Entry<String, String> entry : UMCrashUtils.getAllThreadTraces().entrySet()) {
                                sb.append(entry.getKey()).append("\n").append(entry.getValue()).append("\n");
                            }
                            build = addLogCat.addSection(sb.toString()).build();
                        } else {
                            build = addLogCat.build();
                        }
                        if (z) {
                            UCrash.generateCustomLog(build.mData.toString(), z4);
                        }
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }
}
