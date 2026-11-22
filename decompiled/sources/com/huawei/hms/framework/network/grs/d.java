package com.huawei.hms.framework.network.grs;

import android.content.Context;
import com.huawei.hms.framework.common.Logger;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes14.dex */
public class d {

    /* renamed from: a, reason: collision with root package name */
    private static final Map<String, c> f10358a = new ConcurrentHashMap(16);
    private static final Object b = new Object();

    public static c a(GrsBaseInfo grsBaseInfo, Context context) {
        c cVar;
        synchronized (b) {
            int uniqueCode = grsBaseInfo.uniqueCode();
            Map<String, c> map = f10358a;
            cVar = map.get(context.getPackageName() + uniqueCode);
            if (cVar == null) {
                Logger.i("GrsClientManager", "grsClientImpl == null, and new GrsClientImpl");
                cVar = new c(context, grsBaseInfo);
                map.put(context.getPackageName() + uniqueCode, cVar);
            } else if (!cVar.a((Object) new c(grsBaseInfo))) {
                Logger.i("GrsClientManager", "The app_name, ser_country, reg_country and issue_country is equal, but other not.");
                cVar = new c(context, grsBaseInfo);
                map.put(context.getPackageName() + uniqueCode, cVar);
            }
        }
        return cVar;
    }
}
