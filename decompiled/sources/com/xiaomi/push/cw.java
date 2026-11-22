package com.xiaomi.push;

import android.content.Context;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.HashMap;

/* loaded from: classes4.dex */
public class cw {

    /* renamed from: a, reason: collision with root package name */
    private final String f14504a = "power_consumption_stats";
    private final String b = "off_up_ct";
    private final String c = "off_dn_ct";
    private final String d = "off_ping_ct";
    private final String e = "off_pong_ct";
    private final String f = "off_dur";
    private final String g = "on_up_ct";
    private final String h = "on_dn_ct";
    private final String i = "on_ping_ct";
    private final String j = "on_pong_ct";
    private final String k = "on_dur";
    private final String l = "start_time";
    private final String m = "end_time";
    private final String n = "xmsf_vc";
    private final String o = "android_vc";
    private final String p = CommonUrlParts.UUID;

    public void a(Context context, cv cvVar) {
        if (cvVar == null) {
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put("off_up_ct", Integer.valueOf(cvVar.a()));
        hashMap.put("off_dn_ct", Integer.valueOf(cvVar.b()));
        hashMap.put("off_ping_ct", Integer.valueOf(cvVar.c()));
        hashMap.put("off_pong_ct", Integer.valueOf(cvVar.d()));
        hashMap.put("off_dur", Long.valueOf(cvVar.m11987a()));
        hashMap.put("on_up_ct", Integer.valueOf(cvVar.e()));
        hashMap.put("on_dn_ct", Integer.valueOf(cvVar.f()));
        hashMap.put("on_ping_ct", Integer.valueOf(cvVar.g()));
        hashMap.put("on_pong_ct", Integer.valueOf(cvVar.h()));
        hashMap.put("on_dur", Long.valueOf(cvVar.m11988b()));
        hashMap.put("start_time", Long.valueOf(cvVar.m11989c()));
        hashMap.put("end_time", Long.valueOf(cvVar.m11990d()));
        hashMap.put("xmsf_vc", Integer.valueOf(cvVar.i()));
        hashMap.put("android_vc", Integer.valueOf(cvVar.j()));
        hashMap.put(CommonUrlParts.UUID, com.xiaomi.push.service.q.m12476a(context));
        ei.a().a("power_consumption_stats", hashMap);
    }
}
