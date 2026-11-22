package com.qumeng.overseas.advlib.__remote__.ui.incite.feedexpree;

import android.os.Bundle;
import com.qumeng.overseas.advlib.__remote__.core.MultiAdObject;
import com.qumeng.overseas.advlib.__remote__.ui.elements.j;
import com.qumeng.overseas.advlib.core.AdRequestParam;
import com.qumeng.overseas.advlib.core.ICliBundle;
import java.util.HashMap;

/* loaded from: classes17.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final HashMap<String, MultiAdObject> f13155a = new HashMap<>();

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        private static final b f13156a = new b();

        private a() {
        }
    }

    public static b a() {
        return a.f13156a;
    }

    public MultiAdObject a(String str) {
        if (this.f13155a.containsKey(str)) {
            return this.f13155a.get(str);
        }
        return null;
    }

    public static boolean a(Bundle bundle) {
        if (bundle == null || !bundle.containsKey(com.qumeng.overseas.advlib.__remote__.core.coreutils.b.b)) {
            return false;
        }
        return bundle.getBoolean(com.qumeng.overseas.advlib.__remote__.core.coreutils.b.b);
    }

    public void a(MultiAdObject multiAdObject, AdRequestParam adRequestParam) {
        ICliBundle convert2ICliBundle;
        Bundle bundle;
        if (adRequestParam == null || adRequestParam.getAdType() != 4 || multiAdObject == null || (convert2ICliBundle = multiAdObject.convert2ICliBundle()) == null || (bundle = convert2ICliBundle.tbundle) == null || bundle.getBoolean("isDspAd")) {
            return;
        }
        int i = convert2ICliBundle.DataContent;
        if ((i == 12 || i == 4) && com.qumeng.overseas.advlib.__remote__.core.coreutils.b.a(adRequestParam, j.D)) {
            com.qumeng.overseas.advlib.__remote__.core.coreutils.b.b(adRequestParam, com.qumeng.overseas.advlib.__remote__.core.coreutils.b.b, Boolean.TRUE);
            this.f13155a.put(adRequestParam.getAdslotID(), multiAdObject);
        }
    }
}
