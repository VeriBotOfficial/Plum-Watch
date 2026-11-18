package com.pgl.ssdk;

import android.accessibilityservice.AccessibilityServiceInfo;
import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import java.util.List;

/* JADX INFO: loaded from: classes2.dex */
public class u {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static AccessibilityManager f12764a;

    private static AccessibilityManager a(Context context) {
        if (f12764a == null) {
            f12764a = (AccessibilityManager) context.getSystemService("accessibility");
        }
        return f12764a;
    }

    public static String b(Context context) {
        AccessibilityManager accessibilityManagerA;
        List<AccessibilityServiceInfo> enabledAccessibilityServiceList;
        if (context == null || (accessibilityManagerA = a(context)) == null || (enabledAccessibilityServiceList = accessibilityManagerA.getEnabledAccessibilityServiceList(-1)) == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        for (int r1 = 0; r1 < enabledAccessibilityServiceList.size(); r1++) {
            AccessibilityServiceInfo accessibilityServiceInfo = enabledAccessibilityServiceList.get(r1);
            if (accessibilityServiceInfo != null) {
                sb.append(String.format("%s#%s", accessibilityServiceInfo.getResolveInfo().serviceInfo.packageName, accessibilityServiceInfo.getResolveInfo().serviceInfo.name));
                if (r1 != enabledAccessibilityServiceList.size() - 1) {
                    sb.append(",");
                }
            }
        }
        return sb.toString();
    }
}
