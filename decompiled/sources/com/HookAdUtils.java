package com;

import android.app.Activity;
import android.app.Instrumentation;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.IBinder;
import android.text.TextUtils;
import com.huawei.hms.support.api.entity.core.CommonCode;
import com.wakeup.common.log.LogUtils;
import java.lang.reflect.Field;
import java.net.URLDecoder;

/* loaded from: classes11.dex */
public class HookAdUtils {
    private static final String TAG = "HookAdUtils";

    public static void hookStartActivity() {
        try {
            Class<?> cls = Class.forName("android.app.ActivityThread");
            Field declaredField = cls.getDeclaredField("sCurrentActivityThread");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            Field declaredField2 = cls.getDeclaredField("mInstrumentation");
            declaredField2.setAccessible(true);
            declaredField2.set(obj, new InstrumentationProxy((Instrumentation) declaredField2.get(obj)));
        } catch (Exception e) {
            LogUtils.e(TAG, e);
        }
    }

    private static class InstrumentationProxy extends Instrumentation {
        private static final String TAG = "HookAdUtils";
        private final Instrumentation mInstrumentation;

        public InstrumentationProxy(Instrumentation instrumentation) {
            this.mInstrumentation = instrumentation;
        }

        @Override // android.app.Instrumentation
        public Activity newActivity(ClassLoader classLoader, String str, Intent intent) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
            return this.mInstrumentation.newActivity(classLoader, str, intent);
        }

        private static boolean containsQuickAppScheme(String str) {
            if (TextUtils.isEmpty(str)) {
                return false;
            }
            return str.contains("hap://") || str.contains("hnquickapp://") || str.contains("hwfastapp://");
        }

        public static boolean isQuickApp(Context context, Intent intent) {
            if (intent == null || intent.getData() == null) {
                return false;
            }
            String scheme = intent.getScheme();
            if (!TextUtils.isEmpty(scheme) && (scheme.startsWith("hap") || scheme.startsWith("hnquickapp") || scheme.startsWith("hwfastapp"))) {
                return true;
            }
            Uri data = intent.getData();
            if (data != null) {
                String host = data.getHost();
                if (!TextUtils.isEmpty(scheme) && ((scheme.startsWith("http") || scheme.startsWith(CommonCode.Resolution.HAS_RESOLUTION_FROM_APK)) && !TextUtils.isEmpty(host) && host.startsWith("hapjs.org"))) {
                    return true;
                }
                String query = data.getQuery();
                if (!TextUtils.isEmpty(scheme) && ((scheme.startsWith("hiapp") || scheme.startsWith("higame")) && !TextUtils.isEmpty(query) && query.contains("params="))) {
                    try {
                        if (containsQuickAppScheme(URLDecoder.decode(query, "UTF-8"))) {
                            return true;
                        }
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
            }
            return false;
        }

        public Instrumentation.ActivityResult execStartActivity(Context context, IBinder iBinder, IBinder iBinder2, Activity activity, Intent intent, int i, Bundle bundle) {
            try {
                ComponentName component = intent.getComponent();
                if (component != null) {
                    LogUtils.i(TAG, "execStartActivity() >>> componentName:" + component.getClassName() + " packageName:" + component.getPackageName());
                }
                LogUtils.i(TAG, "execStartActivity() >>> who:" + context + " scheme:" + intent.getScheme());
                if (!isQuickApp(context, intent)) {
                    return (Instrumentation.ActivityResult) Instrumentation.class.getDeclaredMethod("execStartActivity", Context.class, IBinder.class, IBinder.class, Activity.class, Intent.class, Integer.TYPE, Bundle.class).invoke(this.mInstrumentation, context, iBinder, iBinder2, activity, intent, Integer.valueOf(i), bundle);
                }
                LogUtils.i(TAG, "execStartActivity() >>> quick app");
                return null;
            } catch (Exception e) {
                LogUtils.e(TAG, e);
                return null;
            }
        }
    }
}
