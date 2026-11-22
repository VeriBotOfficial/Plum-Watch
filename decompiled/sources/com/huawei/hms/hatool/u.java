package com.huawei.hms.hatool;

import android.text.TextUtils;
import com.xiaomi.mipush.sdk.Constants;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/* loaded from: classes14.dex */
public class u {

    /* renamed from: a, reason: collision with root package name */
    private List<b1> f10433a;
    private String b;
    private String c;
    private String d;

    public u(List<b1> list, String str, String str2, String str3) {
        this.f10433a = list;
        this.b = str;
        this.c = str2;
        this.d = str3;
    }

    private void a(List<b1> list, String str, String str2) {
        String str3;
        String str4;
        if (list.isEmpty()) {
            return;
        }
        int size = (list.size() / 500) + 1;
        int i = 0;
        while (i < size) {
            int i2 = i * 500;
            List<b1> subList = list.subList(i2, Math.min(list.size(), i2 + 500));
            String replace = UUID.randomUUID().toString().replace(Constants.ACCEPT_TIME_SEPARATOR_SERVER, "");
            long currentTimeMillis = System.currentTimeMillis();
            long b = a1.b(str2, str) * 86400000;
            ArrayList arrayList = new ArrayList();
            for (b1 b1Var : subList) {
                if (!c0.a(b1Var.b(), currentTimeMillis, b)) {
                    arrayList.add(b1Var);
                }
            }
            if (arrayList.size() > 0) {
                str3 = str;
                str4 = str2;
                new l0(str4, str3, this.d, arrayList, replace).a();
            } else {
                str3 = str;
                str4 = str2;
                v.e("hmsSdk", "No data to report handler");
            }
            i++;
            str2 = str4;
            str = str3;
        }
    }

    public void a() {
        if (!"_default_config_tag".equals(this.c)) {
            a(this.f10433a, this.c, this.b);
            return;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        for (b1 b1Var : this.f10433a) {
            String c = b1Var.c();
            if (TextUtils.isEmpty(c) || "oper".equals(c)) {
                arrayList4.add(b1Var);
            } else if ("maint".equals(c)) {
                arrayList.add(b1Var);
            } else if ("preins".equals(c)) {
                arrayList2.add(b1Var);
            } else if ("diffprivacy".equals(c)) {
                arrayList3.add(b1Var);
            }
        }
        a(arrayList4, "oper", "_default_config_tag");
        a(arrayList, "maint", "_default_config_tag");
        a(arrayList2, "preins", "_default_config_tag");
        a(arrayList3, "diffprivacy", "_default_config_tag");
    }
}
