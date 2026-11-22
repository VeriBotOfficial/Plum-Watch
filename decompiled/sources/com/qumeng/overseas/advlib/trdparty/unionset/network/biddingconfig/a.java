package com.qumeng.overseas.advlib.trdparty.unionset.network.biddingconfig;

import android.text.TextUtils;
import com.qumeng.overseas.advlib.__remote__.utils.l;
import com.qumeng.overseas.advlib.trdparty.unionset.network.SlotIDConfigEntity;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes17.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    static Map<String, String> f13401a = new HashMap();

    public static SlotIDConfigEntity a(String str) {
        SlotIDConfigEntity a2 = b.a(str);
        if (a2 == null) {
            String str2 = f13401a.get(str);
            if (!TextUtils.isEmpty(str2) && (a2 = (SlotIDConfigEntity) l.a(str2, SlotIDConfigEntity.class)) != null) {
                b.a(str, a2);
            }
        }
        return a2;
    }
}
