package com.baidu.platform.util;

import com.baidu.mapsdkplatform.comjni.util.AppMD5;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: BaseParamBuilder.java */
/* loaded from: classes13.dex */
public class a implements ParamBuilder<a> {

    /* renamed from: a, reason: collision with root package name */
    protected Map<String, String> f9018a;

    public a a(String str, String str2) {
        if (this.f9018a == null) {
            this.f9018a = new LinkedHashMap();
        }
        this.f9018a.put(str, str2);
        return this;
    }

    public String a() {
        Map<String, String> map = this.f9018a;
        if (map == null || map.isEmpty()) {
            return null;
        }
        String str = new String();
        int i = 0;
        for (String str2 : this.f9018a.keySet()) {
            String encodeUrlParamsValue = AppMD5.encodeUrlParamsValue(this.f9018a.get(str2));
            if (i == 0) {
                str = str + str2 + "=" + encodeUrlParamsValue;
            } else {
                str = str + "&" + str2 + "=" + encodeUrlParamsValue;
            }
            i++;
        }
        return str;
    }
}
