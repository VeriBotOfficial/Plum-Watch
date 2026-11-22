package com.bytedance.sdk.openadsdk.utils;

import android.content.Context;
import android.os.Build;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes14.dex */
public class je {
    public static void fxn() {
        Context fxn = com.bytedance.sdk.openadsdk.core.rmu.fxn();
        if (fxn != null && com.bytedance.sdk.component.utils.ckl.hm()) {
            String packageName = fxn.getPackageName();
            int i = fxn.getApplicationInfo().targetSdkVersion;
            try {
                String[] strArr = fxn.getPackageManager().getPackageInfo(packageName, 4096).requestedPermissions;
                if (strArr != null && strArr.length > 0) {
                    List<String> kg = kg();
                    for (String str : strArr) {
                        if (str != null) {
                            kg.remove(str);
                        }
                    }
                    if (!kg.isEmpty()) {
                        Iterator<String> it = kg.iterator();
                        while (it.hasNext()) {
                            new StringBuilder("    May be missing permissions：").append(it.next());
                        }
                    }
                }
            } catch (Throwable unused) {
            }
            if (i < 23) {
                try {
                    new StringBuilder("No adaptation required for dynamic permissions：target=").append(i).append("&phone=").append(Build.VERSION.SDK_INT);
                } catch (Throwable unused2) {
                }
            }
        }
    }

    private static List<String> kg() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.permission.INTERNET");
        arrayList.add("android.permission.ACCESS_NETWORK_STATE");
        arrayList.add("android.permission.WAKE_LOCK");
        return arrayList;
    }
}
