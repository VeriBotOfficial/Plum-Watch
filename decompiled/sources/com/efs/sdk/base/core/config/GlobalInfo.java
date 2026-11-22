package com.efs.sdk.base.core.config;

import android.content.Context;
import android.text.TextUtils;
import com.anythink.basead.c.b;
import com.anythink.basead.webtemplet.a.b;
import com.anythink.core.common.m.e;
import com.efs.sdk.base.core.a.a;
import com.efs.sdk.base.core.util.c;
import com.efs.sdk.base.protocol.file.section.AbsSection;
import com.efs.sdk.base.protocol.file.section.KVSection;
import com.umeng.umcrash.UMCrash;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes14.dex */
public class GlobalInfo {

    /* renamed from: a, reason: collision with root package name */
    private Map<String, Object> f9617a = new ConcurrentHashMap();

    final void a(String str, Object obj) {
        if (obj != null) {
            this.f9617a.put(str, obj);
        }
    }

    final Object b(String str, Object obj) {
        Object obj2 = this.f9617a.get(str);
        return (obj2 != null || this.f9617a.containsKey(str)) ? obj2 : obj;
    }

    public Map<String, Object> getGlobalInfoMap() {
        HashMap hashMap = new HashMap(this.f9617a);
        a.a();
        hashMap.put("ctime", Long.valueOf(a.b() / 1000));
        a.a();
        hashMap.put("w_tm", Long.valueOf(a.b() / 1000));
        return hashMap;
    }

    public List<AbsSection> getGlobalSectionList(String str) {
        ArrayList arrayList = new ArrayList();
        KVSection kVSection = new KVSection("global_head");
        KVSection put = kVSection.put("type", str).put("appid", this.f9617a.get("appid")).put("wid", this.f9617a.get("wid")).put("pid", this.f9617a.get("pid")).put(b.a.A, this.f9617a.get(b.a.A)).put("ver", this.f9617a.get("ver")).put("vcode", this.f9617a.get("vcode")).put(e.bc, this.f9617a.get(e.bc)).put("stime", this.f9617a.get("stime"));
        a.a();
        KVSection put2 = put.put("ctime", Long.valueOf(a.b() / 1000));
        a.a();
        put2.put("w_tm", Long.valueOf(a.b() / 1000)).put("sdk_ver", this.f9617a.get("sdk_ver"));
        String valueOf = String.valueOf(b("uid", ""));
        if (!TextUtils.isEmpty(valueOf)) {
            kVSection.put("uid", valueOf);
        }
        arrayList.add(kVSection);
        KVSection kVSection2 = new KVSection(b.c.d);
        kVSection2.put(b.c.j, this.f9617a.get(b.c.j)).put("brand", this.f9617a.get("brand")).put("model", this.f9617a.get("model")).put("build_model", this.f9617a.get("build_model")).put("rom", this.f9617a.get("rom")).put("sdk", this.f9617a.get("sdk")).put("dsp_h", this.f9617a.get("dsp_h")).put("dsp_w", this.f9617a.get("dsp_w")).put("tzone", this.f9617a.get("tzone")).put("net", this.f9617a.get("net")).put("fr", this.f9617a.get("fr"));
        try {
            if (this.f9617a.containsKey(UMCrash.KEY_HEADER_ACCESS)) {
                kVSection2.put(UMCrash.KEY_HEADER_ACCESS, this.f9617a.get(UMCrash.KEY_HEADER_ACCESS));
            }
            if (this.f9617a.containsKey(UMCrash.KEY_HEADER_ACCESS_SUBTYPE)) {
                kVSection2.put(UMCrash.KEY_HEADER_ACCESS_SUBTYPE, this.f9617a.get(UMCrash.KEY_HEADER_ACCESS_SUBTYPE));
            }
            if (this.f9617a.containsKey(UMCrash.KEY_HEADER_NETWORK_TYPE)) {
                kVSection2.put(UMCrash.KEY_HEADER_NETWORK_TYPE, this.f9617a.get(UMCrash.KEY_HEADER_NETWORK_TYPE));
            }
        } catch (Throwable th) {
            th.printStackTrace();
        }
        arrayList.add(kVSection2);
        return arrayList;
    }

    public String getUUID(Context context) {
        String valueOf = String.valueOf(b("wid", ""));
        if (!TextUtils.isEmpty(valueOf)) {
            return valueOf;
        }
        String a2 = c.a(context);
        a("wid", a2);
        return a2;
    }
}
