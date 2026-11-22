package com.umeng.umcrash;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Resources;
import android.gov.nist.core.Separators;
import android.os.Looper;
import android.text.TextUtils;
import com.efs.sdk.base.core.util.concurrent.WorkThreadUtil;
import com.umeng.commonsdk.statistics.common.DeviceConfig;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;
import java.util.Random;

/* loaded from: classes2.dex */
public class UMCrashUtils {
    private static final int DEF_CLOSE_RATE = 0;
    private static final int MAX_THREAD_TRACE_LENGTH = 20480;
    private static final int MAX_TRACE_RATE = 100;
    public static final String UNKNOW = "";

    public static boolean random(int i) {
        if (i == 0) {
            return false;
        }
        return i == 100 || new Random().nextInt(100) <= i;
    }

    public static void saveInnerConfig(Context context, String str, Object obj) {
        SharedPreferences sharedPreferences;
        SharedPreferences.Editor edit;
        if (context != null) {
            try {
                if (TextUtils.isEmpty(str) || obj == null || (sharedPreferences = context.getSharedPreferences(UMCrashContent.KEY_SP_UMCRASH, 0)) == null || (edit = sharedPreferences.edit()) == null) {
                    return;
                }
                edit.putInt(str, Integer.parseInt(obj.toString()));
                edit.commit();
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
    }

    public static int getInnerConfig(Context context, String str, int i) {
        SharedPreferences sharedPreferences;
        if (context != null) {
            try {
                if (!TextUtils.isEmpty(str) && (sharedPreferences = context.getSharedPreferences(UMCrashContent.KEY_SP_UMCRASH, 0)) != null) {
                    return sharedPreferences.getInt(str, i);
                }
            } catch (Throwable th) {
                th.printStackTrace();
            }
        }
        return i;
    }

    public static void setCommonTag(String str, String str2) {
        Class<?> cls;
        try {
            Class<?> cls2 = Class.forName("com.umeng.commonsdk.UMConfigure");
            if (cls2 == null || (cls = Class.forName("com.umeng.commonsdk.UMConfigure$BS_TYPE")) == null) {
                return;
            }
            Method declaredMethod = cls2.getDeclaredMethod("setModuleTag", cls, String.class, String.class);
            if (declaredMethod != null) {
                declaredMethod.setAccessible(true);
                for (Enum r5 : (Enum[]) cls.getEnumConstants()) {
                    if (r5 != null && r5.name().equals("APM")) {
                        declaredMethod.invoke(cls2, r5, str, str2);
                    }
                }
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    public static boolean isHarmony(final Context context) {
        final SharedPreferences sharedPreferences;
        try {
            sharedPreferences = context.getSharedPreferences(UMCrashContent.KEY_SP_UMCRASH, 0);
        } catch (Throwable unused) {
        }
        if (sharedPreferences.contains("um_apm_harmony")) {
            return sharedPreferences.getBoolean("um_apm_harmony", false);
        }
        WorkThreadUtil.submit(new Runnable() { // from class: com.umeng.umcrash.UMCrashUtils.1
            @Override // java.lang.Runnable
            public void run() {
                try {
                    sharedPreferences.edit().putBoolean("um_apm_harmony", context.getString(Resources.getSystem().getIdentifier("config_os_brand", "string", "android")).equals("harmony")).apply();
                } catch (Throwable unused2) {
                }
            }
        });
        return false;
    }

    public static String[] getActiveUser(Context context) {
        Class<?> cls;
        Method method;
        if (context == null) {
            return null;
        }
        try {
            cls = Class.forName("com.umeng.commonsdk.utils.UMUtils");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        if (cls == null) {
            return null;
        }
        try {
            method = cls.getMethod("getActiveUser", Context.class);
        } catch (NoSuchMethodException unused2) {
            method = null;
        }
        if (method == null) {
            return null;
        }
        try {
            Object invoke = method.invoke(null, context);
            if (invoke != null) {
                return (String[]) invoke;
            }
            return null;
        } catch (IllegalAccessException | InvocationTargetException unused3) {
            return null;
        }
    }

    public static void setPuidAndProvider(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put(UMCrash.KEY_HEADER_PUID, str);
        hashMap.put(UMCrash.KEY_HEADER_PROVIDER, str2);
        if (UMCrash.getReporter() != null) {
            UMCrash.getReporter().addPublicParams(hashMap);
        }
    }

    public static void setIntegrationTesingParams(String str) {
        if (UMCrash.getReporter() != null) {
            HashMap hashMap = new HashMap();
            hashMap.put("um_dk", str);
            UMCrash.getReporter().addPublicParams(hashMap);
        }
    }

    public static String getNetworkOperatorName(Context context) {
        if (context == null) {
            return "";
        }
        try {
            return DeviceConfig.getNetworkOperatorName(context);
        } catch (Throwable unused) {
            return "";
        }
    }

    public static boolean checkPermission(Context context, String str) {
        if (context == null) {
            return false;
        }
        return ((Integer) Class.forName("android.content.Context").getMethod("checkSelfPermission", String.class).invoke(context, str)).intValue() == 0;
    }

    public static String splitByByte(String str, int i) {
        StringBuffer stringBuffer = new StringBuffer(i);
        try {
            int length = str.length();
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                String valueOf = String.valueOf(str.charAt(i3));
                i2 += valueOf.getBytes().length;
                if (i < i2) {
                    break;
                }
                stringBuffer.append(valueOf);
            }
        } catch (Throwable unused) {
        }
        return stringBuffer.toString();
    }

    public static synchronized String getUMID(Context context) {
        Class<?> cls;
        Method method;
        synchronized (UMCrashUtils.class) {
            String str = null;
            if (context == null) {
                return null;
            }
            try {
                cls = Class.forName("com.umeng.commonsdk.UMConfigure");
            } catch (ClassNotFoundException unused) {
                cls = null;
            }
            if (cls != null) {
                try {
                    method = cls.getMethod("getUMIDString", Context.class);
                } catch (NoSuchMethodException unused2) {
                    method = null;
                }
                if (method != null) {
                    try {
                        Object invoke = method.invoke(null, context);
                        if (invoke != null) {
                            str = invoke.toString();
                        }
                    } catch (IllegalAccessException | InvocationTargetException unused3) {
                    }
                }
            }
            return str;
        }
    }

    public static synchronized String getSessionId(Context context) {
        Class<?> cls;
        Method method;
        synchronized (UMCrashUtils.class) {
            String str = null;
            if (context == null) {
                return null;
            }
            try {
                cls = Class.forName("com.umeng.commonsdk.statistics.common.DeviceConfig");
            } catch (ClassNotFoundException unused) {
                cls = null;
            }
            if (cls != null) {
                try {
                    method = cls.getMethod("getSid", Context.class);
                } catch (NoSuchMethodException unused2) {
                    method = null;
                }
                if (method != null) {
                    try {
                        Object invoke = method.invoke(null, context);
                        if (invoke != null) {
                            str = invoke.toString();
                        }
                    } catch (IllegalAccessException | InvocationTargetException unused3) {
                    }
                }
            }
            return str;
        }
    }

    public static Map<String, String> getAllThreadTraces() {
        Map<Thread, StackTraceElement[]> allStackTraces;
        HashMap hashMap = new HashMap();
        try {
            allStackTraces = Thread.getAllStackTraces();
        } catch (Throwable th) {
            th.printStackTrace();
        }
        if (allStackTraces == null) {
            return null;
        }
        Thread thread = Looper.getMainLooper().getThread();
        if (!allStackTraces.containsKey(thread)) {
            allStackTraces.put(thread, thread.getStackTrace());
        }
        long id2 = Thread.currentThread().getId();
        StringBuilder sb = new StringBuilder();
        for (Map.Entry<Thread, StackTraceElement[]> entry : allStackTraces.entrySet()) {
            if (id2 != entry.getKey().getId()) {
                int i = 0;
                sb.setLength(0);
                if (entry.getValue() != null && entry.getValue().length != 0) {
                    StackTraceElement[] value = entry.getValue();
                    int length = value.length;
                    while (true) {
                        if (i >= length) {
                            break;
                        }
                        StackTraceElement stackTraceElement = value[i];
                        if (sb.length() >= 20480) {
                            sb.append("\n[Stack trace size must be less than :").append(20480).append("!]");
                            break;
                        }
                        sb.append("  at ").append(stackTraceElement.toString()).append("\n");
                        i++;
                    }
                    hashMap.put(entry.getKey().getName() + Separators.LPAREN + entry.getKey().getId() + Separators.RPAREN, sb.toString());
                }
            }
        }
        return hashMap;
    }
}
