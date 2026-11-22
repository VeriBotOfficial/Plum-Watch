package com.baidu.lbsapi.auth;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes13.dex */
class g {

    /* renamed from: a, reason: collision with root package name */
    private Context f7492a;
    private List b = null;
    private a c = null;

    interface a {
        void a(Object obj);
    }

    protected g(Context context) {
        this.f7492a = context;
    }

    private List a(HashMap hashMap, String[] strArr) {
        ArrayList arrayList = new ArrayList();
        if (strArr == null || strArr.length <= 0) {
            HashMap hashMap2 = new HashMap();
            Iterator it = hashMap.keySet().iterator();
            while (it.hasNext()) {
                String str = ((String) it.next()).toString();
                hashMap2.put(str, hashMap.get(str));
            }
            arrayList.add(hashMap2);
            return arrayList;
        }
        for (String str2 : strArr) {
            HashMap hashMap3 = new HashMap();
            Iterator it2 = hashMap.keySet().iterator();
            while (it2.hasNext()) {
                String str3 = ((String) it2.next()).toString();
                hashMap3.put(str3, hashMap.get(str3));
            }
            hashMap3.put("mcode", str2);
            arrayList.add(hashMap3);
        }
        return arrayList;
    }

    private void a(String str) {
        JSONObject jSONObject;
        if (str == null) {
            str = "";
        }
        try {
            jSONObject = new JSONObject(str);
            if (!jSONObject.has("status")) {
                jSONObject.put("status", -1);
            }
        } catch (JSONException unused) {
            jSONObject = new JSONObject();
            try {
                jSONObject.put("status", -1);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        a aVar = this.c;
        if (aVar != null) {
            aVar.a(jSONObject.toString());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(List list, String str, int i, String str2, String str3) {
        int i2;
        b.a("syncConnect start Thread id = " + String.valueOf(Thread.currentThread().getId()));
        if (list == null || list.size() == 0) {
            b.c("syncConnect failed,params list is null or size is 0");
            return;
        }
        ArrayList arrayList = new ArrayList();
        int i3 = 0;
        while (i3 < list.size()) {
            b.a("syncConnect resuest " + i3 + "  start!!!");
            HashMap hashMap = (HashMap) list.get(i3);
            i iVar = new i(this.f7492a);
            if (iVar.a()) {
                String a2 = iVar.a(hashMap, str, i, str2, str3);
                if (a2 == null) {
                    a2 = "";
                }
                b.a("syncConnect resuest " + i3 + "  result:" + a2);
                arrayList.add(a2);
                try {
                    JSONObject jSONObject = new JSONObject(a2);
                    if (jSONObject.has("status") && jSONObject.getInt("status") == 0) {
                        b.a("auth end and break");
                        a(a2);
                        return;
                    }
                } catch (JSONException unused) {
                    b.a("continue-------------------------------");
                }
            } else {
                b.a("Current network is not available.");
                arrayList.add(ErrorMessage.a("Current network is not available."));
            }
            b.a("syncConnect end");
            i3++;
        }
        b.a("--iiiiii:" + i3 + "<><>paramList.size():" + list.size() + "<><>authResults.size():" + arrayList.size());
        if (list.size() <= 0 || i3 != list.size() || arrayList.size() <= 0 || i3 != arrayList.size() || i3 - 1 <= 0) {
            return;
        }
        try {
            JSONObject jSONObject2 = new JSONObject((String) arrayList.get(i2));
            if (!jSONObject2.has("status") || jSONObject2.getInt("status") == 0) {
                return;
            }
            b.a("i-1 result is not 0,return first result");
            a((String) arrayList.get(0));
        } catch (JSONException e) {
            a(ErrorMessage.a("JSONException:" + e.getMessage()));
        }
    }

    protected void a(HashMap hashMap, String[] strArr, String str, int i, String str2, String str3, a aVar) {
        this.b = a(hashMap, strArr);
        this.c = aVar;
        new Thread(new h(this, str, i, str2, str3)).start();
    }
}
