package com.baidu.mshield.b.e;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* compiled from: PackageManagerUtil.java */
/* loaded from: classes13.dex */
public class c {
    public static PackageInfo a(Context context, String str, int i) {
        try {
            com.baidu.mshield.b.c.a.a("---privacy getPackageInfo---" + System.currentTimeMillis());
            return com.baidu.sec.privacy.e.c.a(context).a(str, i);
        } catch (PackageManager.NameNotFoundException e) {
            com.baidu.mshield.b.c.a.a(e);
            return null;
        }
    }
}
