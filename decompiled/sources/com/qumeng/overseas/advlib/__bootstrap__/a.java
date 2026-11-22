package com.qumeng.overseas.advlib.__bootstrap__;

import android.content.Context;
import com.qumeng.overseas.advlib.common.c;
import com.qumeng.overseas.advlib.core.IADBrowser;
import com.qumeng.overseas.advlib.core.IInciteAd;
import com.qumeng.overseas.advlib.core.IMultiAdObject;
import com.qumeng.overseas.advlib.core.IMultiAdRequest;
import com.qumeng.overseas.advlib.core.QMConfig;
import com.qumeng.overseas.advlib.core._factory;
import com.qumeng.overseas.advlib.core.l;
import com.qumeng.overseas.advlib.ui.banner.Banner;
import com.qumeng.overseas.update.b;
import com.qumeng.overseas.update.e;
import java.lang.reflect.Field;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes17.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public static final String f12775a = "10.444";
    public static final String b = "1.049";
    public static final String c = "qumeng";

    /* renamed from: com.qumeng.overseas.advlib.__bootstrap__.a$a, reason: collision with other inner class name */
    class C0777a implements b {
        C0777a() {
        }

        @Override // com.qumeng.overseas.update.b
        public Map<Class, String> getClassMapping() {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put(_factory.class, "com.qumeng.overseas.advlib.__remote__.core.ICliFactory");
            linkedHashMap.put(Banner.class, "com.qumeng.overseas.advlib.__remote__.ui.banner._imp_adbanner");
            linkedHashMap.put(IADBrowser.class, "com.qumeng.overseas.advlib.__remote__.ui.front._imp_adbrowser");
            linkedHashMap.put(IInciteAd.class, "com.qumeng.overseas.advlib.__remote__.ui.front._imp_inciteadactivity");
            linkedHashMap.put(IMultiAdRequest.class, "com.qumeng.overseas.advlib.__remote__.core.MultiAdRequest");
            linkedHashMap.put(IMultiAdObject.class, "com.qumeng.overseas.advlib.__remote__.core.MultiAdObject");
            linkedHashMap.put(l.class, "com.qumeng.overseas.advlib.__remote__.__bootstrap__.LibInit");
            return linkedHashMap;
        }

        @Override // com.qumeng.overseas.update.b
        public String getInnerSdkName() {
            return "qumeng";
        }

        @Override // com.qumeng.overseas.update.b
        public String getInnerSdkVersion() {
            return "1.049";
        }

        @Override // com.qumeng.overseas.update.b
        public String getShellVersion() {
            return a.f12775a;
        }

        @Override // com.qumeng.overseas.update.b
        public String getUsedSdkVersion() {
            return a.a();
        }
    }

    static {
        c.c = f12775a;
        c.d = "1.049";
    }

    public static boolean a(Context context) {
        return a(new QMConfig.Builder().build(context));
    }

    public static boolean a(QMConfig qMConfig) {
        return e.a(qMConfig, new C0777a());
    }

    public static String a() {
        try {
            Field declaredField = com.qumeng.overseas.advlib.common.a.c().b(l.class).getDeclaredField("aisdk_lib_version");
            declaredField.setAccessible(true);
            Object obj = declaredField.get(null);
            if (obj instanceof String) {
                return (String) obj;
            }
            return "";
        } catch (Throwable th) {
            th.printStackTrace();
            return "";
        }
    }
}
