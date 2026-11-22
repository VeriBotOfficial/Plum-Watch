package com.yandex.mobile.ads.impl;

import android.util.Log;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class rd {

    /* renamed from: a, reason: collision with root package name */
    private static final CopyOnWriteArraySet<Logger> f16755a = new CopyOnWriteArraySet<>();
    private static final Map<String, String> b;
    public static final /* synthetic */ int c = 0;

    static {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Package r1 = fe1.class.getPackage();
        String name = r1 != null ? r1.getName() : null;
        if (name != null) {
            linkedHashMap.put(name, "OkHttp");
        }
        String name2 = fe1.class.getName();
        Intrinsics.checkNotNullExpressionValue(name2, "getName(...)");
        linkedHashMap.put(name2, "okhttp.OkHttpClient");
        String name3 = gh0.class.getName();
        Intrinsics.checkNotNullExpressionValue(name3, "getName(...)");
        linkedHashMap.put(name3, "okhttp.Http2");
        String name4 = l42.class.getName();
        Intrinsics.checkNotNullExpressionValue(name4, "getName(...)");
        linkedHashMap.put(name4, "okhttp.TaskRunner");
        linkedHashMap.put("com.monetization.ads.embedded.okhttp.src.main.kotlin.okhttplib.mockwebserver.MockWebServer", "okhttp.MockWebServer");
        b = MapsKt.toMap(linkedHashMap);
    }

    public static void a(String loggerName, int i, String message, Throwable th) {
        int min;
        Intrinsics.checkNotNullParameter(loggerName, "loggerName");
        Intrinsics.checkNotNullParameter(message, "message");
        String str = b.get(loggerName);
        if (str == null) {
            str = StringsKt.take(loggerName, 23);
        }
        if (Log.isLoggable(str, i)) {
            if (th != null) {
                message = message + "\n" + Log.getStackTraceString(th);
            }
            String str2 = message;
            int length = str2.length();
            int i2 = 0;
            while (i2 < length) {
                int indexOf$default = StringsKt.indexOf$default((CharSequence) str2, '\n', i2, false, 4, (Object) null);
                if (indexOf$default == -1) {
                    indexOf$default = length;
                }
                while (true) {
                    min = Math.min(indexOf$default, i2 + 4000);
                    String substring = str2.substring(i2, min);
                    Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                    Log.println(i, str, substring);
                    if (min >= indexOf$default) {
                        break;
                    } else {
                        i2 = min;
                    }
                }
                i2 = min + 1;
            }
        }
    }

    public static void a() {
        Level level;
        for (Map.Entry<String, String> entry : b.entrySet()) {
            String key = entry.getKey();
            String value = entry.getValue();
            Logger logger = Logger.getLogger(key);
            if (f16755a.add(logger)) {
                logger.setUseParentHandlers(false);
                if (Log.isLoggable(value, 3)) {
                    level = Level.FINE;
                } else {
                    level = Log.isLoggable(value, 4) ? Level.INFO : Level.WARNING;
                }
                logger.setLevel(level);
                logger.addHandler(sd.f16852a);
            }
        }
    }
}
