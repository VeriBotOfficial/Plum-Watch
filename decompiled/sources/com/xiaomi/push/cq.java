package com.xiaomi.push;

import android.content.Context;
import com.autonavi.aps.amapapi.config.Const;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.HashMap;
import java.util.List;

/* loaded from: classes4.dex */
public class cq {

    /* renamed from: a, reason: collision with root package name */
    private final String f14496a = "disconnection_event";
    private final String b = Const.SP_KEY_CALL_LOC_COUNT;
    private final String c = "host";
    private final String d = "network_state";
    private final String e = "reason";
    private final String f = "ping_interval";
    private final String g = "network_type";
    private final String h = "wifi_digest";
    private final String i = "duration";
    private final String j = "disconnect_time";
    private final String k = "connect_time";
    private final String l = "xmsf_vc";
    private final String m = "android_vc";
    private final String n = CommonUrlParts.UUID;

    public void a(Context context, List<cp> list) {
        if (list == null || list.size() == 0) {
            return;
        }
        co.a("upload size = " + list.size());
        String m12476a = com.xiaomi.push.service.q.m12476a(context);
        for (cp cpVar : list) {
            HashMap hashMap = new HashMap();
            hashMap.put(Const.SP_KEY_CALL_LOC_COUNT, Integer.valueOf(cpVar.a()));
            hashMap.put("host", cpVar.m11977a());
            hashMap.put("network_state", Integer.valueOf(cpVar.b()));
            hashMap.put("reason", Integer.valueOf(cpVar.c()));
            hashMap.put("ping_interval", Long.valueOf(cpVar.m11976a()));
            hashMap.put("network_type", Integer.valueOf(cpVar.d()));
            hashMap.put("wifi_digest", cpVar.m11979b());
            hashMap.put("connected_network_type", Integer.valueOf(cpVar.e()));
            hashMap.put("duration", Long.valueOf(cpVar.m11978b()));
            hashMap.put("disconnect_time", Long.valueOf(cpVar.m11980c()));
            hashMap.put("connect_time", Long.valueOf(cpVar.m11981d()));
            hashMap.put("xmsf_vc", Integer.valueOf(cpVar.f()));
            hashMap.put("android_vc", Integer.valueOf(cpVar.g()));
            hashMap.put(CommonUrlParts.UUID, m12476a);
            ei.a().a("disconnection_event", hashMap);
        }
    }
}
