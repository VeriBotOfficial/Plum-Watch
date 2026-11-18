package com.anythink.core.common.h;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes16.dex */
public final class s {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private List<a> f3927a;

    private s() {
    }

    public static s a(JSONObject jSONObject) {
        a aVar;
        s sVar = new s();
        try {
            sVar.f3927a = new ArrayList();
            Iterator<String> itKeys = jSONObject.keys();
            while (itKeys.hasNext()) {
                JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject(itKeys.next());
                if (jSONObjectOptJSONObject != null) {
                    String strOptString = jSONObjectOptJSONObject.optString("name");
                    if (TextUtils.isEmpty(strOptString)) {
                        aVar = null;
                    } else {
                        aVar = new a();
                        aVar.f3928a = strOptString;
                    }
                    if (aVar != null) {
                        sVar.f3927a.add(aVar);
                    }
                }
            }
        } catch (Throwable unused) {
        }
        return sVar;
    }

    private static a b(JSONObject jSONObject) {
        String strOptString = jSONObject.optString("name");
        if (TextUtils.isEmpty(strOptString)) {
            return null;
        }
        a aVar = new a();
        aVar.f3928a = strOptString;
        return aVar;
    }

    public final List<a> a() {
        return this.f3927a;
    }

    public static class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private String f3928a;

        public final String a() {
            return this.f3928a;
        }

        private void a(String str) {
            this.f3928a = str;
        }
    }
}
