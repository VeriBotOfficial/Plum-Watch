package com.qumeng.overseas.advlib.__remote__.utils;

import android.util.Pair;
import com.qumeng.overseas.advlib.trdparty.unionset.network.TwistEntity;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes17.dex */
public class c {
    private static final String d = "AutoClickUvManager";
    private static final String e = "enable_feature";
    private static final String f = "twist_no_group_count";
    private Map<String, TwistEntity.SlotIdSaveConfig> b;

    /* renamed from: a, reason: collision with root package name */
    private ConcurrentHashMap<String, Integer> f13228a = new ConcurrentHashMap<>();
    private final int c = 1;

    private static class a {

        /* renamed from: a, reason: collision with root package name */
        static final c f13229a = new c();

        private a() {
        }
    }

    private void c() {
        Map<String, TwistEntity.SlotIdSaveConfig> map;
        int b = oqme.a.b(oqme.a.A);
        this.f13228a.put(f, Integer.valueOf(b));
        n.a(d, "initData noGroupConfigCount =1,noGroupCount=" + b, new Object[0]);
        TwistEntity j = com.qumeng.overseas.advlib.trdparty.unionset.network.c.f().j();
        n.a(d, "initData twistEntity =" + j, new Object[0]);
        if (j != null && (map = j.freqGroup) != null) {
            this.b = map;
            for (String str : map.keySet()) {
                this.f13228a.put(str, Integer.valueOf(oqme.a.b(oqme.a.M + str)));
            }
        }
        if (com.qumeng.overseas.advlib.__remote__.core.proto.utils.f.a(e)) {
            this.f13228a.clear();
        }
        n.a(d, "initData groupMap =" + this.f13228a, new Object[0]);
    }

    public List<String> a(int i, String str) {
        if (i != 6 && i != 2) {
            return new ArrayList();
        }
        ArrayList arrayList = new ArrayList();
        if (!a(str)) {
            arrayList.add(com.qumeng.overseas.advlib.__remote__.ui.elements.j.H);
            arrayList.add(com.qumeng.overseas.advlib.__remote__.ui.elements.j.I);
        }
        return arrayList;
    }

    public void b() {
        c();
    }

    public void a(String str, int i) {
        n.a(d, "updateTwistCount adslotId =" + str + ",count=" + i, new Object[0]);
        Pair<String, Integer> twistConfigBySlotId = TwistEntity.getTwistConfigBySlotId(this.b, str);
        n.a(d, "updateTwistCount twistConfigBySlotId =" + twistConfigBySlotId, new Object[0]);
        if (twistConfigBySlotId == null) {
            this.f13228a.put(f, Integer.valueOf(i));
            n.a(d, "updateTwistCount groupMap =" + this.f13228a, new Object[0]);
        } else {
            this.f13228a.put((String) twistConfigBySlotId.first, Integer.valueOf(i));
            n.a(d, "updateTwistCount groupMap =" + this.f13228a, new Object[0]);
        }
    }

    private boolean a(String str) {
        Pair<String, Integer> twistConfigBySlotId = TwistEntity.getTwistConfigBySlotId(this.b, str);
        n.a(d, "isReachCount twistConfigBySlotId =" + twistConfigBySlotId, new Object[0]);
        if (twistConfigBySlotId == null) {
            Integer num = this.f13228a.get(f);
            n.a(d, "isReachCount twistNoGroupCount =" + num, new Object[0]);
            return num != null && num.intValue() >= 1;
        }
        Integer num2 = (Integer) twistConfigBySlotId.second;
        Integer num3 = this.f13228a.get(twistConfigBySlotId.first);
        n.a(d, "isReachCount groupConfigCount =" + num2 + ",currentGroupCount=" + num3, new Object[0]);
        return num2.intValue() > 0 && num3 != null && num3.intValue() >= num2.intValue();
    }

    public static c a() {
        return a.f13229a;
    }
}
