package com.baidu.bbalbscesium;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class d {
    private static final String c = "CuidBuddyInfoManager";
    private static final boolean d = false;
    private static final String e = "com.baidu.intent.action.GALAXY";
    private static final String f = "galaxy_data";
    private static final String g = "galaxy_sf";

    /* renamed from: a, reason: collision with root package name */
    private com.baidu.bbalbscesium.k.d.d f7378a;
    private List b;

    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(c cVar, c cVar2) {
            int i = cVar2.b - cVar.b;
            if (i == 0) {
                if (cVar.d && cVar2.d) {
                    return 0;
                }
                if (cVar.d) {
                    return -1;
                }
                if (cVar2.d) {
                    return 1;
                }
            }
            return i;
        }
    }

    public d() {
        a();
    }

    private static String a(byte[] bArr) {
        if (bArr == null) {
            throw new IllegalArgumentException("Argument b ( byte array ) is null! ");
        }
        String str = "";
        for (byte b : bArr) {
            String hexString = Integer.toHexString(b & 255);
            str = (hexString.length() == 1 ? new StringBuilder().append(str).append("0") : new StringBuilder().append(str)).append(hexString).toString();
        }
        return str.toLowerCase();
    }

    private void a() {
        this.f7378a = new com.baidu.bbalbscesium.k.d.e(e.a(), e.b());
    }

    private boolean a(String[] strArr, String[] strArr2) {
        if (strArr == null || strArr2 == null || strArr.length != strArr2.length) {
            return false;
        }
        HashSet hashSet = new HashSet();
        for (String str : strArr) {
            hashSet.add(str);
        }
        HashSet hashSet2 = new HashSet();
        for (String str2 : strArr2) {
            hashSet2.add(str2);
        }
        return hashSet.equals(hashSet2);
    }

    private static byte[] a(byte[] bArr, com.baidu.bbalbscesium.k.d.d dVar) throws Exception {
        com.baidu.bbalbscesium.k.d.a a2 = com.baidu.bbalbscesium.k.d.a.a();
        a2.a(2, dVar);
        return a2.a(bArr);
    }

    private String[] a(Signature[] signatureArr) {
        int length = signatureArr.length;
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = a(com.baidu.bbalbscesium.m.d.a(signatureArr[i].toByteArray()));
        }
        return strArr;
    }

    List a(Context context, Intent intent, boolean z) {
        ArrayList arrayList = new ArrayList();
        PackageManager packageManager = context.getPackageManager();
        List<ResolveInfo> queryBroadcastReceivers = packageManager.queryBroadcastReceivers(intent, 0);
        if (queryBroadcastReceivers != null) {
            for (ResolveInfo resolveInfo : queryBroadcastReceivers) {
                ActivityInfo activityInfo = resolveInfo.activityInfo;
                if (activityInfo != null && activityInfo.applicationInfo != null) {
                    try {
                        Bundle bundle = packageManager.getReceiverInfo(new ComponentName(resolveInfo.activityInfo.packageName, resolveInfo.activityInfo.name), 128).metaData;
                        if (bundle != null) {
                            String string = bundle.getString(f);
                            if (!TextUtils.isEmpty(string)) {
                                byte[] a2 = com.baidu.bbalbscesium.m.b.a(string.getBytes("utf-8"));
                                JSONObject jSONObject = new JSONObject(new String(a2));
                                c cVar = new c();
                                cVar.b = jSONObject.getInt("priority");
                                cVar.f7377a = resolveInfo.activityInfo.applicationInfo;
                                if (context.getPackageName().equals(resolveInfo.activityInfo.applicationInfo.packageName)) {
                                    cVar.d = true;
                                }
                                if (z) {
                                    String string2 = bundle.getString(g);
                                    if (!TextUtils.isEmpty(string2)) {
                                        PackageInfo packageInfo = packageManager.getPackageInfo(resolveInfo.activityInfo.applicationInfo.packageName, 64);
                                        JSONArray jSONArray = jSONObject.getJSONArray("sigs");
                                        int length = jSONArray.length();
                                        String[] strArr = new String[length];
                                        for (int i = 0; i < length; i++) {
                                            strArr[i] = jSONArray.getString(i);
                                        }
                                        if (a(strArr, a(packageInfo.signatures))) {
                                            byte[] a3 = a(com.baidu.bbalbscesium.m.b.a(string2.getBytes()), this.f7378a);
                                            byte[] a4 = com.baidu.bbalbscesium.m.d.a(a2);
                                            if (a3 != null && Arrays.equals(a3, a4)) {
                                                cVar.c = true;
                                            }
                                        }
                                    }
                                }
                                arrayList.add(cVar);
                            }
                        }
                    } catch (Exception unused) {
                    }
                }
            }
        }
        Collections.sort(arrayList, new a());
        return arrayList;
    }

    public boolean a(Context context) {
        List a2 = a(context, new Intent(e).setPackage(context.getPackageName()), true);
        if (a2 == null || a2.size() == 0) {
            for (int i = 0; i < 3; i++) {
                Log.w(c, "galaxy lib host missing meta-data,make sure you know the right way to integrate galaxy");
            }
            return false;
        }
        boolean z = ((c) a2.get(0)).c;
        if (!z) {
            for (int i2 = 0; i2 < 3; i2++) {
                Log.w(c, "galaxy config err, In the release version of the signature should be matched");
            }
        }
        return z;
    }

    List b(Context context) {
        List list = this.b;
        if (list != null) {
            return list;
        }
        a(context);
        List a2 = a(context, new Intent(e), true);
        this.b = a2;
        return a2;
    }
}
