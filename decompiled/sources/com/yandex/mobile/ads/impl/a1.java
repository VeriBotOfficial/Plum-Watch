package com.yandex.mobile.ads.impl;

import android.content.pm.ActivityInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import kotlin.TuplesKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a1 {

    /* renamed from: a, reason: collision with root package name */
    private static final String f14958a = "com.yandex.mobile.ads.common.AdActivity has missed configuration attribute %s.";
    private static final Map<Integer, String> b = MapsKt.mapOf(TuplesKt.to(16, "ActivityInfo.CONFIG_KEYBOARD"), TuplesKt.to(32, "ActivityInfo.CONFIG_KEYBOARD_HIDDEN"), TuplesKt.to(128, "ActivityInfo.CONFIG_ORIENTATION"), TuplesKt.to(256, "ActivityInfo.CONFIG_SCREEN_LAYOUT"), TuplesKt.to(512, "ActivityInfo.CONFIG_UI_MODE"), TuplesKt.to(1024, "ActivityInfo.CONFIG_SCREEN_SIZE"), TuplesKt.to(2048, "CONFIG_SMALLEST_SCREEN_SIZE"));

    /* JADX WARN: Multi-variable type inference failed */
    public static void a(ActivityInfo adActivity) {
        String str;
        Intrinsics.checkNotNullParameter(adActivity, "adActivity");
        Map<Integer, String> map = b;
        ArrayList arrayList = new ArrayList(map.size());
        Iterator<Map.Entry<Integer, String>> it = map.entrySet().iterator();
        while (true) {
            str = null;
            if (!it.hasNext()) {
                break;
            }
            Map.Entry<Integer, String> next = it.next();
            int intValue = next.getKey().intValue();
            String value = next.getValue();
            if ((intValue & adActivity.configChanges) == 0) {
                str = value;
            }
            arrayList.add(str);
        }
        Iterator it2 = arrayList.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            Object next2 = it2.next();
            if (((String) next2) != null) {
                str = next2;
                break;
            }
        }
        String str2 = str;
        if (str2 == null) {
            return;
        }
        String a2 = z0.a(new Object[]{str2}, 1, f14958a, "format(...)");
        throw new bp0(a2, a2);
    }
}
