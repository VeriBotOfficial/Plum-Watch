package com.qumeng.overseas.advlib.trdparty.unionset.network.biddingconfig;

import com.qumeng.overseas.advlib.trdparty.unionset.network.BiddingConfigEntity;
import com.qumeng.overseas.advlib.trdparty.unionset.network.SlotIDConfigEntity;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes17.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    private static volatile BiddingConfigEntity f13402a;
    private static volatile Map<String, SlotIDConfigEntity> b = new ConcurrentHashMap();

    public static BiddingConfigEntity a() {
        return f13402a;
    }

    public static void a(BiddingConfigEntity biddingConfigEntity) {
        f13402a = biddingConfigEntity;
    }

    public static SlotIDConfigEntity a(String str) {
        if (b.containsKey(str)) {
            return b.get(str);
        }
        return null;
    }

    public static void a(String str, SlotIDConfigEntity slotIDConfigEntity) {
        b.put(str, slotIDConfigEntity);
    }
}
